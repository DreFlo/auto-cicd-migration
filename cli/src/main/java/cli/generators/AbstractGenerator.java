package cli.generators;

import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static cli.utils.EMFUtils.serializeModel;

public abstract class AbstractGenerator<InputModel extends EObject, InputPackage extends EPackage, AcceleoGenerator extends AbstractAcceleoGenerator> {
    private final InputPackage inputPackage;
    private final ResourceSet resourceSet;

    public AbstractGenerator(ResourceSet resourceSet, InputPackage inputPackage) {
        this.resourceSet = resourceSet;
        this.inputPackage = inputPackage;
        registerPackages();
    }

    public void generate(InputModel inputModel, String outputFolder) throws IOException {
        String tempDir = "intermediate";
        String randomName = JavaUtils.getRandomName() + ".xmi";
        String filePath = Path.of(tempDir, randomName).toString();
        serializeModel(inputModel, filePath, getResourceSet());
        runGeneratorMain(List.of(filePath, outputFolder).toArray(String[]::new));
        Files.delete(Path.of(filePath));
    }

    protected abstract void runGeneratorMain(String[] args);

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    public InputPackage getInputPackage() {
        return inputPackage;
    }

    private void registerPackages() {
        EMFUtils.registerPackages(getResourceSet(), getInputPackage());
    }
}
