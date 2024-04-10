package cli.engineers.forwardEngineers;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.transformers.endogenous.Jenkins.JenkinsRefiner;
import d.fe.up.pt.cicd.jenkins.acceleo.main.Generate;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JenkinsForwardEngineer extends AbstractForwardEngineer<Pipeline, JenkinsPackage, Generate> {
    public JenkinsForwardEngineer(AbstractTransformer<d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage, Pipeline, JenkinsPackage> transformer, AbstractGenerator<Pipeline, JenkinsPackage, Generate> generator) {
        super(transformer, generator, "Jenkinsfile");
    }

    @Override
    protected EndogenousAbstractTransformer<Pipeline, JenkinsPackage> getOutputRefiner(ResourceSet resourceSet, String outputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException {
        return new JenkinsRefiner(resourceSet, outputRefinerPath, inputModelName, outputModelName, isRefinement);
    }
}
