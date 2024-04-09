package cli;

import cli.compilers.TransformationsDSLToATLASMCompiler;
import cli.engineers.reverseEngineers.CircleCIReverseEngineer;
import cli.engineers.reverseEngineers.GHAReverseEngineer;
import cli.engineers.reverseEngineers.AbstractReverseEngineer;
import cli.engineers.forwardEngineers.CircleCIForwardEngineer;
import cli.engineers.forwardEngineers.GHAForwardEngineer;
import cli.engineers.forwardEngineers.JenkinsForwardEngineer;
import cli.engineers.forwardEngineers.AbstractForwardEngineer;
import cli.generators.CircleCIGenerator;
import cli.generators.GHAGenerator;
import cli.generators.JenkinsGenerator;
import cli.parsers.CircleCIParser;
import cli.parsers.GitHubActionsParser;
import cli.parsers.exceptions.SyntaxException;
import cli.transformers.endogenous.CICD.EndogenousCICDAbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.transformers.exogenous.fromTIM.CICD2CircleCITransformer;
import cli.transformers.exogenous.fromTIM.CICD2GHATransformer;
import cli.transformers.exogenous.fromTIM.CICD2JenkinsTransformer;
import cli.transformers.exogenous.toTIM.CircleCI2CICDTransformer;
import cli.transformers.exogenous.toTIM.GHA2CICDTransformer;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import cli.utils.LoggerUtils;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;
import org.apache.commons.cli.*;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.engine.compiler.AtlCompiler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class Main {
	final private static ResourceSet resourceSet = new ResourceSetImpl();
	final private static Map<String, AbstractReverseEngineer<?, ?>> inputCompilers = new HashMap<>();
	final private static Map<String, AbstractForwardEngineer<?, ?, ?>> outputCompilers = new HashMap<>();

    static {
		JavaUtils.cleanUp();
		registerPackages();
        try {
            registerInputCompilers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            registerOutputCompilers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

	private static void registerPackages() {
		EMFUtils.registerPackages(getResourceSet(), CICDPackage.eINSTANCE, GHAPackage.eINSTANCE, JenkinsPackage.eINSTANCE, CircleCIPackage.eINSTANCE, TransformationsPackage.eINSTANCE);
	}

	private static void registerInputCompilers() throws IOException {
		inputCompilers.put("gha", new GHAReverseEngineer(new GHA2CICDTransformer(getResourceSet()), new GitHubActionsParser()));
		inputCompilers.put("circleci", new CircleCIReverseEngineer(new CircleCI2CICDTransformer(getResourceSet()), new CircleCIParser()));
	}

	private static void registerOutputCompilers() throws IOException {
		outputCompilers.put("jenkins", new JenkinsForwardEngineer(new CICD2JenkinsTransformer(getResourceSet()), new JenkinsGenerator(getResourceSet())));
		outputCompilers.put("gha", new GHAForwardEngineer(new CICD2GHATransformer(getResourceSet()), new GHAGenerator(getResourceSet())));
		outputCompilers.put("circleci", new CircleCIForwardEngineer(new CICD2CircleCITransformer(getResourceSet()), new CircleCIGenerator(getResourceSet())));
	}

	private static Options getCommandLineOptions() {
		Options options = new Options();

		options.addRequiredOption("il", "input-language", true, "Input language (required)");
		options.addRequiredOption("ol", "output-language", true, "Output language (required)");
		options.addOption("i", "input-file", true, "Input file path");
		options.addOption("o", "output-file", true, "Output file path");
		options.addOption("v", "verbose", false, "Verbose mode");
		options.addOption("lf", "log-file", true, "Log file path");
		options.addOption("ef", "extension-file", true, "Extension file path");

		return options;
	}

	public static void main(String[] args) {
		Options options = getCommandLineOptions();
		CommandLineParser commandLineParser = new DefaultParser();

        CommandLine commandLine;
        try {
            commandLine = commandLineParser.parse(options, args);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

		AbstractReverseEngineer<?, ?> inputEngineer = getInputCompiler(commandLine.getOptionValue("il"));
		AbstractForwardEngineer<?, ?, ?> outputEngineer = getOutputCompiler(commandLine.getOptionValue("ol"));

		if (inputEngineer == null) {
			throw new RuntimeException("Input language not supported");
		}

		if (outputEngineer == null) {
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

		if (commandLine.hasOption("v")) {
			LoggerUtils.getLogger().setLevel(Level.INFO);
		} else {
			LoggerUtils.getLogger().setLevel(Level.SEVERE);
		}

		if (commandLine.hasOption("lf")) {
			try {
				Handler fileHandler = new FileHandler(commandLine.getOptionValue("lf"));
				LoggerUtils.getLogger().addHandler(fileHandler);
			} catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

		String outputScript = null;

		List<String> refinerPaths = new ArrayList<>();

		if (commandLine.hasOption("ef")) {
			TransformationsDSLToATLASMCompiler transformationsDSLToATLASMCompiler = new TransformationsDSLToATLASMCompiler(getResourceSet());
			try {
				refinerPaths = transformationsDSLToATLASMCompiler.compile(Files.readString(Path.of(commandLine.getOptionValue("ef"))));
			} catch (IOException | SyntaxException e) {
				throw new RuntimeException(e);
			}
        }

		List<String> inputRefinerPaths = new ArrayList<>();
		List<String> outputRefinerPaths = new ArrayList<>();
		List<String> cicdRefinerPaths = new ArrayList<>();

		for (String refinerPath : refinerPaths) {
			if (refinerPath.toLowerCase().contains(commandLine.getOptionValue("il").toLowerCase())) {
				inputRefinerPaths.add(refinerPath);
			} else if (refinerPath.toLowerCase().contains(commandLine.getOptionValue("ol").toLowerCase())) {
				outputRefinerPaths.add(refinerPath);
			} else if (refinerPath.toLowerCase().contains("cicd")) {
				cicdRefinerPaths.add(refinerPath);
			}
		}

        try {
			Pipeline pipeline = inputEngineer.transform(inputScript, inputRefinerPaths, new ArrayList<>());
			outputScript = outputEngineer.transform(pipeline, cicdRefinerPaths, outputRefinerPaths);
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
				Files.writeString(Path.of(commandLine.getOptionValue("o")), outputScript);
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

	public static Map<String, AbstractReverseEngineer<?, ?>> getInputCompilers() {
		return inputCompilers;
	}

	public static AbstractReverseEngineer<?, ?> getInputCompiler(String inputType) {
		return inputCompilers.get(inputType);
	}

	public static Map<String, AbstractForwardEngineer<?, ?, ?>> getOutputCompilers() {
		return outputCompilers;
	}

	public static AbstractForwardEngineer<?, ?, ?> getOutputCompiler(String outputType) {
		return outputCompilers.get(outputType);
	}
}
