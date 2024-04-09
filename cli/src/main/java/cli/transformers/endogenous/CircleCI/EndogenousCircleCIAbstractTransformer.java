package cli.transformers.endogenous.CircleCI;

import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class EndogenousCircleCIAbstractTransformer extends EndogenousAbstractTransformer<Pipeline, CircleCIPackage> {
    protected EndogenousCircleCIAbstractTransformer(ResourceSet resourceSet, String atlFilePath, String inputModelName, String outputModelName, Boolean refiner) throws IOException {
        super(resourceSet, CircleCIPackage.eINSTANCE, atlFilePath, inputModelName, outputModelName, refiner);
    }

    protected EndogenousCircleCIAbstractTransformer(ResourceSet resourceSet, InputStream atlFileStream, String inputModelName, String outputModelName, Boolean refiner) {
        super(resourceSet, CircleCIPackage.eINSTANCE, atlFileStream, inputModelName, outputModelName, refiner);
    }
}
