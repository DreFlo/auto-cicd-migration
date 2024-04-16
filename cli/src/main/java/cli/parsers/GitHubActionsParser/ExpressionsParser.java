package cli.parsers.GitHubActionsParser;

import cli.parsers.exceptions.SyntaxException;
import d.fe.up.pt.cicd.gha.metamodel.GHA.*;
import org.eclipse.emf.ecore.EObject;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsParser {
    private GitHubActionsParser parser;

    public ExpressionsParser(GitHubActionsParser parser) {
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
        return parseOr(expressionString, container);
    }

    private Expression parseOr(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        List<String> parts = new ArrayList<>();
        Matcher matcher = Pattern.compile("(\\s*\\\"[^\\\"]*\\\"\\s*)|(\\s*\\([^\\)]*\\)\\s*)|(\\|\\|(?!$))|[^\\|]+").matcher(expressionString);

        while (matcher.find()) {
            if (!Objects.equals(matcher.group(), "||"))
                parts.add(matcher.group().trim());
        }

        if (parts.size() == 1) {
            return parseAnd(parts.get(0), container);
        }

        Or or = GHAPackage.eINSTANCE.getGHAFactory().createOr();

        or.setLhs(parseBracketedExpression(parts.subList(0, parts.size() - 1).stream().reduce((s1, s2) -> s1 + "||" + s2).get(), container));
        or.setRhs(parseAnd(parts.get(parts.size() - 1), container));

        return or;
    }

    private Expression parseAnd(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        List<String> parts = new ArrayList<>();
        Matcher matcher = Pattern.compile("(\\s*\\\"[^\\\"]*\\\"\\s*)|(\\s*\\([^\\)]*\\)\\s*)|(\\&\\&(?!$))|[^\\&]+").matcher(expressionString);

        while (matcher.find()) {
            if (!Objects.equals(matcher.group(), "&&"))
                parts.add(matcher.group().trim());
        }

        if (parts.size() == 1) {
            return parseEquality(parts.get(0), container);
        }

        And and = GHAPackage.eINSTANCE.getGHAFactory().createAnd();

        and.setLhs(parseBracketedExpression(parts.subList(0, parts.size() - 1).stream().reduce((s1, s2) -> s1 + "&&" + s2).get(), container));
        and.setRhs(parseEquality(parts.get(parts.size() - 1), container));

        return and;
    }

    private Expression parseEquality(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        List<String> parts = new ArrayList<>();
        Matcher matcher = Pattern.compile("(\\s*\\\"[^\\\"]*\\\"\\s*)|(\\s*\\([^\\)]*\\)\\s*)|((==|!=)(?!$))|[^=]+").matcher(expressionString);

        while (matcher.find()) {
            parts.add(matcher.group().trim());
        }

        if (parts.size() == 1) {
            return parseComparison(parts.get(0), container);
        }

        Equality equality = GHAPackage.eINSTANCE.getGHAFactory().createEquality();

        equality.setLhs(parseBracketedExpression(parts.subList(0, parts.size() - 2).stream().reduce((s1, s2) -> s1 + s2).get(), container));
        equality.setOp(EQUALITY_OPS.get(parts.get(parts.size() - 2)));
        equality.setRhs(parseComparison(parts.get(parts.size() - 1), container));

        return equality;

    }

    private Expression parseComparison(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        List<String> parts = new ArrayList<>();
        Matcher matcher = Pattern.compile("(\\s*\\\"[^\\\"]*\\\"\\s*)|(\\s*\\([^\\)]*\\)\\s*)|((<|<=|>|>=)(?!$))|[^<>=]+").matcher(expressionString);

        while (matcher.find()) {
            parts.add(matcher.group().trim());
        }

        if (parts.size() == 1) {
            return parseNot(parts.get(0), container);
        }

        Comparison comparison = GHAPackage.eINSTANCE.getGHAFactory().createComparison();

        comparison.setLhs(parseBracketedExpression(parts.subList(0, parts.size() - 2).stream().reduce((s1, s2) -> s1 + s2).get(), container));
        comparison.setOp(COMPARISON_OPS.get(parts.get(parts.size() - 2)));
        comparison.setRhs(parseNot(parts.get(parts.size() - 1), container));

        return comparison;
    }

    private Expression parseNot(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        if (expressionString.startsWith("!")) {
            Not not = GHAPackage.eINSTANCE.getGHAFactory().createNot();
            not.setChildExpr(parseBracketedExpression(expressionString.substring(1), container));
            return not;
        } else {
            return parsePrimary(expressionString, container);
        }
    }

    private Expression parsePrimary(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        if (expressionString.startsWith("(") && expressionString.endsWith(")")) {
            return parseBracketedExpression(expressionString.substring(1, expressionString.length() - 1), container);
        } else if (expressionString.matches("\\w+\\s*\\(.*\\)")) {
            // TODO Functions
            return null;
        } else {
            return parseAtomic(expressionString, container);
        }
    }

    private Expression parseAtomic(String expressionString, EObject container) throws SyntaxException {
        expressionString = expressionString.trim();
        if (expressionString.matches("^[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*$")) {
            Expression expression = getVariableReferenceOrDotOp(expressionString, container);
            if (expression != null) {
                return expression;
            } else {
                StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
                stringLiteral.setValue(expressionString);
                return stringLiteral;
            }
        } else if (expressionString.matches("^\"([^\"]|\\.)*\"$")) {
            StringLiteral stringLiteral = GHAPackage.eINSTANCE.getGHAFactory().createStringLiteral();
            stringLiteral.setValue(expressionString.substring(1, expressionString.length() - 1));
            return stringLiteral;
        } else if (expressionString.matches("^[0-9]+$")) {
            IntegerLiteral integerLiteral = GHAPackage.eINSTANCE.getGHAFactory().createIntegerLiteral();
            integerLiteral.setValue(Integer.parseInt(expressionString));
            return integerLiteral;
        } else if (expressionString.matches("^true|false$")) {
            BooleanLiteral booleanLiteral = GHAPackage.eINSTANCE.getGHAFactory().createBooleanLiteral();
            booleanLiteral.setValue(Boolean.parseBoolean(expressionString));
            return booleanLiteral;
        } else if (expressionString.matches("^[0-9]+\\.[0-9]+$")) {
            DoubleLiteral doubleLiteral = GHAPackage.eINSTANCE.getGHAFactory().createDoubleLiteral();
            doubleLiteral.setValue(Double.parseDouble(expressionString));
            return doubleLiteral;
        } else {
            return null;
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
        } else {
            String name = parts.poll();
            if (name.equals("env")) {
                return getEnvironmentVariable(container, parts.poll());
            } else if (name.equals("outputs")) {
                return getOutput(container, parts.poll());
            } else if (name.equals("inputs")) {
                return getInput(container, parts.poll());
            } else if (name.equals("jobs")) {
                Job job = getJobByName(parts.poll());

                if (job != null) {
                    return getVariableDeclaration(parts, job);
                }

                return null;
            }
        }
        return null;
    }

    private VariableDeclaration getEnvironmentVariable(EObject eObject, String name) {
        EObject current = eObject;
        while (true) {
            while (!(current instanceof Workflow || current instanceof Job || current instanceof Step)) {
                current = current.eContainer();
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
        if (parts.isEmpty()) {
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
            }

            VariableDeclaration variableDeclaration = getInput(workflow, name);
            if (variableDeclaration != null) {
                return variableDeclaration;
            }

            if (current.eContainer() == null) {
                return null;
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
}
