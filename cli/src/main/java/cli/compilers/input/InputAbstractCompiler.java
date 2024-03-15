package cli.compilers.input;

import cli.compilers.AbstractCompiler;
import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public abstract class InputAbstractCompiler<InputModel extends EObject, InputPackage extends EPackage> extends AbstractCompiler<InputModel, InputPackage, Pipeline, CICDPackage, String, Pipeline> {
    private final AbstractParser<InputModel> parser;

    public InputAbstractCompiler(AbstractTransformer<InputModel, InputPackage, Pipeline, CICDPackage> transformer, AbstractParser<InputModel> parser) {
        super(transformer);
        this.parser = parser;
    }

    public AbstractParser<InputModel> getParser() {
        return parser;
    }

    protected InputModel parse(String input) throws Exception {
        return getParser().parse(input);
    }

    @Override
    public Pipeline compile(String string) throws Exception {
        System.out.println("Parsing\t\t(" + getParser().getClass().getName() + ")...");
        InputModel inputModel = parse(string);
        return transform(inputModel);
    }
}
