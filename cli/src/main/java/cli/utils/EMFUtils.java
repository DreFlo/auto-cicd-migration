package cli.utils;

import org.eclipse.emf.ecore.EObject;

public class EMFUtils {
    public static Object getFeature(EObject obj, int featureID) {
        return obj.eGet(obj.eClass().getEStructuralFeature(featureID));
    }
}
