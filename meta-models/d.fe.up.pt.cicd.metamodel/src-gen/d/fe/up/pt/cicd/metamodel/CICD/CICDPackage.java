/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

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
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDFactory
 * @model kind="package"
 * @generated
 */
public interface CICDPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CICD";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.d.fe.up.pt/CICD";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CICD";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CICDPackage eINSTANCE = d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl.init();

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl <em>Pipeline Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPipelineBlock()
	 * @generated
	 */
	int PIPELINE_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__AGENT = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__ENVIRONMENT_VARIABLES = 4;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__PERMISSIONS = 5;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__TIMEOUT_MINUTES = 6;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__WORKING_DIRECTORY = 7;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__CONCURRENCY_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK__SHELL = 9;

	/**
	 * The number of structural features of the '<em>Pipeline Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Pipeline Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = PIPELINE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__AGENT = PIPELINE_BLOCK__AGENT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__INPUTS = PIPELINE_BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__OUTPUTS = PIPELINE_BLOCK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVIRONMENT_VARIABLES = PIPELINE_BLOCK__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PERMISSIONS = PIPELINE_BLOCK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TIMEOUT_MINUTES = PIPELINE_BLOCK__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WORKING_DIRECTORY = PIPELINE_BLOCK__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__CONCURRENCY_GROUP = PIPELINE_BLOCK__CONCURRENCY_GROUP;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SHELL = PIPELINE_BLOCK__SHELL;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGERS = PIPELINE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOBS = PIPELINE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = PIPELINE_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = PIPELINE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = PIPELINE_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__AGENT = PIPELINE_BLOCK__AGENT;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__INPUTS = PIPELINE_BLOCK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUTS = PIPELINE_BLOCK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT_VARIABLES = PIPELINE_BLOCK__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PERMISSIONS = PIPELINE_BLOCK__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TIMEOUT_MINUTES = PIPELINE_BLOCK__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__WORKING_DIRECTORY = PIPELINE_BLOCK__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONCURRENCY_GROUP = PIPELINE_BLOCK__CONCURRENCY_GROUP;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SHELL = PIPELINE_BLOCK__SHELL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = PIPELINE_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = PIPELINE_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SERVICES = PIPELINE_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEPENDS_ON = PIPELINE_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Necessary For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NECESSARY_FOR = PIPELINE_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Attempts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__MAX_ATTEMPTS = PIPELINE_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ALLOW_FAILURE = PIPELINE_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = PIPELINE_BLOCK_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = PIPELINE_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.AgentImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.DockerContainerImpl <em>Docker Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.DockerContainerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ENVIRONMENT_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__VOLUMES = 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__PORTS = 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__OPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Registry Username</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__REGISTRY_USERNAME = 6;

	/**
	 * The feature id for the '<em><b>Registry Password</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__REGISTRY_PASSWORD = 7;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__NETWORK = 8;

	/**
	 * The number of structural features of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.TriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__BRANCH_GLOBS = 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PushTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPushTrigger()
	 * @generated
	 */
	int PUSH_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The feature id for the '<em><b>Tag Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__TAG_GLOBS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PullRequestTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPullRequestTrigger()
	 * @generated
	 */
	int PULL_REQUEST_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The number of structural features of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ManualTriggerImpl <em>Manual Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ManualTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getManualTrigger()
	 * @generated
	 */
	int MANUAL_TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The number of structural features of the '<em>Manual Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Manual Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ScheduledTriggerImpl <em>Scheduled Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ScheduledTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getScheduledTrigger()
	 * @generated
	 */
	int SCHEDULED_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER__CRON = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scheduled Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scheduled Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULED_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.WebhookTriggerImpl <em>Webhook Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.WebhookTriggerImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getWebhookTrigger()
	 * @generated
	 */
	int WEBHOOK_TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Branch Globs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_TRIGGER__BRANCH_GLOBS = TRIGGER__BRANCH_GLOBS;

	/**
	 * The number of structural features of the '<em>Webhook Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Webhook Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEBHOOK_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConcurrencyGroupImpl <em>Concurrency Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ConcurrencyGroupImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getConcurrencyGroup()
	 * @generated
	 */
	int CONCURRENCY_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_GROUP__GROUP_ID = 0;

	/**
	 * The feature id for the '<em><b>Cancel In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_GROUP__CANCEL_IN_PROGRESS = 1;

	/**
	 * The number of structural features of the '<em>Concurrency Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concurrency Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PermissionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 12;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 13;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__AXES = 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__INCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__EXCLUDES = 2;

	/**
	 * The feature id for the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__FAIL_FAST = 3;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixAxisImpl <em>Matrix Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixAxisImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getMatrixAxis()
	 * @generated
	 */
	int MATRIX_AXIS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_AXIS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_AXIS__CELLS = 1;

	/**
	 * The number of structural features of the '<em>Matrix Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_AXIS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matrix Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixCombinationImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getMatrixCombination()
	 * @generated
	 */
	int MATRIX_COMBINATION = 15;

	/**
	 * The feature id for the '<em><b>Combination Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_COMBINATION__COMBINATION_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Matrix Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_COMBINATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Matrix Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_COMBINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ParameterImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.InputImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT_VALUE = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REQUIRED = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.OutputImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.StepImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 19;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getConditionalStep()
	 * @generated
	 */
	int CONDITIONAL_STEP = 20;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__IF = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__THEN = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__ELSE = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.NonConditionalStepImpl <em>Non Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.NonConditionalStepImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getNonConditionalStep()
	 * @generated
	 */
	int NON_CONDITIONAL_STEP = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP__ID = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP__NAME = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP__TIMEOUT_MINUTES = STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP__ALLOW_FAILURE = STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Non Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Non Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONDITIONAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CommandImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = NON_CONDITIONAL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = NON_CONDITIONAL_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ENVIRONMENT_VARIABLES = NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TIMEOUT_MINUTES = NON_CONDITIONAL_STEP__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ALLOW_FAILURE = NON_CONDITIONAL_STEP__ALLOW_FAILURE;

	/**
	 * The feature id for the '<em><b>Program</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PROGRAM = NON_CONDITIONAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ARGS = NON_CONDITIONAL_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = NON_CONDITIONAL_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = NON_CONDITIONAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PluginImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ID = NON_CONDITIONAL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = NON_CONDITIONAL_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ENVIRONMENT_VARIABLES = NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__TIMEOUT_MINUTES = NON_CONDITIONAL_STEP__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ALLOW_FAILURE = NON_CONDITIONAL_STEP__ALLOW_FAILURE;

	/**
	 * The feature id for the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PLUGIN_NAME = NON_CONDITIONAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__VERSION = NON_CONDITIONAL_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kwargs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__KWARGS = NON_CONDITIONAL_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = NON_CONDITIONAL_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_OPERATION_COUNT = NON_CONDITIONAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CacheImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ID = NON_CONDITIONAL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = NON_CONDITIONAL_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ENVIRONMENT_VARIABLES = NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__TIMEOUT_MINUTES = NON_CONDITIONAL_STEP__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ALLOW_FAILURE = NON_CONDITIONAL_STEP__ALLOW_FAILURE;

	/**
	 * The feature id for the '<em><b>Cache Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_NAME = NON_CONDITIONAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__KEYS = NON_CONDITIONAL_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PATHS = NON_CONDITIONAL_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = NON_CONDITIONAL_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = NON_CONDITIONAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ArtifactImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = NON_CONDITIONAL_STEP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = NON_CONDITIONAL_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ENVIRONMENT_VARIABLES = NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__TIMEOUT_MINUTES = NON_CONDITIONAL_STEP__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ALLOW_FAILURE = NON_CONDITIONAL_STEP__ALLOW_FAILURE;

	/**
	 * The feature id for the '<em><b>Artifact Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ARTIFACT_NAME = NON_CONDITIONAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Include Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__INCLUDE_PATHS = NON_CONDITIONAL_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclude Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXCLUDE_PATHS = NON_CONDITIONAL_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Retention Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__RETENTION_TIME = NON_CONDITIONAL_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = NON_CONDITIONAL_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = NON_CONDITIONAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.AssignmentImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ExpressionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 27;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ValueImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 28;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.LiteralImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 29;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.StringLiteralImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 30;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.NumberLiteralImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getNumberLiteral()
	 * @generated
	 */
	int NUMBER_LITERAL = 31;

	/**
	 * The number of structural features of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.BooleanLiteralImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 32;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.VariableImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.EnvironmentVariableImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getEnvironmentVariable()
	 * @generated
	 */
	int ENVIRONMENT_VARIABLE = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.SecretVariableImpl <em>Secret Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.SecretVariableImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getSecretVariable()
	 * @generated
	 */
	int SECRET_VARIABLE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The number of structural features of the '<em>Secret Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Secret Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_VARIABLE_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.BuiltInFunctionImpl <em>Built In Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.BuiltInFunctionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getBuiltInFunction()
	 * @generated
	 */
	int BUILT_IN_FUNCTION = 36;

	/**
	 * The number of structural features of the '<em>Built In Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.BinaryOpImpl <em>Binary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.BinaryOpImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 37;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__LHS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConjuntionImpl <em>Conjuntion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ConjuntionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getConjuntion()
	 * @generated
	 */
	int CONJUNTION = 38;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTION__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTION__RHS = BINARY_OP__RHS;

	/**
	 * The number of structural features of the '<em>Conjuntion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTION_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conjuntion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUNTION_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.DisjunctionImpl <em>Disjunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.DisjunctionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getDisjunction()
	 * @generated
	 */
	int DISJUNCTION = 39;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION__RHS = BINARY_OP__RHS;

	/**
	 * The number of structural features of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disjunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISJUNCTION_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.AdditionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 40;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION__RHS = BINARY_OP__RHS;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.SubtractionImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getSubtraction()
	 * @generated
	 */
	int SUBTRACTION = 41;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION__RHS = BINARY_OP__RHS;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.UnaryOpImpl <em>Unary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.UnaryOpImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getUnaryOp()
	 * @generated
	 */
	int UNARY_OP = 42;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OP__RHS = EXPRESSION_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.NegationImpl <em>Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.NegationImpl
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getNegation()
	 * @generated
	 */
	int NEGATION = 43;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION__RHS = UNARY_OP__RHS;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.PermissionType <em>Permission Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PermissionType
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPermissionType()
	 * @generated
	 */
	int PERMISSION_TYPE = 44;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.ShellType <em>Shell Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ShellType
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getShellType()
	 * @generated
	 */
	int SHELL_TYPE = 45;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.metamodel.CICD.InputType <em>Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.metamodel.CICD.InputType
	 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getInputType()
	 * @generated
	 */
	int INPUT_TYPE = 46;

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock <em>Pipeline Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline Block</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock
	 * @generated
	 */
	EClass getPipelineBlock();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getName()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EAttribute getPipelineBlock_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getAgent()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EReference getPipelineBlock_Agent();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getInputs()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EReference getPipelineBlock_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getOutputs()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EReference getPipelineBlock_Outputs();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getEnvironmentVariables()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EReference getPipelineBlock_EnvironmentVariables();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Permissions</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getPermissions()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EReference getPipelineBlock_Permissions();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getTimeoutMinutes <em>Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Minutes</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getTimeoutMinutes()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EAttribute getPipelineBlock_TimeoutMinutes();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getWorkingDirectory()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EAttribute getPipelineBlock_WorkingDirectory();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concurrency Group</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getConcurrencyGroup()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EReference getPipelineBlock_ConcurrencyGroup();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock#getShell()
	 * @see #getPipelineBlock()
	 * @generated
	 */
	EAttribute getPipelineBlock_Shell();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Pipeline#getTriggers()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Pipeline#getJobs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Jobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#getSteps()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Steps();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#getServices()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Services();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#getDependsOn()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_DependsOn();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#getNecessaryFor <em>Necessary For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Necessary For</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#getNecessaryFor()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_NecessaryFor();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#getMaxAttempts <em>Max Attempts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attempts</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#getMaxAttempts()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_MaxAttempts();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Job#isAllowFailure <em>Allow Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Failure</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Job#isAllowFailure()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_AllowFailure();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.metamodel.CICD.Agent#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Agent#getContainer()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Container();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Container</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer
	 * @generated
	 */
	EClass getDockerContainer();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getLabel()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Label();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getImage()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Image();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getEnvironmentVariables()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_EnvironmentVariables();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Volumes</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getVolumes()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Volumes();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getPorts()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Ports();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getOptions()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Options();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getRegistryUsername <em>Registry Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registry Username</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getRegistryUsername()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_RegistryUsername();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getRegistryPassword <em>Registry Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registry Password</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getRegistryPassword()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_RegistryPassword();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.DockerContainer#getNetwork()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Network();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.metamodel.CICD.Trigger#getBranchGlobs <em>Branch Globs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Branch Globs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Trigger#getBranchGlobs()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_BranchGlobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PushTrigger
	 * @generated
	 */
	EClass getPushTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.metamodel.CICD.PushTrigger#getTagGlobs <em>Tag Globs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag Globs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PushTrigger#getTagGlobs()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_TagGlobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger <em>Pull Request Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Request Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger
	 * @generated
	 */
	EClass getPullRequestTrigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger <em>Manual Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger
	 * @generated
	 */
	EClass getManualTrigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger <em>Scheduled Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger
	 * @generated
	 */
	EClass getScheduledTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cron</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger#getCron()
	 * @see #getScheduledTrigger()
	 * @generated
	 */
	EAttribute getScheduledTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger <em>Webhook Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webhook Trigger</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger
	 * @generated
	 */
	EClass getWebhookTrigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency Group</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup
	 * @generated
	 */
	EClass getConcurrencyGroup();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group Id</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getGroupId()
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	EReference getConcurrencyGroup_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getCancelInProgress <em>Cancel In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel In Progress</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getCancelInProgress()
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	EAttribute getConcurrencyGroup_CancelInProgress();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDataType="d.fe.up.pt.cicd.metamodel.CICD.PermissionType" valueRequired="true"
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axes</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrix#getAxes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Axes();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrix#getIncludes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Includes();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excludes</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrix#getExcludes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Excludes();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Matrix#getFailFast <em>Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Fast</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrix#getFailFast()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_FailFast();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis <em>Matrix Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Axis</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis
	 * @generated
	 */
	EClass getMatrixAxis();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis#getName()
	 * @see #getMatrixAxis()
	 * @generated
	 */
	EAttribute getMatrixAxis_Name();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cells</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis#getCells()
	 * @see #getMatrixAxis()
	 * @generated
	 */
	EReference getMatrixAxis_Cells();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Combination</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination
	 * @generated
	 */
	EClass getMatrixCombination();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination#getCombinationEntries <em>Combination Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Combination Entries</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination#getCombinationEntries()
	 * @see #getMatrixCombination()
	 * @generated
	 */
	EReference getMatrixCombination_CombinationEntries();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Input#getDefaultValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Input#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Input#getRequired()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Required();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Step</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep
	 * @generated
	 */
	EClass getConditionalStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep#getIf()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_If();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep#getThen()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep#getElse()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_Else();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep <em>Non Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conditional Step</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep
	 * @generated
	 */
	EClass getNonConditionalStep();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getId()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getName()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_Name();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getEnvironmentVariables()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EReference getNonConditionalStep_EnvironmentVariables();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getTimeoutMinutes <em>Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Minutes</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#getTimeoutMinutes()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_TimeoutMinutes();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#isAllowFailure <em>Allow Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Failure</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep#isAllowFailure()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_AllowFailure();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Command#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Command#getProgram()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Program();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Command#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Command#getArgs()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Args();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Plugin#getPluginName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_PluginName();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Plugin#getVersion()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Version();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getKwargs <em>Kwargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Kwargs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Plugin#getKwargs()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Kwargs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getCacheName <em>Cache Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Cache#getCacheName()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_CacheName();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Cache#getKeys()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Keys();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Cache#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Cache#getPaths()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Paths();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Artifact#getArtifactName()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ArtifactName();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getIncludePaths <em>Include Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Paths</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Artifact#getIncludePaths()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IncludePaths();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getExcludePaths <em>Exclude Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Paths</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Artifact#getExcludePaths()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ExcludePaths();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.metamodel.CICD.Artifact#getRetentionTime <em>Retention Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retention Time</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Artifact#getRetentionTime()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_RetentionTime();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable" keyContainment="true" keyRequired="true"
	 *        valueType="d.fe.up.pt.cicd.metamodel.CICD.Expression" valueRequired="true"
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
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.NumberLiteral <em>Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Literal</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.NumberLiteral
	 * @generated
	 */
	EClass getNumberLiteral();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.metamodel.CICD.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable <em>Environment Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Variable</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable
	 * @generated
	 */
	EClass getEnvironmentVariable();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.SecretVariable <em>Secret Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret Variable</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.SecretVariable
	 * @generated
	 */
	EClass getSecretVariable();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction <em>Built In Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Function</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction
	 * @generated
	 */
	EClass getBuiltInFunction();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Op</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BinaryOp
	 * @generated
	 */
	EClass getBinaryOp();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lhs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getLhs()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Lhs();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getRhs()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Rhs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Conjuntion <em>Conjuntion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjuntion</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Conjuntion
	 * @generated
	 */
	EClass getConjuntion();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Disjunction <em>Disjunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disjunction</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Disjunction
	 * @generated
	 */
	EClass getDisjunction();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Subtraction
	 * @generated
	 */
	EClass getSubtraction();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Op</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.UnaryOp
	 * @generated
	 */
	EClass getUnaryOp();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.metamodel.CICD.UnaryOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rhs</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.UnaryOp#getRhs()
	 * @see #getUnaryOp()
	 * @generated
	 */
	EReference getUnaryOp_Rhs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.metamodel.CICD.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Negation
	 * @generated
	 */
	EClass getNegation();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.metamodel.CICD.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Permission Type</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.PermissionType
	 * @generated
	 */
	EEnum getPermissionType();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.metamodel.CICD.ShellType <em>Shell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shell Type</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.ShellType
	 * @generated
	 */
	EEnum getShellType();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.metamodel.CICD.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Input Type</em>'.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.InputType
	 * @generated
	 */
	EEnum getInputType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CICDFactory getCICDFactory();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl <em>Pipeline Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPipelineBlock()
		 * @generated
		 */
		EClass PIPELINE_BLOCK = eINSTANCE.getPipelineBlock();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_BLOCK__NAME = eINSTANCE.getPipelineBlock_Name();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_BLOCK__AGENT = eINSTANCE.getPipelineBlock_Agent();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_BLOCK__INPUTS = eINSTANCE.getPipelineBlock_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_BLOCK__OUTPUTS = eINSTANCE.getPipelineBlock_Outputs();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_BLOCK__ENVIRONMENT_VARIABLES = eINSTANCE.getPipelineBlock_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_BLOCK__PERMISSIONS = eINSTANCE.getPipelineBlock_Permissions();

		/**
		 * The meta object literal for the '<em><b>Timeout Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_BLOCK__TIMEOUT_MINUTES = eINSTANCE.getPipelineBlock_TimeoutMinutes();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_BLOCK__WORKING_DIRECTORY = eINSTANCE.getPipelineBlock_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Concurrency Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE_BLOCK__CONCURRENCY_GROUP = eINSTANCE.getPipelineBlock_ConcurrencyGroup();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE_BLOCK__SHELL = eINSTANCE.getPipelineBlock_Shell();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGERS = eINSTANCE.getPipeline_Triggers();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOBS = eINSTANCE.getPipeline_Jobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.JobImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEPS = eINSTANCE.getJob_Steps();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SERVICES = eINSTANCE.getJob_Services();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEPENDS_ON = eINSTANCE.getJob_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Necessary For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__NECESSARY_FOR = eINSTANCE.getJob_NecessaryFor();

		/**
		 * The meta object literal for the '<em><b>Max Attempts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__MAX_ATTEMPTS = eINSTANCE.getJob_MaxAttempts();

		/**
		 * The meta object literal for the '<em><b>Allow Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ALLOW_FAILURE = eINSTANCE.getJob_AllowFailure();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.AgentImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__CONTAINER = eINSTANCE.getAgent_Container();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.DockerContainerImpl <em>Docker Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.DockerContainerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getDockerContainer()
		 * @generated
		 */
		EClass DOCKER_CONTAINER = eINSTANCE.getDockerContainer();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__LABEL = eINSTANCE.getDockerContainer_Label();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__IMAGE = eINSTANCE.getDockerContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__ENVIRONMENT_VARIABLES = eINSTANCE.getDockerContainer_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__VOLUMES = eINSTANCE.getDockerContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__PORTS = eINSTANCE.getDockerContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__OPTIONS = eINSTANCE.getDockerContainer_Options();

		/**
		 * The meta object literal for the '<em><b>Registry Username</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__REGISTRY_USERNAME = eINSTANCE.getDockerContainer_RegistryUsername();

		/**
		 * The meta object literal for the '<em><b>Registry Password</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__REGISTRY_PASSWORD = eINSTANCE.getDockerContainer_RegistryPassword();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__NETWORK = eINSTANCE.getDockerContainer_Network();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.TriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Branch Globs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__BRANCH_GLOBS = eINSTANCE.getTrigger_BranchGlobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PushTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPushTrigger()
		 * @generated
		 */
		EClass PUSH_TRIGGER = eINSTANCE.getPushTrigger();

		/**
		 * The meta object literal for the '<em><b>Tag Globs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__TAG_GLOBS = eINSTANCE.getPushTrigger_TagGlobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PullRequestTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPullRequestTrigger()
		 * @generated
		 */
		EClass PULL_REQUEST_TRIGGER = eINSTANCE.getPullRequestTrigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ManualTriggerImpl <em>Manual Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ManualTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getManualTrigger()
		 * @generated
		 */
		EClass MANUAL_TRIGGER = eINSTANCE.getManualTrigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ScheduledTriggerImpl <em>Scheduled Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ScheduledTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getScheduledTrigger()
		 * @generated
		 */
		EClass SCHEDULED_TRIGGER = eINSTANCE.getScheduledTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TRIGGER__CRON = eINSTANCE.getScheduledTrigger_Cron();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.WebhookTriggerImpl <em>Webhook Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.WebhookTriggerImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getWebhookTrigger()
		 * @generated
		 */
		EClass WEBHOOK_TRIGGER = eINSTANCE.getWebhookTrigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConcurrencyGroupImpl <em>Concurrency Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ConcurrencyGroupImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getConcurrencyGroup()
		 * @generated
		 */
		EClass CONCURRENCY_GROUP = eINSTANCE.getConcurrencyGroup();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENCY_GROUP__GROUP_ID = eINSTANCE.getConcurrencyGroup_GroupId();

		/**
		 * The meta object literal for the '<em><b>Cancel In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY_GROUP__CANCEL_IN_PROGRESS = eINSTANCE.getConcurrencyGroup_CancelInProgress();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PermissionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__KEY = eINSTANCE.getPermission_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__VALUE = eINSTANCE.getPermission_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__AXES = eINSTANCE.getMatrix_Axes();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__INCLUDES = eINSTANCE.getMatrix_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__EXCLUDES = eINSTANCE.getMatrix_Excludes();

		/**
		 * The meta object literal for the '<em><b>Fail Fast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__FAIL_FAST = eINSTANCE.getMatrix_FailFast();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixAxisImpl <em>Matrix Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixAxisImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getMatrixAxis()
		 * @generated
		 */
		EClass MATRIX_AXIS = eINSTANCE.getMatrixAxis();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_AXIS__NAME = eINSTANCE.getMatrixAxis_Name();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_AXIS__CELLS = eINSTANCE.getMatrixAxis_Cells();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixCombinationImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getMatrixCombination()
		 * @generated
		 */
		EClass MATRIX_COMBINATION = eINSTANCE.getMatrixCombination();

		/**
		 * The meta object literal for the '<em><b>Combination Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_COMBINATION__COMBINATION_ENTRIES = eINSTANCE.getMatrixCombination_CombinationEntries();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ParameterImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ID = eINSTANCE.getParameter_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.InputImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DEFAULT_VALUE = eINSTANCE.getInput_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__REQUIRED = eINSTANCE.getInput_Required();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.OutputImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.StepImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ConditionalStepImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getConditionalStep()
		 * @generated
		 */
		EClass CONDITIONAL_STEP = eINSTANCE.getConditionalStep();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__IF = eINSTANCE.getConditionalStep_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__THEN = eINSTANCE.getConditionalStep_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__ELSE = eINSTANCE.getConditionalStep_Else();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.NonConditionalStepImpl <em>Non Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.NonConditionalStepImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getNonConditionalStep()
		 * @generated
		 */
		EClass NON_CONDITIONAL_STEP = eINSTANCE.getNonConditionalStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_CONDITIONAL_STEP__ID = eINSTANCE.getNonConditionalStep_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_CONDITIONAL_STEP__NAME = eINSTANCE.getNonConditionalStep_Name();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES = eINSTANCE.getNonConditionalStep_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Timeout Minutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_CONDITIONAL_STEP__TIMEOUT_MINUTES = eINSTANCE.getNonConditionalStep_TimeoutMinutes();

		/**
		 * The meta object literal for the '<em><b>Allow Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_CONDITIONAL_STEP__ALLOW_FAILURE = eINSTANCE.getNonConditionalStep_AllowFailure();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CommandImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__PROGRAM = eINSTANCE.getCommand_Program();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__ARGS = eINSTANCE.getCommand_Args();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.PluginImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Plugin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__PLUGIN_NAME = eINSTANCE.getPlugin_PluginName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__VERSION = eINSTANCE.getPlugin_Version();

		/**
		 * The meta object literal for the '<em><b>Kwargs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGIN__KWARGS = eINSTANCE.getPlugin_Kwargs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CacheImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Cache Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__CACHE_NAME = eINSTANCE.getCache_CacheName();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__KEYS = eINSTANCE.getCache_Keys();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__PATHS = eINSTANCE.getCache_Paths();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ArtifactImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ARTIFACT_NAME = eINSTANCE.getArtifact_ArtifactName();

		/**
		 * The meta object literal for the '<em><b>Include Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__INCLUDE_PATHS = eINSTANCE.getArtifact_IncludePaths();

		/**
		 * The meta object literal for the '<em><b>Exclude Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__EXCLUDE_PATHS = eINSTANCE.getArtifact_ExcludePaths();

		/**
		 * The meta object literal for the '<em><b>Retention Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__RETENTION_TIME = eINSTANCE.getArtifact_RetentionTime();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.AssignmentImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getAssignment()
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
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ExpressionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ValueImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.LiteralImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.StringLiteralImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getStringLiteral()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.NumberLiteralImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getNumberLiteral()
		 * @generated
		 */
		EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.BooleanLiteralImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.VariableImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.EnvironmentVariableImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getEnvironmentVariable()
		 * @generated
		 */
		EClass ENVIRONMENT_VARIABLE = eINSTANCE.getEnvironmentVariable();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.SecretVariableImpl <em>Secret Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.SecretVariableImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getSecretVariable()
		 * @generated
		 */
		EClass SECRET_VARIABLE = eINSTANCE.getSecretVariable();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.BuiltInFunctionImpl <em>Built In Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.BuiltInFunctionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getBuiltInFunction()
		 * @generated
		 */
		EClass BUILT_IN_FUNCTION = eINSTANCE.getBuiltInFunction();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.BinaryOpImpl <em>Binary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.BinaryOpImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getBinaryOp()
		 * @generated
		 */
		EClass BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__LHS = eINSTANCE.getBinaryOp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__RHS = eINSTANCE.getBinaryOp_Rhs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.ConjuntionImpl <em>Conjuntion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.ConjuntionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getConjuntion()
		 * @generated
		 */
		EClass CONJUNTION = eINSTANCE.getConjuntion();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.DisjunctionImpl <em>Disjunction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.DisjunctionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getDisjunction()
		 * @generated
		 */
		EClass DISJUNCTION = eINSTANCE.getDisjunction();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.AdditionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.SubtractionImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getSubtraction()
		 * @generated
		 */
		EClass SUBTRACTION = eINSTANCE.getSubtraction();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.UnaryOpImpl <em>Unary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.UnaryOpImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getUnaryOp()
		 * @generated
		 */
		EClass UNARY_OP = eINSTANCE.getUnaryOp();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OP__RHS = eINSTANCE.getUnaryOp_Rhs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.impl.NegationImpl <em>Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.NegationImpl
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getNegation()
		 * @generated
		 */
		EClass NEGATION = eINSTANCE.getNegation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.PermissionType <em>Permission Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.PermissionType
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getPermissionType()
		 * @generated
		 */
		EEnum PERMISSION_TYPE = eINSTANCE.getPermissionType();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.ShellType <em>Shell Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.ShellType
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getShellType()
		 * @generated
		 */
		EEnum SHELL_TYPE = eINSTANCE.getShellType();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.metamodel.CICD.InputType <em>Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.metamodel.CICD.InputType
		 * @see d.fe.up.pt.cicd.metamodel.CICD.impl.CICDPackageImpl#getInputType()
		 * @generated
		 */
		EEnum INPUT_TYPE = eINSTANCE.getInputType();

	}

} //CICDPackage
