package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class SimplifyConditionals extends EndogenousCICDAbstractTransformer {
    public SimplifyConditionals(ResourceSet resourceSet) {
        super(resourceSet, "transformations/refinements/cicd/simplifyConditionals.asm", "CICD1", "CICD2");
    }
}
