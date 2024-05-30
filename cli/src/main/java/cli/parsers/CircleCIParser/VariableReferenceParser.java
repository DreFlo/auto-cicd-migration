package cli.parsers.CircleCIParser;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;
import org.eclipse.emf.ecore.EObject;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableReferenceParser {
    private final EObject container;
    private final DefinitionGroup context;

    public VariableReferenceParser(EObject container) {
        this.container = container;
        this.context = getContext(container);
    }

    private DefinitionGroup getContext(EObject container) {
        while (!(container instanceof DefinitionGroup)) {
            container = container.eContainer();
            if (container == null) {
                throw new IllegalArgumentException("Container is not in a DefinitionGroup");
            }
        }

        return (DefinitionGroup) container;
    }

    private StringLiteral createStringLiteral(String value) {
        StringLiteral stringLiteral = CircleCIFactory.eINSTANCE.createStringLiteral();
        stringLiteral.setValue(value.trim());
        return stringLiteral;
    }

    private VariableReference createVariableReference(VariableDeclaration variableDeclaration) {
        VariableReference variableReference = CircleCIFactory.eINSTANCE.createVariableReference();
        variableReference.setReference(variableDeclaration);
        return variableReference;
    }

    public Value parse(String variableReference) {
        System.out.println(variableReference);
        Matcher matcher = Pattern.compile("(\\w[\\w-]*)").matcher(variableReference);

        Queue<String> parts = new LinkedList<>();

        while (matcher.find()) {
            parts.add(matcher.group());
        }

        VariableDeclaration variableDeclaration = getVariableDeclaration(parts);

        return variableDeclaration == null ? createStringLiteral(variableReference) : createVariableReference(variableDeclaration);
    }

    private VariableDeclaration getVariableDeclaration(Queue<String> parts) {
        if (parts.isEmpty()) {
            return null;
        }

        switch (parts.poll()) {
            case "pipeline" -> {
                return getPipelineVariable(parts);
            }
            case "parameters" -> {
                EObject localContainer = container;
                String parameterName = parts.poll();
                while (true) {
                    while (!(localContainer instanceof Callable callable)) {
                        localContainer = localContainer.eContainer();
                        if (localContainer == null) {
                            throw new RuntimeException("Parameter reference outside of a callable");
                        }
                    }

                    VariableDeclaration parameter = getParameter(callable, parameterName);

                    if (parameter != null) {
                        return parameter;
                    }

                    localContainer = localContainer.eContainer();
                    if (localContainer == null) {
                        throw new RuntimeException("Parameter reference outside of a callable");
                    }
                }
            }
            default -> {
                EObject localContainer = container;
                String environmentName = parts.poll();
                while (true) {
                    while (!(localContainer instanceof Environment environment)) {
                        localContainer = localContainer.eContainer();
                        if (localContainer == null) {
                            return null;
                        }
                    }

                    VariableDeclaration variableDeclaration = getEnvironmentVariable(environment, environmentName);

                    if (variableDeclaration != null) {
                        return variableDeclaration;
                    }

                    localContainer = localContainer.eContainer();
                    if (localContainer == null) {
                        return null;
                    }
                }

            }
        }
    }

    private VariableDeclaration getPipelineVariable(Queue<String> parts) {
        if (!(context instanceof Pipeline pipeline)) {
            throw new RuntimeException("Pipeline variable reference outside of a pipeline");
        }
        else if (parts.isEmpty()) {
            return null;
        }

        switch (parts.poll()) {
            case "parameters" -> {
                return getParameter(pipeline, parts.poll());
            }
            default -> {
                return null;
            }
        }
    }

    private VariableDeclaration getParameter(Callable callable, String name) {
        if (name == null || callable == null) {
            return null;
        }

        for (Parameter parameter : callable.getParameters()) {
            if (parameter.getName().getName().equals(name)) {
                return parameter.getName();
            }
        }

        return null;
    }

    private VariableDeclaration getEnvironmentVariable(Environment environment, String name) {
        if (name == null || environment == null) {
            return null;
        }

        for (VariableDeclaration variableDeclaration : environment.getEnvironmentVariables().keySet()) {
            if (variableDeclaration.getName().equals(name)) {
                return variableDeclaration;
            }
        }

        return null;
    }
}
