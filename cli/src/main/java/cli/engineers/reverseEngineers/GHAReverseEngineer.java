package cli.engineers.reverseEngineers;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.transformers.endogenous.GHA.GHARefiner;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GHAReverseEngineer extends AbstractReverseEngineer<Workflow, GHAPackage> {
    public GHAReverseEngineer(AbstractTransformer<Workflow, GHAPackage, Pipeline, CICDPackage> transformer, AbstractParser<Workflow> parser) {
        super(transformer, parser);
    }

    @Override
    protected List<EndogenousAbstractTransformer<Workflow, GHAPackage>> getInputRefiners(List<String> inputRefinerPaths) {
        List<EndogenousAbstractTransformer<Workflow, GHAPackage>> inputRefiners = new ArrayList<>();

        for (String inputRefinerPath : inputRefinerPaths) {
            try {
                inputRefiners.add(new GHARefiner(getTransformer().getResourceSet(), inputRefinerPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return inputRefiners;
    }
}
