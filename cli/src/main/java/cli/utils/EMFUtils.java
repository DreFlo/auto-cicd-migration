package cli.utils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.io.IOException;
import java.util.*;

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
        Resource completeResource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(filePath));

        List<EObject> collection = new ArrayList<>();
        readReferences(model, new HashSet<>(), collection);

        completeResource.getContents().addAll(EcoreUtil.copyAll(collection));

        completeResource.save(null);
    }

    private static void readReferences(EObject eobject, HashSet<EObject> preventCycles, List<EObject> rootList) {
        if(preventCycles.contains(eobject)){ // been here get away
            return;
        }
        preventCycles.add(eobject);
        if(eobject.eContainer() != null){
            readReferences(eobject.eContainer(), preventCycles, rootList);
        }else{ // a root object
            rootList.add(eobject);
        }
        for(Object erefObj : eobject.eClass().getEAllReferences()){
            EReference eref = (EReference)erefObj;
            final Object value = eobject.eGet(eref);
            if (value == null) {
                continue;
            }
            if(value instanceof List){
                for(Object obj : (List<?>)value){
                    readReferences((EObject)obj, preventCycles, rootList);
                }
            }else{ // an eobject
                readReferences((EObject)value, preventCycles, rootList);
            }
        }
    }

    public static Object deserializeModel(String filePath, ResourceSet resourceSet) throws IOException {
        // Load the model from a file
        Resource resource = resourceSet.createResource(org.eclipse.emf.common.util.URI.createURI(filePath));
        resource.load(null);

        EcoreUtil.resolveAll(resource);

        return resource.getContents().get(0);
    }
}
