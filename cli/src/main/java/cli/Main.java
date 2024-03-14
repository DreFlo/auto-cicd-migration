package cli;

import java.io.IOException;
import java.io.StringBufferInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cli.compilers.input.GHAInputCompiler;
import cli.compilers.input.InputAbstractCompiler;
import cli.compilers.output.JenkinsOutputCompiler;
import cli.compilers.output.OutputAbstractCompiler;
import cli.generators.JenkinsGenerator;
import cli.parsers.*;
import cli.parsers.exceptions.*;
import cli.transformers.exogenous.fromTIM.CICD2JenkinsTransformer;
import cli.transformers.exogenous.toTIM.GHA2CICDTransformer;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.apache.commons.cli.*;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class Main {
	final private static ResourceSet resourceSet = new ResourceSetImpl();
	final private static Map<String, InputAbstractCompiler<?, ?>> inputCompilers = new HashMap<>();
	final private static Map<String, OutputAbstractCompiler<?, ?, ?>> outputCompilers = new HashMap<>();

	private static CommandLine commandLine = null;

	static {
		JavaUtils.cleanUp();
		registerPackages();
		registerInputCompilers();
		registerOutputCompilers();
	}

	private static void registerPackages() {
		EMFUtils.registerPackages(getResourceSet(), CICDPackage.eINSTANCE, GHAPackage.eINSTANCE, JenkinsPackage.eINSTANCE);
	}

	private static void registerInputCompilers() {
		inputCompilers.put("gha", new GHAInputCompiler(new GHA2CICDTransformer(getResourceSet()), new GitHubActionsParser()));
	}

	private static void registerOutputCompilers() {
		outputCompilers.put("jenkins", new JenkinsOutputCompiler(new CICD2JenkinsTransformer(getResourceSet()), new JenkinsGenerator(getResourceSet())));
	}

	private static Options getCommandLineOptions() {
		Options options = new Options();

		options.addRequiredOption("il", "input-language", true, "Input language (required)");
		options.addRequiredOption("ol", "output-language", true, "Output language (required)");
		options.addOption("i", "input-file", true, "Input file path");
		options.addOption("o", "output-file", true, "Output file path");

		return options;
	}

	public static void main(String[] args) {
		Options options = getCommandLineOptions();
		CommandLineParser commandLineParser = new DefaultParser();

        try {
            commandLine = commandLineParser.parse(options, args);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

		InputAbstractCompiler<?, ?> inputCompiler = getInputCompiler(commandLine.getOptionValue("il"));
		OutputAbstractCompiler<?, ?, ?> outputCompiler = getOutputCompiler(commandLine.getOptionValue("ol"));

		if (inputCompiler == null) {
			throw new RuntimeException("Input language not supported");
		}

		if (outputCompiler == null) {
			throw new RuntimeException("Output language not supported");
		}

		String inputScript;

		if (commandLine.hasOption("i")) {
			try {
				inputScript = Files.readString(Path.of(commandLine.getOptionValue("if")));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else {
			// Read from stdin
			inputScript = new Scanner(System.in).useDelimiter("\\A").next();
		}

		String outputScript = null;

        try {
			Pipeline pipeline = inputCompiler.compile(inputScript);
			outputScript = outputCompiler.compile(pipeline);
		} catch (SyntaxException | IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
            throw new RuntimeException(e);
        }

		if (outputScript == null) {
			throw new RuntimeException("Output script is null");
		}

		if (commandLine.hasOption("o")) {
			try {
				Files.writeString(Path.of(commandLine.getOptionValue("of")), outputScript);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		} else {
			System.out.println(outputScript);
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
