/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.util;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.*;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
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
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage
 * @generated
 */
public class JenkinsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JenkinsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JenkinsSwitch() {
		if (modelPackage == null) {
			modelPackage = JenkinsPackage.eINSTANCE;
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
		case JenkinsPackage.PIPELINE: {
			Pipeline pipeline = (Pipeline) theEObject;
			T result = casePipeline(pipeline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_PIPELINE_EXECUTION_BLOCK: {
			AbstractPipelineExecutionBlock abstractPipelineExecutionBlock = (AbstractPipelineExecutionBlock) theEObject;
			T result = caseAbstractPipelineExecutionBlock(abstractPipelineExecutionBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_STAGE: {
			AbstractStage abstractStage = (AbstractStage) theEObject;
			T result = caseAbstractStage(abstractStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(abstractStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.NESTED_STAGE: {
			NestedStage nestedStage = (NestedStage) theEObject;
			T result = caseNestedStage(nestedStage);
			if (result == null)
				result = caseAbstractStage(nestedStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(nestedStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.PARALLEL_NESTED_STAGE: {
			ParallelNestedStage parallelNestedStage = (ParallelNestedStage) theEObject;
			T result = caseParallelNestedStage(parallelNestedStage);
			if (result == null)
				result = caseNestedStage(parallelNestedStage);
			if (result == null)
				result = caseAbstractStage(parallelNestedStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(parallelNestedStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.SEQUENTIAL_NESTED_STAGE: {
			SequentialNestedStage sequentialNestedStage = (SequentialNestedStage) theEObject;
			T result = caseSequentialNestedStage(sequentialNestedStage);
			if (result == null)
				result = caseNestedStage(sequentialNestedStage);
			if (result == null)
				result = caseAbstractStage(sequentialNestedStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(sequentialNestedStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.MATRIX_STAGE: {
			MatrixStage matrixStage = (MatrixStage) theEObject;
			T result = caseMatrixStage(matrixStage);
			if (result == null)
				result = caseSequentialNestedStage(matrixStage);
			if (result == null)
				result = caseNestedStage(matrixStage);
			if (result == null)
				result = caseAbstractStage(matrixStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(matrixStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.MATRIX_AXIS: {
			MatrixAxis matrixAxis = (MatrixAxis) theEObject;
			T result = caseMatrixAxis(matrixAxis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.MATRIX_COMBINATION: {
			MatrixCombination matrixCombination = (MatrixCombination) theEObject;
			T result = caseMatrixCombination(matrixCombination);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STEP_STAGE: {
			StepStage stepStage = (StepStage) theEObject;
			T result = caseStepStage(stepStage);
			if (result == null)
				result = caseAbstractStage(stepStage);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(stepStage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_STEP: {
			AbstractStep abstractStep = (AbstractStep) theEObject;
			T result = caseAbstractStep(abstractStep);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(abstractStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STAGE_CHILD_STEP: {
			StageChildStep stageChildStep = (StageChildStep) theEObject;
			T result = caseStageChildStep(stageChildStep);
			if (result == null)
				result = caseAbstractStep(stageChildStep);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(stageChildStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.CONDITIONAL_CHILD_STEP: {
			ConditionalChildStep conditionalChildStep = (ConditionalChildStep) theEObject;
			T result = caseConditionalChildStep(conditionalChildStep);
			if (result == null)
				result = caseAbstractStep(conditionalChildStep);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(conditionalChildStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.SCRIPTED_BLOCK: {
			ScriptedBlock scriptedBlock = (ScriptedBlock) theEObject;
			T result = caseScriptedBlock(scriptedBlock);
			if (result == null)
				result = caseStageChildStep(scriptedBlock);
			if (result == null)
				result = caseAbstractStep(scriptedBlock);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(scriptedBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = caseStageChildStep(step);
			if (result == null)
				result = caseConditionalChildStep(step);
			if (result == null)
				result = caseAbstractStep(step);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.CONDITIONAL_STEP: {
			ConditionalStep conditionalStep = (ConditionalStep) theEObject;
			T result = caseConditionalStep(conditionalStep);
			if (result == null)
				result = caseConditionalChildStep(conditionalStep);
			if (result == null)
				result = caseAbstractStep(conditionalStep);
			if (result == null)
				result = caseAbstractPipelineExecutionBlock(conditionalStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ABSTRACT_AGENT: {
			AbstractAgent abstractAgent = (AbstractAgent) theEObject;
			T result = caseAbstractAgent(abstractAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.NONE_AGENT: {
			NoneAgent noneAgent = (NoneAgent) theEObject;
			T result = caseNoneAgent(noneAgent);
			if (result == null)
				result = caseAbstractAgent(noneAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ANY_AGENT: {
			AnyAgent anyAgent = (AnyAgent) theEObject;
			T result = caseAnyAgent(anyAgent);
			if (result == null)
				result = caseAbstractAgent(anyAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.LABEL_AGENT: {
			LabelAgent labelAgent = (LabelAgent) theEObject;
			T result = caseLabelAgent(labelAgent);
			if (result == null)
				result = caseAbstractAgent(labelAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.NODE_AGENT: {
			NodeAgent nodeAgent = (NodeAgent) theEObject;
			T result = caseNodeAgent(nodeAgent);
			if (result == null)
				result = caseLabelAgent(nodeAgent);
			if (result == null)
				result = caseAbstractAgent(nodeAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.DOCKER_AGENT: {
			DockerAgent dockerAgent = (DockerAgent) theEObject;
			T result = caseDockerAgent(dockerAgent);
			if (result == null)
				result = caseLabelAgent(dockerAgent);
			if (result == null)
				result = caseAbstractAgent(dockerAgent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.DOCKER_CONTAINER: {
			DockerContainer dockerContainer = (DockerContainer) theEObject;
			T result = caseDockerContainer(dockerContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = caseExpression(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.LITERAL: {
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
		case JenkinsPackage.STRING_LITERAL: {
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
		case JenkinsPackage.INTEGER_LITERAL: {
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
		case JenkinsPackage.DOUBLE_LITERAL: {
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
		case JenkinsPackage.BOOLEAN_LITERAL: {
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
		case JenkinsPackage.VARIABLE: {
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
		case JenkinsPackage.JENKINS_CONTEXT: {
			JenkinsContext jenkinsContext = (JenkinsContext) theEObject;
			T result = caseJenkinsContext(jenkinsContext);
			if (result == null)
				result = caseValue(jenkinsContext);
			if (result == null)
				result = caseExpression(jenkinsContext);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.VARIABLE_DEREFERENCE: {
			VariableDereference variableDereference = (VariableDereference) theEObject;
			T result = caseVariableDereference(variableDereference);
			if (result == null)
				result = caseExpression(variableDereference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.ASSIGNMENT: {
			@SuppressWarnings("unchecked")
			Map.Entry<Variable, Expression> assignment = (Map.Entry<Variable, Expression>) theEObject;
			T result = caseAssignment(assignment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STEP_ARGUMENT: {
			@SuppressWarnings("unchecked")
			Map.Entry<Variable, EList<Expression>> stepArgument = (Map.Entry<Variable, EList<Expression>>) theEObject;
			T result = caseStepArgument(stepArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STEP_SINGLE_ARGUMENT: {
			@SuppressWarnings("unchecked")
			Map.Entry<Variable, EList<Expression>> stepSingleArgument = (Map.Entry<Variable, EList<Expression>>) theEObject;
			T result = caseStepSingleArgument(stepSingleArgument);
			if (result == null)
				result = caseStepArgument((Map.Entry<Variable, EList<Expression>>) stepSingleArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STEP_LIST_ARGUMENT: {
			@SuppressWarnings("unchecked")
			Map.Entry<Variable, EList<Expression>> stepListArgument = (Map.Entry<Variable, EList<Expression>>) theEObject;
			T result = caseStepListArgument(stepListArgument);
			if (result == null)
				result = caseStepArgument((Map.Entry<Variable, EList<Expression>>) stepListArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.BINARY_OP: {
			BinaryOp binaryOp = (BinaryOp) theEObject;
			T result = caseBinaryOp(binaryOp);
			if (result == null)
				result = caseExpression(binaryOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.UNARY_OP: {
			UnaryOp unaryOp = (UnaryOp) theEObject;
			T result = caseUnaryOp(unaryOp);
			if (result == null)
				result = caseExpression(unaryOp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.NEGATION: {
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
		case JenkinsPackage.EQUALITY_OP: {
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
		case JenkinsPackage.COMPARISON_OP: {
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
		case JenkinsPackage.LOGICAL_OP: {
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
		case JenkinsPackage.AND: {
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
		case JenkinsPackage.OR: {
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
		case JenkinsPackage.TRIGGER: {
			Trigger trigger = (Trigger) theEObject;
			T result = caseTrigger(trigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.SCHEDULED_TRIGGER: {
			ScheduledTrigger scheduledTrigger = (ScheduledTrigger) theEObject;
			T result = caseScheduledTrigger(scheduledTrigger);
			if (result == null)
				result = caseTrigger(scheduledTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.POLLING_TRIGGER: {
			PollingTrigger pollingTrigger = (PollingTrigger) theEObject;
			T result = casePollingTrigger(pollingTrigger);
			if (result == null)
				result = caseTrigger(pollingTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.UPSTREAM_TRIGGER: {
			UpstreamTrigger upstreamTrigger = (UpstreamTrigger) theEObject;
			T result = caseUpstreamTrigger(upstreamTrigger);
			if (result == null)
				result = caseTrigger(upstreamTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.TOOL: {
			Tool tool = (Tool) theEObject;
			T result = caseTool(tool);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN: {
			When when = (When) theEObject;
			T result = caseWhen(when);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_COMPARISON: {
			WhenComparison whenComparison = (WhenComparison) theEObject;
			T result = caseWhenComparison(whenComparison);
			if (result == null)
				result = caseWhen(whenComparison);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_BRANCH: {
			WhenBranch whenBranch = (WhenBranch) theEObject;
			T result = caseWhenBranch(whenBranch);
			if (result == null)
				result = caseWhenComparison(whenBranch);
			if (result == null)
				result = caseWhen(whenBranch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_CHANGESET: {
			WhenChangeset whenChangeset = (WhenChangeset) theEObject;
			T result = caseWhenChangeset(whenChangeset);
			if (result == null)
				result = caseWhenComparison(whenChangeset);
			if (result == null)
				result = caseWhen(whenChangeset);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_TAG: {
			WhenTag whenTag = (WhenTag) theEObject;
			T result = caseWhenTag(whenTag);
			if (result == null)
				result = caseWhenComparison(whenTag);
			if (result == null)
				result = caseWhen(whenTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_CHANGE_REQUEST: {
			WhenChangeRequest whenChangeRequest = (WhenChangeRequest) theEObject;
			T result = caseWhenChangeRequest(whenChangeRequest);
			if (result == null)
				result = caseWhenComparison(whenChangeRequest);
			if (result == null)
				result = caseWhen(whenChangeRequest);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_BUILDING_TAG: {
			WhenBuildingTag whenBuildingTag = (WhenBuildingTag) theEObject;
			T result = caseWhenBuildingTag(whenBuildingTag);
			if (result == null)
				result = caseWhen(whenBuildingTag);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_CHANGELOG: {
			WhenChangelog whenChangelog = (WhenChangelog) theEObject;
			T result = caseWhenChangelog(whenChangelog);
			if (result == null)
				result = caseWhen(whenChangelog);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_EQUALS: {
			WhenEquals whenEquals = (WhenEquals) theEObject;
			T result = caseWhenEquals(whenEquals);
			if (result == null)
				result = caseWhen(whenEquals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_ENVIRONMENT: {
			WhenEnvironment whenEnvironment = (WhenEnvironment) theEObject;
			T result = caseWhenEnvironment(whenEnvironment);
			if (result == null)
				result = caseWhen(whenEnvironment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_EXPRESSION: {
			WhenExpression whenExpression = (WhenExpression) theEObject;
			T result = caseWhenExpression(whenExpression);
			if (result == null)
				result = caseWhen(whenExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.NESTED_WHEN: {
			NestedWhen nestedWhen = (NestedWhen) theEObject;
			T result = caseNestedWhen(nestedWhen);
			if (result == null)
				result = caseWhen(nestedWhen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.SINGLE_NESTED_WHEN: {
			SingleNestedWhen singleNestedWhen = (SingleNestedWhen) theEObject;
			T result = caseSingleNestedWhen(singleNestedWhen);
			if (result == null)
				result = caseNestedWhen(singleNestedWhen);
			if (result == null)
				result = caseWhen(singleNestedWhen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.MULTIPLE_NESTED_WHEN: {
			MultipleNestedWhen multipleNestedWhen = (MultipleNestedWhen) theEObject;
			T result = caseMultipleNestedWhen(multipleNestedWhen);
			if (result == null)
				result = caseNestedWhen(multipleNestedWhen);
			if (result == null)
				result = caseWhen(multipleNestedWhen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_NOT: {
			WhenNot whenNot = (WhenNot) theEObject;
			T result = caseWhenNot(whenNot);
			if (result == null)
				result = caseSingleNestedWhen(whenNot);
			if (result == null)
				result = caseNestedWhen(whenNot);
			if (result == null)
				result = caseWhen(whenNot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_ANY_OF: {
			WhenAnyOf whenAnyOf = (WhenAnyOf) theEObject;
			T result = caseWhenAnyOf(whenAnyOf);
			if (result == null)
				result = caseMultipleNestedWhen(whenAnyOf);
			if (result == null)
				result = caseNestedWhen(whenAnyOf);
			if (result == null)
				result = caseWhen(whenAnyOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_ALL_OF: {
			WhenAllOf whenAllOf = (WhenAllOf) theEObject;
			T result = caseWhenAllOf(whenAllOf);
			if (result == null)
				result = caseMultipleNestedWhen(whenAllOf);
			if (result == null)
				result = caseNestedWhen(whenAllOf);
			if (result == null)
				result = caseWhen(whenAllOf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.WHEN_TRIGGERED_BY: {
			WhenTriggeredBy whenTriggeredBy = (WhenTriggeredBy) theEObject;
			T result = caseWhenTriggeredBy(whenTriggeredBy);
			if (result == null)
				result = caseWhen(whenTriggeredBy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.BUILD_STEP_PARAMETER: {
			BuildStepParameter buildStepParameter = (BuildStepParameter) theEObject;
			T result = caseBuildStepParameter(buildStepParameter);
			if (result == null)
				result = caseExpression(buildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.STRING_BUILD_STEP_PARAMETER: {
			StringBuildStepParameter stringBuildStepParameter = (StringBuildStepParameter) theEObject;
			T result = caseStringBuildStepParameter(stringBuildStepParameter);
			if (result == null)
				result = caseBuildStepParameter(stringBuildStepParameter);
			if (result == null)
				result = caseExpression(stringBuildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.CREDENTIALS_BUILD_STEP_PARAMETER: {
			CredentialsBuildStepParameter credentialsBuildStepParameter = (CredentialsBuildStepParameter) theEObject;
			T result = caseCredentialsBuildStepParameter(credentialsBuildStepParameter);
			if (result == null)
				result = caseBuildStepParameter(credentialsBuildStepParameter);
			if (result == null)
				result = caseExpression(credentialsBuildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.PASSWORD_BUILD_STEP_PARAMETER: {
			PasswordBuildStepParameter passwordBuildStepParameter = (PasswordBuildStepParameter) theEObject;
			T result = casePasswordBuildStepParameter(passwordBuildStepParameter);
			if (result == null)
				result = caseBuildStepParameter(passwordBuildStepParameter);
			if (result == null)
				result = caseExpression(passwordBuildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.BOOLEAN_BUILD_STEP_PARAMETER: {
			BooleanBuildStepParameter booleanBuildStepParameter = (BooleanBuildStepParameter) theEObject;
			T result = caseBooleanBuildStepParameter(booleanBuildStepParameter);
			if (result == null)
				result = caseBuildStepParameter(booleanBuildStepParameter);
			if (result == null)
				result = caseExpression(booleanBuildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.TEXT_BUILD_STEP_PARAMETER: {
			TextBuildStepParameter textBuildStepParameter = (TextBuildStepParameter) theEObject;
			T result = caseTextBuildStepParameter(textBuildStepParameter);
			if (result == null)
				result = caseBuildStepParameter(textBuildStepParameter);
			if (result == null)
				result = caseExpression(textBuildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case JenkinsPackage.CHOICE_BUILD_STEP_PARAMETER: {
			ChoiceBuildStepParameter choiceBuildStepParameter = (ChoiceBuildStepParameter) theEObject;
			T result = caseChoiceBuildStepParameter(choiceBuildStepParameter);
			if (result == null)
				result = caseBuildStepParameter(choiceBuildStepParameter);
			if (result == null)
				result = caseExpression(choiceBuildStepParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Pipeline Execution Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Pipeline Execution Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPipelineExecutionBlock(AbstractPipelineExecutionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStage(AbstractStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedStage(NestedStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Nested Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelNestedStage(ParallelNestedStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Nested Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialNestedStage(SequentialNestedStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixStage(MatrixStage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Step Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepStage(StepStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStep(AbstractStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Child Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Child Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStageChildStep(StageChildStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Child Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Child Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalChildStep(ConditionalChildStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scripted Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scripted Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptedBlock(ScriptedBlock object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAgent(AbstractAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>None Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>None Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoneAgent(NoneAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyAgent(AnyAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelAgent(LabelAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeAgent(NodeAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerAgent(DockerAgent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJenkinsContext(JenkinsContext object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Step Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepArgument(Map.Entry<Variable, EList<Expression>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Single Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Single Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepSingleArgument(Map.Entry<Variable, EList<Expression>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step List Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step List Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepListArgument(Map.Entry<Variable, EList<Expression>> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Polling Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polling Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePollingTrigger(PollingTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upstream Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upstream Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpstreamTrigger(UpstreamTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhen(When object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenComparison(WhenComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenBranch(WhenBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Changeset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Changeset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenChangeset(WhenChangeset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenTag(WhenTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Change Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenChangeRequest(WhenChangeRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Building Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Building Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenBuildingTag(WhenBuildingTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Changelog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Changelog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenChangelog(WhenChangelog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenEquals(WhenEquals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenEnvironment(WhenEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenExpression(WhenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedWhen(NestedWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Nested When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Nested When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleNestedWhen(SingleNestedWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Nested When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Nested When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleNestedWhen(MultipleNestedWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenNot(WhenNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Any Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Any Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenAnyOf(WhenAnyOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When All Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When All Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenAllOf(WhenAllOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>When Triggered By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>When Triggered By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhenTriggeredBy(WhenTriggeredBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildStepParameter(BuildStepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringBuildStepParameter(StringBuildStepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credentials Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credentials Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredentialsBuildStepParameter(CredentialsBuildStepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordBuildStepParameter(PasswordBuildStepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBuildStepParameter(BooleanBuildStepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBuildStepParameter(TextBuildStepParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice Build Step Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice Build Step Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoiceBuildStepParameter(ChoiceBuildStepParameter object) {
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

} //JenkinsSwitch
