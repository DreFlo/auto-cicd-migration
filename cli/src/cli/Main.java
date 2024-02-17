package cli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import cli.parsers.*;
import cli.parsers.exceptions.*;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Main {
	private static void registerPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(GHAPackage.eNS_URI, GHAPackage.eINSTANCE);
	}

	public static void main(String[] args) {
		final ResourceSet resourceSet = new ResourceSetImpl();
		registerPackages(resourceSet);
		GitHubActionsParser parser = new GitHubActionsParser();

		if (args.length != 1) {
			System.out.println("Usage: java -jar <jarfile> <inputfile>");
			System.exit(1);
		}
		
		try {
			Workflow workflow = parser.parse(Files.readString(Path.of(args[0])));
			System.out.println(workflow);
		} catch (SyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
