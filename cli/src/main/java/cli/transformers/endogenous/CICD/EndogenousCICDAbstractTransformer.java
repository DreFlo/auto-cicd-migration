package cli.transformers.endogenous.CICD;

import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class EndogenousCICDAbstractTransformer extends EndogenousAbstractTransformer<Pipeline, CICDPackage> {
    protected EndogenousCICDAbstractTransformer(ResourceSet resourceSet, String atlFilePath, String inputModelName, String outputModelName) {
        super(resourceSet, CICDPackage.eINSTANCE, atlFilePath, inputModelName, outputModelName);
    }
}
