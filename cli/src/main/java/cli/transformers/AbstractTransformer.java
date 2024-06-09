package cli.transformers;

import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import cli.utils.LoggerUtils;
import cli.validators.AbstractValidator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.core.*;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public abstract class AbstractTransformer<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage> {
    private final ResourceSet resourceSet;
    private final InputPackage inputPackage;
    private final OutputPackage outputPackage;
    private IModel inputModel;
    private IModel outputModel;
    private final String atlFilePath;
    private final InputStream atlFileStream;
    private final String inputModelName;
    private final String outputModelName;
    private boolean deleteIntermediateFiles = false;
    private AbstractValidator<InputModel, InputPackage> validator;

    protected AbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, OutputPackage outputPackage, InputStream atlFileStream, String inputModelName, String outputModelName, AbstractValidator<InputModel, InputPackage> validator) {
        this.resourceSet = resourceSet;
        this.inputPackage = inputPackage;
        this.outputPackage = outputPackage;
        this.atlFilePath = null;
        this.atlFileStream = atlFileStream;
        this.inputModelName = inputModelName;
        this.outputModelName = outputModelName;
        this.validator = validator;
        checkRegistry();
    }

    protected AbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, OutputPackage outputPackage, String atlFilePath, String inputModelName, String outputModelName, AbstractValidator<InputModel, InputPackage> validator) throws IOException {
        this.resourceSet = resourceSet;
        this.inputPackage = inputPackage;
        this.outputPackage = outputPackage;
        this.atlFilePath = atlFilePath;
        Path path = Path.of(atlFilePath);
        if (path.toFile().exists()) {
            this.atlFileStream = path.toUri().toURL().openStream();
        } else {
            this.atlFileStream = JavaUtils.getResourceAsStream(atlFilePath);
        }
        this.inputModelName = inputModelName;
        this.outputModelName = outputModelName;
        this.validator = validator;
        checkRegistry();
    }

    public void setValidator(AbstractValidator<InputModel, InputPackage> validator) {
        this.validator = validator;
    }

    protected final void checkRegistry() {
        EMFUtils.registerPackages(getResourceSet(), getInputPackage(), getOutputPackage());
        EMFUtils.registerExtensionToFactoryMap(getResourceSet(), "ecore", new EcoreResourceFactoryImpl());
    }

    public IModel getInputModel() {
        return inputModel;
    }

    public IModel getOutputModel() {
        return outputModel;
    }

    public OutputModel transform(InputModel inputModel) throws IOException {
        String inputModelFilePath = serializeModel(inputModel);
        if (validator != null) {
            validator.validate(inputModel);
        }
        String outputModelFilePath = inputModelFilePath + ".out.xmi";

        LoggerUtils.log(Level.INFO, "Transforming (" + getClass().getName() + ")...");
        runATLTransformation(inputModelFilePath, outputModelFilePath);

        OutputModel outputModel = deserializeModel(outputModelFilePath);

        // Delete model files
        if (deleteIntermediateFiles) {
            Files.delete(Path.of(inputModelFilePath));
            Files.delete(Path.of(outputModelFilePath));
        }

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
        String randomName = JavaUtils.getRandomName() + ".xmi";
        String filePath = Path.of(tempDir, randomName).toString();

        EMFUtils.serializeModel(model, filePath, getResourceSet());

        return filePath;
    }

    @SuppressWarnings("unchecked")
    private OutputModel deserializeModel(String filePath) throws IOException {
        return (OutputModel) EMFUtils.deserializeModel(filePath, getResourceSet());
    }

    protected void loadModels(String inputModelFilePath) throws ATLCoreException {
        ModelFactory modelFactory = new EMFModelFactory();
        EMFInjector injector = new EMFInjector();

        IReferenceModel inputMetamodel = modelFactory.newReferenceModel();
        injector.inject(inputMetamodel, getInputPackage().eResource());

        IReferenceModel outputMetamodel = modelFactory.newReferenceModel();
        injector.inject(outputMetamodel, getOutputPackage().eResource());

        inputModel = modelFactory.newModel(inputMetamodel);
        injector.inject(getInputModel(), inputModelFilePath);

        outputModel = modelFactory.newModel(outputMetamodel);
    }

    protected void runATLTransformation(String inputModelFilePath, String outputModelFilePath) throws IOException {
        try {
            loadModels(inputModelFilePath);

            ILauncher launcher = new EMFVMLauncher();
            launcher.initialize(new HashMap<>());
            launcher.addInModel(getInputModel(), "IN", getInModelName());
            launcher.addOutModel(getOutputModel(), "OUT", getOutModelName());

            Map<String, Object> options = new HashMap<>();

//            options.put("step", true);
//            options.put("printExecutionTime", true);

            launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), options, getATLFileStream());

            IExtractor extractor = new EMFExtractor();
            extractor.extract(getOutputModel(), outputModelFilePath);
        } catch (ATLCoreException e) {
            throw new IOException(e);
        }
    }

    protected InputStream getATLFileStream() {
        if (atlFilePath != null) {
            Path path = Path.of(atlFilePath);
            if (path.toFile().exists()) {
                try {
                    return path.toUri().toURL().openStream();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                return JavaUtils.getResourceAsStream(atlFilePath);
            }
        }
        return atlFileStream;
    }

    protected String getInModelName() {
        return inputModelName;
    }

    protected String getOutModelName() {
        return outputModelName;
    }

    @SuppressWarnings("unused")
    public void setDeleteIntermediateFiles(boolean deleteIntermediateFiles) {
        this.deleteIntermediateFiles = deleteIntermediateFiles;
    }
}
