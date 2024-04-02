package cli.validators;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class CICDValidator extends AbstractValidator<Pipeline, CICDPackage> {
    public CICDValidator(ResourceSet resourceSet, String oclFilePath) {
        super(resourceSet, CICDPackage.eINSTANCE, CICDPackage.eINSTANCE.getEClassifier("Pipeline"), oclFilePath);
    }
}
