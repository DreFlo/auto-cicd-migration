package cli.engineers.reverseEngineers;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CircleCI.CircleCIRefiner;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CircleCIReverseEngineer extends AbstractReverseEngineer<Pipeline, CircleCIPackage> {
    public CircleCIReverseEngineer(AbstractTransformer<Pipeline, CircleCIPackage, d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage> transformer, AbstractParser<Pipeline> parser) {
        super(transformer, parser);
    }

    @Override
    protected List<EndogenousAbstractTransformer<Pipeline, CircleCIPackage>> getInputRefiners(List<String> inputRefinerPaths) {
        List<EndogenousAbstractTransformer<Pipeline, CircleCIPackage>> inputRefiners = new ArrayList<>();

        for (String inputRefinerPath : inputRefinerPaths) {
            try {
                inputRefiners.add(new CircleCIRefiner(getTransformer().getResourceSet(), inputRefinerPath));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        return inputRefiners;
    }
}
