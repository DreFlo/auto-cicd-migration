package cli.transformers.endogenous.Jenkins;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class JenkinsRefiner extends EndogenousJenkinsAbstractTransformer{
    public JenkinsRefiner(ResourceSet resourceSet, String atlFilePath) throws IOException {
        super(resourceSet, atlFilePath, "Jenkins", "Jenkins", true);
    }

    public JenkinsRefiner(ResourceSet resourceSet, String atlFilePath, String inputModelName, String outputModelName, Boolean refiner) throws IOException {
        super(resourceSet, atlFilePath, inputModelName, outputModelName, refiner);
    }

    public JenkinsRefiner(ResourceSet resourceSet, InputStream atlFileStream) {
        super(resourceSet, atlFileStream, "Jenkins", "Jenkins", true);
    }
}
