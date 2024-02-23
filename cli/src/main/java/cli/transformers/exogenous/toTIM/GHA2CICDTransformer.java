package cli.transformers.exogenous.toTIM;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class GHA2CICDTransformer extends ToTIMAbstractTransformer<Workflow, GHAPackage> {
    public GHA2CICDTransformer(ResourceSet resourceSet) {
        super(resourceSet, GHAPackage.eINSTANCE, "transformations/tsm2tim/gha2cicd.asm", "GHA");
    }
}