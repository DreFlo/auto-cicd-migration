package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class ExtractJobInputs extends EndogenousCICDAbstractTransformer {
    public ExtractJobInputs(ResourceSet resourceSet) throws IOException {
        super(resourceSet, "transformations/refinements/cicd/extractJobInputs.asm", "CICD", "CICD", true);
    }
}
