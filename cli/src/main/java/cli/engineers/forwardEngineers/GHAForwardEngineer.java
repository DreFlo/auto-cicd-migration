package cli.engineers.forwardEngineers;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.transformers.endogenous.GHA.GHARefiner;
import d.fe.up.pt.cicd.gha.acceleo.main.Generate;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GHAForwardEngineer extends AbstractForwardEngineer<Workflow, GHAPackage, Generate> {
    public GHAForwardEngineer(AbstractTransformer<Pipeline, CICDPackage, Workflow, GHAPackage> transformer, AbstractGenerator<Workflow, GHAPackage, Generate> generator) {
        super(transformer, generator, "workflow.yaml");
    }

    @Override
    protected List<EndogenousAbstractTransformer<Workflow, GHAPackage>> getOutputRefiners(List<String> outputRefinerPaths) {
        List<EndogenousAbstractTransformer<Workflow, GHAPackage>> outputRefiners = new ArrayList<>();

        for (String outputRefinerPath : outputRefinerPaths) {
            try {
                outputRefiners.add(new GHARefiner(getTransformer().getResourceSet(), outputRefinerPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return outputRefiners;
    }
}
