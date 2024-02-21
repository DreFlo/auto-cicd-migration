package cli.transformers.fromTIM;

import cli.transformers.Transformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public abstract class FromTIMTransformer<OutputModel extends EObject, OutputPackage extends EPackage> extends Transformer<Pipeline, CICDPackage, OutputModel, OutputPackage> {
    protected FromTIMTransformer(ResourceSet resourceSet, OutputPackage outputPackage, String atlFilePath, String outputModelName) throws IOException {
        super(resourceSet, CICDPackage.eINSTANCE, outputPackage, atlFilePath, "CICD", outputModelName);
    }
}
