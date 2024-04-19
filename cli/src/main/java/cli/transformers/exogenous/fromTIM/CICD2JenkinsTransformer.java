package cli.transformers.exogenous.fromTIM;

import cli.transformers.endogenous.CICD.ExtractEnvironmentVariablesFromSteps;
import cli.validators.CICDValidator;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class CICD2JenkinsTransformer extends FromTIMAbstractTransformer<Pipeline, JenkinsPackage> {
    public CICD2JenkinsTransformer(ResourceSet resourceSet) throws IOException {
        super(resourceSet, JenkinsPackage.eINSTANCE, "transformations/tim2tsm/cicd2jenkins.asm", "Jenkins", new CICDValidator(resourceSet, "validations/cicd/PreJenkinsTransformationConstraints.ocl"));
    }

    @Override
    protected void registerRefiners() {
//        try {
//            getRefiners().add(new ExtractEnvironmentVariablesFromSteps(getResourceSet()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
