package cli.parsers;

import cli.parsers.exceptions.SyntaxException;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParser;

import java.io.StringReader;
import java.util.stream.StreamSupport;

abstract public class AbstractXtextParser<T extends EObject> extends AbstractParser<T> {
    @Inject
    protected IParser parser;

    protected abstract Injector getInjector();

    public AbstractXtextParser() {
        Injector injector = getInjector();

        injector.injectMembers(this);
    }

    @Override
    @SuppressWarnings("unchecked")
    public T parse(String pipeline) throws SyntaxException {
        System.out.println(pipeline);
        var result = parser.parse(new StringReader(pipeline));

        if (result.hasSyntaxErrors()) {
            throw new SyntaxException(StreamSupport.stream(result.getSyntaxErrors().spliterator(), false)
                    .map(error -> error.getSyntaxErrorMessage().getMessage()).toList());
        }

        return (T) result.getRootASTElement();
    }
}
