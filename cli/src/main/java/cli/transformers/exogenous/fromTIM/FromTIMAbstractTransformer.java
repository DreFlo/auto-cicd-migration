package cli.transformers.exogenous.fromTIM;

import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CICD.EndogenousCICDAbstractTransformer;
import cli.validators.AbstractValidator;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class FromTIMAbstractTransformer<OutputModel extends EObject, OutputPackage extends EPackage> extends AbstractTransformer<Pipeline, CICDPackage, OutputModel, OutputPackage> {
    private final List<EndogenousCICDAbstractTransformer> refiners;

    protected FromTIMAbstractTransformer(ResourceSet resourceSet, OutputPackage outputPackage, String atlFilePath, String outputModelName, AbstractValidator<Pipeline, CICDPackage> validator) {
        super(resourceSet, CICDPackage.eINSTANCE, outputPackage, atlFilePath, "CICD", outputModelName, validator);
        this.refiners = new ArrayList<>();
        registerRefiners();
    }

    protected abstract void registerRefiners();

    public List<EndogenousCICDAbstractTransformer> getRefiners() {
        return this.refiners;
    }

    @Override
    public OutputModel transform(Pipeline pipeline) throws IOException {
        // Apply refinement transformations
        for (EndogenousCICDAbstractTransformer refiner : getRefiners()) {
            pipeline = refiner.transform(pipeline);
        }
        return super.transform(pipeline);
    }
}
