package cli.transformers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Random;

public abstract class Transformer<
        InputModel extends EObject,
        InputPackage extends EPackage,
        OutputModel extends EObject,
        OutputPackage extends EPackage,
        ATLTransformer
> {
    private final ResourceSet resourceSet;
    private final InputPackage inputPackage;
    private final OutputPackage outputPackage;

    protected Transformer(ResourceSet resourceSet, InputPackage inputPackage, OutputPackage outputPackage) {
        this.resourceSet = resourceSet;
        this.inputPackage = inputPackage;
        this.outputPackage = outputPackage;
        checkPackagesRegistered();
    }

    protected final void checkPackagesRegistered() {
        getResourceSet().getPackageRegistry().putIfAbsent(getInputPackage().getNsURI(), getInputPackage());
        getResourceSet().getPackageRegistry().putIfAbsent(getOutputPackage().getNsURI(), getOutputPackage());
    }

    public final OutputModel transform(InputModel inputModel) throws IOException {
        String inputModelFilePath = serializeModel(inputModel);
        String outputModelFilePath = inputModelFilePath + ".out";

        runATLTransformation(inputModelFilePath, outputModelFilePath);

        return deserializeModel(outputModelFilePath);
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    public InputPackage getInputPackage() {
        return inputPackage;
    }

    public OutputPackage getOutputPackage() {
        return outputPackage;
    }

    private String getRandomName() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private String serializeModel(InputModel model) throws IOException {
        String tempDir = ".";
        String randomName = getRandomName() + ".xmi";
        String filePath = Path.of(tempDir, randomName).toString();

        System.out.println("Serializing model to " + filePath);

        // Write the parsed model to a file
        Resource resource = getResourceSet().createResource(org.eclipse.emf.common.util.URI.createURI(filePath));
        resource.getContents().add(model);
        resource.save(null);

        return filePath;
    }

    private OutputModel deserializeModel(String filePath) throws IOException {
        Resource resource = getResourceSet().createResource(org.eclipse.emf.common.util.URI.createURI(filePath));
        resource.load(null);
        return (OutputModel) resource.getContents().get(0);
    }

    protected abstract void runATLTransformation(String inputModelFilePath, String outputModelFilePath) throws IOException;
}
