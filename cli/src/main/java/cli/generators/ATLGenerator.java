package cli.generators;

import d.fe.up.pt.cicd.transformationsdsl.acceleo.main.Generate;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class ATLGenerator extends AbstractGenerator<TransformationSet, TransformationsPackage, Generate> {
    public ATLGenerator(ResourceSet resourceSet) {
        super(resourceSet, TransformationsPackage.eINSTANCE);
    }

    @Override
    protected void runGeneratorMain(String[] args) {
        Generate.main(args);
    }
}
