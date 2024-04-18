/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.util;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.*;

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
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage
 * @generated
 */
public class CircleCISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircleCIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircleCISwitch() {
		if (modelPackage == null) {
			modelPackage = CircleCIPackage.eINSTANCE;
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
		case CircleCIPackage.DEFINITION_GROUP: {
			DefinitionGroup definitionGroup = (DefinitionGroup) theEObject;
			T result = caseDefinitionGroup(definitionGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.SCRIPT: {
			Script script = (Script) theEObject;
			T result = caseScript(script);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.CALLABLE: {
			Callable callable = (Callable) theEObject;
			T result = caseCallable(callable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ENVIRONMENT: {
			Environment environment = (Environment) theEObject;
			T result = caseEnvironment(environment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.PIPELINE: {
			Pipeline pipeline = (Pipeline) theEObject;
			T result = casePipeline(pipeline);
			if (result == null)
				result = caseDefinitionGroup(pipeline);
			if (result == null)
				result = caseCallable(pipeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ORB: {
			Orb orb = (Orb) theEObject;
			T result = caseOrb(orb);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ORB_REFERENCE: {
			OrbReference orbReference = (OrbReference) theEObject;
			T result = caseOrbReference(orbReference);
			if (result == null)
				result = caseOrb(orbReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ORB_DEFINITION: {
			OrbDefinition orbDefinition = (OrbDefinition) theEObject;
			T result = caseOrbDefinition(orbDefinition);
			if (result == null)
				result = caseOrb(orbDefinition);
			if (result == null)
				result = caseDefinitionGroup(orbDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.COMMAND: {
			Command command = (Command) theEObject;
			T result = caseCommand(command);
			if (result == null)
				result = caseScript(command);
			if (result == null)
				result = caseCallable(command);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.EXECUTOR: {
			Executor executor = (Executor) theEObject;
			T result = caseExecutor(executor);
			if (result == null)
				result = caseEnvironment(executor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.DOCKER_EXECUTOR: {
			DockerExecutor dockerExecutor = (DockerExecutor) theEObject;
			T result = caseDockerExecutor(dockerExecutor);
			if (result == null)
				result = caseExecutor(dockerExecutor);
			if (result == null)
				result = caseEnvironment(dockerExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.DOCKER_CONTAINER: {
			DockerContainer dockerContainer = (DockerContainer) theEObject;
			T result = caseDockerContainer(dockerContainer);
			if (result == null)
				result = caseEnvironment(dockerContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.MACHINE_EXECUTOR: {
			MachineExecutor machineExecutor = (MachineExecutor) theEObject;
			T result = caseMachineExecutor(machineExecutor);
			if (result == null)
				result = caseExecutor(machineExecutor);
			if (result == null)
				result = caseEnvironment(machineExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.MAC_OS_EXECUTOR: {
			MacOSExecutor macOSExecutor = (MacOSExecutor) theEObject;
			T result = caseMacOSExecutor(macOSExecutor);
			if (result == null)
				result = caseExecutor(macOSExecutor);
			if (result == null)
				result = caseEnvironment(macOSExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WINDOWS_ORB_EXECUTOR: {
			WindowsOrbExecutor windowsOrbExecutor = (WindowsOrbExecutor) theEObject;
			T result = caseWindowsOrbExecutor(windowsOrbExecutor);
			if (result == null)
				result = caseExecutor(windowsOrbExecutor);
			if (result == null)
				result = caseEnvironment(windowsOrbExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.REFERENCE_EXECUTOR: {
			ReferenceExecutor referenceExecutor = (ReferenceExecutor) theEObject;
			T result = caseReferenceExecutor(referenceExecutor);
			if (result == null)
				result = caseExecutor(referenceExecutor);
			if (result == null)
				result = caseEnvironment(referenceExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.EXECUTOR_REFERENCE_EXECUTOR: {
			ExecutorReferenceExecutor executorReferenceExecutor = (ExecutorReferenceExecutor) theEObject;
			T result = caseExecutorReferenceExecutor(executorReferenceExecutor);
			if (result == null)
				result = caseReferenceExecutor(executorReferenceExecutor);
			if (result == null)
				result = caseExecutor(executorReferenceExecutor);
			if (result == null)
				result = caseEnvironment(executorReferenceExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ORB_REFERENCE_EXECUTOR: {
			OrbReferenceExecutor orbReferenceExecutor = (OrbReferenceExecutor) theEObject;
			T result = caseOrbReferenceExecutor(orbReferenceExecutor);
			if (result == null)
				result = caseReferenceExecutor(orbReferenceExecutor);
			if (result == null)
				result = caseExecutor(orbReferenceExecutor);
			if (result == null)
				result = caseEnvironment(orbReferenceExecutor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.JOB: {
			Job job = (Job) theEObject;
			T result = caseJob(job);
			if (result == null)
				result = caseScript(job);
			if (result == null)
				result = caseCallable(job);
			if (result == null)
				result = caseEnvironment(job);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.RUN_STEP: {
			RunStep runStep = (RunStep) theEObject;
			T result = caseRunStep(runStep);
			if (result == null)
				result = caseStep(runStep);
			if (result == null)
				result = caseEnvironment(runStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.CONDITIONAL_STEP: {
			ConditionalStep conditionalStep = (ConditionalStep) theEObject;
			T result = caseConditionalStep(conditionalStep);
			if (result == null)
				result = caseStep(conditionalStep);
			if (result == null)
				result = caseScript(conditionalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WHEN_STEP: {
			WhenStep whenStep = (WhenStep) theEObject;
			T result = caseWhenStep(whenStep);
			if (result == null)
				result = caseConditionalStep(whenStep);
			if (result == null)
				result = caseStep(whenStep);
			if (result == null)
				result = caseScript(whenStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.UNLESS_STEP: {
			UnlessStep unlessStep = (UnlessStep) theEObject;
			T result = caseUnlessStep(unlessStep);
			if (result == null)
				result = caseConditionalStep(unlessStep);
			if (result == null)
				result = caseStep(unlessStep);
			if (result == null)
				result = caseScript(unlessStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.CHECKOUT_STEP: {
			CheckoutStep checkoutStep = (CheckoutStep) theEObject;
			T result = caseCheckoutStep(checkoutStep);
			if (result == null)
				result = caseStep(checkoutStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP: {
			SetupRemoteDockerStep setupRemoteDockerStep = (SetupRemoteDockerStep) theEObject;
			T result = caseSetupRemoteDockerStep(setupRemoteDockerStep);
			if (result == null)
				result = caseStep(setupRemoteDockerStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.SAVE_CACHE_STEP: {
			SaveCacheStep saveCacheStep = (SaveCacheStep) theEObject;
			T result = caseSaveCacheStep(saveCacheStep);
			if (result == null)
				result = caseStep(saveCacheStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.RESTORE_CACHE_STEP: {
			RestoreCacheStep restoreCacheStep = (RestoreCacheStep) theEObject;
			T result = caseRestoreCacheStep(restoreCacheStep);
			if (result == null)
				result = caseStep(restoreCacheStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.STORE_ARTIFACTS_STEP: {
			StoreArtifactsStep storeArtifactsStep = (StoreArtifactsStep) theEObject;
			T result = caseStoreArtifactsStep(storeArtifactsStep);
			if (result == null)
				result = caseStep(storeArtifactsStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.STORE_TEST_RESULTS_STEP: {
			StoreTestResultsStep storeTestResultsStep = (StoreTestResultsStep) theEObject;
			T result = caseStoreTestResultsStep(storeTestResultsStep);
			if (result == null)
				result = caseStep(storeTestResultsStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.PERSIST_TO_WORKSPACE_STEP: {
			PersistToWorkspaceStep persistToWorkspaceStep = (PersistToWorkspaceStep) theEObject;
			T result = casePersistToWorkspaceStep(persistToWorkspaceStep);
			if (result == null)
				result = caseStep(persistToWorkspaceStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ATTACH_WORKSPACE_STEP: {
			AttachWorkspaceStep attachWorkspaceStep = (AttachWorkspaceStep) theEObject;
			T result = caseAttachWorkspaceStep(attachWorkspaceStep);
			if (result == null)
				result = caseStep(attachWorkspaceStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ADD_SSH_KEYS_STEP: {
			AddSSHKeysStep addSSHKeysStep = (AddSSHKeysStep) theEObject;
			T result = caseAddSSHKeysStep(addSSHKeysStep);
			if (result == null)
				result = caseStep(addSSHKeysStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.ORB_REFERENCE_STEP: {
			OrbReferenceStep orbReferenceStep = (OrbReferenceStep) theEObject;
			T result = caseOrbReferenceStep(orbReferenceStep);
			if (result == null)
				result = caseStep(orbReferenceStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.COMMAND_REFERENCE_STEP: {
			CommandReferenceStep commandReferenceStep = (CommandReferenceStep) theEObject;
			T result = caseCommandReferenceStep(commandReferenceStep);
			if (result == null)
				result = caseStep(commandReferenceStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.VARIABLE_ASSIGNMENT: {
			@SuppressWarnings("unchecked")
			Map.Entry<VariableDeclaration, Expression> variableAssignment = (Map.Entry<VariableDeclaration, Expression>) theEObject;
			T result = caseVariableAssignment(variableAssignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.VARIABLE_DECLARATION: {
			VariableDeclaration variableDeclaration = (VariableDeclaration) theEObject;
			T result = caseVariableDeclaration(variableDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WORKFLOW: {
			Workflow workflow = (Workflow) theEObject;
			T result = caseWorkflow(workflow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.TRIGGER: {
			Trigger trigger = (Trigger) theEObject;
			T result = caseTrigger(trigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.SCHEDULE_TRIGGER: {
			ScheduleTrigger scheduleTrigger = (ScheduleTrigger) theEObject;
			T result = caseScheduleTrigger(scheduleTrigger);
			if (result == null)
				result = caseTrigger(scheduleTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION: {
			WorkflowJobConfiguration workflowJobConfiguration = (WorkflowJobConfiguration) theEObject;
			T result = caseWorkflowJobConfiguration(workflowJobConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.NULL_WORKFLOW_JOB_CONFIGURATION: {
			NullWorkflowJobConfiguration nullWorkflowJobConfiguration = (NullWorkflowJobConfiguration) theEObject;
			T result = caseNullWorkflowJobConfiguration(nullWorkflowJobConfiguration);
			if (result == null)
				result = caseWorkflowJobConfiguration(nullWorkflowJobConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WORKFLOW_DEFINED_JOB_CONFIGURATION: {
			WorkflowDefinedJobConfiguration workflowDefinedJobConfiguration = (WorkflowDefinedJobConfiguration) theEObject;
			T result = caseWorkflowDefinedJobConfiguration(workflowDefinedJobConfiguration);
			if (result == null)
				result = caseWorkflowJobConfiguration(workflowDefinedJobConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WORKFLOW_APPROVAL_JOB_CONFIGURATION: {
			WorkflowApprovalJobConfiguration workflowApprovalJobConfiguration = (WorkflowApprovalJobConfiguration) theEObject;
			T result = caseWorkflowApprovalJobConfiguration(workflowApprovalJobConfiguration);
			if (result == null)
				result = caseWorkflowJobConfiguration(workflowApprovalJobConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION: {
			WorkflowOrbJobConfiguration workflowOrbJobConfiguration = (WorkflowOrbJobConfiguration) theEObject;
			T result = caseWorkflowOrbJobConfiguration(workflowOrbJobConfiguration);
			if (result == null)
				result = caseWorkflowJobConfiguration(workflowOrbJobConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.MATRIX: {
			Matrix matrix = (Matrix) theEObject;
			T result = caseMatrix(matrix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.MATRIX_PARAMETER: {
			MatrixParameter matrixParameter = (MatrixParameter) theEObject;
			T result = caseMatrixParameter(matrixParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.MATRIX_COMBINATION: {
			MatrixCombination matrixCombination = (MatrixCombination) theEObject;
			T result = caseMatrixCombination(matrixCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.CONCAT: {
			Concat concat = (Concat) theEObject;
			T result = caseConcat(concat);
			if (result == null)
				result = caseExpression(concat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.LOGIC: {
			Logic logic = (Logic) theEObject;
			T result = caseLogic(logic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.INFINITARY_OPERATOR: {
			InfinitaryOperator infinitaryOperator = (InfinitaryOperator) theEObject;
			T result = caseInfinitaryOperator(infinitaryOperator);
			if (result == null)
				result = caseLogic(infinitaryOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.AND: {
			And and = (And) theEObject;
			T result = caseAnd(and);
			if (result == null)
				result = caseInfinitaryOperator(and);
			if (result == null)
				result = caseLogic(and);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.OR: {
			Or or = (Or) theEObject;
			T result = caseOr(or);
			if (result == null)
				result = caseInfinitaryOperator(or);
			if (result == null)
				result = caseLogic(or);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.EQUALS: {
			Equals equals = (Equals) theEObject;
			T result = caseEquals(equals);
			if (result == null)
				result = caseInfinitaryOperator(equals);
			if (result == null)
				result = caseLogic(equals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.UNARY_OPERATOR: {
			UnaryOperator unaryOperator = (UnaryOperator) theEObject;
			T result = caseUnaryOperator(unaryOperator);
			if (result == null)
				result = caseLogic(unaryOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.NOT: {
			Not not = (Not) theEObject;
			T result = caseNot(not);
			if (result == null)
				result = caseUnaryOperator(not);
			if (result == null)
				result = caseLogic(not);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.LOGIC_FUNCTION: {
			LogicFunction logicFunction = (LogicFunction) theEObject;
			T result = caseLogicFunction(logicFunction);
			if (result == null)
				result = caseLogic(logicFunction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.MATCHES: {
			Matches matches = (Matches) theEObject;
			T result = caseMatches(matches);
			if (result == null)
				result = caseLogicFunction(matches);
			if (result == null)
				result = caseLogic(matches);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = caseExpression(value);
			if (result == null)
				result = caseLogic(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.DOT_OPERATOR: {
			DotOperator dotOperator = (DotOperator) theEObject;
			T result = caseDotOperator(dotOperator);
			if (result == null)
				result = caseValue(dotOperator);
			if (result == null)
				result = caseExpression(dotOperator);
			if (result == null)
				result = caseLogic(dotOperator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.LITERAL: {
			Literal literal = (Literal) theEObject;
			T result = caseLiteral(literal);
			if (result == null)
				result = caseValue(literal);
			if (result == null)
				result = caseExpression(literal);
			if (result == null)
				result = caseLogic(literal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.STRING_LITERAL: {
			StringLiteral stringLiteral = (StringLiteral) theEObject;
			T result = caseStringLiteral(stringLiteral);
			if (result == null)
				result = caseLiteral(stringLiteral);
			if (result == null)
				result = caseValue(stringLiteral);
			if (result == null)
				result = caseExpression(stringLiteral);
			if (result == null)
				result = caseLogic(stringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.INTEGER_LITERAL: {
			IntegerLiteral integerLiteral = (IntegerLiteral) theEObject;
			T result = caseIntegerLiteral(integerLiteral);
			if (result == null)
				result = caseLiteral(integerLiteral);
			if (result == null)
				result = caseValue(integerLiteral);
			if (result == null)
				result = caseExpression(integerLiteral);
			if (result == null)
				result = caseLogic(integerLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.DOUBLE_LITERAL: {
			DoubleLiteral doubleLiteral = (DoubleLiteral) theEObject;
			T result = caseDoubleLiteral(doubleLiteral);
			if (result == null)
				result = caseLiteral(doubleLiteral);
			if (result == null)
				result = caseValue(doubleLiteral);
			if (result == null)
				result = caseExpression(doubleLiteral);
			if (result == null)
				result = caseLogic(doubleLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.BOOLEAN_LITERAL: {
			BooleanLiteral booleanLiteral = (BooleanLiteral) theEObject;
			T result = caseBooleanLiteral(booleanLiteral);
			if (result == null)
				result = caseLiteral(booleanLiteral);
			if (result == null)
				result = caseValue(booleanLiteral);
			if (result == null)
				result = caseExpression(booleanLiteral);
			if (result == null)
				result = caseLogic(booleanLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CircleCIPackage.VARIABLE_REFERENCE: {
			VariableReference variableReference = (VariableReference) theEObject;
			T result = caseVariableReference(variableReference);
			if (result == null)
				result = caseValue(variableReference);
			if (result == null)
				result = caseExpression(variableReference);
			if (result == null)
				result = caseLogic(variableReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionGroup(DefinitionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallable(Callable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Orb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrb(Orb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orb Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orb Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbReference(OrbReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orb Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orb Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbDefinition(OrbDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutor(Executor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerExecutor(DockerExecutor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Machine Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachineExecutor(MachineExecutor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mac OS Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mac OS Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacOSExecutor(MacOSExecutor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows Orb Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows Orb Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowsOrbExecutor(WindowsOrbExecutor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceExecutor(ReferenceExecutor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Executor Reference Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Executor Reference Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutorReferenceExecutor(ExecutorReferenceExecutor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orb Reference Executor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orb Reference Executor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbReferenceExecutor(OrbReferenceExecutor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Run Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunStep(RunStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>When Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenStep(WhenStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unless Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unless Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlessStep(UnlessStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Checkout Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Checkout Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckoutStep(CheckoutStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setup Remote Docker Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setup Remote Docker Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetupRemoteDockerStep(SetupRemoteDockerStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Save Cache Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Save Cache Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaveCacheStep(SaveCacheStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restore Cache Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restore Cache Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestoreCacheStep(RestoreCacheStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Artifacts Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Artifacts Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreArtifactsStep(StoreArtifactsStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store Test Results Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store Test Results Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoreTestResultsStep(StoreTestResultsStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persist To Workspace Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persist To Workspace Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistToWorkspaceStep(PersistToWorkspaceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attach Workspace Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attach Workspace Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachWorkspaceStep(AttachWorkspaceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add SSH Keys Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add SSH Keys Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSSHKeysStep(AddSSHKeysStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orb Reference Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orb Reference Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrbReferenceStep(OrbReferenceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Reference Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Reference Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandReferenceStep(CommandReferenceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableAssignment(Map.Entry<VariableDeclaration, Expression> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow(Workflow object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Schedule Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduleTrigger(ScheduleTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Job Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowJobConfiguration(WorkflowJobConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Workflow Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Workflow Job Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullWorkflowJobConfiguration(NullWorkflowJobConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Defined Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Defined Job Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowDefinedJobConfiguration(WorkflowDefinedJobConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Approval Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Approval Job Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowApprovalJobConfiguration(WorkflowApprovalJobConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Orb Job Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Orb Job Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowOrbJobConfiguration(WorkflowOrbJobConfiguration object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixParameter(MatrixParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Logic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogic(Logic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infinitary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infinitary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfinitaryOperator(InfinitaryOperator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNot(Not object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicFunction(LogicFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatches(Matches object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dot Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDotOperator(DotOperator object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object) {
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

} //CircleCISwitch
