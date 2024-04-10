package cli.engineers.reverseEngineers;

import cli.engineers.AbstractEngineer;
import cli.parsers.AbstractParser;
import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CICD.CICDRefiner;
import cli.transformers.endogenous.CICD.EndogenousCICDAbstractTransformer;
import cli.transformers.endogenous.EndogenousAbstractTransformer;
import cli.utils.LoggerUtils;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public abstract class AbstractReverseEngineer<InputModel extends EObject, InputPackage extends EPackage> extends AbstractEngineer<InputModel, InputPackage, Pipeline, CICDPackage, String, Pipeline> {
    private final AbstractParser<InputModel> parser;

    public AbstractReverseEngineer(AbstractTransformer<InputModel, InputPackage, Pipeline, CICDPackage> transformer, AbstractParser<InputModel> parser) {
        super(transformer);
        this.parser = parser;
    }

    public AbstractParser<InputModel> getParser() {
        return parser;
    }

    protected InputModel parse(String input) throws Exception {
        if (getParser() == null)
            throw new Exception("Parser not set");
        return getParser().parse(input);
    }

    @Override
    protected EndogenousAbstractTransformer<Pipeline, CICDPackage> getOutputRefiner(ResourceSet resourceSet, String outputRefinerPath, String inputModelName, String outputModelName, Boolean isRefinement) throws IOException {
        return new CICDRefiner(resourceSet, outputRefinerPath, inputModelName, outputModelName, isRefinement);
    }

    @Override
    public Pipeline transform(String string, List<String> inputRefinerPaths, List<String> outputRefinerPaths) throws Exception {
        LoggerUtils.log(Level.INFO, "Parsing (" + getParser().getClass().getName() + ")...");
        InputModel inputModel = parse(string);
        return callTransformer(inputModel, inputRefinerPaths, outputRefinerPaths);
    }
}
