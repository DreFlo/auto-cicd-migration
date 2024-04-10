package cli.transformers.endogenous;

import cli.transformers.AbstractTransformer;
import cli.utils.JavaUtils;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.m2m.atl.common.ATLResourceProvider;
import org.eclipse.m2m.atl.core.*;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class EndogenousAbstractTransformer<Model extends EObject, Package extends EPackage> extends AbstractTransformer<Model, Package, Model, Package> {
    private final Boolean refiner;

    protected EndogenousAbstractTransformer(ResourceSet resourceSet, Package aPackage, String atlFilePath, String inputModelName, String outputModelName, Boolean refiner) throws IOException {
        super(resourceSet, aPackage, aPackage, atlFilePath, inputModelName, outputModelName, null);
        this.refiner = refiner;
    }

    protected EndogenousAbstractTransformer(ResourceSet resourceSet, Package aPackage, InputStream atlFileStream, String inputModelName, String outputModelName, Boolean refiner) {
        super(resourceSet, aPackage, aPackage, atlFileStream, inputModelName, outputModelName, null);
        this.refiner = refiner;
    }

    @Override
    protected void runATLTransformation(String inputModelFilePath, String outputModelFilePath) throws IOException {
        try {
            loadModels(inputModelFilePath);

            ILauncher launcher = new EMFVMLauncher();
            launcher.initialize(new HashMap<>());
            launcher.addInModel(getInputModel(), "IN", getInModelName());

            if (refiner) {
                ModelFactory factory = new EMFModelFactory();
                IReferenceModel refiningTraceMetamodel = factory.newReferenceModel();
                EMFInjector injector = new EMFInjector();
                injector.inject(refiningTraceMetamodel, ATLResourceProvider.class.getClassLoader().getResourceAsStream("model/RefiningTrace.ecore"), Collections.emptyMap());
                IModel refiningTraceModel = factory.newModel(refiningTraceMetamodel);
                launcher.addOutModel(refiningTraceModel, "refiningTrace", "RefiningTrace");
            } else {
                launcher.addOutModel(getInputModel(), "OUT", getOutModelName());
            }

            Map<String, Object> options = new HashMap<>();

//            options.put("showSummary", "true");

            launcher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), options, getATLFileStream());

            IExtractor extractor = new EMFExtractor();
            extractor.extract(refiner ? getInputModel() : getOutputModel(), outputModelFilePath);
        } catch (ATLCoreException e) {
            throw new IOException(e);
        }
    }
}
