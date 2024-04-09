package cli.engineers;

import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import java.nio.file.Path;
import java.util.List;

public abstract class AbstractEngineer<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage, Input, Output> {
    private final AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer;

    public AbstractEngineer(AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer) {
        this.transformer = transformer;
    }

    public AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> getTransformer() {
        return transformer;
    }

    protected abstract List<EndogenousAbstractTransformer<InputModel, InputPackage>> getInputRefiners(List<String> inputRefinerPaths);

    protected abstract List<EndogenousAbstractTransformer<OutputModel, OutputPackage>> getOutputRefiners(List<String> outputRefinerPaths);

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
