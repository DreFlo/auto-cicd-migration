package cli.parsers.CircleCIParser;

import cli.parsers.AbstractParser;
import cli.parsers.YAML.TrimmedYamlMapping;
import cli.parsers.exceptions.SyntaxException;
import com.amihaiemil.eoyaml.*;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CircleCIParser extends AbstractParser<Pipeline> {

    public CircleCIParser() {
    }

    @Override
    protected String formatPipeline(String pipeline) {
        return pipeline;
    }

    @Override
    public Pipeline parse(String pipeline) throws SyntaxException {
        YamlMapping yamlMapping;
        try {
            yamlMapping = Yaml.createYamlInput(pipeline).readYamlMapping();
            yamlMapping = new TrimmedYamlMapping(yamlMapping);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parsePipeline(yamlMapping);
    }

    private VariableDeclaration createVariableDeclaration(String name) {
        VariableDeclaration variableDeclaration = CircleCIPackage.eINSTANCE.getCircleCIFactory().createVariableDeclaration();
        variableDeclaration.setName(name);
        return variableDeclaration;
    }

    private void initVariables(DefinitionGroup definitionGroup, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping == null) {
            return;
        }

        Map<String, Orb> orbMap = new HashMap<>();
        Map<String, Command> commandMap = new HashMap<>();
        if (yamlMapping.yamlMapping("orbs") != null) {
            initOrbs(definitionGroup.getOrbs(), yamlMapping.yamlMapping("orbs"));
        }

        for (Orb orb : definitionGroup.getOrbs()) {
            orbMap.put(orb.getName(), orb);
        }

        if (yamlMapping.yamlMapping("commands") != null) {
            initCommands(definitionGroup.getCommands(), yamlMapping.yamlMapping("commands"), orbMap);
        }

        for (Command command : definitionGroup.getCommands()) {
            commandMap.put(command.getName(), command);
        }

        if (yamlMapping.yamlMapping("jobs") != null) {
            initJobs(definitionGroup.getJobs(), yamlMapping.yamlMapping("jobs"), orbMap, commandMap);
        }
    }

    private void initOrbs(Collection<Orb> orbs, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping == null) {
            return;
        }

        for (YamlNode key : yamlMapping.keys()) {
            Orb orb;
            if (yamlMapping.value(key).type().equals(Node.MAPPING)) {
                orb = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbDefinition();
                orb.setName(key.asScalar().value());
                orbs.add(orb);
                initVariables((OrbDefinition) orb, yamlMapping.yamlMapping(key));
            } else if (yamlMapping.value(key).type().equals(Node.SCALAR)) {
                orb = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbReference();
                orb.setName(key.asScalar().value());
                ((OrbReference) orb).setReference(yamlMapping.string(key));
                orbs.add(orb);
            } else {
                throw new SyntaxException("Invalid orb definition");
            }
        }
    }

    private void initVariables(Callable callable, YamlMapping yamlMapping) {
        if (yamlMapping == null) {
            return;
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            for (YamlNode key : yamlMapping.yamlMapping("parameters").keys()) {
                if (key.type().equals(Node.SCALAR)) {
                    VariableDeclaration variableDeclaration = createVariableDeclaration(key.asScalar().value());
                    Parameter parameter = CircleCIPackage.eINSTANCE.getCircleCIFactory().createParameter();
                    parameter.setName(variableDeclaration);
                    callable.getParameters().add(parameter);
                }
            }
        }
    }

    private void initVariables(Script script, YamlMapping yamlMapping, Map<String, Orb> orbMap, Map<String, Command> commandMap) throws SyntaxException {
        if (yamlMapping == null) {
            return;
        }

        if (yamlMapping.yamlSequence("steps") != null) {
            for (YamlNode stepNode : yamlMapping.yamlSequence("steps")) {
                Step step = initStep(stepNode, orbMap, commandMap);
                script.getSteps().add(step);
            }
        }
    }

    private void initVariables(Matrix matrix, YamlMapping yamlMapping) {
        if (yamlMapping == null) {
            return;
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            for (YamlNode paramKey : yamlMapping.yamlMapping("parameters").keys()) {
                if (paramKey.type().equals(Node.SCALAR)) {
                    VariableDeclaration variableDeclaration = createVariableDeclaration(paramKey.asScalar().value());
                    MatrixParameter matrixParameter = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatrixParameter();
                    matrixParameter.setName(variableDeclaration);
                    matrix.getParameters().add(matrixParameter);
                }
            }
        }
    }

    private Step initStep(YamlNode yamlNode, Map<String, Orb> orbMap, Map<String, Command> commandMap) throws SyntaxException {
        String key;

        if (yamlNode.type().equals(Node.MAPPING)) {
            key = yamlNode.asMapping().keys().iterator().next().asScalar().value();
        } else if (yamlNode.type().equals(Node.SCALAR)) {
            key = yamlNode.asScalar().value();
        } else {
            throw new SyntaxException("Invalid step");
        }

        switch (key) {
            case "run" -> {
                if (!yamlNode.type().equals(Node.MAPPING)) {
                    throw new SyntaxException("Invalid run step");
                }
                RunStep runStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createRunStep();
                if (yamlNode.asMapping().yamlMapping("run") != null) {
                    initVariables(runStep, yamlNode.asMapping().yamlMapping("run"));
                }
                return runStep;
            }
            case "when" -> {
                if (!yamlNode.type().equals(Node.MAPPING)) {
                    throw new SyntaxException("Invalid run step");
                }
                ConditionalStep conditionalStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWhenStep();

                YamlMapping stepMap = yamlNode.asMapping().yamlMapping("when");

                if (stepMap.yamlSequence("steps") != null) {
                    initVariables(conditionalStep, stepMap, orbMap, commandMap);
                } else {
                    System.out.println(yamlNode);
                    throw new SyntaxException("Steps are required");
                }

                return conditionalStep;
            }
            case "unless" -> {
                if (!yamlNode.type().equals(Node.MAPPING)) {
                    throw new SyntaxException("Invalid run step");
                }
                ConditionalStep conditionalStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createUnlessStep();

                YamlMapping stepMap = yamlNode.asMapping().yamlMapping("unless");

                if (stepMap.yamlSequence("steps") != null) {
                    initVariables(conditionalStep, stepMap, orbMap, commandMap);
                } else {
                    throw new SyntaxException("Steps are required");
                }

                return conditionalStep;
            }
            case "checkout" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createCheckoutStep();
            }
            case "setup_remote_docker" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createSetupRemoteDockerStep();
            }
            case "save_cache" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createSaveCacheStep();
            }
            case "restore_cache" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createRestoreCacheStep();
            }
            case "store_artifacts" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createStoreArtifactsStep();
            }
            case "store_test_results" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createStoreTestResultsStep();
            }
            case "persist_to_workspace" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createPersistToWorkspaceStep();
            }
            case "attach_workspace" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createAttachWorkspaceStep();
            }
            case "add_ssh_keys" -> {
                return CircleCIPackage.eINSTANCE.getCircleCIFactory().createAddSSHKeysStep();
            }
            default -> {
                if (orbMap.containsKey(key.split("/")[0])) {
                    OrbReferenceStep orbReferenceStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbReferenceStep();
                    orbReferenceStep.setOrb(orbMap.get(key.split("/")[0]));
                    orbReferenceStep.setJobName(key.split("/")[1]);
                    return orbReferenceStep;
                } else if (commandMap.containsKey(key)) {
                    CommandReferenceStep commandReferenceStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createCommandReferenceStep();
                    commandReferenceStep.setCommand(commandMap.get(key));
                    return commandReferenceStep;
                } else {
                    throw new SyntaxException("Step not found: " + key);
                }
            }
        }
    }

    private void initVariables(Workflow workflow, YamlMapping yamlMapping, Map<String, Orb> orbMap, Map<String, Command> commandMap) throws SyntaxException {
        if (yamlMapping == null) {
            return;
        }

        if (yamlMapping.yamlSequence("jobs") != null) {
            for (YamlNode jobNode : yamlMapping.yamlSequence("jobs")) {
                String key;

                if (jobNode.type().equals(Node.MAPPING)) {
                    key = jobNode.asMapping().keys().iterator().next().asScalar().value();
                } else if (jobNode.type().equals(Node.SCALAR)) {
                    key = jobNode.asScalar().value();
                } else {
                    throw new SyntaxException("Invalid job");
                }

                NullWorkflowJobConfiguration nullWorkflowJobConfiguration = CircleCIPackage.eINSTANCE.getCircleCIFactory().createNullWorkflowJobConfiguration();
                nullWorkflowJobConfiguration.setName(key);
                workflow.getJobs().add(nullWorkflowJobConfiguration);

                if (jobNode.type().equals(Node.MAPPING)) {
                    initVariables(nullWorkflowJobConfiguration, jobNode.asMapping().yamlMapping(key), orbMap, commandMap);
                }
            }
        }
    }

    private void initVariables(Pipeline pipeline, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping == null) {
            return;
        }

        Map<String, Orb> orbMap = new HashMap<>();
        Map<String, Command> commandMap = new HashMap<>();
        initVariables((DefinitionGroup) pipeline, yamlMapping);
        initVariables((Callable) pipeline, yamlMapping);

        for (Orb orb : pipeline.getOrbs()) {
            orbMap.put(orb.getName(), orb);
        }

        for (Command command : pipeline.getCommands()) {
            commandMap.put(command.getName(), command);
        }

        if (yamlMapping.yamlMapping("workflows") != null) {
            for (YamlNode key : yamlMapping.yamlMapping("workflows").keys()) {
                if (key.type().equals(Node.SCALAR)) {
                    if (key.asScalar().value().equals("version")) {
                        continue;
                    }
                    Workflow workflow = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWorkflow();
                    workflow.setName(key.asScalar().value());
                    pipeline.getWorkflows().add(workflow);
                    if (yamlMapping.yamlMapping("workflows").yamlMapping(key) != null) {
                        initVariables(workflow, yamlMapping.yamlMapping("workflows").yamlMapping(key), orbMap, commandMap);
                    } else {
                        throw new SyntaxException("Workflow configuration is required");
                    }
                }
            }
        }
    }

    private void initVariables(NullWorkflowJobConfiguration nullWorkflowJobConfiguration, YamlMapping yamlMapping, Map<String, Orb> orbMap, Map<String, Command> commandMap) throws SyntaxException {
        if (yamlMapping == null) {
            return;
        }

        if (yamlMapping.yamlMapping("matrix") != null) {
            Matrix matrix = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatrix();
            nullWorkflowJobConfiguration.setMatrix(matrix);
            initVariables(matrix, yamlMapping.yamlMapping("matrix"));
        }

        if (yamlMapping.yamlSequence("pre-steps") != null) {
            for (YamlNode stepNode : yamlMapping.yamlSequence("pre-steps")) {
                Step step = initStep(stepNode, orbMap, commandMap);
                nullWorkflowJobConfiguration.getPreSteps().add(step);
            }
        }

        if (yamlMapping.yamlSequence("post-steps") != null) {
            for (YamlNode stepNode : yamlMapping.yamlSequence("post-steps")) {
                Step step = initStep(stepNode, orbMap, commandMap);
                nullWorkflowJobConfiguration.getPostSteps().add(step);
            }
        }
    }

    private void initJobs(Collection<Job> jobs, YamlMapping yamlMapping, Map<String, Orb> orbMap, Map<String, Command> commandMap) throws SyntaxException {
        for (YamlNode key : yamlMapping.keys()) {
            if (key.type().equals(Node.SCALAR)) {
                Job job = CircleCIPackage.eINSTANCE.getCircleCIFactory().createJob();
                job.setName(key.asScalar().value());
                jobs.add(job);
                initVariables(job, yamlMapping.yamlMapping(key), orbMap, commandMap);
            }
        }
    }

    private void initVariables(Job job, YamlMapping yamlMapping, Map<String, Orb> orbMap, Map<String, Command> commandMap) throws SyntaxException {
        initVariables((Callable) job, yamlMapping);
        initVariables((Script) job, yamlMapping, orbMap, commandMap);
        initVariables((Environment) job, yamlMapping);
    }

    private void initCommands(Collection<Command> commands, YamlMapping yamlMapping, Map<String, Orb> orbMap) throws SyntaxException {
        for (YamlNode key : yamlMapping.keys()) {
            if (key.type().equals(Node.SCALAR)) {
                Command command = CircleCIPackage.eINSTANCE.getCircleCIFactory().createCommand();
                command.setName(key.asScalar().value());
                commands.add(command);
                initVariables(command, yamlMapping.yamlMapping(key), orbMap);
            }
        }
    }

    private void initVariables(Command command, YamlMapping yamlMapping, Map<String, Orb> orbMap) throws SyntaxException {
        initVariables(command, yamlMapping);
        initVariables(command, yamlMapping, orbMap, new HashMap<>());
    }

    private void initVariables(Environment environment, YamlMapping yamlMapping) {
        if (yamlMapping.yamlMapping("environment") != null) {
            for (YamlNode key : yamlMapping.yamlMapping("environment") .keys()) {
                if (key.type().equals(Node.SCALAR)) {
                    VariableDeclaration variableDeclaration = createVariableDeclaration(key.asScalar().value());
                    environment.getEnvironmentVariables().put(variableDeclaration, null);
                }
            }
        }
    }

    private Pipeline parsePipeline(YamlMapping yamlMapping) throws SyntaxException {
        Pipeline pipeline = CircleCIPackage.eINSTANCE.getCircleCIFactory().createPipeline();
        Map<String, Job> jobsTable = new HashMap<>();
        Map<String, Orb> orbsTable = new HashMap<>();
        Map<String, Executor> executorsTable = new HashMap<>();
        Map<String, Command> commandsTable = new HashMap<>();
        initVariables(pipeline, yamlMapping);

        if (yamlMapping.string("version") != null) {
            pipeline.setVersion(yamlMapping.string("version"));
        } else {
            throw new SyntaxException("Version is required");
        }

        if (yamlMapping.string("setup") != null) {
            pipeline.setSetup(Boolean.getBoolean(yamlMapping.string("setup")));
        }

        if (yamlMapping.yamlMapping("orbs") != null) {
            parseOrbs(pipeline.getOrbs(), yamlMapping.yamlMapping("orbs"), orbsTable);
        }

        if (yamlMapping.yamlMapping("commands") != null) {
            parseCommands(pipeline.getCommands(), yamlMapping.yamlMapping("commands"), commandsTable);
        }

        if (yamlMapping.yamlMapping("executors") != null) {
            parseExecutors(pipeline.getExecutors(), yamlMapping.yamlMapping("executors"), executorsTable, orbsTable);
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            parseParameters(pipeline.getParameters(), yamlMapping.yamlMapping("parameters"));
        }

        if (yamlMapping.yamlMapping("jobs") != null) {
            parseJobs(pipeline.getJobs(), yamlMapping.yamlMapping("jobs"), jobsTable, executorsTable, orbsTable);
        }

        if (yamlMapping.yamlMapping("workflows") != null) {
            parseWorkflows(pipeline.getWorkflows(), yamlMapping.yamlMapping("workflows"), jobsTable, orbsTable, commandsTable, executorsTable);
        }

        return pipeline;
    }

    private void parseOrbs(Collection<Orb> orbs, YamlMapping yamlMapping, Map<String, Orb> orbMap) throws SyntaxException {
        for (YamlNode orbKey : yamlMapping.keys()) {
            Orb orb = getOrb(orbKey.asScalar().value(), orbs);
            if (orb == null) {
                throw new RuntimeException("Orb not found: " + orbKey.asScalar().value());
            }
            if (yamlMapping.value(orbKey).type().equals(Node.MAPPING) && orb instanceof OrbDefinition) {
                parseOrbDefinition((OrbDefinition) orb, yamlMapping.yamlMapping(orbKey));
            }
            orbMap.put(orb.getName(), orb);
        }
    }

    private Orb getOrb(String orbName, Collection<Orb> orbs) {
        for (Orb orb : orbs) {
            if (orb.getName().equals(orbName)) {
                return orb;
            }
        }
        return null;
    }

    private void parseOrbDefinition(OrbDefinition orbDefinition, YamlMapping yamlMapping) throws SyntaxException {
        Map<String, Job> jobsTable = new HashMap<>();
        Map<String, Orb> orbsTable = new HashMap<>();
        Map<String, Command> commandsTable = new HashMap<>();
        Map<String, Executor> executorsTable = new HashMap<>();

        if (yamlMapping.yamlMapping("orbs") != null) {
            parseOrbs(orbDefinition.getOrbs(), yamlMapping.yamlMapping("orbs"), orbsTable);
        } else if (yamlMapping.value("orbs") != null) {
            throw new SyntaxException("Orbs must be a mapping");
        }

        if (yamlMapping.yamlMapping("commands") != null) {
            parseCommands(orbDefinition.getCommands(), yamlMapping.yamlMapping("commands"), commandsTable);
        } else if (yamlMapping.value("commands") != null) {
            throw new SyntaxException("Commands must be a mapping");
        }

        if (yamlMapping.yamlMapping("executors") != null) {
            parseExecutors(orbDefinition.getExecutors(), yamlMapping.yamlMapping("executors"), executorsTable, orbsTable);
        } else if (yamlMapping.value("executors") != null) {
            throw new SyntaxException("Executors must be a mapping");
        }

        if (yamlMapping.yamlMapping("jobs") != null) {
            parseJobs(orbDefinition.getJobs(), yamlMapping.yamlMapping("jobs"), jobsTable, executorsTable, orbsTable);
        } else if (yamlMapping.value("jobs") != null) {
            throw new SyntaxException("Jobs must be a mapping");
        }
    }

    private void parseCommands(Collection<Command> commands, YamlMapping yamlMapping, Map<String, Command> commandMap) throws SyntaxException {
        for (YamlNode commandKey : yamlMapping.keys()) {
            Command command = getCommand(commandKey.asScalar().value(), commands);
            if (command == null) {
                throw new RuntimeException("Command not found: " + commandKey.asScalar().value());
            }
            parseCommand(command, yamlMapping.yamlMapping(commandKey));
            commandMap.put(command.getName(), command);
        }
    }

    private Command getCommand(String commandName, Collection<Command> commands) {
        for (Command command : commands) {
            if (command.getName().equals(commandName)) {
                return command;
            }
        }
        return null;
    }

    private void parseCommand(Command command, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("description") != null) {
            command.setDescription(yamlMapping.string("description"));
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            parseParameters(command.getParameters(), yamlMapping.yamlMapping("parameters"));
        }

        if (yamlMapping.yamlSequence("steps") != null) {
            parseSteps(command.getSteps(), yamlMapping.yamlSequence("steps"));
        } else {
            throw new SyntaxException("Steps are required");
        }
    }

    private void parseParameters(Collection<Parameter> parameters, YamlMapping yamlMapping) throws SyntaxException {
        for (YamlNode paramKey : yamlMapping.keys()) {
            Parameter parameter = getParameter(paramKey.asScalar().value(), parameters);
            if (parameter == null) {
                throw new RuntimeException("Parameter not found: " + paramKey.asScalar().value());
            }
            parseParameter(parameter, yamlMapping.yamlMapping(paramKey));
        }
    }

    private Parameter getParameter(String parameterName, Collection<Parameter> parameters) {
        for (Parameter parameter : parameters) {
            if (parameter.getName().getName().equals(parameterName)) {
                return parameter;
            }
        }
        return null;
    }

    private void parseParameter(Parameter parameter, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("type") != null) {
            parameter.setType(PARAMETER_TYPES.get(yamlMapping.string("type")));
        } else {
            throw new SyntaxException("Type is required");
        }

        if (parameter.getType().equals(PARAMETER_TYPES.ENUM)) {
            if (yamlMapping.yamlSequence("enum") != null) {
                parameter.getEnumValues().addAll(yamlMapping.yamlSequence("enum").values().stream().map(YamlNode::asScalar).map(Scalar::value).toList());
            } else if (yamlMapping.string("enum") != null) {
                String enumString = yamlMapping.string("enum");

                if (isList(enumString)) {
                    for (String enumValue : parseList(enumString)) {
                        parameter.getEnumValues().add(enumValue.trim());
                    }
                } else {
                    throw new SyntaxException("Enum values must be a sequence");
                }
            } else {
                throw new SyntaxException("Enum values are required for enum type");
            }
        }

        if (yamlMapping.string("default") != null) {
            parameter.setDefault(parseExpression(yamlMapping.string("default"), parameter));
        }

        if (yamlMapping.string("description") != null) {
            parameter.setDescription(yamlMapping.string("description"));
        }
    }

    private Expression parseExpression(String string, EObject container) {
        if (string == null) {
            return null;
        }
        List<String> parts = splitExpression(string);

        if (parts.size() == 1) {
            return parseValue(parts.get(0), container);
        }

        Concat concat = CircleCIPackage.eINSTANCE.getCircleCIFactory().createConcat();

        for (String part : parts) {
            concat.getExpressions().add(parseValue(part, container));
        }

        return concat;
    }

    private List<String> splitExpression(String string) {
        Matcher matcher = Pattern.compile("(<<\\s*[a-zA-Z_-][\\w_-]*(\\.[a-zA-Z_-][\\w_-]*)*\\s*>>)|(\\$\\{\\s*[a-zA-Z_-][\\w_-]*(\\.[a-zA-Z_-][\\w_-]*)*\\s*})|(.|\\s|\\R)").matcher(string);
        List<String> parts = new ArrayList<>();
        StringBuilder acc = new StringBuilder();

        while (matcher.find()) {
            String part = matcher.group();
            if (part.length() > 1) {
                if (!acc.toString().isEmpty()) {
                    parts.add(acc.toString());
                    acc = new StringBuilder();
                }
                parts.add(part);
            }
            else {
                acc.append(part);
            }
        }

        if (!acc.toString().isEmpty()) {
            parts.add(acc.toString());
        }

        return parts;
    }

    private Value parseValue(String string, EObject container) {
        if ((string.startsWith("<<") && string.endsWith(">>")) || (string.startsWith("${") && string.endsWith("}"))){
            VariableReferenceParser variableReferenceParser = new VariableReferenceParser(container);
            return variableReferenceParser.parse(string);
        } else {
            return parseLiteral(string);
        }
    }

    private Literal parseLiteral(String string) {
        if (string.matches("[0-9]+")) {
            IntegerLiteral integerLiteral = CircleCIPackage.eINSTANCE.getCircleCIFactory().createIntegerLiteral();
            integerLiteral.setValue(Integer.parseInt(string));

            return integerLiteral;
        } else if (string.matches("true|false")) {
            BooleanLiteral booleanLiteral = CircleCIPackage.eINSTANCE.getCircleCIFactory().createBooleanLiteral();
            booleanLiteral.setValue(Boolean.parseBoolean(string));

            return booleanLiteral;
        } else if (string.matches("[0-9]+\\.[0-9]+")) {
            DoubleLiteral doubleLiteral = CircleCIPackage.eINSTANCE.getCircleCIFactory().createDoubleLiteral();
            doubleLiteral.setValue(Double.parseDouble(string));

            return doubleLiteral;
        } else {
            StringLiteral literal = CircleCIPackage.eINSTANCE.getCircleCIFactory().createStringLiteral();
            literal.setValue(string);

            return literal;
        }
    }

    private void parseSteps(List<Step> steps, YamlSequence yamlSequence) throws SyntaxException {
        List<YamlNode> yamlNodes = yamlSequence.values().stream().toList();

        for (int i = 0; i < yamlNodes.size(); i++) {
            YamlNode yamlNode = yamlNodes.get(i);

            try {
                parseStep(steps.get(i), yamlNode);
            }
            catch (Exception e) {
                System.out.println(steps);
                System.out.println(i);
                System.out.println(yamlNodes.get(i));
                throw e;
            }
        }
    }

    private void parseStep(Step step,YamlNode yamlNode) throws SyntaxException {
        if (step instanceof RunStep runStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid run step");
            }
            parseRunStep(runStep, yamlNode.asMapping().value("run"));
        } else if (step instanceof ConditionalStep conditionalStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid run step");
            }
            YamlNode conditionalNode = yamlNode.asMapping().value("when") != null ? yamlNode.asMapping().value("when") : yamlNode.asMapping().value("unless");
            parseConditionalStep(conditionalStep, conditionalNode);
        } else if (step instanceof CheckoutStep checkoutStep) {
            parseCheckoutStep(checkoutStep, yamlNode);
        } else if (step instanceof SetupRemoteDockerStep setupRemoteDockerStep) {
            parseSetupRemoteDockerStep(setupRemoteDockerStep, yamlNode);
        } else if (step instanceof SaveCacheStep saveCacheStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid save_cache step");
            }
            parseSaveCacheStep(saveCacheStep, yamlNode.asMapping().yamlMapping("save_cache"));
        } else if (step instanceof RestoreCacheStep restoreCacheStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid restore_cache step");
            }
            parseRestoreCacheStep(restoreCacheStep, yamlNode.asMapping().yamlMapping("restore_cache"));
        } else if (step instanceof StoreArtifactsStep storeArtifactsStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid store_artifacts step");
            }
            parseStoreArtifactsStep(storeArtifactsStep, yamlNode.asMapping().yamlMapping("store_artifacts"));
        } else if (step instanceof StoreTestResultsStep storeTestResultsStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid store_test_results step");
            }
            parseStoreTestResultsStep(storeTestResultsStep, yamlNode.asMapping().yamlMapping("store_test_results"));
        } else if (step instanceof PersistToWorkspaceStep persistToWorkspaceStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid persist_to_workspace step");
            }
            parsePersistToWorkspaceStep(persistToWorkspaceStep, yamlNode.asMapping().yamlMapping("persist_to_workspace"));
        } else if (step instanceof AttachWorkspaceStep attachWorkspaceStep) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid attach_workspace step");
            }
            parseAttachWorkspaceStep(attachWorkspaceStep, yamlNode.asMapping().yamlMapping("attach_workspace"));
        } else if (step instanceof AddSSHKeysStep addSSHKeysStep) {
            parseAddSSHKeysStep(addSSHKeysStep, yamlNode);
        } else if (step instanceof OrbReferenceStep orbReferenceStep) {
            parseOrbReferenceStep(orbReferenceStep, yamlNode);
        } else if (step instanceof CommandReferenceStep commandReferenceStep) {
            parseCommandStep(commandReferenceStep, yamlNode);
        } else {
            throw new SyntaxException("Invalid step");
        }
    }

    private void parseRunStep(RunStep runStep, YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.SCALAR)) {
            runStep.setCommand(parseExpression(yamlNode.asScalar().value(), runStep));
        } else if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping();

            if (yamlMapping.string("command") != null) {
                runStep.setCommand(parseExpression(yamlMapping.string("command"), runStep));
            } else {
                throw new SyntaxException("Command is required");
            }

            if (yamlMapping.string("name") != null) {
                runStep.setName(parseExpression(yamlMapping.string("name"), runStep));
            }

            if (yamlMapping.string("shell") != null) {
                runStep.setShell(parseExpression(yamlMapping.string("shell"), runStep));
            }

            if (yamlMapping.yamlMapping("environment") != null) {
                parseVariableAssignments(runStep, runStep.getEnvironmentVariables(), yamlMapping.yamlMapping("environment"));
            }

            if (yamlMapping.string("background") != null) {
                runStep.setBackground(parseExpression(yamlMapping.string("background"), runStep));
            }

            if (yamlMapping.string("working_directory") != null) {
                runStep.setWorkingDirectory(parseExpression(yamlMapping.string("working_directory"), runStep));
            }

            if (yamlMapping.string("no_output_timeout") != null) {
                runStep.setNoOutputTimeout(parseExpression(yamlMapping.string("no_output_timeout"), runStep));
            }

            if (yamlMapping.string("when") != null) {
                runStep.setWhen(WHEN_TYPE.get(yamlMapping.string("when")));
            }
        } else {
            throw new SyntaxException("Invalid run step");
        }
    }

    private void parseVariableAssignments(EObject container, EMap<VariableDeclaration, Expression> variableAssignments, YamlMapping environment) throws SyntaxException {
        for (YamlNode key : environment.keys()) {
            if (key.type().equals(Node.SCALAR)) {
                VariableDeclaration variableDeclaration = variableAssignments.keySet().stream().filter(variable -> variable.getName().equals(key.asScalar().value())).findFirst().orElse(null);
                if (variableDeclaration == null) {
                    throw new RuntimeException("Variable not found: " + key.asScalar().value());
                }
                variableAssignments.put(variableDeclaration, parseExpression(environment.string(key), container));
            }
        }
    }

    private void parseConditionalStep(ConditionalStep conditionalStep, YamlNode yamlNode) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING)) {
            throw new SyntaxException("Invalid conditional step");
        }

        YamlMapping yamlMapping = yamlNode.asMapping();

        if (yamlMapping.value("condition") != null) {
            conditionalStep.setCondition(parseLogic(yamlMapping.value("condition"), conditionalStep));
        } else {
            throw new SyntaxException("Condition is required");
        }

        if (yamlMapping.yamlSequence("steps") != null) {
            parseSteps(conditionalStep.getSteps(), yamlMapping.yamlSequence("steps"));
        } else {
            throw new SyntaxException("Steps are required");
        }
    }

    private Logic parseLogic(YamlNode yamlNode, EObject container) throws SyntaxException {
        if (yamlNode.type().equals(Node.SCALAR)) {
            return parseValue(yamlNode.asScalar().value(), container);
        } else if (yamlNode.type().equals(Node.MAPPING)) {
            return parseOperator(yamlNode.asMapping(), container);
        } else {
            throw new SyntaxException("Invalid logic");
        }
    }

    private Logic parseOperator(YamlMapping yamlMapping, EObject container) throws SyntaxException {
        if (yamlMapping.yamlSequence("and") != null) {
            And and = CircleCIPackage.eINSTANCE.getCircleCIFactory().createAnd();
            and.getOperands().addAll(parseOperands(yamlMapping.yamlSequence("and"), container));

            return and;
        } else if (yamlMapping.string("and") != null) {
            And and = CircleCIPackage.eINSTANCE.getCircleCIFactory().createAnd();

            return parseInfinitaryOperatorOperandsFromString(and, yamlMapping.string("and"), container);
        } else if (yamlMapping.yamlSequence("or") != null) {
            Or or = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOr();
            or.getOperands().addAll(parseOperands(yamlMapping.yamlSequence("or"), container));

            return or;
        } else if (yamlMapping.string("or") != null) {
            Or or = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOr();

            return parseInfinitaryOperatorOperandsFromString(or, yamlMapping.string("or"), container);
        } else if (yamlMapping.yamlSequence("equals") != null) {
            Equals equals = CircleCIPackage.eINSTANCE.getCircleCIFactory().createEquals();
            equals.getOperands().addAll(parseOperands(yamlMapping.yamlSequence("equals"), container));

            return equals;
        } else if (yamlMapping.string("equals") != null) {
            Equals equals = CircleCIPackage.eINSTANCE.getCircleCIFactory().createEquals();

            return parseInfinitaryOperatorOperandsFromString(equals, yamlMapping.string("equals"), container);
        } else if (yamlMapping.yamlMapping("not") != null) {
            Not not = CircleCIPackage.eINSTANCE.getCircleCIFactory().createNot();
            not.setOperand(parseLogic(yamlMapping.value("not"), container));

            return not;
        } else if (yamlMapping.yamlMapping("matches") != null) {
            Matches matches = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatches();

            YamlMapping matchesMapping = yamlMapping.yamlMapping("matches");

            if (matchesMapping.string("pattern") != null) {
                matches.setPattern(parseExpression(matchesMapping.string("pattern"), container));
            } else {
                throw new SyntaxException("Pattern is required");
            }

            if (matchesMapping.string("value") != null) {
                matches.setValue(parseExpression(matchesMapping.string("value"), container));
            } else {
                throw new SyntaxException("Value is required");
            }

            return matches;
        } else {
            throw new SyntaxException("Invalid operator");
        }
    }

    private InfinitaryOperator parseInfinitaryOperatorOperandsFromString(InfinitaryOperator infinitaryOperator, String listString, EObject container) throws SyntaxException {
        if (isList(listString)) {
            listString = parseList(listString).stream().map(String::trim).map(string -> "- " + string).collect(Collectors.joining("\n"));

            try {
                YamlSequence sequence = Yaml.createYamlInput(listString).readYamlSequence();

                infinitaryOperator.getOperands().addAll(parseOperands(sequence, container));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new SyntaxException("Values must be a sequence");
        }

        return infinitaryOperator;
    }

    private List<Logic> parseOperands(YamlSequence yamlSequence, EObject container) throws SyntaxException {
        List<Logic> operands = new ArrayList<>();

        for (YamlNode operand : yamlSequence) {
            operands.add(parseLogic(operand, container));
        }

        return operands;
    }

    private void parseCheckoutStep(CheckoutStep checkoutStep, YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping("checkout");

            if (yamlMapping == null) {
                return;
            }

            if (yamlMapping.string("path") != null) {
                checkoutStep.setPath(parseExpression(yamlMapping.string("path"), checkoutStep));
            } else {
                throw new SyntaxException("Path is required");
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid checkout step");
        }
    }

    private void parseSetupRemoteDockerStep(SetupRemoteDockerStep setupRemoteDockerStep, YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping("setup_remote_docker");

            if (yamlMapping.string("version") != null) {
                setupRemoteDockerStep.setVersion(parseExpression(yamlMapping.string("version"), setupRemoteDockerStep));
            }

            if (yamlMapping.string("docker_layer_caching") != null) {
                setupRemoteDockerStep.setDockerLayerCaching(parseExpression(yamlMapping.string("docker_layer_caching"), setupRemoteDockerStep));
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid setup_remote_docker step");
        }
    }

    private void parseSaveCacheStep(SaveCacheStep saveCacheStep, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("key") != null) {
            saveCacheStep.setKey(parseExpression(yamlMapping.string("key"), saveCacheStep));
        } else {
            throw new SyntaxException("Key is required");
        }

        if (yamlMapping.yamlSequence("paths") != null) {
            saveCacheStep.getPaths().addAll(yamlMapping.yamlSequence("paths").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(path -> parseExpression(path, saveCacheStep)).toList());
        }

        if (yamlMapping.string("when") != null) {
            saveCacheStep.setWhen(WHEN_TYPE.get(yamlMapping.string("when")));
        }

        if (yamlMapping.string("name") != null) {
            saveCacheStep.setName(parseExpression(yamlMapping.string("name"), saveCacheStep));
        }
    }

    private void parseRestoreCacheStep(RestoreCacheStep restoreCacheStep, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("key") != null) {
            restoreCacheStep.getKeys().add(parseExpression(yamlMapping.string("key"), restoreCacheStep));
        } else if (yamlMapping.yamlSequence("keys") != null) {
            restoreCacheStep.getKeys().addAll(yamlMapping.yamlSequence("keys").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(key -> parseExpression(key, restoreCacheStep)).toList());
        } else if (yamlMapping.string("keys") != null) {
            String keys = yamlMapping.string("keys");

            if (isList(keys)) {
                for (String key : parseList(keys)) {
                    restoreCacheStep.getKeys().add(parseExpression(key.trim(), restoreCacheStep));
                }
            } else {
                throw new SyntaxException("Keys must be a sequence");
            }

        } else {
            throw new SyntaxException("Key or keys are required");
        }

        if (yamlMapping.string("name") != null) {
            restoreCacheStep.setName(parseExpression(yamlMapping.string("name"), restoreCacheStep));
        }
    }

    private void parseStoreArtifactsStep(StoreArtifactsStep storeArtifactsStep, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("path") != null) {
            storeArtifactsStep.setPath(parseExpression(yamlMapping.string("path"), storeArtifactsStep));
        } else {
            throw new SyntaxException("Path is required");
        }

        if (yamlMapping.string("destination") != null) {
            storeArtifactsStep.setDestination(parseExpression(yamlMapping.string("destination"), storeArtifactsStep));
        }
    }

    private void parseStoreTestResultsStep(StoreTestResultsStep storeTestResultsStep, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("path") != null) {
            storeTestResultsStep.setPath(parseExpression(yamlMapping.string("path"), storeTestResultsStep));
        } else {
            throw new SyntaxException("Path is required");
        }
    }

    private void parsePersistToWorkspaceStep(PersistToWorkspaceStep persistToWorkspaceStep, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("root") != null) {
            persistToWorkspaceStep.setRoot(parseExpression(yamlMapping.string("root"), persistToWorkspaceStep));
        } else {
            throw new SyntaxException("Root is required");
        }

        if (yamlMapping.yamlSequence("paths") != null) {
            persistToWorkspaceStep.getPaths().addAll(yamlMapping.yamlSequence("paths").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(path -> parseExpression(path, persistToWorkspaceStep)).toList());
        } else if (yamlMapping.string("paths") != null) {
            String paths = yamlMapping.string("paths");

            if (isList(paths)) {
                for (String path : parseList(paths)) {
                    persistToWorkspaceStep.getPaths().add(parseExpression(path.trim(), persistToWorkspaceStep));
                }
            } else {
                persistToWorkspaceStep.getPaths().add(parseExpression(paths, persistToWorkspaceStep));
            }
        } else {
            throw new SyntaxException("Paths are required");
        }
    }

    private void parseAttachWorkspaceStep(AttachWorkspaceStep attachWorkspaceStep, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("at") != null) {
            attachWorkspaceStep.setAt(parseExpression(yamlMapping.string("at"), attachWorkspaceStep));
        } else {
            throw new SyntaxException("At is required");
        }
    }

    private void parseAddSSHKeysStep(AddSSHKeysStep addSSHKeysStep, YamlNode yamlNode) throws SyntaxException {
         if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping("add_ssh_keys");

            if (yamlMapping.yamlSequence("fingerprints") != null) {
                addSSHKeysStep.getFingerprints().addAll(yamlMapping.yamlSequence("fingerprints").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(fingerprint -> parseExpression(fingerprint, addSSHKeysStep)).toList());
            } else if (yamlMapping.string("fingerprints") != null) {
                String fingerprints = yamlMapping.string("fingerprints");

                if (isList(fingerprints)) {
                    for (String fingerprint : parseList(fingerprints)) {
                        addSSHKeysStep.getFingerprints().add(parseExpression(fingerprint.trim(), addSSHKeysStep));
                    }
                } else {
                    throw new SyntaxException("Fingerprints must be a sequence");
                }
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid add_ssh_keys step");
        }
    }

    private void parseOrbReferenceStep(OrbReferenceStep orbReferenceStep, YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping();

            String orb = yamlMapping.keys().iterator().next().asScalar().value();

            if (yamlMapping.yamlMapping(orb) != null) {
                orbReferenceStep.getArguments().putAll(createVariableAssignments(yamlMapping.yamlMapping(orb), orbReferenceStep));
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid orb reference step");
        }
    }

    private void parseCommandStep(CommandReferenceStep commandReferenceStep, YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping();

            String command = yamlMapping.keys().iterator().next().asScalar().value();

            if (yamlMapping.yamlMapping(command) != null) {
                commandReferenceStep.getArguments().putAll(createVariableAssignments(yamlMapping.yamlMapping(command), commandReferenceStep));
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid command reference step");
        }
    }

    private void parseExecutors(Collection<Executor> executors, YamlMapping yamlMapping, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        for (YamlNode executorKey : yamlMapping.keys()) {
            if (yamlMapping.yamlMapping(executorKey) != null) {
                Executor executor = createExecutor(yamlMapping.yamlMapping(executorKey), executorsTable, orbsTable);
                executor.setName(executorKey.asScalar().value());
                executors.add(executor);
                if (executorsTable != null && executor.getName() != null)
                    executorsTable.put(executor.getName(), executor);
                parseExecutor(executor, yamlMapping.yamlMapping(executorKey));
            }
        }
    }

    private Executor createExecutor(YamlMapping yamlMapping, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        Executor executor;
        if (yamlMapping.yamlSequence("docker") != null) {
            executor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createDockerExecutor();
        } else if (yamlMapping.yamlMapping("machine") != null) {
            executor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMachineExecutor();
        } else if (yamlMapping.yamlMapping("macos") != null) {
            executor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMacOSExecutor();
        } else if (yamlMapping.string("executor") != null || (yamlMapping.yamlMapping("executor") != null && yamlMapping.yamlMapping("executor").string("name") != null)) {
            String name = yamlMapping.string("executor") != null ? yamlMapping.string("executor") : yamlMapping.yamlMapping("executor").string("name");
            if (executorsTable.containsKey(name)) {
                ExecutorReferenceExecutor executorReferenceExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createExecutorReferenceExecutor();
                executorReferenceExecutor.setExecutor(executorsTable.get(name));

                executor = executorReferenceExecutor;
            } else if (orbsTable.containsKey(name.split("/")[0])) {
                OrbReferenceExecutor orbReferenceExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbReferenceExecutor();
                orbReferenceExecutor.setOrb(orbsTable.get(name.split("/")[0]));
                orbReferenceExecutor.setOrbExecutorName(name.split("/")[1]);

                // TODO Add version

                executor = orbReferenceExecutor;
            } else {
                throw new RuntimeException("Executor not found");
            }
        } else {
            throw new SyntaxException("Invalid executor");
        }
        return executor;
    }

    private void parseExecutor(Executor executor, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.yamlSequence("docker") != null && executor instanceof DockerExecutor dockerExecutor) {
            parseDockerExecutor(dockerExecutor, yamlMapping.yamlSequence("docker"));
        } else if (yamlMapping.yamlMapping("machine") != null && executor instanceof MachineExecutor machineExecutor) {
            parseMachineExecutor(machineExecutor, yamlMapping.yamlMapping("machine"));
        } else if (yamlMapping.yamlMapping("macos") != null && executor instanceof MacOSExecutor macosExecutor) {
            parseMacOSExecutor(macosExecutor, yamlMapping.yamlMapping("macos"));
        }

        if (yamlMapping.string("shell") != null) {
            executor.setShell(parseExpression(yamlMapping.string("shell"), executor));
        }

        if (yamlMapping.yamlMapping("environment") != null) {
            executor.getEnvironmentVariables().putAll(createVariableAssignments(yamlMapping.yamlMapping("environment"), executor));
        }

        if (yamlMapping.string("working_directory") != null) {
            executor.setWorkingDirectory(parseExpression(yamlMapping.string("working_directory"), executor));
        }

        if (yamlMapping.string("resource_class") != null) {
            executor.setResourceClass(parseExpression(yamlMapping.string("resource_class"), executor));
        }
    }

    private void parseDockerExecutor(DockerExecutor dockerExecutor, YamlSequence yamlSequence) throws SyntaxException {
        for (YamlNode container : yamlSequence) {
            if (!container.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid docker executor");
            }
            if (container.asMapping().string("NULL_DOCKER_CONTAINER") != null) {
                NullDockerContainer dockerContainer = CircleCIPackage.eINSTANCE.getCircleCIFactory().createNullDockerContainer();
                dockerContainer.setAgent(CICD_AGENTS.get(container.asMapping().string("NULL_DOCKER_CONTAINER")));
                dockerExecutor.getContainers().add(dockerContainer);
                if (container.asMapping().string("image") != null) {
                    dockerContainer.setImage(parseExpression(container.asMapping().string("image"), dockerContainer));
                } else {
                    throw new SyntaxException("Image is required");
                }
            } else {
                DockerContainer dockerContainer = CircleCIPackage.eINSTANCE.getCircleCIFactory().createDockerContainer();
                dockerExecutor.getContainers().add(dockerContainer);
                parseDockerContainer(dockerContainer, container.asMapping());
            }
        }
    }

    private void parseDockerContainer(DockerContainer dockerContainer, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("image") != null) {
            dockerContainer.setImage(parseExpression(yamlMapping.string("image"), dockerContainer));
        } else {
            throw new SyntaxException("Image is required");
        }

        if (yamlMapping.string("name") != null) {
            dockerContainer.setName(parseExpression(yamlMapping.string("name"), dockerContainer));
        }

        if (yamlMapping.yamlSequence("entrypoint") != null) {
            dockerContainer.getEntrypoint().addAll(yamlMapping.yamlSequence("entrypoint").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(entrypoint -> parseExpression(entrypoint, dockerContainer)).toList());
        } else if (yamlMapping.string("entrypoint") != null) {
            String entrypoint = yamlMapping.string("entrypoint");

            if (isList(entrypoint)) {
                for (String entry : parseList(entrypoint)) {
                    dockerContainer.getEntrypoint().add(parseExpression(entry.trim(), dockerContainer));
                }
            } else {
                throw new SyntaxException("Entrypoint must be a sequence");
            }
        }

        if (yamlMapping.string("command") != null) {
            dockerContainer.getCommand().addAll(yamlMapping.yamlSequence("command").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(command -> parseExpression(command, dockerContainer)).toList());
        } else if (yamlMapping.string("command") != null) {
            String command = yamlMapping.string("command");

            if (isList(command)) {
                for (String cmd : parseList(command)) {
                    dockerContainer.getCommand().add(parseExpression(cmd.trim(), dockerContainer));
                }
            } else {
                throw new SyntaxException("Command must be a sequence");
            }

        }

        if (yamlMapping.yamlMapping("environment") != null) {
            dockerContainer.getEnvironmentVariables().putAll(createVariableAssignments(yamlMapping.yamlMapping("environment"), dockerContainer));
        }

        if (yamlMapping.string("user") != null) {
            dockerContainer.setUser(parseExpression(yamlMapping.string("user"), dockerContainer));
        }

        if (yamlMapping.yamlMapping("auth") != null) {
            YamlMapping auth = yamlMapping.yamlMapping("auth");
            if (auth.string("username") != null) {
                dockerContainer.setUsername(parseExpression(auth.string("username"), dockerContainer));
            }
            if (auth.string("password") != null) {
                dockerContainer.setPassword(parseExpression(auth.string("password"), dockerContainer));
            }
        }

        if (yamlMapping.yamlMapping("aws_auth") != null) {
            YamlMapping awsAuth = yamlMapping.yamlMapping("aws_auth");
            if (awsAuth.string("aws_access_key_id") != null) {
                dockerContainer.setAwsAccessKeyID(parseExpression(awsAuth.string("aws_access_key_id"), dockerContainer));
            }
            if (awsAuth.string("aws_secret_access_key") != null) {
                dockerContainer.setAwsSecretAccessKey(parseExpression(awsAuth.string("aws_secret_access_key"), dockerContainer));
            }
            if (awsAuth.string("oidc_role_arn") != null) {
                dockerContainer.setOidc(parseExpression(awsAuth.string("oidc_role_arn"), dockerContainer));
            }
        }
    }

    private void parseMachineExecutor(MachineExecutor machineExecutor, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("image") != null) {
            machineExecutor.setImage(parseExpression(yamlMapping.string("image"), machineExecutor));
        } else {
            throw new SyntaxException("Must have image");
        }

        if (yamlMapping.string("docker_layer_caching") != null) {
            machineExecutor.setDockerLayerCaching(parseExpression(yamlMapping.string("docker_layer_caching"), machineExecutor));
        }
    }

    private void parseMacOSExecutor(MacOSExecutor macosExecutor, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("xcode") != null) {
            macosExecutor.setXcode(parseExpression(yamlMapping.string("xcode"), macosExecutor));
        } else {
            throw new SyntaxException("Xcode is required");
        }
    }

    private void parseJobs(Collection<Job> jobs, YamlMapping yamlMapping, Map<String, Job> jobMap, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        for (YamlNode jobKey : yamlMapping.keys()) {
            Job job = getJob(jobKey.asScalar().value(), jobs);
            if (job == null)
                throw new RuntimeException("Job not found");
            parseJob(job, yamlMapping.yamlMapping(jobKey), executorsTable, orbsTable);
            jobMap.put(jobKey.asScalar().value(), job);
        }
    }

    private Job getJob(String jobName, Collection<Job> jobs) {
        for (Job job : jobs) {
            if (job.getName().equals(jobName)) {
                return job;
            }
        }
        return null;
    }

    private void parseJob(Job job, YamlMapping yamlMapping, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        Executor executor = createExecutor(yamlMapping, executorsTable, orbsTable);
        job.setExecutor(executor);
        parseExecutor(executor, yamlMapping);

        if (yamlMapping.yamlSequence("steps") != null) {
            parseSteps(job.getSteps(), yamlMapping.yamlSequence("steps"));
        } else {
            throw new SyntaxException("Steps are required");
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            parseParameters(job.getParameters(), yamlMapping.yamlMapping("parameters"));
        }

        if (yamlMapping.yamlMapping("environment") != null) {
            parseVariableAssignments(job, job.getEnvironmentVariables(), yamlMapping.yamlMapping("environment"));
        }

        if (yamlMapping.string("circleci_ip_ranges") != null) {
            job.setCircleCIIPRanges(parseExpression(yamlMapping.string("circleci_ip_ranges"), job));
        }

        if (yamlMapping.string("parallelism") != null) {
            job.setParallelism(parseExpression(yamlMapping.string("parallelism"), job));
        }
    }

    private void parseWorkflows(Collection<Workflow> workflows, YamlMapping yamlMapping, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable, Map<String, Executor> executorsTable) throws SyntaxException {
        for (YamlNode workflowKey : yamlMapping.keys()) {
            if (workflowKey.asScalar().value().equals("version")) {
                continue;
            }
            Workflow workflow = getWorkflow(workflowKey.asScalar().value(), workflows);
            if (workflow == null)
                throw new RuntimeException("Workflow not found");
            parseWorkflow(workflow, yamlMapping.yamlMapping(workflowKey), jobsTable, orbsTable, commandsTable, executorsTable);
        }
    }

    private Workflow getWorkflow(String workflowName, Collection<Workflow> workflows) {
        for (Workflow workflow : workflows) {
            if (workflow.getName().equals(workflowName)) {
                return workflow;
            }
        }
        return null;
    }

    private void parseWorkflow(Workflow workflow, YamlMapping yamlMapping, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable, Map<String, Executor> executorsTable) throws SyntaxException {
        if (yamlMapping.value("when") != null) {
            workflow.setCondition(parseLogic(yamlMapping.value("when"), workflow));
            workflow.setIsWhen(true);
        } else if (yamlMapping.value("unless") != null) {
            workflow.setCondition(parseLogic(yamlMapping.value("unless"), workflow));
            workflow.setIsWhen(false);
        }

        if (yamlMapping.yamlSequence("triggers") != null) {
            parseTriggers(workflow.getTriggers(), yamlMapping.yamlSequence("triggers"));
        }

        if (yamlMapping.yamlSequence("jobs") != null) {
            parseWorkflowJobConfigurations(workflow.getJobs(), yamlMapping.yamlSequence("jobs"), jobsTable, orbsTable, commandsTable, executorsTable);
        } else {
            throw new SyntaxException("Jobs are required");
        }
    }

    private void parseTriggers(Collection<Trigger> triggers, YamlSequence yamlSequence) throws SyntaxException {
        for (YamlNode triggerNode : yamlSequence) {
            Trigger trigger = createTrigger(triggerNode);
            triggers.add(trigger);
            parseTrigger(trigger, triggerNode);
        }
    }

    private Trigger createTrigger(YamlNode yamlNode) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING)) {
            throw new SyntaxException("Invalid trigger");
        }

        YamlMapping yamlMapping = yamlNode.asMapping();

        if (yamlMapping.yamlMapping("schedule") != null) {
            return CircleCIPackage.eINSTANCE.getCircleCIFactory().createScheduleTrigger();
        } else {
            throw new SyntaxException("Invalid trigger");
        }
    }

    private void parseTrigger(Trigger trigger, YamlNode yamlNode) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING)) {
            throw new SyntaxException("Invalid trigger");
        }

        YamlMapping yamlMapping = yamlNode.asMapping();

        if (yamlMapping.yamlMapping("schedule") != null && trigger instanceof ScheduleTrigger scheduleTrigger) {
            parseScheduleTrigger(scheduleTrigger, yamlMapping.yamlMapping("schedule"));
        } else {
            throw new SyntaxException("Invalid trigger");
        }
    }

    private void parseScheduleTrigger(ScheduleTrigger scheduleTrigger, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.string("cron") != null) {
            scheduleTrigger.setCron(yamlMapping.string("cron"));
        } else {
            throw new SyntaxException("Cron is required");
        }

        if (yamlMapping.yamlMapping("filters") != null) {
            YamlMapping filters = yamlMapping.yamlMapping("filters");

            if (filters.yamlMapping("branches") != null) {
                YamlMapping branches = filters.yamlMapping("branches");

                if (branches.yamlSequence("only") != null) {
                    scheduleTrigger.getBranches().addAll(branches.yamlSequence("only").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(branch -> parseExpression(branch, scheduleTrigger)).toList());
                    scheduleTrigger.setIgnoreSpecifiedBranches(false);
                } else if (branches.string("only") != null ) {
                    String only = branches.string("only");

                    if (isList(only)) {
                        for (String branch : parseList(only)) {
                            scheduleTrigger.getBranches().add(parseExpression(branch.trim(), scheduleTrigger));
                        }
                    } else {
                        scheduleTrigger.getBranches().add(parseExpression(only, scheduleTrigger));
                    }

                    scheduleTrigger.setIgnoreSpecifiedBranches(false);
                } else if (yamlMapping.yamlSequence("ignore") != null) {
                    scheduleTrigger.getBranches().addAll(branches.yamlSequence("ignore").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(branch -> parseExpression(branch, scheduleTrigger)).toList());
                    scheduleTrigger.setIgnoreSpecifiedBranches(true);
                } else if (yamlMapping.string("ignore") != null) {
                    String ignore = branches.string("ignore");

                    if (isList(ignore)) {
                        for (String branch : parseList(ignore)) {
                            scheduleTrigger.getBranches().add(parseExpression(branch.trim(), scheduleTrigger));
                        }
                    } else {
                        scheduleTrigger.getBranches().add(parseExpression(ignore, scheduleTrigger));
                    }

                    scheduleTrigger.setIgnoreSpecifiedBranches(true);
                } else {
                    throw new SyntaxException("Invalid branches filters");
                }
            }
        }
    }

    private void parseWorkflowJobConfigurations(List<WorkflowJobConfiguration> workflowJobConfigurations,YamlSequence yamlSequence, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable, Map<String, Executor> executorsTable) throws SyntaxException {
        Map<String, WorkflowJobConfiguration> workflowJobConfigurationsTable = new HashMap<>();

        if (yamlSequence.size() != workflowJobConfigurations.size())
            throw new RuntimeException("Invalid workflow job configurations");

        List<YamlNode> yamlNodes = yamlSequence.values().stream().toList();

        for (int i = 0; i < yamlSequence.size(); i++) {
            parseWorkflowJobConfiguration(i, workflowJobConfigurations, yamlNodes.get(i), workflowJobConfigurationsTable, jobsTable, orbsTable, commandsTable, executorsTable);
        }

        for (YamlNode job : yamlSequence) {
            if (job.type().equals(Node.MAPPING)) {
                String key = job.asMapping().keys().iterator().next().asScalar().value();

                if (job.asMapping().yamlMapping(key) == null) {
                    continue;
                }

                YamlMapping yamlMapping = job.asMapping().yamlMapping(key);

                if (yamlMapping.yamlSequence("requires") != null) {
                    YamlSequence requires = yamlMapping.yamlSequence("requires");

                    for (YamlNode yamlNode : requires) {
                        if (!yamlNode.type().equals(Node.SCALAR)) {
                            throw new SyntaxException("Invalid requires");
                        }

                        String requiresKey = yamlNode.asScalar().value();

                        if (workflowJobConfigurationsTable.containsKey(requiresKey)) {
                            workflowJobConfigurationsTable.get(key).getRequires().add(workflowJobConfigurationsTable.get(requiresKey));
                        } else {
                            throw new SyntaxException("Invalid requires");
                        }
                    }
                }
            }
        }
    }

    private void parseWorkflowJobConfiguration(Integer index, List<WorkflowJobConfiguration> workflowJobConfigurations, YamlNode yamlNode, Map<String, WorkflowJobConfiguration> workflowJobConfigurationsTable, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable, Map<String, Executor> executorsTable) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING) && !yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid job configuration");
        }

        String key;
        WorkflowJobConfiguration workflowJobConfiguration;
        WorkflowJobConfiguration nullJobConfiguration = workflowJobConfigurations.get(index);

        if (yamlNode.type().equals(Node.MAPPING)) {
            key = yamlNode.asMapping().keys().iterator().next().asScalar().value();
        } else {
            key = yamlNode.asScalar().value();
        }

        if (jobsTable == null || orbsTable == null || commandsTable == null || workflowJobConfigurationsTable == null) {
            throw new RuntimeException("Jobs, orbs, commands and workflow job configurations tables are required");
        }

        if (jobsTable.containsKey(key)) {
            workflowJobConfiguration = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWorkflowDefinedJobConfiguration();
            ((WorkflowDefinedJobConfiguration) workflowJobConfiguration).setJob(jobsTable.get(key));
        } else if (orbsTable.containsKey(key.split("/")[0])) {
            workflowJobConfiguration = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWorkflowOrbJobConfiguration();
            ((WorkflowOrbJobConfiguration) workflowJobConfiguration).setOrb(orbsTable.get(key.split("/")[0]));
            ((WorkflowOrbJobConfiguration) workflowJobConfiguration).setJobName(key.split("/")[1]);
        } else if (yamlNode.type().equals(Node.MAPPING) && yamlNode.asMapping().yamlMapping(key) != null && yamlNode.asMapping().yamlMapping(key).string("type").equals("approval")) {
            workflowJobConfiguration = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWorkflowApprovalJobConfiguration();
        } else {
            throw new SyntaxException("Invalid job configuration");
        }

        workflowJobConfiguration.setName(key);

        // Init preSteps, postSteps with correct size
        Matrix matrix = nullJobConfiguration.getMatrix();
        List<Step> preSteps = new ArrayList<>(nullJobConfiguration.getPreSteps());
        List<Step> postSteps = new ArrayList<>(nullJobConfiguration.getPostSteps());

        nullJobConfiguration.getPreSteps().clear();
        nullJobConfiguration.getPostSteps().clear();
        nullJobConfiguration.setMatrix(null);

        workflowJobConfiguration.getPreSteps().addAll(preSteps);
        workflowJobConfiguration.getPostSteps().addAll(postSteps);
        workflowJobConfiguration.setMatrix(matrix);

        workflowJobConfigurations.set(index, workflowJobConfiguration);
        workflowJobConfigurationsTable.put(key, workflowJobConfiguration);

        if (yamlNode.type().equals(Node.SCALAR) || yamlNode.asMapping().yamlMapping(key) == null) {
            return;
        }

        YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping(key);


        if (yamlMapping.string("executor") != null) {
            String executor = yamlMapping.string("executor");
            if (executorsTable.containsKey(executor)) {
                ((WorkflowOrbJobConfiguration) workflowJobConfiguration).setExecutor(executorsTable.get(executor));
            } else {

                throw new SyntaxException("Invalid executor");
            }
        }

        if (yamlMapping.string("name") != null) {
            workflowJobConfiguration.setName(yamlMapping.string("name"));
        }

        if (yamlMapping.string("context") != null) {
            workflowJobConfiguration.getContexts().add(parseExpression(yamlMapping.string("context"), workflowJobConfiguration));
        } else if (yamlMapping.yamlSequence("contexts") != null) {
            workflowJobConfiguration.getContexts().addAll(yamlMapping.yamlSequence("contexts").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(context -> parseExpression(context, workflowJobConfiguration)).toList());
        } else if (yamlMapping.string("contexts") != null) {
            String contexts = yamlMapping.string("contexts");

            if (isList(contexts)) {
                for (String context : parseList(contexts)) {
                    workflowJobConfiguration.getContexts().add(parseExpression(context.trim(), workflowJobConfiguration));
                }
            } else {
                throw new SyntaxException("Contexts must be a sequence");
            }
        }

        if (yamlMapping.yamlMapping("filters") != null) {
            YamlMapping filters = yamlMapping.yamlMapping("filters");

            if (filters.yamlMapping("branches") != null) {
                YamlMapping branches = filters.yamlMapping("branches");

                if (branches.yamlSequence("only") != null) {
                    workflowJobConfiguration.getBranches().addAll(branches.yamlSequence("only").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(branch -> parseExpression(branch, workflowJobConfiguration)).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedBranches(false);
                } else if (branches.string("only") != null) {
                    String only = branches.string("only");

                    if (isList(only)) {
                        for (String branch : parseList(only)) {
                            workflowJobConfiguration.getBranches().add(parseExpression(branch.trim(), workflowJobConfiguration));
                        }
                    } else {
                        workflowJobConfiguration.getBranches().add(parseExpression(only, workflowJobConfiguration));
                    }

                    workflowJobConfiguration.setIgnoreSpecifiedBranches(false);
                } else if (branches.yamlSequence("ignore") != null) {
                    workflowJobConfiguration.getBranches().addAll(branches.yamlSequence("ignore").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(branch -> parseExpression(branch, workflowJobConfiguration)).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedBranches(true);
                } else if (branches.string("ignore") != null) {
                    String ignore = branches.string("ignore");

                    if (isList(ignore)) {
                        for (String branch : parseList(ignore)) {
                            workflowJobConfiguration.getBranches().add(parseExpression(branch.trim(), workflowJobConfiguration));
                        }
                    } else {
                        workflowJobConfiguration.getBranches().add(parseExpression(ignore, workflowJobConfiguration));
                    }

                    workflowJobConfiguration.setIgnoreSpecifiedBranches(true);
                } else {
                    throw new SyntaxException("Invalid branches filters");
                }
            }

            if (filters.yamlMapping("tags") != null) {
                YamlMapping tags = filters.yamlMapping("tags");

                if (tags.yamlSequence("only") != null) {
                    workflowJobConfiguration.getTags().addAll(tags.yamlSequence("only").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(tag -> parseExpression(tag, workflowJobConfiguration)).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedTags(false);
                } else if (tags.string("only") != null) {
                    String only = tags.string("only");

                    if (isList(only)) {
                        for (String tag : parseList(only)) {
                            workflowJobConfiguration.getTags().add(parseExpression(tag.trim(), workflowJobConfiguration));
                        }
                    } else {
                        throw new SyntaxException("Tags must be a sequence");
                    }
                } else if (tags.yamlSequence("ignore") != null) {
                    workflowJobConfiguration.getTags().addAll(tags.yamlSequence("ignore").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(tag -> parseExpression(tag, workflowJobConfiguration)).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedTags(true);
                } else if (tags.string("ignore") != null) {
                    String ignore = tags.string("ignore");

                    if (isList(ignore)) {
                        for (String tag : parseList(ignore)) {
                            workflowJobConfiguration.getTags().add(parseExpression(tag.trim(), workflowJobConfiguration));
                        }
                    } else {
                        throw new SyntaxException("Tags must be a sequence");
                    }
                } else {
                    throw new SyntaxException("Invalid tags filters");
                }
            }
        }

        if (yamlMapping.yamlMapping("matrix") != null) {
            parseMatrix(workflowJobConfiguration.getMatrix(), yamlMapping.yamlMapping("matrix"));
        }

        if (yamlMapping.yamlSequence("pre-steps") != null) {
            parseSteps(workflowJobConfiguration.getPreSteps(), yamlMapping.yamlSequence("pre-steps"));
        }

        if (yamlMapping.yamlSequence("post-steps") != null) {
            parseSteps(workflowJobConfiguration.getPostSteps(), yamlMapping.yamlSequence("post-steps"));
        }
    }

    private void parseMatrix(Matrix matrix, YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.yamlMapping("parameters") != null) {
            parseMatrixParameters(matrix.getParameters(), yamlMapping.yamlMapping("parameters"));
        }

        if (yamlMapping.yamlSequence("exclude") != null) {
            parseMatrixCombinations(matrix.getExcludes(), yamlMapping.yamlSequence("exclude"));
        }

        if (yamlMapping.string("alias") != null) {
            matrix.setAlias(parseExpression(yamlMapping.string("alias"), matrix));
        }
    }

    private void parseMatrixParameters(Collection<MatrixParameter> matrixParameters, YamlMapping parameters) throws SyntaxException {
        for (YamlNode paramKey : parameters.keys()) {
            MatrixParameter matrixParameter = getMatrixParameter(paramKey.asScalar().value(), matrixParameters);
            if (matrixParameter == null)
                throw new RuntimeException("Matrix parameter not found");
            parseMatrixParameter(matrixParameter, parameters.value(paramKey));
        }
    }

    private MatrixParameter getMatrixParameter(String name, Collection<MatrixParameter> matrixParameters) {
        for (MatrixParameter matrixParameter : matrixParameters) {
            if (matrixParameter.getName().getName().equals(name)) {
                return matrixParameter;
            }
        }
        return null;
    }

    private void parseMatrixParameter(MatrixParameter parameter, YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.SCALAR)) {
            String scalar = yamlNode.asScalar().value();

            if (isList(scalar)) {
                for (String part : parseList(scalar)) {
                    parameter.getCells().add(parseExpression(part, parameter));
                }
            } else {
                parameter.getCells().add(parseExpression(scalar, parameter));
            }
        } else if (yamlNode.type().equals(Node.SEQUENCE)) {
            YamlSequence sequence = yamlNode.asSequence();

            for (YamlNode node : sequence) {
                parameter.getCells().add(parseExpression(node.asScalar().value(), parameter));
            }
        } else {
            throw new SyntaxException("Invalid matrix parameter");
        }
    }

    private void parseMatrixCombinations(Collection<MatrixCombination> combinations, YamlSequence yamlSequence) throws SyntaxException {
        for (YamlNode combination : yamlSequence) {
            MatrixCombination matrixCombination = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatrixCombination();

            combinations.add(matrixCombination);

            if (!combination.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid matrix combination");
            }

            matrixCombination.getEntries().putAll(createVariableAssignments(combination.asMapping(), matrixCombination));
        }
    }

    private Map<VariableDeclaration, Expression> createVariableAssignments(YamlMapping yamlMapping, EObject container) throws SyntaxException {
        Map<VariableDeclaration, Expression> variableAssignments = new HashMap<>();

        for (YamlNode key : yamlMapping.keys()) {
            VariableDeclaration variableDeclaration = CircleCIPackage.eINSTANCE.getCircleCIFactory().createVariableDeclaration();
            variableDeclaration.setName(key.asScalar().value());
            variableAssignments.put(variableDeclaration, parseExpression(yamlMapping.string(key), container));
        }

        return variableAssignments;
    }

    private boolean isList(String string) {
        return string.matches("^\\s*\\[\\s*(?:(?:[\\w-.]+|\"(?:[^\"]|\\\\.)*\"|'(?:[^']|\\\\.)*')\\s*(?:,\\s*(?:[\\w-.]+|\"(?:[^\"]|\\\\.)*\"|'(?:[^']|\\\\.)*')\\s*)*)?]\\s*$");
    }

    private List<String> parseList(String string) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("([\\w-.]+|(?:\"(?:[^\"]|\\.)*\")|(?:'(?:[^']|\\\\.)*'))").matcher(string);
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return result;
    }
}