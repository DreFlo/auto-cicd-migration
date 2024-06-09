package cli.validators;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class GHA2CircleCIValidator extends AbstractValidator<Workflow, GHAPackage> {
    public GHA2CircleCIValidator(ResourceSet resourceSet) {
        super(resourceSet, GHAPackage.eINSTANCE, "validations/gha/gha2circleci.ocl");
    }
}
