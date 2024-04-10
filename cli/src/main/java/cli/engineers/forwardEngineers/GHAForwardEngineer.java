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
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GHAForwardEngineer extends AbstractForwardEngineer<Workflow, GHAPackage, Generate> {
    public GHAForwardEngineer(AbstractTransformer<Pipeline, CICDPackage, Workflow, GHAPackage> transformer, AbstractGenerator<Workflow, GHAPackage, Generate> generator) {
        super(transformer, generator, "workflow.yaml");
    }

    @Override
    protected EndogenousAbstractTransformer<Workflow, GHAPackage> getOutputRefiner(ResourceSet resourceSet, String outputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException {
        return new GHARefiner(resourceSet, outputRefinerPath, inputModelName, outputModelName, isRefinement);
    }
}
