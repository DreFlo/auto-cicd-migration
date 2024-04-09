package cli.transformers.endogenous.CICD;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class CICDRefiner extends EndogenousCICDAbstractTransformer{
    public CICDRefiner(ResourceSet resourceSet, String atlFilePath) throws IOException {
        super(resourceSet, atlFilePath, "CICD", "CICD", true);
    }

    public CICDRefiner(ResourceSet resourceSet, InputStream atlFileStream) {
        super(resourceSet, atlFileStream, "CICD", "CICD", true);
    }
}
