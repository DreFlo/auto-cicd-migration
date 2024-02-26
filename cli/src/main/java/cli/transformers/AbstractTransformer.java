package cli.transformers;

import cli.utils.EMFUtils;
import cli.utils.JavaUtils;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.core.*;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public abstract class AbstractTransformer<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage> {
    private final ResourceSet resourceSet;
    private final InputPackage inputPackage;
    private final OutputPackage outputPackage;
    private IModel inputModel;
    private IModel outputModel;
    private final String atlFilePath;
    private final String inputModelName;
    private final String outputModelName;

    protected AbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, OutputPackage outputPackage, String atlFilePath, String inputModelName, String outputModelName) {
        this.resourceSet = resourceSet;
        this.inputPackage = inputPackage;
        this.outputPackage = outputPackage;
        this.atlFilePath = atlFilePath;
        this.inputModelName = inputModelName;
        this.outputModelName = outputModelName;
        checkRegistry();
    }

    protected final void checkRegistry() {
        EMFUtils.registerPackages(getResourceSet(), getInputPackage(), getOutputPackage());
        EMFUtils.registerExtensionToFactoryMap(getResourceSet(), "ecore", new EcoreResourceFactoryImpl());
    }

    public OutputModel transform(InputModel inputModel) throws IOException {
        String inputModelFilePath = serializeModel(inputModel);
        String outputModelFilePath = inputModelFilePath + ".out";

        System.out.println("Transforming (" + getClass().getName() + ")...");
        runATLTransformation(inputModelFilePath, outputModelFilePath);

        OutputModel outputModel = deserializeModel(outputModelFilePath);

        // Delete model files
//        Files.delete(Path.of(inputModelFilePath));
//        Files.delete(Path.of(outputModelFilePath));

        return outputModel;
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

    private String serializeModel(InputModel model) throws IOException {
        String tempDir = "intermediate";
        String randomName = JavaUtils.getRandomName() + "_serialize.xmi";
        String filePath = Path.of(tempDir, randomName).toString();

        EMFUtils.serializeModel(model, filePath, getResourceSet());

        return filePath;
    }

    @SuppressWarnings("unchecked")
    private OutputModel deserializeModel(String filePath) throws IOException {
        return (OutputModel) EMFUtils.deserializeModel(filePath, getResourceSet());
    }

    private void loadModels(String inputModelFilePath) throws ATLCoreException {
        ModelFactory modelFactory = new EMFModelFactory();
        EMFInjector injector = new EMFInjector();

        IReferenceModel inputMetamodel = modelFactory.newReferenceModel();
        injector.inject(inputMetamodel, getInputPackage().eResource());

        IReferenceModel outputMetamodel = modelFactory.newReferenceModel();
        injector.inject(outputMetamodel, getOutputPackage().eResource());

        inputModel = modelFactory.newModel(inputMetamodel);
        injector.inject(inputModel, inputModelFilePath);

        outputModel = modelFactory.newModel(outputMetamodel);
    }

    protected void runATLTransformation(String inputModelFilePath, String outputModelFilePath) throws IOException {
        try {
            loadModels(inputModelFilePath);

            ILauncher launcher = new EMFVMLauncher();
            launcher.initialize(new HashMap<>());
            launcher.addInModel(inputModel, "IN", getInModelName());
            launcher.addOutModel(outputModel, "OUT", getOutModelName());

            String atlFilePath = getATLFilePath();

            launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<>(), JavaUtils.getResourceAsStream(atlFilePath));

            IExtractor extractor = new EMFExtractor();
            extractor.extract(outputModel, outputModelFilePath);
        } catch (ATLCoreException e) {
            throw new IOException(e);
        }
    }

    protected String getATLFilePath() {
        return atlFilePath;
    }

    protected String getInModelName() {
        return inputModelName;
    }

    protected String getOutModelName() {
        return outputModelName;
    }
}
