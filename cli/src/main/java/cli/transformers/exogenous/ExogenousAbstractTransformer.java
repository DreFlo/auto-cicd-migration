package cli.transformers.exogenous;

import cli.transformers.AbstractTransformer;
import cli.transformers.endogenous.CICD.EndogenousCICDAbstractTransformer;
import cli.validators.AbstractValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public abstract class ExogenousAbstractTransformer<InputModel extends EObject, InputPackage extends EPackage, OutputModel extends EObject, OutputPackage extends EPackage> extends AbstractTransformer<InputModel, InputPackage, OutputModel, OutputPackage> {
    private final List<EndogenousCICDAbstractTransformer> refiners;

    protected ExogenousAbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, OutputPackage outputPackage, InputStream atlFileStream, String inputModelName, String outputModelName, AbstractValidator<InputModel, InputPackage> validator) {
        super(resourceSet, inputPackage, outputPackage, atlFileStream, inputModelName, outputModelName, validator);
        this.refiners = new ArrayList<>();
        registerRefiners();
    }

    protected ExogenousAbstractTransformer(ResourceSet resourceSet, InputPackage inputPackage, OutputPackage outputPackage, String atlFilePath, String inputModelName, String outputModelName, AbstractValidator<InputModel, InputPackage> validator) throws IOException {
        super(resourceSet, inputPackage, outputPackage, atlFilePath, inputModelName, outputModelName, validator);
        this.refiners = new ArrayList<>();
        registerRefiners();
    }

    protected abstract void registerRefiners();

    public List<EndogenousCICDAbstractTransformer> getRefiners() {
        return this.refiners;
    }
}
