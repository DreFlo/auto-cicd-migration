package cli.transformers.endogenous.GHA;

import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class EndogenousGHAAbstractTransformer extends EndogenousAbstractTransformer<Workflow, GHAPackage> {
    protected EndogenousGHAAbstractTransformer(ResourceSet resourceSet, String atlFilePath, String inputModelName, String outputModelName, Boolean refiner) throws IOException {
        super(resourceSet, GHAPackage.eINSTANCE, atlFilePath, inputModelName, outputModelName, refiner);
    }

    protected EndogenousGHAAbstractTransformer(ResourceSet resourceSet, InputStream atlFileStream, String inputModelName, String outputModelName, Boolean refiner) {
        super(resourceSet, GHAPackage.eINSTANCE, atlFileStream, inputModelName, outputModelName, refiner);
    }
}
