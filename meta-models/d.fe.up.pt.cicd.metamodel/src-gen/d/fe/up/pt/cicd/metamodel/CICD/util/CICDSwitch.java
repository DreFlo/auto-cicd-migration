/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.util;

import d.fe.up.pt.cicd.metamodel.CICD.*;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage
 * @generated
 */
public class CICDSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CICDPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICDSwitch() {
		if (modelPackage == null) {
			modelPackage = CICDPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CICDPackage.PIPELINE_BLOCK: {
			PipelineBlock pipelineBlock = (PipelineBlock) theEObject;
			T result = casePipelineBlock(pipelineBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PIPELINE: {
			Pipeline pipeline = (Pipeline) theEObject;
			T result = casePipeline(pipeline);
			if (result == null)
				result = casePipelineBlock(pipeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.JOB: {
			Job job = (Job) theEObject;
			T result = caseJob(job);
			if (result == null)
				result = casePipelineBlock(job);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.SCRIPT_JOB: {
			ScriptJob scriptJob = (ScriptJob) theEObject;
			T result = caseScriptJob(scriptJob);
			if (result == null)
				result = caseJob(scriptJob);
			if (result == null)
				result = casePipelineBlock(scriptJob);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PIPELINE_CALL_JOB: {
			PipelineCallJob pipelineCallJob = (PipelineCallJob) theEObject;
			T result = casePipelineCallJob(pipelineCallJob);
			if (result == null)
				result = caseJob(pipelineCallJob);
			if (result == null)
				result = casePipelineBlock(pipelineCallJob);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.AGENT: {
			Agent agent = (Agent) theEObject;
			T result = caseAgent(agent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.DOCKER_CONTAINER: {
			DockerContainer dockerContainer = (DockerContainer) theEObject;
			T result = caseDockerContainer(dockerContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.TRIGGER: {
			Trigger trigger = (Trigger) theEObject;
			T result = caseTrigger(trigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PUSH_TRIGGER: {
			PushTrigger pushTrigger = (PushTrigger) theEObject;
			T result = casePushTrigger(pushTrigger);
			if (result == null)
				result = caseTrigger(pushTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PULL_REQUEST_TRIGGER: {
			PullRequestTrigger pullRequestTrigger = (PullRequestTrigger) theEObject;
			T result = casePullRequestTrigger(pullRequestTrigger);
			if (result == null)
				result = caseTrigger(pullRequestTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.MANUAL_TRIGGER: {
			ManualTrigger manualTrigger = (ManualTrigger) theEObject;
			T result = caseManualTrigger(manualTrigger);
			if (result == null)
				result = caseTrigger(manualTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.SCHEDULED_TRIGGER: {
			ScheduledTrigger scheduledTrigger = (ScheduledTrigger) theEObject;
			T result = caseScheduledTrigger(scheduledTrigger);
			if (result == null)
				result = caseTrigger(scheduledTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.WEBHOOK_TRIGGER: {
			WebhookTrigger webhookTrigger = (WebhookTrigger) theEObject;
			T result = caseWebhookTrigger(webhookTrigger);
			if (result == null)
				result = caseTrigger(webhookTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.CONCURRENCY_GROUP: {
			ConcurrencyGroup concurrencyGroup = (ConcurrencyGroup) theEObject;
			T result = caseConcurrencyGroup(concurrencyGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PERMISSION: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, PERMISSION_TYPE> permission = (Map.Entry<String, PERMISSION_TYPE>) theEObject;
			T result = casePermission(permission);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.MATRIX: {
			Matrix matrix = (Matrix) theEObject;
			T result = caseMatrix(matrix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.MATRIX_AXIS: {
			MatrixAxis matrixAxis = (MatrixAxis) theEObject;
			T result = caseMatrixAxis(matrixAxis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.MATRIX_COMBINATION: {
			MatrixCombination matrixCombination = (MatrixCombination) theEObject;
			T result = caseMatrixCombination(matrixCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = caseParameter(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.OUTPUT: {
			Output output = (Output) theEObject;
			T result = caseOutput(output);
			if (result == null)
				result = caseParameter(output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.CONDITIONAL_STEP: {
			ConditionalStep conditionalStep = (ConditionalStep) theEObject;
			T result = caseConditionalStep(conditionalStep);
			if (result == null)
				result = caseStep(conditionalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.NON_CONDITIONAL_STEP: {
			NonConditionalStep nonConditionalStep = (NonConditionalStep) theEObject;
			T result = caseNonConditionalStep(nonConditionalStep);
			if (result == null)
				result = caseStep(nonConditionalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = caseNonConditionalStep(command);
			if (result == null)
				result = caseStep(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.PLUGIN: {
			Plugin plugin = (Plugin) theEObject;
			T result = casePlugin(plugin);
			if (result == null)
				result = caseNonConditionalStep(plugin);
			if (result == null)
				result = caseStep(plugin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.CACHE: {
			Cache cache = (Cache) theEObject;
			T result = caseCache(cache);
			if (result == null)
				result = caseNonConditionalStep(cache);
			if (result == null)
				result = caseStep(cache);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.ARTIFACT: {
			Artifact artifact = (Artifact) theEObject;
			T result = caseArtifact(artifact);
			if (result == null)
				result = caseNonConditionalStep(artifact);
			if (result == null)
				result = caseStep(artifact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.CHECKOUT: {
			Checkout checkout = (Checkout) theEObject;
			T result = caseCheckout(checkout);
			if (result == null)
				result = caseNonConditionalStep(checkout);
			if (result == null)
				result = caseStep(checkout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.ASSIGNMENT: {
			@SuppressWarnings("unchecked")
			Map.Entry<Variable, Expression> assignment = (Map.Entry<Variable, Expression>) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.CONCAT: {
			Concat concat = (Concat) theEObject;
			T result = caseConcat(concat);
			if (result == null)
				result = caseExpression(concat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = caseExpression(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseValue(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseLiteral(stringLiteral);
			if (result == null)
				result = caseValue(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.INTEGER_LITERAL: {
			IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
			T result = caseIntegerLiteral(integerLiteral);
			if (result == null)
				result = caseLiteral(integerLiteral);
			if (result == null)
				result = caseValue(integerLiteral);
			if (result == null)
				result = caseExpression(integerLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.DOUBLE_LITERAL: {
			DoubleLiteral doubleLiteral = (DoubleLiteral) theEObject;
			T result = caseDoubleLiteral(doubleLiteral);
			if (result == null)
				result = caseLiteral(doubleLiteral);
			if (result == null)
				result = caseValue(doubleLiteral);
			if (result == null)
				result = caseExpression(doubleLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.BOOLEAN_LITERAL: {
			BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
			T result = caseBooleanLiteral(booleanLiteral);
			if (result == null)
				result = caseLiteral(booleanLiteral);
			if (result == null)
				result = caseValue(booleanLiteral);
			if (result == null)
				result = caseExpression(booleanLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseValue(variable);
			if (result == null)
				result = caseExpression(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.SECRET_VARIABLE: {
			SecretVariable secretVariable = (SecretVariable) theEObject;
			T result = caseSecretVariable(secretVariable);
			if (result == null)
				result = caseVariable(secretVariable);
			if (result == null)
				result = caseValue(secretVariable);
			if (result == null)
				result = caseExpression(secretVariable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.VARIABLE_CONTEXT: {
			VariableContext variableContext = (VariableContext) theEObject;
			T result = caseVariableContext(variableContext);
			if (result == null)
				result = caseValue(variableContext);
			if (result == null)
				result = caseExpression(variableContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.VARIABLE_DEREFERENCE: {
			VariableDereference variableDereference = (VariableDereference) theEObject;
			T result = caseVariableDereference(variableDereference);
			if (result == null)
				result = caseExpression(variableDereference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.BUILT_IN_FUNCTION: {
			BuiltInFunction builtInFunction = (BuiltInFunction) theEObject;
			T result = caseBuiltInFunction(builtInFunction);
			if (result == null)
				result = caseExpression(builtInFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.BINARY_OP: {
			BinaryOp binaryOp = (BinaryOp) theEObject;
			T result = caseBinaryOp(binaryOp);
			if (result == null)
				result = caseExpression(binaryOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.EQUALITY_OP: {
			EqualityOp equalityOp = (EqualityOp) theEObject;
			T result = caseEqualityOp(equalityOp);
			if (result == null)
				result = caseBinaryOp(equalityOp);
			if (result == null)
				result = caseExpression(equalityOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.COMPARISON_OP: {
			ComparisonOp comparisonOp = (ComparisonOp) theEObject;
			T result = caseComparisonOp(comparisonOp);
			if (result == null)
				result = caseBinaryOp(comparisonOp);
			if (result == null)
				result = caseExpression(comparisonOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.LOGICAL_OP: {
			LogicalOp logicalOp = (LogicalOp) theEObject;
			T result = caseLogicalOp(logicalOp);
			if (result == null)
				result = caseBinaryOp(logicalOp);
			if (result == null)
				result = caseExpression(logicalOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseLogicalOp(and);
			if (result == null)
				result = caseBinaryOp(and);
			if (result == null)
				result = caseExpression(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseLogicalOp(or);
			if (result == null)
				result = caseBinaryOp(or);
			if (result == null)
				result = caseExpression(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.ADDITION: {
			Addition addition = (Addition) theEObject;
			T result = caseAddition(addition);
			if (result == null)
				result = caseBinaryOp(addition);
			if (result == null)
				result = caseExpression(addition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.SUBTRACTION: {
			Subtraction subtraction = (Subtraction) theEObject;
			T result = caseSubtraction(subtraction);
			if (result == null)
				result = caseBinaryOp(subtraction);
			if (result == null)
				result = caseExpression(subtraction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.UNARY_OP: {
			UnaryOp unaryOp = (UnaryOp) theEObject;
			T result = caseUnaryOp(unaryOp);
			if (result == null)
				result = caseExpression(unaryOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CICDPackage.NEGATION: {
			Negation negation = (Negation) theEObject;
			T result = caseNegation(negation);
			if (result == null)
				result = caseUnaryOp(negation);
			if (result == null)
				result = caseExpression(negation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipelineBlock(PipelineBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipeline(Pipeline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJob(Job object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptJob(ScriptJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipeline Call Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipeline Call Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipelineCallJob(PipelineCallJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerContainer(DockerContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushTrigger(PushTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pull Request Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pull Request Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePullRequestTrigger(PullRequestTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualTrigger(ManualTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduled Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduled Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduledTrigger(ScheduledTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Webhook Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Webhook Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebhookTrigger(WebhookTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrencyGroup(ConcurrencyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermission(Map.Entry<String, PERMISSION_TYPE> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Axis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Axis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixAxis(MatrixAxis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixCombination(MatrixCombination object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalStep(ConditionalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Conditional Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Conditional Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonConditionalStep(NonConditionalStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plugin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlugin(Plugin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifact(Artifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckout(Checkout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Map.Entry<Variable, Expression> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcat(Concat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleLiteral(DoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretVariable(SecretVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableContext(VariableContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Dereference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Dereference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDereference(VariableDereference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Built In Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Built In Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuiltInFunction(BuiltInFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOp(BinaryOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityOp(EqualityOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonOp(ComparisonOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalOp(LogicalOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddition(Addition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtraction(Subtraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOp(UnaryOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegation(Negation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CICDSwitch
