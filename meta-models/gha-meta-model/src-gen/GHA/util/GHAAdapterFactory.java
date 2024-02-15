/**
 */
package GHA.util;

import GHA.Agent;
import GHA.Always;
import GHA.And;
import GHA.BinaryOp;
import GHA.BooleanLiteral;
import GHA.BuiltInFunctionCall;
import GHA.Cancelled;
import GHA.Command;
import GHA.Comparison;
import GHA.Concat;
import GHA.ConcurrencyGroup;
import GHA.Container;
import GHA.Contains;
import GHA.Defaults;
import GHA.DoubleLiteral;
import GHA.EndsWith;
import GHA.Equality;
import GHA.Expression;
import GHA.Failure;
import GHA.Format;
import GHA.FromJSON;
import GHA.GHAPackage;
import GHA.GitHubContext;
import GHA.HashFiles;
import GHA.Input;
import GHA.IntegerLiteral;
import GHA.Job;
import GHA.Join;
import GHA.Literal;
import GHA.LogicalOp;
import GHA.Matrix;
import GHA.MatrixAxis;
import GHA.MatrixCombination;
import GHA.Not;
import GHA.Or;
import GHA.Output;
import GHA.PERMISSIONS;
import GHA.PERMISSION_SCOPES;
import GHA.Parameter;
import GHA.PullRequestTrigger;
import GHA.PushTrigger;
import GHA.ReuseWorkflowJob;
import GHA.ScheduleTrigger;
import GHA.ScriptJob;
import GHA.Secret;
import GHA.StagingEnvironment;
import GHA.StandardEventTrigger;
import GHA.StartsWith;
import GHA.StatusCheck;
import GHA.Step;
import GHA.StringLiteral;
import GHA.Success;
import GHA.ToJSON;
import GHA.Trigger;
import GHA.UnaryOp;
import GHA.Value;
import GHA.Variable;
import GHA.VariableDereference;
import GHA.Workflow;
import GHA.WorkflowCallTrigger;
import GHA.WorkflowDispatchTrigger;
import GHA.WorkflowRunTrigger;

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
 * @see GHA.GHAPackage
 * @generated
 */
public class GHAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GHAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GHAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GHAPackage.eINSTANCE;
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
	protected GHASwitch<Adapter> modelSwitch = new GHASwitch<Adapter>() {
		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter caseJob(Job object) {
			return createJobAdapter();
		}

		@Override
		public Adapter caseReuseWorkflowJob(ReuseWorkflowJob object) {
			return createReuseWorkflowJobAdapter();
		}

		@Override
		public Adapter caseScriptJob(ScriptJob object) {
			return createScriptJobAdapter();
		}

		@Override
		public Adapter caseAgent(Agent object) {
			return createAgentAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseService(Map.Entry<String, Container> object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseStagingEnvironment(StagingEnvironment object) {
			return createStagingEnvironmentAdapter();
		}

		@Override
		public Adapter caseTrigger(Trigger object) {
			return createTriggerAdapter();
		}

		@Override
		public Adapter caseStandardEventTrigger(StandardEventTrigger object) {
			return createStandardEventTriggerAdapter();
		}

		@Override
		public Adapter caseWorkflowRunTrigger(WorkflowRunTrigger object) {
			return createWorkflowRunTriggerAdapter();
		}

		@Override
		public Adapter casePullRequestTrigger(PullRequestTrigger object) {
			return createPullRequestTriggerAdapter();
		}

		@Override
		public Adapter casePushTrigger(PushTrigger object) {
			return createPushTriggerAdapter();
		}

		@Override
		public Adapter caseScheduleTrigger(ScheduleTrigger object) {
			return createScheduleTriggerAdapter();
		}

		@Override
		public Adapter caseWorkflowCallTrigger(WorkflowCallTrigger object) {
			return createWorkflowCallTriggerAdapter();
		}

		@Override
		public Adapter caseWorkflowDispatchTrigger(WorkflowDispatchTrigger object) {
			return createWorkflowDispatchTriggerAdapter();
		}

		@Override
		public Adapter casePermission(Map.Entry<PERMISSION_SCOPES, PERMISSIONS> object) {
			return createPermissionAdapter();
		}

		@Override
		public Adapter caseConcurrencyGroup(ConcurrencyGroup object) {
			return createConcurrencyGroupAdapter();
		}

		@Override
		public Adapter caseDefaults(Defaults object) {
			return createDefaultsAdapter();
		}

		@Override
		public Adapter caseVariableAssignment(Map.Entry<String, Expression> object) {
			return createVariableAssignmentAdapter();
		}

		@Override
		public Adapter caseExpression(Expression object) {
			return createExpressionAdapter();
		}

		@Override
		public Adapter caseBinaryOp(BinaryOp object) {
			return createBinaryOpAdapter();
		}

		@Override
		public Adapter caseConcat(Concat object) {
			return createConcatAdapter();
		}

		@Override
		public Adapter caseEquality(Equality object) {
			return createEqualityAdapter();
		}

		@Override
		public Adapter caseComparison(Comparison object) {
			return createComparisonAdapter();
		}

		@Override
		public Adapter caseLogicalOp(LogicalOp object) {
			return createLogicalOpAdapter();
		}

		@Override
		public Adapter caseOr(Or object) {
			return createOrAdapter();
		}

		@Override
		public Adapter caseAnd(And object) {
			return createAndAdapter();
		}

		@Override
		public Adapter caseUnaryOp(UnaryOp object) {
			return createUnaryOpAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseBuiltInFunctionCall(BuiltInFunctionCall object) {
			return createBuiltInFunctionCallAdapter();
		}

		@Override
		public Adapter caseContains(Contains object) {
			return createContainsAdapter();
		}

		@Override
		public Adapter caseStartsWith(StartsWith object) {
			return createStartsWithAdapter();
		}

		@Override
		public Adapter caseEndsWith(EndsWith object) {
			return createEndsWithAdapter();
		}

		@Override
		public Adapter caseFormat(Format object) {
			return createFormatAdapter();
		}

		@Override
		public Adapter caseJoin(Join object) {
			return createJoinAdapter();
		}

		@Override
		public Adapter caseToJSON(ToJSON object) {
			return createToJSONAdapter();
		}

		@Override
		public Adapter caseFromJSON(FromJSON object) {
			return createFromJSONAdapter();
		}

		@Override
		public Adapter caseHashFiles(HashFiles object) {
			return createHashFilesAdapter();
		}

		@Override
		public Adapter caseStatusCheck(StatusCheck object) {
			return createStatusCheckAdapter();
		}

		@Override
		public Adapter caseAlways(Always object) {
			return createAlwaysAdapter();
		}

		@Override
		public Adapter caseSuccess(Success object) {
			return createSuccessAdapter();
		}

		@Override
		public Adapter caseCancelled(Cancelled object) {
			return createCancelledAdapter();
		}

		@Override
		public Adapter caseFailure(Failure object) {
			return createFailureAdapter();
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
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseGitHubContext(GitHubContext object) {
			return createGitHubContextAdapter();
		}

		@Override
		public Adapter caseVariableDereference(VariableDereference object) {
			return createVariableDereferenceAdapter();
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
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter casePackage(GHA.Package object) {
			return createPackageAdapter();
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
		public Adapter caseSecret(Secret object) {
			return createSecretAdapter();
		}

		@Override
		public Adapter caseOutput(Output object) {
			return createOutputAdapter();
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
	 * Creates a new adapter for an object of class '{@link GHA.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.ReuseWorkflowJob <em>Reuse Workflow Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.ReuseWorkflowJob
	 * @generated
	 */
	public Adapter createReuseWorkflowJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.ScriptJob <em>Script Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.ScriptJob
	 * @generated
	 */
	public Adapter createScriptJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.StagingEnvironment <em>Staging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.StagingEnvironment
	 * @generated
	 */
	public Adapter createStagingEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.StandardEventTrigger <em>Standard Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.StandardEventTrigger
	 * @generated
	 */
	public Adapter createStandardEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.WorkflowRunTrigger <em>Workflow Run Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.WorkflowRunTrigger
	 * @generated
	 */
	public Adapter createWorkflowRunTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.PullRequestTrigger <em>Pull Request Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.PullRequestTrigger
	 * @generated
	 */
	public Adapter createPullRequestTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.PushTrigger
	 * @generated
	 */
	public Adapter createPushTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.ScheduleTrigger
	 * @generated
	 */
	public Adapter createScheduleTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.WorkflowCallTrigger <em>Workflow Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.WorkflowCallTrigger
	 * @generated
	 */
	public Adapter createWorkflowCallTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.WorkflowDispatchTrigger <em>Workflow Dispatch Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.WorkflowDispatchTrigger
	 * @generated
	 */
	public Adapter createWorkflowDispatchTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createPermissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.ConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.ConcurrencyGroup
	 * @generated
	 */
	public Adapter createConcurrencyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Defaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Defaults
	 * @generated
	 */
	public Adapter createDefaultsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link GHA.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.BinaryOp
	 * @generated
	 */
	public Adapter createBinaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Concat
	 * @generated
	 */
	public Adapter createConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Equality
	 * @generated
	 */
	public Adapter createEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.LogicalOp
	 * @generated
	 */
	public Adapter createLogicalOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.UnaryOp
	 * @generated
	 */
	public Adapter createUnaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.BuiltInFunctionCall <em>Built In Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.BuiltInFunctionCall
	 * @generated
	 */
	public Adapter createBuiltInFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.StartsWith <em>Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.StartsWith
	 * @generated
	 */
	public Adapter createStartsWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.EndsWith
	 * @generated
	 */
	public Adapter createEndsWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Format
	 * @generated
	 */
	public Adapter createFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.ToJSON <em>To JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.ToJSON
	 * @generated
	 */
	public Adapter createToJSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.FromJSON <em>From JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.FromJSON
	 * @generated
	 */
	public Adapter createFromJSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.HashFiles <em>Hash Files</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.HashFiles
	 * @generated
	 */
	public Adapter createHashFilesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.StatusCheck <em>Status Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.StatusCheck
	 * @generated
	 */
	public Adapter createStatusCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Always
	 * @generated
	 */
	public Adapter createAlwaysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Success <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Success
	 * @generated
	 */
	public Adapter createSuccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Cancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Cancelled
	 * @generated
	 */
	public Adapter createCancelledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Failure
	 * @generated
	 */
	public Adapter createFailureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.StringLiteral
	 * @generated
	 */
	public Adapter createStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.IntegerLiteral
	 * @generated
	 */
	public Adapter createIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.DoubleLiteral
	 * @generated
	 */
	public Adapter createDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.BooleanLiteral
	 * @generated
	 */
	public Adapter createBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.GitHubContext <em>Git Hub Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.GitHubContext
	 * @generated
	 */
	public Adapter createGitHubContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.VariableDereference <em>Variable Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.VariableDereference
	 * @generated
	 */
	public Adapter createVariableDereferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.MatrixAxis <em>Matrix Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.MatrixAxis
	 * @generated
	 */
	public Adapter createMatrixAxisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.MatrixCombination
	 * @generated
	 */
	public Adapter createMatrixCombinationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Secret
	 * @generated
	 */
	public Adapter createSecretAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link GHA.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see GHA.Output
	 * @generated
	 */
	public Adapter createOutputAdapter() {
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

} //GHAAdapterFactory
