package cli.transformers.fromTIM;

import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public abstract class FromTIMAbstractTransformer<OutputModel extends EObject, OutputPackage extends EPackage> extends AbstractTransformer<Pipeline, CICDPackage, OutputModel, OutputPackage> {
    protected FromTIMAbstractTransformer(ResourceSet resourceSet, OutputPackage outputPackage, String atlFilePath, String outputModelName) {
        super(resourceSet, CICDPackage.eINSTANCE, outputPackage, atlFilePath, "CICD", outputModelName);
    }
}
