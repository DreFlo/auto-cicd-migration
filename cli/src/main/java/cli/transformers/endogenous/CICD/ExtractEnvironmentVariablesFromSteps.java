package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

public class ExtractEnvironmentVariablesFromSteps extends EndogenousCICDAbstractTransformer {
    public ExtractEnvironmentVariablesFromSteps(ResourceSet resourceSet) {
        super(resourceSet, "transformations/refinements/cicd/extractEnvironmentVariablesFromSteps.asm", "CICD1", "CICD2", false);
    }
}
