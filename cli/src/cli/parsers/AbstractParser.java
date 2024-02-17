package cli.parsers;

import com.google.inject.Inject;
import com.google.inject.Injector;

import cli.parsers.exceptions.SyntaxException;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.StreamSupport;

import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

public abstract class AbstractParser {
	@Inject
    private IParser parser;
	
	protected abstract Injector getInjector();
	
	public AbstractParser() {
		Injector injector = getInjector();
		
		injector.injectMembers(this);
	}
	
	public void parse(String pipeline) throws SyntaxException {
//		pipeline = formatPipeline(pipeline);
//
//		// Write pipeline to file
//		try {
//			Files.writeString(Path.of("output","pipeline."), pipeline);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		var result = parser.parse(new StringReader(pipeline));

		printAST(result.getRootASTElement());

		if (result.hasSyntaxErrors()) {
            throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
                    .map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
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

	protected abstract String formatPipeline(String pipeline);
}
