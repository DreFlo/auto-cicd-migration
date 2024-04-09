package cli.transformers.exogenous.fromTIM;

import cli.transformers.endogenous.CICD.CICDRefiner;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public class CICD2CircleCITransformer extends FromTIMAbstractTransformer<Pipeline, CircleCIPackage>{
    public CICD2CircleCITransformer(ResourceSet resourceSet) throws IOException {
        super(resourceSet, CircleCIPackage.eINSTANCE, "transformations/tim2tsm/cicd2circleci.asm", "CircleCI", null);
    }

    @Override
    protected void registerRefiners() {}
}
