/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.util;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage
 * @generated
 */
public class CircleCIAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircleCIPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleCIAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CircleCIPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleCISwitch<Adapter> modelSwitch = new CircleCISwitch<Adapter>() {
		@Override
		public Adapter casePipeline(Pipeline object) {
			return createPipelineAdapter();
		}

		@Override
		public Adapter caseOrb(Orb object) {
			return createOrbAdapter();
		}

		@Override
		public Adapter caseOrbReference(OrbReference object) {
			return createOrbReferenceAdapter();
		}

		@Override
		public Adapter caseOrbDefinition(OrbDefinition object) {
			return createOrbDefinitionAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseExecutor(Executor object) {
			return createExecutorAdapter();
		}

		@Override
		public Adapter caseDockerExecutor(DockerExecutor object) {
			return createDockerExecutorAdapter();
		}

		@Override
		public Adapter caseDockerContainer(DockerContainer object) {
			return createDockerContainerAdapter();
		}

		@Override
		public Adapter caseMachineExecutor(MachineExecutor object) {
			return createMachineExecutorAdapter();
		}

		@Override
		public Adapter caseMacOSExecutor(MacOSExecutor object) {
			return createMacOSExecutorAdapter();
		}

		@Override
		public Adapter caseWindowsOrbExecutor(WindowsOrbExecutor object) {
			return createWindowsOrbExecutorAdapter();
		}

		@Override
		public Adapter caseReferenceExecutor(ReferenceExecutor object) {
			return createReferenceExecutorAdapter();
		}

		@Override
		public Adapter caseExecutorReferenceExecutor(ExecutorReferenceExecutor object) {
			return createExecutorReferenceExecutorAdapter();
		}

		@Override
		public Adapter caseOrbReferenceExecutor(OrbReferenceExecutor object) {
			return createOrbReferenceExecutorAdapter();
		}

		@Override
		public Adapter caseJob(Job object) {
			return createJobAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseRunStep(RunStep object) {
			return createRunStepAdapter();
		}

		@Override
		public Adapter caseConditionalStep(ConditionalStep object) {
			return createConditionalStepAdapter();
		}

		@Override
		public Adapter caseWhenStep(WhenStep object) {
			return createWhenStepAdapter();
		}

		@Override
		public Adapter caseUnlessStep(UnlessStep object) {
			return createUnlessStepAdapter();
		}

		@Override
		public Adapter caseCheckoutStep(CheckoutStep object) {
			return createCheckoutStepAdapter();
		}

		@Override
		public Adapter caseSetupRemoteDockerStep(SetupRemoteDockerStep object) {
			return createSetupRemoteDockerStepAdapter();
		}

		@Override
		public Adapter caseSaveCacheStep(SaveCacheStep object) {
			return createSaveCacheStepAdapter();
		}

		@Override
		public Adapter caseRestoreCacheStep(RestoreCacheStep object) {
			return createRestoreCacheStepAdapter();
		}

		@Override
		public Adapter caseStoreArtifactsStep(StoreArtifactsStep object) {
			return createStoreArtifactsStepAdapter();
		}

		@Override
		public Adapter caseStoreTestResultsStep(StoreTestResultsStep object) {
			return createStoreTestResultsStepAdapter();
		}

		@Override
		public Adapter casePersistToWorkspaceStep(PersistToWorkspaceStep object) {
			return createPersistToWorkspaceStepAdapter();
		}

		@Override
		public Adapter caseAttachWorkspaceStep(AttachWorkspaceStep object) {
			return createAttachWorkspaceStepAdapter();
		}

		@Override
		public Adapter caseAddSSHKeysStep(AddSSHKeysStep object) {
			return createAddSSHKeysStepAdapter();
		}

		@Override
		public Adapter caseOrbReferenceStep(OrbReferenceStep object) {
			return createOrbReferenceStepAdapter();
		}

		@Override
		public Adapter caseCommandReferenceStep(CommandReferenceStep object) {
			return createCommandReferenceStepAdapter();
		}

		@Override
		public Adapter caseVariableAssignment(Map.Entry<String, Expression> object) {
			return createVariableAssignmentAdapter();
		}

		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseScheduleTrigger(ScheduleTrigger object) {
			return createScheduleTriggerAdapter();
		}

		@Override
		public Adapter caseWorkflowJobConfiguration(WorkflowJobConfiguration object) {
			return createWorkflowJobConfigurationAdapter();
		}

		@Override
		public Adapter caseWorkflowDefinedJobConfiguration(WorkflowDefinedJobConfiguration object) {
			return createWorkflowDefinedJobConfigurationAdapter();
		}

		@Override
		public Adapter caseWorkflowApprovalJobConfiguration(WorkflowApprovalJobConfiguration object) {
			return createWorkflowApprovalJobConfigurationAdapter();
		}

		@Override
		public Adapter caseWorkflowOrbJobConfiguration(WorkflowOrbJobConfiguration object) {
			return createWorkflowOrbJobConfigurationAdapter();
		}

		@Override
		public Adapter caseMatrix(Matrix object) {
			return createMatrixAdapter();
		}

		@Override
		public Adapter caseMatrixParameter(MatrixParameter object) {
			return createMatrixParameterAdapter();
		}

		@Override
		public Adapter caseMatrixCombination(MatrixCombination object) {
			return createMatrixCombinationAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseConcat(Concat object) {
			return createConcatAdapter();
		}

		@Override
		public Adapter caseLogic(Logic object) {
			return createLogicAdapter();
		}

		@Override
		public Adapter caseInfinitaryOperator(InfinitaryOperator object) {
			return createInfinitaryOperatorAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseEquals(Equals object) {
			return createEqualsAdapter();
		}

		@Override
		public Adapter caseUnaryOperator(UnaryOperator object) {
			return createUnaryOperatorAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseLogicFunction(LogicFunction object) {
			return createLogicFunctionAdapter();
		}

		@Override
		public Adapter caseMatches(Matches object) {
			return createMatchesAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseLiteral(Literal object) {
			return createLiteralAdapter();
		}

		@Override
		public Adapter caseStringLiteral(StringLiteral object) {
			return createStringLiteralAdapter();
		}

		@Override
		public Adapter caseIntegerLiteral(IntegerLiteral object) {
			return createIntegerLiteralAdapter();
		}

		@Override
		public Adapter caseDoubleLiteral(DoubleLiteral object) {
			return createDoubleLiteralAdapter();
		}

		@Override
		public Adapter caseBooleanLiteral(BooleanLiteral object) {
			return createBooleanLiteralAdapter();
		}

		@Override
		public Adapter caseVariableDereference(VariableDereference object) {
			return createVariableDereferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb
	 * @generated
	 */
	public Adapter createOrbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference <em>Orb Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference
	 * @generated
	 */
	public Adapter createOrbReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition <em>Orb Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition
	 * @generated
	 */
	public Adapter createOrbDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor
	 * @generated
	 */
	public Adapter createExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor <em>Docker Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor
	 * @generated
	 */
	public Adapter createDockerExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer
	 * @generated
	 */
	public Adapter createDockerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor <em>Machine Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor
	 * @generated
	 */
	public Adapter createMachineExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor <em>Mac OS Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor
	 * @generated
	 */
	public Adapter createMacOSExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor <em>Windows Orb Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor
	 * @generated
	 */
	public Adapter createWindowsOrbExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ReferenceExecutor <em>Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ReferenceExecutor
	 * @generated
	 */
	public Adapter createReferenceExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor <em>Executor Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor
	 * @generated
	 */
	public Adapter createExecutorReferenceExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor <em>Orb Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor
	 * @generated
	 */
	public Adapter createOrbReferenceExecutorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep <em>Run Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep
	 * @generated
	 */
	public Adapter createRunStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep
	 * @generated
	 */
	public Adapter createConditionalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WhenStep <em>When Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WhenStep
	 * @generated
	 */
	public Adapter createWhenStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnlessStep <em>Unless Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnlessStep
	 * @generated
	 */
	public Adapter createUnlessStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep <em>Checkout Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep
	 * @generated
	 */
	public Adapter createCheckoutStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep <em>Setup Remote Docker Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep
	 * @generated
	 */
	public Adapter createSetupRemoteDockerStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep <em>Save Cache Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep
	 * @generated
	 */
	public Adapter createSaveCacheStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep <em>Restore Cache Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep
	 * @generated
	 */
	public Adapter createRestoreCacheStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep <em>Store Artifacts Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep
	 * @generated
	 */
	public Adapter createStoreArtifactsStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep <em>Store Test Results Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep
	 * @generated
	 */
	public Adapter createStoreTestResultsStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep <em>Persist To Workspace Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep
	 * @generated
	 */
	public Adapter createPersistToWorkspaceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep <em>Attach Workspace Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep
	 * @generated
	 */
	public Adapter createAttachWorkspaceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep <em>Add SSH Keys Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep
	 * @generated
	 */
	public Adapter createAddSSHKeysStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep <em>Orb Reference Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep
	 * @generated
	 */
	public Adapter createOrbReferenceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep <em>Command Reference Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep
	 * @generated
	 */
	public Adapter createCommandReferenceStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createVariableAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger
	 * @generated
	 */
	public Adapter createScheduleTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration <em>Workflow Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration
	 * @generated
	 */
	public Adapter createWorkflowJobConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration <em>Workflow Defined Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration
	 * @generated
	 */
	public Adapter createWorkflowDefinedJobConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowApprovalJobConfiguration <em>Workflow Approval Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowApprovalJobConfiguration
	 * @generated
	 */
	public Adapter createWorkflowApprovalJobConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration <em>Workflow Orb Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration
	 * @generated
	 */
	public Adapter createWorkflowOrbJobConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter <em>Matrix Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter
	 * @generated
	 */
	public Adapter createMatrixParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination
	 * @generated
	 */
	public Adapter createMatrixCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat
	 * @generated
	 */
	public Adapter createConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Logic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Logic
	 * @generated
	 */
	public Adapter createLogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator <em>Infinitary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator
	 * @generated
	 */
	public Adapter createInfinitaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Equals
	 * @generated
	 */
	public Adapter createEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.LogicFunction <em>Logic Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.LogicFunction
	 * @generated
	 */
	public Adapter createLogicFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches
	 * @generated
	 */
	public Adapter createMatchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral
	 * @generated
	 */
	public Adapter createDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDereference <em>Variable Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDereference
	 * @generated
	 */
	public Adapter createVariableDereferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CircleCIAdapterFactory
