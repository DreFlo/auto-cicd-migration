package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class ExtractMatrixInputs extends EndogenousCICDAbstractTransformer{
    public ExtractMatrixInputs(ResourceSet resourceSet) throws IOException {
        super(resourceSet, "transformations/refinements/cicd/extractMatrixInputs.asm", "CICD1", "CICD2", false);
    }
}
