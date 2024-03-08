/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.util;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.*;

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
		public Adapter caseNestedStage(NestedStage object) {
			return createNestedStageAdapter();
		}

		@Override
		public Adapter caseParallelNestedStage(ParallelNestedStage object) {
			return createParallelNestedStageAdapter();
		}

		@Override
		public Adapter caseSequentialNestedStage(SequentialNestedStage object) {
			return createSequentialNestedStageAdapter();
		}

		@Override
		public Adapter caseStepStage(StepStage object) {
			return createStepStageAdapter();
		}

		@Override
		public Adapter caseAbstractStep(AbstractStep object) {
			return createAbstractStepAdapter();
		}

		@Override
		public Adapter caseStageChildStep(StageChildStep object) {
			return createStageChildStepAdapter();
		}

		@Override
		public Adapter caseConditionalChildStep(ConditionalChildStep object) {
			return createConditionalChildStepAdapter();
		}

		@Override
		public Adapter caseScriptedBlock(ScriptedBlock object) {
			return createScriptedBlockAdapter();
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
		public Adapter caseLabelAgent(LabelAgent object) {
			return createLabelAgentAdapter();
		}

		@Override
		public Adapter caseNodeAgent(NodeAgent object) {
			return createNodeAgentAdapter();
		}

		@Override
		public Adapter caseDockerAgent(DockerAgent object) {
			return createDockerAgentAdapter();
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
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseAssignment(Map.Entry<Variable, Expression> object) {
			return createAssignmentAdapter();
		}

		@Override
		public Adapter caseConcat(Concat object) {
			return createConcatAdapter();
		}

		@Override
		public Adapter caseBinaryOp(BinaryOp object) {
			return createBinaryOpAdapter();
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
		public Adapter caseEqualityOp(EqualityOp object) {
			return createEqualityOpAdapter();
		}

		@Override
		public Adapter caseComparisonOp(ComparisonOp object) {
			return createComparisonOpAdapter();
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
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseScheduledTrigger(ScheduledTrigger object) {
			return createScheduledTriggerAdapter();
		}

		@Override
		public Adapter casePollingTrigger(PollingTrigger object) {
			return createPollingTriggerAdapter();
		}

		@Override
		public Adapter caseUpstreamTrigger(UpstreamTrigger object) {
			return createUpstreamTriggerAdapter();
		}

		@Override
		public Adapter caseTool(Tool object) {
			return createToolAdapter();
		}

		@Override
		public Adapter caseWhen(When object) {
			return createWhenAdapter();
		}

		@Override
		public Adapter caseWhenComparison(WhenComparison object) {
			return createWhenComparisonAdapter();
		}

		@Override
		public Adapter caseWhenBranch(WhenBranch object) {
			return createWhenBranchAdapter();
		}

		@Override
		public Adapter caseWhenChangeset(WhenChangeset object) {
			return createWhenChangesetAdapter();
		}

		@Override
		public Adapter caseWhenTag(WhenTag object) {
			return createWhenTagAdapter();
		}

		@Override
		public Adapter caseWhenChangeRequest(WhenChangeRequest object) {
			return createWhenChangeRequestAdapter();
		}

		@Override
		public Adapter caseWhenBuildingTag(WhenBuildingTag object) {
			return createWhenBuildingTagAdapter();
		}

		@Override
		public Adapter caseWhenChangelog(WhenChangelog object) {
			return createWhenChangelogAdapter();
		}

		@Override
		public Adapter caseWhenEquals(WhenEquals object) {
			return createWhenEqualsAdapter();
		}

		@Override
		public Adapter caseWhenEnvironment(WhenEnvironment object) {
			return createWhenEnvironmentAdapter();
		}

		@Override
		public Adapter caseWhenExpression(WhenExpression object) {
			return createWhenExpressionAdapter();
		}

		@Override
		public Adapter caseNestedWhen(NestedWhen object) {
			return createNestedWhenAdapter();
		}

		@Override
		public Adapter caseSingleNestedWhen(SingleNestedWhen object) {
			return createSingleNestedWhenAdapter();
		}

		@Override
		public Adapter caseMultipleNestedWhen(MultipleNestedWhen object) {
			return createMultipleNestedWhenAdapter();
		}

		@Override
		public Adapter caseWhenNot(WhenNot object) {
			return createWhenNotAdapter();
		}

		@Override
		public Adapter caseWhenAnyOf(WhenAnyOf object) {
			return createWhenAnyOfAdapter();
		}

		@Override
		public Adapter caseWhenAllOf(WhenAllOf object) {
			return createWhenAllOfAdapter();
		}

		@Override
		public Adapter caseWhenTriggeredBy(WhenTriggeredBy object) {
			return createWhenTriggeredByAdapter();
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage <em>Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage
	 * @generated
	 */
	public Adapter createNestedStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ParallelNestedStage <em>Parallel Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ParallelNestedStage
	 * @generated
	 */
	public Adapter createParallelNestedStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SequentialNestedStage <em>Sequential Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SequentialNestedStage
	 * @generated
	 */
	public Adapter createSequentialNestedStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage <em>Step Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage
	 * @generated
	 */
	public Adapter createStepStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStep <em>Abstract Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStep
	 * @generated
	 */
	public Adapter createAbstractStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StageChildStep <em>Stage Child Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StageChildStep
	 * @generated
	 */
	public Adapter createStageChildStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep <em>Conditional Child Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep
	 * @generated
	 */
	public Adapter createConditionalChildStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock <em>Scripted Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock
	 * @generated
	 */
	public Adapter createScriptedBlockAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep
	 * @generated
	 */
	public Adapter createConditionalStepAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent <em>Label Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent
	 * @generated
	 */
	public Adapter createLabelAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent <em>Node Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent
	 * @generated
	 */
	public Adapter createNodeAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent <em>Docker Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent
	 * @generated
	 */
	public Adapter createDockerAgentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral
	 * @generated
	 */
	public Adapter createDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
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
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat
	 * @generated
	 */
	public Adapter createConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp
	 * @generated
	 */
	public Adapter createBinaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp
	 * @generated
	 */
	public Adapter createUnaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp <em>Equality Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp
	 * @generated
	 */
	public Adapter createEqualityOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp <em>Comparison Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp
	 * @generated
	 */
	public Adapter createComparisonOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LogicalOp
	 * @generated
	 */
	public Adapter createLogicalOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger <em>Scheduled Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger
	 * @generated
	 */
	public Adapter createScheduledTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger <em>Polling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger
	 * @generated
	 */
	public Adapter createPollingTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger <em>Upstream Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger
	 * @generated
	 */
	public Adapter createUpstreamTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool
	 * @generated
	 */
	public Adapter createToolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When
	 * @generated
	 */
	public Adapter createWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison <em>When Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison
	 * @generated
	 */
	public Adapter createWhenComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBranch <em>When Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBranch
	 * @generated
	 */
	public Adapter createWhenBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeset <em>When Changeset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeset
	 * @generated
	 */
	public Adapter createWhenChangesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTag <em>When Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTag
	 * @generated
	 */
	public Adapter createWhenTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest <em>When Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest
	 * @generated
	 */
	public Adapter createWhenChangeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBuildingTag <em>When Building Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBuildingTag
	 * @generated
	 */
	public Adapter createWhenBuildingTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangelog <em>When Changelog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangelog
	 * @generated
	 */
	public Adapter createWhenChangelogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals <em>When Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals
	 * @generated
	 */
	public Adapter createWhenEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment <em>When Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment
	 * @generated
	 */
	public Adapter createWhenEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression <em>When Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression
	 * @generated
	 */
	public Adapter createWhenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedWhen <em>Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedWhen
	 * @generated
	 */
	public Adapter createNestedWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen <em>Single Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen
	 * @generated
	 */
	public Adapter createSingleNestedWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen <em>Multiple Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen
	 * @generated
	 */
	public Adapter createMultipleNestedWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenNot <em>When Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenNot
	 * @generated
	 */
	public Adapter createWhenNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAnyOf <em>When Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAnyOf
	 * @generated
	 */
	public Adapter createWhenAnyOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAllOf <em>When All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAllOf
	 * @generated
	 */
	public Adapter createWhenAllOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy <em>When Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy
	 * @generated
	 */
	public Adapter createWhenTriggeredByAdapter() {
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
