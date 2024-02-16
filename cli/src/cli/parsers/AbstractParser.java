package cli.parsers;

import com.google.inject.Inject;
import com.google.inject.Injector;

import cli.parsers.exceptions.SyntaxException;

import java.io.StringReader;
import java.util.stream.StreamSupport;

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
		var result = parser.parse(new StringReader(pipeline));
		
		if (result.hasSyntaxErrors()) {
            throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
                    .map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
        }
	}
}
