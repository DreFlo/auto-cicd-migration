package cli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import cli.parsers.*;
import cli.parsers.exceptions.*;
import cli.transformers.toTIM.GHA2CICDTransformer;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Main {
	final private static ResourceSet resourceSet = new ResourceSetImpl();

	private static void registerPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(CICDPackage.eNS_URI, CICDPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(GHAPackage.eNS_URI, GHAPackage.eINSTANCE);
	}

	public static void main(String[] args) {
		registerPackages(getResourceSet());
		GitHubActionsParser parser = new GitHubActionsParser();

		if (args.length != 1) {
			System.out.println("Usage: java -jar <jarfile> <inputfile>");
			System.exit(1);
		}

        try {
			Workflow workflow = parser.parse(Files.readString(Path.of(args[0])));

			Pipeline pipeline = new GHA2CICDTransformer(getResourceSet()).transform(workflow);

			System.out.println(pipeline);
		} catch (SyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	public static ResourceSet getResourceSet() {
		return resourceSet;
	}
}
