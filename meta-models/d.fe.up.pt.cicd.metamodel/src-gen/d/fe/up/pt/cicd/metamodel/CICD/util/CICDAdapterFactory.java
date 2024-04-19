/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.util;

import d.fe.up.pt.cicd.metamodel.CICD.*;

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
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage
 * @generated
 */
public class CICDAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CICDPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICDAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CICDPackage.eINSTANCE;
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
	protected CICDSwitch<Adapter> modelSwitch = new CICDSwitch<Adapter>() {
		@Override
		public Adapter casePipelineBlock(PipelineBlock object) {
			return createPipelineBlockAdapter();
		}

		@Override
		public Adapter casePipeline(Pipeline object) {
			return createPipelineAdapter();
		}

		@Override
		public Adapter caseJob(Job object) {
			return createJobAdapter();
		}

		@Override
		public Adapter caseScriptJob(ScriptJob object) {
			return createScriptJobAdapter();
		}

		@Override
		public Adapter casePipelineCallJob(PipelineCallJob object) {
			return createPipelineCallJobAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseDockerContainer(DockerContainer object) {
			return createDockerContainerAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter casePushTrigger(PushTrigger object) {
			return createPushTriggerAdapter();
		}

		@Override
		public Adapter casePullRequestTrigger(PullRequestTrigger object) {
			return createPullRequestTriggerAdapter();
		}

		@Override
		public Adapter caseManualTrigger(ManualTrigger object) {
			return createManualTriggerAdapter();
		}

		@Override
		public Adapter caseScheduledTrigger(ScheduledTrigger object) {
			return createScheduledTriggerAdapter();
		}

		@Override
		public Adapter caseWebhookTrigger(WebhookTrigger object) {
			return createWebhookTriggerAdapter();
		}

		@Override
		public Adapter caseConcurrencyGroup(ConcurrencyGroup object) {
			return createConcurrencyGroupAdapter();
		}

		@Override
		public Adapter caseMatrix(Matrix object) {
			return createMatrixAdapter();
		}

		@Override
		public Adapter caseMatrixAxis(MatrixAxis object) {
			return createMatrixAxisAdapter();
		}

		@Override
		public Adapter caseMatrixCombination(MatrixCombination object) {
			return createMatrixCombinationAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseConditionalStep(ConditionalStep object) {
			return createConditionalStepAdapter();
		}

		@Override
		public Adapter caseNonConditionalStep(NonConditionalStep object) {
			return createNonConditionalStepAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter casePlugin(Plugin object) {
			return createPluginAdapter();
		}

		@Override
		public Adapter caseCache(Cache object) {
			return createCacheAdapter();
		}

		@Override
		public Adapter caseArtifact(Artifact object) {
			return createArtifactAdapter();
		}

		@Override
		public Adapter caseCheckout(Checkout object) {
			return createCheckoutAdapter();
		}

		@Override
		public Adapter caseVariableDeclaration(VariableDeclaration object) {
			return createVariableDeclarationAdapter();
		}

		@Override
		public Adapter caseAssignment(Map.Entry<VariableDeclaration, Expression> object) {
			return createAssignmentAdapter();
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
		public Adapter caseVariableReference(VariableReference object) {
			return createVariableReferenceAdapter();
		}

		@Override
		public Adapter caseBuiltInFunction(BuiltInFunction object) {
			return createBuiltInFunctionAdapter();
		}

		@Override
		public Adapter caseBinaryOp(BinaryOp object) {
			return createBinaryOpAdapter();
		}

		@Override
		public Adapter caseEqualityOp(EqualityOp object) {
			return createEqualityOpAdapter();
		}

		@Override
		public Adapter caseComparisonOp(ComparisonOp object) {
			return createComparisonOpAdapter();
		}

		@Override
		public Adapter caseDotOp(DotOp object) {
			return createDotOpAdapter();
		}

		@Override
		public Adapter caseLogicalOp(LogicalOp object) {
			return createLogicalOpAdapter();
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
		public Adapter caseUnaryOp(UnaryOp object) {
			return createUnaryOpAdapter();
		}

		@Override
		public Adapter caseNegation(Negation object) {
			return createNegationAdapter();
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock <em>Pipeline Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock
	 * @generated
	 */
	public Adapter createPipelineBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Pipeline
	 * @generated
	 */
	public Adapter createPipelineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.ScriptJob <em>Script Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ScriptJob
	 * @generated
	 */
	public Adapter createScriptJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob <em>Pipeline Call Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob
	 * @generated
	 */
	public Adapter createPipelineCallJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer
	 * @generated
	 */
	public Adapter createDockerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PushTrigger
	 * @generated
	 */
	public Adapter createPushTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger <em>Pull Request Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger
	 * @generated
	 */
	public Adapter createPullRequestTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger <em>Manual Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger
	 * @generated
	 */
	public Adapter createManualTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger <em>Scheduled Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger
	 * @generated
	 */
	public Adapter createScheduledTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger <em>Webhook Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger
	 * @generated
	 */
	public Adapter createWebhookTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup
	 * @generated
	 */
	public Adapter createConcurrencyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis <em>Matrix Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis
	 * @generated
	 */
	public Adapter createMatrixAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination
	 * @generated
	 */
	public Adapter createMatrixCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep
	 * @generated
	 */
	public Adapter createConditionalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep <em>Non Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep
	 * @generated
	 */
	public Adapter createNonConditionalStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Plugin
	 * @generated
	 */
	public Adapter createPluginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Artifact
	 * @generated
	 */
	public Adapter createArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Checkout <em>Checkout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Checkout
	 * @generated
	 */
	public Adapter createCheckoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Concat
	 * @generated
	 */
	public Adapter createConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DoubleLiteral
	 * @generated
	 */
	public Adapter createDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.VariableReference
	 * @generated
	 */
	public Adapter createVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction <em>Built In Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction
	 * @generated
	 */
	public Adapter createBuiltInFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BinaryOp
	 * @generated
	 */
	public Adapter createBinaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.EqualityOp <em>Equality Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.EqualityOp
	 * @generated
	 */
	public Adapter createEqualityOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.ComparisonOp <em>Comparison Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ComparisonOp
	 * @generated
	 */
	public Adapter createComparisonOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.DotOp <em>Dot Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DotOp
	 * @generated
	 */
	public Adapter createDotOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.LogicalOp
	 * @generated
	 */
	public Adapter createLogicalOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.UnaryOp
	 * @generated
	 */
	public Adapter createUnaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.metamodel.CICD.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
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

} //CICDAdapterFactory
