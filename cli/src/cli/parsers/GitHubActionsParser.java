package cli.parsers;

import cli.parsers.exceptions.SyntaxException;
import com.google.inject.Injector;

import d.fe.up.pt.cicd.gha.dsl.GitHubActionsStandaloneSetup;
import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.yaml.snakeyaml.Yaml;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.StreamSupport;

public class GitHubActionsParser extends AbstractParser<Workflow> {
	@Override
	protected Injector getInjector() {
		return new GitHubActionsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	protected String formatPipeline(String pipeline) {
		Yaml yaml = new Yaml();
		return yaml.dump(yaml.load(pipeline));
	}

	@Override
	public Workflow parse(String pipeline) throws SyntaxException {
		Yaml yaml = new Yaml();

		Map<String, ?> yamlMap = yaml.loadAs(pipeline, Map.class);

        return parseWorkflow(yamlMap);
	}

	private Workflow parseWorkflow(Map<String, ?> yamlMap) throws SyntaxException {
		Workflow workflow = GHAPackage.eINSTANCE.getGHAFactory().createWorkflow();

		if (yamlMap.containsKey("name")) {
			workflow.setName(parseExpression((String) yamlMap.get("name")));
		}

		if (yamlMap.containsKey("run-name")) {
			workflow.setRunName(parseExpression((String) yamlMap.get("run-name")));
		}

		if (!yamlMap.containsKey("on")) {
			throw new SyntaxException(List.of("Must have triggers"));
		} else {
			workflow.getTriggers().addAll(parseWorkflowTriggers(yamlMap.get("on")));
		}

		printAST(workflow);

		return workflow;
	}

	private Expression parseExpression(String expressionString) throws SyntaxException {
		if (expressionString.startsWith("${{") && expressionString.endsWith("}}")) {
			return parseBracketedExpression(expressionString.substring(3, expressionString.length() - 3));
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

	private Expression parseBracketedExpression(String expressionString) throws SyntaxException {
		IParseResult result = parser.parse(new StringReader(expressionString));

		if (result.hasSyntaxErrors()) {
			throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
					.map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
		}

		return (Expression) result.getRootASTElement();
	}

	private List<Trigger> parseWorkflowTriggers(Object triggers) {
		List<Trigger> result = new ArrayList<>();
		if (triggers instanceof String string) {
			string = string.toLowerCase();
			switch (string) {
				case "push" -> result.add(GHAPackage.eINSTANCE.getGHAFactory().createPushTrigger());
				case "pull_request" -> result.add(GHAPackage.eINSTANCE.getGHAFactory().createPullRequestTrigger()); // Check other pull request trigger
			}
		}
	}

	private void printAST(EObject root) {
		printAST(root, 0);
	}

	private void printAST(EObject root, int depth) {
		if (root instanceof Workflow workflow) {
			printLine("Workflow", depth);

			printLine("Name", depth + 1);
			printAST(workflow.getName(), depth + 2);

			printLine("Run Name", depth + 1);
			printAST(workflow.getRunName(), depth + 2);
		}
		else if (root instanceof BinaryOp binaryOp) {
			printLine("BinaryOp" + binaryOp.getClass(), depth);

			printLine("LHS", depth + 1);
			printAST(binaryOp.getLhs(), depth + 2);

			printLine("RHS", depth + 1);
			printAST(binaryOp.getRhs(), depth + 2);
		}
		else if (root instanceof Concat concat) {
			printLine("Concat", depth);

			for (var expr : concat.getExpressions()) {
				printAST(expr, depth + 1);
			}
		}
		else if (root instanceof VariableDereference variableDereference) {
			printLine("VariableDereference", depth);

			printLine("Variable", depth + 1);
			printAST(variableDereference.getVariable(), depth + 2);

			printLine("Property", depth + 1);
			printLine(variableDereference.getProperty(), depth + 2);
		} else {
			printLine(String.valueOf(root), depth);
		}
	}

	private void printLine(String line, int depth) {
		System.out.println(" ".repeat(depth) + line);
	}
}
