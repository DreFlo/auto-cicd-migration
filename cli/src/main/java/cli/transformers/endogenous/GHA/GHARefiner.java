package cli.transformers.endogenous.GHA;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class GHARefiner extends EndogenousGHAAbstractTransformer{
    public GHARefiner(ResourceSet resourceSet, String atlFilePath) throws IOException {
        super(resourceSet, atlFilePath, "GHA", "GHA", true);
    }

    public GHARefiner(ResourceSet resourceSet, InputStream atlFileStream) {
        super(resourceSet, atlFileStream, "GHA", "GHA", true);
    }
}
