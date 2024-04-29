package cli.validators;

import cli.utils.EMFUtils;
import cli.utils.JavaUtils;
import cli.utils.LoggerUtils;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.helper.OCLHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public class AbstractValidator<Model extends EObject, Package extends EPackage> {
    private final OCL ocl;
    private final Package aPackage;
    private final ResourceSet resourceSet;
    private final Map<String, Constraint> constraintMap;

    public AbstractValidator(ResourceSet resourceSet, Package aPackage, String oclFilePath) {
        this.resourceSet = resourceSet;
        this.aPackage = aPackage;

        checkRegistry();

        EcoreEnvironmentFactory factory = new EcoreEnvironmentFactory(resourceSet.getPackageRegistry());

        this.ocl = OCL.newInstance(factory);

        this.constraintMap = new HashMap<>();

        OCLInput oclInput = new OCLInput(JavaUtils.getResourceAsStream(oclFilePath));

        try {
            List<Constraint> constraints = ocl.parse(oclInput);

            for (Constraint constraint : constraints) {
                constraintMap.put(constraint.getName(), constraint);
            }
        } catch (ParserException e) {
            throw new RuntimeException(e);
        }
    }

    private void checkRegistry() {
        EMFUtils.registerPackages(getResourceSet(), getPackage());
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    public Package getPackage() {
        return aPackage;
    }

    public void validate(Model model) {
        for (Map.Entry<String, Constraint> entry : constraintMap.entrySet()) {
            Constraint constraint = entry.getValue();

            Object result = validateConstraint(model, constraint);

            if (result instanceof Boolean boolResult) {
                if (!boolResult) {
                    LoggerUtils.log(Level.WARNING, "Constraint " + entry.getKey() + " failed");
                }
            } else if (result == null) {
                LoggerUtils.log(Level.SEVERE, "Constraint " + entry.getKey() + " failed");
            }
        }
    }

    private Object validateConstraint(Model model, Constraint constraint) {
        OCLHelper<EClassifier, EOperation, EStructuralFeature, Constraint> helper = ocl.createOCLHelper();

        helper.setContext(constraint.getSpecification().getContextVariable().getType());

        return ocl.evaluate(model, constraint.getSpecification().getBodyExpression());
    }
}
