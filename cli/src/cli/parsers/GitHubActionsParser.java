package cli.parsers;

import cli.parsers.exceptions.SyntaxException;
import com.amihaiemil.eoyaml.*;
import com.google.inject.Injector;

import d.fe.up.pt.cicd.gha.dsl.GitHubActionsStandaloneSetup;
import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import org.eclipse.xtext.parser.IParseResult;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.StreamSupport;

import static cli.utils.GHAModelUtils.printAST;

public class GitHubActionsParser extends AbstractParser<Workflow> {
	@Override
	protected Injector getInjector() {
		return new GitHubActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	protected String formatPipeline(String pipeline) {
		return pipeline
				.replaceAll("\n?(\s|\t)*on(\s|\t)*:", "\n\"on\":")
				.replaceAll("\t", "\s\s")
				.replaceAll("-\s*cron\s*:", "- \"cron\":");
	}

	@Override
	public Workflow parse(String pipeline) throws SyntaxException {
        YamlMapping yamlMap = null;
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
			System.out.println(yamlMap.value("on").type());
			workflow.getTriggers().addAll(parseWorkflowTriggers(yamlMap.value("on")));
		}

		printAST(workflow);

		return workflow;
	}

	private Expression parseExpression(String expressionString) throws SyntaxException {
		if (expressionString.startsWith("${{") && expressionString.endsWith("}}")) {
			return parseBracketedExpression(expressionString.substring(3, expressionString.length() - 2));
		} else if (!expressionString.contains("${{")) {
			// TODO Casting
			StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
			stringLiteral.setValue(expressionString);
			return stringLiteral;
		} else {
			Concat concat = GHAPackage.eINSTANCE.getGHAFactory().createConcat();

			for (String subExpression : splitExpression(expressionString)) {
				concat.getExpressions().add(parseExpression(subExpression));
			}

			return concat;
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

		System.out.println(parts);;

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
		System.out.println(expressionString);
		IParseResult result = parser.parse(new StringReader(expressionString));

		if (result.hasSyntaxErrors()) {
			throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
					.map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
		}

		return (Expression) result.getRootASTElement();
	}

	private List<Trigger> parseWorkflowTriggers(YamlNode triggers) throws SyntaxException {
		List<Trigger> result = new ArrayList<>();
		if (triggers.type().equals(Node.SCALAR)) {
			result.add(parseSimpleTrigger(triggers.asScalar().value()));
		} else if (triggers.type().equals(Node.SEQUENCE)) {
			Collection<YamlNode> triggerList = triggers.asSequence().values();
			for (YamlNode trigger : triggerList) {
				if (trigger.type().equals(Node.SCALAR)) {
					result.add(parseSimpleTrigger(trigger.asScalar().value()));
				} else {
					throw new SyntaxException("Invalid trigger");
				}
			}
		} else if (triggers.type().equals(Node.MAPPING)) {
			YamlMapping triggerMap = triggers.asMapping();
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
		return result;
	}

	private List<WEBHOOK_ACTIVITY_TYPES> parseEventTypes(YamlNode types) throws SyntaxException {
		if (types.type().equals(Node.SCALAR)) {
			return List.of(WEBHOOK_ACTIVITY_TYPES.get(types.asScalar().value()));
		} else if (types.type().equals(Node.SEQUENCE)) {
			List<WEBHOOK_ACTIVITY_TYPES> result = new ArrayList<>();
			for (YamlNode type : types.asSequence().values()) {
				result.add(WEBHOOK_ACTIVITY_TYPES.get(type.asScalar().value()));
			}
			return result;
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
			scheduleTrigger.getCrons().addAll(parseExpressions(options));
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
}
