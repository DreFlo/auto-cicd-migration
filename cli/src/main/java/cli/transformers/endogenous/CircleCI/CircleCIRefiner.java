package cli.transformers.endogenous.CircleCI;

import org.eclipse.emf.ecore.resource.ResourceSet;

import java.io.IOException;
import java.io.InputStream;

public class CircleCIRefiner extends EndogenousCircleCIAbstractTransformer{
    public CircleCIRefiner(ResourceSet resourceSet, String atlFilePath) throws IOException {
        super(resourceSet, atlFilePath, "CircleCI", "CircleCI", true);
    }

    public CircleCIRefiner(ResourceSet resourceSet, InputStream atlFileStream) {
        super(resourceSet, atlFileStream, "CircleCI", "CircleCI", true);
    }
}
