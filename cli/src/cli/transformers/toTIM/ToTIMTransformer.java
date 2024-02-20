package cli.transformers.toTIM;

import cli.transformers.Transformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class ToTIMTransformer<InputModel extends EObject, InputPackage extends EPackage, ATLTransformer> extends
        Transformer<InputModel, InputPackage, Pipeline, CICDPackage, ATLTransformer> {
    protected ToTIMTransformer(ResourceSet resourceSet, InputPackage inputPackage) {
        super(resourceSet, inputPackage, CICDPackage.eINSTANCE);
    }
}
