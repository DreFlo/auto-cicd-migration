package cli.transformers.fromTIM;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class CICD2JenkinsTransformer extends FromTIMAbstractTransformer<Pipeline, JenkinsPackage> {
    public CICD2JenkinsTransformer(ResourceSet resourceSet) {
        super(resourceSet, JenkinsPackage.eINSTANCE, "transformations/tim2tsm/cicd2jenkins.asm", "Jenkins");
    }
}
