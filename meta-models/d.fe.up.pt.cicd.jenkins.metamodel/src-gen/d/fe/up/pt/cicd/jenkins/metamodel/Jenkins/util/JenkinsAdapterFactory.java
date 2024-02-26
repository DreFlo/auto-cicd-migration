/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.util;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage
 * @generated
 */
public class JenkinsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JenkinsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JenkinsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JenkinsPackage.eINSTANCE;
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
	protected JenkinsSwitch<Adapter> modelSwitch = new JenkinsSwitch<Adapter>() {
		@Override
		public Adapter casePipeline(Pipeline object) {
			return createPipelineAdapter();
		}

		@Override
		public Adapter caseAbstractPipelineExecutionBlock(AbstractPipelineExecutionBlock object) {
			return createAbstractPipelineExecutionBlockAdapter();
		}

		@Override
		public Adapter caseAbstractStage(AbstractStage object) {
			return createAbstractStageAdapter();
		}

		@Override
		public Adapter caseParallel(Parallel object) {
			return createParallelAdapter();
		}

		@Override
		public Adapter caseStage(Stage object) {
			return createStageAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseAbstractAgent(AbstractAgent object) {
			return createAbstractAgentAdapter();
		}

		@Override
		public Adapter caseNoneAgent(NoneAgent object) {
			return createNoneAgentAdapter();
		}

		@Override
		public Adapter caseAnyAgent(AnyAgent object) {
			return createAnyAgentAdapter();
		}

		@Override
		public Adapter caseOptionedAgent(OptionedAgent object) {
			return createOptionedAgentAdapter();
		}

		@Override
		public Adapter caseDockerContainer(DockerContainer object) {
			return createDockerContainerAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractPipelineExecutionBlock <em>Abstract Pipeline Execution Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractPipelineExecutionBlock
	 * @generated
	 */
	public Adapter createAbstractPipelineExecutionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage <em>Abstract Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage
	 * @generated
	 */
	public Adapter createAbstractStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel
	 * @generated
	 */
	public Adapter createParallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage
	 * @generated
	 */
	public Adapter createStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent <em>Abstract Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent
	 * @generated
	 */
	public Adapter createAbstractAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NoneAgent <em>None Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NoneAgent
	 * @generated
	 */
	public Adapter createNoneAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AnyAgent <em>Any Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AnyAgent
	 * @generated
	 */
	public Adapter createAnyAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent <em>Optioned Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent
	 * @generated
	 */
	public Adapter createOptionedAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer
	 * @generated
	 */
	public Adapter createDockerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
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

} //JenkinsAdapterFactory
