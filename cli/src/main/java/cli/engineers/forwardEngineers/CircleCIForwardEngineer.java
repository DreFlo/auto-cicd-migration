package cli.engineers.forwardEngineers;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CircleCI.CircleCIRefiner;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.circleci.acceleo.main.Generate;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CircleCIForwardEngineer extends AbstractForwardEngineer<Pipeline, CircleCIPackage, Generate> {
    public CircleCIForwardEngineer(AbstractTransformer<d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage, Pipeline, CircleCIPackage> transformer, AbstractGenerator<Pipeline, CircleCIPackage, Generate> generator) {
        super(transformer, generator, "config.yml");
    }

    @Override
    protected List<EndogenousAbstractTransformer<Pipeline, CircleCIPackage>> getOutputRefiners(List<String> outputRefinerPaths) {
        List<EndogenousAbstractTransformer<Pipeline, CircleCIPackage>> outputRefiners = new ArrayList<>();

        for (String outputRefinerPath : outputRefinerPaths) {
            try {
                outputRefiners.add(new CircleCIRefiner(getTransformer().getResourceSet(), outputRefinerPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return outputRefiners;
    }
}
