/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;

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
public class CircleCIFactoryImpl extends EFactoryImpl implements CircleCIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CircleCIFactory init() {
		try {
			CircleCIFactory theCircleCIFactory = (CircleCIFactory) EPackage.Registry.INSTANCE
					.getEFactory(CircleCIPackage.eNS_URI);
			if (theCircleCIFactory != null) {
				return theCircleCIFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CircleCIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleCIFactoryImpl() {
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
		case CircleCIPackage.PIPELINE:
			return createPipeline();
		case CircleCIPackage.ORB_REFERENCE:
			return createOrbReference();
		case CircleCIPackage.ORB_DEFINITION:
			return createOrbDefinition();
		case CircleCIPackage.COMMAND:
			return createCommand();
		case CircleCIPackage.PARAMETER:
			return createParameter();
		case CircleCIPackage.DOCKER_EXECUTOR:
			return createDockerExecutor();
		case CircleCIPackage.DOCKER_CONTAINER:
			return createDockerContainer();
		case CircleCIPackage.MACHINE_EXECUTOR:
			return createMachineExecutor();
		case CircleCIPackage.MAC_OS_EXECUTOR:
			return createMacOSExecutor();
		case CircleCIPackage.WINDOWS_ORB_EXECUTOR:
			return createWindowsOrbExecutor();
		case CircleCIPackage.EXECUTOR_REFERENCE_EXECUTOR:
			return createExecutorReferenceExecutor();
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR:
			return createOrbReferenceExecutor();
		case CircleCIPackage.JOB:
			return createJob();
		case CircleCIPackage.RUN_STEP:
			return createRunStep();
		case CircleCIPackage.WHEN_STEP:
			return createWhenStep();
		case CircleCIPackage.UNLESS_STEP:
			return createUnlessStep();
		case CircleCIPackage.CHECKOUT_STEP:
			return createCheckoutStep();
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP:
			return createSetupRemoteDockerStep();
		case CircleCIPackage.SAVE_CACHE_STEP:
			return createSaveCacheStep();
		case CircleCIPackage.RESTORE_CACHE_STEP:
			return createRestoreCacheStep();
		case CircleCIPackage.STORE_ARTIFACTS_STEP:
			return createStoreArtifactsStep();
		case CircleCIPackage.STORE_TEST_RESULTS_STEP:
			return createStoreTestResultsStep();
		case CircleCIPackage.PERSIST_TO_WORKSPACE_STEP:
			return createPersistToWorkspaceStep();
		case CircleCIPackage.ATTACH_WORKSPACE_STEP:
			return createAttachWorkspaceStep();
		case CircleCIPackage.ADD_SSH_KEYS_STEP:
			return createAddSSHKeysStep();
		case CircleCIPackage.VARIABLE_ASSIGNMENT:
			return (EObject) createVariableAssignment();
		case CircleCIPackage.WORKFLOW:
			return createWorkflow();
		case CircleCIPackage.SCHEDULE_TRIGGER:
			return createScheduleTrigger();
		case CircleCIPackage.WORKFLOW_DEFINED_JOB_CONFIGURATION:
			return createWorkflowDefinedJobConfiguration();
		case CircleCIPackage.WORKFLOW_APPROVAL_JOB_CONFIGURATION:
			return createWorkflowApprovalJobConfiguration();
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION:
			return createWorkflowOrbJobConfiguration();
		case CircleCIPackage.MATRIX:
			return createMatrix();
		case CircleCIPackage.MATRIX_PARAMETER:
			return createMatrixParameter();
		case CircleCIPackage.MATRIX_COMBINATION:
			return createMatrixCombination();
		case CircleCIPackage.CONCAT:
			return createConcat();
		case CircleCIPackage.AND:
			return createAnd();
		case CircleCIPackage.OR:
			return createOr();
		case CircleCIPackage.EQUALS:
			return createEquals();
		case CircleCIPackage.NOT:
			return createNot();
		case CircleCIPackage.MATCHES:
			return createMatches();
		case CircleCIPackage.STRING_LITERAL:
			return createStringLiteral();
		case CircleCIPackage.INTEGER_LITERAL:
			return createIntegerLiteral();
		case CircleCIPackage.DOUBLE_LITERAL:
			return createDoubleLiteral();
		case CircleCIPackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case CircleCIPackage.VARIABLE_DEREFERENCE:
			return createVariableDereference();
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
		case CircleCIPackage.PARAMETER_TYPES:
			return createPARAMETER_TYPESFromString(eDataType, initialValue);
		case CircleCIPackage.WHEN_TYPE:
			return createWHEN_TYPEFromString(eDataType, initialValue);
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
		case CircleCIPackage.PARAMETER_TYPES:
			return convertPARAMETER_TYPESToString(eDataType, instanceValue);
		case CircleCIPackage.WHEN_TYPE:
			return convertWHEN_TYPEToString(eDataType, instanceValue);
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
	public OrbReference createOrbReference() {
		OrbReferenceImpl orbReference = new OrbReferenceImpl();
		return orbReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrbDefinition createOrbDefinition() {
		OrbDefinitionImpl orbDefinition = new OrbDefinitionImpl();
		return orbDefinition;
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
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerExecutor createDockerExecutor() {
		DockerExecutorImpl dockerExecutor = new DockerExecutorImpl();
		return dockerExecutor;
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
	public MachineExecutor createMachineExecutor() {
		MachineExecutorImpl machineExecutor = new MachineExecutorImpl();
		return machineExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacOSExecutor createMacOSExecutor() {
		MacOSExecutorImpl macOSExecutor = new MacOSExecutorImpl();
		return macOSExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WindowsOrbExecutor createWindowsOrbExecutor() {
		WindowsOrbExecutorImpl windowsOrbExecutor = new WindowsOrbExecutorImpl();
		return windowsOrbExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutorReferenceExecutor createExecutorReferenceExecutor() {
		ExecutorReferenceExecutorImpl executorReferenceExecutor = new ExecutorReferenceExecutorImpl();
		return executorReferenceExecutor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrbReferenceExecutor createOrbReferenceExecutor() {
		OrbReferenceExecutorImpl orbReferenceExecutor = new OrbReferenceExecutorImpl();
		return orbReferenceExecutor;
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
	public RunStep createRunStep() {
		RunStepImpl runStep = new RunStepImpl();
		return runStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenStep createWhenStep() {
		WhenStepImpl whenStep = new WhenStepImpl();
		return whenStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnlessStep createUnlessStep() {
		UnlessStepImpl unlessStep = new UnlessStepImpl();
		return unlessStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CheckoutStep createCheckoutStep() {
		CheckoutStepImpl checkoutStep = new CheckoutStepImpl();
		return checkoutStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetupRemoteDockerStep createSetupRemoteDockerStep() {
		SetupRemoteDockerStepImpl setupRemoteDockerStep = new SetupRemoteDockerStepImpl();
		return setupRemoteDockerStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SaveCacheStep createSaveCacheStep() {
		SaveCacheStepImpl saveCacheStep = new SaveCacheStepImpl();
		return saveCacheStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestoreCacheStep createRestoreCacheStep() {
		RestoreCacheStepImpl restoreCacheStep = new RestoreCacheStepImpl();
		return restoreCacheStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreArtifactsStep createStoreArtifactsStep() {
		StoreArtifactsStepImpl storeArtifactsStep = new StoreArtifactsStepImpl();
		return storeArtifactsStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreTestResultsStep createStoreTestResultsStep() {
		StoreTestResultsStepImpl storeTestResultsStep = new StoreTestResultsStepImpl();
		return storeTestResultsStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersistToWorkspaceStep createPersistToWorkspaceStep() {
		PersistToWorkspaceStepImpl persistToWorkspaceStep = new PersistToWorkspaceStepImpl();
		return persistToWorkspaceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachWorkspaceStep createAttachWorkspaceStep() {
		AttachWorkspaceStepImpl attachWorkspaceStep = new AttachWorkspaceStepImpl();
		return attachWorkspaceStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddSSHKeysStep createAddSSHKeysStep() {
		AddSSHKeysStepImpl addSSHKeysStep = new AddSSHKeysStepImpl();
		return addSSHKeysStep;
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
	public WorkflowDefinedJobConfiguration createWorkflowDefinedJobConfiguration() {
		WorkflowDefinedJobConfigurationImpl workflowDefinedJobConfiguration = new WorkflowDefinedJobConfigurationImpl();
		return workflowDefinedJobConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowApprovalJobConfiguration createWorkflowApprovalJobConfiguration() {
		WorkflowApprovalJobConfigurationImpl workflowApprovalJobConfiguration = new WorkflowApprovalJobConfigurationImpl();
		return workflowApprovalJobConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowOrbJobConfiguration createWorkflowOrbJobConfiguration() {
		WorkflowOrbJobConfigurationImpl workflowOrbJobConfiguration = new WorkflowOrbJobConfigurationImpl();
		return workflowOrbJobConfiguration;
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
	public MatrixParameter createMatrixParameter() {
		MatrixParameterImpl matrixParameter = new MatrixParameterImpl();
		return matrixParameter;
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
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
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
	public Matches createMatches() {
		MatchesImpl matches = new MatchesImpl();
		return matches;
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
	public VariableDereference createVariableDereference() {
		VariableDereferenceImpl variableDereference = new VariableDereferenceImpl();
		return variableDereference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARAMETER_TYPES createPARAMETER_TYPESFromString(EDataType eDataType, String initialValue) {
		PARAMETER_TYPES result = PARAMETER_TYPES.get(initialValue);
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
	public String convertPARAMETER_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WHEN_TYPE createWHEN_TYPEFromString(EDataType eDataType, String initialValue) {
		WHEN_TYPE result = WHEN_TYPE.get(initialValue);
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
	public String convertWHEN_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleCIPackage getCircleCIPackage() {
		return (CircleCIPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CircleCIPackage getPackage() {
		return CircleCIPackage.eINSTANCE;
	}

} //CircleCIFactoryImpl
