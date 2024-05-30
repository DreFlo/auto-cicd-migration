package cli.transformers.exogenous.fromTIM;

import cli.transformers.endogenous.CICD.EndogenousCICDAbstractTransformer;
import cli.transformers.exogenous.ExogenousAbstractTransformer;
import cli.validators.AbstractValidator;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public abstract class FromTIMAbstractTransformer<OutputModel extends EObject, OutputPackage extends EPackage> extends ExogenousAbstractTransformer<Pipeline, CICDPackage, OutputModel, OutputPackage> {
    protected FromTIMAbstractTransformer(ResourceSet resourceSet, OutputPackage outputPackage, String atlFilePath, String outputModelName, AbstractValidator<Pipeline, CICDPackage> validator) throws IOException {
        super(resourceSet, CICDPackage.eINSTANCE, outputPackage, atlFilePath, "CICD", outputModelName, validator);
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
