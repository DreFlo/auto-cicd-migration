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
		case CICDPackage.SCRIPT_JOB:
			return createScriptJob();
		case CICDPackage.PIPELINE_CALL_JOB:
			return createPipelineCallJob();
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
		case CICDPackage.CHECKOUT:
			return createCheckout();
		case CICDPackage.VARIABLE_DECLARATION:
			return createVariableDeclaration();
		case CICDPackage.ASSIGNMENT:
			return (EObject) createAssignment();
		case CICDPackage.CONCAT:
			return createConcat();
		case CICDPackage.STRING_LITERAL:
			return createStringLiteral();
		case CICDPackage.INTEGER_LITERAL:
			return createIntegerLiteral();
		case CICDPackage.DOUBLE_LITERAL:
			return createDoubleLiteral();
		case CICDPackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case CICDPackage.VARIABLE_REFERENCE:
			return createVariableReference();
		case CICDPackage.VARIABLE_CONTEXT:
			return createVariableContext();
		case CICDPackage.BUILT_IN_FUNCTION:
			return createBuiltInFunction();
		case CICDPackage.EQUALITY_OP:
			return createEqualityOp();
		case CICDPackage.COMPARISON_OP:
			return createComparisonOp();
		case CICDPackage.DOT_OP:
			return createDotOp();
		case CICDPackage.AND:
			return createAnd();
		case CICDPackage.OR:
			return createOr();
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
		case CICDPackage.SHELL_TYPE:
			return createSHELL_TYPEFromString(eDataType, initialValue);
		case CICDPackage.INPUT_TYPE:
			return createINPUT_TYPEFromString(eDataType, initialValue);
		case CICDPackage.EQUALITY_OPS:
			return createEQUALITY_OPSFromString(eDataType, initialValue);
		case CICDPackage.COMPARISON_OPS:
			return createCOMPARISON_OPSFromString(eDataType, initialValue);
		case CICDPackage.VARIABLE_CONTEXTS:
			return createVARIABLE_CONTEXTSFromString(eDataType, initialValue);
		case CICDPackage.CACHE_MODE:
			return createCACHE_MODEFromString(eDataType, initialValue);
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
		case CICDPackage.SHELL_TYPE:
			return convertSHELL_TYPEToString(eDataType, instanceValue);
		case CICDPackage.INPUT_TYPE:
			return convertINPUT_TYPEToString(eDataType, instanceValue);
		case CICDPackage.EQUALITY_OPS:
			return convertEQUALITY_OPSToString(eDataType, instanceValue);
		case CICDPackage.COMPARISON_OPS:
			return convertCOMPARISON_OPSToString(eDataType, instanceValue);
		case CICDPackage.VARIABLE_CONTEXTS:
			return convertVARIABLE_CONTEXTSToString(eDataType, instanceValue);
		case CICDPackage.CACHE_MODE:
			return convertCACHE_MODEToString(eDataType, instanceValue);
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
	public ScriptJob createScriptJob() {
		ScriptJobImpl scriptJob = new ScriptJobImpl();
		return scriptJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineCallJob createPipelineCallJob() {
		PipelineCallJobImpl pipelineCallJob = new PipelineCallJobImpl();
		return pipelineCallJob;
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
	@Override
	public Checkout createCheckout() {
		CheckoutImpl checkout = new CheckoutImpl();
		return checkout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<VariableDeclaration, Expression> createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concat createConcat() {
		ConcatImpl concat = new ConcatImpl();
		return concat;
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
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleLiteral createDoubleLiteral() {
		DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
		return doubleLiteral;
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
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableContext createVariableContext() {
		VariableContextImpl variableContext = new VariableContextImpl();
		return variableContext;
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
	public EqualityOp createEqualityOp() {
		EqualityOpImpl equalityOp = new EqualityOpImpl();
		return equalityOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOp createComparisonOp() {
		ComparisonOpImpl comparisonOp = new ComparisonOpImpl();
		return comparisonOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DotOp createDotOp() {
		DotOpImpl dotOp = new DotOpImpl();
		return dotOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
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
	public SHELL_TYPE createSHELL_TYPEFromString(EDataType eDataType, String initialValue) {
		SHELL_TYPE result = SHELL_TYPE.get(initialValue);
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
	public String convertSHELL_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INPUT_TYPE createINPUT_TYPEFromString(EDataType eDataType, String initialValue) {
		INPUT_TYPE result = INPUT_TYPE.get(initialValue);
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
	public String convertINPUT_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQUALITY_OPS createEQUALITY_OPSFromString(EDataType eDataType, String initialValue) {
		EQUALITY_OPS result = EQUALITY_OPS.get(initialValue);
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
	public String convertEQUALITY_OPSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMPARISON_OPS createCOMPARISON_OPSFromString(EDataType eDataType, String initialValue) {
		COMPARISON_OPS result = COMPARISON_OPS.get(initialValue);
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
	public String convertCOMPARISON_OPSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARIABLE_CONTEXTS createVARIABLE_CONTEXTSFromString(EDataType eDataType, String initialValue) {
		VARIABLE_CONTEXTS result = VARIABLE_CONTEXTS.get(initialValue);
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
	public String convertVARIABLE_CONTEXTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CACHE_MODE createCACHE_MODEFromString(EDataType eDataType, String initialValue) {
		CACHE_MODE result = CACHE_MODE.get(initialValue);
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
	public String convertCACHE_MODEToString(EDataType eDataType, Object instanceValue) {
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
