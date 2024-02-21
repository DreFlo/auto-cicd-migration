package cli.transformers.toTIM;

import cli.transformers.Transformer;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Pipeline;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;

public abstract class ToTIMTransformer<InputModel extends EObject, InputPackage extends EPackage> extends
        Transformer<InputModel, InputPackage, Pipeline, CICDPackage> {
    protected ToTIMTransformer(ResourceSet resourceSet, InputPackage inputPackage, String atlFilePath, String inputModelName) throws IOException {
        super(resourceSet, inputPackage, CICDPackage.eINSTANCE, atlFilePath, inputModelName, "CICD");
    }
}
