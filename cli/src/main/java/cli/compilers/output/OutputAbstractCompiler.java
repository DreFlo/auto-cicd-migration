package cli.compilers.output;

import cli.compilers.AbstractCompiler;
import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import java.nio.file.Files;
import java.nio.file.Path;

public abstract class OutputAbstractCompiler<OutputModel extends EObject, OutputPackage extends EPackage, AcceleoGenerator extends AbstractAcceleoGenerator> extends AbstractCompiler<Pipeline, CICDPackage, OutputModel, OutputPackage, Pipeline, String> {
    private final AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> generator;

    private final String outputFileName;

    public OutputAbstractCompiler(AbstractTransformer<Pipeline, CICDPackage, OutputModel, OutputPackage> transformer, AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> generator, String outputFileName) {
        super(transformer);
        this.generator = generator;
        this.outputFileName = outputFileName;
    }

    public AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> getGenerator() {
        return generator;
    }

    protected void generate(OutputModel outputModel, String outputFolder) throws Exception {
        getGenerator().generate(outputModel, outputFolder);
    }

    protected String getOutputFileName() {
        return outputFileName;
    }

    @Override
    public String compile(Pipeline pipeline) throws Exception {
        OutputModel outputModel = transform(pipeline);
        System.out.println("Generating\t(" + getGenerator().getClass().getName() + ")...");
        generate(outputModel, "./output/");
        String outputFile = Files.readString(Path.of("./output", getOutputFileName()));
        Files.delete(Path.of("./output", getOutputFileName()));
        return outputFile;
    }
}
