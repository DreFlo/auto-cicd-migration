package cli.compilers.input;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

public class CircleCIInputCompiler extends InputAbstractCompiler<Pipeline, CircleCIPackage> {
    public CircleCIInputCompiler(AbstractTransformer<Pipeline, CircleCIPackage, d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage> transformer, AbstractParser<Pipeline> parser) {
        super(transformer, parser);
    }
}
