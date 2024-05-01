package cli.mergers;

import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.IEclModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eml.IEmlModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

import java.io.IOException;
import java.nio.file.Path;

public class AbstractMerger<Model extends EObject, Package extends EPackage> {
    private final ResourceSet resourceSet;
    private final Package ePackage;

    protected AbstractMerger(ResourceSet resourceSet, Package ePackage) {
        this.resourceSet = resourceSet;
        this.ePackage = ePackage;
        checkRegistry();
    }

    @SuppressWarnings("unchecked")
    public Model merge(Model model1, Model model2) {
        InMemoryEmfModel epsilonModel1 = createInMemoryEmfModel("Left", model1);
        InMemoryEmfModel epsilonModel2 = createInMemoryEmfModel("Right", model2);
        InMemoryEmfModel targetModel = createInMemoryEmfModel("Target", null);

        epsilonModel1.getAliases().add("Source");
        epsilonModel2.getAliases().add("Source");

        IEclModule eclModule = new EclModule();
        try {
            eclModule.parse(JavaUtils.getResourceAsString("mergers/cicd.ecl"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        eclModule.getContext().getModelRepository().addModels(epsilonModel1, epsilonModel2);
        try {
            eclModule.execute();
        } catch (EolRuntimeException e) {
            throw new RuntimeException(e);
        }

        IEmlModule emlModule = new EmlModule();
        try {
            emlModule.parse(JavaUtils.getResourceAsString("mergers/cicd.eml"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        emlModule.getContext().getModelRepository().addModels(epsilonModel1, epsilonModel2, targetModel);
        emlModule.getContext().setMatchTrace(eclModule.getContext().getMatchTrace().getReduced());
        try {
            emlModule.execute();
        } catch (EolRuntimeException e) {
            throw new RuntimeException(e);
        }

        return (Model) targetModel.getResource().getContents().stream().filter(model1.getClass()::isInstance).findFirst().orElseThrow();
    }

    private InMemoryEmfModel createInMemoryEmfModel(String name, Model model) {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        Resource resource = createResource(model, resourceSet);
        return new InMemoryEmfModel(name, resource, ePackage);
    }

    private Resource createResource(Model model, ResourceSet resourceSet) {
        String tempDir = "intermediate";
        String randomName = JavaUtils.getRandomName() + ".xmi";
        String filePath = Path.of(tempDir, randomName).toString();

        return EMFUtils.createResource(model, filePath, resourceSet);
    }

    protected final void checkRegistry() {
        EMFUtils.registerPackages(getResourceSet(), getPackage());
    }

    public Package getPackage() {
        return ePackage;
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }
}
