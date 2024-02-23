package cli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import cli.compilers.input.GHAInputCompiler;
import cli.compilers.input.InputAbstractCompiler;
import cli.compilers.output.JenkinsOutputCompiler;
import cli.compilers.output.OutputAbstractCompiler;
import cli.generators.JenkinsGenerator;
import cli.parsers.*;
import cli.parsers.exceptions.*;
import cli.transformers.AbstractTransformer;
import cli.transformers.fromTIM.CICD2JenkinsTransformer;
import cli.transformers.fromTIM.FromTIMAbstractTransformer;
import cli.transformers.toTIM.GHA2CICDTransformer;
import cli.utils.EMFUtils;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Main {
	final private static ResourceSet resourceSet = new ResourceSetImpl();
	final private static Map<String, InputAbstractCompiler<?, ?>> inputCompilers = new HashMap<>();
	final private static Map<String, OutputAbstractCompiler<?, ?, ?>> outputCompilers = new HashMap<>();

	private static void registerPackages() {
		EMFUtils.registerPackages(getResourceSet(), CICDPackage.eINSTANCE, GHAPackage.eINSTANCE, JenkinsPackage.eINSTANCE);
	}

	private static void registerInputCompilers() {
		inputCompilers.put("gha", new GHAInputCompiler(new GHA2CICDTransformer(getResourceSet()), new GitHubActionsParser()));
	}

	private static void registerOutputCompilers() {
		outputCompilers.put("jenkins", new JenkinsOutputCompiler(new CICD2JenkinsTransformer(getResourceSet()), new JenkinsGenerator(getResourceSet())));
	}

	public static void main(String[] args) {
		registerPackages();
		registerInputCompilers();
		registerOutputCompilers();

		if (args.length != 1) {
			System.out.println("Usage: java -jar <jarfile> <inputfile>");
			System.exit(1);
		}

        try {
			Pipeline pipeline = getInputCompiler("gha").compile(Files.readString(Path.of(args[0])));

			getOutputCompiler("jenkins").compile(pipeline);
		} catch (SyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

	public static ResourceSet getResourceSet() {
		return resourceSet;
	}

	public static Map<String, InputAbstractCompiler<?, ?>> getInputCompilers() {
		return inputCompilers;
	}

	public static InputAbstractCompiler<?, ?> getInputCompiler(String inputType) {
		return inputCompilers.get(inputType);
	}

	public static Map<String, OutputAbstractCompiler<?, ?, ?>> getOutputCompilers() {
		return outputCompilers;
	}

	public static OutputAbstractCompiler<?, ?, ?> getOutputCompiler(String outputType) {
		return outputCompilers.get(outputType);
	}
}
