package cli.generators;

import cli.utils.JavaUtils;
import d.fe.up.pt.cicd.gha.acceleo.main.Generate;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Workflow;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GHAGenerator extends AbstractGenerator<Workflow, GHAPackage, Generate>{
    public GHAGenerator(ResourceSet resourceSet) {
        super(resourceSet, GHAPackage.eINSTANCE);
    }

    @Override
    protected void runGeneratorMain(String[] args) {
        Generate.main(args);
    }
}
