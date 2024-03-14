package cli.compilers.output;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.jenkins.acceleo.main.Generate;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

public class JenkinsOutputCompiler extends OutputAbstractCompiler<Pipeline, JenkinsPackage, Generate> {
    public JenkinsOutputCompiler(AbstractTransformer<d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage, Pipeline, JenkinsPackage> transformer, AbstractGenerator<Pipeline, JenkinsPackage, Generate> generator) {
        super(transformer, generator, "Jenkinsfile");
    }
}
