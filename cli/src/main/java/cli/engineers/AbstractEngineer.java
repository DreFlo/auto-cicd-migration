package cli.engineers;

import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CICD.CICDRefiner;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractEngineer<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage, Input, Output> {
    private final AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer;

    public AbstractEngineer(AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer) {
        this.transformer = transformer;
    }

    public AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> getTransformer() {
        return transformer;
    }

    protected List<EndogenousAbstractTransformer<InputModel, InputPackage>> getInputRefiners(List<String> inputRefinerPaths) {
        List<EndogenousAbstractTransformer<InputModel, InputPackage>> inputRefiners = new ArrayList<>();

        for (String inputRefinerPath : inputRefinerPaths) {
            try {
                List<String> refinerOptions = getRefinerOptions(inputRefinerPath);
                inputRefiners.add(getInputRefiner(getTransformer().getResourceSet(), inputRefinerPath, refinerOptions.get(0), refinerOptions.get(1), Boolean.parseBoolean(refinerOptions.get(2))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return inputRefiners;
    };

    protected abstract EndogenousAbstractTransformer<InputModel, InputPackage> getInputRefiner(ResourceSet resourceSet, String inputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException;

    protected List<EndogenousAbstractTransformer<OutputModel, OutputPackage>> getOutputRefiners(List<String> outputRefinerPaths) {
        List<EndogenousAbstractTransformer<OutputModel, OutputPackage>> outputRefiners = new ArrayList<>();

        for (String outputRefinerPath : outputRefinerPaths) {
            try {
                List<String> refinerOptions = getRefinerOptions(outputRefinerPath);
                outputRefiners.add(getOutputRefiner(getTransformer().getResourceSet(), outputRefinerPath, refinerOptions.get(0), refinerOptions.get(1), Boolean.parseBoolean(refinerOptions.get(2))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return outputRefiners;
    }

    private List<String> getRefinerOptions(String refinerPath) throws IOException {
        Path path = Path.of(refinerPath.replaceFirst("\\.asm$", ".atl"));

        String atlString = Files.readString(path);

        String pattern = "create\\s+OUT\\s*:\\s*(\\w+)\\s+(refining|from)\\s+IN\\s*:\\s*(\\w+)\\s*;";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(atlString);

        if (!m.find()) {
            throw new RuntimeException("Invalid ATL file");
        } else {
            String inputModelName = m.group(3);
            String outputModelName = m.group(1);
            return List.of(inputModelName, outputModelName, String.valueOf(m.group(2).equals("refining")));
        }
    }

    protected abstract EndogenousAbstractTransformer<OutputModel, OutputPackage> getOutputRefiner(ResourceSet resourceSet, String outputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException;

    protected OutputModel callTransformer(InputModel inputModel, List<String> inputRefinerPaths, List<String> outputRefinerPaths) throws Exception {
        if (getTransformer() == null) {
            String tempDir = "intermediate";
            String randomName = JavaUtils.getRandomName() + ".xmi";
            String filePath = Path.of(tempDir, randomName).toString();

            EMFUtils.serializeModel(inputModel, filePath, new ResourceSetImpl());

            throw new Exception("Transformer not set");
        }

        for (EndogenousAbstractTransformer<InputModel, InputPackage> inputRefiner : getInputRefiners(inputRefinerPaths)) {
            inputModel = inputRefiner.transform(inputModel);
        }

        OutputModel outputModel = getTransformer().transform(inputModel);

        for (EndogenousAbstractTransformer<OutputModel, OutputPackage> outputRefiner : getOutputRefiners(outputRefinerPaths)) {
            outputModel = outputRefiner.transform(outputModel);
        }

        return outputModel;
    }

    public abstract Output transform(Input input, List<String> inputRefinerPath, List<String> outputRefinerPaths) throws Exception;
}
