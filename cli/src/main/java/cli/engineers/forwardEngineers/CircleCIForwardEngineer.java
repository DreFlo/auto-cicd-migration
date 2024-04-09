package cli.engineers.forwardEngineers;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.circleci.acceleo.main.Generate;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;

public class CircleCIForwardEngineer extends AbstractForwardEngineer<Pipeline, CircleCIPackage, Generate> {
    public CircleCIForwardEngineer(AbstractTransformer<d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage, Pipeline, CircleCIPackage> transformer, AbstractGenerator<Pipeline, CircleCIPackage, Generate> generator) {
        super(transformer, generator, "config.yml");
    }
}
