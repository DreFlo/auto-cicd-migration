/**
 */
package GHA.impl;

import GHA.Agent;
import GHA.Always;
import GHA.And;
import GHA.BooleanLiteral;
import GHA.COMPARISON_OPS;
import GHA.CONTEXTS;
import GHA.Cancelled;
import GHA.Command;
import GHA.Concat;
import GHA.ConcurrencyGroup;
import GHA.Contains;
import GHA.Defaults;
import GHA.DoubleLiteral;
import GHA.EQUALITY_OPS;
import GHA.EVENTS;
import GHA.EndsWith;
import GHA.Equality;
import GHA.Expression;
import GHA.Failure;
import GHA.Format;
import GHA.FromJSON;
import GHA.GHAFactory;
import GHA.GHAPackage;
import GHA.GitHubContext;
import GHA.HashFiles;
import GHA.INPUT_TYPES;
import GHA.Input;
import GHA.IntegerLiteral;
import GHA.Join;
import GHA.Matrix;
import GHA.MatrixAxis;
import GHA.MatrixCombination;
import GHA.Not;
import GHA.Or;
import GHA.Output;
import GHA.PERMISSIONS;
import GHA.PERMISSION_SCOPES;
import GHA.PullRequestTrigger;
import GHA.PushTrigger;
import GHA.ReuseWorkflowJob;
import GHA.ScheduleTrigger;
import GHA.ScriptJob;
import GHA.Secret;
import GHA.StagingEnvironment;
import GHA.StandardEventTrigger;
import GHA.StartsWith;
import GHA.StringLiteral;
import GHA.Success;
import GHA.ToJSON;
import GHA.Variable;
import GHA.VariableDereference;
import GHA.WEBHOOK_ACTIVITY_TYPES;
import GHA.Workflow;
import GHA.WorkflowCallTrigger;
import GHA.WorkflowDispatchTrigger;
import GHA.WorkflowRunTrigger;

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
public class GHAFactoryImpl extends EFactoryImpl implements GHAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GHAFactory init() {
		try {
			GHAFactory theGHAFactory = (GHAFactory) EPackage.Registry.INSTANCE.getEFactory(GHAPackage.eNS_URI);
			if (theGHAFactory != null) {
				return theGHAFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GHAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GHAFactoryImpl() {
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
		case GHAPackage.WORKFLOW:
			return createWorkflow();
		case GHAPackage.REUSE_WORKFLOW_JOB:
			return createReuseWorkflowJob();
		case GHAPackage.SCRIPT_JOB:
			return createScriptJob();
		case GHAPackage.AGENT:
			return createAgent();
		case GHAPackage.CONTAINER:
			return createContainer();
		case GHAPackage.SERVICE:
			return (EObject) createService();
		case GHAPackage.STAGING_ENVIRONMENT:
			return createStagingEnvironment();
		case GHAPackage.STANDARD_EVENT_TRIGGER:
			return createStandardEventTrigger();
		case GHAPackage.WORKFLOW_RUN_TRIGGER:
			return createWorkflowRunTrigger();
		case GHAPackage.PULL_REQUEST_TRIGGER:
			return createPullRequestTrigger();
		case GHAPackage.PUSH_TRIGGER:
			return createPushTrigger();
		case GHAPackage.SCHEDULE_TRIGGER:
			return createScheduleTrigger();
		case GHAPackage.WORKFLOW_CALL_TRIGGER:
			return createWorkflowCallTrigger();
		case GHAPackage.WORKFLOW_DISPATCH_TRIGGER:
			return createWorkflowDispatchTrigger();
		case GHAPackage.PERMISSION:
			return (EObject) createPermission();
		case GHAPackage.CONCURRENCY_GROUP:
			return createConcurrencyGroup();
		case GHAPackage.DEFAULTS:
			return createDefaults();
		case GHAPackage.VARIABLE_ASSIGNMENT:
			return (EObject) createVariableAssignment();
		case GHAPackage.CONCAT:
			return createConcat();
		case GHAPackage.EQUALITY:
			return createEquality();
		case GHAPackage.OR:
			return createOr();
		case GHAPackage.AND:
			return createAnd();
		case GHAPackage.NOT:
			return createNot();
		case GHAPackage.CONTAINS:
			return createContains();
		case GHAPackage.STARTS_WITH:
			return createStartsWith();
		case GHAPackage.ENDS_WITH:
			return createEndsWith();
		case GHAPackage.FORMAT:
			return createFormat();
		case GHAPackage.JOIN:
			return createJoin();
		case GHAPackage.TO_JSON:
			return createToJSON();
		case GHAPackage.FROM_JSON:
			return createFromJSON();
		case GHAPackage.HASH_FILES:
			return createHashFiles();
		case GHAPackage.ALWAYS:
			return createAlways();
		case GHAPackage.SUCCESS:
			return createSuccess();
		case GHAPackage.CANCELLED:
			return createCancelled();
		case GHAPackage.FAILURE:
			return createFailure();
		case GHAPackage.STRING_LITERAL:
			return createStringLiteral();
		case GHAPackage.INTEGER_LITERAL:
			return createIntegerLiteral();
		case GHAPackage.DOUBLE_LITERAL:
			return createDoubleLiteral();
		case GHAPackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case GHAPackage.VARIABLE:
			return createVariable();
		case GHAPackage.GIT_HUB_CONTEXT:
			return createGitHubContext();
		case GHAPackage.VARIABLE_DEREFERENCE:
			return createVariableDereference();
		case GHAPackage.MATRIX:
			return createMatrix();
		case GHAPackage.MATRIX_AXIS:
			return createMatrixAxis();
		case GHAPackage.MATRIX_COMBINATION:
			return createMatrixCombination();
		case GHAPackage.COMMAND:
			return createCommand();
		case GHAPackage.PACKAGE:
			return createPackage();
		case GHAPackage.INPUT:
			return createInput();
		case GHAPackage.SECRET:
			return createSecret();
		case GHAPackage.OUTPUT:
			return createOutput();
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
		case GHAPackage.EVENTS:
			return createEVENTSFromString(eDataType, initialValue);
		case GHAPackage.WEBHOOK_ACTIVITY_TYPES:
			return createWEBHOOK_ACTIVITY_TYPESFromString(eDataType, initialValue);
		case GHAPackage.PERMISSION_SCOPES:
			return createPERMISSION_SCOPESFromString(eDataType, initialValue);
		case GHAPackage.PERMISSIONS:
			return createPERMISSIONSFromString(eDataType, initialValue);
		case GHAPackage.EQUALITY_OPS:
			return createEQUALITY_OPSFromString(eDataType, initialValue);
		case GHAPackage.COMPARISON_OPS:
			return createCOMPARISON_OPSFromString(eDataType, initialValue);
		case GHAPackage.CONTEXTS:
			return createCONTEXTSFromString(eDataType, initialValue);
		case GHAPackage.INPUT_TYPES:
			return createINPUT_TYPESFromString(eDataType, initialValue);
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
		case GHAPackage.EVENTS:
			return convertEVENTSToString(eDataType, instanceValue);
		case GHAPackage.WEBHOOK_ACTIVITY_TYPES:
			return convertWEBHOOK_ACTIVITY_TYPESToString(eDataType, instanceValue);
		case GHAPackage.PERMISSION_SCOPES:
			return convertPERMISSION_SCOPESToString(eDataType, instanceValue);
		case GHAPackage.PERMISSIONS:
			return convertPERMISSIONSToString(eDataType, instanceValue);
		case GHAPackage.EQUALITY_OPS:
			return convertEQUALITY_OPSToString(eDataType, instanceValue);
		case GHAPackage.COMPARISON_OPS:
			return convertCOMPARISON_OPSToString(eDataType, instanceValue);
		case GHAPackage.CONTEXTS:
			return convertCONTEXTSToString(eDataType, instanceValue);
		case GHAPackage.INPUT_TYPES:
			return convertINPUT_TYPESToString(eDataType, instanceValue);
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
	public Workflow createWorkflow() {
		WorkflowImpl workflow = new WorkflowImpl();
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReuseWorkflowJob createReuseWorkflowJob() {
		ReuseWorkflowJobImpl reuseWorkflowJob = new ReuseWorkflowJobImpl();
		return reuseWorkflowJob;
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
	public GHA.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, GHA.Container> createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StagingEnvironment createStagingEnvironment() {
		StagingEnvironmentImpl stagingEnvironment = new StagingEnvironmentImpl();
		return stagingEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardEventTrigger createStandardEventTrigger() {
		StandardEventTriggerImpl standardEventTrigger = new StandardEventTriggerImpl();
		return standardEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowRunTrigger createWorkflowRunTrigger() {
		WorkflowRunTriggerImpl workflowRunTrigger = new WorkflowRunTriggerImpl();
		return workflowRunTrigger;
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
	public ScheduleTrigger createScheduleTrigger() {
		ScheduleTriggerImpl scheduleTrigger = new ScheduleTriggerImpl();
		return scheduleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowCallTrigger createWorkflowCallTrigger() {
		WorkflowCallTriggerImpl workflowCallTrigger = new WorkflowCallTriggerImpl();
		return workflowCallTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowDispatchTrigger createWorkflowDispatchTrigger() {
		WorkflowDispatchTriggerImpl workflowDispatchTrigger = new WorkflowDispatchTriggerImpl();
		return workflowDispatchTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<PERMISSION_SCOPES, PERMISSIONS> createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
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
	public Defaults createDefaults() {
		DefaultsImpl defaults = new DefaultsImpl();
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Expression> createVariableAssignment() {
		VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
		return variableAssignment;
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
	public Equality createEquality() {
		EqualityImpl equality = new EqualityImpl();
		return equality;
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
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartsWith createStartsWith() {
		StartsWithImpl startsWith = new StartsWithImpl();
		return startsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndsWith createEndsWith() {
		EndsWithImpl endsWith = new EndsWithImpl();
		return endsWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Format createFormat() {
		FormatImpl format = new FormatImpl();
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToJSON createToJSON() {
		ToJSONImpl toJSON = new ToJSONImpl();
		return toJSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromJSON createFromJSON() {
		FromJSONImpl fromJSON = new FromJSONImpl();
		return fromJSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashFiles createHashFiles() {
		HashFilesImpl hashFiles = new HashFilesImpl();
		return hashFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Always createAlways() {
		AlwaysImpl always = new AlwaysImpl();
		return always;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Success createSuccess() {
		SuccessImpl success = new SuccessImpl();
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cancelled createCancelled() {
		CancelledImpl cancelled = new CancelledImpl();
		return cancelled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Failure createFailure() {
		FailureImpl failure = new FailureImpl();
		return failure;
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
	public GitHubContext createGitHubContext() {
		GitHubContextImpl gitHubContext = new GitHubContextImpl();
		return gitHubContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDereference createVariableDereference() {
		VariableDereferenceImpl variableDereference = new VariableDereferenceImpl();
		return variableDereference;
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
	public GHA.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
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
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
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
	public EVENTS createEVENTSFromString(EDataType eDataType, String initialValue) {
		EVENTS result = EVENTS.get(initialValue);
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
	public String convertEVENTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WEBHOOK_ACTIVITY_TYPES createWEBHOOK_ACTIVITY_TYPESFromString(EDataType eDataType, String initialValue) {
		WEBHOOK_ACTIVITY_TYPES result = WEBHOOK_ACTIVITY_TYPES.get(initialValue);
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
	public String convertWEBHOOK_ACTIVITY_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERMISSION_SCOPES createPERMISSION_SCOPESFromString(EDataType eDataType, String initialValue) {
		PERMISSION_SCOPES result = PERMISSION_SCOPES.get(initialValue);
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
	public String convertPERMISSION_SCOPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERMISSIONS createPERMISSIONSFromString(EDataType eDataType, String initialValue) {
		PERMISSIONS result = PERMISSIONS.get(initialValue);
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
	public String convertPERMISSIONSToString(EDataType eDataType, Object instanceValue) {
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
	public CONTEXTS createCONTEXTSFromString(EDataType eDataType, String initialValue) {
		CONTEXTS result = CONTEXTS.get(initialValue);
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
	public String convertCONTEXTSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INPUT_TYPES createINPUT_TYPESFromString(EDataType eDataType, String initialValue) {
		INPUT_TYPES result = INPUT_TYPES.get(initialValue);
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
	public String convertINPUT_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GHAPackage getGHAPackage() {
		return (GHAPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GHAPackage getPackage() {
		return GHAPackage.eINSTANCE;
	}

} //GHAFactoryImpl
