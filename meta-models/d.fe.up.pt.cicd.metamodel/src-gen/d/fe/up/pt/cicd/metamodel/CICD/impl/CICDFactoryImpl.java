/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CICDFactoryImpl extends EFactoryImpl implements CICDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CICDFactory init() {
		try {
			CICDFactory theCICDFactory = (CICDFactory) EPackage.Registry.INSTANCE.getEFactory(CICDPackage.eNS_URI);
			if (theCICDFactory != null) {
				return theCICDFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CICDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CICDPackage.PIPELINE:
			return createPipeline();
		case CICDPackage.JOB:
			return createJob();
		case CICDPackage.AGENT:
			return createAgent();
		case CICDPackage.DOCKER_CONTAINER:
			return createDockerContainer();
		case CICDPackage.PUSH_TRIGGER:
			return createPushTrigger();
		case CICDPackage.PULL_REQUEST_TRIGGER:
			return createPullRequestTrigger();
		case CICDPackage.MANUAL_TRIGGER:
			return createManualTrigger();
		case CICDPackage.SCHEDULED_TRIGGER:
			return createScheduledTrigger();
		case CICDPackage.WEBHOOK_TRIGGER:
			return createWebhookTrigger();
		case CICDPackage.CONCURRENCY_GROUP:
			return createConcurrencyGroup();
		case CICDPackage.PERMISSION:
			return (EObject) createPermission();
		case CICDPackage.MATRIX:
			return createMatrix();
		case CICDPackage.MATRIX_AXIS:
			return createMatrixAxis();
		case CICDPackage.MATRIX_COMBINATION:
			return createMatrixCombination();
		case CICDPackage.INPUT:
			return createInput();
		case CICDPackage.OUTPUT:
			return createOutput();
		case CICDPackage.CONDITIONAL_STEP:
			return createConditionalStep();
		case CICDPackage.COMMAND:
			return createCommand();
		case CICDPackage.PLUGIN:
			return createPlugin();
		case CICDPackage.CACHE:
			return createCache();
		case CICDPackage.ARTIFACT:
			return createArtifact();
		case CICDPackage.ASSIGNMENT:
			return (EObject) createAssignment();
		case CICDPackage.VALUE:
			return createValue();
		case CICDPackage.LITERAL:
			return createLiteral();
		case CICDPackage.STRING_LITERAL:
			return createStringLiteral();
		case CICDPackage.NUMBER_LITERAL:
			return createNumberLiteral();
		case CICDPackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case CICDPackage.VARIABLE:
			return createVariable();
		case CICDPackage.ENVIRONMENT_VARIABLE:
			return createEnvironmentVariable();
		case CICDPackage.SECRET_VARIABLE:
			return createSecretVariable();
		case CICDPackage.BUILT_IN_FUNCTION:
			return createBuiltInFunction();
		case CICDPackage.BINARY_OP:
			return createBinaryOp();
		case CICDPackage.CONJUNTION:
			return createConjuntion();
		case CICDPackage.DISJUNCTION:
			return createDisjunction();
		case CICDPackage.ADDITION:
			return createAddition();
		case CICDPackage.SUBTRACTION:
			return createSubtraction();
		case CICDPackage.UNARY_OP:
			return createUnaryOp();
		case CICDPackage.NEGATION:
			return createNegation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CICDPackage.PERMISSION_TYPE:
			return createPermissionTypeFromString(eDataType, initialValue);
		case CICDPackage.SHELL_TYPE:
			return createShellTypeFromString(eDataType, initialValue);
		case CICDPackage.INPUT_TYPE:
			return createInputTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CICDPackage.PERMISSION_TYPE:
			return convertPermissionTypeToString(eDataType, instanceValue);
		case CICDPackage.SHELL_TYPE:
			return convertShellTypeToString(eDataType, instanceValue);
		case CICDPackage.INPUT_TYPE:
			return convertInputTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerContainer createDockerContainer() {
		DockerContainerImpl dockerContainer = new DockerContainerImpl();
		return dockerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PushTrigger createPushTrigger() {
		PushTriggerImpl pushTrigger = new PushTriggerImpl();
		return pushTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PullRequestTrigger createPullRequestTrigger() {
		PullRequestTriggerImpl pullRequestTrigger = new PullRequestTriggerImpl();
		return pullRequestTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManualTrigger createManualTrigger() {
		ManualTriggerImpl manualTrigger = new ManualTriggerImpl();
		return manualTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledTrigger createScheduledTrigger() {
		ScheduledTriggerImpl scheduledTrigger = new ScheduledTriggerImpl();
		return scheduledTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebhookTrigger createWebhookTrigger() {
		WebhookTriggerImpl webhookTrigger = new WebhookTriggerImpl();
		return webhookTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyGroup createConcurrencyGroup() {
		ConcurrencyGroupImpl concurrencyGroup = new ConcurrencyGroupImpl();
		return concurrencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, PermissionType> createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixAxis createMatrixAxis() {
		MatrixAxisImpl matrixAxis = new MatrixAxisImpl();
		return matrixAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MatrixCombination createMatrixCombination() {
		MatrixCombinationImpl matrixCombination = new MatrixCombinationImpl();
		return matrixCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalStep createConditionalStep() {
		ConditionalStepImpl conditionalStep = new ConditionalStepImpl();
		return conditionalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<EnvironmentVariable, Expression> createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral createNumberLiteral() {
		NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
		return numberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentVariable createEnvironmentVariable() {
		EnvironmentVariableImpl environmentVariable = new EnvironmentVariableImpl();
		return environmentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretVariable createSecretVariable() {
		SecretVariableImpl secretVariable = new SecretVariableImpl();
		return secretVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuiltInFunction createBuiltInFunction() {
		BuiltInFunctionImpl builtInFunction = new BuiltInFunctionImpl();
		return builtInFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOp createBinaryOp() {
		BinaryOpImpl binaryOp = new BinaryOpImpl();
		return binaryOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjuntion createConjuntion() {
		ConjuntionImpl conjuntion = new ConjuntionImpl();
		return conjuntion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Disjunction createDisjunction() {
		DisjunctionImpl disjunction = new DisjunctionImpl();
		return disjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Addition createAddition() {
		AdditionImpl addition = new AdditionImpl();
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subtraction createSubtraction() {
		SubtractionImpl subtraction = new SubtractionImpl();
		return subtraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOp createUnaryOp() {
		UnaryOpImpl unaryOp = new UnaryOpImpl();
		return unaryOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionType createPermissionTypeFromString(EDataType eDataType, String initialValue) {
		PermissionType result = PermissionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPermissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShellType createShellTypeFromString(EDataType eDataType, String initialValue) {
		ShellType result = ShellType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShellTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputTypeFromString(EDataType eDataType, String initialValue) {
		InputType result = InputType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICDPackage getCICDPackage() {
		return (CICDPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CICDPackage getPackage() {
		return CICDPackage.eINSTANCE;
	}

} //CICDFactoryImpl
