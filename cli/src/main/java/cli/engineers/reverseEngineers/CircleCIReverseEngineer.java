package cli.engineers.reverseEngineers;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CircleCI.CircleCIRefiner;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CircleCIReverseEngineer extends AbstractReverseEngineer<Pipeline, CircleCIPackage> {
    public CircleCIReverseEngineer(AbstractTransformer<Pipeline, CircleCIPackage, d.fe.up.pt.cicd.metamodel.CICD.Pipeline, CICDPackage> transformer, AbstractParser<Pipeline> parser) {
        super(transformer, parser);
    }

    @Override
    protected EndogenousAbstractTransformer<Pipeline, CircleCIPackage> getInputRefiner(ResourceSet resourceSet, String inputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException {
        return new CircleCIRefiner(resourceSet, inputRefinerPath, inputModelName, outputModelName, isRefinement);
    }
}
