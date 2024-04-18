package cli.parsers;

import com.google.inject.Inject;
import com.google.inject.Injector;

import cli.parsers.exceptions.SyntaxException;

import java.io.StringReader;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParser;

public abstract class AbstractParser<T extends EObject> {
	
	public AbstractParser() {
	}

	public abstract T parse(String pipeline) throws SyntaxException;



	protected abstract String formatPipeline(String pipeline);
}
