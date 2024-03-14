/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

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
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory
 * @model kind="package"
 * @generated
 */
public interface CircleCIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CircleCI";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/CircleCI";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CircleCI";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircleCIPackage eINSTANCE = d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl.init();

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PipelineImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Orb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ORB = 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WORKFLOW = 3;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOB = 4;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 1;

	/**
	 * The feature id for the '<em><b>When attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WHEN_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Tool framework</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TOOL_FRAMEWORK = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Execution_EnvImpl <em>Execution Env</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Execution_EnvImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExecution_Env()
	 * @generated
	 */
	int EXECUTION_ENV = 2;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV__STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV__NAME = 2;

	/**
	 * The number of structural features of the '<em>Execution Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Execution Env</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_ENV_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerImpl <em>Docker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDocker()
	 * @generated
	 */
	int DOCKER = 3;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER__IMAGE = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Docker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LinuxImpl <em>Linux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LinuxImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLinux()
	 * @generated
	 */
	int LINUX = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__IMAGE = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOsImpl <em>Mac Os</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOsImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMacOs()
	 * @generated
	 */
	int MAC_OS = 5;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Xcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__XCODE = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mac Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mac Os</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbImpl <em>Windows Orb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWindowsOrb()
	 * @generated
	 */
	int WINDOWS_ORB = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__ENVIRONMENT = EXECUTION_ENV__ENVIRONMENT;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__STEP = EXECUTION_ENV__STEP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__NAME = EXECUTION_ENV__NAME;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB__EXECUTOR = EXECUTION_ENV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Windows Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_FEATURE_COUNT = EXECUTION_ENV_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Windows Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_OPERATION_COUNT = EXECUTION_ENV_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbImpl <em>Orb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrb()
	 * @generated
	 */
	int ORB = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STEP = 1;

	/**
	 * The feature id for the '<em><b>Command params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__COMMAND_PARAMS = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__WHEN_UNLESS = 3;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__BRANCH = 4;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EnvironmentImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParametersImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Tool_FrameworkImpl <em>Tool Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Tool_FrameworkImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getTool_Framework()
	 * @generated
	 */
	int TOOL_FRAMEWORK = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tool Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tool Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl <em>When Unless</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWhen_Unless()
	 * @generated
	 */
	int WHEN_UNLESS = 13;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>When step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__WHEN_STEP = 1;

	/**
	 * The feature id for the '<em><b>Unless step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS__UNLESS_STEP = 2;

	/**
	 * The number of structural features of the '<em>When Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>When Unless</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_UNLESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_AttributeImpl <em>When Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_AttributeImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWhen_Attribute()
	 * @generated
	 */
	int WHEN_ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>When type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ATTRIBUTE__WHEN_TYPE = 0;

	/**
	 * The number of structural features of the '<em>When Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>When Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.TriggerImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 15;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CRON = 0;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BranchImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Branch type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__BRANCH_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARALLELISM = 1;

	/**
	 * The feature id for the '<em><b>Store artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STORE_ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>When unless</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__WHEN_UNLESS = 3;

	/**
	 * The feature id for the '<em><b>Execution env</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EXECUTION_ENV = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEP = 6;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Store_ArtifactImpl <em>Store Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Store_ArtifactImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStore_Artifact()
	 * @generated
	 */
	int STORE_ARTIFACT = 18;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Store Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Store Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Command_ParamsImpl <em>Command Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Command_ParamsImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCommand_Params()
	 * @generated
	 */
	int COMMAND_PARAMS = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS__DEFAULT = 1;

	/**
	 * The number of structural features of the '<em>Command Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Command Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWHEN_TYPE()
	 * @generated
	 */
	int WHEN_TYPE = 20;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getBRANCH_TYPE()
	 * @generated
	 */
	int BRANCH_TYPE = 21;

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getVersion()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getOrb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orb</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getOrb()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Orb();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getCommand()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Command();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getWorkflow()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Workflow();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getJob()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Job();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getParameters()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getWhen_attribute <em>When attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When attribute</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getWhen_attribute()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_When_attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getTool_framework <em>Tool framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool framework</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step#getTool_framework()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Tool_framework();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env <em>Execution Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Env</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env
	 * @generated
	 */
	EClass getExecution_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env#getEnvironment()
	 * @see #getExecution_Env()
	 * @generated
	 */
	EReference getExecution_Env_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env#getStep()
	 * @see #getExecution_Env()
	 * @generated
	 */
	EReference getExecution_Env_Step();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Execution_Env#getName()
	 * @see #getExecution_Env()
	 * @generated
	 */
	EAttribute getExecution_Env_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker
	 * @generated
	 */
	EClass getDocker();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Docker#getImage()
	 * @see #getDocker()
	 * @generated
	 */
	EAttribute getDocker_Image();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux
	 * @generated
	 */
	EClass getLinux();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Linux#getImage()
	 * @see #getLinux()
	 * @generated
	 */
	EAttribute getLinux_Image();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs <em>Mac Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac Os</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs
	 * @generated
	 */
	EClass getMacOs();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs#getXcode <em>Xcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xcode</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs#getXcode()
	 * @see #getMacOs()
	 * @generated
	 */
	EAttribute getMacOs_Xcode();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb <em>Windows Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows Orb</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb
	 * @generated
	 */
	EClass getWindowsOrb();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrb#getExecutor()
	 * @see #getWindowsOrb()
	 * @generated
	 */
	EAttribute getWindowsOrb_Executor();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orb</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb
	 * @generated
	 */
	EClass getOrb();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb#getKey()
	 * @see #getOrb()
	 * @generated
	 */
	EAttribute getOrb_Key();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb#getValue()
	 * @see #getOrb()
	 * @generated
	 */
	EAttribute getOrb_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getStep()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Step();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getCommand_params <em>Command params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command params</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getCommand_params()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Command_params();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command#getDescription()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Description();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getName()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getVersion()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getTrigger()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getWhen_unless <em>When unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When unless</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getWhen_unless()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_When_unless();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getBranch()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Branch();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getKey()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Key();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters#getParameter()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Parameter();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework <em>Tool Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Framework</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework
	 * @generated
	 */
	EClass getTool_Framework();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework#getName()
	 * @see #getTool_Framework()
	 * @generated
	 */
	EAttribute getTool_Framework_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless <em>When Unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Unless</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless
	 * @generated
	 */
	EClass getWhen_Unless();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless#getCondition()
	 * @see #getWhen_Unless()
	 * @generated
	 */
	EAttribute getWhen_Unless_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless#getWhen_step <em>When step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless#getWhen_step()
	 * @see #getWhen_Unless()
	 * @generated
	 */
	EReference getWhen_Unless_When_step();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless#getUnless_step <em>Unless step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unless step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless#getUnless_step()
	 * @see #getWhen_Unless()
	 * @generated
	 */
	EReference getWhen_Unless_Unless_step();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute <em>When Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Attribute</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute
	 * @generated
	 */
	EClass getWhen_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute#getWhen_type <em>When type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When type</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute#getWhen_type()
	 * @see #getWhen_Attribute()
	 * @generated
	 */
	EAttribute getWhen_Attribute_When_type();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger#getCron()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getBranch_type <em>Branch type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branch type</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch#getBranch_type()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Branch_type();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallelism</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getParallelism()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Parallelism();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getStore_artifact <em>Store artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Store artifact</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getStore_artifact()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Store_artifact();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getWhen_unless <em>When unless</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When unless</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getWhen_unless()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_When_unless();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getExecution_env <em>Execution env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution env</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getExecution_env()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Execution_env();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getStep()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Step();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact <em>Store Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Artifact</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact
	 * @generated
	 */
	EClass getStore_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact#getPath()
	 * @see #getStore_Artifact()
	 * @generated
	 */
	EAttribute getStore_Artifact_Path();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Store_Artifact#getDestination()
	 * @see #getStore_Artifact()
	 * @generated
	 */
	EAttribute getStore_Artifact_Destination();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params <em>Command Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Params</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params
	 * @generated
	 */
	EClass getCommand_Params();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params#getType()
	 * @see #getCommand_Params()
	 * @generated
	 */
	EAttribute getCommand_Params_Type();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Command_Params#getDefault()
	 * @see #getCommand_Params()
	 * @generated
	 */
	EAttribute getCommand_Params_Default();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE <em>WHEN TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WHEN TYPE</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
	 * @generated
	 */
	EEnum getWHEN_TYPE();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE <em>BRANCH TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BRANCH TYPE</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE
	 * @generated
	 */
	EEnum getBRANCH_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircleCIFactory getCircleCIFactory();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PipelineImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__VERSION = eINSTANCE.getPipeline_Version();

		/**
		 * The meta object literal for the '<em><b>Orb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ORB = eINSTANCE.getPipeline_Orb();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__COMMAND = eINSTANCE.getPipeline_Command();

		/**
		 * The meta object literal for the '<em><b>Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__WORKFLOW = eINSTANCE.getPipeline_Workflow();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOB = eINSTANCE.getPipeline_Job();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARAMETERS = eINSTANCE.getStep_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>When attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__WHEN_ATTRIBUTE = eINSTANCE.getStep_When_attribute();

		/**
		 * The meta object literal for the '<em><b>Tool framework</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__TOOL_FRAMEWORK = eINSTANCE.getStep_Tool_framework();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Execution_EnvImpl <em>Execution Env</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Execution_EnvImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExecution_Env()
		 * @generated
		 */
		EClass EXECUTION_ENV = eINSTANCE.getExecution_Env();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENV__ENVIRONMENT = eINSTANCE.getExecution_Env_Environment();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_ENV__STEP = eINSTANCE.getExecution_Env_Step();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_ENV__NAME = eINSTANCE.getExecution_Env_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerImpl <em>Docker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDocker()
		 * @generated
		 */
		EClass DOCKER = eINSTANCE.getDocker();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER__IMAGE = eINSTANCE.getDocker_Image();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LinuxImpl <em>Linux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LinuxImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLinux()
		 * @generated
		 */
		EClass LINUX = eINSTANCE.getLinux();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX__IMAGE = eINSTANCE.getLinux_Image();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOsImpl <em>Mac Os</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOsImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMacOs()
		 * @generated
		 */
		EClass MAC_OS = eINSTANCE.getMacOs();

		/**
		 * The meta object literal for the '<em><b>Xcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_OS__XCODE = eINSTANCE.getMacOs_Xcode();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbImpl <em>Windows Orb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWindowsOrb()
		 * @generated
		 */
		EClass WINDOWS_ORB = eINSTANCE.getWindowsOrb();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_ORB__EXECUTOR = eINSTANCE.getWindowsOrb_Executor();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbImpl <em>Orb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrb()
		 * @generated
		 */
		EClass ORB = eINSTANCE.getOrb();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB__KEY = eINSTANCE.getOrb_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB__VALUE = eINSTANCE.getOrb_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__STEP = eINSTANCE.getCommand_Step();

		/**
		 * The meta object literal for the '<em><b>Command params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__COMMAND_PARAMS = eINSTANCE.getCommand_Command_params();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__NAME = eINSTANCE.getWorkflow_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__VERSION = eINSTANCE.getWorkflow_Version();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TRIGGER = eINSTANCE.getWorkflow_Trigger();

		/**
		 * The meta object literal for the '<em><b>When unless</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__WHEN_UNLESS = eINSTANCE.getWorkflow_When_unless();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__BRANCH = eINSTANCE.getWorkflow_Branch();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EnvironmentImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__KEY = eINSTANCE.getEnvironment_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__VALUE = eINSTANCE.getEnvironment_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParametersImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getParameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getParameters();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETERS__PARAMETER = eINSTANCE.getParameters_Parameter();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Tool_FrameworkImpl <em>Tool Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Tool_FrameworkImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getTool_Framework()
		 * @generated
		 */
		EClass TOOL_FRAMEWORK = eINSTANCE.getTool_Framework();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_FRAMEWORK__NAME = eINSTANCE.getTool_Framework_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl <em>When Unless</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWhen_Unless()
		 * @generated
		 */
		EClass WHEN_UNLESS = eINSTANCE.getWhen_Unless();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_UNLESS__CONDITION = eINSTANCE.getWhen_Unless_Condition();

		/**
		 * The meta object literal for the '<em><b>When step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_UNLESS__WHEN_STEP = eINSTANCE.getWhen_Unless_When_step();

		/**
		 * The meta object literal for the '<em><b>Unless step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_UNLESS__UNLESS_STEP = eINSTANCE.getWhen_Unless_Unless_step();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_AttributeImpl <em>When Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_AttributeImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWhen_Attribute()
		 * @generated
		 */
		EClass WHEN_ATTRIBUTE = eINSTANCE.getWhen_Attribute();

		/**
		 * The meta object literal for the '<em><b>When type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_ATTRIBUTE__WHEN_TYPE = eINSTANCE.getWhen_Attribute_When_type();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.TriggerImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CRON = eINSTANCE.getTrigger_Cron();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BranchImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '<em><b>Branch type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__BRANCH_TYPE = eINSTANCE.getBranch_Branch_type();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getJob()
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
		 * The meta object literal for the '<em><b>Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__PARALLELISM = eINSTANCE.getJob_Parallelism();

		/**
		 * The meta object literal for the '<em><b>Store artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STORE_ARTIFACT = eINSTANCE.getJob_Store_artifact();

		/**
		 * The meta object literal for the '<em><b>When unless</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__WHEN_UNLESS = eINSTANCE.getJob_When_unless();

		/**
		 * The meta object literal for the '<em><b>Execution env</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__EXECUTION_ENV = eINSTANCE.getJob_Execution_env();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEP = eINSTANCE.getJob_Step();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Store_ArtifactImpl <em>Store Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Store_ArtifactImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStore_Artifact()
		 * @generated
		 */
		EClass STORE_ARTIFACT = eINSTANCE.getStore_Artifact();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_ARTIFACT__PATH = eINSTANCE.getStore_Artifact_Path();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE_ARTIFACT__DESTINATION = eINSTANCE.getStore_Artifact_Destination();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Command_ParamsImpl <em>Command Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.Command_ParamsImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCommand_Params()
		 * @generated
		 */
		EClass COMMAND_PARAMS = eINSTANCE.getCommand_Params();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMS__TYPE = eINSTANCE.getCommand_Params_Type();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PARAMS__DEFAULT = eINSTANCE.getCommand_Params_Default();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWHEN_TYPE()
		 * @generated
		 */
		EEnum WHEN_TYPE = eINSTANCE.getWHEN_TYPE();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE <em>BRANCH TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BRANCH_TYPE
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getBRANCH_TYPE()
		 * @generated
		 */
		EEnum BRANCH_TYPE = eINSTANCE.getBRANCH_TYPE();

	}

} //CircleCIPackage
