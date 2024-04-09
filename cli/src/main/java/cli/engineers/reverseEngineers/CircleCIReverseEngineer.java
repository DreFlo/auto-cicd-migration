package cli.engineers.reverseEngineers;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

public class CircleCIReverseEngineer extends AbstractReverseEngineer<Pipeline, CircleCIPackage> {
    public CircleCIReverseEngineer(AbstractTransformer<Pipeline, CircleCIPackage, d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage> transformer, AbstractParser<Pipeline> parser) {
        super(transformer, parser);
    }
}
