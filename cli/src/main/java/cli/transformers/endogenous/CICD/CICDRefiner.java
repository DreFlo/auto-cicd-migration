package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class CICDRefiner extends EndogenousCICDAbstractTransformer{
    public CICDRefiner(ResourceSet resourceSet, String atlFilePath) {
        super(resourceSet, atlFilePath, "CICD", "CICD", true);
    }
}
