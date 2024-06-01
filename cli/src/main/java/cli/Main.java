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
import cli.mergers.CICDMerger;
import cli.parsers.CircleCIParser.CircleCIParser;
import cli.parsers.GitHubActionsParser.GitHubActionsParser;
import cli.parsers.exceptions.SyntaxException;
import cli.transformers.exogenous.fromTIM.CICD2CircleCITransformer;
import cli.transformers.exogenous.fromTIM.CICD2GHATransformer;
import cli.transformers.exogenous.fromTIM.CICD2JenkinsTransformer;
import cli.transformers.exogenous.toTIM.CircleCI2CICDTransformer;
import cli.transformers.exogenous.toTIM.GHA2CICDTransformer;
import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import cli.utils.LoggerUtils;
import cli.validators.AbstractValidator;
import cli.validators.GHAValidator;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;
import org.apache.commons.cli.*;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import java.io.IOException;
import java.nio.file.FileSystems;
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
		EMFUtils.registerExtensionToFactoryMap(resourceSet, "ecore", new org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl());
		EMFUtils.registerExtensionToFactoryMap(resourceSet, "xmi", new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl());
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

		options.addOption(
			Option.builder()
				.option("il")
				.longOpt("input-languages")
				.hasArgs()
				.desc("Input language (required)")
				.required()
				.build()
		);
		options.addRequiredOption("ol", "output-language", true, "Output language (required)");
		options.addOption(
			Option.builder()
				.option("i")
				.longOpt("input-files")
				.hasArgs()
				.desc("Input file paths")
				.build()
		);
		options.addOption("o", "output-file", true, "Output file path");
		options.addOption("v", "verbose", false, "Verbose mode");
		options.addOption("s", "strict", false, "Validate after parsing");
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

		// Create intermediate folder if it does not exist
		Path intermediateFolder = Path.of("intermediate");
		if (!intermediateFolder.toFile().exists()) {
			if (!intermediateFolder.toFile().mkdirs()) {
				throw new RuntimeException("Could not create intermediate folder");
			}
		}

		List<AbstractReverseEngineer<?, ?>> inputEngineers = new ArrayList<>();
		for (String inputLanguage : commandLine.getOptionValues("il")) {
			AbstractReverseEngineer<?, ?> inputEngineer = getInputCompiler(inputLanguage);
			if (inputEngineer == null) {
				throw new RuntimeException("Input language \"" + inputLanguage + "\" not supported");
			} else {
				if (inputLanguage.equals("gha") && commandLine.hasOption("s")) {
					((GHA2CICDTransformer)inputEngineer.getTransformer()).setValidator(new GHAValidator(getResourceSet(), "validations/gha/canBeMigrated.ocl"));
				}
				inputEngineers.add(inputEngineer);
			}
		}
		AbstractForwardEngineer<?, ?, ?> outputEngineer = getOutputCompiler(commandLine.getOptionValue("ol"));

		if (outputEngineer == null) {
			throw new RuntimeException("Output language not supported");
		}

		List<String> inputScripts;

		if (commandLine.hasOption("i")) {
			inputScripts = Arrays.stream(commandLine.getOptionValues("i")).map(Path::of).map(path -> {
				try {
					return Files.readString(path);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}).toList();
		} else {
			// Read from stdin
			inputScripts = List.of(new Scanner(System.in).useDelimiter("\\A").next());
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

		// TODO Fix for multiple input languages
		for (String refinerPath : refinerPaths) {
			// Split at path separator (OS independent) and get the last element
			String separator = FileSystems.getDefault().getSeparator().replace("\\", "\\\\");
			String partialRefinerPath = refinerPath.split(separator)[refinerPath.split(separator).length - 1];
			if (partialRefinerPath.startsWith("PRE") && partialRefinerPath.toLowerCase().contains(commandLine.getOptionValue("il").toLowerCase())) {
				inputRefinerPaths.add(refinerPath);
			} else if (partialRefinerPath.startsWith("POST") && partialRefinerPath.toLowerCase().contains(commandLine.getOptionValue("ol").toLowerCase())) {
				outputRefinerPaths.add(refinerPath);
			} else if (partialRefinerPath.toLowerCase().contains("cicd")) {
				cicdRefinerPaths.add(refinerPath);
			}
		}

        try {
			List<Pipeline> pipelines = new ArrayList<>();
			if (inputScripts.size() != inputEngineers.size()) {
				throw new RuntimeException("Number of input scripts does not match number of input languages");
			}
			for (int i = 0; i < inputScripts.size(); i++) {
				pipelines.add(inputEngineers.get(i).transform(inputScripts.get(i), inputRefinerPaths, new ArrayList<>()));
			}
			Pipeline pipeline;

			if (pipelines.size() == 1) {
				pipeline = pipelines.get(0);
			} else {
				pipeline = pipelines.get(0);
				for (int i = 1; i < pipelines.size(); i++) {
					pipeline = (new CICDMerger(getResourceSet())).merge(pipeline, pipelines.get(i));
				}
			}

			outputScript = outputEngineer.transform(pipeline, cicdRefinerPaths, outputRefinerPaths);
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
