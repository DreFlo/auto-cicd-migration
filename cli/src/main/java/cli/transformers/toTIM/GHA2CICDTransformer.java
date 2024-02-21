package cli.transformers.toTIM;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class GHA2CICDTransformer extends ToTIMTransformer<Workflow, GHAPackage>{
    public GHA2CICDTransformer(ResourceSet resourceSet) throws IOException {
        super(resourceSet, GHAPackage.eINSTANCE, "gha2cicd.asm", "GHA");
    }
}
