/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsFactory
 * @model kind="package"
 * @generated
 */
public interface JenkinsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Jenkins";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/Jenkins";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Jenkins";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JenkinsPackage eINSTANCE = d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl.init();

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PipelineImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STAGES = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVIRONMENT_VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractPipelineExecutionBlockImpl <em>Abstract Pipeline Execution Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractPipelineExecutionBlockImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractPipelineExecutionBlock()
	 * @generated
	 */
	int ABSTRACT_PIPELINE_EXECUTION_BLOCK = 1;

	/**
	 * The number of structural features of the '<em>Abstract Pipeline Execution Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Pipeline Execution Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PIPELINE_EXECUTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl <em>Abstract Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractStage()
	 * @generated
	 */
	int ABSTRACT_STAGE = 2;

	/**
	 * The number of structural features of the '<em>Abstract Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE_FEATURE_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE_OPERATION_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 3;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__STAGES = ABSTRACT_STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = ABSTRACT_STAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = ABSTRACT_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 4;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__STEPS = ABSTRACT_STAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = ABSTRACT_STAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__AGENT = ABSTRACT_STAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ENVIRONMENT_VARIABLES = ABSTRACT_STAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = ABSTRACT_STAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = ABSTRACT_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractStep()
	 * @generated
	 */
	int ABSTRACT_STEP = 5;

	/**
	 * The number of structural features of the '<em>Abstract Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP_FEATURE_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP_OPERATION_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 6;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMAND = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ARGUMENTS = ABSTRACT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = ABSTRACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalStepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConditionalStep()
	 * @generated
	 */
	int CONDITIONAL_STEP = 7;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__IF_CONDITION = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__THEN_RUN = ABSTRACT_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__ELSE_RUN = ABSTRACT_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_OPERATION_COUNT = ABSTRACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl <em>Abstract Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractAgent()
	 * @generated
	 */
	int ABSTRACT_AGENT = 8;

	/**
	 * The number of structural features of the '<em>Abstract Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_AGENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NoneAgentImpl <em>None Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NoneAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNoneAgent()
	 * @generated
	 */
	int NONE_AGENT = 9;

	/**
	 * The number of structural features of the '<em>None Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_AGENT_FEATURE_COUNT = ABSTRACT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>None Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NONE_AGENT_OPERATION_COUNT = ABSTRACT_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AnyAgentImpl <em>Any Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AnyAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAnyAgent()
	 * @generated
	 */
	int ANY_AGENT = 10;

	/**
	 * The number of structural features of the '<em>Any Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_AGENT_FEATURE_COUNT = ABSTRACT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_AGENT_OPERATION_COUNT = ABSTRACT_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl <em>Optioned Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getOptionedAgent()
	 * @generated
	 */
	int OPTIONED_AGENT = 11;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONED_AGENT__LABELS = ABSTRACT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONED_AGENT__DOCKER = ABSTRACT_AGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONED_AGENT__CUSTOM_WORKSPACE = ABSTRACT_AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Optioned Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONED_AGENT_FEATURE_COUNT = ABSTRACT_AGENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Optioned Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONED_AGENT_OPERATION_COUNT = ABSTRACT_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl <em>Docker Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ARGS = 2;

	/**
	 * The feature id for the '<em><b>Registry URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__REGISTRY_URL = 3;

	/**
	 * The feature id for the '<em><b>Registry Credentials Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID = 4;

	/**
	 * The number of structural features of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ExpressionImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 14;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StringLiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.IntegerLiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DoubleLiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BooleanLiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AssignmentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 20;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConcatImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 21;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__EXPRESSIONS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BinaryOpImpl <em>Binary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BinaryOpImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__RHS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UnaryOpImpl <em>Unary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UnaryOpImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getUnaryOp()
	 * @generated
	 */
	int UNARY_OP = 23;

	/**
	 * The feature id for the '<em><b>Child Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OP__CHILD_EXPR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OP_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NegationImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 24;

	/**
	 * The feature id for the '<em><b>Child Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__CHILD_EXPR = UNARY_OP__CHILD_EXPR;

	/**
	 * The number of structural features of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_FEATURE_COUNT = UNARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_OPERATION_COUNT = UNARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.EqualityOpImpl <em>Equality Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.EqualityOpImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getEqualityOp()
	 * @generated
	 */
	int EQUALITY_OP = 25;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OP__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OP__RHS = BINARY_OP__RHS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OP__OP = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equality Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OP_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equality Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OP_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ComparisonOpImpl <em>Comparison Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ComparisonOpImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getComparisonOp()
	 * @generated
	 */
	int COMPARISON_OP = 26;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OP__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OP__RHS = BINARY_OP__RHS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OP__OP = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OP_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OP_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LogicalOpImpl <em>Logical Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LogicalOpImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLogicalOp()
	 * @generated
	 */
	int LOGICAL_OP = 27;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__RHS = BINARY_OP__RHS;

	/**
	 * The number of structural features of the '<em>Logical Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AndImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 28;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LHS = LOGICAL_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RHS = LOGICAL_OP__RHS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = LOGICAL_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = LOGICAL_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OrImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getOr()
	 * @generated
	 */
	int OR = 29;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LHS = LOGICAL_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RHS = LOGICAL_OP__RHS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = LOGICAL_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = LOGICAL_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getEQUALITY_OPS()
	 * @generated
	 */
	int EQUALITY_OPS = 30;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS <em>COMPARISON OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCOMPARISON_OPS()
	 * @generated
	 */
	int COMPARISON_OPS = 31;

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getStages()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Stages();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getAgent()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Agent();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getEnvironmentVariables()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_EnvironmentVariables();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractPipelineExecutionBlock <em>Abstract Pipeline Execution Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Pipeline Execution Block</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractPipelineExecutionBlock
	 * @generated
	 */
	EClass getAbstractPipelineExecutionBlock();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage <em>Abstract Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage
	 * @generated
	 */
	EClass getAbstractStage();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Parallel#getStages()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_Stages();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getSteps()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Steps();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getAgent()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Agent();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Stage#getEnvironmentVariables()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_EnvironmentVariables();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStep <em>Abstract Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Step</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStep
	 * @generated
	 */
	EClass getAbstractStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step#getCommand()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Command();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arguments</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Step#getArguments()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Arguments();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Step</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep
	 * @generated
	 */
	EClass getConditionalStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getIfCondition()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_IfCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getThenRun <em>Then Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then Run</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getThenRun()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_ThenRun();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getElseRun <em>Else Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Run</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalStep#getElseRun()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_ElseRun();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent <em>Abstract Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractAgent
	 * @generated
	 */
	EClass getAbstractAgent();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NoneAgent <em>None Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>None Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NoneAgent
	 * @generated
	 */
	EClass getNoneAgent();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AnyAgent <em>Any Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AnyAgent
	 * @generated
	 */
	EClass getAnyAgent();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent <em>Optioned Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optioned Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent
	 * @generated
	 */
	EClass getOptionedAgent();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labels</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getLabels()
	 * @see #getOptionedAgent()
	 * @generated
	 */
	EReference getOptionedAgent_Labels();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getDocker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getDocker()
	 * @see #getOptionedAgent()
	 * @generated
	 */
	EReference getOptionedAgent_Docker();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getCustomWorkspace <em>Custom Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Workspace</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getCustomWorkspace()
	 * @see #getOptionedAgent()
	 * @generated
	 */
	EAttribute getOptionedAgent_CustomWorkspace();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Container</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer
	 * @generated
	 */
	EClass getDockerContainer();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getImage()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Image();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getLabel()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Label();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getArgs()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Args();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getRegistryURL <em>Registry URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry URL</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getRegistryURL()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_RegistryURL();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getRegistryCredentialsId <em>Registry Credentials Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registry Credentials Id</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer#getRegistryCredentialsId()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_RegistryCredentialsId();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DoubleLiteral#getValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Variable" keyContainment="true" keyRequired="true"
	 *        valueType="d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Concat#getExpressions()
	 * @see #getConcat()
	 * @generated
	 */
	EReference getConcat_Expressions();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp
	 * @generated
	 */
	EClass getBinaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp#getLhs()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.BinaryOp#getRhs()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Rhs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp
	 * @generated
	 */
	EClass getUnaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp#getChildExpr <em>Child Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Expr</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UnaryOp#getChildExpr()
	 * @see #getUnaryOp()
	 * @generated
	 */
	EReference getUnaryOp_ChildExpr();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp <em>Equality Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp
	 * @generated
	 */
	EClass getEqualityOp();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EqualityOp#getOp()
	 * @see #getEqualityOp()
	 * @generated
	 */
	EAttribute getEqualityOp_Op();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp <em>Comparison Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp
	 * @generated
	 */
	EClass getComparisonOp();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ComparisonOp#getOp()
	 * @see #getComparisonOp()
	 * @generated
	 */
	EAttribute getComparisonOp_Op();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Op</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LogicalOp
	 * @generated
	 */
	EClass getLogicalOp();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS <em>EQUALITY OPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EQUALITY OPS</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS
	 * @generated
	 */
	EEnum getEQUALITY_OPS();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS <em>COMPARISON OPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COMPARISON OPS</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS
	 * @generated
	 */
	EEnum getCOMPARISON_OPS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JenkinsFactory getJenkinsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PipelineImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STAGES = eINSTANCE.getPipeline_Stages();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__AGENT = eINSTANCE.getPipeline_Agent();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ENVIRONMENT_VARIABLES = eINSTANCE.getPipeline_EnvironmentVariables();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractPipelineExecutionBlockImpl <em>Abstract Pipeline Execution Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractPipelineExecutionBlockImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractPipelineExecutionBlock()
		 * @generated
		 */
		EClass ABSTRACT_PIPELINE_EXECUTION_BLOCK = eINSTANCE.getAbstractPipelineExecutionBlock();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl <em>Abstract Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractStage()
		 * @generated
		 */
		EClass ABSTRACT_STAGE = eINSTANCE.getAbstractStage();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__STAGES = eINSTANCE.getParallel_Stages();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__STEPS = eINSTANCE.getStage_Steps();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__AGENT = eINSTANCE.getStage_Agent();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ENVIRONMENT_VARIABLES = eINSTANCE.getStage_EnvironmentVariables();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStepImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractStep()
		 * @generated
		 */
		EClass ABSTRACT_STEP = eINSTANCE.getAbstractStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__COMMAND = eINSTANCE.getStep_Command();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ARGUMENTS = eINSTANCE.getStep_Arguments();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalStepImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConditionalStep()
		 * @generated
		 */
		EClass CONDITIONAL_STEP = eINSTANCE.getConditionalStep();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__IF_CONDITION = eINSTANCE.getConditionalStep_IfCondition();

		/**
		 * The meta object literal for the '<em><b>Then Run</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__THEN_RUN = eINSTANCE.getConditionalStep_ThenRun();

		/**
		 * The meta object literal for the '<em><b>Else Run</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__ELSE_RUN = eINSTANCE.getConditionalStep_ElseRun();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl <em>Abstract Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractAgent()
		 * @generated
		 */
		EClass ABSTRACT_AGENT = eINSTANCE.getAbstractAgent();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NoneAgentImpl <em>None Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NoneAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNoneAgent()
		 * @generated
		 */
		EClass NONE_AGENT = eINSTANCE.getNoneAgent();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AnyAgentImpl <em>Any Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AnyAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAnyAgent()
		 * @generated
		 */
		EClass ANY_AGENT = eINSTANCE.getAnyAgent();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl <em>Optioned Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getOptionedAgent()
		 * @generated
		 */
		EClass OPTIONED_AGENT = eINSTANCE.getOptionedAgent();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONED_AGENT__LABELS = eINSTANCE.getOptionedAgent_Labels();

		/**
		 * The meta object literal for the '<em><b>Docker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONED_AGENT__DOCKER = eINSTANCE.getOptionedAgent_Docker();

		/**
		 * The meta object literal for the '<em><b>Custom Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONED_AGENT__CUSTOM_WORKSPACE = eINSTANCE.getOptionedAgent_CustomWorkspace();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl <em>Docker Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDockerContainer()
		 * @generated
		 */
		EClass DOCKER_CONTAINER = eINSTANCE.getDockerContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__IMAGE = eINSTANCE.getDockerContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__LABEL = eINSTANCE.getDockerContainer_Label();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__ARGS = eINSTANCE.getDockerContainer_Args();

		/**
		 * The meta object literal for the '<em><b>Registry URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__REGISTRY_URL = eINSTANCE.getDockerContainer_RegistryURL();

		/**
		 * The meta object literal for the '<em><b>Registry Credentials Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID = eINSTANCE.getDockerContainer_RegistryCredentialsId();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ExpressionImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LiteralImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StringLiteralImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.IntegerLiteralImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DoubleLiteralImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDoubleLiteral()
		 * @generated
		 */
		EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BooleanLiteralImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AssignmentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__KEY = eINSTANCE.getAssignment_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConcatImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCAT__EXPRESSIONS = eINSTANCE.getConcat_Expressions();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BinaryOpImpl <em>Binary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.BinaryOpImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getBinaryOp()
		 * @generated
		 */
		EClass BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__LHS = eINSTANCE.getBinaryOp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__RHS = eINSTANCE.getBinaryOp_Rhs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UnaryOpImpl <em>Unary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UnaryOpImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getUnaryOp()
		 * @generated
		 */
		EClass UNARY_OP = eINSTANCE.getUnaryOp();

		/**
		 * The meta object literal for the '<em><b>Child Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OP__CHILD_EXPR = eINSTANCE.getUnaryOp_ChildExpr();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NegationImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.EqualityOpImpl <em>Equality Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.EqualityOpImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getEqualityOp()
		 * @generated
		 */
		EClass EQUALITY_OP = eINSTANCE.getEqualityOp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY_OP__OP = eINSTANCE.getEqualityOp_Op();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ComparisonOpImpl <em>Comparison Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ComparisonOpImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getComparisonOp()
		 * @generated
		 */
		EClass COMPARISON_OP = eINSTANCE.getComparisonOp();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OP__OP = eINSTANCE.getComparisonOp_Op();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LogicalOpImpl <em>Logical Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LogicalOpImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLogicalOp()
		 * @generated
		 */
		EClass LOGICAL_OP = eINSTANCE.getLogicalOp();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AndImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OrImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getEQUALITY_OPS()
		 * @generated
		 */
		EEnum EQUALITY_OPS = eINSTANCE.getEQUALITY_OPS();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS <em>COMPARISON OPS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCOMPARISON_OPS()
		 * @generated
		 */
		EEnum COMPARISON_OPS = eINSTANCE.getCOMPARISON_OPS();

	}

} //JenkinsPackage
