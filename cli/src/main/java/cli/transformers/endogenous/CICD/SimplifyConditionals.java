package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class SimplifyConditionals extends EndogenousCICDAbstractTransformer {
    public SimplifyConditionals(ResourceSet resourceSet) throws IOException {
        super(resourceSet, "transformations/refinements/cicd/simplifyConditionals.asm", "CICD1", "CICD2", false);
    }
}
