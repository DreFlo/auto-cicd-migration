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
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TRIGGERS = 3;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TOOLS = 4;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__NAME = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__AGENT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__CONDITIONS = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__ENVIRONMENT_VARIABLES = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__WHENS = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>When Evaluation Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE__WHEN_EVALUATION_TIME = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE_FEATURE_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Abstract Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STAGE_OPERATION_COUNT = ABSTRACT_PIPELINE_EXECUTION_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedStageImpl <em>Nested Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedStageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNestedStage()
	 * @generated
	 */
	int NESTED_STAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__NAME = ABSTRACT_STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__AGENT = ABSTRACT_STAGE__AGENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__CONDITIONS = ABSTRACT_STAGE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__ENVIRONMENT_VARIABLES = ABSTRACT_STAGE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__WHENS = ABSTRACT_STAGE__WHENS;

	/**
	 * The feature id for the '<em><b>When Evaluation Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__WHEN_EVALUATION_TIME = ABSTRACT_STAGE__WHEN_EVALUATION_TIME;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE__STAGES = ABSTRACT_STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE_FEATURE_COUNT = ABSTRACT_STAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nested Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STAGE_OPERATION_COUNT = ABSTRACT_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelNestedStageImpl <em>Parallel Nested Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelNestedStageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getParallelNestedStage()
	 * @generated
	 */
	int PARALLEL_NESTED_STAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__NAME = NESTED_STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__AGENT = NESTED_STAGE__AGENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__CONDITIONS = NESTED_STAGE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__ENVIRONMENT_VARIABLES = NESTED_STAGE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__WHENS = NESTED_STAGE__WHENS;

	/**
	 * The feature id for the '<em><b>When Evaluation Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__WHEN_EVALUATION_TIME = NESTED_STAGE__WHEN_EVALUATION_TIME;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE__STAGES = NESTED_STAGE__STAGES;

	/**
	 * The number of structural features of the '<em>Parallel Nested Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE_FEATURE_COUNT = NESTED_STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Nested Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_NESTED_STAGE_OPERATION_COUNT = NESTED_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SequentialNestedStageImpl <em>Sequential Nested Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SequentialNestedStageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getSequentialNestedStage()
	 * @generated
	 */
	int SEQUENTIAL_NESTED_STAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__NAME = NESTED_STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__AGENT = NESTED_STAGE__AGENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__CONDITIONS = NESTED_STAGE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__ENVIRONMENT_VARIABLES = NESTED_STAGE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__WHENS = NESTED_STAGE__WHENS;

	/**
	 * The feature id for the '<em><b>When Evaluation Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__WHEN_EVALUATION_TIME = NESTED_STAGE__WHEN_EVALUATION_TIME;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE__STAGES = NESTED_STAGE__STAGES;

	/**
	 * The number of structural features of the '<em>Sequential Nested Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE_FEATURE_COUNT = NESTED_STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequential Nested Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_NESTED_STAGE_OPERATION_COUNT = NESTED_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixStageImpl <em>Matrix Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixStageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMatrixStage()
	 * @generated
	 */
	int MATRIX_STAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__NAME = SEQUENTIAL_NESTED_STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__AGENT = SEQUENTIAL_NESTED_STAGE__AGENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__CONDITIONS = SEQUENTIAL_NESTED_STAGE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__ENVIRONMENT_VARIABLES = SEQUENTIAL_NESTED_STAGE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__WHENS = SEQUENTIAL_NESTED_STAGE__WHENS;

	/**
	 * The feature id for the '<em><b>When Evaluation Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__WHEN_EVALUATION_TIME = SEQUENTIAL_NESTED_STAGE__WHEN_EVALUATION_TIME;

	/**
	 * The feature id for the '<em><b>Stages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__STAGES = SEQUENTIAL_NESTED_STAGE__STAGES;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__AXES = SEQUENTIAL_NESTED_STAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__INCLUDES = SEQUENTIAL_NESTED_STAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Excludes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__EXCLUDES = SEQUENTIAL_NESTED_STAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE__FAIL_FAST = SEQUENTIAL_NESTED_STAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Matrix Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE_FEATURE_COUNT = SEQUENTIAL_NESTED_STAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Matrix Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_STAGE_OPERATION_COUNT = SEQUENTIAL_NESTED_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixAxisImpl <em>Matrix Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixAxisImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMatrixAxis()
	 * @generated
	 */
	int MATRIX_AXIS = 7;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixCombinationImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMatrixCombination()
	 * @generated
	 */
	int MATRIX_COMBINATION = 8;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepStageImpl <em>Step Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepStageImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStepStage()
	 * @generated
	 */
	int STEP_STAGE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__NAME = ABSTRACT_STAGE__NAME;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__AGENT = ABSTRACT_STAGE__AGENT;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__CONDITIONS = ABSTRACT_STAGE__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__ENVIRONMENT_VARIABLES = ABSTRACT_STAGE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__WHENS = ABSTRACT_STAGE__WHENS;

	/**
	 * The feature id for the '<em><b>When Evaluation Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__WHEN_EVALUATION_TIME = ABSTRACT_STAGE__WHEN_EVALUATION_TIME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE__STEPS = ABSTRACT_STAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Step Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE_FEATURE_COUNT = ABSTRACT_STAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Step Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_STAGE_OPERATION_COUNT = ABSTRACT_STAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractStepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractStep()
	 * @generated
	 */
	int ABSTRACT_STEP = 10;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageChildStepImpl <em>Stage Child Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageChildStepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStageChildStep()
	 * @generated
	 */
	int STAGE_CHILD_STEP = 11;

	/**
	 * The number of structural features of the '<em>Stage Child Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_CHILD_STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stage Child Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_CHILD_STEP_OPERATION_COUNT = ABSTRACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalChildStepImpl <em>Conditional Child Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalChildStepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConditionalChildStep()
	 * @generated
	 */
	int CONDITIONAL_CHILD_STEP = 12;

	/**
	 * The number of structural features of the '<em>Conditional Child Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CHILD_STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conditional Child Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_CHILD_STEP_OPERATION_COUNT = ABSTRACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScriptedBlockImpl <em>Scripted Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScriptedBlockImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getScriptedBlock()
	 * @generated
	 */
	int SCRIPTED_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_BLOCK__STEPS = STAGE_CHILD_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scripted Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_BLOCK_FEATURE_COUNT = STAGE_CHILD_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scripted Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_BLOCK_OPERATION_COUNT = STAGE_CHILD_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 14;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMAND = STAGE_CHILD_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ARGUMENTS = STAGE_CHILD_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = STAGE_CHILD_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = STAGE_CHILD_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalStepImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConditionalStep()
	 * @generated
	 */
	int CONDITIONAL_STEP = 15;

	/**
	 * The feature id for the '<em><b>If Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__IF_CONDITION = CONDITIONAL_CHILD_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__THEN_RUN = CONDITIONAL_CHILD_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Run</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP__ELSE_RUN = CONDITIONAL_CHILD_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_FEATURE_COUNT = CONDITIONAL_CHILD_STEP_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STEP_OPERATION_COUNT = CONDITIONAL_CHILD_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl <em>Abstract Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AbstractAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAbstractAgent()
	 * @generated
	 */
	int ABSTRACT_AGENT = 16;

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
	int NONE_AGENT = 17;

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
	int ANY_AGENT = 18;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LabelAgentImpl <em>Label Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LabelAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLabelAgent()
	 * @generated
	 */
	int LABEL_AGENT = 19;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_AGENT__LABELS = ABSTRACT_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_AGENT_FEATURE_COUNT = ABSTRACT_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_AGENT_OPERATION_COUNT = ABSTRACT_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NodeAgentImpl <em>Node Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NodeAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNodeAgent()
	 * @generated
	 */
	int NODE_AGENT = 20;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AGENT__LABELS = LABEL_AGENT__LABELS;

	/**
	 * The feature id for the '<em><b>Custom Workspace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AGENT__CUSTOM_WORKSPACE = LABEL_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AGENT_FEATURE_COUNT = LABEL_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Node Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_AGENT_OPERATION_COUNT = LABEL_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerAgentImpl <em>Docker Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerAgentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDockerAgent()
	 * @generated
	 */
	int DOCKER_AGENT = 21;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AGENT__LABELS = LABEL_AGENT__LABELS;

	/**
	 * The feature id for the '<em><b>Docker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AGENT__DOCKER = LABEL_AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Docker Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AGENT_FEATURE_COUNT = LABEL_AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Docker Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_AGENT_OPERATION_COUNT = LABEL_AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl <em>Docker Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 22;

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
	int EXPRESSION = 23;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ValueImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 24;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 25;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StringLiteralImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 26;

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
	int INTEGER_LITERAL = 27;

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
	int DOUBLE_LITERAL = 28;

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
	int BOOLEAN_LITERAL = 29;

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
	int VARIABLE = 30;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsContextImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getJenkinsContext()
	 * @generated
	 */
	int JENKINS_CONTEXT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENKINS_CONTEXT__NAME = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENKINS_CONTEXT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JENKINS_CONTEXT_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableDereferenceImpl <em>Variable Dereference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableDereferenceImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getVariableDereference()
	 * @generated
	 */
	int VARIABLE_DEREFERENCE = 32;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.AssignmentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 33;

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
	int CONCAT = 34;

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
	int BINARY_OP = 35;

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
	int UNARY_OP = 36;

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
	int NEGATION = 37;

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
	int EQUALITY_OP = 38;

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
	int COMPARISON_OP = 39;

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
	int LOGICAL_OP = 40;

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
	int AND = 41;

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
	int OR = 42;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.TriggerImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 43;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScheduledTriggerImpl <em>Scheduled Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScheduledTriggerImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getScheduledTrigger()
	 * @generated
	 */
	int SCHEDULED_TRIGGER = 44;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PollingTriggerImpl <em>Polling Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PollingTriggerImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getPollingTrigger()
	 * @generated
	 */
	int POLLING_TRIGGER = 45;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER__CRON = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Polling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Polling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UpstreamTriggerImpl <em>Upstream Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UpstreamTriggerImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getUpstreamTrigger()
	 * @generated
	 */
	int UPSTREAM_TRIGGER = 46;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_TRIGGER__JOBS = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Upstream Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Upstream Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSTREAM_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ToolImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 47;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 48;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl <em>When Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenComparison()
	 * @generated
	 */
	int WHEN_COMPARISON = 49;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPARISON__PATTERN = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPARISON__COMPARATOR = WHEN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPARISON__CASE_SENSITIVE = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>When Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPARISON_FEATURE_COUNT = WHEN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>When Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_COMPARISON_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBranchImpl <em>When Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBranchImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenBranch()
	 * @generated
	 */
	int WHEN_BRANCH = 50;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BRANCH__PATTERN = WHEN_COMPARISON__PATTERN;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BRANCH__COMPARATOR = WHEN_COMPARISON__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BRANCH__CASE_SENSITIVE = WHEN_COMPARISON__CASE_SENSITIVE;

	/**
	 * The number of structural features of the '<em>When Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BRANCH_FEATURE_COUNT = WHEN_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BRANCH_OPERATION_COUNT = WHEN_COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangesetImpl <em>When Changeset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangesetImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenChangeset()
	 * @generated
	 */
	int WHEN_CHANGESET = 51;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGESET__PATTERN = WHEN_COMPARISON__PATTERN;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGESET__COMPARATOR = WHEN_COMPARISON__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGESET__CASE_SENSITIVE = WHEN_COMPARISON__CASE_SENSITIVE;

	/**
	 * The number of structural features of the '<em>When Changeset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGESET_FEATURE_COUNT = WHEN_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Changeset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGESET_OPERATION_COUNT = WHEN_COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTagImpl <em>When Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTagImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenTag()
	 * @generated
	 */
	int WHEN_TAG = 52;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TAG__PATTERN = WHEN_COMPARISON__PATTERN;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TAG__COMPARATOR = WHEN_COMPARISON__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TAG__CASE_SENSITIVE = WHEN_COMPARISON__CASE_SENSITIVE;

	/**
	 * The number of structural features of the '<em>When Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TAG_FEATURE_COUNT = WHEN_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TAG_OPERATION_COUNT = WHEN_COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangeRequestImpl <em>When Change Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangeRequestImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenChangeRequest()
	 * @generated
	 */
	int WHEN_CHANGE_REQUEST = 53;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGE_REQUEST__PATTERN = WHEN_COMPARISON__PATTERN;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGE_REQUEST__COMPARATOR = WHEN_COMPARISON__COMPARATOR;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGE_REQUEST__CASE_SENSITIVE = WHEN_COMPARISON__CASE_SENSITIVE;

	/**
	 * The feature id for the '<em><b>Matcher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGE_REQUEST__MATCHER = WHEN_COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>When Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGE_REQUEST_FEATURE_COUNT = WHEN_COMPARISON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>When Change Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGE_REQUEST_OPERATION_COUNT = WHEN_COMPARISON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBuildingTagImpl <em>When Building Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBuildingTagImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenBuildingTag()
	 * @generated
	 */
	int WHEN_BUILDING_TAG = 54;

	/**
	 * The number of structural features of the '<em>When Building Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BUILDING_TAG_FEATURE_COUNT = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Building Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_BUILDING_TAG_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangelogImpl <em>When Changelog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangelogImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenChangelog()
	 * @generated
	 */
	int WHEN_CHANGELOG = 55;

	/**
	 * The number of structural features of the '<em>When Changelog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGELOG_FEATURE_COUNT = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Changelog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_CHANGELOG_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEqualsImpl <em>When Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEqualsImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenEquals()
	 * @generated
	 */
	int WHEN_EQUALS = 56;

	/**
	 * The feature id for the '<em><b>Expected</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EQUALS__EXPECTED = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EQUALS__ACTUAL = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EQUALS_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>When Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EQUALS_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEnvironmentImpl <em>When Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEnvironmentImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenEnvironment()
	 * @generated
	 */
	int WHEN_ENVIRONMENT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENVIRONMENT__NAME = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENVIRONMENT__VALUE = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENVIRONMENT_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>When Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ENVIRONMENT_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenExpressionImpl <em>When Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenExpressionImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenExpression()
	 * @generated
	 */
	int WHEN_EXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EXPRESSION__EXPRESSION = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>When Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EXPRESSION_FEATURE_COUNT = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>When Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_EXPRESSION_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedWhenImpl <em>Nested When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedWhenImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNestedWhen()
	 * @generated
	 */
	int NESTED_WHEN = 59;

	/**
	 * The number of structural features of the '<em>Nested When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_WHEN_FEATURE_COUNT = WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nested When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_WHEN_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SingleNestedWhenImpl <em>Single Nested When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SingleNestedWhenImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getSingleNestedWhen()
	 * @generated
	 */
	int SINGLE_NESTED_WHEN = 60;

	/**
	 * The feature id for the '<em><b>Nested When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_NESTED_WHEN__NESTED_WHEN = NESTED_WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Nested When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_NESTED_WHEN_FEATURE_COUNT = NESTED_WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Nested When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_NESTED_WHEN_OPERATION_COUNT = NESTED_WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MultipleNestedWhenImpl <em>Multiple Nested When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MultipleNestedWhenImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMultipleNestedWhen()
	 * @generated
	 */
	int MULTIPLE_NESTED_WHEN = 61;

	/**
	 * The feature id for the '<em><b>Nested Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_NESTED_WHEN__NESTED_WHENS = NESTED_WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Nested When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_NESTED_WHEN_FEATURE_COUNT = NESTED_WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiple Nested When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_NESTED_WHEN_OPERATION_COUNT = NESTED_WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenNotImpl <em>When Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenNotImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenNot()
	 * @generated
	 */
	int WHEN_NOT = 62;

	/**
	 * The feature id for the '<em><b>Nested When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_NOT__NESTED_WHEN = SINGLE_NESTED_WHEN__NESTED_WHEN;

	/**
	 * The number of structural features of the '<em>When Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_NOT_FEATURE_COUNT = SINGLE_NESTED_WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_NOT_OPERATION_COUNT = SINGLE_NESTED_WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAnyOfImpl <em>When Any Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAnyOfImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenAnyOf()
	 * @generated
	 */
	int WHEN_ANY_OF = 63;

	/**
	 * The feature id for the '<em><b>Nested Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ANY_OF__NESTED_WHENS = MULTIPLE_NESTED_WHEN__NESTED_WHENS;

	/**
	 * The number of structural features of the '<em>When Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ANY_OF_FEATURE_COUNT = MULTIPLE_NESTED_WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When Any Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ANY_OF_OPERATION_COUNT = MULTIPLE_NESTED_WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAllOfImpl <em>When All Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAllOfImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenAllOf()
	 * @generated
	 */
	int WHEN_ALL_OF = 64;

	/**
	 * The feature id for the '<em><b>Nested Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ALL_OF__NESTED_WHENS = MULTIPLE_NESTED_WHEN__NESTED_WHENS;

	/**
	 * The number of structural features of the '<em>When All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ALL_OF_FEATURE_COUNT = MULTIPLE_NESTED_WHEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>When All Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_ALL_OF_OPERATION_COUNT = MULTIPLE_NESTED_WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTriggeredByImpl <em>When Triggered By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTriggeredByImpl
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenTriggeredBy()
	 * @generated
	 */
	int WHEN_TRIGGERED_BY = 65;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TRIGGERED_BY__CAUSE = WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TRIGGERED_BY__DETAIL = WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>When Triggered By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TRIGGERED_BY_FEATURE_COUNT = WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>When Triggered By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_TRIGGERED_BY_OPERATION_COUNT = WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.EQUALITY_OPS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getEQUALITY_OPS()
	 * @generated
	 */
	int EQUALITY_OPS = 66;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS <em>COMPARISON OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARISON_OPS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCOMPARISON_OPS()
	 * @generated
	 */
	int COMPARISON_OPS = 67;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS <em>SUPPORTED TOOLS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getSUPPORTED_TOOLS()
	 * @generated
	 */
	int SUPPORTED_TOOLS = 68;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS <em>COMPARATORS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCOMPARATORS()
	 * @generated
	 */
	int COMPARATORS = 69;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER <em>CHANGE REQUEST MATCHER</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCHANGE_REQUEST_MATCHER()
	 * @generated
	 */
	int CHANGE_REQUEST_MATCHER = 70;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES <em>WHEN EVALUATION TIMES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWHEN_EVALUATION_TIMES()
	 * @generated
	 */
	int WHEN_EVALUATION_TIMES = 71;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS <em>JENKINS CONTEXTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getJENKINS_CONTEXTS()
	 * @generated
	 */
	int JENKINS_CONTEXTS = 72;

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
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getTriggers()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Pipeline#getTools()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Tools();

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
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getName()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EAttribute getAbstractStage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getAgent()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EReference getAbstractStage_Agent();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getConditions()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EReference getAbstractStage_Conditions();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Environment Variables</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getEnvironmentVariables()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EReference getAbstractStage_EnvironmentVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getWhens <em>Whens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Whens</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getWhens()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EReference getAbstractStage_Whens();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getWhenEvaluationTime <em>When Evaluation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>When Evaluation Time</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStage#getWhenEvaluationTime()
	 * @see #getAbstractStage()
	 * @generated
	 */
	EAttribute getAbstractStage_WhenEvaluationTime();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage <em>Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage
	 * @generated
	 */
	EClass getNestedStage();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage#getStages <em>Stages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stages</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedStage#getStages()
	 * @see #getNestedStage()
	 * @generated
	 */
	EReference getNestedStage_Stages();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ParallelNestedStage <em>Parallel Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Nested Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ParallelNestedStage
	 * @generated
	 */
	EClass getParallelNestedStage();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SequentialNestedStage <em>Sequential Nested Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Nested Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SequentialNestedStage
	 * @generated
	 */
	EClass getSequentialNestedStage();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage <em>Matrix Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage
	 * @generated
	 */
	EClass getMatrixStage();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axes</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getAxes()
	 * @see #getMatrixStage()
	 * @generated
	 */
	EReference getMatrixStage_Axes();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getIncludes()
	 * @see #getMatrixStage()
	 * @generated
	 */
	EReference getMatrixStage_Includes();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getExcludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Excludes</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getExcludes()
	 * @see #getMatrixStage()
	 * @generated
	 */
	EReference getMatrixStage_Excludes();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getFailFast <em>Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Fast</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixStage#getFailFast()
	 * @see #getMatrixStage()
	 * @generated
	 */
	EAttribute getMatrixStage_FailFast();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis <em>Matrix Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Axis</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis
	 * @generated
	 */
	EClass getMatrixAxis();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis#getName()
	 * @see #getMatrixAxis()
	 * @generated
	 */
	EAttribute getMatrixAxis_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixAxis#getCells()
	 * @see #getMatrixAxis()
	 * @generated
	 */
	EReference getMatrixAxis_Cells();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixCombination <em>Matrix Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix Combination</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixCombination
	 * @generated
	 */
	EClass getMatrixCombination();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixCombination#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Entries</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MatrixCombination#getEntries()
	 * @see #getMatrixCombination()
	 * @generated
	 */
	EReference getMatrixCombination_Entries();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage <em>Step Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Stage</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage
	 * @generated
	 */
	EClass getStepStage();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StepStage#getSteps()
	 * @see #getStepStage()
	 * @generated
	 */
	EReference getStepStage_Steps();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StageChildStep <em>Stage Child Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage Child Step</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.StageChildStep
	 * @generated
	 */
	EClass getStageChildStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep <em>Conditional Child Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Child Step</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ConditionalChildStep
	 * @generated
	 */
	EClass getConditionalChildStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock <em>Scripted Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Block</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock
	 * @generated
	 */
	EClass getScriptedBlock();

	/**
	 * Returns the meta object for the reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Steps</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScriptedBlock#getSteps()
	 * @see #getScriptedBlock()
	 * @generated
	 */
	EReference getScriptedBlock_Steps();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent <em>Label Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent
	 * @generated
	 */
	EClass getLabelAgent();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labels</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.LabelAgent#getLabels()
	 * @see #getLabelAgent()
	 * @generated
	 */
	EReference getLabelAgent_Labels();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent <em>Node Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent
	 * @generated
	 */
	EClass getNodeAgent();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent#getCustomWorkspace <em>Custom Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Workspace</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent#getCustomWorkspace()
	 * @see #getNodeAgent()
	 * @generated
	 */
	EAttribute getNodeAgent_CustomWorkspace();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent <em>Docker Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Agent</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent
	 * @generated
	 */
	EClass getDockerAgent();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent#getDocker <em>Docker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Docker</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerAgent#getDocker()
	 * @see #getDockerAgent()
	 * @generated
	 */
	EReference getDockerAgent_Docker();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Value
	 * @generated
	 */
	EClass getValue();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext
	 * @generated
	 */
	EClass getJenkinsContext();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsContext#getName()
	 * @see #getJenkinsContext()
	 * @generated
	 */
	EAttribute getJenkinsContext_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference <em>Variable Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Dereference</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference
	 * @generated
	 */
	EClass getVariableDereference();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference#getVariable()
	 * @see #getVariableDereference()
	 * @generated
	 */
	EReference getVariableDereference_Variable();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.VariableDereference#getProperty()
	 * @see #getVariableDereference()
	 * @generated
	 */
	EAttribute getVariableDereference_Property();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger <em>Scheduled Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduled Trigger</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger
	 * @generated
	 */
	EClass getScheduledTrigger();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.ScheduledTrigger#getCron()
	 * @see #getScheduledTrigger()
	 * @generated
	 */
	EAttribute getScheduledTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger <em>Polling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polling Trigger</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger
	 * @generated
	 */
	EClass getPollingTrigger();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger#getCron()
	 * @see #getPollingTrigger()
	 * @generated
	 */
	EAttribute getPollingTrigger_Cron();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger <em>Upstream Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upstream Trigger</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger
	 * @generated
	 */
	EClass getUpstreamTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jobs</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger#getJobs()
	 * @see #getUpstreamTrigger()
	 * @generated
	 */
	EAttribute getUpstreamTrigger_Jobs();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getTool()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Tool();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getVersion()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Version();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison <em>When Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Comparison</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison
	 * @generated
	 */
	EClass getWhenComparison();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getPattern()
	 * @see #getWhenComparison()
	 * @generated
	 */
	EAttribute getWhenComparison_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getComparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getComparator()
	 * @see #getWhenComparison()
	 * @generated
	 */
	EAttribute getWhenComparison_Comparator();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison#getCaseSensitive()
	 * @see #getWhenComparison()
	 * @generated
	 */
	EAttribute getWhenComparison_CaseSensitive();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBranch <em>When Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Branch</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBranch
	 * @generated
	 */
	EClass getWhenBranch();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeset <em>When Changeset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Changeset</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeset
	 * @generated
	 */
	EClass getWhenChangeset();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTag <em>When Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Tag</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTag
	 * @generated
	 */
	EClass getWhenTag();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest <em>When Change Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Change Request</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest
	 * @generated
	 */
	EClass getWhenChangeRequest();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest#getMatcher <em>Matcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matcher</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangeRequest#getMatcher()
	 * @see #getWhenChangeRequest()
	 * @generated
	 */
	EAttribute getWhenChangeRequest_Matcher();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBuildingTag <em>When Building Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Building Tag</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenBuildingTag
	 * @generated
	 */
	EClass getWhenBuildingTag();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangelog <em>When Changelog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Changelog</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenChangelog
	 * @generated
	 */
	EClass getWhenChangelog();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals <em>When Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Equals</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals
	 * @generated
	 */
	EClass getWhenEquals();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getExpected <em>Expected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expected</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getExpected()
	 * @see #getWhenEquals()
	 * @generated
	 */
	EReference getWhenEquals_Expected();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getActual()
	 * @see #getWhenEquals()
	 * @generated
	 */
	EReference getWhenEquals_Actual();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment <em>When Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Environment</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment
	 * @generated
	 */
	EClass getWhenEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment#getName()
	 * @see #getWhenEnvironment()
	 * @generated
	 */
	EAttribute getWhenEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEnvironment#getValue()
	 * @see #getWhenEnvironment()
	 * @generated
	 */
	EAttribute getWhenEnvironment_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression <em>When Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Expression</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression
	 * @generated
	 */
	EClass getWhenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenExpression#getExpression()
	 * @see #getWhenExpression()
	 * @generated
	 */
	EReference getWhenExpression_Expression();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedWhen <em>Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested When</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NestedWhen
	 * @generated
	 */
	EClass getNestedWhen();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen <em>Single Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Nested When</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen
	 * @generated
	 */
	EClass getSingleNestedWhen();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen#getNestedWhen <em>Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested When</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen#getNestedWhen()
	 * @see #getSingleNestedWhen()
	 * @generated
	 */
	EReference getSingleNestedWhen_NestedWhen();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen <em>Multiple Nested When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Nested When</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen
	 * @generated
	 */
	EClass getMultipleNestedWhen();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen#getNestedWhens <em>Nested Whens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Whens</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen#getNestedWhens()
	 * @see #getMultipleNestedWhen()
	 * @generated
	 */
	EReference getMultipleNestedWhen_NestedWhens();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenNot <em>When Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Not</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenNot
	 * @generated
	 */
	EClass getWhenNot();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAnyOf <em>When Any Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Any Of</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAnyOf
	 * @generated
	 */
	EClass getWhenAnyOf();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAllOf <em>When All Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When All Of</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenAllOf
	 * @generated
	 */
	EClass getWhenAllOf();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy <em>When Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When Triggered By</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy
	 * @generated
	 */
	EClass getWhenTriggeredBy();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cause</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getCause()
	 * @see #getWhenTriggeredBy()
	 * @generated
	 */
	EAttribute getWhenTriggeredBy_Cause();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detail</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getDetail()
	 * @see #getWhenTriggeredBy()
	 * @generated
	 */
	EAttribute getWhenTriggeredBy_Detail();

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
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS <em>SUPPORTED TOOLS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SUPPORTED TOOLS</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS
	 * @generated
	 */
	EEnum getSUPPORTED_TOOLS();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS <em>COMPARATORS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>COMPARATORS</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS
	 * @generated
	 */
	EEnum getCOMPARATORS();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER <em>CHANGE REQUEST MATCHER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CHANGE REQUEST MATCHER</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER
	 * @generated
	 */
	EEnum getCHANGE_REQUEST_MATCHER();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES <em>WHEN EVALUATION TIMES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WHEN EVALUATION TIMES</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES
	 * @generated
	 */
	EEnum getWHEN_EVALUATION_TIMES();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS <em>JENKINS CONTEXTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JENKINS CONTEXTS</em>'.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS
	 * @generated
	 */
	EEnum getJENKINS_CONTEXTS();

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
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TRIGGERS = eINSTANCE.getPipeline_Triggers();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__TOOLS = eINSTANCE.getPipeline_Tools();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STAGE__NAME = eINSTANCE.getAbstractStage_Name();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STAGE__AGENT = eINSTANCE.getAbstractStage_Agent();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STAGE__CONDITIONS = eINSTANCE.getAbstractStage_Conditions();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STAGE__ENVIRONMENT_VARIABLES = eINSTANCE.getAbstractStage_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Whens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STAGE__WHENS = eINSTANCE.getAbstractStage_Whens();

		/**
		 * The meta object literal for the '<em><b>When Evaluation Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STAGE__WHEN_EVALUATION_TIME = eINSTANCE.getAbstractStage_WhenEvaluationTime();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedStageImpl <em>Nested Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedStageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNestedStage()
		 * @generated
		 */
		EClass NESTED_STAGE = eINSTANCE.getNestedStage();

		/**
		 * The meta object literal for the '<em><b>Stages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_STAGE__STAGES = eINSTANCE.getNestedStage_Stages();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelNestedStageImpl <em>Parallel Nested Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ParallelNestedStageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getParallelNestedStage()
		 * @generated
		 */
		EClass PARALLEL_NESTED_STAGE = eINSTANCE.getParallelNestedStage();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SequentialNestedStageImpl <em>Sequential Nested Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SequentialNestedStageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getSequentialNestedStage()
		 * @generated
		 */
		EClass SEQUENTIAL_NESTED_STAGE = eINSTANCE.getSequentialNestedStage();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixStageImpl <em>Matrix Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixStageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMatrixStage()
		 * @generated
		 */
		EClass MATRIX_STAGE = eINSTANCE.getMatrixStage();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_STAGE__AXES = eINSTANCE.getMatrixStage_Axes();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_STAGE__INCLUDES = eINSTANCE.getMatrixStage_Includes();

		/**
		 * The meta object literal for the '<em><b>Excludes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX_STAGE__EXCLUDES = eINSTANCE.getMatrixStage_Excludes();

		/**
		 * The meta object literal for the '<em><b>Fail Fast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX_STAGE__FAIL_FAST = eINSTANCE.getMatrixStage_FailFast();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixAxisImpl <em>Matrix Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixAxisImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMatrixAxis()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixCombinationImpl <em>Matrix Combination</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MatrixCombinationImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMatrixCombination()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepStageImpl <em>Step Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StepStageImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStepStage()
		 * @generated
		 */
		EClass STEP_STAGE = eINSTANCE.getStepStage();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_STAGE__STEPS = eINSTANCE.getStepStage_Steps();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageChildStepImpl <em>Stage Child Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.StageChildStepImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getStageChildStep()
		 * @generated
		 */
		EClass STAGE_CHILD_STEP = eINSTANCE.getStageChildStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalChildStepImpl <em>Conditional Child Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ConditionalChildStepImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getConditionalChildStep()
		 * @generated
		 */
		EClass CONDITIONAL_CHILD_STEP = eINSTANCE.getConditionalChildStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScriptedBlockImpl <em>Scripted Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScriptedBlockImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getScriptedBlock()
		 * @generated
		 */
		EClass SCRIPTED_BLOCK = eINSTANCE.getScriptedBlock();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTED_BLOCK__STEPS = eINSTANCE.getScriptedBlock_Steps();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LabelAgentImpl <em>Label Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.LabelAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getLabelAgent()
		 * @generated
		 */
		EClass LABEL_AGENT = eINSTANCE.getLabelAgent();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_AGENT__LABELS = eINSTANCE.getLabelAgent_Labels();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NodeAgentImpl <em>Node Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NodeAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNodeAgent()
		 * @generated
		 */
		EClass NODE_AGENT = eINSTANCE.getNodeAgent();

		/**
		 * The meta object literal for the '<em><b>Custom Workspace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_AGENT__CUSTOM_WORKSPACE = eINSTANCE.getNodeAgent_CustomWorkspace();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerAgentImpl <em>Docker Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerAgentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getDockerAgent()
		 * @generated
		 */
		EClass DOCKER_AGENT = eINSTANCE.getDockerAgent();

		/**
		 * The meta object literal for the '<em><b>Docker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_AGENT__DOCKER = eINSTANCE.getDockerAgent_Docker();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ValueImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsContextImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getJenkinsContext()
		 * @generated
		 */
		EClass JENKINS_CONTEXT = eINSTANCE.getJenkinsContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JENKINS_CONTEXT__NAME = eINSTANCE.getJenkinsContext_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableDereferenceImpl <em>Variable Dereference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.VariableDereferenceImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getVariableDereference()
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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.TriggerImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScheduledTriggerImpl <em>Scheduled Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ScheduledTriggerImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getScheduledTrigger()
		 * @generated
		 */
		EClass SCHEDULED_TRIGGER = eINSTANCE.getScheduledTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULED_TRIGGER__CRON = eINSTANCE.getScheduledTrigger_Cron();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PollingTriggerImpl <em>Polling Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.PollingTriggerImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getPollingTrigger()
		 * @generated
		 */
		EClass POLLING_TRIGGER = eINSTANCE.getPollingTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_TRIGGER__CRON = eINSTANCE.getPollingTrigger_Cron();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UpstreamTriggerImpl <em>Upstream Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.UpstreamTriggerImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getUpstreamTrigger()
		 * @generated
		 */
		EClass UPSTREAM_TRIGGER = eINSTANCE.getUpstreamTrigger();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSTREAM_TRIGGER__JOBS = eINSTANCE.getUpstreamTrigger_Jobs();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.ToolImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__TOOL = eINSTANCE.getTool_Tool();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__VERSION = eINSTANCE.getTool_Version();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl <em>When Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenComparison()
		 * @generated
		 */
		EClass WHEN_COMPARISON = eINSTANCE.getWhenComparison();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_COMPARISON__PATTERN = eINSTANCE.getWhenComparison_Pattern();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_COMPARISON__COMPARATOR = eINSTANCE.getWhenComparison_Comparator();

		/**
		 * The meta object literal for the '<em><b>Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_COMPARISON__CASE_SENSITIVE = eINSTANCE.getWhenComparison_CaseSensitive();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBranchImpl <em>When Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBranchImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenBranch()
		 * @generated
		 */
		EClass WHEN_BRANCH = eINSTANCE.getWhenBranch();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangesetImpl <em>When Changeset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangesetImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenChangeset()
		 * @generated
		 */
		EClass WHEN_CHANGESET = eINSTANCE.getWhenChangeset();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTagImpl <em>When Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTagImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenTag()
		 * @generated
		 */
		EClass WHEN_TAG = eINSTANCE.getWhenTag();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangeRequestImpl <em>When Change Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangeRequestImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenChangeRequest()
		 * @generated
		 */
		EClass WHEN_CHANGE_REQUEST = eINSTANCE.getWhenChangeRequest();

		/**
		 * The meta object literal for the '<em><b>Matcher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_CHANGE_REQUEST__MATCHER = eINSTANCE.getWhenChangeRequest_Matcher();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBuildingTagImpl <em>When Building Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenBuildingTagImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenBuildingTag()
		 * @generated
		 */
		EClass WHEN_BUILDING_TAG = eINSTANCE.getWhenBuildingTag();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangelogImpl <em>When Changelog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenChangelogImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenChangelog()
		 * @generated
		 */
		EClass WHEN_CHANGELOG = eINSTANCE.getWhenChangelog();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEqualsImpl <em>When Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEqualsImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenEquals()
		 * @generated
		 */
		EClass WHEN_EQUALS = eINSTANCE.getWhenEquals();

		/**
		 * The meta object literal for the '<em><b>Expected</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_EQUALS__EXPECTED = eINSTANCE.getWhenEquals_Expected();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_EQUALS__ACTUAL = eINSTANCE.getWhenEquals_Actual();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEnvironmentImpl <em>When Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenEnvironmentImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenEnvironment()
		 * @generated
		 */
		EClass WHEN_ENVIRONMENT = eINSTANCE.getWhenEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_ENVIRONMENT__NAME = eINSTANCE.getWhenEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_ENVIRONMENT__VALUE = eINSTANCE.getWhenEnvironment_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenExpressionImpl <em>When Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenExpressionImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenExpression()
		 * @generated
		 */
		EClass WHEN_EXPRESSION = eINSTANCE.getWhenExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHEN_EXPRESSION__EXPRESSION = eINSTANCE.getWhenExpression_Expression();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedWhenImpl <em>Nested When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NestedWhenImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getNestedWhen()
		 * @generated
		 */
		EClass NESTED_WHEN = eINSTANCE.getNestedWhen();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SingleNestedWhenImpl <em>Single Nested When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SingleNestedWhenImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getSingleNestedWhen()
		 * @generated
		 */
		EClass SINGLE_NESTED_WHEN = eINSTANCE.getSingleNestedWhen();

		/**
		 * The meta object literal for the '<em><b>Nested When</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_NESTED_WHEN__NESTED_WHEN = eINSTANCE.getSingleNestedWhen_NestedWhen();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MultipleNestedWhenImpl <em>Multiple Nested When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MultipleNestedWhenImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getMultipleNestedWhen()
		 * @generated
		 */
		EClass MULTIPLE_NESTED_WHEN = eINSTANCE.getMultipleNestedWhen();

		/**
		 * The meta object literal for the '<em><b>Nested Whens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_NESTED_WHEN__NESTED_WHENS = eINSTANCE.getMultipleNestedWhen_NestedWhens();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenNotImpl <em>When Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenNotImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenNot()
		 * @generated
		 */
		EClass WHEN_NOT = eINSTANCE.getWhenNot();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAnyOfImpl <em>When Any Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAnyOfImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenAnyOf()
		 * @generated
		 */
		EClass WHEN_ANY_OF = eINSTANCE.getWhenAnyOf();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAllOfImpl <em>When All Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenAllOfImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenAllOf()
		 * @generated
		 */
		EClass WHEN_ALL_OF = eINSTANCE.getWhenAllOf();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTriggeredByImpl <em>When Triggered By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenTriggeredByImpl
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWhenTriggeredBy()
		 * @generated
		 */
		EClass WHEN_TRIGGERED_BY = eINSTANCE.getWhenTriggeredBy();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_TRIGGERED_BY__CAUSE = eINSTANCE.getWhenTriggeredBy_Cause();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN_TRIGGERED_BY__DETAIL = eINSTANCE.getWhenTriggeredBy_Detail();

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

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS <em>SUPPORTED TOOLS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getSUPPORTED_TOOLS()
		 * @generated
		 */
		EEnum SUPPORTED_TOOLS = eINSTANCE.getSUPPORTED_TOOLS();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS <em>COMPARATORS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCOMPARATORS()
		 * @generated
		 */
		EEnum COMPARATORS = eINSTANCE.getCOMPARATORS();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER <em>CHANGE REQUEST MATCHER</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.CHANGE_REQUEST_MATCHER
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getCHANGE_REQUEST_MATCHER()
		 * @generated
		 */
		EEnum CHANGE_REQUEST_MATCHER = eINSTANCE.getCHANGE_REQUEST_MATCHER();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES <em>WHEN EVALUATION TIMES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WHEN_EVALUATION_TIMES
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getWHEN_EVALUATION_TIMES()
		 * @generated
		 */
		EEnum WHEN_EVALUATION_TIMES = eINSTANCE.getWHEN_EVALUATION_TIMES();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS <em>JENKINS CONTEXTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JENKINS_CONTEXTS
		 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsPackageImpl#getJENKINS_CONTEXTS()
		 * @generated
		 */
		EEnum JENKINS_CONTEXTS = eINSTANCE.getJENKINS_CONTEXTS();

	}

} //JenkinsPackage
