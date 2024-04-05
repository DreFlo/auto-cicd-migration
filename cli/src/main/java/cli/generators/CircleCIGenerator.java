package cli.generators;

import d.fe.up.pt.cicd.circleci.acceleo.main.Generate;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class CircleCIGenerator extends AbstractGenerator<Pipeline, CircleCIPackage, Generate> {
    public CircleCIGenerator(ResourceSet resourceSet) {
        super(resourceSet, CircleCIPackage.eINSTANCE);
    }

    @Override
    protected void runGeneratorMain(String[] args) {
        Generate.main(args);
    }
}
