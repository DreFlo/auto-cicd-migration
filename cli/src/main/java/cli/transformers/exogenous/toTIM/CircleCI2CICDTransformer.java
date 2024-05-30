package cli.transformers.exogenous.toTIM;

import cli.transformers.endogenous.CICD.ContractMatrixInputs;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class CircleCI2CICDTransformer extends ToTIMAbstractTransformer<Pipeline, CircleCIPackage> {
    public CircleCI2CICDTransformer(ResourceSet resourceSet) throws IOException {
        super(resourceSet, CircleCIPackage.eINSTANCE, "transformations/tsm2tim/circleci2cicd.asm", "CircleCI", null);
    }

    @Override
    protected void registerRefiners() {
//        try {
//            getRefiners().add(new ContractMatrixInputs(getResourceSet()));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
