package cli.transformers.exogenous.toTIM;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class CircleCI2CICDTransformer extends ToTIMAbstractTransformer<Pipeline, CircleCIPackage> {
    public CircleCI2CICDTransformer(ResourceSet resourceSet) {
        super(resourceSet, CircleCIPackage.eINSTANCE, "transformations/tsm2tim/circleci2cicd.asm", "CircleCI");
    }
}
