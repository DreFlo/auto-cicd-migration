package cli.parsers.GitHubActionsParser;

import cli.parsers.AbstractParser;
import cli.parsers.exceptions.SyntaxException;
import com.amihaiemil.eoyaml.*;
import com.google.inject.Injector;

import d.fe.up.pt.cicd.gha.dsl.GitHubActionsStandaloneSetup;
import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Package;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import java.io.IOException;
import java.util.*;

public class GitHubActionsParser extends AbstractParser<Workflow> {
	private Workflow workflow;

	private final ExpressionsParser expressionsParser;

	public GitHubActionsParser() {
		super();
		expressionsParser = new ExpressionsParser(this);
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
		workflow = GHAPackage.eINSTANCE.getGHAFactory().createWorkflow();

		initVariables(workflow, yamlMap);

		if (yamlMap.string("name") != null) {
			workflow.setName(parseExpression(yamlMap.string("name"), workflow));
		}

		if (yamlMap.string("run-name") != null) {
			workflow.setRunName(parseExpression(yamlMap.string("run-name"), workflow));
		}

		if (yamlMap.value("on") == null) {
			throw new SyntaxException(List.of("Must have triggers"));
		} else {
			parseWorkflowTriggers(yamlMap.value("on"));
		}

		if (yamlMap.value("permissions") != null) {
			workflow.getPermissions().putAll(parsePermissions(yamlMap.value("permissions").asMapping()));
		}

		if (yamlMap.value("env") != null) {
			parseVariableAssignments(workflow, workflow.getEnvironmentVariables(), yamlMap.value("env").asMapping());
		}

		if (yamlMap.value("defaults") != null) {
			Defaults defaults = GHAPackage.eINSTANCE.getGHAFactory().createDefaults();
			workflow.setDefaults(defaults);
			parseDefaults(defaults, yamlMap.value("defaults").asMapping());
		}

		if (yamlMap.value("concurrency") != null) {
			ConcurrencyGroup concurrencyGroup = GHAPackage.eINSTANCE.getGHAFactory().createConcurrencyGroup();
			workflow.setConcurrencyGroup(concurrencyGroup);
			parseConcurrencyGroup(concurrencyGroup, yamlMap.value("concurrency").asMapping());
		}

		if (yamlMap.value("jobs") != null) {
			parseJobs(yamlMap.value("jobs"));
		} else {
			throw new SyntaxException("Must have jobs");
		}

		return workflow;
	}

	private void initVariables(Workflow workflow, YamlMapping yamlMap) throws SyntaxException {
		if (yamlMap.value("on") != null) {
			workflow.getTriggers().addAll(initWorkflowTriggers(yamlMap.value("on")));
		}

		if (yamlMap.value("env") != null) {
			Map<VariableDeclaration, Expression> environmentVariables = initVariableAssignments(yamlMap.value("env").asMapping());
			workflow.getEnvironmentVariables().putAll(environmentVariables);
		}

		if (yamlMap.yamlMapping("jobs") != null) {
			for (YamlNode jobKey : yamlMap.yamlMapping("jobs").keys()) {
				if (jobKey.type().equals(Node.SCALAR)) {
					YamlNode jobNode = yamlMap.yamlMapping("jobs").value(jobKey.asScalar().value());
					if (jobNode.type().equals(Node.MAPPING)) {
						Job job;
						YamlMapping jobMap = jobNode.asMapping();
						if (jobMap.value("steps") != null) {
							job = GHAPackage.eINSTANCE.getGHAFactory().createScriptJob();
						} else if (jobMap.value("uses") != null) {
							job = GHAPackage.eINSTANCE.getGHAFactory().createWorkflowCallJob();
						} else {
							throw new SyntaxException("Invalid job");
						}

						job.setName(jobKey.asScalar().value());

						workflow.getJobs().add(job);
						initVariables(job, jobMap);
					}
				}
			}
		}
	}

	private void initVariables(Job job, YamlMapping yamlMapping) throws SyntaxException {
		if (yamlMapping.yamlMapping("env") != null) {
			Map<VariableDeclaration, Expression> environmentVariables = initVariableAssignments(yamlMapping.yamlMapping("env"));
			job.getEnvironmentVariables().putAll(environmentVariables);
		}

		if (yamlMapping.yamlMapping("outputs") != null) {
			List<Output> outputs = initOutputs(yamlMapping.yamlMapping("outputs"));
			job.getOutputs().addAll(outputs);
		}

		if (yamlMapping.yamlSequence("steps") != null) {
			YamlSequence stepSequence = yamlMapping.yamlSequence("steps");
			ScriptJob scriptJob = (ScriptJob) job;

			for (YamlNode stepNode : stepSequence) {
				if (stepNode.type().equals(Node.MAPPING)) {
					YamlMapping stepMap = stepNode.asMapping();

					AbstractStep abstractStep = null;
					Step step;

					if (stepMap.string("if") != null) {
						abstractStep = GHAPackage.eINSTANCE.getGHAFactory().createIfStep();
					}

					if (stepMap.string("run") != null) {
						step = GHAPackage.eINSTANCE.getGHAFactory().createCommand();
					} else if (stepMap.string("uses") != null) {
						step = GHAPackage.eINSTANCE.getGHAFactory().createPackage();
					} else {
						throw new SyntaxException("Invalid step");
					}

					initVariables(step, stepMap);

					if (abstractStep == null) {
						abstractStep = step;
					} else {
						((IfStep) abstractStep).setThenRun(step);
					}


					scriptJob.getSteps().add(abstractStep);
				}
			}
		}

		if (yamlMapping.yamlMapping("strategy") != null) {
			YamlMapping strategyMap = yamlMapping.yamlMapping("strategy");
			if (strategyMap.yamlMapping("matrix") != null) {
				Matrix matrix = GHAPackage.eINSTANCE.getGHAFactory().createMatrix();
				job.setStrategy(matrix);
				initMatrix(matrix, strategyMap.yamlMapping("matrix"));
			}
		}
	}

	private void initMatrix(Matrix matrix, YamlMapping yamlMapping) {
		for (YamlNode key : yamlMapping.keys()) {
			if (!key.asScalar().value().equals("include") && !key.asScalar().value().equals("exclude")) {
				MatrixAxis axis = GHAPackage.eINSTANCE.getGHAFactory().createMatrixAxis();
				matrix.getAxes().add(axis);
				axis.setName(createVariableDeclaration(key.asScalar().value()));
			}
		}
	}

	private void initVariables(Step step, YamlMapping yamlMapping) throws SyntaxException {
		if (yamlMapping.yamlMapping("env") != null) {
			Map<VariableDeclaration, Expression> environmentVariables = initVariableAssignments(yamlMapping.yamlMapping("env"));
			step.getEnvironmentVariables().putAll(environmentVariables);
		}
	}

	private Map<VariableDeclaration, Expression> initVariableAssignments(YamlMapping variablesMap) throws SyntaxException {
		Map<VariableDeclaration, Expression> result = new HashMap<>();

		for (YamlNode key : variablesMap.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				result.put(createVariableDeclaration(key.asScalar().value()), null);
			} else {
				throw new SyntaxException("Invalid variable assignment");
			}
		}

		return result;
	}

	private List<Trigger> initWorkflowTriggers(YamlNode yamlNode) throws SyntaxException {
		List<Trigger> result = new ArrayList<>();
		if (
			yamlNode.type().equals(Node.SCALAR) &&
			!yamlNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")
		) {
			result.add(initSimpleTrigger(yamlNode.asScalar().value()));
		} else if (
			yamlNode.type().equals(Node.SEQUENCE) ||
			(
				yamlNode.type().equals(Node.SCALAR) &&
				yamlNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")
			)
		) {
			if (
				yamlNode.type().equals(Node.SCALAR) &&
				yamlNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_]+\\s*(,\\s*[a-zA-Z0-9_]+\\s*)]*$")
			) {
				List<String> triggerStrings = new ArrayList<>(Arrays.asList(yamlNode.asScalar().value().substring(1, yamlNode.asScalar().value().length() - 1).split(",")));
				for (String trigger : triggerStrings) {
					result.add(initSimpleTrigger(trigger.trim()));
				}
			}
			else {
				Collection<YamlNode> triggerList = yamlNode.asSequence().values();
				for (YamlNode trigger : triggerList) {
					if (trigger.type().equals(Node.SCALAR)) {
						result.add(initSimpleTrigger(trigger.asScalar().value()));
					} else {
						initTriggerMap(result, trigger);
					}
				}
			}
		} else {
			initTriggerMap(result, yamlNode);
		}
		return result;
	}

	private void initTriggerMap(List<Trigger> result, YamlNode trigger) throws SyntaxException {
		if (trigger.type().equals(Node.MAPPING)) {
			YamlMapping triggerMap = trigger.asMapping();
			for (YamlNode key : triggerMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					result.add(initOptionedTrigger(key.asScalar().value(), triggerMap.value(key)));
				} else {
					throw new SyntaxException("Invalid trigger");
				}
			}
		} else {
			throw new SyntaxException("Invalid trigger");
		}
	}

	private Trigger initOptionedTrigger(String event, YamlNode options) throws SyntaxException {
		Trigger trigger = initSimpleTrigger(event);

		if (options == null) {
			return trigger;
		}

		if (trigger instanceof InputTrigger inputTrigger) {
			if (options.asMapping().yamlMapping("inputs") != null) {
				List<Input> inputs = initInputs(options.asMapping().yamlMapping("inputs"));
				inputTrigger.getInputs().addAll(inputs);
			}
		}

		if (trigger instanceof WorkflowCallTrigger workflowCallTrigger) {
			if (options.asMapping().yamlMapping("outputs") != null) {
				List<Output> outputs = initOutputs(options.asMapping().yamlMapping("outputs"));
				workflowCallTrigger.getOutputs().addAll(outputs);
			}
			if (options.asMapping().yamlMapping("secrets") != null) {
				List<Secret> secrets = initSecrets(options.asMapping().yamlMapping("secrets"));
				workflowCallTrigger.getSecrets().addAll(secrets);
			}
		}

		return trigger;
	}

	private List<Input> initInputs(YamlMapping yamlMapping) {
		List<Input> result = new ArrayList<>();
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				Input input = GHAPackage.eINSTANCE.getGHAFactory().createInput();
				input.setId(createVariableDeclaration(key.asScalar().value()));
				result.add(input);
			}
		}
		return result;
	}

	private List<Output> initOutputs(YamlMapping yamlMapping) {
		List<Output> result = new ArrayList<>();
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				Output output = GHAPackage.eINSTANCE.getGHAFactory().createOutput();
				output.setId(createVariableDeclaration(key.asScalar().value()));
				result.add(output);
			}
		}
		return result;
	}

	private List<Secret> initSecrets(YamlMapping yamlMapping) {
		List<Secret> result = new ArrayList<>();
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				Secret secret = GHAPackage.eINSTANCE.getGHAFactory().createSecret();
				secret.setId(createVariableDeclaration(key.asScalar().value()));
				result.add(secret);
			}
		}
		return result;
	}

	private Expression parseExpression(String expressionString, EObject container) throws SyntaxException {
		return expressionsParser.parse(expressionString, container);
	}

	private List<Expression> parseExpressions(List<String> expressions, EObject container) throws SyntaxException {
		List<Expression> result = new ArrayList<>();
		for (String expression : expressions) {
			result.add(parseExpression(expression, container));
		}
		return result;
	}

	private void parseWorkflowTriggers(YamlNode triggers) throws SyntaxException {
		if (triggers.type().equals(Node.SEQUENCE)) {
			Collection<YamlNode> triggerList = triggers.asSequence().values();
			for (YamlNode trigger : triggerList) {
				if (trigger.type().equals(Node.MAPPING)) {
					parseTriggerMap(trigger.asMapping());
				}
			}
		} else if (triggers.type().equals(Node.SEQUENCE))
			parseTriggerMap(triggers.asMapping());
	}

	private void parseTriggerMap(YamlMapping trigger) throws SyntaxException {
		YamlMapping triggerMap = trigger.asMapping();
		for (YamlNode key : triggerMap.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				parseOptionedTrigger(getTrigger(key.asScalar().value()), triggerMap.yamlMapping(key));
			} else {
				throw new SyntaxException("Invalid trigger");
			}
		}
	}

	private Trigger getTrigger(String trigger) throws SyntaxException {
		Optional<Trigger> triggerObject;
		switch (trigger) {
			case "push" -> triggerObject = workflow.getTriggers().stream().filter(PushTrigger.class::isInstance).findFirst();
			case "pull_request" -> triggerObject = workflow.getTriggers().stream().filter(PullRequestTrigger.class::isInstance).findFirst();
			case "pull_request_target" -> triggerObject = workflow.getTriggers().stream().filter(PullRequestTargetTrigger.class::isInstance).findFirst();
			case "workflow_dispatch" -> triggerObject = workflow.getTriggers().stream().filter(WorkflowDispatchTrigger.class::isInstance).findFirst();
			case "workflow_call" -> triggerObject = workflow.getTriggers().stream().filter(WorkflowCallTrigger.class::isInstance).findFirst();
			case "schedule" -> triggerObject = workflow.getTriggers().stream().filter(ScheduleTrigger.class::isInstance).findFirst();
			default -> {
				triggerObject = workflow.getTriggers().stream().filter(StandardEventTrigger.class::isInstance).filter(t -> ((StandardEventTrigger) t).getEvent().equals(EVENTS.get(trigger))).findFirst();
			}
		}
		if (triggerObject.isEmpty()) {
			throw new SyntaxException("Invalid trigger");
		}
		return triggerObject.get();
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

	private Trigger initSimpleTrigger(String trigger) throws SyntaxException {
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

	private void parseOptionedTrigger(Trigger trigger, YamlMapping options) throws SyntaxException {
		if (options == null) {
			return;
		}

		if (trigger instanceof EventTypeTrigger eventTypeTrigger) {
			if (options.asMapping().value("types") != null) {
				eventTypeTrigger.getEventTypes().addAll(parseEventTypes(options.asMapping().value("types")));
			}
		}

		if (trigger instanceof SpecifiedBranchesTrigger specifiedBranchesTrigger) {
			if (options.asMapping().value("branches") != null) {
				specifiedBranchesTrigger.getBranches().addAll(parseExpressions(options.asMapping().value("branches"), trigger));
			} else if (options.asMapping().value("branches-ignore") != null) {
				specifiedBranchesTrigger.getBranches().addAll(parseExpressions(options.asMapping().value("branches-ignore"), trigger));
				specifiedBranchesTrigger.setIgnoreSpecifiedBranches(true);
			}
		}

		if (trigger instanceof SpecifiedPathsTrigger specifiedPathsTrigger) {
			if (options.asMapping().value("paths") != null) {
				specifiedPathsTrigger.getPaths().addAll(parseExpressions(options.asMapping().value("paths"), trigger));
			} else if (options.asMapping().value("paths-ignore") != null) {
				specifiedPathsTrigger.getPaths().addAll(parseExpressions(options.asMapping().value("paths-ignore"), trigger));
				specifiedPathsTrigger.setIgnoreSpecifiedPaths(true);
			}
		}

		if (trigger instanceof PushTrigger pushTrigger) {
			if (options.asMapping().value("tags") != null) {
				pushTrigger.getTags().addAll(parseExpressions(options.asMapping().value("tags"), trigger));
			} else if (options.asMapping().value("tags-ignore") != null) {
				pushTrigger.getTags().addAll(parseExpressions(options.asMapping().value("tags-ignore"), trigger));
				pushTrigger.setIgnoreSpecifiedTags(true);
			}
		}

		if (trigger instanceof ScheduleTrigger scheduleTrigger) {
			for (YamlNode cron : options.asSequence().values()) {
				scheduleTrigger.getCrons().add(parseExpression(cron.asMapping().value("cron").asScalar().value(), trigger));
			}
		}

		if (trigger instanceof InputTrigger inputTrigger) {
			if (options.yamlMapping("inputs") != null) {
				parseInputs(inputTrigger.getInputs(), options.yamlMapping("inputs"));
			}
		}

		if (trigger instanceof WorkflowCallTrigger workflowCallTrigger) {
			if (options.asMapping().yamlMapping("outputs") != null) {
				parseOutputs(workflowCallTrigger.getOutputs(), options.asMapping().yamlMapping("outputs"));
			}
			if (options.asMapping().yamlMapping("secrets") != null) {
				parseSecrets(workflowCallTrigger.getSecrets(), options.asMapping().yamlMapping("secrets"));
			}
		}
	}

	private List<Expression> parseExpressions(YamlNode expressionsNode, EObject container) throws SyntaxException {
		List<Expression> result = new ArrayList<>();
		if (expressionsNode.type().equals(Node.SCALAR)) {
			result.add(parseExpression(expressionsNode.asScalar().value(), container));
		} else if (expressionsNode.type().equals(Node.SEQUENCE)) {
			Collection<YamlNode> expressions = expressionsNode.asSequence().values();
			for (YamlNode expression : expressions) {
				if (expression.type().equals(Node.SCALAR)) {
					result.add(parseExpression(expression.asScalar().value(), container));
				} else {
					throw new SyntaxException("Invalid expression");
				}
			}
		} else {
			throw new SyntaxException("Invalid expression");
		}
		return result;
	}

	private void parseInputs(List<Input> inputs, YamlMapping yamlMapping) throws SyntaxException {
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				Input input = inputs.stream().filter(i -> i.getId().getName().equals(key.asScalar().value())).findFirst().orElse(null);
				parseInput(input, yamlMapping.value(key.asScalar().value()).asMapping());
			} else {
				throw new SyntaxException("Invalid input");
			}
		}
	}

	private VariableDeclaration createVariableDeclaration(String name) {
		VariableDeclaration variableDeclaration = GHAPackage.eINSTANCE.getGHAFactory().createVariableDeclaration();
		variableDeclaration.setName(name);
		return variableDeclaration;

	}

	private void parseInput(Input input, YamlMapping inputMap) throws SyntaxException {
		if (input == null) {
			throw new SyntaxException("Invalid input");
		}
		if (inputMap.string("description") != null) {
			input.setDescription(parseExpression(inputMap.string("description"), input));
		}
		if (inputMap.string("required") != null) {
			input.setIsRequired(Boolean.parseBoolean(inputMap.string("required")));
		}
		if (inputMap.string("default") != null) {
			input.setDefault(parseExpression(inputMap.string("default"), input));
		}
		if (inputMap.string("type") != null) {
			input.setType(INPUT_TYPES.get(inputMap.string("type")));
		}
		if (inputMap.value("options") != null) {
			input.getOptions().addAll(parseStrings(inputMap.value("options")));
		}
	}

	private void parseOutputs(List<Output> outputs, YamlMapping yamlMapping) throws SyntaxException {
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				Output output = outputs.stream().filter(i -> i.getId().getName().equals(key.asScalar().value())).findFirst().orElse(null);
				parseOutput(output, yamlMapping.value(key.asScalar().value()).asMapping());
			} else {
				throw new SyntaxException("Invalid output");
			}
		}
	}

	private void parseOutput(Output output, YamlMapping outputMap) throws SyntaxException {
		if (output == null) {
			throw new SyntaxException("Invalid output");
		}
		if (outputMap.string("description") != null) {
			output.setDescription(parseExpression(outputMap.string("description"), output));
		}
		if (outputMap.string("value") != null) {
			output.setValue(parseExpression(outputMap.string("value"), output));
		}
	}

	private void parseSecrets(List<Secret> secrets, YamlMapping yamlMapping) throws SyntaxException {
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				Secret secret = secrets.stream().filter(i -> i.getId().getName().equals(key.asScalar().value())).findFirst().orElse(null);
				parseSecret(secret, yamlMapping.value(key.asScalar().value()).asMapping());
			} else {
				throw new SyntaxException("Invalid secret");
			}
		}
	}

	private void parseSecret(Secret secret, YamlMapping secretMap) throws SyntaxException {
		if (secret == null) {
			throw new SyntaxException("Invalid secret");
		}
		if (secretMap.string("description") != null) {
			secret.setDescription(parseExpression(secretMap.string("description"), secret));
		}
		if (secretMap.string("required") != null) {
			secret.setIsRequired(Boolean.parseBoolean(secretMap.string("required")));
		}
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

	private void parseVariableAssignments(EObject container, EMap<VariableDeclaration, Expression> variableAssignments, YamlMapping variablesMap) throws SyntaxException {
		for (YamlNode key : variablesMap.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				VariableDeclaration variableDeclaration = variableAssignments.keySet().stream().filter(v -> v.getName().equals(key.asScalar().value())).findFirst().orElse(null);
				variableAssignments.put(variableDeclaration, parseExpression(variablesMap.string(key.asScalar().value()), container));
			} else {
				throw new SyntaxException("Invalid variable assignment");
			}
		}
	}

	private void parseDefaults(Defaults defaults, YamlMapping defaultsMap) throws SyntaxException {
		if (defaults == null) {
			throw new SyntaxException("Invalid defaults");
		}

		if (defaultsMap.yamlMapping("run") != null) {
			defaultsMap = defaultsMap.yamlMapping("run");
		} else {
			throw new SyntaxException("Must have run");
		}

		if (defaultsMap.string("shell") != null) {
			defaults.setShell(parseExpression(defaultsMap.string("shell"), defaults));
		} else {
			throw new SyntaxException("Must have shell");
		}

		if (defaultsMap.string("working-directory") != null) {
			defaults.setWorkingDirectory(parseExpression(defaultsMap.string("working-directory"), defaults));
		}
	}

	private void parseConcurrencyGroup(ConcurrencyGroup concurrencyGroup, YamlMapping concurrencyGroupMap) throws SyntaxException {
		if (concurrencyGroup == null) {
			throw new SyntaxException("Invalid concurrency group");
		}

		if (concurrencyGroupMap.string("group") != null) {
			concurrencyGroup.setName(parseExpression(concurrencyGroupMap.string("group"), concurrencyGroup));
		} else {
			throw new SyntaxException("Must have name");
		}

		if (concurrencyGroupMap.string("cancel-in-progress") != null) {
			concurrencyGroup.setCancelInProgress(parseExpression(concurrencyGroupMap.string("cancel-in-progress"), concurrencyGroup));
		}
	}

	private void parseJobs(YamlNode jobsNode) throws SyntaxException {
		if (jobsNode.type().equals(Node.MAPPING)) {
			YamlMapping jobsMap = jobsNode.asMapping();
			for (YamlNode key : jobsMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					Job job = workflow.getJobs().stream().filter(j -> j.getName().equals(key.asScalar().value())).findFirst().orElse(null);
					parseJob(job, jobsMap.value(key.asScalar().value()).asMapping());
				} else {
					throw new SyntaxException("Invalid job");
				}
			}
		} else {
			throw new SyntaxException("Invalid job");
		}
	}

	private void parseJob(Job job, YamlMapping jobMap) throws SyntaxException {
		if (job == null) {
			throw new SyntaxException("Invalid job");
		}

		if (jobMap.string("name") != null) {
			job.setJobName(parseExpression(jobMap.string("name"), job));
		}

		if (jobMap.value("runs-on") != null) {
			Agent agent = GHAPackage.eINSTANCE.getGHAFactory().createAgent();
			job.setAgent(agent);
			parseAgent(agent, jobMap.value("runs-on"));
		}

		if (jobMap.value("environment") != null) {
			StagingEnvironment environment = GHAPackage.eINSTANCE.getGHAFactory().createStagingEnvironment();
			job.setStagingEnvironment(environment);
			parseStagingEnvironment(environment, jobMap.value("environment"));
		}

		if (jobMap.value("concurrency") != null) {
			ConcurrencyGroup concurrencyGroup = GHAPackage.eINSTANCE.getGHAFactory().createConcurrencyGroup();
			job.setConcurrencyGroup(concurrencyGroup);
			parseConcurrencyGroup(concurrencyGroup, jobMap.yamlMapping("concurrency"));
		}

		if (jobMap.value("env") != null) {
			parseVariableAssignments(job, job.getEnvironmentVariables(), jobMap.value("env").asMapping());
		}

		if (jobMap.value("defaults") != null) {
			Defaults defaults = GHAPackage.eINSTANCE.getGHAFactory().createDefaults();
			job.setDefaults(defaults);
			parseDefaults(defaults, jobMap.value("defaults").asMapping());
		}

		if (jobMap.value("permissions") != null) {
			job.getPermissions().putAll(parsePermissions(jobMap.value("permissions").asMapping()));
		}

		if (jobMap.value("if") != null) {
			job.setIfCondition(parseExpression(jobMap.string("if"), job));
		}

		if (jobMap.value("strategy") != null) {
			parseMatrix(job.getStrategy(), jobMap.yamlMapping("strategy"));
		}

		if (jobMap.value("container") != null) {
			Container container = GHAPackage.eINSTANCE.getGHAFactory().createContainer();
			job.setContainer(container);
			parseContainer(container, jobMap.value("container"));
		}

		if (jobMap.value("services") != null) {
			parseServices(job.getServices(), jobMap.value("services"));
		}

		if (jobMap.value("timeout-minutes") != null) {
			job.setTimeoutMinutes(parseExpression(jobMap.string("timeout-minutes"), job));
		}

		if (jobMap.value("continue-on-error") != null) {
			job.setContinueOnError(parseExpression(jobMap.string("continue-on-error"), job));
		}

		if (jobMap.value("needs") != null) {
			Map<String, Job> jobs = new HashMap<>();
			for (Job _job : workflow.getJobs()) {
				jobs.put(_job.getName(), _job);
			}
			job.getDependsOn().addAll(parseDependencies(jobMap.value("needs"), jobs));
		}

		if (jobMap.value("steps") != null && job instanceof ScriptJob scriptJob) {
			parseSteps(scriptJob.getSteps(), jobMap.value("steps"));
		} else if (jobMap.value("uses") != null) {
			((WorkflowCallJob) job).setUses(parseExpression(jobMap.string("uses"), job));
			if (jobMap.value("with") != null) {
				((WorkflowCallJob) job).getArgs().putAll(createVariableAssignments(job, jobMap.value("with").asMapping()));
			}
			if (jobMap.value("secrets") != null) {
				if (jobMap.value("secrets").type().equals(Node.SCALAR) && jobMap.string("secrets").equals("inherit")) {
					((WorkflowCallJob) job).setInheritSecrets(true);
				} else if (jobMap.value("secrets").type().equals(Node.MAPPING)) {
					((WorkflowCallJob) job).getSecrets().putAll(createVariableAssignments(job, jobMap.value("secrets").asMapping()));
				} else {
					throw new SyntaxException("Invalid secrets");
				}
			}
		} else {
			throw new SyntaxException("Invalid job");
		}
	}

	private void parseAgent(Agent agent, YamlNode agentNode) throws SyntaxException {
		if (agent == null) {
			throw new SyntaxException("Invalid agent");
		}

		if (!agentNode.type().equals(Node.MAPPING)) {
			agent.getLabels().addAll(parseExpressions(agentNode, agent));
		} else {
			YamlMapping agentMap = agentNode.asMapping();
			if (agentMap.string("group") != null) {
				agent.setGroup(parseExpression(agentMap.string("group"), agent));
			}
			if (agentMap.value("labels") != null) {
				agent.getLabels().addAll(parseExpressions(agentMap.value("labels"), agent));
			}
		}
	}

	private void parseStagingEnvironment(StagingEnvironment environment, YamlNode environmentNode) throws SyntaxException {
		if (environment == null) {
			throw new SyntaxException("Invalid environment");
		}

		if (environmentNode.type().equals(Node.MAPPING)) {
			YamlMapping environmentMap = environmentNode.asMapping();
			if (environmentMap.string("name") != null) {
				environment.setName(parseExpression(environmentMap.string("name"), environment));
			}
			if (environmentMap.string("url") != null) {
				environment.setUrl(parseExpression(environmentMap.string("url"), environment));
			}
		} else if (environmentNode.type().equals(Node.SCALAR)) {
			environment.setName(parseExpression(environmentNode.asScalar().value(), environment));
		} else {
			throw new SyntaxException("Invalid environment");
		}
	}

	private void parseMatrix(Matrix matrix, YamlMapping matrixNode) throws SyntaxException {
		if (matrix == null) {
			throw new SyntaxException("Invalid matrix");
		}

		if (matrixNode.asMapping().value("matrix") != null) {
			YamlMapping matrixMap = matrixNode.asMapping().value("matrix").asMapping();
			if (matrixMap.value("include") != null) {
				parseMatrixCombinations(matrix.getIncludes(), matrixMap.value("include"));
			}
			if (matrixMap.value("exclude") != null) {
				parseMatrixCombinations(matrix.getExcludes(), matrixMap.value("exclude"));
			}
			for (YamlNode key : matrixMap.keys()) {
				if (!key.asScalar().value().equals("include") && !key.asScalar().value().equals("exclude")) {
					MatrixAxis axis = matrix.getAxes().stream().filter(a -> a.getName().getName().equals(key.asScalar().value())).findFirst().orElse(null);
					if (axis != null) {
						parseMatrixAxis(axis, matrixMap.value(key));
					} else {
						throw new SyntaxException("Invalid matrix axis");
					}
				}
			}
		} else {
			throw new SyntaxException("Invalid matrix");
		}

		if (matrixNode.string("fail-fast") != null) {
			matrix.setFailFast(parseExpression(matrixNode.string("fail-fast"), matrix));
		}

		if (matrixNode.string("max-parallel") != null) {
			matrix.setMaxParallel(parseExpression(matrixNode.string("max-parallel"), matrix));
		}
	}

	private void parseMatrixCombinations(List<MatrixCombination> combinations, YamlNode combinationNode) throws SyntaxException {
		if (combinationNode.type().equals(Node.SEQUENCE)) {
			for (YamlNode yamlCombination : combinationNode.asSequence().values()) {
				MatrixCombination combination = GHAPackage.eINSTANCE.getGHAFactory().createMatrixCombination();
				combinations.add(combination);
				if (yamlCombination.type().equals(Node.MAPPING)) {
					combination.getEntries().putAll(createVariableAssignments(combination, yamlCombination.asMapping()));
				} else {
					throw new SyntaxException("Invalid matrix combination");
				}
			}

		} else {
			throw new SyntaxException("Invalid matrix combination");
		}
	}

	private void parseMatrixAxis(MatrixAxis axis, YamlNode axisNode) throws SyntaxException {
		if (axisNode.type().equals(Node.SEQUENCE)) {
			axis.getCells().addAll(parseExpressions(axisNode, axis));
		} else if (axisNode.type().equals(Node.SCALAR) && axisNode.asScalar().value().matches("^\\[\\s*[a-zA-Z0-9_-]+\\s*(,\\s*[a-zA-Z0-9_-]+\\s*)*]$")) {
			List<String> cells = new ArrayList<>(Arrays.asList(axisNode.asScalar().value().substring(1, axisNode.asScalar().value().length() - 1).split(",")));
			axis.getCells().addAll(parseExpressions(cells, axis));
		} else {
			throw new SyntaxException("Invalid matrix axis");
		}
	}

	private void parseContainer(Container container, YamlNode containerNode) throws SyntaxException {
		if (containerNode.type().equals(Node.SCALAR)) {
			container.setImage(parseExpression(containerNode.asScalar().value(), container));
		} else if (containerNode.type().equals(Node.MAPPING)) {
			YamlMapping containerMap = containerNode.asMapping();
			if (containerMap.string("image") != null) {
				container.setImage(parseExpression(containerMap.string("image"), container));
			}
			if (containerMap.string("options") != null) {
				container.setOptions(parseExpression(containerMap.string("options"), container));
			}
			if (containerMap.value("env") != null) {
				container.getEnvironmentVariables().putAll(createVariableAssignments(container, containerMap.value("env").asMapping()));
			}
			if (containerMap.value("ports") != null) {
				container.getPorts().addAll(parseExpressions(containerMap.value("ports"), container));
			}
			if (containerMap.value("volumes") != null) {
				container.getVolumes().addAll(parseExpressions(containerMap.value("volumes"), container));
			}
			if (containerMap.yamlMapping("credentials") != null) {
				container.setUsername(parseExpression(containerMap.yamlMapping("credentials").string("username"), container));
				container.setPassword(parseExpression(containerMap.yamlMapping("credentials").string("password"), container));
			}
		}
	}

	private Map<VariableDeclaration, Expression> createVariableAssignments(EObject container, YamlMapping yamlMapping) throws SyntaxException {
		Map<VariableDeclaration, Expression> result = new HashMap<>();
		for (YamlNode key : yamlMapping.keys()) {
			if (key.type().equals(Node.SCALAR)) {
				VariableDeclaration variableDeclaration = GHAPackage.eINSTANCE.getGHAFactory().createVariableDeclaration();
				variableDeclaration.setName(key.asScalar().value());
				result.put(variableDeclaration, parseExpression(yamlMapping.string(key.asScalar().value()), container));
			} else {
				throw new SyntaxException("Invalid variable assignment");
			}
		}
		return result;
	}

	private void parseServices(EMap<String, Container> containers, YamlNode servicesNode) throws SyntaxException {
		if (servicesNode.type().equals(Node.MAPPING)) {
			YamlMapping servicesMap = servicesNode.asMapping();
			for (YamlNode key : servicesMap.keys()) {
				if (key.type().equals(Node.SCALAR)) {
					Container container = GHAPackage.eINSTANCE.getGHAFactory().createContainer();
					containers.put(key.asScalar().value(), container);
					parseContainer(container, servicesMap.value(key.asScalar().value()));
				} else {
					throw new SyntaxException("Invalid service");
				}
			}
		} else {
			throw new SyntaxException("Invalid service");
		}
	}

	// TODO See lists again
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
			throw new SyntaxException("Invalid dependency");
		}
		return result;
	}

	private void parseSteps(List<AbstractStep> abstractSteps, YamlNode stepsNode) throws SyntaxException {
		if (stepsNode.type().equals(Node.SEQUENCE)) {
			List<YamlNode> steps = (List<YamlNode>) stepsNode.asSequence().values();
			for (YamlNode step : steps) {
				if (step.type().equals(Node.MAPPING)) {
					AbstractStep abstractStep = abstractSteps.get(steps.indexOf(step));
					parseAbstractStep(abstractStep, step.asMapping());
				} else {
					throw new SyntaxException("Invalid step");
				}
			}
		} else {
			throw new SyntaxException("Invalid step");
		}
	}

	private void parseAbstractStep(AbstractStep abstractStep, YamlMapping stepMap) throws SyntaxException {
		if (abstractStep instanceof Step step) {
			parseStep(step, stepMap);
		} else if (abstractStep instanceof IfStep ifStep) {
			parseIfStep(ifStep, stepMap);
		} else {
			throw new SyntaxException("Invalid step");
		}
	}

	private void parseIfStep(IfStep ifStep, YamlMapping stepMap) throws SyntaxException {
		if (ifStep == null) {
			throw new SyntaxException("Invalid step");
		}
		if (stepMap.value("if") != null) {
			ifStep.setIfCondition(parseExpression(stepMap.string("if"), ifStep));
		} else {
			throw new SyntaxException("Must have if");
		}
		parseAbstractStep(ifStep.getThenRun(), stepMap);
	}

	private void parseStep(Step step, YamlMapping stepMap) throws SyntaxException {
		if (step == null) {
			throw new SyntaxException("Invalid step");
		}
		if (stepMap.string("run") != null) {
			((Command) step).setCommand(parseExpression(stepMap.string("run"), step));
		} else if (stepMap.string("uses") != null) {
			((Package) step).setUses(parseExpression(stepMap.string("uses"), step));

			if (stepMap.yamlMapping("with") != null) {
				YamlMapping withMap = stepMap.yamlMapping("with");

				if (withMap.value("entrypoint") != null) {
					((Package) step).setEntrypoint(parseExpression(withMap.string("entrypoint"), step));

					if (withMap.value("args") != null) {
						((Package) step).setContainerArgs(parseExpression(withMap.string("args"), step));
					}
				}
				else {
					for (YamlNode key : withMap.keys()) {
						if (key.type().equals(Node.SCALAR)) {
							VariableDeclaration variableDeclaration = GHAPackage.eINSTANCE.getGHAFactory().createVariableDeclaration();
							variableDeclaration.setName(key.asScalar().value());
							((Package) step).getArgs().put(variableDeclaration, parseExpression(withMap.string(key.asScalar().value()), step));
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
			step.setName(parseExpression(stepMap.string("name"), step));
		}
		if (stepMap.string("shell") != null) {
			step.setShell(parseExpression(stepMap.string("shell"), step));
		}
		if (stepMap.value("env") != null) {
			parseVariableAssignments(step, step.getEnvironmentVariables(), stepMap.value("env").asMapping());
		}
		if (stepMap.value("timeout-minutes") != null) {
			step.setTimeoutMinutes(parseExpression(stepMap.string("timeout-minutes"), step));
		}
		if (stepMap.value("continue-on-error") != null) {
			step.setContinueOnError(parseExpression(stepMap.string("continue-on-error"), step));
		}
		if (stepMap.value("working-directory") != null) {
			step.setWorkingDirectory(parseExpression(stepMap.string("working-directory"), step));
		}
	}

	public Workflow getWorkflow() {
		return workflow;
	}
}
