/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.*;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JenkinsFactoryImpl extends EFactoryImpl implements JenkinsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JenkinsFactory init() {
		try {
			JenkinsFactory theJenkinsFactory = (JenkinsFactory) EPackage.Registry.INSTANCE
					.getEFactory(JenkinsPackage.eNS_URI);
			if (theJenkinsFactory != null) {
				return theJenkinsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JenkinsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JenkinsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case JenkinsPackage.PIPELINE:
			return createPipeline();
		case JenkinsPackage.NESTED_STAGE:
			return createNestedStage();
		case JenkinsPackage.PARALLEL_NESTED_STAGE:
			return createParallelNestedStage();
		case JenkinsPackage.SEQUENTIAL_NESTED_STAGE:
			return createSequentialNestedStage();
		case JenkinsPackage.STEP_STAGE:
			return createStepStage();
		case JenkinsPackage.SCRIPTED_BLOCK:
			return createScriptedBlock();
		case JenkinsPackage.STEP:
			return createStep();
		case JenkinsPackage.CONDITIONAL_STEP:
			return createConditionalStep();
		case JenkinsPackage.NONE_AGENT:
			return createNoneAgent();
		case JenkinsPackage.ANY_AGENT:
			return createAnyAgent();
		case JenkinsPackage.LABEL_AGENT:
			return createLabelAgent();
		case JenkinsPackage.NODE_AGENT:
			return createNodeAgent();
		case JenkinsPackage.DOCKER_AGENT:
			return createDockerAgent();
		case JenkinsPackage.DOCKER_CONTAINER:
			return createDockerContainer();
		case JenkinsPackage.EXPRESSION:
			return createExpression();
		case JenkinsPackage.STRING_LITERAL:
			return createStringLiteral();
		case JenkinsPackage.INTEGER_LITERAL:
			return createIntegerLiteral();
		case JenkinsPackage.DOUBLE_LITERAL:
			return createDoubleLiteral();
		case JenkinsPackage.BOOLEAN_LITERAL:
			return createBooleanLiteral();
		case JenkinsPackage.VARIABLE:
			return createVariable();
		case JenkinsPackage.ASSIGNMENT:
			return (EObject) createAssignment();
		case JenkinsPackage.CONCAT:
			return createConcat();
		case JenkinsPackage.NEGATION:
			return createNegation();
		case JenkinsPackage.EQUALITY_OP:
			return createEqualityOp();
		case JenkinsPackage.COMPARISON_OP:
			return createComparisonOp();
		case JenkinsPackage.AND:
			return createAnd();
		case JenkinsPackage.OR:
			return createOr();
		case JenkinsPackage.SCHEDULED_TRIGGER:
			return createScheduledTrigger();
		case JenkinsPackage.POLLING_TRIGGER:
			return createPollingTrigger();
		case JenkinsPackage.UPSTREAM_TRIGGER:
			return createUpstreamTrigger();
		case JenkinsPackage.TOOL:
			return createTool();
		case JenkinsPackage.WHEN_BRANCH:
			return createWhenBranch();
		case JenkinsPackage.WHEN_CHANGESET:
			return createWhenChangeset();
		case JenkinsPackage.WHEN_TAG:
			return createWhenTag();
		case JenkinsPackage.WHEN_CHANGE_REQUEST:
			return createWhenChangeRequest();
		case JenkinsPackage.WHEN_BUILDING_TAG:
			return createWhenBuildingTag();
		case JenkinsPackage.WHEN_CHANGELOG:
			return createWhenChangelog();
		case JenkinsPackage.WHEN_EQUALS:
			return createWhenEquals();
		case JenkinsPackage.WHEN_ENVIRONMENT:
			return createWhenEnvironment();
		case JenkinsPackage.WHEN_EXPRESSION:
			return createWhenExpression();
		case JenkinsPackage.SINGLE_NESTED_WHEN:
			return createSingleNestedWhen();
		case JenkinsPackage.MULTIPLE_NESTED_WHEN:
			return createMultipleNestedWhen();
		case JenkinsPackage.WHEN_NOT:
			return createWhenNot();
		case JenkinsPackage.WHEN_ANY_OF:
			return createWhenAnyOf();
		case JenkinsPackage.WHEN_ALL_OF:
			return createWhenAllOf();
		case JenkinsPackage.WHEN_TRIGGERED_BY:
			return createWhenTriggeredBy();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case JenkinsPackage.EQUALITY_OPS:
			return createEQUALITY_OPSFromString(eDataType, initialValue);
		case JenkinsPackage.COMPARISON_OPS:
			return createCOMPARISON_OPSFromString(eDataType, initialValue);
		case JenkinsPackage.SUPPORTED_TOOLS:
			return createSUPPORTED_TOOLSFromString(eDataType, initialValue);
		case JenkinsPackage.COMPARATORS:
			return createCOMPARATORSFromString(eDataType, initialValue);
		case JenkinsPackage.CHANGE_REQUEST_MATCHER:
			return createCHANGE_REQUEST_MATCHERFromString(eDataType, initialValue);
		case JenkinsPackage.WHEN_EVALUATION_TIMES:
			return createWHEN_EVALUATION_TIMESFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case JenkinsPackage.EQUALITY_OPS:
			return convertEQUALITY_OPSToString(eDataType, instanceValue);
		case JenkinsPackage.COMPARISON_OPS:
			return convertCOMPARISON_OPSToString(eDataType, instanceValue);
		case JenkinsPackage.SUPPORTED_TOOLS:
			return convertSUPPORTED_TOOLSToString(eDataType, instanceValue);
		case JenkinsPackage.COMPARATORS:
			return convertCOMPARATORSToString(eDataType, instanceValue);
		case JenkinsPackage.CHANGE_REQUEST_MATCHER:
			return convertCHANGE_REQUEST_MATCHERToString(eDataType, instanceValue);
		case JenkinsPackage.WHEN_EVALUATION_TIMES:
			return convertWHEN_EVALUATION_TIMESToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NestedStage createNestedStage() {
		NestedStageImpl nestedStage = new NestedStageImpl();
		return nestedStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParallelNestedStage createParallelNestedStage() {
		ParallelNestedStageImpl parallelNestedStage = new ParallelNestedStageImpl();
		return parallelNestedStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequentialNestedStage createSequentialNestedStage() {
		SequentialNestedStageImpl sequentialNestedStage = new SequentialNestedStageImpl();
		return sequentialNestedStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepStage createStepStage() {
		StepStageImpl stepStage = new StepStageImpl();
		return stepStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScriptedBlock createScriptedBlock() {
		ScriptedBlockImpl scriptedBlock = new ScriptedBlockImpl();
		return scriptedBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalStep createConditionalStep() {
		ConditionalStepImpl conditionalStep = new ConditionalStepImpl();
		return conditionalStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoneAgent createNoneAgent() {
		NoneAgentImpl noneAgent = new NoneAgentImpl();
		return noneAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnyAgent createAnyAgent() {
		AnyAgentImpl anyAgent = new AnyAgentImpl();
		return anyAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelAgent createLabelAgent() {
		LabelAgentImpl labelAgent = new LabelAgentImpl();
		return labelAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeAgent createNodeAgent() {
		NodeAgentImpl nodeAgent = new NodeAgentImpl();
		return nodeAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerAgent createDockerAgent() {
		DockerAgentImpl dockerAgent = new DockerAgentImpl();
		return dockerAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerContainer createDockerContainer() {
		DockerContainerImpl dockerContainer = new DockerContainerImpl();
		return dockerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerLiteral createIntegerLiteral() {
		IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
		return integerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleLiteral createDoubleLiteral() {
		DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
		return doubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral createBooleanLiteral() {
		BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
		return booleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Variable, Expression> createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concat createConcat() {
		ConcatImpl concat = new ConcatImpl();
		return concat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negation createNegation() {
		NegationImpl negation = new NegationImpl();
		return negation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EqualityOp createEqualityOp() {
		EqualityOpImpl equalityOp = new EqualityOpImpl();
		return equalityOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComparisonOp createComparisonOp() {
		ComparisonOpImpl comparisonOp = new ComparisonOpImpl();
		return comparisonOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScheduledTrigger createScheduledTrigger() {
		ScheduledTriggerImpl scheduledTrigger = new ScheduledTriggerImpl();
		return scheduledTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PollingTrigger createPollingTrigger() {
		PollingTriggerImpl pollingTrigger = new PollingTriggerImpl();
		return pollingTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UpstreamTrigger createUpstreamTrigger() {
		UpstreamTriggerImpl upstreamTrigger = new UpstreamTriggerImpl();
		return upstreamTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenBranch createWhenBranch() {
		WhenBranchImpl whenBranch = new WhenBranchImpl();
		return whenBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenChangeset createWhenChangeset() {
		WhenChangesetImpl whenChangeset = new WhenChangesetImpl();
		return whenChangeset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenTag createWhenTag() {
		WhenTagImpl whenTag = new WhenTagImpl();
		return whenTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenChangeRequest createWhenChangeRequest() {
		WhenChangeRequestImpl whenChangeRequest = new WhenChangeRequestImpl();
		return whenChangeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenBuildingTag createWhenBuildingTag() {
		WhenBuildingTagImpl whenBuildingTag = new WhenBuildingTagImpl();
		return whenBuildingTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenChangelog createWhenChangelog() {
		WhenChangelogImpl whenChangelog = new WhenChangelogImpl();
		return whenChangelog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenEquals createWhenEquals() {
		WhenEqualsImpl whenEquals = new WhenEqualsImpl();
		return whenEquals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenEnvironment createWhenEnvironment() {
		WhenEnvironmentImpl whenEnvironment = new WhenEnvironmentImpl();
		return whenEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenExpression createWhenExpression() {
		WhenExpressionImpl whenExpression = new WhenExpressionImpl();
		return whenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleNestedWhen createSingleNestedWhen() {
		SingleNestedWhenImpl singleNestedWhen = new SingleNestedWhenImpl();
		return singleNestedWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultipleNestedWhen createMultipleNestedWhen() {
		MultipleNestedWhenImpl multipleNestedWhen = new MultipleNestedWhenImpl();
		return multipleNestedWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenNot createWhenNot() {
		WhenNotImpl whenNot = new WhenNotImpl();
		return whenNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenAnyOf createWhenAnyOf() {
		WhenAnyOfImpl whenAnyOf = new WhenAnyOfImpl();
		return whenAnyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenAllOf createWhenAllOf() {
		WhenAllOfImpl whenAllOf = new WhenAllOfImpl();
		return whenAllOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhenTriggeredBy createWhenTriggeredBy() {
		WhenTriggeredByImpl whenTriggeredBy = new WhenTriggeredByImpl();
		return whenTriggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQUALITY_OPS createEQUALITY_OPSFromString(EDataType eDataType, String initialValue) {
		EQUALITY_OPS result = EQUALITY_OPS.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEQUALITY_OPSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMPARISON_OPS createCOMPARISON_OPSFromString(EDataType eDataType, String initialValue) {
		COMPARISON_OPS result = COMPARISON_OPS.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOMPARISON_OPSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUPPORTED_TOOLS createSUPPORTED_TOOLSFromString(EDataType eDataType, String initialValue) {
		SUPPORTED_TOOLS result = SUPPORTED_TOOLS.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSUPPORTED_TOOLSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COMPARATORS createCOMPARATORSFromString(EDataType eDataType, String initialValue) {
		COMPARATORS result = COMPARATORS.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOMPARATORSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHANGE_REQUEST_MATCHER createCHANGE_REQUEST_MATCHERFromString(EDataType eDataType, String initialValue) {
		CHANGE_REQUEST_MATCHER result = CHANGE_REQUEST_MATCHER.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCHANGE_REQUEST_MATCHERToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WHEN_EVALUATION_TIMES createWHEN_EVALUATION_TIMESFromString(EDataType eDataType, String initialValue) {
		WHEN_EVALUATION_TIMES result = WHEN_EVALUATION_TIMES.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWHEN_EVALUATION_TIMESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JenkinsPackage getJenkinsPackage() {
		return (JenkinsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JenkinsPackage getPackage() {
		return JenkinsPackage.eINSTANCE;
	}

} //JenkinsFactoryImpl
