package cli.validators;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class GHAValidator extends AbstractValidator<Workflow, GHAPackage> {
    public GHAValidator(ResourceSet resourceSet, String oclFilePath) {
        super(resourceSet, GHAPackage.eINSTANCE, oclFilePath);
    }
}
