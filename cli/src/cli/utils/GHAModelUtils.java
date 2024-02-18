package cli.utils;

import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import org.eclipse.emf.ecore.EObject;

public class GHAModelUtils {
    public static void printAST(EObject root) {
        printAST(root, 0);
    }

    public static void printAST(EObject root, int depth) {
        if (root == null) {
            printLine("null", depth);
            return;
        }
        if (root instanceof Workflow workflow) {
            printLine("Workflow", depth);

            printLine("Name", depth + 1);
            printAST(workflow.getName(), depth + 2);

            printLine("Run Name", depth + 1);
            printAST(workflow.getRunName(), depth + 2);

            printLine("Triggers", depth + 1);
            for (var trigger : workflow.getTriggers()) {
                printAST(trigger, depth + 2);
            }
        } else if (root instanceof BinaryOp binaryOp) {
            printLine("BinaryOp" + binaryOp.getClass(), depth);

            printLine("LHS", depth + 1);
            printAST(binaryOp.getLhs(), depth + 2);

            printLine("RHS", depth + 1);
            printAST(binaryOp.getRhs(), depth + 2);
        } else if (root instanceof Concat concat) {
            printLine("Concat", depth);

            for (var expr : concat.getExpressions()) {
                printAST(expr, depth + 1);
            }
        } else if (root instanceof VariableDereference variableDereference) {
            printLine("VariableDereference", depth);

            printLine("Variable", depth + 1);
            printAST(variableDereference.getVariable(), depth + 2);

            printLine("Property", depth + 1);
            printLine(variableDereference.getProperty(), depth + 2);
        } else if (root.eClass() == GHAPackage.eINSTANCE.getVariableAssignment()) {
            printLine("VariableAssignment", depth);

            printLine("Variable", depth + 1);
            printLine((String) EMFUtils.getFeature(root, GHAPackage.VARIABLE_ASSIGNMENT__KEY), depth + 2);

            printLine("Value", depth + 1);
            printAST((EObject) EMFUtils.getFeature(root, GHAPackage.VARIABLE_ASSIGNMENT__VALUE), depth + 2);
        } else {
            printLine(String.valueOf(root), depth);
        }
    }

    private static void printLine(String line, int depth) {
        System.out.println(" ".repeat(depth) + line);
    }
}
