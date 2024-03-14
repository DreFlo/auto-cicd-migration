/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.util;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;

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
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseExecution_Env(Execution_Env object) {
			return createExecution_EnvAdapter();
		}

		@Override
		public Adapter caseDocker(Docker object) {
			return createDockerAdapter();
		}

		@Override
		public Adapter caseLinux(Linux object) {
			return createLinuxAdapter();
		}

		@Override
		public Adapter caseMacOs(MacOs object) {
			return createMacOsAdapter();
		}

		@Override
		public Adapter caseWindowsOrb(WindowsOrb object) {
			return createWindowsOrbAdapter();
		}

		@Override
		public Adapter caseOrb(Orb object) {
			return createOrbAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter caseEnvironment(Environment object) {
			return createEnvironmentAdapter();
		}

		@Override
		public Adapter caseParameters(Parameters object) {
			return createParametersAdapter();
		}

		@Override
		public Adapter caseTool_Framework(Tool_Framework object) {
			return createTool_FrameworkAdapter();
		}

		@Override
		public Adapter caseWhen_Unless(When_Unless object) {
			return createWhen_UnlessAdapter();
		}

		@Override
		public Adapter caseWhen_Attribute(When_Attribute object) {
			return createWhen_AttributeAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseBranch(Branch object) {
			return createBranchAdapter();
		}

		@Override
		public Adapter caseJob(Job object) {
			return createJobAdapter();
		}

		@Override
		public Adapter caseStore_Artifact(Store_Artifact object) {
			return createStore_ArtifactAdapter();
		}

		@Override
		public Adapter caseCommand_Params(Command_Params object) {
			return createCommand_ParamsAdapter();
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env <em>Execution Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env
	 * @generated
	 */
	public Adapter createExecution_EnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker
	 * @generated
	 */
	public Adapter createDockerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux
	 * @generated
	 */
	public Adapter createLinuxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs <em>Mac Os</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs
	 * @generated
	 */
	public Adapter createMacOsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb <em>Windows Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb
	 * @generated
	 */
	public Adapter createWindowsOrbAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters
	 * @generated
	 */
	public Adapter createParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework <em>Tool Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework
	 * @generated
	 */
	public Adapter createTool_FrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless <em>When Unless</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless
	 * @generated
	 */
	public Adapter createWhen_UnlessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute <em>When Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute
	 * @generated
	 */
	public Adapter createWhen_AttributeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact <em>Store Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact
	 * @generated
	 */
	public Adapter createStore_ArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params <em>Command Params</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params
	 * @generated
	 */
	public Adapter createCommand_ParamsAdapter() {
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
