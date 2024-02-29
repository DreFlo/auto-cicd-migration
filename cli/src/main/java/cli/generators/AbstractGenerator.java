package cli.generators;

import cli.utils.EMFUtils;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.IOException;

public abstract class AbstractGenerator<InputModel extends EObject, InputPackage extends EPackage, AcceleoGenerator extends AbstractAcceleoGenerator> {
    private final InputPackage inputPackage;
    private final ResourceSet resourceSet;

    public AbstractGenerator(ResourceSet resourceSet, InputPackage inputPackage) {
        this.resourceSet = resourceSet;
        this.inputPackage = inputPackage;
        registerPackages();
    }

    public abstract void generate(InputModel inputModel, String outputFolder) throws IOException;

    protected abstract AcceleoGenerator createGenerator(InputModel inputModel, String outputFolder) throws IOException;

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    public InputPackage getInputPackage() {
        return inputPackage;
    }

    private void registerPackages() {
        EMFUtils.registerPackages(getResourceSet(), getInputPackage());
    }

    private void registerFactories() {
        EMFUtils.registerExtensionToFactoryMap(getResourceSet(), "xmi", new XMIResourceFactoryImpl());
        EMFUtils.registerExtensionToFactoryMap(getResourceSet(), "out", new XMIResourceFactoryImpl());
        EMFUtils.registerExtensionToFactoryMap(getResourceSet(), "emtl", new XMIResourceFactoryImpl());
    }
}
