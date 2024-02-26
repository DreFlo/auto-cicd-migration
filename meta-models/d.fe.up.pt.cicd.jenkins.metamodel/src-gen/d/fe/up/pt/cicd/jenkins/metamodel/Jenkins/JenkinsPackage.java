/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__BEGIN = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__AGENT = 1;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__NEXT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE_FEATURE_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NEXT = ABSTRACT_STAGE__NEXT;

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
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NEXT = ABSTRACT_STAGE__NEXT;

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
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = ABSTRACT_STAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = ABSTRACT_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 5;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMAND = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl <em>Abstract Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractAgent()
	 * @generated
	 */
	int ABSTRACT_AGENT = 6;

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
	int NONE_AGENT = 7;

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
	int ANY_AGENT = 8;

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
	int OPTIONED_AGENT = 9;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONED_AGENT__LABELS = ABSTRACT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docker</b></em>' reference.
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
	int DOCKER_CONTAINER = 10;

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
	int EXPRESSION = 11;

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getBegin()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Begin();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getAgent()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Agent();

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
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getNext()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EReference getAbstractStage_Next();

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
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labels</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getLabels()
	 * @see #getOptionedAgent()
	 * @generated
	 */
	EReference getOptionedAgent_Labels();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent#getDocker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Docker</em>'.
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
		 * The meta object literal for the '<em><b>Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__BEGIN = eINSTANCE.getPipeline_Begin();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__AGENT = eINSTANCE.getPipeline_Agent();

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
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STAGE__NEXT = eINSTANCE.getAbstractStage_Next();

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
		 * The meta object literal for the '<em><b>Labels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONED_AGENT__LABELS = eINSTANCE.getOptionedAgent_Labels();

		/**
		 * The meta object literal for the '<em><b>Docker</b></em>' reference feature.
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

	}

} //JenkinsPackage
