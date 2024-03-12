package cli.compilers;

import cli.transformers.AbstractTransformer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public abstract class AbstractCompiler<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage, Input, Output> {
    private final AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer;

    public AbstractCompiler(AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer) {
        this.transformer = transformer;
    }

    public AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> getTransformer() {
        return transformer;
    }

    protected OutputModel transform(InputModel inputModel) throws Exception {
        return getTransformer().transform(inputModel);
    }

    public abstract Output compile(Input input) throws Exception;
}
