package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class ContractMatrixInputs extends EndogenousCICDAbstractTransformer{
    public ContractMatrixInputs(ResourceSet resourceSet) throws IOException {
        super(resourceSet, "transformations/refinements/cicd/contractMatrixInputs.asm", "CICD", "CICD", true);
    }
}
