package cli.engineers;

import cli.transformers.AbstractTransformer;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import java.nio.file.Path;

public abstract class AbstractEngineer<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage, Input, Output> {
    private final AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer;

    public AbstractEngineer(AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> transformer) {
        this.transformer = transformer;
    }

    public AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> getTransformer() {
        return transformer;
    }

    protected OutputModel transform(InputModel inputModel) throws Exception {
        if (getTransformer() == null) {
            String tempDir = "intermediate";
            String randomName = JavaUtils.getRandomName() + ".xmi";
            String filePath = Path.of(tempDir, randomName).toString();

            EMFUtils.serializeModel(inputModel, filePath, new ResourceSetImpl());

            throw new Exception("Transformer not set");
        }
        return getTransformer().transform(inputModel);
    }

    public abstract Output compile(Input input) throws Exception;
}
