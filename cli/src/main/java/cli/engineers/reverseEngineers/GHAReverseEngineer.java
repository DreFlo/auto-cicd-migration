package cli.engineers.reverseEngineers;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;

public class GHAReverseEngineer extends AbstractReverseEngineer<Workflow, GHAPackage> {
    public GHAReverseEngineer(AbstractTransformer<Workflow, GHAPackage, Pipeline, CICDPackage> transformer, AbstractParser<Workflow> parser) {
        super(transformer, parser);
    }
}
