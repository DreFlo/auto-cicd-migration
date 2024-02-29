package cli.compilers.output;

import cli.compilers.AbstractCompiler;
import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public abstract class OutputAbstractCompiler<OutputModel extends EObject, OutputPackage extends EPackage, AcceleoGenerator extends AbstractAcceleoGenerator> extends AbstractCompiler<Pipeline, CICDPackage, OutputModel, OutputPackage, Pipeline, Void> {
    private final AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> generator;

    public OutputAbstractCompiler(AbstractTransformer<Pipeline, CICDPackage, OutputModel, OutputPackage> transformer, AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> generator) {
        super(transformer);
        this.generator = generator;
    }

    public AbstractGenerator<OutputModel, OutputPackage, AcceleoGenerator> getGenerator() {
        return generator;
    }

    protected Void generate(OutputModel outputModel, String outputFolder) throws Exception {
        generator.generate(outputModel, outputFolder);
        return null;
    }

    @Override
    public Void compile(Pipeline pipeline) throws Exception {
        OutputModel outputModel = transform(pipeline);
        generate(outputModel, "./output/");
        return null;
    }
}
