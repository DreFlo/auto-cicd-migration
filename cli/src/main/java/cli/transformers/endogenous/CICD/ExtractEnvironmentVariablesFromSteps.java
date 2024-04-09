package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class ExtractEnvironmentVariablesFromSteps extends EndogenousCICDAbstractTransformer {
    public ExtractEnvironmentVariablesFromSteps(ResourceSet resourceSet) throws IOException {
        super(resourceSet, "transformations/refinements/cicd/extractEnvironmentVariablesFromSteps.asm", "CICD1", "CICD2", false);
    }
}
