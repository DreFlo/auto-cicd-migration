package cli.engineers.forwardEngineers;

import cli.engineers.AbstractEngineer;
import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CICD.CICDRefiner;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.utils.LoggerUtils;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public abstract class AbstractForwardEngineer<OutputModel extends EObject, OutputPackage extends EPackage, AcceleoGenerator extends AbstractAcceleoGenerator> extends AbstractEngineer<Pipeline, CICDPackage, OutputModel, OutputPackage, Pipeline, String> {
    private final AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> generator;

    private final String outputFileName;

    public AbstractForwardEngineer(AbstractTransformer<Pipeline, CICDPackage, OutputModel, OutputPackage> transformer, AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> generator, String outputFileName) {
        super(transformer);
        this.generator = generator;
        this.outputFileName = outputFileName;
    }

    public AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> getGenerator() {
        return generator;
    }

    protected void generate(OutputModel outputModel, String outputFolder) throws Exception {
        if (getGenerator() == null) {
            LoggerUtils.log(Level.SEVERE, "No generator found for the compiler.");
            return;
        }
        getGenerator().generate(outputModel, outputFolder);
    }

    protected String getOutputFileName() {
        return outputFileName;
    }

    @Override
    protected final List<EndogenousAbstractTransformer<Pipeline, CICDPackage>> getInputRefiners(List<String> inputRefinerPaths) {
        List<EndogenousAbstractTransformer<Pipeline, CICDPackage>> inputRefiners = new ArrayList<>();

        for (String inputRefinerPath : inputRefinerPaths) {
            try {
                inputRefiners.add(new CICDRefiner(getTransformer().getResourceSet(), inputRefinerPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return inputRefiners;
    }

    @Override
    public String transform(Pipeline pipeline, List<String> inputRefinerPaths, List<String> outputRefinerPaths) throws Exception {
        OutputModel outputModel = this.callTransformer(pipeline, inputRefinerPaths, outputRefinerPaths);
        LoggerUtils.log(Level.INFO, "Generating (" + getGenerator().getClass().getName() + ")...");
        generate(outputModel, "./output/");
        String outputFile = Files.readString(Path.of("./output", getOutputFileName()));
        Files.delete(Path.of("./output", getOutputFileName()));
        return outputFile;
    }
}
