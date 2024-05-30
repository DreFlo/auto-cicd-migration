package cli.transformers.exogenous.toTIM;

import cli.transformers.endogenous.CICD.EndogenousCICDAbstractTransformer;
import cli.transformers.exogenous.ExogenousAbstractTransformer;
import cli.validators.AbstractValidator;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public abstract class ToTIMAbstractTransformer<InputModel extends EObject, InputPackage extends EPackage> extends ExogenousAbstractTransformer<InputModel, InputPackage, Pipeline, CICDPackage> {
    protected ToTIMAbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, String atlFilePath, String inputModelName, AbstractValidator<InputModel, InputPackage> validator) throws IOException {
        super(resourceSet, inputPackage, CICDPackage.eINSTANCE, atlFilePath, inputModelName, "CICD", validator);
    }

    @Override
    public Pipeline transform(InputModel inputModel) throws IOException {
        Pipeline pipeline = super.transform(inputModel);
        for (EndogenousCICDAbstractTransformer refiner : getRefiners()) {
            pipeline = refiner.transform(pipeline);
        }
        return pipeline;
    }
}
