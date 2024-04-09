package cli.transformers.endogenous.Jenkins;

import cli.transformers.endogenous.EndogenousAbstractTransformer;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class EndogenousJenkinsAbstractTransformer extends EndogenousAbstractTransformer<Pipeline, JenkinsPackage> {
    protected EndogenousJenkinsAbstractTransformer(ResourceSet resourceSet, String atlFilePath, String inputModelName, String outputModelName, Boolean refiner) throws IOException {
        super(resourceSet, JenkinsPackage.eINSTANCE, atlFilePath, inputModelName, outputModelName, refiner);
    }

    protected EndogenousJenkinsAbstractTransformer(ResourceSet resourceSet, InputStream atlFileStream, String inputModelName, String outputModelName, Boolean refiner) {
        super(resourceSet, JenkinsPackage.eINSTANCE, atlFileStream, inputModelName, outputModelName, refiner);
    }
}
