package cli.transformers.fromTIM;

import cli.transformers.Transformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public abstract class FromTIMTransformer<OutputModel extends EObject, OutputPackage extends EPackage, ATLTransformer> extends
        Transformer<Pipeline, CICDPackage, OutputModel, OutputPackage, ATLTransformer> {
    protected FromTIMTransformer(ResourceSet resourceSet, OutputPackage outputPackage) {
        super(resourceSet, CICDPackage.eINSTANCE, outputPackage);
    }
}
