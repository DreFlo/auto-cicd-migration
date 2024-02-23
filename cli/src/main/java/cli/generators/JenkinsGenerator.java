package cli.generators;

import cli.utils.JavaUtils;
import d.fe.up.pt.cicd.jenkins.acceleo.main.Generate;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static cli.utils.EMFUtils.serializeModel;

public class JenkinsGenerator extends AbstractGenerator<Pipeline, JenkinsPackage, Generate>{
    public JenkinsGenerator(ResourceSet resourceSet) {
        super(resourceSet, JenkinsPackage.eINSTANCE);
    }

    @Override
    public void generate(Pipeline pipeline, String outputFolder) throws IOException {
        String tempDir = ".";
        String randomName = JavaUtils.getRandomName() + ".xmi";
        String filePath = Path.of(tempDir, randomName).toString();
        serializeModel(pipeline, filePath, getResourceSet());
        Generate.main(List.of(filePath, outputFolder).toArray(String[]::new));
    }

    @Override
    protected Generate createGenerator(Pipeline pipeline, String outputFolder) throws IOException {
        return new Generate(pipeline, new File(outputFolder), List.of());
    }
}
