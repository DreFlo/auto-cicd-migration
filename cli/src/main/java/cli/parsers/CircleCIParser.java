package cli.parsers;

import cli.parsers.exceptions.SyntaxException;
import cli.utils.GoogleUtils;
import com.amihaiemil.eoyaml.*;
import com.google.inject.Injector;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

// TODO Parse Job Arguments
public class CircleCIParser extends AbstractParser<Pipeline> {
    @Override
    protected Injector getInjector() {
        return GoogleUtils.getInjector();
    }

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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parsePipeline(yamlMapping);
    }

    private Pipeline parsePipeline(YamlMapping yamlMapping) throws SyntaxException {
        Pipeline pipeline = CircleCIPackage.eINSTANCE.getCircleCIFactory().createPipeline();
        Map<String, Job> jobsTable = new HashMap<>();
        Map<String, Orb> orbsTable = new HashMap<>();
        Map<String, Executor> executorsTable = new HashMap<>();
        Map<String, Command> commandsTable = new HashMap<>();

        if (yamlMapping.string("version") != null) {
            pipeline.setVersion(yamlMapping.string("version"));
        } else {
            throw new SyntaxException("Version is required");
        }

        if (yamlMapping.string("setup") != null) {
            pipeline.setSetup(Boolean.getBoolean(yamlMapping.string("setup")));
        }

        if (yamlMapping.yamlMapping("orbs") != null) {
            pipeline.getOrbs().addAll(parseOrbs(yamlMapping.yamlMapping("orbs"), orbsTable));
        }

        if (yamlMapping.yamlMapping("commands") != null) {
            pipeline.getCommands().addAll(parseCommands(yamlMapping.yamlMapping("commands"), orbsTable, commandsTable));
        }

        if (yamlMapping.yamlMapping("executors") != null) {
            pipeline.getExecutors().addAll(parseExecutors(yamlMapping.yamlMapping("executors"), executorsTable, orbsTable));
        }

        if (yamlMapping.yamlMapping("jobs") != null) {
            pipeline.getJobs().addAll(parseJobs(yamlMapping.yamlMapping("jobs"), jobsTable, executorsTable, orbsTable, commandsTable));
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            pipeline.getParameters().addAll(parseParameters(yamlMapping.yamlMapping("parameters")));
        }

        if (yamlMapping.yamlMapping("workflows") != null) {
            pipeline.getWorkflows().addAll(parseWorkflows(yamlMapping.yamlMapping("workflows"), jobsTable, orbsTable, commandsTable));
        }

        return pipeline;
    }

    private List<Orb> parseOrbs(YamlMapping yamlMapping, Map<String, Orb> orbsTable) throws SyntaxException {
        List<Orb> orbs = new ArrayList<>();

        for (YamlNode orbKey : yamlMapping.keys()) {
            Orb orb;
            if (yamlMapping.value(orbKey).type().equals(Node.MAPPING)) {
                orb = parseOrbDefinition(orbKey.asScalar().value(), yamlMapping.yamlMapping(orbKey));
            } else if (yamlMapping.value(orbKey).type().equals(Node.SCALAR)) {
                orb = parseOrbReference(orbKey.asScalar().value(), yamlMapping.string(orbKey));
            } else {
                throw new SyntaxException("Invalid orb definition");
            }

            orbs.add(orb);
            if (orbsTable != null)
                orbsTable.put(orb.getName(), orb);
        }

        return orbs;
    }

    private OrbReference parseOrbReference(String name, String reference) {
        OrbReference orbReference = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbReference();

        orbReference.setName(name);
        orbReference.setReference(reference);

        return orbReference;
    }

    private OrbDefinition parseOrbDefinition(String name, YamlMapping yamlMapping) throws SyntaxException {
        OrbDefinition orbDefinition = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbDefinition();
        Map<String, Orb> orbsTable = new HashMap<>();
        Map<String, Command> commandsTable = new HashMap<>();
        Map<String, Executor> executorsTable = new HashMap<>();
        Map<String, Job> jobsTable = new HashMap<>();

        orbDefinition.setName(name);

        if (yamlMapping.yamlMapping("orbs") != null) {
            orbDefinition.getOrbs().addAll(parseOrbs(yamlMapping.yamlMapping("orbs"), orbsTable));
        } else if (yamlMapping.value("orbs") != null) {
            throw new SyntaxException("Orbs must be a mapping");
        }

        if (yamlMapping.yamlMapping("commands") != null) {
            orbDefinition.getCommands().addAll(parseCommands(yamlMapping.yamlMapping("commands"), orbsTable, commandsTable));
        } else if (yamlMapping.value("commands") != null) {
            throw new SyntaxException("Commands must be a mapping");
        }

        if (yamlMapping.yamlMapping("executors") != null) {
            orbDefinition.getExecutors().addAll(parseExecutors(yamlMapping.yamlMapping("executors"), executorsTable, orbsTable));
        } else if (yamlMapping.value("executors") != null) {
            throw new SyntaxException("Executors must be a mapping");
        }

        if (yamlMapping.yamlMapping("jobs") != null) {
            orbDefinition.getJobs().addAll(parseJobs(yamlMapping.yamlMapping("jobs"), jobsTable, executorsTable, orbsTable, commandsTable));
        } else if (yamlMapping.value("jobs") != null) {
            throw new SyntaxException("Jobs must be a mapping");
        }

        return orbDefinition;
    }

    private List<Command> parseCommands(YamlMapping yamlMapping, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        List<Command> commands = new ArrayList<>();

        for (YamlNode commandKey : yamlMapping.keys()) {
            commands.add(parseCommand(commandKey.asScalar().value(), yamlMapping.yamlMapping(commandKey), orbsTable, commandsTable));
        }

        return commands;
    }

    private Command parseCommand(String value, YamlMapping yamlMapping, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        Command command = CircleCIPackage.eINSTANCE.getCircleCIFactory().createCommand();

        command.setName(value);

        if (yamlMapping.string("description") != null) {
            command.setDescription(yamlMapping.string("description"));
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            command.getParameters().addAll(parseParameters(yamlMapping.yamlMapping("parameters")));
        }

        if (yamlMapping.yamlSequence("steps") != null) {
            command.getSteps().addAll(parseSteps(yamlMapping.yamlSequence("steps"), orbsTable, commandsTable));
        } else {
            throw new SyntaxException("Steps are required");
        }

        if (commandsTable != null)
            commandsTable.put(command.getName(), command);

        return command;
    }

    private List<Parameter> parseParameters(YamlMapping parameters) throws SyntaxException {
        List<Parameter> params = new ArrayList<>();

        for (YamlNode paramKey : parameters.keys()) {
            params.add(parseParameter(paramKey.asScalar().value(), parameters.yamlMapping(paramKey)));
        }

        return params;
    }

    private Parameter parseParameter(String value, YamlMapping yamlMapping) throws SyntaxException {
        Parameter parameter = CircleCIPackage.eINSTANCE.getCircleCIFactory().createParameter();

        parameter.setName(value);

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

                if (enumString.startsWith("[") && enumString.endsWith("]")) {
                    enumString = enumString.substring(1, enumString.length() - 1);

                    for (String enumValue : enumString.split(",")) {
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
            parameter.setDefault(parseExpression(yamlMapping.string("default")));
        }

        if (yamlMapping.string("description") != null) {
            parameter.setDescription(yamlMapping.string("description"));
        }

        return parameter;
    }

    private Expression parseExpression(String string) {
        List<String> parts = splitExpression(string);

        if (parts.size() == 1) {
            return parseValue(parts.get(0));
        }

        Concat concat = CircleCIPackage.eINSTANCE.getCircleCIFactory().createConcat();

        for (String part : parts) {
            concat.getExpressions().add(parseValue(part));
        }

        return concat;
    }

    private List<String> splitExpression(String string) {
        List<String> parts = new ArrayList<>();

        while (!string.isEmpty()) {
            int splitIndex = string.indexOf("<<");

            if (splitIndex == -1) {
                parts.add(string);
                break;
            } else if (splitIndex == 0) {
                splitIndex = string.indexOf(">>");

                parts.add(string.substring(0, splitIndex + 2));
                string = string.substring(splitIndex + 2);
            } else {
                parts.add(string.substring(0, splitIndex));
                string = string.substring(splitIndex);
            }
        }

        return parts;
    }

    private Value parseValue(String string) {
        if (string.startsWith("<<") && string.endsWith(">>")) {
            return parseVariableDereference(string.substring(2, string.length() - 2));
        } else {
            return parseLiteral(string);
        }
    }

    private VariableDereference parseVariableDereference(String string) {
        VariableDereference variableDereference = CircleCIPackage.eINSTANCE.getCircleCIFactory().createVariableDereference();

        for (String part : string.split("\\.")) {
            variableDereference.getNames().add(part.trim());
        }

        return variableDereference;
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

    private List<Step> parseSteps(YamlSequence yamlSequence, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        List<Step> steps = new ArrayList<>();

        for (YamlNode step : yamlSequence) {
            steps.add(parseStep(step, orbsTable, commandsTable));
        }

        return steps;
    }

    private Step parseStep(YamlNode yamlNode, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        String key;

        if (yamlNode.type().equals(Node.MAPPING)) {
            key = yamlNode.asMapping().keys().iterator().next().asScalar().value();
        } else if (yamlNode.type().equals(Node.SCALAR)) {
            key = yamlNode.asScalar().value();
        } else {
            throw new SyntaxException("Invalid step");
        }

        if (key.equals("run")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid run step");
            }
            return parseRunStep(yamlNode.asMapping().value("run"));
        } else if (key.equals("when")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid run step");
            }
            return parseWhenStep(yamlNode.asMapping().value("when"), orbsTable, commandsTable);
        } else if (key.equals("unless")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid run step");
            }
            return parseUnlessStep(yamlNode.asMapping().value("unless"), orbsTable, commandsTable);
        } else if (key.equals("checkout")) {
            return parseCheckoutStep(yamlNode);
        } else if (key.equals("setup_remote_docker")) {
            return parseSetupRemoteDockerStep(yamlNode);
        } else if (key.equals("save_cache")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid save_cache step");
            }
            return parseSaveCacheStep(yamlNode.asMapping().yamlMapping("save_cache"));
        } else if (key.equals("restore_cache")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid restore_cache step");
            }
            return parseRestoreCacheStep(yamlNode.asMapping().yamlMapping("restore_cache"));
        } else if (key.equals("store_artifacts")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid store_artifacts step");
            }
            return parseStoreArtifactsStep(yamlNode.asMapping().yamlMapping("store_artifacts"));
        } else if (key.equals("store_test_results")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid store_test_results step");
            }
            return parseStoreTestResultsStep(yamlNode.asMapping().yamlMapping("store_test_results"));
        } else if (key.equals("persist_to_workspace")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid persist_to_workspace step");
            }
            return parsePersistToWorkspaceStep(yamlNode.asMapping().yamlMapping("persist_to_workspace"));
        } else if (key.equals("attach_workspace")) {
            if (!yamlNode.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid attach_workspace step");
            }
            return parseAttachWorkspaceStep(yamlNode.asMapping().yamlMapping("attach_workspace"));
        } else if (key.equals("add_ssh_keys")) {
            return parseAddSSHKeysStep(yamlNode);
        } else if (orbsTable.containsKey(key.split("/")[0])) {
            return parseOrbReferenceStep(yamlNode, orbsTable);
        } else if (commandsTable.containsKey(key)) {
            return parseCommandStep(yamlNode, commandsTable);
        } else {
            throw new SyntaxException("Invalid step");
        }
    }

    private RunStep parseRunStep(YamlNode yamlNode) throws SyntaxException {
        RunStep runStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createRunStep();

        if (yamlNode.type().equals(Node.SCALAR)) {
            runStep.setCommand(parseExpression(yamlNode.asScalar().value()));
        } else if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping();

            if (yamlMapping.string("command") != null) {
                runStep.setCommand(parseExpression(yamlMapping.string("command")));
            } else {
                throw new SyntaxException("Command is required");
            }

            if (yamlMapping.string("name") != null) {
                runStep.setName(parseExpression(yamlMapping.string("name")));
            }

            if (yamlMapping.string("shell") != null) {
                runStep.setShell(parseExpression(yamlMapping.string("shell")));
            }

            if (yamlMapping.yamlMapping("environment") != null) {
                runStep.getEnvironmentVariables().putAll(parseVariableAssignments(yamlMapping.yamlMapping("environment")));
            }

            if (yamlMapping.string("background") != null) {
                runStep.setBackground(parseExpression(yamlMapping.string("background")));
            }

            if (yamlMapping.string("working_directory") != null) {
                runStep.setWorkingDirectory(parseExpression(yamlMapping.string("working_directory")));
            }

            if (yamlMapping.string("no_output_timeout") != null) {
                runStep.setNoOutputTimeout(parseExpression(yamlMapping.string("no_output_timeout")));
            }

            if (yamlMapping.string("when") != null) {
                runStep.setWhen(WHEN_TYPE.get(yamlMapping.string("when")));
            }
        } else {
            throw new SyntaxException("Invalid run step");
        }

        return runStep;
    }

    private Map<String, Expression> parseVariableAssignments(YamlMapping environment) throws SyntaxException {
        Map<String, Expression> assignments = new HashMap<>();

        for (YamlNode key : environment.keys()) {
            assignments.put(key.asScalar().value(), parseExpression(environment.string(key)));
        }

        return assignments;
    }

    private ConditionalStep parseConditionalStep(ConditionalStep conditionalStep, YamlNode yamlNode, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING)) {
            throw new SyntaxException("Invalid conditional step");
        }

        YamlMapping yamlMapping = yamlNode.asMapping();

        if (yamlMapping.value("condition") != null) {
            conditionalStep.setCondition(parseLogic(yamlMapping.value("condition")));
        } else {
            throw new SyntaxException("Condition is required");
        }

        if (yamlMapping.yamlSequence("steps") != null) {
            conditionalStep.getSteps().addAll(parseSteps(yamlMapping.yamlSequence("steps"), orbsTable, commandsTable));
        } else {
            throw new SyntaxException("Steps are required");
        }

        return conditionalStep;
    }

    private WhenStep parseWhenStep(YamlNode yamlNode, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        WhenStep whenStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWhenStep();

        return (WhenStep) parseConditionalStep(whenStep, yamlNode, orbsTable, commandsTable);
    }

    private UnlessStep parseUnlessStep(YamlNode yamlNode, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        UnlessStep unlessStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createUnlessStep();

        return (UnlessStep) parseConditionalStep(unlessStep, yamlNode, orbsTable, commandsTable);
    }

    private Logic parseLogic(YamlNode yamlNode) throws SyntaxException {
        if (yamlNode.type().equals(Node.SCALAR)) {
            return parseValue(yamlNode.asScalar().value());
        } else if (yamlNode.type().equals(Node.MAPPING)) {
            return parseOperator(yamlNode.asMapping());
        } else {
            throw new SyntaxException("Invalid logic");
        }
    }

    private Logic parseOperator(YamlMapping yamlMapping) throws SyntaxException {
        if (yamlMapping.yamlSequence("and") != null) {
            And and = CircleCIPackage.eINSTANCE.getCircleCIFactory().createAnd();
            and.getOperands().addAll(parseOperands(yamlMapping.yamlSequence("and")));

            return and;
        } else if (yamlMapping.string("and") != null) {
            And and = CircleCIPackage.eINSTANCE.getCircleCIFactory().createAnd();

            return parseInfinitaryOperatorOperandsFromString(and, yamlMapping.string("and"));
        } else if (yamlMapping.yamlSequence("or") != null) {
            Or or = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOr();
            or.getOperands().addAll(parseOperands(yamlMapping.yamlSequence("or")));

            return or;
        } else if (yamlMapping.string("or") != null) {
            Or or = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOr();

            return parseInfinitaryOperatorOperandsFromString(or, yamlMapping.string("or"));
        } else if (yamlMapping.yamlSequence("equals") != null) {
            Equals equals = CircleCIPackage.eINSTANCE.getCircleCIFactory().createEquals();
            equals.getOperands().addAll(parseOperands(yamlMapping.yamlSequence("equals")));

            return equals;
        } else if (yamlMapping.string("equals") != null) {
            Equals equals = CircleCIPackage.eINSTANCE.getCircleCIFactory().createEquals();

            return parseInfinitaryOperatorOperandsFromString(equals, yamlMapping.string("equals"));
        } else if (yamlMapping.yamlMapping("not") != null) {
            Not not = CircleCIPackage.eINSTANCE.getCircleCIFactory().createNot();
            not.setOperand(parseLogic(yamlMapping.value("not")));

            return not;
        } else if (yamlMapping.yamlMapping("matches") != null) {
            Matches matches = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatches();

            YamlMapping matchesMapping = yamlMapping.yamlMapping("matches");

            if (matchesMapping.string("pattern") != null) {
                matches.setPattern(parseExpression(matchesMapping.string("pattern")));
            } else {
                throw new SyntaxException("Pattern is required");
            }

            if (matchesMapping.string("value") != null) {
                matches.setValue(parseExpression(matchesMapping.string("value")));
            } else {
                throw new SyntaxException("Value is required");
            }

            return matches;
        } else {
            throw new SyntaxException("Invalid operator");
        }
    }

    private InfinitaryOperator parseInfinitaryOperatorOperandsFromString(InfinitaryOperator infinitaryOperator, String listString) throws SyntaxException {
        if (listString.startsWith("[") && listString.endsWith("]")) {
            listString = listString.substring(1, listString.length() - 1);

            listString = Arrays.stream(listString.split(",")).map(String::trim).map(string -> "- " + string).collect(Collectors.joining("\n"));

            try {
                YamlSequence sequence = Yaml.createYamlInput(listString).readYamlSequence();

                infinitaryOperator.getOperands().addAll(parseOperands(sequence));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new SyntaxException("Values must be a sequence");
        }

        return infinitaryOperator;
    }

    private List<Logic> parseOperands(YamlSequence yamlSequence) throws SyntaxException {
        List<Logic> operands = new ArrayList<>();

        for (YamlNode operand : yamlSequence) {
            operands.add(parseLogic(operand));
        }

        return operands;
    }

    private CheckoutStep parseCheckoutStep(YamlNode yamlNode) throws SyntaxException {
        CheckoutStep checkoutStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createCheckoutStep();

        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping("checkout");

            if (yamlMapping.string("path") != null) {
                checkoutStep.setPath(parseExpression(yamlMapping.string("path")));
            } else {
                throw new SyntaxException("Path is required");
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid checkout step");
        }

        return checkoutStep;
    }

    private SetupRemoteDockerStep parseSetupRemoteDockerStep(YamlNode yamlNode) throws SyntaxException {
        SetupRemoteDockerStep setupRemoteDockerStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createSetupRemoteDockerStep();

        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping("setup_remote_docker");

            if (yamlMapping.string("version") != null) {
                setupRemoteDockerStep.setVersion(parseExpression(yamlMapping.string("version")));
            }

            if (yamlMapping.string("docker_layer_caching") != null) {
                setupRemoteDockerStep.setDockerLayerCaching(parseExpression(yamlMapping.string("docker_layer_caching")));
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid setup_remote_docker step");
        }

        return setupRemoteDockerStep;
    }

    private SaveCacheStep parseSaveCacheStep(YamlMapping yamlMapping) throws SyntaxException {
        SaveCacheStep saveCacheStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createSaveCacheStep();

        if (yamlMapping.string("key") != null) {
            saveCacheStep.setKey(parseExpression(yamlMapping.string("key")));
        } else {
            throw new SyntaxException("Key is required");
        }

        if (yamlMapping.yamlSequence("paths") != null) {
            saveCacheStep.getPaths().addAll(yamlMapping.yamlSequence("paths").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
        } else {
            throw new SyntaxException("Paths are required");
        }

        if (yamlMapping.string("when") != null) {
            saveCacheStep.setWhen(WHEN_TYPE.get(yamlMapping.string("when")));
        }

        if (yamlMapping.string("name") != null) {
            saveCacheStep.setName(parseExpression(yamlMapping.string("name")));
        }

        return saveCacheStep;
    }

    private RestoreCacheStep parseRestoreCacheStep(YamlMapping yamlMapping) throws SyntaxException {
        RestoreCacheStep restoreCacheStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createRestoreCacheStep();

        if (yamlMapping.string("key") != null) {
            restoreCacheStep.getKeys().add(parseExpression(yamlMapping.string("key")));
        } else if (yamlMapping.yamlSequence("keys") != null) {
            restoreCacheStep.getKeys().addAll(yamlMapping.yamlSequence("keys").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
        } else if (yamlMapping.string("keys") != null) {
            String keys = yamlMapping.string("keys");

            if (keys.startsWith("[") && keys.endsWith("]")) {
                keys = keys.substring(1, keys.length() - 1);

                for (String key : keys.split(",")) {
                    restoreCacheStep.getKeys().add(parseExpression(key.trim()));
                }
            } else {
                throw new SyntaxException("Keys must be a sequence");
            }

        } else {
            throw new SyntaxException("Key or keys are required");
        }

        if (yamlMapping.string("name") != null) {
            restoreCacheStep.setName(parseExpression(yamlMapping.string("name")));
        }

        return restoreCacheStep;
    }

    private StoreArtifactsStep parseStoreArtifactsStep(YamlMapping yamlMapping) throws SyntaxException {
        StoreArtifactsStep storeArtifactsStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createStoreArtifactsStep();

        if (yamlMapping.string("path") != null) {
            storeArtifactsStep.setPath(parseExpression(yamlMapping.string("path")));
        } else {
            throw new SyntaxException("Path is required");
        }

        if (yamlMapping.string("destination") != null) {
            storeArtifactsStep.setDestination(parseExpression(yamlMapping.string("destination")));
        }

        return storeArtifactsStep;
    }

    private StoreTestResultsStep parseStoreTestResultsStep(YamlMapping yamlMapping) throws SyntaxException {
        StoreTestResultsStep storeTestResultsStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createStoreTestResultsStep();

        if (yamlMapping.string("path") != null) {
            storeTestResultsStep.setPath(parseExpression(yamlMapping.string("path")));
        } else {
            throw new SyntaxException("Path is required");
        }

        return storeTestResultsStep;
    }

    private PersistToWorkspaceStep parsePersistToWorkspaceStep(YamlMapping yamlMapping) throws SyntaxException {
        PersistToWorkspaceStep persistToWorkspaceStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createPersistToWorkspaceStep();

        if (yamlMapping.string("root") != null) {
            persistToWorkspaceStep.setRoot(parseExpression(yamlMapping.string("root")));
        } else {
            throw new SyntaxException("Root is required");
        }

        if (yamlMapping.yamlSequence("paths") != null) {
            persistToWorkspaceStep.getPaths().addAll(yamlMapping.yamlSequence("paths").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
        } else if (yamlMapping.string("paths") != null) {
            String paths = yamlMapping.string("paths");

            if (paths.startsWith("[") && paths.endsWith("]")) {
                paths = paths.substring(1, paths.length() - 1);

                for (String path : paths.split(",")) {
                    persistToWorkspaceStep.getPaths().add(parseExpression(path.trim()));
                }
            } else {
                throw new SyntaxException("Paths must be a sequence");
            }
        } else {
            throw new SyntaxException("Paths are required");
        }

        return persistToWorkspaceStep;
    }

    private AttachWorkspaceStep parseAttachWorkspaceStep(YamlMapping yamlMapping) throws SyntaxException {
        AttachWorkspaceStep attachWorkspaceStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createAttachWorkspaceStep();

        if (yamlMapping.string("at") != null) {
            attachWorkspaceStep.setAt(parseExpression(yamlMapping.string("at")));
        } else {
            throw new SyntaxException("At is required");
        }

        return attachWorkspaceStep;
    }

    private AddSSHKeysStep parseAddSSHKeysStep(YamlNode yamlNode) throws SyntaxException {
        AddSSHKeysStep addSSHKeysStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createAddSSHKeysStep();

        if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping("add_ssh_keys");

            if (yamlMapping.yamlSequence("fingerprints") != null) {
                addSSHKeysStep.getFingerprints().addAll(yamlMapping.yamlSequence("fingerprints").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
            } else if (yamlMapping.string("fingerprints") != null) {
                String fingerprints = yamlMapping.string("fingerprints");

                if (fingerprints.startsWith("[") && fingerprints.endsWith("]")) {
                    fingerprints = fingerprints.substring(1, fingerprints.length() - 1);

                    for (String fingerprint : fingerprints.split(",")) {
                        addSSHKeysStep.getFingerprints().add(parseExpression(fingerprint.trim()));
                    }
                } else {
                    throw new SyntaxException("Fingerprints must be a sequence");
                }
            }
        } else if (!yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid add_ssh_keys step");
        }

        return addSSHKeysStep;
    }

    private OrbReferenceStep parseOrbReferenceStep(YamlNode yamlNode, Map<String, Orb> orbsTable) throws SyntaxException {
        OrbReferenceStep orbReferenceStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbReferenceStep();

        if (yamlNode.type().equals(Node.SCALAR)) {
            String orb = yamlNode.asScalar().value();

            if (orbsTable.containsKey(orb.split("/")[0])) {
                orbReferenceStep.setOrb(orbsTable.get(orb.split("/")[0]));
                orbReferenceStep.setJobName(orb.split("/")[1]);
            } else {
                throw new SyntaxException("Invalid orb reference step");
            }
        } else if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping();

            String orb = yamlMapping.keys().iterator().next().asScalar().value();

            if (orbsTable.containsKey(orb.split("/")[0])) {
                orbReferenceStep.setOrb(orbsTable.get(orb.split("/")[0]));
                orbReferenceStep.setJobName(orb.split("/")[1]);
            } else {
                throw new SyntaxException("Invalid orb reference step");
            }

            if (yamlMapping.yamlMapping(orb) != null) {
                orbReferenceStep.getArguments().putAll(parseVariableAssignments(yamlMapping.yamlMapping(orb)));
            }
        } else {
            throw new SyntaxException("Invalid orb reference step");
        }

        return orbReferenceStep;
    }

    private CommandReferenceStep parseCommandStep(YamlNode yamlNode, Map<String, Command> commandsTable) throws SyntaxException {
        CommandReferenceStep commandReferenceStep = CircleCIPackage.eINSTANCE.getCircleCIFactory().createCommandReferenceStep();

        if (yamlNode.type().equals(Node.SCALAR)) {
            String command = yamlNode.asScalar().value();

            if (commandsTable.containsKey(command)) {
                commandReferenceStep.setCommand(commandsTable.get(command));
            } else {
                throw new SyntaxException("Invalid command reference step");
            }
        } else if (yamlNode.type().equals(Node.MAPPING)) {
            YamlMapping yamlMapping = yamlNode.asMapping();

            String command = yamlMapping.keys().iterator().next().asScalar().value();

            if (commandsTable.containsKey(command)) {
                commandReferenceStep.setCommand(commandsTable.get(command));
            } else {
                throw new SyntaxException("Invalid command reference step");
            }

            if (yamlMapping.yamlMapping(command) != null) {
                commandReferenceStep.getArguments().putAll(parseVariableAssignments(yamlMapping.yamlMapping(command)));
            }
        } else {
            throw new SyntaxException("Invalid command reference step");
        }

        return commandReferenceStep;
    }

    private List<Executor> parseExecutors(YamlMapping yamlMapping, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        List<Executor> executors = new ArrayList<>();

        for (YamlNode executorKey : yamlMapping.keys()) {
            executors.add(parseExecutor(executorKey.asScalar().value(), yamlMapping.yamlMapping(executorKey), executorsTable, orbsTable));
        }

        return executors;
    }

    private Executor parseExecutor(String name, YamlMapping yamlMapping, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        Executor executor;

        if (yamlMapping.yamlSequence("docker") != null) {
            executor = parseDockerExecutor(yamlMapping.yamlSequence("docker"));
        } else if (yamlMapping.yamlMapping("machine") != null) {
            executor = parseMachineExecutor(yamlMapping.yamlMapping("machine"));
        } else if (yamlMapping.yamlMapping("macos") != null) {
            executor = parseMacOSExecutor(yamlMapping.yamlMapping("macos"));
        } else if (yamlMapping.value("executor") != null) {
            YamlNode executorNode = yamlMapping.value("executor");
            String executorName;
            if (executorNode.type().equals(Node.SCALAR))
                executorName = executorNode.asScalar().value();
            else if (executorNode.type().equals(Node.MAPPING) && executorNode.asMapping().string("name") != null) {
                executorName = executorNode.asMapping().string("name");
            } else {
                throw new SyntaxException("Invalid executor");
            }
            executor = parseReferenceExecutor(executorName, executorsTable, orbsTable);
        } else {
            throw new SyntaxException("Invalid executor");
        }

        if (name != null)
            executor.setName(name);

        if (yamlMapping.string("shell") != null) {
            executor.setShell(parseExpression(yamlMapping.string("shell")));
        }

        if (yamlMapping.yamlMapping("environment") != null) {
            executor.getEnvironmentVariables().putAll(parseVariableAssignments(yamlMapping.yamlMapping("environment")));
        }

        if (yamlMapping.string("working_directory") != null) {
            executor.setWorkingDirectory(parseExpression(yamlMapping.string("working_directory")));
        }

        if (yamlMapping.string("resource_class") != null) {
            executor.setResourceClass(parseExpression(yamlMapping.string("resource_class")));
        }

        if (executorsTable != null && name != null)
            executorsTable.put(executor.getName(), executor);

        return executor;
    }

    private DockerExecutor parseDockerExecutor(YamlSequence yamlSequence) throws SyntaxException {
        DockerExecutor dockerExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createDockerExecutor();

        for (YamlNode container : yamlSequence) {
            if (!container.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid docker executor");
            }
            dockerExecutor.getContainers().add(parseDockerContainer(container.asMapping()));
        }

        return dockerExecutor;
    }

    private DockerContainer parseDockerContainer(YamlMapping yamlMapping) throws SyntaxException {
        DockerContainer dockerContainer = CircleCIPackage.eINSTANCE.getCircleCIFactory().createDockerContainer();

        if (yamlMapping.string("image") != null) {
            dockerContainer.setImage(parseExpression(yamlMapping.string("image")));
        } else {
            throw new SyntaxException("Image is required");
        }

        if (yamlMapping.string("name") != null) {
            dockerContainer.setName(parseExpression(yamlMapping.string("name")));
        }

        if (yamlMapping.yamlSequence("entrypoint") != null) {
            dockerContainer.getEntrypoint().addAll(yamlMapping.yamlSequence("entrypoint").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
        } else if (yamlMapping.string("entrypoint") != null) {
            String entrypoint = yamlMapping.string("entrypoint");

            if (entrypoint.startsWith("[") && entrypoint.endsWith("]")) {
                entrypoint = entrypoint.substring(1, entrypoint.length() - 1);

                for (String entry : entrypoint.split(",")) {
                    dockerContainer.getEntrypoint().add(parseExpression(entry.trim()));
                }
            } else {
                throw new SyntaxException("Entrypoint must be a sequence");
            }
        }

        if (yamlMapping.string("command") != null) {
            dockerContainer.getCommand().addAll(yamlMapping.yamlSequence("command").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
        } else if (yamlMapping.string("command") != null) {
            String command = yamlMapping.string("command");

            if (command.startsWith("[") && command.endsWith("]")) {
                command = command.substring(1, command.length() - 1);

                for (String cmd : command.split(",")) {
                    dockerContainer.getCommand().add(parseExpression(cmd.trim()));
                }
            } else {
                throw new SyntaxException("Command must be a sequence");
            }

        }

        if (yamlMapping.string("environment") != null) {
            dockerContainer.getEnvironmentVariables().putAll(parseVariableAssignments(yamlMapping.yamlMapping("environment")));
        }

        if (yamlMapping.string("user") != null) {
            dockerContainer.setUser(parseExpression(yamlMapping.string("user")));
        }

        if (yamlMapping.yamlMapping("auth") != null) {
            YamlMapping auth = yamlMapping.yamlMapping("auth");
            if (auth.string("username") != null) {
                dockerContainer.setUsername(parseExpression(auth.string("username")));
            }
            if (auth.string("password") != null) {
                dockerContainer.setPassword(parseExpression(auth.string("password")));
            }
        }

        if (yamlMapping.yamlMapping("aws_auth") != null) {
            YamlMapping awsAuth = yamlMapping.yamlMapping("aws_auth");
            if (awsAuth.string("aws_access_key_id") != null) {
                dockerContainer.setAwsAccessKeyID(parseExpression(awsAuth.string("aws_access_key_id")));
            }
            if (awsAuth.string("aws_secret_access_key") != null) {
                dockerContainer.setAwsSecretAccessKey(parseExpression(awsAuth.string("aws_secret_access_key")));
            }
            if (awsAuth.string("oidc_role_arn") != null) {
                dockerContainer.setOidc(parseExpression(awsAuth.string("oidc_role_arn")));
            }
        }

        return dockerContainer;
    }

    private MachineExecutor parseMachineExecutor(YamlMapping yamlMapping) throws SyntaxException {
        MachineExecutor machineExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMachineExecutor();

        if (yamlMapping.string("image") != null) {
            machineExecutor.setImage(parseExpression(yamlMapping.string("image")));
        } else {
            throw new SyntaxException("Image is required");
        }

        if (yamlMapping.string("docker_layer_caching") != null) {
            machineExecutor.setDockerLayerCaching(parseExpression(yamlMapping.string("docker_layer_caching")));
        }

        return machineExecutor;
    }

    private MacOSExecutor parseMacOSExecutor(YamlMapping yamlMapping) throws SyntaxException {
        MacOSExecutor macosExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMacOSExecutor();

        if (yamlMapping.string("xcode") != null) {
            macosExecutor.setXcode(parseExpression(yamlMapping.string("xcode")));
        } else {
            throw new SyntaxException("Xcode is required");
        }

        return macosExecutor;
    }

    private ReferenceExecutor parseReferenceExecutor(String name, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable) throws SyntaxException {
        if (executorsTable == null || orbsTable == null) {
            throw new RuntimeException("Executors table is required");
        }
        if (executorsTable.containsKey(name)) {
            ExecutorReferenceExecutor executorReferenceExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createExecutorReferenceExecutor();
            executorReferenceExecutor.setExecutor(executorsTable.get(name));
            
            return executorReferenceExecutor;
        } else if (orbsTable.containsKey(name.split("/")[0])) {
            OrbReferenceExecutor orbReferenceExecutor = CircleCIPackage.eINSTANCE.getCircleCIFactory().createOrbReferenceExecutor();
            orbReferenceExecutor.setOrb(orbsTable.get(name.split("/")[0]));
            orbReferenceExecutor.setOrbExecutorName(name.split("/")[1]);

            return orbReferenceExecutor;
        } else {
            throw new SyntaxException("Executor not found");
        }
    }

    private List<Job> parseJobs(YamlMapping yamlMapping, Map<String, Job> jobsTable, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        List<Job> jobs = new ArrayList<>();

        for (YamlNode jobKey : yamlMapping.keys()) {
            jobs.add(parseJob(jobKey.asScalar().value(), yamlMapping.yamlMapping(jobKey), jobsTable, executorsTable, orbsTable, commandsTable));
        }

        return jobs;
    }

    private Job parseJob(String name, YamlMapping yamlMapping, Map<String, Job> jobsTable, Map<String, Executor> executorsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        Job job = CircleCIPackage.eINSTANCE.getCircleCIFactory().createJob();

        job.setName(name);

        job.setExecutor(parseExecutor(null, yamlMapping, executorsTable, orbsTable));

        if (yamlMapping.yamlSequence("steps") != null) {
            job.getSteps().addAll(parseSteps(yamlMapping.yamlSequence("steps"), orbsTable, commandsTable));
        } else {
            throw new SyntaxException("Steps are required");
        }

        if (yamlMapping.yamlMapping("parameters") != null) {
            job.getParameters().addAll(parseParameters(yamlMapping.yamlMapping("parameters")));
        }

        if (yamlMapping.yamlMapping("environment") != null) {
            job.getEnvironmentVariables().putAll(parseVariableAssignments(yamlMapping.yamlMapping("environment")));
        }

        if (yamlMapping.string("circleci_ip_ranges") != null) {
            job.setCircleCIIPRanges(parseExpression(yamlMapping.string("circleci_ip_ranges")));
        }

        if (yamlMapping.string("parallelism") != null) {
            job.setParallelism(parseExpression(yamlMapping.string("parallelism")));
        }

        if (jobsTable != null && name != null)
            jobsTable.put(job.getName(), job);

        return job;
    }

    private List<Workflow> parseWorkflows(YamlMapping yamlMapping, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        List<Workflow> workflows = new ArrayList<>();

        for (YamlNode workflowKey : yamlMapping.keys()) {
            if (workflowKey.asScalar().value().equals("version")) {
                continue;
            }
            workflows.add(parseWorkflow(workflowKey.asScalar().value(), yamlMapping.yamlMapping(workflowKey), jobsTable, orbsTable, commandsTable));
        }

        return workflows;
    }

    private Workflow parseWorkflow(String name, YamlMapping yamlMapping, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        Workflow workflow = CircleCIPackage.eINSTANCE.getCircleCIFactory().createWorkflow();

        workflow.setName(name);

        if (yamlMapping.value("when") != null) {
            workflow.setCondition(parseLogic(yamlMapping.value("when")));
            workflow.setIsWhen(true);
        } else if (yamlMapping.value("unless") != null) {
            workflow.setCondition(parseLogic(yamlMapping.value("unless")));
            workflow.setIsWhen(false);
        }

        if (yamlMapping.yamlSequence("triggers") != null) {
            workflow.getTriggers().addAll(parseTriggers(yamlMapping.yamlSequence("triggers")));
        }

        if (yamlMapping.yamlSequence("jobs") != null) {
            workflow.getJobs().addAll(parseWorkflowJobConfigurations(yamlMapping.yamlSequence("jobs"), jobsTable, orbsTable, commandsTable));
        } else {
            throw new SyntaxException("Jobs are required");
        }

        return workflow;
    }

    private List<Trigger> parseTriggers(YamlSequence yamlSequence) throws SyntaxException {
        List<Trigger> triggers = new ArrayList<>();

        for (YamlNode trigger : yamlSequence) {
            triggers.add(parseTrigger(trigger));
        }

        return triggers;
    }

    private Trigger parseTrigger(YamlNode yamlNode) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING)) {
            throw new SyntaxException("Invalid trigger");
        }

        YamlMapping yamlMapping = yamlNode.asMapping();

        if (yamlMapping.yamlMapping("schedule") != null) {
            return parseScheduleTrigger(yamlMapping.yamlMapping("schedule"));
        } else {
            throw new SyntaxException("Invalid trigger");
        }
    }

    private ScheduleTrigger parseScheduleTrigger(YamlMapping yamlMapping) throws SyntaxException {
        ScheduleTrigger scheduleTrigger = CircleCIPackage.eINSTANCE.getCircleCIFactory().createScheduleTrigger();

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
                    scheduleTrigger.getBranches().addAll(branches.yamlSequence("only").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
                    scheduleTrigger.setIgnoreSpecifiedBranches(false);
                } else if (branches.string("only") != null ) {
                    String only = branches.string("only");

                    if (only.startsWith("[") && only.endsWith("]")) {
                        only = only.substring(1, only.length() - 1);

                        for (String branch : only.split(",")) {
                            scheduleTrigger.getBranches().add(parseExpression(branch.trim()));
                        }
                    } else {
                        scheduleTrigger.getBranches().add(parseExpression(only));
                    }

                    scheduleTrigger.setIgnoreSpecifiedBranches(false);
                } else if (yamlMapping.yamlSequence("ignore") != null) {
                    scheduleTrigger.getBranches().addAll(branches.yamlSequence("ignore").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
                    scheduleTrigger.setIgnoreSpecifiedBranches(true);
                } else if (yamlMapping.string("ignore") != null) {
                    String ignore = branches.string("ignore");

                    if (ignore.startsWith("[") && ignore.endsWith("]")) {
                        ignore = ignore.substring(1, ignore.length() - 1);

                        for (String branch : ignore.split(",")) {
                            scheduleTrigger.getBranches().add(parseExpression(branch.trim()));
                        }
                    } else {
                        scheduleTrigger.getBranches().add(parseExpression(ignore));
                    }

                    scheduleTrigger.setIgnoreSpecifiedBranches(true);
                } else {
                    throw new SyntaxException("Invalid branches filters");
                }
            }
        }

        return scheduleTrigger;
    }

    private List<WorkflowJobConfiguration> parseWorkflowJobConfigurations(YamlSequence yamlSequence, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        List<WorkflowJobConfiguration> workflowJobConfigurations = new ArrayList<>();
        Map<String, WorkflowJobConfiguration> workflowJobConfigurationsTable = new HashMap<>();

        for (YamlNode job : yamlSequence) {
            workflowJobConfigurations.add(parseWorkflowJobConfiguration(job, workflowJobConfigurationsTable, jobsTable, orbsTable, commandsTable));
        }

        for (YamlNode job : yamlSequence) {
            if (job.type().equals(Node.MAPPING)) {
                String key = job.asMapping().keys().iterator().next().asScalar().value();

                if (job.asMapping().yamlMapping(key) == null) {
                    throw new SyntaxException("Invalid job configuration");
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

        return workflowJobConfigurations;
    }

    private WorkflowJobConfiguration parseWorkflowJobConfiguration(YamlNode yamlNode, Map<String, WorkflowJobConfiguration> workflowJobConfigurationsTable, Map<String, Job> jobsTable, Map<String, Orb> orbsTable, Map<String, Command> commandsTable) throws SyntaxException {
        if (!yamlNode.type().equals(Node.MAPPING) && !yamlNode.type().equals(Node.SCALAR)) {
            throw new SyntaxException("Invalid job configuration");
        }

        String key;
        WorkflowJobConfiguration workflowJobConfiguration;

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

        if (yamlNode.type().equals(Node.SCALAR)) {
            workflowJobConfigurationsTable.put(key, workflowJobConfiguration);
            return workflowJobConfiguration;
        }

        if (yamlNode.asMapping().yamlMapping(key) == null) {
            throw new SyntaxException("Invalid job configuration");
        }

        YamlMapping yamlMapping = yamlNode.asMapping().yamlMapping(key);

        if (yamlMapping.string("name") != null) {
            workflowJobConfiguration.setName(yamlMapping.string("name"));
            key = yamlMapping.string("name");
        }

        if (yamlMapping.string("context") != null) {
            workflowJobConfiguration.getContexts().add(parseExpression(yamlMapping.string("context")));
        } else if (yamlMapping.yamlSequence("contexts") != null) {
            workflowJobConfiguration.getContexts().addAll(yamlMapping.yamlSequence("contexts").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
        } else if (yamlMapping.string("contexts") != null) {
            String contexts = yamlMapping.string("contexts");

            if (contexts.startsWith("[") && contexts.endsWith("]")) {
                contexts = contexts.substring(1, contexts.length() - 1);

                for (String context : contexts.split(",")) {
                    workflowJobConfiguration.getContexts().add(parseExpression(context.trim()));
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
                    workflowJobConfiguration.getBranches().addAll(branches.yamlSequence("only").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedBranches(false);
                } else if (branches.string("only") != null) {
                    String only = branches.string("only");

                    if (only.startsWith("[") && only.endsWith("]")) {
                        only = only.substring(1, only.length() - 1);

                        for (String branch : only.split(",")) {
                            workflowJobConfiguration.getBranches().add(parseExpression(branch.trim()));
                        }
                    } else {
                        workflowJobConfiguration.getBranches().add(parseExpression(only));
                    }

                    workflowJobConfiguration.setIgnoreSpecifiedBranches(false);
                } else if (branches.yamlSequence("ignore") != null) {
                    workflowJobConfiguration.getBranches().addAll(branches.yamlSequence("ignore").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedBranches(true);
                } else if (branches.string("ignore") != null) {
                    String ignore = branches.string("ignore");

                    if (ignore.startsWith("[") && ignore.endsWith("]")) {
                        ignore = ignore.substring(1, ignore.length() - 1);

                        for (String branch : ignore.split(",")) {
                            workflowJobConfiguration.getBranches().add(parseExpression(branch.trim()));
                        }
                    } else {
                        workflowJobConfiguration.getBranches().add(parseExpression(ignore));
                    }

                    workflowJobConfiguration.setIgnoreSpecifiedBranches(true);
                } else {
                    throw new SyntaxException("Invalid branches filters");
                }
            }

            if (filters.yamlMapping("tags") != null) {
                YamlMapping tags = filters.yamlMapping("tags");

                if (tags.yamlSequence("only") != null) {
                    workflowJobConfiguration.getTags().addAll(tags.yamlSequence("only").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedTags(false);
                } else if (tags.string("only") != null) {
                    String only = tags.string("only");

                    if (only.startsWith("[") && only.endsWith("]")) {
                        only = only.substring(1, only.length() - 1);

                        for (String tag : only.split(",")) {
                            workflowJobConfiguration.getTags().add(parseExpression(tag.trim()));
                        }
                    } else {
                        throw new SyntaxException("Tags must be a sequence");
                    }
                } else if (tags.yamlSequence("ignore") != null) {
                    workflowJobConfiguration.getTags().addAll(tags.yamlSequence("ignore").values().stream().map(YamlNode::asScalar).map(Scalar::value).map(this::parseExpression).toList());
                    workflowJobConfiguration.setIgnoreSpecifiedTags(true);
                } else if (tags.string("ignore") != null) {
                    String ignore = tags.string("ignore");

                    if (ignore.startsWith("[") && ignore.endsWith("]")) {
                        ignore = ignore.substring(1, ignore.length() - 1);

                        for (String tag : ignore.split(",")) {
                            workflowJobConfiguration.getTags().add(parseExpression(tag.trim()));
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
            workflowJobConfiguration.setMatrix(parseMatrix(yamlMapping.yamlMapping("matrix")));
        }

        if (yamlMapping.yamlSequence("pre-steps") != null) {
            workflowJobConfiguration.getPreSteps().addAll(parseSteps(yamlMapping.yamlSequence("pre-steps"), orbsTable, commandsTable));
        }

        if (yamlMapping.yamlSequence("post-steps") != null) {
            workflowJobConfiguration.getPostSteps().addAll(parseSteps(yamlMapping.yamlSequence("post-steps"), orbsTable, commandsTable));
        }

        workflowJobConfigurationsTable.put(key, workflowJobConfiguration);

        return workflowJobConfiguration;
    }

    private Matrix parseMatrix(YamlMapping yamlMapping) throws SyntaxException {
        Matrix matrix = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatrix();

        if (yamlMapping.yamlMapping("parameters") != null) {
            matrix.getParameters().addAll(parseMatrixParameters(yamlMapping.yamlMapping("parameters")));
        }

        if (yamlMapping.yamlSequence("exclude") != null) {
            matrix.getExcludes().addAll(parseMatrixCombinations(yamlMapping.yamlSequence("exclude")));
        }

        if (yamlMapping.string("alias") != null) {
            matrix.setAlias(parseExpression(yamlMapping.string("alias")));
        }

        return matrix;
    }

    private List<MatrixParameter> parseMatrixParameters(YamlMapping parameters) throws SyntaxException {
        List<MatrixParameter> params = new ArrayList<>();

        for (YamlNode paramKey : parameters.keys()) {
            params.add(parseMatrixParameter(paramKey.asScalar().value(), parameters.value(paramKey)));
        }

        return params;
    }

    private MatrixParameter parseMatrixParameter(String value, YamlNode yamlNode) throws SyntaxException {
        MatrixParameter parameter = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatrixParameter();

        parameter.setName(value);

        if (yamlNode.type().equals(Node.SCALAR)) {
            String scalar = yamlNode.asScalar().value();

            if (scalar.startsWith("[") && scalar.endsWith("]")) {
                scalar = scalar.substring(1, scalar.length() - 1);

                for (String part : scalar.split(",")) {
                    parameter.getCells().add(parseExpression(part));
                }
            } else {
                parameter.getCells().add(parseExpression(scalar));
            }
        } else if (yamlNode.type().equals(Node.SEQUENCE)) {
            YamlSequence sequence = yamlNode.asSequence();

            for (YamlNode node : sequence) {
                parameter.getCells().add(parseExpression(node.asScalar().value()));
            }
        } else {
            throw new SyntaxException("Invalid matrix parameter");
        }

        return parameter;
    }

    private List<MatrixCombination> parseMatrixCombinations(YamlSequence yamlSequence) throws SyntaxException {
        List<MatrixCombination> combinations = new ArrayList<>();

        for (YamlNode combination : yamlSequence) {
            MatrixCombination matrixCombination = CircleCIPackage.eINSTANCE.getCircleCIFactory().createMatrixCombination();

            if (!combination.type().equals(Node.MAPPING)) {
                throw new SyntaxException("Invalid matrix combination");
            }

            matrixCombination.getEntries().putAll(parseVariableAssignments(combination.asMapping()));

            combinations.add(matrixCombination);
        }

        return combinations;
    }
}