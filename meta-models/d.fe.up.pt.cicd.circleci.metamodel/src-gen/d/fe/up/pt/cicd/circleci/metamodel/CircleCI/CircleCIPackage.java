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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl <em>Definition Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDefinitionGroup()
	 * @generated
	 */
	int DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Orbs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP__ORBS = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP__COMMANDS = 1;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP__EXECUTORS = 2;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP__JOBS = 3;

	/**
	 * The number of structural features of the '<em>Definition Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Definition Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScriptImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 1;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__STEPS = 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CallableImpl <em>Callable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CallableImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCallable()
	 * @generated
	 */
	int CALLABLE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Callable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EnvironmentImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 3;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__ENVIRONMENT_VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PipelineImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 4;

	/**
	 * The feature id for the '<em><b>Orbs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ORBS = DEFINITION_GROUP__ORBS;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMANDS = DEFINITION_GROUP__COMMANDS;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__EXECUTORS = DEFINITION_GROUP__EXECUTORS;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOBS = DEFINITION_GROUP__JOBS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PARAMETERS = DEFINITION_GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__VERSION = DEFINITION_GROUP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Setup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SETUP = DEFINITION_GROUP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Workflows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WORKFLOWS = DEFINITION_GROUP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = DEFINITION_GROUP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = DEFINITION_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbImpl <em>Orb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrb()
	 * @generated
	 */
	int ORB = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB__NAME = 0;

	/**
	 * The number of structural features of the '<em>Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Orb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceImpl <em>Orb Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbReference()
	 * @generated
	 */
	int ORB_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE__NAME = ORB__NAME;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE__REFERENCE = ORB_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orb Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_FEATURE_COUNT = ORB_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Orb Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_OPERATION_COUNT = ORB_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbDefinitionImpl <em>Orb Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbDefinitionImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbDefinition()
	 * @generated
	 */
	int ORB_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION__NAME = ORB__NAME;

	/**
	 * The feature id for the '<em><b>Orbs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION__ORBS = ORB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION__COMMANDS = ORB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Executors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION__EXECUTORS = ORB_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION__JOBS = ORB_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Orb Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION_FEATURE_COUNT = ORB_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Orb Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_DEFINITION_OPERATION_COUNT = ORB_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__STEPS = SCRIPT__STEPS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParameterImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ENUM_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl <em>Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExecutor()
	 * @generated
	 */
	int EXECUTOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__RESOURCE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__SHELL = 2;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__WORKING_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR__ENVIRONMENT_VARIABLES = 4;

	/**
	 * The number of structural features of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerExecutorImpl <em>Docker Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDockerExecutor()
	 * @generated
	 */
	int DOCKER_EXECUTOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR__ENVIRONMENT_VARIABLES = EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR__CONTAINERS = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Docker Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EXECUTOR_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl <em>Docker Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__IMAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Entrypoint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ENTRYPOINT = 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__COMMAND = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__USER = 4;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ENVIRONMENT_VARIABLES = 5;

	/**
	 * The feature id for the '<em><b>Username</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__USERNAME = 6;

	/**
	 * The feature id for the '<em><b>Password</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__PASSWORD = 7;

	/**
	 * The feature id for the '<em><b>Oidc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__OIDC = 8;

	/**
	 * The feature id for the '<em><b>Aws Access Key ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__AWS_ACCESS_KEY_ID = 9;

	/**
	 * The feature id for the '<em><b>Aws Secret Access Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY = 10;

	/**
	 * The number of structural features of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Docker Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MachineExecutorImpl <em>Machine Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MachineExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMachineExecutor()
	 * @generated
	 */
	int MACHINE_EXECUTOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__ENVIRONMENT_VARIABLES = EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__IMAGE = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docker Layer Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR__DOCKER_LAYER_CACHING = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Machine Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_EXECUTOR_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOSExecutorImpl <em>Mac OS Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOSExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMacOSExecutor()
	 * @generated
	 */
	int MAC_OS_EXECUTOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR__ENVIRONMENT_VARIABLES = EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Xcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR__XCODE = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mac OS Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mac OS Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_EXECUTOR_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbExecutorImpl <em>Windows Orb Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWindowsOrbExecutor()
	 * @generated
	 */
	int WINDOWS_ORB_EXECUTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR__ENVIRONMENT_VARIABLES = EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR__EXECUTOR = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Windows Orb Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Windows Orb Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_ORB_EXECUTOR_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ReferenceExecutorImpl <em>Reference Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ReferenceExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getReferenceExecutor()
	 * @generated
	 */
	int REFERENCE_EXECUTOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR__NAME = EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR__RESOURCE_CLASS = EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR__SHELL = EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR__WORKING_DIRECTORY = EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR__ENVIRONMENT_VARIABLES = EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The number of structural features of the '<em>Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR_FEATURE_COUNT = EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXECUTOR_OPERATION_COUNT = EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorReferenceExecutorImpl <em>Executor Reference Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorReferenceExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExecutorReferenceExecutor()
	 * @generated
	 */
	int EXECUTOR_REFERENCE_EXECUTOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR__NAME = REFERENCE_EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR__RESOURCE_CLASS = REFERENCE_EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR__SHELL = REFERENCE_EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR__WORKING_DIRECTORY = REFERENCE_EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR__ENVIRONMENT_VARIABLES = REFERENCE_EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR__EXECUTOR = REFERENCE_EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executor Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR_FEATURE_COUNT = REFERENCE_EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executor Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTOR_REFERENCE_EXECUTOR_OPERATION_COUNT = REFERENCE_EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceExecutorImpl <em>Orb Reference Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceExecutorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbReferenceExecutor()
	 * @generated
	 */
	int ORB_REFERENCE_EXECUTOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__NAME = REFERENCE_EXECUTOR__NAME;

	/**
	 * The feature id for the '<em><b>Resource Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__RESOURCE_CLASS = REFERENCE_EXECUTOR__RESOURCE_CLASS;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__SHELL = REFERENCE_EXECUTOR__SHELL;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__WORKING_DIRECTORY = REFERENCE_EXECUTOR__WORKING_DIRECTORY;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__ENVIRONMENT_VARIABLES = REFERENCE_EXECUTOR__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Orb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__ORB = REFERENCE_EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orb Executor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME = REFERENCE_EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orb Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR_FEATURE_COUNT = REFERENCE_EXECUTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Orb Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_EXECUTOR_OPERATION_COUNT = REFERENCE_EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.JobImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 19;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = SCRIPT__STEPS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARAMETERS = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT_VARIABLES = SCRIPT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = SCRIPT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__EXECUTOR = SCRIPT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PARALLELISM = SCRIPT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Circle CIIP Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CIRCLE_CIIP_RANGES = SCRIPT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 20;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl <em>Run Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getRunStep()
	 * @generated
	 */
	int RUN_STEP = 21;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__ENVIRONMENT_VARIABLES = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__COMMAND = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__NAME = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__SHELL = STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Background</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__BACKGROUND = STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__WORKING_DIRECTORY = STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>No Output Timeout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__NO_OUTPUT_TIMEOUT = STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP__WHEN = STEP_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Run Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Run Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConditionalStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getConditionalStep()
	 * @generated
	 */
	int CONDITIONAL_STEP = 22;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__STEPS = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__CONDITION = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WhenStepImpl <em>When Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WhenStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWhenStep()
	 * @generated
	 */
	int WHEN_STEP = 23;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_STEP__STEPS = CONDITIONAL_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_STEP__CONDITION = CONDITIONAL_STEP__CONDITION;

	/**
	 * The number of structural features of the '<em>When Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_STEP_FEATURE_COUNT = CONDITIONAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_STEP_OPERATION_COUNT = CONDITIONAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnlessStepImpl <em>Unless Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnlessStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getUnlessStep()
	 * @generated
	 */
	int UNLESS_STEP = 24;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_STEP__STEPS = CONDITIONAL_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_STEP__CONDITION = CONDITIONAL_STEP__CONDITION;

	/**
	 * The number of structural features of the '<em>Unless Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_STEP_FEATURE_COUNT = CONDITIONAL_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unless Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLESS_STEP_OPERATION_COUNT = CONDITIONAL_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CheckoutStepImpl <em>Checkout Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CheckoutStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCheckoutStep()
	 * @generated
	 */
	int CHECKOUT_STEP = 25;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_STEP__PATH = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Checkout Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Checkout Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKOUT_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SetupRemoteDockerStepImpl <em>Setup Remote Docker Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SetupRemoteDockerStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getSetupRemoteDockerStep()
	 * @generated
	 */
	int SETUP_REMOTE_DOCKER_STEP = 26;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER_STEP__VERSION = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Docker Layer Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Setup Remote Docker Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Setup Remote Docker Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETUP_REMOTE_DOCKER_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SaveCacheStepImpl <em>Save Cache Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SaveCacheStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getSaveCacheStep()
	 * @generated
	 */
	int SAVE_CACHE_STEP = 27;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_STEP__PATHS = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_STEP__KEY = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_STEP__NAME = STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_STEP__WHEN = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Save Cache Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Save Cache Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_CACHE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RestoreCacheStepImpl <em>Restore Cache Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RestoreCacheStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getRestoreCacheStep()
	 * @generated
	 */
	int RESTORE_CACHE_STEP = 28;

	/**
	 * The feature id for the '<em><b>Keys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_STEP__KEYS = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_STEP__NAME = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Restore Cache Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Restore Cache Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTORE_CACHE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreArtifactsStepImpl <em>Store Artifacts Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreArtifactsStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStoreArtifactsStep()
	 * @generated
	 */
	int STORE_ARTIFACTS_STEP = 29;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACTS_STEP__PATH = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACTS_STEP__DESTINATION = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Store Artifacts Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACTS_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Store Artifacts Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_ARTIFACTS_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreTestResultsStepImpl <em>Store Test Results Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreTestResultsStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStoreTestResultsStep()
	 * @generated
	 */
	int STORE_TEST_RESULTS_STEP = 30;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS_STEP__PATH = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Store Test Results Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Store Test Results Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_TEST_RESULTS_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PersistToWorkspaceStepImpl <em>Persist To Workspace Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PersistToWorkspaceStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPersistToWorkspaceStep()
	 * @generated
	 */
	int PERSIST_TO_WORKSPACE_STEP = 31;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE_STEP__ROOT = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE_STEP__PATHS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Persist To Workspace Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Persist To Workspace Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSIST_TO_WORKSPACE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AttachWorkspaceStepImpl <em>Attach Workspace Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AttachWorkspaceStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getAttachWorkspaceStep()
	 * @generated
	 */
	int ATTACH_WORKSPACE_STEP = 32;

	/**
	 * The feature id for the '<em><b>At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE_STEP__AT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attach Workspace Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attach Workspace Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACH_WORKSPACE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AddSSHKeysStepImpl <em>Add SSH Keys Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AddSSHKeysStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getAddSSHKeysStep()
	 * @generated
	 */
	int ADD_SSH_KEYS_STEP = 33;

	/**
	 * The feature id for the '<em><b>Fingerprints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS_STEP__FINGERPRINTS = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add SSH Keys Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add SSH Keys Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SSH_KEYS_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceStepImpl <em>Orb Reference Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbReferenceStep()
	 * @generated
	 */
	int ORB_REFERENCE_STEP = 34;

	/**
	 * The feature id for the '<em><b>Orb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_STEP__ORB = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_STEP__JOB_NAME = STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_STEP__ARGUMENTS = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orb Reference Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Orb Reference Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORB_REFERENCE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandReferenceStepImpl <em>Command Reference Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandReferenceStepImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCommandReferenceStep()
	 * @generated
	 */
	int COMMAND_REFERENCE_STEP = 35;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REFERENCE_STEP__COMMAND = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REFERENCE_STEP__ARGUMENTS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Reference Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REFERENCE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Command Reference Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_REFERENCE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableAssignmentImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getVariableAssignment()
	 * @generated
	 */
	int VARIABLE_ASSIGNMENT = 36;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableDeclarationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Is When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__IS_WHEN = 3;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__JOBS = 4;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.TriggerImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 39;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__BRANCHES = 0;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__IGNORE_SPECIFIED_BRANCHES = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScheduleTriggerImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getScheduleTrigger()
	 * @generated
	 */
	int SCHEDULE_TRIGGER = 40;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__BRANCHES = TRIGGER__BRANCHES;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__IGNORE_SPECIFIED_BRANCHES = TRIGGER__IGNORE_SPECIFIED_BRANCHES;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__CRON = TRIGGER_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl <em>Workflow Job Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowJobConfiguration()
	 * @generated
	 */
	int WORKFLOW_JOB_CONFIGURATION = 41;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__REQUIRES = 0;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__BRANCHES = 4;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES = 5;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__TAGS = 6;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS = 7;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__MATRIX = 8;

	/**
	 * The feature id for the '<em><b>Pre Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__PRE_STEPS = 9;

	/**
	 * The feature id for the '<em><b>Post Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__POST_STEPS = 10;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION__ARGUMENTS = 11;

	/**
	 * The number of structural features of the '<em>Workflow Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Workflow Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_JOB_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NullWorkflowJobConfigurationImpl <em>Null Workflow Job Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NullWorkflowJobConfigurationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getNullWorkflowJobConfiguration()
	 * @generated
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION = 42;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__REQUIRES = WORKFLOW_JOB_CONFIGURATION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY = WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__NAME = WORKFLOW_JOB_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__CONTEXTS = WORKFLOW_JOB_CONFIGURATION__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__BRANCHES = WORKFLOW_JOB_CONFIGURATION__BRANCHES;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__TAGS = WORKFLOW_JOB_CONFIGURATION__TAGS;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__MATRIX = WORKFLOW_JOB_CONFIGURATION__MATRIX;

	/**
	 * The feature id for the '<em><b>Pre Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__PRE_STEPS = WORKFLOW_JOB_CONFIGURATION__PRE_STEPS;

	/**
	 * The feature id for the '<em><b>Post Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__POST_STEPS = WORKFLOW_JOB_CONFIGURATION__POST_STEPS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION__ARGUMENTS = WORKFLOW_JOB_CONFIGURATION__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Null Workflow Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Null Workflow Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_WORKFLOW_JOB_CONFIGURATION_OPERATION_COUNT = WORKFLOW_JOB_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowDefinedJobConfigurationImpl <em>Workflow Defined Job Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowDefinedJobConfigurationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowDefinedJobConfiguration()
	 * @generated
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION = 43;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__REQUIRES = WORKFLOW_JOB_CONFIGURATION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__REQUIRED_BY = WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__NAME = WORKFLOW_JOB_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__CONTEXTS = WORKFLOW_JOB_CONFIGURATION__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__BRANCHES = WORKFLOW_JOB_CONFIGURATION__BRANCHES;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__TAGS = WORKFLOW_JOB_CONFIGURATION__TAGS;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__MATRIX = WORKFLOW_JOB_CONFIGURATION__MATRIX;

	/**
	 * The feature id for the '<em><b>Pre Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__PRE_STEPS = WORKFLOW_JOB_CONFIGURATION__PRE_STEPS;

	/**
	 * The feature id for the '<em><b>Post Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__POST_STEPS = WORKFLOW_JOB_CONFIGURATION__POST_STEPS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__ARGUMENTS = WORKFLOW_JOB_CONFIGURATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Job</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION__JOB = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Defined Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION_FEATURE_COUNT = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Workflow Defined Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DEFINED_JOB_CONFIGURATION_OPERATION_COUNT = WORKFLOW_JOB_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowApprovalJobConfigurationImpl <em>Workflow Approval Job Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowApprovalJobConfigurationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowApprovalJobConfiguration()
	 * @generated
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION = 44;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__REQUIRES = WORKFLOW_JOB_CONFIGURATION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__REQUIRED_BY = WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__NAME = WORKFLOW_JOB_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__CONTEXTS = WORKFLOW_JOB_CONFIGURATION__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__BRANCHES = WORKFLOW_JOB_CONFIGURATION__BRANCHES;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__TAGS = WORKFLOW_JOB_CONFIGURATION__TAGS;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__MATRIX = WORKFLOW_JOB_CONFIGURATION__MATRIX;

	/**
	 * The feature id for the '<em><b>Pre Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__PRE_STEPS = WORKFLOW_JOB_CONFIGURATION__PRE_STEPS;

	/**
	 * The feature id for the '<em><b>Post Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__POST_STEPS = WORKFLOW_JOB_CONFIGURATION__POST_STEPS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION__ARGUMENTS = WORKFLOW_JOB_CONFIGURATION__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Workflow Approval Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION_FEATURE_COUNT = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Workflow Approval Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_APPROVAL_JOB_CONFIGURATION_OPERATION_COUNT = WORKFLOW_JOB_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl <em>Workflow Orb Job Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowOrbJobConfiguration()
	 * @generated
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION = 45;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__REQUIRES = WORKFLOW_JOB_CONFIGURATION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__REQUIRED_BY = WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__NAME = WORKFLOW_JOB_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__CONTEXTS = WORKFLOW_JOB_CONFIGURATION__CONTEXTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__BRANCHES = WORKFLOW_JOB_CONFIGURATION__BRANCHES;

	/**
	 * The feature id for the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__TAGS = WORKFLOW_JOB_CONFIGURATION__TAGS;

	/**
	 * The feature id for the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS = WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__MATRIX = WORKFLOW_JOB_CONFIGURATION__MATRIX;

	/**
	 * The feature id for the '<em><b>Pre Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__PRE_STEPS = WORKFLOW_JOB_CONFIGURATION__PRE_STEPS;

	/**
	 * The feature id for the '<em><b>Post Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__POST_STEPS = WORKFLOW_JOB_CONFIGURATION__POST_STEPS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__ARGUMENTS = WORKFLOW_JOB_CONFIGURATION__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Orb</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__ORB = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workflow Orb Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION_FEATURE_COUNT = WORKFLOW_JOB_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workflow Orb Job Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_ORB_JOB_CONFIGURATION_OPERATION_COUNT = WORKFLOW_JOB_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 46;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__EXCLUDES = 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ALIAS = 2;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixParameterImpl <em>Matrix Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixParameterImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatrixParameter()
	 * @generated
	 */
	int MATRIX_PARAMETER = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMETER__CELLS = 1;

	/**
	 * The number of structural features of the '<em>Matrix Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Matrix Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixCombinationImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatrixCombination()
	 * @generated
	 */
	int MATRIX_COMBINATION = 48;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExpressionImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 49;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConcatImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 50;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicImpl <em>Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLogic()
	 * @generated
	 */
	int LOGIC = 51;

	/**
	 * The number of structural features of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.InfinitaryOperatorImpl <em>Infinitary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.InfinitaryOperatorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getInfinitaryOperator()
	 * @generated
	 */
	int INFINITARY_OPERATOR = 52;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITARY_OPERATOR__OPERANDS = LOGIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infinitary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITARY_OPERATOR_FEATURE_COUNT = LOGIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Infinitary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFINITARY_OPERATOR_OPERATION_COUNT = LOGIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AndImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 53;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERANDS = INFINITARY_OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = INFINITARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = INFINITARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOr()
	 * @generated
	 */
	int OR = 54;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERANDS = INFINITARY_OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = INFINITARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = INFINITARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EqualsImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 55;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__OPERANDS = INFINITARY_OPERATOR__OPERANDS;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = INFINITARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = INFINITARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnaryOperatorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 56;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR__OPERAND = LOGIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = LOGIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_OPERATION_COUNT = LOGIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NotImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 57;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = UNARY_OPERATOR__OPERAND;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = UNARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = UNARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicFunctionImpl <em>Logic Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicFunctionImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLogicFunction()
	 * @generated
	 */
	int LOGIC_FUNCTION = 58;

	/**
	 * The number of structural features of the '<em>Logic Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_FEATURE_COUNT = LOGIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logic Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_FUNCTION_OPERATION_COUNT = LOGIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatchesImpl <em>Matches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatchesImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatches()
	 * @generated
	 */
	int MATCHES = 59;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__PATTERN = LOGIC_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES__VALUE = LOGIC_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_FEATURE_COUNT = LOGIC_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Matches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCHES_OPERATION_COUNT = LOGIC_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ValueImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 60;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DotOperatorImpl <em>Dot Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DotOperatorImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDotOperator()
	 * @generated
	 */
	int DOT_OPERATOR = 61;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATOR__LHS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATOR__RHS = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dot Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATOR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dot Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOT_OPERATOR_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LiteralImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 62;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StringLiteralImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 63;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.IntegerLiteralImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 64;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DoubleLiteralImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDoubleLiteral()
	 * @generated
	 */
	int DOUBLE_LITERAL = 65;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BooleanLiteralImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 66;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableReferenceImpl
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 67;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__REFERENCE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES <em>PARAMETER TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPARAMETER_TYPES()
	 * @generated
	 */
	int PARAMETER_TYPES = 68;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWHEN_TYPE()
	 * @generated
	 */
	int WHEN_TYPE = 69;

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup <em>Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Group</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup
	 * @generated
	 */
	EClass getDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getOrbs <em>Orbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orbs</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getOrbs()
	 * @see #getDefinitionGroup()
	 * @generated
	 */
	EReference getDefinitionGroup_Orbs();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getCommands()
	 * @see #getDefinitionGroup()
	 * @generated
	 */
	EReference getDefinitionGroup_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getExecutors <em>Executors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executors</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getExecutors()
	 * @see #getDefinitionGroup()
	 * @generated
	 */
	EReference getDefinitionGroup_Executors();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DefinitionGroup#getJobs()
	 * @see #getDefinitionGroup()
	 * @generated
	 */
	EReference getDefinitionGroup_Jobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Script#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Script#getSteps()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Steps();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Callable <em>Callable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Callable
	 * @generated
	 */
	EClass getCallable();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Callable#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Callable#getParameters()
	 * @see #getCallable()
	 * @generated
	 */
	EReference getCallable_Parameters();

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
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Environment#getEnvironmentVariables()
	 * @see #getEnvironment()
	 * @generated
	 */
	EReference getEnvironment_EnvironmentVariables();

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
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getSetup <em>Setup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Setup</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getSetup()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Setup();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getWorkflows <em>Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workflows</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Pipeline#getWorkflows()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Workflows();

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
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Orb#getName()
	 * @see #getOrb()
	 * @generated
	 */
	EAttribute getOrb_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference <em>Orb Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orb Reference</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference
	 * @generated
	 */
	EClass getOrbReference();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReference#getReference()
	 * @see #getOrbReference()
	 * @generated
	 */
	EAttribute getOrbReference_Reference();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition <em>Orb Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orb Definition</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbDefinition
	 * @generated
	 */
	EClass getOrbDefinition();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Values</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getEnumValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_EnumValues();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getDefault()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Default();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameter#getDescription()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Description();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor
	 * @generated
	 */
	EClass getExecutor();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getName()
	 * @see #getExecutor()
	 * @generated
	 */
	EAttribute getExecutor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getResourceClass <em>Resource Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Class</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getResourceClass()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_ResourceClass();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shell</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getShell()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_Shell();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getWorkingDirectory()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_WorkingDirectory();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor#getEnvironmentVariables()
	 * @see #getExecutor()
	 * @generated
	 */
	EReference getExecutor_EnvironmentVariables();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor <em>Docker Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor
	 * @generated
	 */
	EClass getDockerExecutor();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerExecutor#getContainers()
	 * @see #getDockerExecutor()
	 * @generated
	 */
	EReference getDockerExecutor_Containers();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer <em>Docker Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Container</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer
	 * @generated
	 */
	EClass getDockerContainer();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getImage()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Image();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getName()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getEntrypoint <em>Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrypoint</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getEntrypoint()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Entrypoint();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getCommand()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Command();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUser()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_User();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getEnvironmentVariables()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_EnvironmentVariables();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Username</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getUsername()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Username();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Password</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getPassword()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Password();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getOidc <em>Oidc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Oidc</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getOidc()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Oidc();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsAccessKeyID <em>Aws Access Key ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aws Access Key ID</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsAccessKeyID()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_AwsAccessKeyID();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsSecretAccessKey <em>Aws Secret Access Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aws Secret Access Key</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer#getAwsSecretAccessKey()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_AwsSecretAccessKey();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor <em>Machine Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor
	 * @generated
	 */
	EClass getMachineExecutor();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor#getImage()
	 * @see #getMachineExecutor()
	 * @generated
	 */
	EReference getMachineExecutor_Image();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor#getDockerLayerCaching <em>Docker Layer Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker Layer Caching</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor#getDockerLayerCaching()
	 * @see #getMachineExecutor()
	 * @generated
	 */
	EReference getMachineExecutor_DockerLayerCaching();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor <em>Mac OS Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac OS Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor
	 * @generated
	 */
	EClass getMacOSExecutor();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor#getXcode <em>Xcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xcode</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor#getXcode()
	 * @see #getMacOSExecutor()
	 * @generated
	 */
	EReference getMacOSExecutor_Xcode();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor <em>Windows Orb Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows Orb Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor
	 * @generated
	 */
	EClass getWindowsOrbExecutor();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WindowsOrbExecutor#getExecutor()
	 * @see #getWindowsOrbExecutor()
	 * @generated
	 */
	EReference getWindowsOrbExecutor_Executor();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ReferenceExecutor <em>Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ReferenceExecutor
	 * @generated
	 */
	EClass getReferenceExecutor();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor <em>Executor Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executor Reference Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor
	 * @generated
	 */
	EClass getExecutorReferenceExecutor();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ExecutorReferenceExecutor#getExecutor()
	 * @see #getExecutorReferenceExecutor()
	 * @generated
	 */
	EReference getExecutorReferenceExecutor_Executor();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor <em>Orb Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orb Reference Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor
	 * @generated
	 */
	EClass getOrbReferenceExecutor();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orb</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrb()
	 * @see #getOrbReferenceExecutor()
	 * @generated
	 */
	EReference getOrbReferenceExecutor_Orb();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrbExecutorName <em>Orb Executor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orb Executor Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceExecutor#getOrbExecutorName()
	 * @see #getOrbReferenceExecutor()
	 * @generated
	 */
	EAttribute getOrbReferenceExecutor_OrbExecutorName();

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
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Executor</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getExecutor()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Executor();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallelism</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getParallelism()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Parallelism();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getCircleCIIPRanges <em>Circle CIIP Ranges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circle CIIP Ranges</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job#getCircleCIIPRanges()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_CircleCIIPRanges();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep <em>Run Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep
	 * @generated
	 */
	EClass getRunStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getCommand()
	 * @see #getRunStep()
	 * @generated
	 */
	EReference getRunStep_Command();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getName()
	 * @see #getRunStep()
	 * @generated
	 */
	EReference getRunStep_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shell</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getShell()
	 * @see #getRunStep()
	 * @generated
	 */
	EReference getRunStep_Shell();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getBackground()
	 * @see #getRunStep()
	 * @generated
	 */
	EReference getRunStep_Background();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWorkingDirectory()
	 * @see #getRunStep()
	 * @generated
	 */
	EReference getRunStep_WorkingDirectory();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getNoOutputTimeout <em>No Output Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No Output Timeout</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getNoOutputTimeout()
	 * @see #getRunStep()
	 * @generated
	 */
	EReference getRunStep_NoOutputTimeout();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep#getWhen()
	 * @see #getRunStep()
	 * @generated
	 */
	EAttribute getRunStep_When();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep
	 * @generated
	 */
	EClass getConditionalStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ConditionalStep#getCondition()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_Condition();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WhenStep <em>When Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WhenStep
	 * @generated
	 */
	EClass getWhenStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnlessStep <em>Unless Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unless Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnlessStep
	 * @generated
	 */
	EClass getUnlessStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep <em>Checkout Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Checkout Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep
	 * @generated
	 */
	EClass getCheckoutStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CheckoutStep#getPath()
	 * @see #getCheckoutStep()
	 * @generated
	 */
	EReference getCheckoutStep_Path();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep <em>Setup Remote Docker Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setup Remote Docker Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep
	 * @generated
	 */
	EClass getSetupRemoteDockerStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getVersion()
	 * @see #getSetupRemoteDockerStep()
	 * @generated
	 */
	EReference getSetupRemoteDockerStep_Version();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getDockerLayerCaching <em>Docker Layer Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker Layer Caching</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep#getDockerLayerCaching()
	 * @see #getSetupRemoteDockerStep()
	 * @generated
	 */
	EReference getSetupRemoteDockerStep_DockerLayerCaching();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep <em>Save Cache Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Cache Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep
	 * @generated
	 */
	EClass getSaveCacheStep();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getPaths()
	 * @see #getSaveCacheStep()
	 * @generated
	 */
	EReference getSaveCacheStep_Paths();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getKey()
	 * @see #getSaveCacheStep()
	 * @generated
	 */
	EReference getSaveCacheStep_Key();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getName()
	 * @see #getSaveCacheStep()
	 * @generated
	 */
	EReference getSaveCacheStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SaveCacheStep#getWhen()
	 * @see #getSaveCacheStep()
	 * @generated
	 */
	EAttribute getSaveCacheStep_When();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep <em>Restore Cache Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restore Cache Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep
	 * @generated
	 */
	EClass getRestoreCacheStep();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep#getKeys()
	 * @see #getRestoreCacheStep()
	 * @generated
	 */
	EReference getRestoreCacheStep_Keys();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RestoreCacheStep#getName()
	 * @see #getRestoreCacheStep()
	 * @generated
	 */
	EReference getRestoreCacheStep_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep <em>Store Artifacts Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Artifacts Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep
	 * @generated
	 */
	EClass getStoreArtifactsStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep#getPath()
	 * @see #getStoreArtifactsStep()
	 * @generated
	 */
	EReference getStoreArtifactsStep_Path();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreArtifactsStep#getDestination()
	 * @see #getStoreArtifactsStep()
	 * @generated
	 */
	EReference getStoreArtifactsStep_Destination();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep <em>Store Test Results Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Test Results Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep
	 * @generated
	 */
	EClass getStoreTestResultsStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StoreTestResultsStep#getPath()
	 * @see #getStoreTestResultsStep()
	 * @generated
	 */
	EReference getStoreTestResultsStep_Path();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep <em>Persist To Workspace Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persist To Workspace Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep
	 * @generated
	 */
	EClass getPersistToWorkspaceStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep#getRoot()
	 * @see #getPersistToWorkspaceStep()
	 * @generated
	 */
	EReference getPersistToWorkspaceStep_Root();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PersistToWorkspaceStep#getPaths()
	 * @see #getPersistToWorkspaceStep()
	 * @generated
	 */
	EReference getPersistToWorkspaceStep_Paths();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep <em>Attach Workspace Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attach Workspace Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep
	 * @generated
	 */
	EClass getAttachWorkspaceStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>At</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep#getAt()
	 * @see #getAttachWorkspaceStep()
	 * @generated
	 */
	EReference getAttachWorkspaceStep_At();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep <em>Add SSH Keys Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add SSH Keys Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep
	 * @generated
	 */
	EClass getAddSSHKeysStep();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep#getFingerprints <em>Fingerprints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fingerprints</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AddSSHKeysStep#getFingerprints()
	 * @see #getAddSSHKeysStep()
	 * @generated
	 */
	EReference getAddSSHKeysStep_Fingerprints();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep <em>Orb Reference Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orb Reference Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep
	 * @generated
	 */
	EClass getOrbReferenceStep();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getOrb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orb</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getOrb()
	 * @see #getOrbReferenceStep()
	 * @generated
	 */
	EReference getOrbReferenceStep_Orb();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getJobName()
	 * @see #getOrbReferenceStep()
	 * @generated
	 */
	EAttribute getOrbReferenceStep_JobName();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Arguments</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.OrbReferenceStep#getArguments()
	 * @see #getOrbReferenceStep()
	 * @generated
	 */
	EReference getOrbReferenceStep_Arguments();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep <em>Command Reference Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Reference Step</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep
	 * @generated
	 */
	EClass getCommandReferenceStep();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getCommand()
	 * @see #getCommandReferenceStep()
	 * @generated
	 */
	EReference getCommandReferenceStep_Command();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Arguments</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CommandReferenceStep#getArguments()
	 * @see #getCommandReferenceStep()
	 * @generated
	 */
	EReference getCommandReferenceStep_Arguments();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Variable Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Assignment</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration" keyContainment="true" keyRequired="true"
	 *        valueType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression" valueContainment="true" valueRequired="true"
	 * @generated
	 */
	EClass getVariableAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVariableAssignment()
	 * @generated
	 */
	EReference getVariableAssignment_Key();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration#getName()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Name();

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
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getTriggers()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Triggers();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getCondition()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Condition();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getIsWhen <em>Is When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is When</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getIsWhen()
	 * @see #getWorkflow()
	 * @generated
	 */
	EAttribute getWorkflow_IsWhen();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow#getJobs()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Jobs();

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
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger#getBranches()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Branches();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger#getIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger#getIgnoreSpecifiedBranches()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Trigger</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger
	 * @generated
	 */
	EClass getScheduleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.ScheduleTrigger#getCron()
	 * @see #getScheduleTrigger()
	 * @generated
	 */
	EAttribute getScheduleTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration <em>Workflow Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Job Configuration</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration
	 * @generated
	 */
	EClass getWorkflowJobConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequires()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_Requires();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequiredBy()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_RequiredBy();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getName()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EAttribute getWorkflowJobConfiguration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getContexts()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getBranches()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_Branches();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Branches</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedBranches()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EAttribute getWorkflowJobConfiguration_IgnoreSpecifiedBranches();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getTags()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_Tags();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Specified Tags</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedTags()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EAttribute getWorkflowJobConfiguration_IgnoreSpecifiedTags();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getMatrix()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_Matrix();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getPreSteps <em>Pre Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre Steps</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getPreSteps()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_PreSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getPostSteps <em>Post Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post Steps</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getPostSteps()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_PostSteps();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Arguments</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getArguments()
	 * @see #getWorkflowJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowJobConfiguration_Arguments();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.NullWorkflowJobConfiguration <em>Null Workflow Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Workflow Job Configuration</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.NullWorkflowJobConfiguration
	 * @generated
	 */
	EClass getNullWorkflowJobConfiguration();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration <em>Workflow Defined Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Defined Job Configuration</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration
	 * @generated
	 */
	EClass getWorkflowDefinedJobConfiguration();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Job</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowDefinedJobConfiguration#getJob()
	 * @see #getWorkflowDefinedJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowDefinedJobConfiguration_Job();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowApprovalJobConfiguration <em>Workflow Approval Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Approval Job Configuration</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowApprovalJobConfiguration
	 * @generated
	 */
	EClass getWorkflowApprovalJobConfiguration();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration <em>Workflow Orb Job Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Orb Job Configuration</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration
	 * @generated
	 */
	EClass getWorkflowOrbJobConfiguration();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration#getOrb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orb</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration#getOrb()
	 * @see #getWorkflowOrbJobConfiguration()
	 * @generated
	 */
	EReference getWorkflowOrbJobConfiguration_Orb();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration#getJobName()
	 * @see #getWorkflowOrbJobConfiguration()
	 * @generated
	 */
	EAttribute getWorkflowOrbJobConfiguration_JobName();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix#getParameters()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excludes</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix#getExcludes()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Excludes();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matrix#getAlias()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Alias();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter <em>Matrix Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Parameter</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter
	 * @generated
	 */
	EClass getMatrixParameter();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter#getName()
	 * @see #getMatrixParameter()
	 * @generated
	 */
	EReference getMatrixParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixParameter#getCells()
	 * @see #getMatrixParameter()
	 * @generated
	 */
	EReference getMatrixParameter_Cells();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Combination</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination
	 * @generated
	 */
	EClass getMatrixCombination();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MatrixCombination#getEntries()
	 * @see #getMatrixCombination()
	 * @generated
	 */
	EReference getMatrixCombination_Entries();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Concat#getExpressions()
	 * @see #getConcat()
	 * @generated
	 */
	EReference getConcat_Expressions();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Logic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Logic
	 * @generated
	 */
	EClass getLogic();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator <em>Infinitary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infinitary Operator</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator
	 * @generated
	 */
	EClass getInfinitaryOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.InfinitaryOperator#getOperands()
	 * @see #getInfinitaryOperator()
	 * @generated
	 */
	EReference getInfinitaryOperator_Operands();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.UnaryOperator#getOperand()
	 * @see #getUnaryOperator()
	 * @generated
	 */
	EReference getUnaryOperator_Operand();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.LogicFunction <em>Logic Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Function</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.LogicFunction
	 * @generated
	 */
	EClass getLogicFunction();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matches</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches
	 * @generated
	 */
	EClass getMatches();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches#getPattern()
	 * @see #getMatches()
	 * @generated
	 */
	EReference getMatches_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Matches#getValue()
	 * @see #getMatches()
	 * @generated
	 */
	EReference getMatches_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator <em>Dot Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dot Operator</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator
	 * @generated
	 */
	EClass getDotOperator();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator#getLhs()
	 * @see #getDotOperator()
	 * @generated
	 */
	EReference getDotOperator_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DotOperator#getRhs()
	 * @see #getDotOperator()
	 * @generated
	 */
	EReference getDotOperator_Rhs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral <em>Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Literal</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral
	 * @generated
	 */
	EClass getDoubleLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DoubleLiteral#getValue()
	 * @see #getDoubleLiteral()
	 * @generated
	 */
	EAttribute getDoubleLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.BooleanLiteral#getValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableReference#getReference()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Reference();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES <em>PARAMETER TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PARAMETER TYPES</em>'.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES
	 * @generated
	 */
	EEnum getPARAMETER_TYPES();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl <em>Definition Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DefinitionGroupImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDefinitionGroup()
		 * @generated
		 */
		EClass DEFINITION_GROUP = eINSTANCE.getDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Orbs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_GROUP__ORBS = eINSTANCE.getDefinitionGroup_Orbs();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_GROUP__COMMANDS = eINSTANCE.getDefinitionGroup_Commands();

		/**
		 * The meta object literal for the '<em><b>Executors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_GROUP__EXECUTORS = eINSTANCE.getDefinitionGroup_Executors();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_GROUP__JOBS = eINSTANCE.getDefinitionGroup_Jobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScriptImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__STEPS = eINSTANCE.getScript_Steps();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CallableImpl <em>Callable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CallableImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCallable()
		 * @generated
		 */
		EClass CALLABLE = eINSTANCE.getCallable();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALLABLE__PARAMETERS = eINSTANCE.getCallable_Parameters();

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
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT__ENVIRONMENT_VARIABLES = eINSTANCE.getEnvironment_EnvironmentVariables();

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
		 * The meta object literal for the '<em><b>Setup</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__SETUP = eINSTANCE.getPipeline_Setup();

		/**
		 * The meta object literal for the '<em><b>Workflows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__WORKFLOWS = eINSTANCE.getPipeline_Workflows();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB__NAME = eINSTANCE.getOrb_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceImpl <em>Orb Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbReference()
		 * @generated
		 */
		EClass ORB_REFERENCE = eINSTANCE.getOrbReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB_REFERENCE__REFERENCE = eINSTANCE.getOrbReference_Reference();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbDefinitionImpl <em>Orb Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbDefinitionImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbDefinition()
		 * @generated
		 */
		EClass ORB_DEFINITION = eINSTANCE.getOrbDefinition();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ParameterImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ENUM_VALUES = eINSTANCE.getParameter_EnumValues();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DESCRIPTION = eINSTANCE.getParameter_Description();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl <em>Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExecutor()
		 * @generated
		 */
		EClass EXECUTOR = eINSTANCE.getExecutor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTOR__NAME = eINSTANCE.getExecutor_Name();

		/**
		 * The meta object literal for the '<em><b>Resource Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__RESOURCE_CLASS = eINSTANCE.getExecutor_ResourceClass();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__SHELL = eINSTANCE.getExecutor_Shell();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__WORKING_DIRECTORY = eINSTANCE.getExecutor_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR__ENVIRONMENT_VARIABLES = eINSTANCE.getExecutor_EnvironmentVariables();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerExecutorImpl <em>Docker Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDockerExecutor()
		 * @generated
		 */
		EClass DOCKER_EXECUTOR = eINSTANCE.getDockerExecutor();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_EXECUTOR__CONTAINERS = eINSTANCE.getDockerExecutor_Containers();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl <em>Docker Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDockerContainer()
		 * @generated
		 */
		EClass DOCKER_CONTAINER = eINSTANCE.getDockerContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__IMAGE = eINSTANCE.getDockerContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__NAME = eINSTANCE.getDockerContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Entrypoint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__ENTRYPOINT = eINSTANCE.getDockerContainer_Entrypoint();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__COMMAND = eINSTANCE.getDockerContainer_Command();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__USER = eINSTANCE.getDockerContainer_User();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__ENVIRONMENT_VARIABLES = eINSTANCE.getDockerContainer_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__USERNAME = eINSTANCE.getDockerContainer_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__PASSWORD = eINSTANCE.getDockerContainer_Password();

		/**
		 * The meta object literal for the '<em><b>Oidc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__OIDC = eINSTANCE.getDockerContainer_Oidc();

		/**
		 * The meta object literal for the '<em><b>Aws Access Key ID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__AWS_ACCESS_KEY_ID = eINSTANCE.getDockerContainer_AwsAccessKeyID();

		/**
		 * The meta object literal for the '<em><b>Aws Secret Access Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY = eINSTANCE.getDockerContainer_AwsSecretAccessKey();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MachineExecutorImpl <em>Machine Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MachineExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMachineExecutor()
		 * @generated
		 */
		EClass MACHINE_EXECUTOR = eINSTANCE.getMachineExecutor();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_EXECUTOR__IMAGE = eINSTANCE.getMachineExecutor_Image();

		/**
		 * The meta object literal for the '<em><b>Docker Layer Caching</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE_EXECUTOR__DOCKER_LAYER_CACHING = eINSTANCE.getMachineExecutor_DockerLayerCaching();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOSExecutorImpl <em>Mac OS Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MacOSExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMacOSExecutor()
		 * @generated
		 */
		EClass MAC_OS_EXECUTOR = eINSTANCE.getMacOSExecutor();

		/**
		 * The meta object literal for the '<em><b>Xcode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAC_OS_EXECUTOR__XCODE = eINSTANCE.getMacOSExecutor_Xcode();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbExecutorImpl <em>Windows Orb Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WindowsOrbExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWindowsOrbExecutor()
		 * @generated
		 */
		EClass WINDOWS_ORB_EXECUTOR = eINSTANCE.getWindowsOrbExecutor();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOWS_ORB_EXECUTOR__EXECUTOR = eINSTANCE.getWindowsOrbExecutor_Executor();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ReferenceExecutorImpl <em>Reference Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ReferenceExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getReferenceExecutor()
		 * @generated
		 */
		EClass REFERENCE_EXECUTOR = eINSTANCE.getReferenceExecutor();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorReferenceExecutorImpl <em>Executor Reference Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorReferenceExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExecutorReferenceExecutor()
		 * @generated
		 */
		EClass EXECUTOR_REFERENCE_EXECUTOR = eINSTANCE.getExecutorReferenceExecutor();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTOR_REFERENCE_EXECUTOR__EXECUTOR = eINSTANCE.getExecutorReferenceExecutor_Executor();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceExecutorImpl <em>Orb Reference Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceExecutorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbReferenceExecutor()
		 * @generated
		 */
		EClass ORB_REFERENCE_EXECUTOR = eINSTANCE.getOrbReferenceExecutor();

		/**
		 * The meta object literal for the '<em><b>Orb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORB_REFERENCE_EXECUTOR__ORB = eINSTANCE.getOrbReferenceExecutor_Orb();

		/**
		 * The meta object literal for the '<em><b>Orb Executor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB_REFERENCE_EXECUTOR__ORB_EXECUTOR_NAME = eINSTANCE.getOrbReferenceExecutor_OrbExecutorName();

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
		 * The meta object literal for the '<em><b>Executor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__EXECUTOR = eINSTANCE.getJob_Executor();

		/**
		 * The meta object literal for the '<em><b>Parallelism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PARALLELISM = eINSTANCE.getJob_Parallelism();

		/**
		 * The meta object literal for the '<em><b>Circle CIIP Ranges</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CIRCLE_CIIP_RANGES = eINSTANCE.getJob_CircleCIIPRanges();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl <em>Run Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getRunStep()
		 * @generated
		 */
		EClass RUN_STEP = eINSTANCE.getRunStep();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_STEP__COMMAND = eINSTANCE.getRunStep_Command();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_STEP__NAME = eINSTANCE.getRunStep_Name();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_STEP__SHELL = eINSTANCE.getRunStep_Shell();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_STEP__BACKGROUND = eINSTANCE.getRunStep_Background();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_STEP__WORKING_DIRECTORY = eINSTANCE.getRunStep_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>No Output Timeout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUN_STEP__NO_OUTPUT_TIMEOUT = eINSTANCE.getRunStep_NoOutputTimeout();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN_STEP__WHEN = eINSTANCE.getRunStep_When();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConditionalStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getConditionalStep()
		 * @generated
		 */
		EClass CONDITIONAL_STEP = eINSTANCE.getConditionalStep();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_STEP__CONDITION = eINSTANCE.getConditionalStep_Condition();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WhenStepImpl <em>When Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WhenStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWhenStep()
		 * @generated
		 */
		EClass WHEN_STEP = eINSTANCE.getWhenStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnlessStepImpl <em>Unless Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnlessStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getUnlessStep()
		 * @generated
		 */
		EClass UNLESS_STEP = eINSTANCE.getUnlessStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CheckoutStepImpl <em>Checkout Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CheckoutStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCheckoutStep()
		 * @generated
		 */
		EClass CHECKOUT_STEP = eINSTANCE.getCheckoutStep();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECKOUT_STEP__PATH = eINSTANCE.getCheckoutStep_Path();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SetupRemoteDockerStepImpl <em>Setup Remote Docker Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SetupRemoteDockerStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getSetupRemoteDockerStep()
		 * @generated
		 */
		EClass SETUP_REMOTE_DOCKER_STEP = eINSTANCE.getSetupRemoteDockerStep();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP_REMOTE_DOCKER_STEP__VERSION = eINSTANCE.getSetupRemoteDockerStep_Version();

		/**
		 * The meta object literal for the '<em><b>Docker Layer Caching</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING = eINSTANCE
				.getSetupRemoteDockerStep_DockerLayerCaching();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SaveCacheStepImpl <em>Save Cache Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SaveCacheStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getSaveCacheStep()
		 * @generated
		 */
		EClass SAVE_CACHE_STEP = eINSTANCE.getSaveCacheStep();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVE_CACHE_STEP__PATHS = eINSTANCE.getSaveCacheStep_Paths();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVE_CACHE_STEP__KEY = eINSTANCE.getSaveCacheStep_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVE_CACHE_STEP__NAME = eINSTANCE.getSaveCacheStep_Name();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_CACHE_STEP__WHEN = eINSTANCE.getSaveCacheStep_When();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RestoreCacheStepImpl <em>Restore Cache Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RestoreCacheStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getRestoreCacheStep()
		 * @generated
		 */
		EClass RESTORE_CACHE_STEP = eINSTANCE.getRestoreCacheStep();

		/**
		 * The meta object literal for the '<em><b>Keys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTORE_CACHE_STEP__KEYS = eINSTANCE.getRestoreCacheStep_Keys();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTORE_CACHE_STEP__NAME = eINSTANCE.getRestoreCacheStep_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreArtifactsStepImpl <em>Store Artifacts Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreArtifactsStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStoreArtifactsStep()
		 * @generated
		 */
		EClass STORE_ARTIFACTS_STEP = eINSTANCE.getStoreArtifactsStep();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_ARTIFACTS_STEP__PATH = eINSTANCE.getStoreArtifactsStep_Path();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_ARTIFACTS_STEP__DESTINATION = eINSTANCE.getStoreArtifactsStep_Destination();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreTestResultsStepImpl <em>Store Test Results Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StoreTestResultsStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStoreTestResultsStep()
		 * @generated
		 */
		EClass STORE_TEST_RESULTS_STEP = eINSTANCE.getStoreTestResultsStep();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_TEST_RESULTS_STEP__PATH = eINSTANCE.getStoreTestResultsStep_Path();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PersistToWorkspaceStepImpl <em>Persist To Workspace Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.PersistToWorkspaceStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPersistToWorkspaceStep()
		 * @generated
		 */
		EClass PERSIST_TO_WORKSPACE_STEP = eINSTANCE.getPersistToWorkspaceStep();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSIST_TO_WORKSPACE_STEP__ROOT = eINSTANCE.getPersistToWorkspaceStep_Root();

		/**
		 * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSIST_TO_WORKSPACE_STEP__PATHS = eINSTANCE.getPersistToWorkspaceStep_Paths();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AttachWorkspaceStepImpl <em>Attach Workspace Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AttachWorkspaceStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getAttachWorkspaceStep()
		 * @generated
		 */
		EClass ATTACH_WORKSPACE_STEP = eINSTANCE.getAttachWorkspaceStep();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACH_WORKSPACE_STEP__AT = eINSTANCE.getAttachWorkspaceStep_At();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AddSSHKeysStepImpl <em>Add SSH Keys Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AddSSHKeysStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getAddSSHKeysStep()
		 * @generated
		 */
		EClass ADD_SSH_KEYS_STEP = eINSTANCE.getAddSSHKeysStep();

		/**
		 * The meta object literal for the '<em><b>Fingerprints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_SSH_KEYS_STEP__FINGERPRINTS = eINSTANCE.getAddSSHKeysStep_Fingerprints();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceStepImpl <em>Orb Reference Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrbReferenceStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOrbReferenceStep()
		 * @generated
		 */
		EClass ORB_REFERENCE_STEP = eINSTANCE.getOrbReferenceStep();

		/**
		 * The meta object literal for the '<em><b>Orb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORB_REFERENCE_STEP__ORB = eINSTANCE.getOrbReferenceStep_Orb();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORB_REFERENCE_STEP__JOB_NAME = eINSTANCE.getOrbReferenceStep_JobName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORB_REFERENCE_STEP__ARGUMENTS = eINSTANCE.getOrbReferenceStep_Arguments();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandReferenceStepImpl <em>Command Reference Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CommandReferenceStepImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getCommandReferenceStep()
		 * @generated
		 */
		EClass COMMAND_REFERENCE_STEP = eINSTANCE.getCommandReferenceStep();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_REFERENCE_STEP__COMMAND = eINSTANCE.getCommandReferenceStep_Command();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_REFERENCE_STEP__ARGUMENTS = eINSTANCE.getCommandReferenceStep_Arguments();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableAssignmentImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getVariableAssignment()
		 * @generated
		 */
		EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__KEY = eINSTANCE.getVariableAssignment_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ASSIGNMENT__VALUE = eINSTANCE.getVariableAssignment_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableDeclarationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

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
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__TRIGGERS = eINSTANCE.getWorkflow_Triggers();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__CONDITION = eINSTANCE.getWorkflow_Condition();

		/**
		 * The meta object literal for the '<em><b>Is When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW__IS_WHEN = eINSTANCE.getWorkflow_IsWhen();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__JOBS = eINSTANCE.getWorkflow_Jobs();

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
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__BRANCHES = eINSTANCE.getTrigger_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__IGNORE_SPECIFIED_BRANCHES = eINSTANCE.getTrigger_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ScheduleTriggerImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getScheduleTrigger()
		 * @generated
		 */
		EClass SCHEDULE_TRIGGER = eINSTANCE.getScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TRIGGER__CRON = eINSTANCE.getScheduleTrigger_Cron();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl <em>Workflow Job Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowJobConfigurationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowJobConfiguration()
		 * @generated
		 */
		EClass WORKFLOW_JOB_CONFIGURATION = eINSTANCE.getWorkflowJobConfiguration();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__REQUIRES = eINSTANCE.getWorkflowJobConfiguration_Requires();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY = eINSTANCE.getWorkflowJobConfiguration_RequiredBy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_JOB_CONFIGURATION__NAME = eINSTANCE.getWorkflowJobConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__CONTEXTS = eINSTANCE.getWorkflowJobConfiguration_Contexts();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__BRANCHES = eINSTANCE.getWorkflowJobConfiguration_Branches();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Branches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES = eINSTANCE
				.getWorkflowJobConfiguration_IgnoreSpecifiedBranches();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__TAGS = eINSTANCE.getWorkflowJobConfiguration_Tags();

		/**
		 * The meta object literal for the '<em><b>Ignore Specified Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS = eINSTANCE
				.getWorkflowJobConfiguration_IgnoreSpecifiedTags();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__MATRIX = eINSTANCE.getWorkflowJobConfiguration_Matrix();

		/**
		 * The meta object literal for the '<em><b>Pre Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__PRE_STEPS = eINSTANCE.getWorkflowJobConfiguration_PreSteps();

		/**
		 * The meta object literal for the '<em><b>Post Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__POST_STEPS = eINSTANCE.getWorkflowJobConfiguration_PostSteps();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_JOB_CONFIGURATION__ARGUMENTS = eINSTANCE.getWorkflowJobConfiguration_Arguments();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NullWorkflowJobConfigurationImpl <em>Null Workflow Job Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NullWorkflowJobConfigurationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getNullWorkflowJobConfiguration()
		 * @generated
		 */
		EClass NULL_WORKFLOW_JOB_CONFIGURATION = eINSTANCE.getNullWorkflowJobConfiguration();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowDefinedJobConfigurationImpl <em>Workflow Defined Job Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowDefinedJobConfigurationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowDefinedJobConfiguration()
		 * @generated
		 */
		EClass WORKFLOW_DEFINED_JOB_CONFIGURATION = eINSTANCE.getWorkflowDefinedJobConfiguration();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_DEFINED_JOB_CONFIGURATION__JOB = eINSTANCE.getWorkflowDefinedJobConfiguration_Job();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowApprovalJobConfigurationImpl <em>Workflow Approval Job Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowApprovalJobConfigurationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowApprovalJobConfiguration()
		 * @generated
		 */
		EClass WORKFLOW_APPROVAL_JOB_CONFIGURATION = eINSTANCE.getWorkflowApprovalJobConfiguration();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl <em>Workflow Orb Job Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowOrbJobConfigurationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWorkflowOrbJobConfiguration()
		 * @generated
		 */
		EClass WORKFLOW_ORB_JOB_CONFIGURATION = eINSTANCE.getWorkflowOrbJobConfiguration();

		/**
		 * The meta object literal for the '<em><b>Orb</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_ORB_JOB_CONFIGURATION__ORB = eINSTANCE.getWorkflowOrbJobConfiguration_Orb();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME = eINSTANCE.getWorkflowOrbJobConfiguration_JobName();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__PARAMETERS = eINSTANCE.getMatrix_Parameters();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__EXCLUDES = eINSTANCE.getMatrix_Excludes();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__ALIAS = eINSTANCE.getMatrix_Alias();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixParameterImpl <em>Matrix Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixParameterImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatrixParameter()
		 * @generated
		 */
		EClass MATRIX_PARAMETER = eINSTANCE.getMatrixParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_PARAMETER__NAME = eINSTANCE.getMatrixParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_PARAMETER__CELLS = eINSTANCE.getMatrixParameter_Cells();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatrixCombinationImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatrixCombination()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExpressionImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ConcatImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getConcat()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicImpl <em>Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLogic()
		 * @generated
		 */
		EClass LOGIC = eINSTANCE.getLogic();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.InfinitaryOperatorImpl <em>Infinitary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.InfinitaryOperatorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getInfinitaryOperator()
		 * @generated
		 */
		EClass INFINITARY_OPERATOR = eINSTANCE.getInfinitaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFINITARY_OPERATOR__OPERANDS = eINSTANCE.getInfinitaryOperator_Operands();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.AndImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.OrImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.EqualsImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.UnaryOperatorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_OPERATOR__OPERAND = eINSTANCE.getUnaryOperator_Operand();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NotImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicFunctionImpl <em>Logic Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LogicFunctionImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLogicFunction()
		 * @generated
		 */
		EClass LOGIC_FUNCTION = eINSTANCE.getLogicFunction();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatchesImpl <em>Matches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MatchesImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getMatches()
		 * @generated
		 */
		EClass MATCHES = eINSTANCE.getMatches();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHES__PATTERN = eINSTANCE.getMatches_Pattern();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCHES__VALUE = eINSTANCE.getMatches_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ValueImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DotOperatorImpl <em>Dot Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DotOperatorImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDotOperator()
		 * @generated
		 */
		EClass DOT_OPERATOR = eINSTANCE.getDotOperator();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_OPERATOR__LHS = eINSTANCE.getDotOperator_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOT_OPERATOR__RHS = eINSTANCE.getDotOperator_Rhs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.LiteralImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StringLiteralImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getStringLiteral()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.IntegerLiteralImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getIntegerLiteral()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DoubleLiteralImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getDoubleLiteral()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.BooleanLiteralImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getBooleanLiteral()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.VariableReferenceImpl
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__REFERENCE = eINSTANCE.getVariableReference_Reference();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES <em>PARAMETER TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.PARAMETER_TYPES
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getPARAMETER_TYPES()
		 * @generated
		 */
		EEnum PARAMETER_TYPES = eINSTANCE.getPARAMETER_TYPES();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE <em>WHEN TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE
		 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.CircleCIPackageImpl#getWHEN_TYPE()
		 * @generated
		 */
		EEnum WHEN_TYPE = eINSTANCE.getWHEN_TYPE();

	}

} //CircleCIPackage
