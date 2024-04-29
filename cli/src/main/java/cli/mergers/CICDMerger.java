package cli.mergers;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class CICDMerger extends AbstractMerger<Pipeline, CICDPackage>{
    public CICDMerger(ResourceSet resourceSet) {
        super(resourceSet, CICDPackage.eINSTANCE);
    }
}
