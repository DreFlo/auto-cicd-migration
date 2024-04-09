package cli.engineers.forwardEngineers;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.transformers.endogenous.Jenkins.JenkinsRefiner;
import d.fe.up.pt.cicd.jenkins.acceleo.main.Generate;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JenkinsForwardEngineer extends AbstractForwardEngineer<Pipeline, JenkinsPackage, Generate> {
    public JenkinsForwardEngineer(AbstractTransformer<d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage, Pipeline, JenkinsPackage> transformer, AbstractGenerator<Pipeline, JenkinsPackage, Generate> generator) {
        super(transformer, generator, "Jenkinsfile");
    }

    @Override
    protected List<EndogenousAbstractTransformer<Pipeline, JenkinsPackage>> getOutputRefiners(List<String> outputRefinerPaths) {
        List<EndogenousAbstractTransformer<Pipeline, JenkinsPackage>> outputRefiners = new ArrayList<>();

        for (String outputRefinerPath : outputRefinerPaths) {
            try {
                outputRefiners.add(new JenkinsRefiner(getTransformer().getResourceSet(), outputRefinerPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return outputRefiners;
    }
}
