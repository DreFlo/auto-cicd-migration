package cli.parsers;

import cli.parsers.exceptions.SyntaxException;
import com.amihaiemil.eoyaml.*;
import com.google.inject.Injector;

import d.fe.up.pt.cicd.gha.dsl.GitHubActionsStandaloneSetup;
import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Package;
import org.eclipse.xtext.parser.IParseResult;

import java.io.IOException;
import java.io.StringReader;
import java.util.*;
import java.util.stream.StreamSupport;


// TODO Add Outputs to jobs
public class GitHubActionsParser extends AbstractParser<Workflow> {
	@Override
	protected Injector getInjector() {
		return new GitHubActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	protected String formatPipeline(String pipeline) {
		return pipeline;
	}

	@Override
	public Workflow parse(String pipeline) throws SyntaxException {
        YamlMapping yamlMap;
        try {
            yamlMap = Yaml.createYamlInput(pipeline).readYamlMapping();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parseWorkflow(yamlMap);
	}

	private Workflow parseWorkflow(YamlMapping yamlMap) throws SyntaxException {
		Workflow workflow = GHAPackage.eINSTANCE.getGHAFactory().createWorkflow();

		if (yamlMap.string("name") != null) {
			workflow.setName(parseExpression(yamlMap.string("name")));
		}

		if (yamlMap.string("run-name") != null) {
			workflow.setRunName(parseExpression(yamlMap.string("run-name")));
		}

		if (yamlMap.value("on") == null) {
			throw new SyntaxException(List.of("Must have triggers"));
		} else {
			workflow.getTriggers().addAll(parseWorkflowTriggers(yamlMap.value("on")));
		}

		if (yamlMap.value("permissions") != null) {
			workflow.getPermissions().putAll(parsePermissions(yamlMap.value("permissions").asMapping()));
		}

		if (yamlMap.value("env") != null) {
			workflow.getEnvironmentVariables().putAll(parseVariableAssignments(yamlMap.value("env").asMapping()));
		}

		if (yamlMap.value("defaults") != null) {
			workflow.setDefaults(parseDefaults(yamlMap.value("defaults").asMapping()));
		}

		if (yamlMap.value("concurrency") != null) {
			workflow.setConcurrencyGroup(parseConcurrencyGroup(yamlMap.value("concurrency").asMapping()));
		}

		if (yamlMap.value("jobs") != null) {
			workflow.getJobs().addAll(parseJobs(yamlMap.value("jobs")));
		} else {
			throw new SyntaxException("Must have jobs");
		}

		//printAST(workflow);

		return workflow;
	}

	private Expression parseExpression(String expressionString) throws SyntaxException {
		List<String> parts = splitExpression(expressionString);

		if (parts.size() == 1) {
			return parseExpressionAtomic(parts.get(0));
		}

		Concat concat = GHAPackage.eINSTANCE.getGHAFactory().createConcat();

		for (String subExpression : parts) {
			concat.getExpressions().add(parseExpression(subExpression));
		}

		return concat;
	}

	private Expression parseExpressionAtomic(String expressionString) throws SyntaxException {
		if (expressionString.matches("^\\$\\{\\{.*}}$")) {
			return parseBracketedExpression(expressionString.substring(3, expressionString.length() - 2));
		} else {
			if (expressionString.matches("[0-9]+")) {
				IntegerLiteral integerLiteral = GHAPackage.eINSTANCE.getGHAFactory().createIntegerLiteral();
				integerLiteral.setValue(Integer.parseInt(expressionString));
				return integerLiteral;
			} else if (expressionString.matches("true|false")) {
				BooleanLiteral booleanLiteral = GHAPackage.eINSTANCE.getGHAFactory().createBooleanLiteral();
				booleanLiteral.setValue(Boolean.parseBoolean(expressionString));
				return booleanLiteral;
			} else if (expressionString.matches("[0-9]+\\.[0-9]+")) {
				DoubleLiteral doubleLiteral = GHAPackage.eINSTANCE.getGHAFactory().createDoubleLiteral();
				doubleLiteral.setValue(Double.parseDouble(expressionString));
				return doubleLiteral;
			}
			else {
				StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
				stringLiteral.setValue(expressionString);
				return stringLiteral;
			}
		}
	}

	private List<String> splitExpression(String expressionString) {
		List<String> parts = new ArrayList<>();

		while (!expressionString.isEmpty()) {
			int splitIndex = expressionString.indexOf("${{");

			if (splitIndex == -1) {
				parts.add(expressionString);
				break;
			} else if (splitIndex == 0) {
				splitIndex = expressionString.indexOf("}}");

				parts.add(expressionString.substring(0, splitIndex + 2));
				expressionString = expressionString.substring(splitIndex + 2);
			}
			else {
				parts.add(expressionString.substring(0, splitIndex));
				expressionString = expressionString.substring(splitIndex);
			}
		}

		return parts;
	}

	private List<Expression> parseExpressions(List<String> expressions) throws SyntaxException {
		List<Expression> result = new ArrayList<>();
		for (String expression : expressions) {
			result.add(parseExpression(expression));
		}
		return result;
	}

	private Expression parseBracketedExpression(String expressionString) throws SyntaxException {
		IParseResult result = parser.parse(new StringReader(expressionString));

		if (result.hasSyntaxErrors()) {
			throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
					.map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
		}

		return (Expression) result.getRootASTElement();
	}

	private List<Trigger> parseWorkflowTriggers(YamlNode triggers) throws SyntaxException {
		List<Trigger> result = new ArrayList<>();
		if (triggers.type().equals(Node.SCALAR) && !triggers.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
			result.add(parseSimpleTrigger(triggers.asScalar().value()));
		} else if (triggers.type().equals(Node.SEQUENCE) ||
			(triggers.type().equals(Node.SCALAR) && triggers.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")))
		{
			if (triggers.type().equals(Node.SCALAR) && triggers.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_]+\\s*(,\\s*[a-zA-Z0-9_]+\\s*)]*$")) {
				List<String> triggerStrings = new ArrayList<>(Arrays.asList(triggers.asScalar().value().substring(1, triggers.asScalar().value().length() - 1).split(",")));
				for (String trigger : triggerStrings) {
					result.add(parseSimpleTrigger(trigger.trim()));
				}
			}
			else {
				Collection<YamlNode> triggerList = triggers.asSequence().values();
				for (YamlNode trigger : triggerList) {
					if (trigger.type().equals(Node.SCALAR)) {
						result.add(parseSimpleTrigger(trigger.asScalar().value()));
					} else {
						parseTriggerMap(result, trigger);
					}
				}
			}
		} else parseTriggerMap(result, triggers);
		return result;
	}

	private void parseTriggerMap(List<Trigger> result, YamlNode trigger) throws SyntaxException {
		if (trigger.type().equals(Node.MAPPING)) {
			YamlMapping triggerMap = trigger.asMapping();
			for (YamlNode key : triggerMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.add(parseOptionedTrigger(key.asScalar().value(), triggerMap.value(key.asScalar().value())));
				} else {
					throw new SyntaxException("Invalid trigger");
				}
			}
		} else {
			throw new SyntaxException("Invalid trigger");
		}
	}

	private List<WEBHOOK_ACTIVITY_TYPES> parseEventTypes(YamlNode types) throws SyntaxException {
		if (types.type().equals(Node.SCALAR)  && !types.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
			return List.of(WEBHOOK_ACTIVITY_TYPES.get(types.asScalar().value()));
		} else if (types.type().equals(Node.SEQUENCE)  ||
				(types.type().equals(Node.SCALAR) && types.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$"))) {
			if (types.type().equals(Node.SCALAR) && types.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
				List<String> typeStrings = new ArrayList<>(Arrays.asList(types.asScalar().value().substring(1, types.asScalar().value().length() - 1).split(",")));
				List<WEBHOOK_ACTIVITY_TYPES> result = new ArrayList<>();
				for (String type : typeStrings) {
					result.add(WEBHOOK_ACTIVITY_TYPES.get(type.trim()));
				}
				return result;
			}
			else {
				List<WEBHOOK_ACTIVITY_TYPES> result = new ArrayList<>();
				for (YamlNode type : types.asSequence().values()) {
					result.add(WEBHOOK_ACTIVITY_TYPES.get(type.asScalar().value()));
				}
				return result;
			}
		} else {
			throw new SyntaxException("Invalid event type");
		}
	}

	private Trigger parseSimpleTrigger(String trigger) throws SyntaxException {
		Trigger triggerObject;
		switch (trigger) {
			case "push" -> triggerObject = GHAPackage.eINSTANCE.getGHAFactory().createPushTrigger();
			case "pull_request" -> triggerObject = GHAPackage.eINSTANCE.getGHAFactory().createPullRequestTrigger();
			case "pull_request_target" -> triggerObject = GHAPackage.eINSTANCE.getGHAFactory().createPullRequestTargetTrigger();
			case "workflow_dispatch" -> triggerObject = GHAPackage.eINSTANCE.getGHAFactory().createWorkflowDispatchTrigger();
			case "workflow_call" -> triggerObject = GHAPackage.eINSTANCE.getGHAFactory().createWorkflowCallTrigger();
			case "schedule" -> triggerObject = GHAPackage.eINSTANCE.getGHAFactory().createScheduleTrigger();
			default -> {
				StandardEventTrigger standardEventTrigger = GHAPackage.eINSTANCE.getGHAFactory().createStandardEventTrigger();
				standardEventTrigger.setEvent(EVENTS.get(trigger));
				triggerObject = standardEventTrigger;
			}
		}
		return triggerObject;
	}

	private Trigger parseOptionedTrigger(String event, YamlNode options) throws SyntaxException {
		Trigger trigger = parseSimpleTrigger(event);

		if (options == null) {
			System.out.println(event);
			return trigger;
		}

		if (trigger instanceof EventTypeTrigger eventTypeTrigger) {
			if (options.asMapping().value("types") != null) {
				eventTypeTrigger.getEventTypes().addAll(parseEventTypes(options.asMapping().value("types")));
			}
		}

		if (trigger instanceof SpecifiedBranchesTrigger specifiedBranchesTrigger) {
			if (options.asMapping().value("branches") != null) {
				specifiedBranchesTrigger.getBranches().addAll(parseExpressions(options.asMapping().value("branches")));
			} else if (options.asMapping().value("branches-ignore") != null) {
				specifiedBranchesTrigger.getBranches().addAll(parseExpressions(options.asMapping().value("branches-ignore")));
				specifiedBranchesTrigger.setIgnoreSpecifiedBranches(true);
			}
		}

		if (trigger instanceof SpecifiedPathsTrigger specifiedPathsTrigger) {
			if (options.asMapping().value("paths") != null) {
				specifiedPathsTrigger.getPaths().addAll(parseExpressions(options.asMapping().value("paths")));
			} else if (options.asMapping().value("paths-ignore") != null) {
				specifiedPathsTrigger.getPaths().addAll(parseExpressions(options.asMapping().value("paths-ignore")));
				specifiedPathsTrigger.setIgnoreSpecifiedPaths(true);
			}
		}

		if (trigger instanceof PushTrigger pushTrigger) {
			if (options.asMapping().value("tags") != null) {
				pushTrigger.getTags().addAll(parseExpressions(options.asMapping().value("tags")));
			} else if (options.asMapping().value("tags-ignore") != null) {
				pushTrigger.getTags().addAll(parseExpressions(options.asMapping().value("tags-ignore")));
				pushTrigger.setIgnoreSpecifiedTags(true);
			}
		}

		if (trigger instanceof ScheduleTrigger scheduleTrigger) {
			for (YamlNode cron : options.asSequence().values()) {
				scheduleTrigger.getCrons().add(parseExpression(cron.asMapping().value("cron").asScalar().value()));
			}
		}

		if (trigger instanceof InputTrigger inputTrigger) {
			if (options.asMapping().value("inputs") != null) {
				inputTrigger.getInputs().addAll(parseInputs(options.asMapping().value("inputs")));
			}
		}

		if (trigger instanceof WorkflowCallTrigger workflowCallTrigger) {
			if (options.asMapping().value("outputs") != null) {
				workflowCallTrigger.getOutputs().addAll(parseOutputs(options.asMapping().value("outputs")));
			}
			if (options.asMapping().value("secrets") != null) {
				workflowCallTrigger.getSecrets().addAll(parseSecrets(options.asMapping().value("secrets")));
			}
		}

		return trigger;
	}

	private List<Expression> parseExpressions(YamlNode expressionsNode) throws SyntaxException {
		List<Expression> result = new ArrayList<>();
		if (expressionsNode.type().equals(Node.SCALAR)) {
			result.add(parseExpression(expressionsNode.asScalar().value()));
		} else if (expressionsNode.type().equals(Node.SEQUENCE)) {
			Collection<YamlNode> expressions = expressionsNode.asSequence().values();
			for (YamlNode expression : expressions) {
				if (expression.type().equals(Node.SCALAR)) {
					result.add(parseExpression(expression.asScalar().value()));
				} else {
					throw new SyntaxException("Invalid expression");
				}
			}
		} else {
			throw new SyntaxException("Invalid expression");
		}
		return result;
	}

	private List<Input> parseInputs(YamlNode inputsNode) throws SyntaxException {
		List<Input> result = new ArrayList<>();
		if (inputsNode.type().equals(Node.MAPPING)) {
			YamlMapping inputsMap = inputsNode.asMapping();
			for (YamlNode key : inputsMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.add(parseInput(key.asScalar().value(), inputsMap.value(key.asScalar().value()).asMapping()));
				} else {
					throw new SyntaxException("Invalid input");
				}
			}
		} else {
			throw new SyntaxException("Invalid input");
		}
		return result;
	}

	private Input parseInput(String id, YamlMapping inputMap) throws SyntaxException {
		Input input = GHAPackage.eINSTANCE.getGHAFactory().createInput();
		input.setId(id);
		if (inputMap.string("description") != null) {
			input.setDescription(parseExpression(inputMap.string("description")));
		}
		if (inputMap.string("required") != null) {
			input.setIsRequired(parseExpression(inputMap.string("required")));
		}
		if (inputMap.string("default") != null) {
			input.setDefault(parseExpression(inputMap.string("default")));
		}
		if (inputMap.string("type") != null) {
			input.setType(INPUT_TYPES.get(inputMap.string("type")));
		}
		if (inputMap.value("options") != null) {
			input.getOptions().addAll(parseStrings(inputMap.value("options")));
		}
		return input;
	}

	private List<Output> parseOutputs(YamlNode outputsNode) throws SyntaxException {
		List<Output> result = new ArrayList<>();
		if (outputsNode.type().equals(Node.MAPPING)) {
			YamlMapping outputsMap = outputsNode.asMapping();
			for (YamlNode key : outputsMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.add(parseOutput(key.asScalar().value(), outputsMap.value(key.asScalar().value()).asMapping()));
				} else {
					throw new SyntaxException("Invalid output");
				}
			}
		} else {
			throw new SyntaxException("Invalid output");
		}
		return result;
	}

	private Output parseOutput(String id, YamlMapping outputMap) throws SyntaxException {
		Output output = GHAPackage.eINSTANCE.getGHAFactory().createOutput();
		output.setId(id);
		if (outputMap.string("description") != null) {
			output.setDescription(parseExpression(outputMap.string("description")));
		}
		if (outputMap.string("value") != null) {
			output.setValue(parseExpression(outputMap.string("value")));
		}
		return output;
	}

	private List<Secret> parseSecrets(YamlNode secretsNode) throws SyntaxException {
		List<Secret> result = new ArrayList<>();
		if (secretsNode.type().equals(Node.MAPPING)) {
			YamlMapping secretsMap = secretsNode.asMapping();
			for (YamlNode key : secretsMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.add(parseSecret(key.asScalar().value(), secretsMap.value(key.asScalar().value()).asMapping()));
				} else {
					throw new SyntaxException("Invalid secret");
				}
			}
		} else {
			throw new SyntaxException("Invalid secret");
		}
		return result;
	}

	private Secret parseSecret(String id, YamlMapping secretMap) throws SyntaxException {
		Secret secret = GHAPackage.eINSTANCE.getGHAFactory().createSecret();
		secret.setId(id);
		if (secretMap.string("description") != null) {
			secret.setDescription(parseExpression(secretMap.string("description")));
		}
		if (secretMap.string("required") != null) {
			secret.setIsRequired(parseExpression(secretMap.string("required")));
		}
		return secret;
	}

	private List<String> parseStrings(YamlNode stringsNode) throws SyntaxException {
		List<String> result = new ArrayList<>();
		if (stringsNode.type().equals(Node.SCALAR)) {
			result.add(stringsNode.asScalar().value());
		} else if (stringsNode.type().equals(Node.SEQUENCE)) {
			Collection<YamlNode> strings = stringsNode.asSequence().values();
			for (YamlNode string : strings) {
				if (string.type().equals(Node.SCALAR)) {
					result.add(string.asScalar().value());
				} else {
					throw new SyntaxException("Invalid string");
				}
			}
		} else {
			throw new SyntaxException("Invalid string");
		}
		return result;
	}

	private Map<PERMISSION_SCOPES, PERMISSIONS> parsePermissions(YamlMapping permissionsMap) throws SyntaxException {
		Map<PERMISSION_SCOPES, PERMISSIONS> result = new HashMap<>();

		for (YamlNode key : permissionsMap.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				result.put(PERMISSION_SCOPES.get(key.asScalar().value()), PERMISSIONS.get(permissionsMap.string(key.asScalar().value())));
			} else {
				throw new SyntaxException("Invalid permission");
			}
		}

		return result;
	}

	private Map<String, Expression> parseVariableAssignments(YamlMapping variablesMap) throws SyntaxException {
		Map<String, Expression> result = new HashMap<>();

		for (YamlNode key : variablesMap.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				result.put(key.asScalar().value(), parseExpression(variablesMap.string(key.asScalar().value())));
			} else {
				throw new SyntaxException("Invalid variable assignment");
			}
		}

		return result;
	}

	private Defaults parseDefaults(YamlMapping defaultsMap) throws SyntaxException {
		Defaults defaults = GHAPackage.eINSTANCE.getGHAFactory().createDefaults();

		if (defaultsMap.yamlMapping("run") != null) {
			defaultsMap = defaultsMap.yamlMapping("run");
		} else {
			throw new SyntaxException("Must have run");
		}

		if (defaultsMap.string("shell") != null) {
			defaults.setShell(parseExpression(defaultsMap.string("shell")));
		} else {
			throw new SyntaxException("Must have shell");
		}

		if (defaultsMap.string("working-directory") != null) {
			defaults.setWorkingDirectory(parseExpression(defaultsMap.string("working-directory")));
		}

		return defaults;
	}

	private ConcurrencyGroup parseConcurrencyGroup(YamlMapping concurrencyGroupMap) throws SyntaxException {
		ConcurrencyGroup concurrencyGroup = GHAPackage.eINSTANCE.getGHAFactory().createConcurrencyGroup();

		if (concurrencyGroupMap.string("group") != null) {
			concurrencyGroup.setName(parseExpression(concurrencyGroupMap.string("group")));
		} else {
			throw new SyntaxException("Must have name");
		}

		if (concurrencyGroupMap.string("cancel-in-progress") != null) {
			concurrencyGroup.setCancelInProgress(parseExpression(concurrencyGroupMap.string("cancel-in-progress")));
		}

		return concurrencyGroup;
	}

	private List<Job> parseJobs(YamlNode jobsNode) throws SyntaxException {
		Map<String, Job> result = new HashMap<>();
		if (jobsNode.type().equals(Node.MAPPING)) {
			YamlMapping jobsMap = jobsNode.asMapping();
			for (YamlNode key : jobsMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.put(
							key.asScalar().value(), 
							parseJob(
									key.asScalar().value(), 
									jobsMap.value(key.asScalar().value()).asMapping(), 
									result
							)
					);
				} else {
					throw new SyntaxException("Invalid job");
				}
			}
		} else {
			throw new SyntaxException("Invalid job");
		}
		return new ArrayList<>(result.values());
	}

	private Job parseJob(String id, YamlMapping jobMap, Map<String, Job> jobs) throws SyntaxException {
		Job job;

		if (jobMap.value("steps") != null) {
			job = GHAPackage.eINSTANCE.getGHAFactory().createScriptJob();
			((ScriptJob) job).getSteps().addAll(parseSteps(jobMap.value("steps")));
		} else if (jobMap.value("uses") != null) {
			job = GHAPackage.eINSTANCE.getGHAFactory().createWorkflowCallJob();
			((WorkflowCallJob) job).setUses(parseExpression(jobMap.string("uses")));
			if (jobMap.value("with") != null) {
				((WorkflowCallJob) job).getArgs().putAll(parseVariableAssignments(jobMap.value("with").asMapping()));
			}
			if (jobMap.value("secrets") != null) {
				if (jobMap.value("secrets").type().equals(Node.SCALAR) && jobMap.string("secrets").equals("inherit")) {
					((WorkflowCallJob) job).setInheritSecrets(true);
				} else if (jobMap.value("secrets").type().equals(Node.MAPPING)) {
					((WorkflowCallJob) job).getSecrets().putAll(parseVariableAssignments(jobMap.value("secrets").asMapping()));
				} else {
					throw new SyntaxException("Invalid secrets");
				}
			}
		} else {
			throw new SyntaxException("Must have steps");
		}

		job.setName(id);

		if (jobMap.string("name") != null) {
			job.setJobName(parseExpression(jobMap.string("name")));
		}

		if (jobMap.value("runs-on") != null) {
			job.setAgent(parseAgent(jobMap.value("runs-on")));
		}

		if (jobMap.value("environment") != null) {
			job.setStagingEnvironment(parseStagingEnvironment(jobMap.value("environment")));
		}

		if (jobMap.value("concurrency") != null) {
			job.setConcurrencyGroup(parseConcurrencyGroup(jobMap.yamlMapping("concurrency")));
		}

		if (jobMap.value("env") != null) {
			job.getEnvironmentVariables().putAll(parseVariableAssignments(jobMap.value("env").asMapping()));
		}

		if (jobMap.value("defaults") != null) {
			job.setDefaults(parseDefaults(jobMap.value("defaults").asMapping()));
		}

		if (jobMap.value("permissions") != null) {
			job.getPermissions().putAll(parsePermissions(jobMap.value("permissions").asMapping()));
		}

		if (jobMap.value("if") != null) {
			job.setIfCondition(parseExpression(jobMap.string("if")));
		}

		if (jobMap.value("strategy") != null) {
			job.setStrategy(parseMatrix(jobMap.yamlMapping("strategy")));
		}

		if (jobMap.value("container") != null) {
			job.setContainer(parseContainer(jobMap.value("container")));
		}

		if (jobMap.value("services") != null) {
			job.getServices().putAll(parseServices(jobMap.value("services")));
		}

		if (jobMap.value("timeout-minutes") != null) {
			job.setTimeoutMinutes(parseExpression(jobMap.string("timeout-minutes")));
		}

		if (jobMap.value("continue-on-error") != null) {
			job.setContinueOnError(parseExpression(jobMap.string("continue-on-error")));
		}

		if (jobMap.value("needs") != null) {
			job.getDependsOn().addAll(parseDependencies(jobMap.value("needs"), jobs));
		}

		return job;
	}

	private Agent parseAgent(YamlNode agentNode) throws SyntaxException {
		Agent agent = GHAPackage.eINSTANCE.getGHAFactory().createAgent();

		if (!agentNode.type().equals(Node.MAPPING)) {
			agent.getLabels().addAll(parseExpressions(agentNode));
		} else {
			YamlMapping agentMap = agentNode.asMapping();
			if (agentMap.string("group") != null) {
				agent.setGroup(parseExpression(agentMap.string("group")));
			}
			if (agentMap.value("labels") != null) {
				agent.getLabels().addAll(parseExpressions(agentMap.value("labels")));
			}
		}

		return agent;
	}

	private StagingEnvironment parseStagingEnvironment(YamlNode environmentNode) throws SyntaxException {
		StagingEnvironment environment = GHAPackage.eINSTANCE.getGHAFactory().createStagingEnvironment();
		if (environmentNode.type().equals(Node.MAPPING)) {
			YamlMapping environmentMap = environmentNode.asMapping();
			if (environmentMap.string("name") != null) {
				environment.setName(parseExpression(environmentMap.string("name")));
			}
			if (environmentMap.string("url") != null) {
				environment.setUrl(parseExpression(environmentMap.string("url")));
			}
		} else if (environmentNode.type().equals(Node.SCALAR)) {
			environment.setName(parseExpression(environmentNode.asScalar().value()));
		} else {
			throw new SyntaxException("Invalid environment");
		}
		return environment;
	}

	private Matrix parseMatrix(YamlMapping matrixNode) throws SyntaxException {
		Matrix matrix = GHAPackage.eINSTANCE.getGHAFactory().createMatrix();
		if (matrixNode.asMapping().value("matrix") != null) {
			YamlMapping matrixMap = matrixNode.asMapping().value("matrix").asMapping();
			if (matrixMap.value("include") != null) {
				matrix.getIncludes().addAll(parseMatrixCombinations(matrixMap.value("include")));
			}
			if (matrixMap.value("exclude") != null) {
				matrix.getExcludes().addAll(parseMatrixCombinations(matrixMap.value("exclude")));
			}
			for (YamlNode key : matrixMap.keys()) {
				if (!key.asScalar().value().equals("include") && !key.asScalar().value().equals("exclude")) {
					matrix.getAxes().add(parseMatrixAxis(key.asScalar().value(), matrixMap.value(key.asScalar().value())));
				}
			}
		} else {
			throw new SyntaxException("Invalid matrix");
		}

		if (matrixNode.string("fail-fast") != null) {
			matrix.setFailFast(parseExpression(matrixNode.string("fail-fast")));
		}

		if (matrixNode.string("max-parallel") != null) {
			matrix.setMaxParallel(parseExpression(matrixNode.string("max-parallel")));
		}

		return matrix;
	}

	private List<MatrixCombination> parseMatrixCombinations(YamlNode combinationNode) throws SyntaxException {
		List<MatrixCombination> combinations = new ArrayList<>();
		if (combinationNode.type().equals(Node.SEQUENCE)) {
			for (YamlNode yamlCombination : combinationNode.asSequence().values()) {
				MatrixCombination combination = GHAPackage.eINSTANCE.getGHAFactory().createMatrixCombination();
				if (yamlCombination.type().equals(Node.MAPPING)) {
					combination.getEntries().putAll(parseVariableAssignments(yamlCombination.asMapping()));
					combinations.add(combination);
				} else {
					throw new SyntaxException("Invalid matrix combination");
				}
			}

		} else {
			throw new SyntaxException("Invalid matrix combination");
		}
		return combinations;
	}

	private MatrixAxis parseMatrixAxis(String key, YamlNode axisNode) throws SyntaxException {
		MatrixAxis axis = GHAPackage.eINSTANCE.getGHAFactory().createMatrixAxis();
		axis.setName(key);
		if (axisNode.type().equals(Node.SEQUENCE)) {
			axis.getCells().addAll(parseExpressions(axisNode));
		} else if (axisNode.type().equals(Node.SCALAR) && axisNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
			List<String> cells = new ArrayList<>(Arrays.asList(axisNode.asScalar().value().substring(1, axisNode.asScalar().value().length() - 1).split(",")));
			axis.getCells().addAll(parseExpressions(cells));
		} else {
			throw new SyntaxException("Invalid matrix axis");
		}
		return axis;
	}

	private Container parseContainer(YamlNode containerNode) throws SyntaxException {
		Container container = GHAPackage.eINSTANCE.getGHAFactory().createContainer();
		if (containerNode.type().equals(Node.SCALAR)) {
			container.setImage(parseExpression(containerNode.asScalar().value()));
		} else if (containerNode.type().equals(Node.MAPPING)) {
			YamlMapping containerMap = containerNode.asMapping();
			if (containerMap.string("image") != null) {
				container.setImage(parseExpression(containerMap.string("image")));
			}
			if (containerMap.string("options") != null) {
				container.setOptions(parseExpression(containerMap.string("options")));
			}
			if (containerMap.value("env") != null) {
				container.getEnvironmentVariables().putAll(parseVariableAssignments(containerMap.value("env").asMapping()));
			}
			if (containerMap.value("ports") != null) {
				container.getPorts().addAll(parseExpressions(containerMap.value("ports")));
			}
			if (containerMap.value("volumes") != null) {
				container.getVolumes().addAll(parseExpressions(containerMap.value("volumes")));
			}
			if (containerMap.yamlMapping("credentials") != null) {
				container.setUsername(parseExpression(containerMap.yamlMapping("credentials").string("username")));
				container.setPassword(parseExpression(containerMap.yamlMapping("credentials").string("password")));
			}
		}

		return container;
	}

	private Map<String, Container> parseServices(YamlNode servicesNode) throws SyntaxException {
		Map<String, Container> result = new HashMap<>();
		if (servicesNode.type().equals(Node.MAPPING)) {
			YamlMapping servicesMap = servicesNode.asMapping();
			for (YamlNode key : servicesMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.put(key.asScalar().value(), parseContainer(servicesMap.value(key.asScalar().value())));
				} else {
					throw new SyntaxException("Invalid service");
				}
			}
		} else {
			throw new SyntaxException("Invalid service");
		}
		return result;
	}

	private List<Job> parseDependencies(YamlNode dependenciesNode, Map<String, Job> jobs) throws SyntaxException {
		List<Job> result = new ArrayList<>();
		if (dependenciesNode.type().equals(Node.SCALAR) && !dependenciesNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
			if (jobs.containsKey(dependenciesNode.asScalar().value())) {
				result.add(jobs.get(dependenciesNode.asScalar().value()));
			} else {
				throw new SyntaxException("Invalid dependency");
			}
		} else if (dependenciesNode.type().equals(Node.SEQUENCE)  ||
				(dependenciesNode.type().equals(Node.SCALAR) && dependenciesNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$"))
		) {
			if (dependenciesNode.type().equals(Node.SCALAR) && dependenciesNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
				List<String> jobStrings = new ArrayList<>(Arrays.asList(dependenciesNode.asScalar().value().substring(1, dependenciesNode.asScalar().value().length() - 1).split(",")));
				for (String job : jobStrings) {
					if (jobs.containsKey(job.trim())) {
						result.add(jobs.get(job.trim()));
					} else {
						throw new SyntaxException("Invalid dependency");
					}
				}
			}
			else {
				Collection<YamlNode> dependencies = dependenciesNode.asSequence().values();
				for (YamlNode dependency : dependencies) {
					if (dependency.type().equals(Node.SCALAR)) {
						if (jobs.containsKey(dependency.asScalar().value())) {
							result.add(jobs.get(dependency.asScalar().value()));
						} else {
							throw new SyntaxException("Invalid dependency");
						}
					} else {
						throw new SyntaxException("Invalid dependency");
					}
				}
			}
		} else {
			System.out.println(dependenciesNode.type());
			throw new SyntaxException("Invalid dependency");
		}
		return result;
	}

	private List<AbstractStep> parseSteps(YamlNode stepsNode) throws SyntaxException {
		List<AbstractStep> result = new ArrayList<>();
		if (stepsNode.type().equals(Node.SEQUENCE)) {
			Collection<YamlNode> steps = stepsNode.asSequence().values();
			for (YamlNode step : steps) {
				if (step.type().equals(Node.MAPPING)) {
					result.add(parseAbstractStep(step.asMapping()));
				} else {
					throw new SyntaxException("Invalid step");
				}
			}
		} else {
			throw new SyntaxException("Invalid step");
		}
		return result;
	}

	private AbstractStep parseAbstractStep(YamlMapping stepMap) throws SyntaxException {
		AbstractStep step;


		if (stepMap.value("if") != null) {
			step = GHAPackage.eINSTANCE.getGHAFactory().createIfStep();
			((IfStep) step).setIfCondition(parseExpression(stepMap.string("if")));
			((IfStep) step).setThenRun(parseStep(stepMap));
		} else {
			step = parseStep(stepMap);
		}

		return step;
	}

	private Step parseStep(YamlMapping stepMap) throws SyntaxException {
		Step step;
		if (stepMap.string("run") != null) {
			step = GHAPackage.eINSTANCE.getGHAFactory().createCommand();

			((Command) step).setCommand(parseExpression(stepMap.string("run")));
		} else if (stepMap.string("uses") != null) {
			step = GHAPackage.eINSTANCE.getGHAFactory().createPackage();

			((Package) step).setUses(parseExpression(stepMap.string("uses")));

			if (stepMap.yamlMapping("with") != null) {
				YamlMapping withMap = stepMap.yamlMapping("with");

				if (withMap.value("entrypoint") != null) {
					((Package) step).setEntrypoint(parseExpression(withMap.string("entrypoint")));

					if (withMap.value("args") != null) {
						((Package) step).setContainerArgs(parseExpression(withMap.string("args")));
					}
				}
				else {
					for (YamlNode key : withMap.keys()) {
						if (key.type().equals(Node.SCALAR)) {
							((Package) step).getArgs().put(key.asScalar().value(), parseExpression(withMap.string(key.asScalar().value())));
						} else {
							throw new SyntaxException("Invalid argument");
						}
					}
				}
			}
		} else {
			throw new SyntaxException("Must have run, uses or shell");
		}

		if (stepMap.string("id") != null) {
			step.setId(stepMap.string("id"));
		}
		if (stepMap.string("name") != null) {
			step.setName(parseExpression(stepMap.string("name")));
		}
		if (stepMap.string("shell") != null) {
			step.setShell(parseExpression(stepMap.string("shell")));
		}
		if (stepMap.value("env") != null) {
			step.getEnvironmentVariables().putAll(parseVariableAssignments(stepMap.value("env").asMapping()));
		}
		if (stepMap.value("timeout-minutes") != null) {
			step.setTimeoutMinutes(parseExpression(stepMap.string("timeout-minutes")));
		}
		if (stepMap.value("continue-on-error") != null) {
			step.setContinueOnError(parseExpression(stepMap.string("continue-on-error")));
		}
		if (stepMap.value("working-directory") != null) {
			step.setWorkingDirectory(parseExpression(stepMap.string("working-directory")));
		}
		return step;
	}
}
