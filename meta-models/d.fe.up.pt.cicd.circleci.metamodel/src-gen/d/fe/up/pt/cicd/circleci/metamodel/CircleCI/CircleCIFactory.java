/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage
 * @generated
 */
public interface CircleCIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircleCIFactory eINSTANCE = d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Orb Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orb Reference</em>'.
	 * @generated
	 */
	OrbReference createOrbReference();

	/**
	 * Returns a new object of class '<em>Orb Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orb Definition</em>'.
	 * @generated
	 */
	OrbDefinition createOrbDefinition();

	/**
	 * Returns a new object of class '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command</em>'.
	 * @generated
	 */
	Command createCommand();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Docker Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Executor</em>'.
	 * @generated
	 */
	DockerExecutor createDockerExecutor();

	/**
	 * Returns a new object of class '<em>Docker Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Container</em>'.
	 * @generated
	 */
	DockerContainer createDockerContainer();

	/**
	 * Returns a new object of class '<em>Machine Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine Executor</em>'.
	 * @generated
	 */
	MachineExecutor createMachineExecutor();

	/**
	 * Returns a new object of class '<em>Mac OS Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mac OS Executor</em>'.
	 * @generated
	 */
	MacOSExecutor createMacOSExecutor();

	/**
	 * Returns a new object of class '<em>Windows Orb Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Windows Orb Executor</em>'.
	 * @generated
	 */
	WindowsOrbExecutor createWindowsOrbExecutor();

	/**
	 * Returns a new object of class '<em>Executor Reference Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Executor Reference Executor</em>'.
	 * @generated
	 */
	ExecutorReferenceExecutor createExecutorReferenceExecutor();

	/**
	 * Returns a new object of class '<em>Orb Reference Executor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orb Reference Executor</em>'.
	 * @generated
	 */
	OrbReferenceExecutor createOrbReferenceExecutor();

	/**
	 * Returns a new object of class '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Job</em>'.
	 * @generated
	 */
	Job createJob();

	/**
	 * Returns a new object of class '<em>Run Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Step</em>'.
	 * @generated
	 */
	RunStep createRunStep();

	/**
	 * Returns a new object of class '<em>When Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Step</em>'.
	 * @generated
	 */
	WhenStep createWhenStep();

	/**
	 * Returns a new object of class '<em>Unless Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unless Step</em>'.
	 * @generated
	 */
	UnlessStep createUnlessStep();

	/**
	 * Returns a new object of class '<em>Checkout Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkout Step</em>'.
	 * @generated
	 */
	CheckoutStep createCheckoutStep();

	/**
	 * Returns a new object of class '<em>Setup Remote Docker Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setup Remote Docker Step</em>'.
	 * @generated
	 */
	SetupRemoteDockerStep createSetupRemoteDockerStep();

	/**
	 * Returns a new object of class '<em>Save Cache Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Save Cache Step</em>'.
	 * @generated
	 */
	SaveCacheStep createSaveCacheStep();

	/**
	 * Returns a new object of class '<em>Restore Cache Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restore Cache Step</em>'.
	 * @generated
	 */
	RestoreCacheStep createRestoreCacheStep();

	/**
	 * Returns a new object of class '<em>Store Artifacts Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Artifacts Step</em>'.
	 * @generated
	 */
	StoreArtifactsStep createStoreArtifactsStep();

	/**
	 * Returns a new object of class '<em>Store Test Results Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Store Test Results Step</em>'.
	 * @generated
	 */
	StoreTestResultsStep createStoreTestResultsStep();

	/**
	 * Returns a new object of class '<em>Persist To Workspace Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persist To Workspace Step</em>'.
	 * @generated
	 */
	PersistToWorkspaceStep createPersistToWorkspaceStep();

	/**
	 * Returns a new object of class '<em>Attach Workspace Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attach Workspace Step</em>'.
	 * @generated
	 */
	AttachWorkspaceStep createAttachWorkspaceStep();

	/**
	 * Returns a new object of class '<em>Add SSH Keys Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add SSH Keys Step</em>'.
	 * @generated
	 */
	AddSSHKeysStep createAddSSHKeysStep();

	/**
	 * Returns a new object of class '<em>Orb Reference Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orb Reference Step</em>'.
	 * @generated
	 */
	OrbReferenceStep createOrbReferenceStep();

	/**
	 * Returns a new object of class '<em>Command Reference Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Reference Step</em>'.
	 * @generated
	 */
	CommandReferenceStep createCommandReferenceStep();

	/**
	 * Returns a new object of class '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * Returns a new object of class '<em>Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schedule Trigger</em>'.
	 * @generated
	 */
	ScheduleTrigger createScheduleTrigger();

	/**
	 * Returns a new object of class '<em>Workflow Defined Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Defined Job Configuration</em>'.
	 * @generated
	 */
	WorkflowDefinedJobConfiguration createWorkflowDefinedJobConfiguration();

	/**
	 * Returns a new object of class '<em>Workflow Approval Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Approval Job Configuration</em>'.
	 * @generated
	 */
	WorkflowApprovalJobConfiguration createWorkflowApprovalJobConfiguration();

	/**
	 * Returns a new object of class '<em>Workflow Orb Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Orb Job Configuration</em>'.
	 * @generated
	 */
	WorkflowOrbJobConfiguration createWorkflowOrbJobConfiguration();

	/**
	 * Returns a new object of class '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix</em>'.
	 * @generated
	 */
	Matrix createMatrix();

	/**
	 * Returns a new object of class '<em>Matrix Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix Parameter</em>'.
	 * @generated
	 */
	MatrixParameter createMatrixParameter();

	/**
	 * Returns a new object of class '<em>Matrix Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix Combination</em>'.
	 * @generated
	 */
	MatrixCombination createMatrixCombination();

	/**
	 * Returns a new object of class '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concat</em>'.
	 * @generated
	 */
	Concat createConcat();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equals</em>'.
	 * @generated
	 */
	Equals createEquals();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns a new object of class '<em>Matches</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matches</em>'.
	 * @generated
	 */
	Matches createMatches();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Literal</em>'.
	 * @generated
	 */
	DoubleLiteral createDoubleLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Variable Dereference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Dereference</em>'.
	 * @generated
	 */
	VariableDereference createVariableDereference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CircleCIPackage getCircleCIPackage();

} //CircleCIFactory
