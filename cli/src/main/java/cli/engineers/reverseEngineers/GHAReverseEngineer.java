package cli.engineers.reverseEngineers;

import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.transformers.endogenous.GHA.GHARefiner;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GHAReverseEngineer extends AbstractReverseEngineer<Workflow, GHAPackage> {
    public GHAReverseEngineer(AbstractTransformer<Workflow, GHAPackage, Pipeline, CICDPackage> transformer, AbstractParser<Workflow> parser) {
        super(transformer, parser);
    }

    @Override
    protected EndogenousAbstractTransformer<Workflow, GHAPackage> getInputRefiner(ResourceSet resourceSet, String inputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException {
        return new GHARefiner(resourceSet, inputRefinerPath, inputModelName, outputModelName, isRefinement);
    }
}
