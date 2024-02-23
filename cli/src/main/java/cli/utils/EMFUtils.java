package cli.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.nio.file.Path;

public class EMFUtils {
    public static Object getFeature(EObject obj, int featureID) {
        return obj.eGet(obj.eClass().getEStructuralFeature(featureID));
    }

    public static void registerPackages(ResourceSet resourceSet, EPackage ...ePackages) {
        for (EPackage ePackage : ePackages) {
            resourceSet.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
        }
    }

    public static void registerExtensionToFactoryMap(ResourceSet resourceSet, String extension, Object factory) {
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(extension, factory);
    }

    public static void serializeModel(EObject model, String filePath, ResourceSet resourceSet) throws IOException {
        // Write the parsed model to a file
        Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(filePath));
        resource.getContents().add(model);
        resource.save(null);
    }

    public static Object deserializeModel(String filePath, ResourceSet resourceSet) throws IOException {
        // Load the model from a file
        Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(filePath));
        resource.load(null);
        return resource.getContents().get(0);
    }
}
