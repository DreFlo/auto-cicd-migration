package cli.transformers.endogenous;

import cli.transformers.AbstractTransformer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class EndogenousAbstractTransformer<Model extends EObject, Package extends EPackage> extends AbstractTransformer<Model, Package, Model, Package> {
    protected EndogenousAbstractTransformer(ResourceSet resourceSet, Package aPackage, String atlFilePath, String modelName) {
        super(resourceSet, aPackage, aPackage, atlFilePath, modelName + "1", modelName + "2");
    }
}
