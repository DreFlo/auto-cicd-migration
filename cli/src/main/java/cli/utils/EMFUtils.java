package cli.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public static URI serializeModel(EObject model, String filePath, ResourceSet resourceSet) throws IOException {
        Resource completeResource = createResource(model, filePath, resourceSet);

        completeResource.save(null);

        return completeResource.getURI();
    }

    public static Resource createResource(EObject model, String filePath, ResourceSet resourceSet) {
        URI uri = URI.createURI(filePath);
        // Write the parsed model to a file
        Resource completeResource = resourceSet.createResource(uri);

        List<EObject> collection = new ArrayList<>();
        readReferences(model, new HashSet<>(), collection);

        completeResource.getContents().addAll(EcoreUtil.copyAll(collection));

//        System.out.println(completeResource.getContents());

        return completeResource;
    }

    private static void readReferences(EObject eobject, HashSet<EObject> preventCycles, List<EObject> rootList) {
        if (eobject == null) {
            return;
        }
        if(preventCycles.contains(eobject)){ // been here get away
            return;
        }
        preventCycles.add(eobject);
        if(eobject.eContainer() != null){
            readReferences(eobject.eContainer(), preventCycles, rootList);
        }else{ // a root object
            rootList.add(eobject);
        }
        for(EReference eRefObj : eobject.eClass().getEAllReferences()){
            final Object value = eobject.eGet(eRefObj);
            if (value == null) {
                continue;
            }
            if(value instanceof List){
                for(Object obj : (List<?>)value){
                    readReferences((EObject)obj, preventCycles, rootList);
                }
            }else{ // an EObject
                readReferences((EObject)value, preventCycles, rootList);
            }
        }
    }

    public static Object deserializeModel(String filePath, ResourceSet resourceSet) throws IOException {
        // Load the model from a file
        Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(filePath));


        // Add all referenced resources to the resource set
        resource.load(null);

        for (EObject obj : resource.getContents()) {
            EcoreUtil.resolveAll(obj);
        }

        return resource.getContents().get(0);
    }
}
