/**
 */
package GHA;

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
 * @see GHA.GHAFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface GHAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GHA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GHA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GHAPackage eINSTANCE = GHA.impl.GHAPackageImpl.init();

	/**
	 * The meta object id for the '{@link GHA.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.WorkflowImpl
	 * @see GHA.impl.GHAPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Run Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__RUN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRIGGERS = 2;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PERMISSIONS = 3;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__DEFAULTS = 4;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ENVIRONMENT_VARIABLES = 5;

	/**
	 * The feature id for the '<em><b>Concurrency Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONCURRENCY_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__JOBS = 7;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.JobImpl
	 * @see GHA.impl.GHAPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 1;

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
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF_CONDITION = 4;

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
	 * The meta object id for the '{@link GHA.impl.ReuseWorkflowJobImpl <em>Reuse Workflow Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ReuseWorkflowJobImpl
	 * @see GHA.impl.GHAPackageImpl#getReuseWorkflowJob()
	 * @generated
	 */
	int REUSE_WORKFLOW_JOB = 2;

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
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_WORKFLOW_JOB__IF_CONDITION = JOB__IF_CONDITION;

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
	 * The meta object id for the '{@link GHA.impl.ScriptJobImpl <em>Script Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ScriptJobImpl
	 * @see GHA.impl.GHAPackageImpl#getScriptJob()
	 * @generated
	 */
	int SCRIPT_JOB = 3;

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
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_JOB__IF_CONDITION = JOB__IF_CONDITION;

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
	 * The meta object id for the '{@link GHA.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.AgentImpl
	 * @see GHA.impl.GHAPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 4;

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
	 * The meta object id for the '{@link GHA.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ContainerImpl
	 * @see GHA.impl.GHAPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 5;

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
	 * The meta object id for the '{@link GHA.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ServiceImpl
	 * @see GHA.impl.GHAPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 6;

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
	 * The meta object id for the '{@link GHA.impl.StagingEnvironmentImpl <em>Staging Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.StagingEnvironmentImpl
	 * @see GHA.impl.GHAPackageImpl#getStagingEnvironment()
	 * @generated
	 */
	int STAGING_ENVIRONMENT = 7;

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
	 * The meta object id for the '{@link GHA.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.TriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 8;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.impl.StandardEventTriggerImpl <em>Standard Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.StandardEventTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getStandardEventTrigger()
	 * @generated
	 */
	int STANDARD_EVENT_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER__EVENT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER__EVENT_TYPES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Standard Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Standard Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.WorkflowRunTriggerImpl <em>Workflow Run Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.WorkflowRunTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getWorkflowRunTrigger()
	 * @generated
	 */
	int WORKFLOW_RUN_TRIGGER = 10;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Run Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workflow Run Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_RUN_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.PullRequestTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getPullRequestTrigger()
	 * @generated
	 */
	int PULL_REQUEST_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Event Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__EVENT_TYPES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__PATHS = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ignore Specified Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS = TRIGGER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Pull Request Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.PushTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getPushTrigger()
	 * @generated
	 */
	int PUSH_TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__BRANCHES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__PATHS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Specified Paths</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__TAGS = TRIGGER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS = TRIGGER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ScheduleTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getScheduleTrigger()
	 * @generated
	 */
	int SCHEDULE_TRIGGER = 13;

	/**
	 * The feature id for the '<em><b>Crons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__CRONS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.WorkflowCallTriggerImpl <em>Workflow Call Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.WorkflowCallTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getWorkflowCallTrigger()
	 * @generated
	 */
	int WORKFLOW_CALL_TRIGGER = 14;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__INPUTS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__OUTPUTS = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER__SECRETS = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Call Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workflow Call Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.WorkflowDispatchTriggerImpl <em>Workflow Dispatch Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.WorkflowDispatchTriggerImpl
	 * @see GHA.impl.GHAPackageImpl#getWorkflowDispatchTrigger()
	 * @generated
	 */
	int WORKFLOW_DISPATCH_TRIGGER = 15;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER__INPUTS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Dispatch Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow Dispatch Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.PermissionImpl
	 * @see GHA.impl.GHAPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 16;

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
	 * The meta object id for the '{@link GHA.impl.ConcurrencyGroupImpl <em>Concurrency Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ConcurrencyGroupImpl
	 * @see GHA.impl.GHAPackageImpl#getConcurrencyGroup()
	 * @generated
	 */
	int CONCURRENCY_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cancel In Progress</b></em>' containment reference.
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
	 * The meta object id for the '{@link GHA.impl.DefaultsImpl <em>Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.DefaultsImpl
	 * @see GHA.impl.GHAPackageImpl#getDefaults()
	 * @generated
	 */
	int DEFAULTS = 18;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS__SHELL = 0;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS__WORKING_DIRECTORY = 1;

	/**
	 * The number of structural features of the '<em>Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.VariableAssignmentImpl
	 * @see GHA.impl.GHAPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ASSIGNMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ExpressionImpl
	 * @see GHA.impl.GHAPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 20;

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
	 * The meta object id for the '{@link GHA.impl.BinaryOpImpl <em>Binary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.BinaryOpImpl
	 * @see GHA.impl.GHAPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 21;

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
	 * The meta object id for the '{@link GHA.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ConcatImpl
	 * @see GHA.impl.GHAPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT__RHS = BINARY_OP__RHS;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.EqualityImpl
	 * @see GHA.impl.GHAPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 23;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RHS = BINARY_OP__RHS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__OP = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ComparisonImpl
	 * @see GHA.impl.GHAPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 24;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LHS = BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RHS = BINARY_OP__RHS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OP = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.LogicalOpImpl <em>Logical Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.LogicalOpImpl
	 * @see GHA.impl.GHAPackageImpl#getLogicalOp()
	 * @generated
	 */
	int LOGICAL_OP = 25;

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
	 * The meta object id for the '{@link GHA.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.OrImpl
	 * @see GHA.impl.GHAPackageImpl#getOr()
	 * @generated
	 */
	int OR = 26;

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
	 * The meta object id for the '{@link GHA.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.AndImpl
	 * @see GHA.impl.GHAPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 27;

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
	 * The meta object id for the '{@link GHA.impl.UnaryOpImpl <em>Unary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.UnaryOpImpl
	 * @see GHA.impl.GHAPackageImpl#getUnaryOp()
	 * @generated
	 */
	int UNARY_OP = 28;

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
	 * The meta object id for the '{@link GHA.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.NotImpl
	 * @see GHA.impl.GHAPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 29;

	/**
	 * The feature id for the '<em><b>Child Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__CHILD_EXPR = UNARY_OP__CHILD_EXPR;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.BuiltInFunctionCallImpl <em>Built In Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.BuiltInFunctionCallImpl
	 * @see GHA.impl.GHAPackageImpl#getBuiltInFunctionCall()
	 * @generated
	 */
	int BUILT_IN_FUNCTION_CALL = 30;

	/**
	 * The number of structural features of the '<em>Built In Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ContainsImpl
	 * @see GHA.impl.GHAPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 31;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SEARCH = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ITEM = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.StartsWithImpl <em>Starts With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.StartsWithImpl
	 * @see GHA.impl.GHAPackageImpl#getStartsWith()
	 * @generated
	 */
	int STARTS_WITH = 32;

	/**
	 * The feature id for the '<em><b>Search String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__SEARCH_STRING = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__SEARCH_VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.EndsWithImpl
	 * @see GHA.impl.GHAPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 33;

	/**
	 * The feature id for the '<em><b>Search String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SEARCH_STRING = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SEARCH_VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.FormatImpl <em>Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.FormatImpl
	 * @see GHA.impl.GHAPackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 34;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__STRING = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replace Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__REPLACE_VALUES = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.JoinImpl
	 * @see GHA.impl.GHAPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 35;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ARRAY = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SEP = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ToJSONImpl <em>To JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ToJSONImpl
	 * @see GHA.impl.GHAPackageImpl#getToJSON()
	 * @generated
	 */
	int TO_JSON = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_JSON__VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_JSON_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>To JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_JSON_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.FromJSONImpl <em>From JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.FromJSONImpl
	 * @see GHA.impl.GHAPackageImpl#getFromJSON()
	 * @generated
	 */
	int FROM_JSON = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_JSON__VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_JSON_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>From JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_JSON_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.HashFilesImpl <em>Hash Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.HashFilesImpl
	 * @see GHA.impl.GHAPackageImpl#getHashFiles()
	 * @generated
	 */
	int HASH_FILES = 38;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FILES__PATH = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hash Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FILES_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hash Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FILES_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.StatusCheckImpl <em>Status Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.StatusCheckImpl
	 * @see GHA.impl.GHAPackageImpl#getStatusCheck()
	 * @generated
	 */
	int STATUS_CHECK = 39;

	/**
	 * The number of structural features of the '<em>Status Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHECK_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHECK_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.AlwaysImpl <em>Always</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.AlwaysImpl
	 * @see GHA.impl.GHAPackageImpl#getAlways()
	 * @generated
	 */
	int ALWAYS = 40;

	/**
	 * The number of structural features of the '<em>Always</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.SuccessImpl <em>Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.SuccessImpl
	 * @see GHA.impl.GHAPackageImpl#getSuccess()
	 * @generated
	 */
	int SUCCESS = 41;

	/**
	 * The number of structural features of the '<em>Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.CancelledImpl <em>Cancelled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.CancelledImpl
	 * @see GHA.impl.GHAPackageImpl#getCancelled()
	 * @generated
	 */
	int CANCELLED = 42;

	/**
	 * The number of structural features of the '<em>Cancelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELLED_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cancelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELLED_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.FailureImpl
	 * @see GHA.impl.GHAPackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 43;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ValueImpl
	 * @see GHA.impl.GHAPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 44;

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
	 * The meta object id for the '{@link GHA.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.LiteralImpl
	 * @see GHA.impl.GHAPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 45;

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
	 * The meta object id for the '{@link GHA.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.StringLiteralImpl
	 * @see GHA.impl.GHAPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 46;

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
	 * The meta object id for the '{@link GHA.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.IntegerLiteralImpl
	 * @see GHA.impl.GHAPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 47;

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
	 * The meta object id for the '{@link GHA.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.DoubleLiteralImpl
	 * @see GHA.impl.GHAPackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 48;

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
	 * The meta object id for the '{@link GHA.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.BooleanLiteralImpl
	 * @see GHA.impl.GHAPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 49;

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
	 * The meta object id for the '{@link GHA.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.VariableImpl
	 * @see GHA.impl.GHAPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 50;

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
	 * The meta object id for the '{@link GHA.impl.GitHubContextImpl <em>Git Hub Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.GitHubContextImpl
	 * @see GHA.impl.GHAPackageImpl#getGitHubContext()
	 * @generated
	 */
	int GIT_HUB_CONTEXT = 51;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_CONTEXT__CONTEXT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Git Hub Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_CONTEXT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Git Hub Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_CONTEXT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.VariableDereferenceImpl <em>Variable Dereference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.VariableDereferenceImpl
	 * @see GHA.impl.GHAPackageImpl#getVariableDereference()
	 * @generated
	 */
	int VARIABLE_DEREFERENCE = 52;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE__VARIABLE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE__PROPERTY = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.MatrixImpl
	 * @see GHA.impl.GHAPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 53;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__AXES = 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__INCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__EXCLUDES = 2;

	/**
	 * The feature id for the '<em><b>Fail Fast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__FAIL_FAST = 3;

	/**
	 * The feature id for the '<em><b>Max Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__MAX_PARALLEL = 4;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.impl.MatrixAxisImpl <em>Matrix Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.MatrixAxisImpl
	 * @see GHA.impl.GHAPackageImpl#getMatrixAxis()
	 * @generated
	 */
	int MATRIX_AXIS = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_AXIS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
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
	 * The meta object id for the '{@link GHA.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.MatrixCombinationImpl
	 * @see GHA.impl.GHAPackageImpl#getMatrixCombination()
	 * @generated
	 */
	int MATRIX_COMBINATION = 55;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_COMBINATION__ENTRIES = 0;

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
	 * The meta object id for the '{@link GHA.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.StepImpl
	 * @see GHA.impl.GHAPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 56;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TIMEOUT_MINUTES = 3;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONTINUE_ON_ERROR = 4;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SHELL = 5;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WORKING_DIRECTORY = 6;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENVIRONMENT_VARIABLES = 7;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GHA.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.CommandImpl
	 * @see GHA.impl.GHAPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__IF_CONDITION = STEP__IF_CONDITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TIMEOUT_MINUTES = STEP__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__CONTINUE_ON_ERROR = STEP__CONTINUE_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__SHELL = STEP__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__WORKING_DIRECTORY = STEP__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ENVIRONMENT_VARIABLES = STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMAND = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.PackageImpl
	 * @see GHA.impl.GHAPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = STEP__ID;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__IF_CONDITION = STEP__IF_CONDITION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Timeout Minutes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TIMEOUT_MINUTES = STEP__TIMEOUT_MINUTES;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTINUE_ON_ERROR = STEP__CONTINUE_ON_ERROR;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SHELL = STEP__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__WORKING_DIRECTORY = STEP__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ENVIRONMENT_VARIABLES = STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USES = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ARGS = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ENTRYPOINT = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONTAINER_ARGS = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.ParameterImpl
	 * @see GHA.impl.GHAPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
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
	 * The meta object id for the '{@link GHA.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.InputImpl
	 * @see GHA.impl.GHAPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
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
	 * The feature id for the '<em><b>Is Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__IS_REQUIRED = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT = PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__OPTIONS = PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.SecretImpl
	 * @see GHA.impl.GHAPackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__IS_REQUIRED = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.impl.OutputImpl
	 * @see GHA.impl.GHAPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = PARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__DESCRIPTION = PARAMETER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
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
	 * The meta object id for the '{@link GHA.EVENTS <em>EVENTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.EVENTS
	 * @see GHA.impl.GHAPackageImpl#getEVENTS()
	 * @generated
	 */
	int EVENTS = 63;

	/**
	 * The meta object id for the '{@link GHA.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.WEBHOOK_ACTIVITY_TYPES
	 * @see GHA.impl.GHAPackageImpl#getWEBHOOK_ACTIVITY_TYPES()
	 * @generated
	 */
	int WEBHOOK_ACTIVITY_TYPES = 64;

	/**
	 * The meta object id for the '{@link GHA.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.PERMISSION_SCOPES
	 * @see GHA.impl.GHAPackageImpl#getPERMISSION_SCOPES()
	 * @generated
	 */
	int PERMISSION_SCOPES = 65;

	/**
	 * The meta object id for the '{@link GHA.PERMISSIONS <em>PERMISSIONS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.PERMISSIONS
	 * @see GHA.impl.GHAPackageImpl#getPERMISSIONS()
	 * @generated
	 */
	int PERMISSIONS = 66;

	/**
	 * The meta object id for the '{@link GHA.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.EQUALITY_OPS
	 * @see GHA.impl.GHAPackageImpl#getEQUALITY_OPS()
	 * @generated
	 */
	int EQUALITY_OPS = 67;

	/**
	 * The meta object id for the '{@link GHA.COMPARISON_OPS <em>COMPARISON OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.COMPARISON_OPS
	 * @see GHA.impl.GHAPackageImpl#getCOMPARISON_OPS()
	 * @generated
	 */
	int COMPARISON_OPS = 68;

	/**
	 * The meta object id for the '{@link GHA.CONTEXTS <em>CONTEXTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.CONTEXTS
	 * @see GHA.impl.GHAPackageImpl#getCONTEXTS()
	 * @generated
	 */
	int CONTEXTS = 69;

	/**
	 * The meta object id for the '{@link GHA.INPUT_TYPES <em>INPUT TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.INPUT_TYPES
	 * @see GHA.impl.GHAPackageImpl#getINPUT_TYPES()
	 * @generated
	 */
	int INPUT_TYPES = 70;

	/**
	 * Returns the meta object for class '{@link GHA.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see GHA.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see GHA.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Workflow#getRunName <em>Run Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run Name</em>'.
	 * @see GHA.Workflow#getRunName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_RunName();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Workflow#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see GHA.Workflow#getTriggers()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Triggers();

	/**
	 * Returns the meta object for the map '{@link GHA.Workflow#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Permissions</em>'.
	 * @see GHA.Workflow#getPermissions()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Workflow#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaults</em>'.
	 * @see GHA.Workflow#getDefaults()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Defaults();

	/**
	 * Returns the meta object for the map '{@link GHA.Workflow#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see GHA.Workflow#getEnvironmentVariables()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_EnvironmentVariables();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Workflow#getConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrency Group</em>'.
	 * @see GHA.Workflow#getConcurrencyGroup()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ConcurrencyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Workflow#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see GHA.Workflow#getJobs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Jobs();

	/**
	 * Returns the meta object for class '{@link GHA.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see GHA.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GHA.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Job Name</em>'.
	 * @see GHA.Job#getJobName()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_JobName();

	/**
	 * Returns the meta object for the map '{@link GHA.Job#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Permissions</em>'.
	 * @see GHA.Job#getPermissions()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Permissions();

	/**
	 * Returns the meta object for the reference list '{@link GHA.Job#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see GHA.Job#getDependsOn()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_DependsOn();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see GHA.Job#getIfCondition()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_IfCondition();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see GHA.Job#getAgent()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Agent();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see GHA.Job#getContainer()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Container();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getStagingEnvironment <em>Staging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staging Environment</em>'.
	 * @see GHA.Job#getStagingEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_StagingEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaults</em>'.
	 * @see GHA.Job#getDefaults()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Defaults();

	/**
	 * Returns the meta object for the map '{@link GHA.Job#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see GHA.Job#getEnvironmentVariables()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_EnvironmentVariables();

	/**
	 * Returns the meta object for the map '{@link GHA.Job#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Services</em>'.
	 * @see GHA.Job#getServices()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Services();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrency Group</em>'.
	 * @see GHA.Job#getConcurrencyGroup()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_ConcurrencyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getTimeoutMinutes <em>Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Minutes</em>'.
	 * @see GHA.Job#getTimeoutMinutes()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_TimeoutMinutes();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getContinueOnError <em>Continue On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Continue On Error</em>'.
	 * @see GHA.Job#getContinueOnError()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_ContinueOnError();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Job#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy</em>'.
	 * @see GHA.Job#getStrategy()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Strategy();

	/**
	 * Returns the meta object for class '{@link GHA.ReuseWorkflowJob <em>Reuse Workflow Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse Workflow Job</em>'.
	 * @see GHA.ReuseWorkflowJob
	 * @generated
	 */
	EClass getReuseWorkflowJob();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.ReuseWorkflowJob#getWorkflowPath <em>Workflow Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow Path</em>'.
	 * @see GHA.ReuseWorkflowJob#getWorkflowPath()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EReference getReuseWorkflowJob_WorkflowPath();

	/**
	 * Returns the meta object for the map '{@link GHA.ReuseWorkflowJob#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Args</em>'.
	 * @see GHA.ReuseWorkflowJob#getArgs()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EReference getReuseWorkflowJob_Args();

	/**
	 * Returns the meta object for the map '{@link GHA.ReuseWorkflowJob#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Secrets</em>'.
	 * @see GHA.ReuseWorkflowJob#getSecrets()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EReference getReuseWorkflowJob_Secrets();

	/**
	 * Returns the meta object for the attribute '{@link GHA.ReuseWorkflowJob#getInheritSecrets <em>Inherit Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inherit Secrets</em>'.
	 * @see GHA.ReuseWorkflowJob#getInheritSecrets()
	 * @see #getReuseWorkflowJob()
	 * @generated
	 */
	EAttribute getReuseWorkflowJob_InheritSecrets();

	/**
	 * Returns the meta object for class '{@link GHA.ScriptJob <em>Script Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Job</em>'.
	 * @see GHA.ScriptJob
	 * @generated
	 */
	EClass getScriptJob();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.ScriptJob#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see GHA.ScriptJob#getSteps()
	 * @see #getScriptJob()
	 * @generated
	 */
	EReference getScriptJob_Steps();

	/**
	 * Returns the meta object for class '{@link GHA.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see GHA.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Agent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see GHA.Agent#getGroup()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Agent#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see GHA.Agent#getLabels()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Labels();

	/**
	 * Returns the meta object for class '{@link GHA.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see GHA.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see GHA.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Image();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Container#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username</em>'.
	 * @see GHA.Container#getUsername()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Username();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Container#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see GHA.Container#getPassword()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Password();

	/**
	 * Returns the meta object for the map '{@link GHA.Container#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see GHA.Container#getEnvironmentVariables()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_EnvironmentVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Container#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see GHA.Container#getPorts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see GHA.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Volumes();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Container#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Options</em>'.
	 * @see GHA.Container#getOptions()
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
	 *        valueType="GHA.Container" valueContainment="true" valueRequired="true"
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
	 * Returns the meta object for class '{@link GHA.StagingEnvironment <em>Staging Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staging Environment</em>'.
	 * @see GHA.StagingEnvironment
	 * @generated
	 */
	EClass getStagingEnvironment();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.StagingEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see GHA.StagingEnvironment#getName()
	 * @see #getStagingEnvironment()
	 * @generated
	 */
	EReference getStagingEnvironment_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.StagingEnvironment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see GHA.StagingEnvironment#getUrl()
	 * @see #getStagingEnvironment()
	 * @generated
	 */
	EReference getStagingEnvironment_Url();

	/**
	 * Returns the meta object for class '{@link GHA.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see GHA.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link GHA.StandardEventTrigger <em>Standard Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard Event Trigger</em>'.
	 * @see GHA.StandardEventTrigger
	 * @generated
	 */
	EClass getStandardEventTrigger();

	/**
	 * Returns the meta object for the attribute '{@link GHA.StandardEventTrigger#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see GHA.StandardEventTrigger#getEvent()
	 * @see #getStandardEventTrigger()
	 * @generated
	 */
	EAttribute getStandardEventTrigger_Event();

	/**
	 * Returns the meta object for the attribute list '{@link GHA.StandardEventTrigger#getEventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Types</em>'.
	 * @see GHA.StandardEventTrigger#getEventTypes()
	 * @see #getStandardEventTrigger()
	 * @generated
	 */
	EAttribute getStandardEventTrigger_EventTypes();

	/**
	 * Returns the meta object for class '{@link GHA.WorkflowRunTrigger <em>Workflow Run Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Run Trigger</em>'.
	 * @see GHA.WorkflowRunTrigger
	 * @generated
	 */
	EClass getWorkflowRunTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.WorkflowRunTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see GHA.WorkflowRunTrigger#getBranches()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EReference getWorkflowRunTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link GHA.WorkflowRunTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see GHA.WorkflowRunTrigger#isIgnoreSpecifiedBranches()
	 * @see #getWorkflowRunTrigger()
	 * @generated
	 */
	EAttribute getWorkflowRunTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for class '{@link GHA.PullRequestTrigger <em>Pull Request Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull Request Trigger</em>'.
	 * @see GHA.PullRequestTrigger
	 * @generated
	 */
	EClass getPullRequestTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link GHA.PullRequestTrigger#getEventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Types</em>'.
	 * @see GHA.PullRequestTrigger#getEventTypes()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EAttribute getPullRequestTrigger_EventTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.PullRequestTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see GHA.PullRequestTrigger#getBranches()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EReference getPullRequestTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link GHA.PullRequestTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see GHA.PullRequestTrigger#isIgnoreSpecifiedBranches()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EAttribute getPullRequestTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.PullRequestTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see GHA.PullRequestTrigger#getPaths()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EReference getPullRequestTrigger_Paths();

	/**
	 * Returns the meta object for the attribute '{@link GHA.PullRequestTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Paths</em>'.
	 * @see GHA.PullRequestTrigger#isIgnoreSpecifiedPaths()
	 * @see #getPullRequestTrigger()
	 * @generated
	 */
	EAttribute getPullRequestTrigger_IgnoreSpecifiedPaths();

	/**
	 * Returns the meta object for class '{@link GHA.PushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Trigger</em>'.
	 * @see GHA.PushTrigger
	 * @generated
	 */
	EClass getPushTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.PushTrigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see GHA.PushTrigger#getBranches()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link GHA.PushTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see GHA.PushTrigger#isIgnoreSpecifiedBranches()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.PushTrigger#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see GHA.PushTrigger#getPaths()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Paths();

	/**
	 * Returns the meta object for the attribute '{@link GHA.PushTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Paths</em>'.
	 * @see GHA.PushTrigger#isIgnoreSpecifiedPaths()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_IgnoreSpecifiedPaths();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.PushTrigger#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see GHA.PushTrigger#getTags()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EReference getPushTrigger_Tags();

	/**
	 * Returns the meta object for the attribute '{@link GHA.PushTrigger#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Tags</em>'.
	 * @see GHA.PushTrigger#isIgnoreSpecifiedTags()
	 * @see #getPushTrigger()
	 * @generated
	 */
	EAttribute getPushTrigger_IgnoreSpecifiedTags();

	/**
	 * Returns the meta object for class '{@link GHA.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Trigger</em>'.
	 * @see GHA.ScheduleTrigger
	 * @generated
	 */
	EClass getScheduleTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.ScheduleTrigger#getCrons <em>Crons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Crons</em>'.
	 * @see GHA.ScheduleTrigger#getCrons()
	 * @see #getScheduleTrigger()
	 * @generated
	 */
	EReference getScheduleTrigger_Crons();

	/**
	 * Returns the meta object for class '{@link GHA.WorkflowCallTrigger <em>Workflow Call Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Call Trigger</em>'.
	 * @see GHA.WorkflowCallTrigger
	 * @generated
	 */
	EClass getWorkflowCallTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.WorkflowCallTrigger#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see GHA.WorkflowCallTrigger#getInputs()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.WorkflowCallTrigger#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see GHA.WorkflowCallTrigger#getOutputs()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.WorkflowCallTrigger#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see GHA.WorkflowCallTrigger#getSecrets()
	 * @see #getWorkflowCallTrigger()
	 * @generated
	 */
	EReference getWorkflowCallTrigger_Secrets();

	/**
	 * Returns the meta object for class '{@link GHA.WorkflowDispatchTrigger <em>Workflow Dispatch Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Dispatch Trigger</em>'.
	 * @see GHA.WorkflowDispatchTrigger
	 * @generated
	 */
	EClass getWorkflowDispatchTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.WorkflowDispatchTrigger#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see GHA.WorkflowDispatchTrigger#getInputs()
	 * @see #getWorkflowDispatchTrigger()
	 * @generated
	 */
	EReference getWorkflowDispatchTrigger_Inputs();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see java.util.Map.Entry
	 * @model keyId="true" keyDataType="GHA.PERMISSION_SCOPES" keyRequired="true"
	 *        valueDataType="GHA.PERMISSIONS" valueRequired="true"
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
	 * Returns the meta object for class '{@link GHA.ConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency Group</em>'.
	 * @see GHA.ConcurrencyGroup
	 * @generated
	 */
	EClass getConcurrencyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.ConcurrencyGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see GHA.ConcurrencyGroup#getName()
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	EReference getConcurrencyGroup_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.ConcurrencyGroup#getCancelInProgress <em>Cancel In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel In Progress</em>'.
	 * @see GHA.ConcurrencyGroup#getCancelInProgress()
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	EReference getConcurrencyGroup_CancelInProgress();

	/**
	 * Returns the meta object for class '{@link GHA.Defaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defaults</em>'.
	 * @see GHA.Defaults
	 * @generated
	 */
	EClass getDefaults();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Defaults#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shell</em>'.
	 * @see GHA.Defaults#getShell()
	 * @see #getDefaults()
	 * @generated
	 */
	EReference getDefaults_Shell();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Defaults#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory</em>'.
	 * @see GHA.Defaults#getWorkingDirectory()
	 * @see #getDefaults()
	 * @generated
	 */
	EReference getDefaults_WorkingDirectory();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see java.util.Map.Entry
	 * @model keyId="true" keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="GHA.Expression" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EAttribute getVariableAssignment_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Value();

	/**
	 * Returns the meta object for class '{@link GHA.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see GHA.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link GHA.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Op</em>'.
	 * @see GHA.BinaryOp
	 * @generated
	 */
	EClass getBinaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.BinaryOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see GHA.BinaryOp#getLhs()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.BinaryOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see GHA.BinaryOp#getRhs()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Rhs();

	/**
	 * Returns the meta object for class '{@link GHA.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see GHA.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for class '{@link GHA.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see GHA.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Equality#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see GHA.Equality#getOp()
	 * @see #getEquality()
	 * @generated
	 */
	EAttribute getEquality_Op();

	/**
	 * Returns the meta object for class '{@link GHA.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see GHA.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Comparison#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see GHA.Comparison#getOp()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Op();

	/**
	 * Returns the meta object for class '{@link GHA.LogicalOp <em>Logical Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Op</em>'.
	 * @see GHA.LogicalOp
	 * @generated
	 */
	EClass getLogicalOp();

	/**
	 * Returns the meta object for class '{@link GHA.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see GHA.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link GHA.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see GHA.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link GHA.UnaryOp <em>Unary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Op</em>'.
	 * @see GHA.UnaryOp
	 * @generated
	 */
	EClass getUnaryOp();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.UnaryOp#getChildExpr <em>Child Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Expr</em>'.
	 * @see GHA.UnaryOp#getChildExpr()
	 * @see #getUnaryOp()
	 * @generated
	 */
	EReference getUnaryOp_ChildExpr();

	/**
	 * Returns the meta object for class '{@link GHA.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see GHA.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link GHA.BuiltInFunctionCall <em>Built In Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Function Call</em>'.
	 * @see GHA.BuiltInFunctionCall
	 * @generated
	 */
	EClass getBuiltInFunctionCall();

	/**
	 * Returns the meta object for class '{@link GHA.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see GHA.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Contains#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search</em>'.
	 * @see GHA.Contains#getSearch()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Search();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Contains#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see GHA.Contains#getItem()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Item();

	/**
	 * Returns the meta object for class '{@link GHA.StartsWith <em>Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starts With</em>'.
	 * @see GHA.StartsWith
	 * @generated
	 */
	EClass getStartsWith();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.StartsWith#getSearchString <em>Search String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search String</em>'.
	 * @see GHA.StartsWith#getSearchString()
	 * @see #getStartsWith()
	 * @generated
	 */
	EReference getStartsWith_SearchString();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.StartsWith#getSearchValue <em>Search Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Value</em>'.
	 * @see GHA.StartsWith#getSearchValue()
	 * @see #getStartsWith()
	 * @generated
	 */
	EReference getStartsWith_SearchValue();

	/**
	 * Returns the meta object for class '{@link GHA.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ends With</em>'.
	 * @see GHA.EndsWith
	 * @generated
	 */
	EClass getEndsWith();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.EndsWith#getSearchString <em>Search String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search String</em>'.
	 * @see GHA.EndsWith#getSearchString()
	 * @see #getEndsWith()
	 * @generated
	 */
	EReference getEndsWith_SearchString();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.EndsWith#getSearchValue <em>Search Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Value</em>'.
	 * @see GHA.EndsWith#getSearchValue()
	 * @see #getEndsWith()
	 * @generated
	 */
	EReference getEndsWith_SearchValue();

	/**
	 * Returns the meta object for class '{@link GHA.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format</em>'.
	 * @see GHA.Format
	 * @generated
	 */
	EClass getFormat();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Format#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see GHA.Format#getString()
	 * @see #getFormat()
	 * @generated
	 */
	EReference getFormat_String();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Format#getReplaceValues <em>Replace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace Values</em>'.
	 * @see GHA.Format#getReplaceValues()
	 * @see #getFormat()
	 * @generated
	 */
	EReference getFormat_ReplaceValues();

	/**
	 * Returns the meta object for class '{@link GHA.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see GHA.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Join#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see GHA.Join#getArray()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Array();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Join#getSep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sep</em>'.
	 * @see GHA.Join#getSep()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Sep();

	/**
	 * Returns the meta object for class '{@link GHA.ToJSON <em>To JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To JSON</em>'.
	 * @see GHA.ToJSON
	 * @generated
	 */
	EClass getToJSON();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.ToJSON#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see GHA.ToJSON#getValue()
	 * @see #getToJSON()
	 * @generated
	 */
	EReference getToJSON_Value();

	/**
	 * Returns the meta object for class '{@link GHA.FromJSON <em>From JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From JSON</em>'.
	 * @see GHA.FromJSON
	 * @generated
	 */
	EClass getFromJSON();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.FromJSON#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see GHA.FromJSON#getValue()
	 * @see #getFromJSON()
	 * @generated
	 */
	EReference getFromJSON_Value();

	/**
	 * Returns the meta object for class '{@link GHA.HashFiles <em>Hash Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Files</em>'.
	 * @see GHA.HashFiles
	 * @generated
	 */
	EClass getHashFiles();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.HashFiles#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see GHA.HashFiles#getPath()
	 * @see #getHashFiles()
	 * @generated
	 */
	EReference getHashFiles_Path();

	/**
	 * Returns the meta object for class '{@link GHA.StatusCheck <em>Status Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Check</em>'.
	 * @see GHA.StatusCheck
	 * @generated
	 */
	EClass getStatusCheck();

	/**
	 * Returns the meta object for class '{@link GHA.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always</em>'.
	 * @see GHA.Always
	 * @generated
	 */
	EClass getAlways();

	/**
	 * Returns the meta object for class '{@link GHA.Success <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success</em>'.
	 * @see GHA.Success
	 * @generated
	 */
	EClass getSuccess();

	/**
	 * Returns the meta object for class '{@link GHA.Cancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancelled</em>'.
	 * @see GHA.Cancelled
	 * @generated
	 */
	EClass getCancelled();

	/**
	 * Returns the meta object for class '{@link GHA.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see GHA.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the meta object for class '{@link GHA.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see GHA.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link GHA.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see GHA.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link GHA.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see GHA.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link GHA.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GHA.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link GHA.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see GHA.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link GHA.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GHA.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link GHA.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see GHA.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link GHA.DoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GHA.DoubleLiteral#getValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link GHA.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see GHA.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link GHA.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GHA.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link GHA.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see GHA.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GHA.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link GHA.GitHubContext <em>Git Hub Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub Context</em>'.
	 * @see GHA.GitHubContext
	 * @generated
	 */
	EClass getGitHubContext();

	/**
	 * Returns the meta object for the attribute '{@link GHA.GitHubContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see GHA.GitHubContext#getContext()
	 * @see #getGitHubContext()
	 * @generated
	 */
	EAttribute getGitHubContext_Context();

	/**
	 * Returns the meta object for class '{@link GHA.VariableDereference <em>Variable Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Dereference</em>'.
	 * @see GHA.VariableDereference
	 * @generated
	 */
	EClass getVariableDereference();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.VariableDereference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see GHA.VariableDereference#getVariable()
	 * @see #getVariableDereference()
	 * @generated
	 */
	EReference getVariableDereference_Variable();

	/**
	 * Returns the meta object for the attribute '{@link GHA.VariableDereference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see GHA.VariableDereference#getProperty()
	 * @see #getVariableDereference()
	 * @generated
	 */
	EAttribute getVariableDereference_Property();

	/**
	 * Returns the meta object for class '{@link GHA.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see GHA.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Matrix#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axes</em>'.
	 * @see GHA.Matrix#getAxes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Axes();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Matrix#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see GHA.Matrix#getIncludes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Matrix#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excludes</em>'.
	 * @see GHA.Matrix#getExcludes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Excludes();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Matrix#getFailFast <em>Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fail Fast</em>'.
	 * @see GHA.Matrix#getFailFast()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_FailFast();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Matrix#getMaxParallel <em>Max Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Parallel</em>'.
	 * @see GHA.Matrix#getMaxParallel()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_MaxParallel();

	/**
	 * Returns the meta object for class '{@link GHA.MatrixAxis <em>Matrix Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Axis</em>'.
	 * @see GHA.MatrixAxis
	 * @generated
	 */
	EClass getMatrixAxis();

	/**
	 * Returns the meta object for the attribute '{@link GHA.MatrixAxis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GHA.MatrixAxis#getName()
	 * @see #getMatrixAxis()
	 * @generated
	 */
	EAttribute getMatrixAxis_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.MatrixAxis#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see GHA.MatrixAxis#getCells()
	 * @see #getMatrixAxis()
	 * @generated
	 */
	EReference getMatrixAxis_Cells();

	/**
	 * Returns the meta object for class '{@link GHA.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Combination</em>'.
	 * @see GHA.MatrixCombination
	 * @generated
	 */
	EClass getMatrixCombination();

	/**
	 * Returns the meta object for the map '{@link GHA.MatrixCombination#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see GHA.MatrixCombination#getEntries()
	 * @see #getMatrixCombination()
	 * @generated
	 */
	EReference getMatrixCombination_Entries();

	/**
	 * Returns the meta object for class '{@link GHA.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see GHA.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GHA.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Step#getIfCondition <em>If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Condition</em>'.
	 * @see GHA.Step#getIfCondition()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_IfCondition();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see GHA.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Step#getTimeoutMinutes <em>Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timeout Minutes</em>'.
	 * @see GHA.Step#getTimeoutMinutes()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_TimeoutMinutes();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Step#getContinueOnError <em>Continue On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Continue On Error</em>'.
	 * @see GHA.Step#getContinueOnError()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ContinueOnError();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Step#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shell</em>'.
	 * @see GHA.Step#getShell()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Shell();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Step#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory</em>'.
	 * @see GHA.Step#getWorkingDirectory()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_WorkingDirectory();

	/**
	 * Returns the meta object for the map '{@link GHA.Step#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see GHA.Step#getEnvironmentVariables()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_EnvironmentVariables();

	/**
	 * Returns the meta object for class '{@link GHA.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see GHA.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Command#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see GHA.Command#getCommand()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Command();

	/**
	 * Returns the meta object for class '{@link GHA.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see GHA.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Package#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uses</em>'.
	 * @see GHA.Package#getUses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Uses();

	/**
	 * Returns the meta object for the map '{@link GHA.Package#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Args</em>'.
	 * @see GHA.Package#getArgs()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Args();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Package#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entrypoint</em>'.
	 * @see GHA.Package#getEntrypoint()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Entrypoint();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Package#getContainerArgs <em>Container Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container Args</em>'.
	 * @see GHA.Package#getContainerArgs()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ContainerArgs();

	/**
	 * Returns the meta object for class '{@link GHA.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see GHA.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Parameter#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see GHA.Parameter#getId()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Id();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see GHA.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Description();

	/**
	 * Returns the meta object for class '{@link GHA.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see GHA.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see GHA.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Input#getIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Required</em>'.
	 * @see GHA.Input#getIsRequired()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_IsRequired();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Input#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see GHA.Input#getDefault()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Default();

	/**
	 * Returns the meta object for the attribute list '{@link GHA.Input#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see GHA.Input#getOptions()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Options();

	/**
	 * Returns the meta object for class '{@link GHA.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see GHA.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Secret#getIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Required</em>'.
	 * @see GHA.Secret#getIsRequired()
	 * @see #getSecret()
	 * @generated
	 */
	EReference getSecret_IsRequired();

	/**
	 * Returns the meta object for class '{@link GHA.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see GHA.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see GHA.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Value();

	/**
	 * Returns the meta object for enum '{@link GHA.EVENTS <em>EVENTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVENTS</em>'.
	 * @see GHA.EVENTS
	 * @generated
	 */
	EEnum getEVENTS();

	/**
	 * Returns the meta object for enum '{@link GHA.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WEBHOOK ACTIVITY TYPES</em>'.
	 * @see GHA.WEBHOOK_ACTIVITY_TYPES
	 * @generated
	 */
	EEnum getWEBHOOK_ACTIVITY_TYPES();

	/**
	 * Returns the meta object for enum '{@link GHA.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERMISSION SCOPES</em>'.
	 * @see GHA.PERMISSION_SCOPES
	 * @generated
	 */
	EEnum getPERMISSION_SCOPES();

	/**
	 * Returns the meta object for enum '{@link GHA.PERMISSIONS <em>PERMISSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERMISSIONS</em>'.
	 * @see GHA.PERMISSIONS
	 * @generated
	 */
	EEnum getPERMISSIONS();

	/**
	 * Returns the meta object for enum '{@link GHA.EQUALITY_OPS <em>EQUALITY OPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EQUALITY OPS</em>'.
	 * @see GHA.EQUALITY_OPS
	 * @generated
	 */
	EEnum getEQUALITY_OPS();

	/**
	 * Returns the meta object for enum '{@link GHA.COMPARISON_OPS <em>COMPARISON OPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COMPARISON OPS</em>'.
	 * @see GHA.COMPARISON_OPS
	 * @generated
	 */
	EEnum getCOMPARISON_OPS();

	/**
	 * Returns the meta object for enum '{@link GHA.CONTEXTS <em>CONTEXTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CONTEXTS</em>'.
	 * @see GHA.CONTEXTS
	 * @generated
	 */
	EEnum getCONTEXTS();

	/**
	 * Returns the meta object for enum '{@link GHA.INPUT_TYPES <em>INPUT TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>INPUT TYPES</em>'.
	 * @see GHA.INPUT_TYPES
	 * @generated
	 */
	EEnum getINPUT_TYPES();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GHAFactory getGHAFactory();

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
		 * The meta object literal for the '{@link GHA.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.WorkflowImpl
		 * @see GHA.impl.GHAPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Run Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__RUN_NAME = eINSTANCE.getWorkflow_RunName();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TRIGGERS = eINSTANCE.getWorkflow_Triggers();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PERMISSIONS = eINSTANCE.getWorkflow_Permissions();

		/**
		 * The meta object literal for the '<em><b>Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__DEFAULTS = eINSTANCE.getWorkflow_Defaults();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ENVIRONMENT_VARIABLES = eINSTANCE.getWorkflow_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Concurrency Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONCURRENCY_GROUP = eINSTANCE.getWorkflow_ConcurrencyGroup();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__JOBS = eINSTANCE.getWorkflow_Jobs();

		/**
		 * The meta object literal for the '{@link GHA.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.JobImpl
		 * @see GHA.impl.GHAPackageImpl#getJob()
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
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IF_CONDITION = eINSTANCE.getJob_IfCondition();

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
		 * The meta object literal for the '{@link GHA.impl.ReuseWorkflowJobImpl <em>Reuse Workflow Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ReuseWorkflowJobImpl
		 * @see GHA.impl.GHAPackageImpl#getReuseWorkflowJob()
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
		 * The meta object literal for the '{@link GHA.impl.ScriptJobImpl <em>Script Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ScriptJobImpl
		 * @see GHA.impl.GHAPackageImpl#getScriptJob()
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
		 * The meta object literal for the '{@link GHA.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.AgentImpl
		 * @see GHA.impl.GHAPackageImpl#getAgent()
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
		 * The meta object literal for the '{@link GHA.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ContainerImpl
		 * @see GHA.impl.GHAPackageImpl#getContainer()
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
		 * The meta object literal for the '{@link GHA.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ServiceImpl
		 * @see GHA.impl.GHAPackageImpl#getService()
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
		 * The meta object literal for the '{@link GHA.impl.StagingEnvironmentImpl <em>Staging Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.StagingEnvironmentImpl
		 * @see GHA.impl.GHAPackageImpl#getStagingEnvironment()
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

		/**
		 * The meta object literal for the '{@link GHA.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.TriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link GHA.impl.StandardEventTriggerImpl <em>Standard Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.StandardEventTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getStandardEventTrigger()
		 * @generated
		 */
		EClass STANDARD_EVENT_TRIGGER = eINSTANCE.getStandardEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_EVENT_TRIGGER__EVENT = eINSTANCE.getStandardEventTrigger_Event();

		/**
		 * The meta object literal for the '<em><b>Event Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STANDARD_EVENT_TRIGGER__EVENT_TYPES = eINSTANCE.getStandardEventTrigger_EventTypes();

		/**
		 * The meta object literal for the '{@link GHA.impl.WorkflowRunTriggerImpl <em>Workflow Run Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.WorkflowRunTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getWorkflowRunTrigger()
		 * @generated
		 */
		EClass WORKFLOW_RUN_TRIGGER = eINSTANCE.getWorkflowRunTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_RUN_TRIGGER__BRANCHES = eINSTANCE.getWorkflowRunTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_RUN_TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE
				.getWorkflowRunTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '{@link GHA.impl.PullRequestTriggerImpl <em>Pull Request Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.PullRequestTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getPullRequestTrigger()
		 * @generated
		 */
		EClass PULL_REQUEST_TRIGGER = eINSTANCE.getPullRequestTrigger();

		/**
		 * The meta object literal for the '<em><b>Event Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST_TRIGGER__EVENT_TYPES = eINSTANCE.getPullRequestTrigger_EventTypes();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_REQUEST_TRIGGER__BRANCHES = eINSTANCE.getPullRequestTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE
				.getPullRequestTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PULL_REQUEST_TRIGGER__PATHS = eINSTANCE.getPullRequestTrigger_Paths();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST_TRIGGER__IGNORE_SPECIFIED_PATHS = eINSTANCE
				.getPullRequestTrigger_IgnoreSpecifiedPaths();

		/**
		 * The meta object literal for the '{@link GHA.impl.PushTriggerImpl <em>Push Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.PushTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getPushTrigger()
		 * @generated
		 */
		EClass PUSH_TRIGGER = eINSTANCE.getPushTrigger();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__BRANCHES = eINSTANCE.getPushTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE.getPushTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__PATHS = eINSTANCE.getPushTrigger_Paths();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Paths</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS = eINSTANCE.getPushTrigger_IgnoreSpecifiedPaths();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUSH_TRIGGER__TAGS = eINSTANCE.getPushTrigger_Tags();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS = eINSTANCE.getPushTrigger_IgnoreSpecifiedTags();

		/**
		 * The meta object literal for the '{@link GHA.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ScheduleTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getScheduleTrigger()
		 * @generated
		 */
		EClass SCHEDULE_TRIGGER = eINSTANCE.getScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Crons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE_TRIGGER__CRONS = eINSTANCE.getScheduleTrigger_Crons();

		/**
		 * The meta object literal for the '{@link GHA.impl.WorkflowCallTriggerImpl <em>Workflow Call Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.WorkflowCallTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getWorkflowCallTrigger()
		 * @generated
		 */
		EClass WORKFLOW_CALL_TRIGGER = eINSTANCE.getWorkflowCallTrigger();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__INPUTS = eINSTANCE.getWorkflowCallTrigger_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__OUTPUTS = eINSTANCE.getWorkflowCallTrigger_Outputs();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL_TRIGGER__SECRETS = eINSTANCE.getWorkflowCallTrigger_Secrets();

		/**
		 * The meta object literal for the '{@link GHA.impl.WorkflowDispatchTriggerImpl <em>Workflow Dispatch Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.WorkflowDispatchTriggerImpl
		 * @see GHA.impl.GHAPackageImpl#getWorkflowDispatchTrigger()
		 * @generated
		 */
		EClass WORKFLOW_DISPATCH_TRIGGER = eINSTANCE.getWorkflowDispatchTrigger();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_DISPATCH_TRIGGER__INPUTS = eINSTANCE.getWorkflowDispatchTrigger_Inputs();

		/**
		 * The meta object literal for the '{@link GHA.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.PermissionImpl
		 * @see GHA.impl.GHAPackageImpl#getPermission()
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
		 * The meta object literal for the '{@link GHA.impl.ConcurrencyGroupImpl <em>Concurrency Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ConcurrencyGroupImpl
		 * @see GHA.impl.GHAPackageImpl#getConcurrencyGroup()
		 * @generated
		 */
		EClass CONCURRENCY_GROUP = eINSTANCE.getConcurrencyGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENCY_GROUP__NAME = eINSTANCE.getConcurrencyGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Cancel In Progress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCURRENCY_GROUP__CANCEL_IN_PROGRESS = eINSTANCE.getConcurrencyGroup_CancelInProgress();

		/**
		 * The meta object literal for the '{@link GHA.impl.DefaultsImpl <em>Defaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.DefaultsImpl
		 * @see GHA.impl.GHAPackageImpl#getDefaults()
		 * @generated
		 */
		EClass DEFAULTS = eINSTANCE.getDefaults();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTS__SHELL = eINSTANCE.getDefaults_Shell();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTS__WORKING_DIRECTORY = eINSTANCE.getDefaults_WorkingDirectory();

		/**
		 * The meta object literal for the '{@link GHA.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.VariableAssignmentImpl
		 * @see GHA.impl.GHAPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_ASSIGNMENT__KEY = eINSTANCE.getVariableAssignment_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__VALUE = eINSTANCE.getVariableAssignment_Value();

		/**
		 * The meta object literal for the '{@link GHA.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ExpressionImpl
		 * @see GHA.impl.GHAPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link GHA.impl.BinaryOpImpl <em>Binary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.BinaryOpImpl
		 * @see GHA.impl.GHAPackageImpl#getBinaryOp()
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
		 * The meta object literal for the '{@link GHA.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ConcatImpl
		 * @see GHA.impl.GHAPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '{@link GHA.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.EqualityImpl
		 * @see GHA.impl.GHAPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

		/**
		 * The meta object literal for the '{@link GHA.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ComparisonImpl
		 * @see GHA.impl.GHAPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

		/**
		 * The meta object literal for the '{@link GHA.impl.LogicalOpImpl <em>Logical Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.LogicalOpImpl
		 * @see GHA.impl.GHAPackageImpl#getLogicalOp()
		 * @generated
		 */
		EClass LOGICAL_OP = eINSTANCE.getLogicalOp();

		/**
		 * The meta object literal for the '{@link GHA.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.OrImpl
		 * @see GHA.impl.GHAPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link GHA.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.AndImpl
		 * @see GHA.impl.GHAPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link GHA.impl.UnaryOpImpl <em>Unary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.UnaryOpImpl
		 * @see GHA.impl.GHAPackageImpl#getUnaryOp()
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
		 * The meta object literal for the '{@link GHA.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.NotImpl
		 * @see GHA.impl.GHAPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link GHA.impl.BuiltInFunctionCallImpl <em>Built In Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.BuiltInFunctionCallImpl
		 * @see GHA.impl.GHAPackageImpl#getBuiltInFunctionCall()
		 * @generated
		 */
		EClass BUILT_IN_FUNCTION_CALL = eINSTANCE.getBuiltInFunctionCall();

		/**
		 * The meta object literal for the '{@link GHA.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ContainsImpl
		 * @see GHA.impl.GHAPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__SEARCH = eINSTANCE.getContains_Search();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__ITEM = eINSTANCE.getContains_Item();

		/**
		 * The meta object literal for the '{@link GHA.impl.StartsWithImpl <em>Starts With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.StartsWithImpl
		 * @see GHA.impl.GHAPackageImpl#getStartsWith()
		 * @generated
		 */
		EClass STARTS_WITH = eINSTANCE.getStartsWith();

		/**
		 * The meta object literal for the '<em><b>Search String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTS_WITH__SEARCH_STRING = eINSTANCE.getStartsWith_SearchString();

		/**
		 * The meta object literal for the '<em><b>Search Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTS_WITH__SEARCH_VALUE = eINSTANCE.getStartsWith_SearchValue();

		/**
		 * The meta object literal for the '{@link GHA.impl.EndsWithImpl <em>Ends With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.EndsWithImpl
		 * @see GHA.impl.GHAPackageImpl#getEndsWith()
		 * @generated
		 */
		EClass ENDS_WITH = eINSTANCE.getEndsWith();

		/**
		 * The meta object literal for the '<em><b>Search String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDS_WITH__SEARCH_STRING = eINSTANCE.getEndsWith_SearchString();

		/**
		 * The meta object literal for the '<em><b>Search Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDS_WITH__SEARCH_VALUE = eINSTANCE.getEndsWith_SearchValue();

		/**
		 * The meta object literal for the '{@link GHA.impl.FormatImpl <em>Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.FormatImpl
		 * @see GHA.impl.GHAPackageImpl#getFormat()
		 * @generated
		 */
		EClass FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAT__STRING = eINSTANCE.getFormat_String();

		/**
		 * The meta object literal for the '<em><b>Replace Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAT__REPLACE_VALUES = eINSTANCE.getFormat_ReplaceValues();

		/**
		 * The meta object literal for the '{@link GHA.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.JoinImpl
		 * @see GHA.impl.GHAPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__ARRAY = eINSTANCE.getJoin_Array();

		/**
		 * The meta object literal for the '<em><b>Sep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__SEP = eINSTANCE.getJoin_Sep();

		/**
		 * The meta object literal for the '{@link GHA.impl.ToJSONImpl <em>To JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ToJSONImpl
		 * @see GHA.impl.GHAPackageImpl#getToJSON()
		 * @generated
		 */
		EClass TO_JSON = eINSTANCE.getToJSON();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_JSON__VALUE = eINSTANCE.getToJSON_Value();

		/**
		 * The meta object literal for the '{@link GHA.impl.FromJSONImpl <em>From JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.FromJSONImpl
		 * @see GHA.impl.GHAPackageImpl#getFromJSON()
		 * @generated
		 */
		EClass FROM_JSON = eINSTANCE.getFromJSON();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_JSON__VALUE = eINSTANCE.getFromJSON_Value();

		/**
		 * The meta object literal for the '{@link GHA.impl.HashFilesImpl <em>Hash Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.HashFilesImpl
		 * @see GHA.impl.GHAPackageImpl#getHashFiles()
		 * @generated
		 */
		EClass HASH_FILES = eINSTANCE.getHashFiles();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_FILES__PATH = eINSTANCE.getHashFiles_Path();

		/**
		 * The meta object literal for the '{@link GHA.impl.StatusCheckImpl <em>Status Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.StatusCheckImpl
		 * @see GHA.impl.GHAPackageImpl#getStatusCheck()
		 * @generated
		 */
		EClass STATUS_CHECK = eINSTANCE.getStatusCheck();

		/**
		 * The meta object literal for the '{@link GHA.impl.AlwaysImpl <em>Always</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.AlwaysImpl
		 * @see GHA.impl.GHAPackageImpl#getAlways()
		 * @generated
		 */
		EClass ALWAYS = eINSTANCE.getAlways();

		/**
		 * The meta object literal for the '{@link GHA.impl.SuccessImpl <em>Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.SuccessImpl
		 * @see GHA.impl.GHAPackageImpl#getSuccess()
		 * @generated
		 */
		EClass SUCCESS = eINSTANCE.getSuccess();

		/**
		 * The meta object literal for the '{@link GHA.impl.CancelledImpl <em>Cancelled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.CancelledImpl
		 * @see GHA.impl.GHAPackageImpl#getCancelled()
		 * @generated
		 */
		EClass CANCELLED = eINSTANCE.getCancelled();

		/**
		 * The meta object literal for the '{@link GHA.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.FailureImpl
		 * @see GHA.impl.GHAPackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

		/**
		 * The meta object literal for the '{@link GHA.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ValueImpl
		 * @see GHA.impl.GHAPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link GHA.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.LiteralImpl
		 * @see GHA.impl.GHAPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link GHA.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.StringLiteralImpl
		 * @see GHA.impl.GHAPackageImpl#getStringLiteral()
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
		 * The meta object literal for the '{@link GHA.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.IntegerLiteralImpl
		 * @see GHA.impl.GHAPackageImpl#getIntegerLiteral()
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
		 * The meta object literal for the '{@link GHA.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.DoubleLiteralImpl
		 * @see GHA.impl.GHAPackageImpl#getDoubleLiteral()
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
		 * The meta object literal for the '{@link GHA.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.BooleanLiteralImpl
		 * @see GHA.impl.GHAPackageImpl#getBooleanLiteral()
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
		 * The meta object literal for the '{@link GHA.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.VariableImpl
		 * @see GHA.impl.GHAPackageImpl#getVariable()
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
		 * The meta object literal for the '{@link GHA.impl.GitHubContextImpl <em>Git Hub Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.GitHubContextImpl
		 * @see GHA.impl.GHAPackageImpl#getGitHubContext()
		 * @generated
		 */
		EClass GIT_HUB_CONTEXT = eINSTANCE.getGitHubContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_CONTEXT__CONTEXT = eINSTANCE.getGitHubContext_Context();

		/**
		 * The meta object literal for the '{@link GHA.impl.VariableDereferenceImpl <em>Variable Dereference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.VariableDereferenceImpl
		 * @see GHA.impl.GHAPackageImpl#getVariableDereference()
		 * @generated
		 */
		EClass VARIABLE_DEREFERENCE = eINSTANCE.getVariableDereference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DEREFERENCE__VARIABLE = eINSTANCE.getVariableDereference_Variable();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEREFERENCE__PROPERTY = eINSTANCE.getVariableDereference_Property();

		/**
		 * The meta object literal for the '{@link GHA.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.MatrixImpl
		 * @see GHA.impl.GHAPackageImpl#getMatrix()
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
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__INCLUDES = eINSTANCE.getMatrix_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__EXCLUDES = eINSTANCE.getMatrix_Excludes();

		/**
		 * The meta object literal for the '<em><b>Fail Fast</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__FAIL_FAST = eINSTANCE.getMatrix_FailFast();

		/**
		 * The meta object literal for the '<em><b>Max Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__MAX_PARALLEL = eINSTANCE.getMatrix_MaxParallel();

		/**
		 * The meta object literal for the '{@link GHA.impl.MatrixAxisImpl <em>Matrix Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.MatrixAxisImpl
		 * @see GHA.impl.GHAPackageImpl#getMatrixAxis()
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
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_AXIS__CELLS = eINSTANCE.getMatrixAxis_Cells();

		/**
		 * The meta object literal for the '{@link GHA.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.MatrixCombinationImpl
		 * @see GHA.impl.GHAPackageImpl#getMatrixCombination()
		 * @generated
		 */
		EClass MATRIX_COMBINATION = eINSTANCE.getMatrixCombination();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_COMBINATION__ENTRIES = eINSTANCE.getMatrixCombination_Entries();

		/**
		 * The meta object literal for the '{@link GHA.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.StepImpl
		 * @see GHA.impl.GHAPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>If Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__IF_CONDITION = eINSTANCE.getStep_IfCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Timeout Minutes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__TIMEOUT_MINUTES = eINSTANCE.getStep_TimeoutMinutes();

		/**
		 * The meta object literal for the '<em><b>Continue On Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CONTINUE_ON_ERROR = eINSTANCE.getStep_ContinueOnError();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SHELL = eINSTANCE.getStep_Shell();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__WORKING_DIRECTORY = eINSTANCE.getStep_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENVIRONMENT_VARIABLES = eINSTANCE.getStep_EnvironmentVariables();

		/**
		 * The meta object literal for the '{@link GHA.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.CommandImpl
		 * @see GHA.impl.GHAPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMMAND = eINSTANCE.getCommand_Command();

		/**
		 * The meta object literal for the '{@link GHA.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.PackageImpl
		 * @see GHA.impl.GHAPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__USES = eINSTANCE.getPackage_Uses();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ARGS = eINSTANCE.getPackage_Args();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ENTRYPOINT = eINSTANCE.getPackage_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Container Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CONTAINER_ARGS = eINSTANCE.getPackage_ContainerArgs();

		/**
		 * The meta object literal for the '{@link GHA.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.ParameterImpl
		 * @see GHA.impl.GHAPackageImpl#getParameter()
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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link GHA.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.InputImpl
		 * @see GHA.impl.GHAPackageImpl#getInput()
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
		 * The meta object literal for the '<em><b>Is Required</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__IS_REQUIRED = eINSTANCE.getInput_IsRequired();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__DEFAULT = eINSTANCE.getInput_Default();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__OPTIONS = eINSTANCE.getInput_Options();

		/**
		 * The meta object literal for the '{@link GHA.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.SecretImpl
		 * @see GHA.impl.GHAPackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRET__IS_REQUIRED = eINSTANCE.getSecret_IsRequired();

		/**
		 * The meta object literal for the '{@link GHA.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.impl.OutputImpl
		 * @see GHA.impl.GHAPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '{@link GHA.EVENTS <em>EVENTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.EVENTS
		 * @see GHA.impl.GHAPackageImpl#getEVENTS()
		 * @generated
		 */
		EEnum EVENTS = eINSTANCE.getEVENTS();

		/**
		 * The meta object literal for the '{@link GHA.WEBHOOK_ACTIVITY_TYPES <em>WEBHOOK ACTIVITY TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.WEBHOOK_ACTIVITY_TYPES
		 * @see GHA.impl.GHAPackageImpl#getWEBHOOK_ACTIVITY_TYPES()
		 * @generated
		 */
		EEnum WEBHOOK_ACTIVITY_TYPES = eINSTANCE.getWEBHOOK_ACTIVITY_TYPES();

		/**
		 * The meta object literal for the '{@link GHA.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.PERMISSION_SCOPES
		 * @see GHA.impl.GHAPackageImpl#getPERMISSION_SCOPES()
		 * @generated
		 */
		EEnum PERMISSION_SCOPES = eINSTANCE.getPERMISSION_SCOPES();

		/**
		 * The meta object literal for the '{@link GHA.PERMISSIONS <em>PERMISSIONS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.PERMISSIONS
		 * @see GHA.impl.GHAPackageImpl#getPERMISSIONS()
		 * @generated
		 */
		EEnum PERMISSIONS = eINSTANCE.getPERMISSIONS();

		/**
		 * The meta object literal for the '{@link GHA.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.EQUALITY_OPS
		 * @see GHA.impl.GHAPackageImpl#getEQUALITY_OPS()
		 * @generated
		 */
		EEnum EQUALITY_OPS = eINSTANCE.getEQUALITY_OPS();

		/**
		 * The meta object literal for the '{@link GHA.COMPARISON_OPS <em>COMPARISON OPS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.COMPARISON_OPS
		 * @see GHA.impl.GHAPackageImpl#getCOMPARISON_OPS()
		 * @generated
		 */
		EEnum COMPARISON_OPS = eINSTANCE.getCOMPARISON_OPS();

		/**
		 * The meta object literal for the '{@link GHA.CONTEXTS <em>CONTEXTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.CONTEXTS
		 * @see GHA.impl.GHAPackageImpl#getCONTEXTS()
		 * @generated
		 */
		EEnum CONTEXTS = eINSTANCE.getCONTEXTS();

		/**
		 * The meta object literal for the '{@link GHA.INPUT_TYPES <em>INPUT TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.INPUT_TYPES
		 * @see GHA.impl.GHAPackageImpl#getINPUT_TYPES()
		 * @generated
		 */
		EEnum INPUT_TYPES = eINSTANCE.getINPUT_TYPES();

	}

} //GHAPackage
