package cli.transformers.exogenous.fromTIM;

import cli.transformers.endogenous.CICD.ExtractJobInputs;
import cli.transformers.endogenous.CICD.SimplifyConditionals;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class CICD2GHATransformer extends FromTIMAbstractTransformer<Workflow, GHAPackage>{
    public CICD2GHATransformer(ResourceSet resourceSet) throws IOException {
        super(resourceSet, GHAPackage.eINSTANCE, "transformations/tim2tsm/cicd2gha.asm", "GHA", null);
    }

    @Override
    protected void registerRefiners() {
        try {
            getRefiners().add(new SimplifyConditionals(getResourceSet()));
            getRefiners().add(new ExtractJobInputs(getResourceSet()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
