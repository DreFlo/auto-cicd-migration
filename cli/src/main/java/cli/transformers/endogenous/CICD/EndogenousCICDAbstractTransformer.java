package cli.transformers.endogenous.CICD;

import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.InputStream;

public abstract class EndogenousCICDAbstractTransformer extends EndogenousAbstractTransformer<Pipeline, CICDPackage> {
    public EndogenousCICDAbstractTransformer(ResourceSet resourceSet, String atlFilePath, String inputModelName, String outputModelName, Boolean refiner) {
        super(resourceSet, CICDPackage.eINSTANCE, atlFilePath, inputModelName, outputModelName, refiner);
    }

    public EndogenousCICDAbstractTransformer(ResourceSet resourceSet, InputStream atlFileStream, String inputModelName, String outputModelName, Boolean refiner) {
        super(resourceSet, CICDPackage.eINSTANCE, atlFileStream, inputModelName, outputModelName, refiner);
    }
}
