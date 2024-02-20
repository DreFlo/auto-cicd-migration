package cli.transformers.toTIM;

import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.gha2cicd.plugin.files.Gha2cicd;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class GHA2CICDTransformer extends ToTIMTransformer<Workflow, GHAPackage, Gha2cicd>{
    public GHA2CICDTransformer(ResourceSet resourceSet) {
        super(resourceSet, GHAPackage.eINSTANCE);
    }

    @Override
    protected void runATLTransformation(String inputModelFilePath, String outputModelFilePath) {
        Gha2cicd.main(new String[]{inputModelFilePath, outputModelFilePath});
    }
}
