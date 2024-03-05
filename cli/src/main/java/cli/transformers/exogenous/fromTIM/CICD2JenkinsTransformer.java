package cli.transformers.exogenous.fromTIM;

import cli.transformers.endogenous.CICD.ExtractEnvironmentVariablesFromSteps;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class CICD2JenkinsTransformer extends FromTIMAbstractTransformer<Pipeline, JenkinsPackage> {
    public CICD2JenkinsTransformer(ResourceSet resourceSet) {
        super(resourceSet, JenkinsPackage.eINSTANCE, "transformations/tim2tsm/cicd2jenkins.asm", "Jenkins");
    }

    @Override
    protected void registerRefiners() {
        getRefiners().add(new ExtractEnvironmentVariablesFromSteps(getResourceSet()));
    }
}
