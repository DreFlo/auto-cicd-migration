package cli.engineers.forwardEngineers;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.jenkins.acceleo.main.Generate;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

public class JenkinsForwardEngineer extends AbstractForwardEngineer<Pipeline, JenkinsPackage, Generate> {
    public JenkinsForwardEngineer(AbstractTransformer<d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage, Pipeline, JenkinsPackage> transformer, AbstractGenerator<Pipeline, JenkinsPackage, Generate> generator) {
        super(transformer, generator, "Jenkinsfile");
    }
}
