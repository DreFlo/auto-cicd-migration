package cli.transformers.exogenous.toTIM;

import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class ToTIMAbstractTransformer<InputModel extends EObject, InputPackage extends EPackage> extends AbstractTransformer<InputModel, InputPackage, Pipeline, CICDPackage> {

    protected ToTIMAbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, String atlFilePath, String inputModelName) {
        super(resourceSet, inputPackage, CICDPackage.eINSTANCE, atlFilePath, inputModelName, "CICD");
    }
}
