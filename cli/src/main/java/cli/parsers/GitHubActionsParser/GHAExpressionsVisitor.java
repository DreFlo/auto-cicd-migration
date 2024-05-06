package cli.parsers.GitHubActionsParser;

import cli.parsers.exceptions.SyntaxException;
import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import org.eclipse.emf.ecore.EObject;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GHAExpressionsVisitor {
    private final GitHubActionsParser parser;

    public GHAExpressionsVisitor(GitHubActionsParser parser) {
        this.parser = parser;
    }

    public Expression parse(String expressionString, EObject container) throws SyntaxException {
        List<String> parts = splitExpression(expressionString);

        if (parts.size() == 1) {
            return parseExpressionAtomic(parts.get(0), container);
        }

        Concat concat = GHAPackage.eINSTANCE.getGHAFactory().createConcat();

        for (String subExpression : parts) {
            concat.getExpressions().add(parse(subExpression, container));
        }

        return concat;
    }

    private Expression parseExpressionAtomic(String expressionString, EObject container) throws SyntaxException {
        if (expressionString.matches("^\\$\\{\\{.*}}$")) {
            return parseBracketedExpression(expressionString.substring(3, expressionString.length() - 2), container);
        } else {
            if (expressionString.matches("[0-9]+")) {
                IntegerLiteral integerLiteral = GHAPackage.eINSTANCE.getGHAFactory().createIntegerLiteral();
                integerLiteral.setValue(Integer.parseInt(expressionString));
                return integerLiteral;
            } else if (expressionString.matches("true|false")) {
                BooleanLiteral booleanLiteral = GHAPackage.eINSTANCE.getGHAFactory().createBooleanLiteral();
                booleanLiteral.setValue(Boolean.parseBoolean(expressionString));
                return booleanLiteral;
            } else if (expressionString.matches("[0-9]+\\.[0-9]+")) {
                DoubleLiteral doubleLiteral = GHAPackage.eINSTANCE.getGHAFactory().createDoubleLiteral();
                doubleLiteral.setValue(Double.parseDouble(expressionString));
                return doubleLiteral;
            }
            else {
                StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
                stringLiteral.setValue(expressionString);
                return stringLiteral;
            }
        }
    }

    private List<String> splitExpression(String expressionString) {
        List<String> parts = new ArrayList<>();

        if (expressionString == null) {
            return parts;
        }

        while (!expressionString.isEmpty()) {
            int splitIndex = expressionString.indexOf("${{");

            if (splitIndex == -1) {
                parts.add(expressionString);
                break;
            } else if (splitIndex == 0) {
                splitIndex = expressionString.indexOf("}}");

                parts.add(expressionString.substring(0, splitIndex + 2));
                expressionString = expressionString.substring(splitIndex + 2);
            }
            else {
                parts.add(expressionString.substring(0, splitIndex));
                expressionString = expressionString.substring(splitIndex);
            }
        }

        return parts;
    }

    private Expression parseBracketedExpression(String expressionString, EObject container) throws SyntaxException {
        GHAExpressionsParser expressionsParser = new GHAExpressionsParser();
        d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Expression expression = expressionsParser.parse(expressionString);
        return visitExpression(expression, container);
    }

    private Expression visitExpression(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Expression expression, EObject container) throws SyntaxException {
        if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Or or) {
            return visitOr(or, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.And and) {
            return visitAnd(and, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality equality) {
            return visitEquality(equality, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Comparison comparison) {
            return visitComparison(comparison, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Not not) {
            return visitNot(not, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.VariableReference variableReference) {
            return visitVariableReference(variableReference, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Function function) {
            return visitFunction(function, container);
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.StringLiteral stringLiteral) {
            StringLiteral convertedStringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
            convertedStringLiteral.setValue(stringLiteral.getValue());
            return convertedStringLiteral;
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.IntegerLiteral integerLiteral) {
            IntegerLiteral convertedIntegerLiteral = GHAPackage.eINSTANCE.getGHAFactory().createIntegerLiteral();
            convertedIntegerLiteral.setValue(integerLiteral.getValue());
            return convertedIntegerLiteral;
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.DoubleLiteral doubleLiteral) {
            DoubleLiteral convertedDoubleLiteral = GHAPackage.eINSTANCE.getGHAFactory().createDoubleLiteral();
            convertedDoubleLiteral.setValue(doubleLiteral.getValue());
            return convertedDoubleLiteral;
        } else if (expression instanceof d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.BooleanLiteral booleanLiteral) {
            BooleanLiteral convertedBooleanLiteral = GHAPackage.eINSTANCE.getGHAFactory().createBooleanLiteral();
            convertedBooleanLiteral.setValue(booleanLiteral.getValue());
            return convertedBooleanLiteral;
        } else {
            throw new SyntaxException("Unknown expression type: " + expression.getClass().getName());
        }
    }

    private Expression visitOr(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Or expression, EObject container) throws SyntaxException {
        Or or = GHAPackage.eINSTANCE.getGHAFactory().createOr();

        or.setLhs(visitExpression(expression.getLhs(), container));
        or.setRhs(visitExpression(expression.getRhs(), container));

        return or;
    }

    private Expression visitAnd(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.And expression, EObject container) throws SyntaxException {
        And and = GHAPackage.eINSTANCE.getGHAFactory().createAnd();

        and.setLhs(visitExpression(expression.getLhs(), container));
        and.setRhs(visitExpression(expression.getRhs(), container));

        return and;
    }

    private Expression visitEquality(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality expression, EObject container) throws SyntaxException {
        Equality equality = GHAPackage.eINSTANCE.getGHAFactory().createEquality();

        equality.setLhs(visitExpression(expression.getLhs(), container));
        equality.setOp(EQUALITY_OPS.get(expression.getOp().getLiteral()));
        equality.setRhs(visitExpression(expression.getRhs(), container));

        return equality;

    }

    private Expression visitComparison(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Comparison expression, EObject container) throws SyntaxException {
        Comparison comparison = GHAPackage.eINSTANCE.getGHAFactory().createComparison();

        comparison.setLhs(visitExpression(expression.getLhs(), container));
        comparison.setOp(COMPARISON_OPS.get(expression.getOp().getLiteral()));
        comparison.setRhs(visitExpression(expression.getRhs(), container));

        return comparison;
    }

    private Expression visitNot(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Not expression, EObject container) throws SyntaxException {
        Not not = GHAPackage.eINSTANCE.getGHAFactory().createNot();
        not.setChildExpr(visitExpression(expression.getChildExpr(), container));
        return not;
    }

    private Expression visitVariableReference(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.VariableReference expression, EObject container) throws SyntaxException {
        Expression convertedExpression = getVariableReferenceOrDotOp(expression.getValue(), container);
        if (convertedExpression != null) {
            return convertedExpression;
        } else {
            StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
            stringLiteral.setValue(expression.getValue());
            return stringLiteral;
        }
    }

    private Expression getVariableReferenceOrDotOp(String expressionString, EObject container) {
        Matcher matcher = Pattern.compile("(\\w[\\w-]*)").matcher(expressionString);

        Queue<String> parts = new LinkedList<>();

        while (matcher.find()) {
            parts.add(matcher.group());
        }

        VariableDeclaration variableDeclaration = getVariableDeclaration(parts, container);

        if (variableDeclaration == null)
            return null;

        VariableReference variableReference = GHAPackage.eINSTANCE.getGHAFactory().createVariableReference();
        variableReference.setReference(variableDeclaration);

        if (parts.isEmpty()) {
            return variableReference;
        }

        DotOp dotOp = GHAPackage.eINSTANCE.getGHAFactory().createDotOp();
        dotOp.setLhs(variableReference);
        dotOp.setRhs(makeDotOp(parts));

        return dotOp;
    }

    private Expression makeDotOp(Queue<String> parts) {
        if (parts.isEmpty()) {
            return null;
        }

        StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
        stringLiteral.setValue(parts.poll());

        if (parts.isEmpty()) {
            return stringLiteral;
        }

        DotOp dotOp = GHAPackage.eINSTANCE.getGHAFactory().createDotOp();
        dotOp.setLhs(stringLiteral);
        dotOp.setRhs(makeDotOp(parts));

        return dotOp;
    }

    private VariableDeclaration getVariableDeclaration(Queue<String> parts, EObject container) {
        if (parts.isEmpty()) {
            return null;
        }

        String name = parts.poll();
        switch (name) {
            case "env" -> {
                return getEnvironmentVariable(container, parts.poll());
            }
            case "outputs" -> {
                return getOutput(container, parts.poll());
            }
            case "inputs" -> {
                return getInput(container, parts.poll());
            }
            case "jobs" -> {
                Job job = getJobByName(parts.poll());
                return getVariableDeclaration(parts, job);
            }
            case "matrix" -> {
                return getMatrixAxis(container, parts.poll());
            }
            default -> {
                return null;
            }
        }
    }

    private VariableDeclaration getEnvironmentVariable(EObject eObject, String name) {
        EObject current = eObject;
        while (true) {
            while (!(current instanceof Workflow || current instanceof Job || current instanceof Step)) {
                current = current.eContainer();
                if (current == null) {
                    return null;
                }
            }

            if (current instanceof Workflow workflow) {
                VariableDeclaration variableDeclaration = getEnvironmentVariable(workflow, name);
                if (variableDeclaration != null) {
                    return variableDeclaration;
                }
            } else if (current instanceof Job job) {
                VariableDeclaration variableDeclaration = getEnvironmentVariable(job, name);
                if (variableDeclaration != null) {
                    return variableDeclaration;
                }
            } else {
                VariableDeclaration variableDeclaration = getEnvironmentVariable((Step) current, name);
                if (variableDeclaration != null) {
                    return variableDeclaration;
                }
            }

            if (current.eContainer() == null) {
                return null;
            } else {
                current = current.eContainer();
            }
        }
    }

    private VariableDeclaration getEnvironmentVariable(Workflow workflow, String name) {
        for (VariableDeclaration variableDeclaration : workflow.getEnvironmentVariables().keySet()) {
            if (variableDeclaration.getName().equals(name)) {
                return variableDeclaration;
            }
        }
        return null;
    }

    private VariableDeclaration getEnvironmentVariable(Job job, String name) {
        for (VariableDeclaration variableDeclaration : job.getEnvironmentVariables().keySet()) {
            if (variableDeclaration.getName().equals(name)) {
                return variableDeclaration;
            }
        }
        return null;
    }

    private VariableDeclaration getEnvironmentVariable(Step step, String name) {
        for (VariableDeclaration variableDeclaration : step.getEnvironmentVariables().keySet()) {
            if (variableDeclaration.getName().equals(name)) {
                return variableDeclaration;
            }
        }
        return null;
    }

    private Job getJobByName(String name) {
        for (Job job : parser.getWorkflow().getJobs()) {
            if (job.getName().equals(name)) {
                return job;
            }
        }
        return null;
    }

    private VariableDeclaration getVariableDeclaration(Queue<String> parts, Job job) {
        if (parts.isEmpty() || job == null) {
            return null;
        }

        String name = parts.poll();
        if (name.equals("outputs")) {
            return getOutput(job, parts.poll());
        } else if (name.equals("steps") && job instanceof ScriptJob scriptJob) {
            if (parts.isEmpty()) {
                return null;
            }

            Integer index = Integer.parseInt(parts.poll());

            AbstractStep step = getStep(scriptJob, index);

            if (step != null) {
                return getVariableDeclaration(parts, step);
            }
        } else if (name.equals("matrix")) {
            if (parts.isEmpty()) {
                return null;
            }

            return getMatrixAxis(job, parts.poll());
        }

        return null;
    }

    private VariableDeclaration getVariableDeclaration(Queue<String> parts, AbstractStep abstractStep) {
        if (abstractStep instanceof Step step) {
            return getVariableDeclaration(parts, step);
        } else if (abstractStep instanceof IfStep ifStep) {
            return getVariableDeclaration(parts, ifStep);
        } else {
            return null;
        }
    }

    private VariableDeclaration getVariableDeclaration(Queue<String> parts, IfStep ifStep) {
        return getVariableDeclaration(parts, ifStep.getThenRun());
    }

    private VariableDeclaration getVariableDeclaration(Queue<String> parts, Step step) {
        if (parts.isEmpty()) {
            return null;
        }

        String name = parts.poll();
        if (name.equals("outputs")) {
            return null;
        } else if (name.equals("env")) {
            if (parts.isEmpty()) {
                return null;
            }

            return getEnvironmentVariable(step, parts.poll());
        }

        return null;
    }

    private AbstractStep getStep(ScriptJob job, Integer index) {
        if (index < 0 || index >= job.getSteps().size()) {
            return null;
        }
        return job.getSteps().get(index);
    }

    private VariableDeclaration getOutput(EObject eObject, String name) {
        EObject current = eObject;
        while (true) {
            while (!(current instanceof Workflow || current instanceof Job)) {
                current = current.eContainer();
                if (current == null) {
                    return null;
                }
            }

            if (current instanceof Workflow workflow) {
                VariableDeclaration variableDeclaration = getOutput(workflow, name);
                if (variableDeclaration != null) {
                    return variableDeclaration;
                }
            } else {
                Job job = (Job) current;
                VariableDeclaration variableDeclaration = getOutput(job, name);
                if (variableDeclaration != null) {
                    return variableDeclaration;
                }
            }

            if (current.eContainer() == null) {
                return null;
            } else {
                current = current.eContainer();
            }
        }
    }

    private VariableDeclaration getOutput(Workflow workflow, String name) {
        List<Output> outputs = workflow.getTriggers().stream()
                .filter(WorkflowCallTrigger.class::isInstance)
                .map(t -> new ArrayList<>(((WorkflowCallTrigger) t).getOutputs()))
                .reduce(new ArrayList<>(), (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
        for (Output output : outputs) {
            if (output.getId().getName().equals(name)) {
                return output.getId();
            }
        }
        return null;
    }

    private VariableDeclaration getOutput(Job job, String name) {
        for (Output output : job.getOutputs()) {
            if (output.getId().getName().equals(name)) {
                return output.getId();
            }
        }
        return null;
    }

    private VariableDeclaration getInput(EObject eObject, String name) {
        EObject current = eObject;
        while (true) {
            while (!(current instanceof Workflow workflow)) {
                current = current.eContainer();
                if (current == null) {
                    return null;
                }
            }

            VariableDeclaration variableDeclaration = getInput(workflow, name);
            if (variableDeclaration != null) {
                return variableDeclaration;
            }

            if (current.eContainer() == null) {
                return null;
            } else {
                current = current.eContainer();
            }
        }
    }

    private VariableDeclaration getInput(Workflow workflow, String name) {
        List<Input> inputs = workflow.getTriggers().stream()
                .filter(InputTrigger.class::isInstance)
                .map(t -> new ArrayList<>(((InputTrigger) t).getInputs()))
                .reduce(new ArrayList<>(), (l1, l2) -> {
                    l1.addAll(l2);
                    return l1;
                });
        for (Input input : inputs) {
            if (input.getId().getName().equals(name)) {
                return input.getId();
            }
        }
        return null;
    }

    private VariableDeclaration getMatrixAxis(EObject eObject, String name) {
        EObject current = eObject;
        while (true) {
            while (!(current instanceof Job job)) {
                current = current.eContainer();
                if (current == null) {
                    return null;
                }
            }

            VariableDeclaration variableDeclaration = getMatrixAxis(job, name);
            if (variableDeclaration != null) {
                return variableDeclaration;
            }

            if (current.eContainer() == null) {
                return null;
            } else {
                current = current.eContainer();
            }
        }
    }

    private VariableDeclaration getMatrixAxis(Job job, String name) {
        if (job.getStrategy() == null) {
            return null;
        }
        for (MatrixAxis matrixAxis : job.getStrategy().getAxes()) {
            if (matrixAxis.getName().getName().equals(name)) {
                return matrixAxis.getName();
            }
        }
        return null;
    }

    private Expression visitFunction(d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Function expression, EObject container) throws SyntaxException {
        StringLiteral function = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
        function.setValue(expression.getName());
        return function;
    }
}
