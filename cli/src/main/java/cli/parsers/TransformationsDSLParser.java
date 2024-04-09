package cli.parsers;

import com.google.inject.Injector;
import d.fe.up.pt.cicd.transformationsdsl.dsl.DSLStandaloneSetup;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet;

public class TransformationsDSLParser extends AbstractParser<TransformationSet> {
    @Override
    protected Injector getInjector() {
        return new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    protected String formatPipeline(String pipeline) {
        return pipeline;
    }
}
