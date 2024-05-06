package cli.parsers.GitHubActionsParser;

import cli.parsers.AbstractXtextParser;
import com.google.inject.Injector;
import d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressionsStandaloneSetup;
import d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Expression;

public class GHAExpressionsParser extends AbstractXtextParser<Expression> {
    @Override
    protected Injector getInjector() {
        return new GHAExpressionsStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    protected String formatPipeline(String pipeline) {
        return pipeline;
    }
}
