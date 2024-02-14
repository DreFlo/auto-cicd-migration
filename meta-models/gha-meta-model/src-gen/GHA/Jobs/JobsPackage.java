/**
 */
package GHA.Jobs;

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
 * @see GHA.Jobs.JobsFactory
 * @model kind="package"
 * @generated
 */
public interface JobsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Jobs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA/Jobs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Jobs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JobsPackage eINSTANCE = GHA.Jobs.impl.JobsPackageImpl.init();

	/**
	 * The meta object id for the '{@link GHA.Jobs.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.JobImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PERMISSIONS = 2;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEPENDS_ON = 3;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF = 4;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__AGENT = 5;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTAINER = 6;

	/**
	 * The feature id for the '<em><b>Staging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STAGING_ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEFAULTS = 8;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT_VARIABLES = 9;

	/**
	 * The feature id for the '<em><b>Services</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__SERVICES = 10;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONCURRENCY_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TIMEOUT_MINUTES = 12;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTINUE_ON_ERROR = 13;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STRATEGY = 14;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.Jobs.impl.ReuseWorkflowJobImpl <em>Reuse Workflow Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.ReuseWorkflowJobImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getReuseWorkflowJob()
	 * @generated
	 */
	int REUSE_WORKFLOW_JOB = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__NAME = JOB__NAME;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__JOB_NAME = JOB__JOB_NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__PERMISSIONS = JOB__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__DEPENDS_ON = JOB__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__IF = JOB__IF;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__AGENT = JOB__AGENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__CONTAINER = JOB__CONTAINER;

	/**
	 * The feature id for the '<em><b>Staging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__STAGING_ENVIRONMENT = JOB__STAGING_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__DEFAULTS = JOB__DEFAULTS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__ENVIRONMENT_VARIABLES = JOB__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Services</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__SERVICES = JOB__SERVICES;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__CONCURRENCY_GROUP = JOB__CONCURRENCY_GROUP;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__TIMEOUT_MINUTES = JOB__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__CONTINUE_ON_ERROR = JOB__CONTINUE_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__STRATEGY = JOB__STRATEGY;

	/**
	 * The feature id for the '<em><b>Workflow Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__WORKFLOW_PATH = JOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__ARGS = JOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__SECRETS = JOB_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inherit Secrets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__INHERIT_SECRETS = JOB_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Reuse Workflow Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB_FEATURE_COUNT = JOB_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Reuse Workflow Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Jobs.impl.ScriptJobImpl <em>Script Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.ScriptJobImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getScriptJob()
	 * @generated
	 */
	int SCRIPT_JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__NAME = JOB__NAME;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__JOB_NAME = JOB__JOB_NAME;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__PERMISSIONS = JOB__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__DEPENDS_ON = JOB__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__IF = JOB__IF;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__AGENT = JOB__AGENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__CONTAINER = JOB__CONTAINER;

	/**
	 * The feature id for the '<em><b>Staging Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__STAGING_ENVIRONMENT = JOB__STAGING_ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__DEFAULTS = JOB__DEFAULTS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__ENVIRONMENT_VARIABLES = JOB__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Services</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__SERVICES = JOB__SERVICES;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__CONCURRENCY_GROUP = JOB__CONCURRENCY_GROUP;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__TIMEOUT_MINUTES = JOB__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__CONTINUE_ON_ERROR = JOB__CONTINUE_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__STRATEGY = JOB__STRATEGY;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__STEPS = JOB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Script Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB_FEATURE_COUNT = JOB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Script Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB_OPERATION_COUNT = JOB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Jobs.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.AgentImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LABELS = 1;

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
	 * The meta object id for the '{@link GHA.Jobs.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.ContainerImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__ENVIRONMENT_VARIABLES = 3;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PORTS = 4;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUMES = 5;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OPTIONS = 6;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.Jobs.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.ServiceImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.Jobs.impl.StagingEnvironmentImpl <em>Staging Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Jobs.impl.StagingEnvironmentImpl
	 * @see GHA.Jobs.impl.JobsPackageImpl#getStagingEnvironment()
	 * @generated
	 */
	int STAGING_ENVIRONMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGING_ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGING_ENVIRONMENT__URL = 1;

	/**
	 * The number of structural features of the '<em>Staging Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGING_ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Staging Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGING_ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link GHA.Jobs.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see GHA.Jobs.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Jobs.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GHA.Jobs.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Name</em>'.
	 * @see GHA.Jobs.Job#getJobName()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_JobName();

	/**
	 * Returns the meta object for the map '{@link GHA.Jobs.Job#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Permissions</em>'.
	 * @see GHA.Jobs.Job#getPermissions()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link GHA.Jobs.Job#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see GHA.Jobs.Job#getDependsOn()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_DependsOn();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see GHA.Jobs.Job#getIf()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_If();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see GHA.Jobs.Job#getAgent()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Agent();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see GHA.Jobs.Job#getContainer()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Container();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getStagingEnvironment <em>Staging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staging Environment</em>'.
	 * @see GHA.Jobs.Job#getStagingEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_StagingEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaults</em>'.
	 * @see GHA.Jobs.Job#getDefaults()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Defaults();

	/**
	 * Returns the meta object for the map '{@link GHA.Jobs.Job#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see GHA.Jobs.Job#getEnvironmentVariables()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_EnvironmentVariables();

	/**
	 * Returns the meta object for the map '{@link GHA.Jobs.Job#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Services</em>'.
	 * @see GHA.Jobs.Job#getServices()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Services();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrency Group</em>'.
	 * @see GHA.Jobs.Job#getConcurrencyGroup()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_ConcurrencyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getTimeoutMinutes <em>Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Minutes</em>'.
	 * @see GHA.Jobs.Job#getTimeoutMinutes()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_TimeoutMinutes();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getContinueOnError <em>Continue On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Continue On Error</em>'.
	 * @see GHA.Jobs.Job#getContinueOnError()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_ContinueOnError();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Job#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy</em>'.
	 * @see GHA.Jobs.Job#getStrategy()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Strategy();

	/**
	 * Returns the meta object for class '{@link GHA.Jobs.ReuseWorkflowJob <em>Reuse Workflow Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse Workflow Job</em>'.
	 * @see GHA.Jobs.ReuseWorkflowJob
	 * @generated
	 */
	EClass getReuseWorkflowJob();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.ReuseWorkflowJob#getWorkflowPath <em>Workflow Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow Path</em>'.
	 * @see GHA.Jobs.ReuseWorkflowJob#getWorkflowPath()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EReference getReuseWorkflowJob_WorkflowPath();

	/**
	 * Returns the meta object for the map '{@link GHA.Jobs.ReuseWorkflowJob#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Args</em>'.
	 * @see GHA.Jobs.ReuseWorkflowJob#getArgs()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EReference getReuseWorkflowJob_Args();

	/**
	 * Returns the meta object for the map '{@link GHA.Jobs.ReuseWorkflowJob#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Secrets</em>'.
	 * @see GHA.Jobs.ReuseWorkflowJob#getSecrets()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EReference getReuseWorkflowJob_Secrets();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Jobs.ReuseWorkflowJob#getInheritSecrets <em>Inherit Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherit Secrets</em>'.
	 * @see GHA.Jobs.ReuseWorkflowJob#getInheritSecrets()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EAttribute getReuseWorkflowJob_InheritSecrets();

	/**
	 * Returns the meta object for class '{@link GHA.Jobs.ScriptJob <em>Script Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Job</em>'.
	 * @see GHA.Jobs.ScriptJob
	 * @generated
	 */
	EClass getScriptJob();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Jobs.ScriptJob#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see GHA.Jobs.ScriptJob#getSteps()
	 * @see #getScriptJob()
	 * @generated
	 */
	EReference getScriptJob_Steps();

	/**
	 * Returns the meta object for class '{@link GHA.Jobs.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see GHA.Jobs.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Agent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see GHA.Jobs.Agent#getGroup()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Jobs.Agent#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see GHA.Jobs.Agent#getLabels()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Labels();

	/**
	 * Returns the meta object for class '{@link GHA.Jobs.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see GHA.Jobs.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see GHA.Jobs.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Image();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Container#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username</em>'.
	 * @see GHA.Jobs.Container#getUsername()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Username();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Container#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see GHA.Jobs.Container#getPassword()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Password();

	/**
	 * Returns the meta object for the map '{@link GHA.Jobs.Container#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see GHA.Jobs.Container#getEnvironmentVariables()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_EnvironmentVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Jobs.Container#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see GHA.Jobs.Container#getPorts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Jobs.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see GHA.Jobs.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Volumes();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.Container#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see GHA.Jobs.Container#getOptions()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Options();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see java.util.Map.Entry
	 * @model keyId="true" keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="GHA.Jobs.Container" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Value();

	/**
	 * Returns the meta object for class '{@link GHA.Jobs.StagingEnvironment <em>Staging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staging Environment</em>'.
	 * @see GHA.Jobs.StagingEnvironment
	 * @generated
	 */
	EClass getStagingEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.StagingEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see GHA.Jobs.StagingEnvironment#getName()
	 * @see #getStagingEnvironment()
	 * @generated
	 */
	EReference getStagingEnvironment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Jobs.StagingEnvironment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see GHA.Jobs.StagingEnvironment#getUrl()
	 * @see #getStagingEnvironment()
	 * @generated
	 */
	EReference getStagingEnvironment_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JobsFactory getJobsFactory();

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
		 * The meta object literal for the '{@link GHA.Jobs.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.JobImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOB_NAME = eINSTANCE.getJob_JobName();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PERMISSIONS = eINSTANCE.getJob_Permissions();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEPENDS_ON = eINSTANCE.getJob_DependsOn();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IF = eINSTANCE.getJob_If();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__AGENT = eINSTANCE.getJob_Agent();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTAINER = eINSTANCE.getJob_Container();

		/**
		 * The meta object literal for the '<em><b>Staging Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STAGING_ENVIRONMENT = eINSTANCE.getJob_StagingEnvironment();

		/**
		 * The meta object literal for the '<em><b>Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEFAULTS = eINSTANCE.getJob_Defaults();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT_VARIABLES = eINSTANCE.getJob_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__SERVICES = eINSTANCE.getJob_Services();

		/**
		 * The meta object literal for the '<em><b>Concurrency Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONCURRENCY_GROUP = eINSTANCE.getJob_ConcurrencyGroup();

		/**
		 * The meta object literal for the '<em><b>Timeout Minutes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TIMEOUT_MINUTES = eINSTANCE.getJob_TimeoutMinutes();

		/**
		 * The meta object literal for the '<em><b>Continue On Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTINUE_ON_ERROR = eINSTANCE.getJob_ContinueOnError();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STRATEGY = eINSTANCE.getJob_Strategy();

		/**
		 * The meta object literal for the '{@link GHA.Jobs.impl.ReuseWorkflowJobImpl <em>Reuse Workflow Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.ReuseWorkflowJobImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getReuseWorkflowJob()
		 * @generated
		 */
		EClass REUSE_WORKFLOW_JOB = eINSTANCE.getReuseWorkflowJob();

		/**
		 * The meta object literal for the '<em><b>Workflow Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_WORKFLOW_JOB__WORKFLOW_PATH = eINSTANCE.getReuseWorkflowJob_WorkflowPath();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_WORKFLOW_JOB__ARGS = eINSTANCE.getReuseWorkflowJob_Args();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_WORKFLOW_JOB__SECRETS = eINSTANCE.getReuseWorkflowJob_Secrets();

		/**
		 * The meta object literal for the '<em><b>Inherit Secrets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REUSE_WORKFLOW_JOB__INHERIT_SECRETS = eINSTANCE.getReuseWorkflowJob_InheritSecrets();

		/**
		 * The meta object literal for the '{@link GHA.Jobs.impl.ScriptJobImpl <em>Script Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.ScriptJobImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getScriptJob()
		 * @generated
		 */
		EClass SCRIPT_JOB = eINSTANCE.getScriptJob();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT_JOB__STEPS = eINSTANCE.getScriptJob_Steps();

		/**
		 * The meta object literal for the '{@link GHA.Jobs.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.AgentImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__GROUP = eINSTANCE.getAgent_Group();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__LABELS = eINSTANCE.getAgent_Labels();

		/**
		 * The meta object literal for the '{@link GHA.Jobs.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.ContainerImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__USERNAME = eINSTANCE.getContainer_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PASSWORD = eINSTANCE.getContainer_Password();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__ENVIRONMENT_VARIABLES = eINSTANCE.getContainer_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PORTS = eINSTANCE.getContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__OPTIONS = eINSTANCE.getContainer_Options();

		/**
		 * The meta object literal for the '{@link GHA.Jobs.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.ServiceImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__KEY = eINSTANCE.getService_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__VALUE = eINSTANCE.getService_Value();

		/**
		 * The meta object literal for the '{@link GHA.Jobs.impl.StagingEnvironmentImpl <em>Staging Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Jobs.impl.StagingEnvironmentImpl
		 * @see GHA.Jobs.impl.JobsPackageImpl#getStagingEnvironment()
		 * @generated
		 */
		EClass STAGING_ENVIRONMENT = eINSTANCE.getStagingEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGING_ENVIRONMENT__NAME = eINSTANCE.getStagingEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGING_ENVIRONMENT__URL = eINSTANCE.getStagingEnvironment_Url();

	}

} //JobsPackage
