package cli.compilers.output;

import cli.generators.AbstractGenerator;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.gha.acceleo.main.Generate;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;

public class GHAOutputCompiler extends OutputAbstractCompiler<Workflow, GHAPackage, Generate> {
    public GHAOutputCompiler(AbstractTransformer<Pipeline, CICDPackage, Workflow, GHAPackage> transformer, AbstractGenerator<Workflow, GHAPackage, Generate> generator) {
        super(transformer, generator, "workflow.yaml");
    }
}
