/**
 */
package devops2;

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
 * @see devops2.Devops2Factory
 * @model kind="package"
 * @generated
 */
public interface Devops2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "devops2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/devops2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "devops2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Devops2Package eINSTANCE = devops2.impl.Devops2PackageImpl.init();

	/**
	 * The meta object id for the '{@link devops2.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.PipelineImpl
	 * @see devops2.impl.Devops2PackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>When</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WHEN = 0;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOB = 1;

	/**
	 * The feature id for the '<em><b>Name0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME0 = 2;

	/**
	 * The feature id for the '<em><b>Pipeline tool framework</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_TOOL_FRAMEWORK = 3;

	/**
	 * The feature id for the '<em><b>Pipeline envirnonment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_ENVIRNONMENT = 4;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PERMISSION = 5;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PARALLEL = 6;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link devops2.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.JobImpl
	 * @see devops2.impl.Devops2PackageImpl#getJob()
	 * @generated
	 */
	int JOB = 1;

	/**
	 * The feature id for the '<em><b>Name1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME1 = 0;

	/**
	 * The feature id for the '<em><b>Tool framework job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TOOL_FRAMEWORK_JOB = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__COMMAND = 3;

	/**
	 * The feature id for the '<em><b>Ifthenelse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IFTHENELSE = 4;

	/**
	 * The feature id for the '<em><b>Allow faillure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ALLOW_FAILLURE = 5;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__INPUT = 6;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 7;

	/**
	 * The feature id for the '<em><b>Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DESCRIPTION1 = 8;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PERMISSION = 9;

	/**
	 * The feature id for the '<em><b>Pipeline envirnonment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PIPELINE_ENVIRNONMENT = 10;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link devops2.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.CommandImpl
	 * @see devops2.impl.Devops2PackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 2;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TOOL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devops2.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.EnvironmentImpl
	 * @see devops2.impl.Devops2PackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 3;

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
	 * The meta object id for the '{@link devops2.impl.WhenImpl <em>When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.WhenImpl
	 * @see devops2.impl.Devops2PackageImpl#getWhen()
	 * @generated
	 */
	int WHEN = 4;

	/**
	 * The feature id for the '<em><b>Name4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__NAME4 = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN__TIMER = 2;

	/**
	 * The number of structural features of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devops2.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.ArtifactImpl
	 * @see devops2.impl.Devops2PackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 5;

	/**
	 * The feature id for the '<em><b>Name3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME3 = 0;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devops2.impl.Tool_frameworkImpl <em>Tool framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.Tool_frameworkImpl
	 * @see devops2.impl.Devops2PackageImpl#getTool_framework()
	 * @generated
	 */
	int TOOL_FRAMEWORK = 6;

	/**
	 * The feature id for the '<em><b>Name5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK__NAME5 = 0;

	/**
	 * The number of structural features of the '<em>Tool framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tool framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devops2.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.IfThenElseImpl
	 * @see devops2.impl.Devops2PackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__IF = 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ELSE = 2;

	/**
	 * The feature id for the '<em><b>Ifelse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__IFELSE = 3;

	/**
	 * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ELSEIF = 4;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link devops2.impl.ParametersImpl <em>Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.ParametersImpl
	 * @see devops2.impl.Devops2PackageImpl#getParameters()
	 * @generated
	 */
	int PARAMETERS = 8;

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
	 * The meta object id for the '{@link devops2.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.PermissionImpl
	 * @see devops2.impl.Devops2PackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 9;

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
	 * The meta object id for the '{@link devops2.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see devops2.impl.ParallelImpl
	 * @see devops2.impl.Devops2PackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 10;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__JOB = 0;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link devops2.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see devops2.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Pipeline#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see devops2.Pipeline#getJob()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Job();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Pipeline#getName0 <em>Name0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name0</em>'.
	 * @see devops2.Pipeline#getName0()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name0();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Pipeline#getPipeline_tool_framework <em>Pipeline tool framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipeline tool framework</em>'.
	 * @see devops2.Pipeline#getPipeline_tool_framework()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Pipeline_tool_framework();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Pipeline#getPipeline_envirnonment <em>Pipeline envirnonment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipeline envirnonment</em>'.
	 * @see devops2.Pipeline#getPipeline_envirnonment()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Pipeline_envirnonment();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Pipeline#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permission</em>'.
	 * @see devops2.Pipeline#getPermission()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Permission();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Pipeline#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parallel</em>'.
	 * @see devops2.Pipeline#getParallel()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Pipeline#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>When</em>'.
	 * @see devops2.Pipeline#getWhen()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_When();

	/**
	 * Returns the meta object for class '{@link devops2.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see devops2.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Job#getName1 <em>Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name1</em>'.
	 * @see devops2.Job#getName1()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name1();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getTool_framework_job <em>Tool framework job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool framework job</em>'.
	 * @see devops2.Job#getTool_framework_job()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Tool_framework_job();

	/**
	 * Returns the meta object for the reference list '{@link devops2.Job#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see devops2.Job#getOutput()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see devops2.Job#getCommand()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getIfthenelse <em>Ifthenelse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifthenelse</em>'.
	 * @see devops2.Job#getIfthenelse()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Ifthenelse();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Job#isAllow_faillure <em>Allow faillure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow faillure</em>'.
	 * @see devops2.Job#isAllow_faillure()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Allow_faillure();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see devops2.Job#getInput()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see devops2.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Job#getDescription1 <em>Description1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description1</em>'.
	 * @see devops2.Job#getDescription1()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Description1();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permission</em>'.
	 * @see devops2.Job#getPermission()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Permission();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Job#getPipeline_envirnonment <em>Pipeline envirnonment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipeline envirnonment</em>'.
	 * @see devops2.Job#getPipeline_envirnonment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Pipeline_envirnonment();

	/**
	 * Returns the meta object for class '{@link devops2.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see devops2.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Command#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see devops2.Command#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Parameters();

	/**
	 * Returns the meta object for class '{@link devops2.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see devops2.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Environment#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see devops2.Environment#getKey()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Key();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Environment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see devops2.Environment#getValue()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Value();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Command#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see devops2.Command#getDescription()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Description();

	/**
	 * Returns the meta object for the containment reference '{@link devops2.Command#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tool</em>'.
	 * @see devops2.Command#getTool()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Tool();

	/**
	 * Returns the meta object for class '{@link devops2.When <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>When</em>'.
	 * @see devops2.When
	 * @generated
	 */
	EClass getWhen();

	/**
	 * Returns the meta object for the attribute '{@link devops2.When#getName4 <em>Name4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name4</em>'.
	 * @see devops2.When#getName4()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Name4();

	/**
	 * Returns the meta object for the attribute '{@link devops2.When#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see devops2.When#getTimer()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Timer();

	/**
	 * Returns the meta object for the attribute '{@link devops2.When#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see devops2.When#getTrigger()
	 * @see #getWhen()
	 * @generated
	 */
	EAttribute getWhen_Trigger();

	/**
	 * Returns the meta object for class '{@link devops2.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see devops2.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Artifact#getName3 <em>Name3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name3</em>'.
	 * @see devops2.Artifact#getName3()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Name3();

	/**
	 * Returns the meta object for class '{@link devops2.Tool_framework <em>Tool framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool framework</em>'.
	 * @see devops2.Tool_framework
	 * @generated
	 */
	EClass getTool_framework();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Tool_framework#getName5 <em>Name5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name5</em>'.
	 * @see devops2.Tool_framework#getName5()
	 * @see #getTool_framework()
	 * @generated
	 */
	EAttribute getTool_framework_Name5();

	/**
	 * Returns the meta object for class '{@link devops2.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see devops2.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the attribute '{@link devops2.IfThenElse#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see devops2.IfThenElse#getCondition()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EAttribute getIfThenElse_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.IfThenElse#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see devops2.IfThenElse#getIf()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_If();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.IfThenElse#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see devops2.IfThenElse#getElse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.IfThenElse#getIfelse <em>Ifelse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifelse</em>'.
	 * @see devops2.IfThenElse#getIfelse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Ifelse();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.IfThenElse#getElseif <em>Elseif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elseif</em>'.
	 * @see devops2.IfThenElse#getElseif()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Elseif();

	/**
	 * Returns the meta object for class '{@link devops2.Parameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameters</em>'.
	 * @see devops2.Parameters
	 * @generated
	 */
	EClass getParameters();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Parameters#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see devops2.Parameters#getParameter()
	 * @see #getParameters()
	 * @generated
	 */
	EAttribute getParameters_Parameter();

	/**
	 * Returns the meta object for class '{@link devops2.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see devops2.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Permission#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see devops2.Permission#getKey()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Key();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Permission#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see devops2.Permission#getValue()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Value();

	/**
	 * Returns the meta object for class '{@link devops2.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see devops2.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the containment reference list '{@link devops2.Parallel#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see devops2.Parallel#getJob()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_Job();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Devops2Factory getDevops2Factory();

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
		 * The meta object literal for the '{@link devops2.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.PipelineImpl
		 * @see devops2.impl.Devops2PackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();
		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOB = eINSTANCE.getPipeline_Job();
		/**
		 * The meta object literal for the '<em><b>Name0</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME0 = eINSTANCE.getPipeline_Name0();
		/**
		 * The meta object literal for the '<em><b>Pipeline tool framework</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PIPELINE_TOOL_FRAMEWORK = eINSTANCE.getPipeline_Pipeline_tool_framework();
		/**
		 * The meta object literal for the '<em><b>Pipeline envirnonment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PIPELINE_ENVIRNONMENT = eINSTANCE.getPipeline_Pipeline_envirnonment();
		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PERMISSION = eINSTANCE.getPipeline_Permission();
		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PARALLEL = eINSTANCE.getPipeline_Parallel();
		/**
		 * The meta object literal for the '<em><b>When</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__WHEN = eINSTANCE.getPipeline_When();
		/**
		 * The meta object literal for the '{@link devops2.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.JobImpl
		 * @see devops2.impl.Devops2PackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();
		/**
		 * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME1 = eINSTANCE.getJob_Name1();
		/**
		 * The meta object literal for the '<em><b>Tool framework job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__TOOL_FRAMEWORK_JOB = eINSTANCE.getJob_Tool_framework_job();
		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__OUTPUT = eINSTANCE.getJob_Output();
		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__COMMAND = eINSTANCE.getJob_Command();
		/**
		 * The meta object literal for the '<em><b>Ifthenelse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__IFTHENELSE = eINSTANCE.getJob_Ifthenelse();
		/**
		 * The meta object literal for the '<em><b>Allow faillure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ALLOW_FAILLURE = eINSTANCE.getJob_Allow_faillure();
		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__INPUT = eINSTANCE.getJob_Input();
		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();
		/**
		 * The meta object literal for the '<em><b>Description1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DESCRIPTION1 = eINSTANCE.getJob_Description1();
		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PERMISSION = eINSTANCE.getJob_Permission();
		/**
		 * The meta object literal for the '<em><b>Pipeline envirnonment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PIPELINE_ENVIRNONMENT = eINSTANCE.getJob_Pipeline_envirnonment();
		/**
		 * The meta object literal for the '{@link devops2.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.CommandImpl
		 * @see devops2.impl.Devops2PackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();
		/**
		 * The meta object literal for the '{@link devops2.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.EnvironmentImpl
		 * @see devops2.impl.Devops2PackageImpl#getEnvironment()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DESCRIPTION = eINSTANCE.getCommand_Description();
		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__TOOL = eINSTANCE.getCommand_Tool();
		/**
		 * The meta object literal for the '{@link devops2.impl.WhenImpl <em>When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.WhenImpl
		 * @see devops2.impl.Devops2PackageImpl#getWhen()
		 * @generated
		 */
		EClass WHEN = eINSTANCE.getWhen();
		/**
		 * The meta object literal for the '<em><b>Name4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__NAME4 = eINSTANCE.getWhen_Name4();
		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__TIMER = eINSTANCE.getWhen_Timer();
		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHEN__TRIGGER = eINSTANCE.getWhen_Trigger();
		/**
		 * The meta object literal for the '{@link devops2.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.ArtifactImpl
		 * @see devops2.impl.Devops2PackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();
		/**
		 * The meta object literal for the '<em><b>Name3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__NAME3 = eINSTANCE.getArtifact_Name3();
		/**
		 * The meta object literal for the '{@link devops2.impl.Tool_frameworkImpl <em>Tool framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.Tool_frameworkImpl
		 * @see devops2.impl.Devops2PackageImpl#getTool_framework()
		 * @generated
		 */
		EClass TOOL_FRAMEWORK = eINSTANCE.getTool_framework();
		/**
		 * The meta object literal for the '<em><b>Name5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL_FRAMEWORK__NAME5 = eINSTANCE.getTool_framework_Name5();
		/**
		 * The meta object literal for the '{@link devops2.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.IfThenElseImpl
		 * @see devops2.impl.Devops2PackageImpl#getIfThenElse()
		 * @generated
		 */
		EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();
		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();
		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__IF = eINSTANCE.getIfThenElse_If();
		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__ELSE = eINSTANCE.getIfThenElse_Else();
		/**
		 * The meta object literal for the '<em><b>Ifelse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__IFELSE = eINSTANCE.getIfThenElse_Ifelse();
		/**
		 * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__ELSEIF = eINSTANCE.getIfThenElse_Elseif();
		/**
		 * The meta object literal for the '{@link devops2.impl.ParametersImpl <em>Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.ParametersImpl
		 * @see devops2.impl.Devops2PackageImpl#getParameters()
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
		 * The meta object literal for the '{@link devops2.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.PermissionImpl
		 * @see devops2.impl.Devops2PackageImpl#getPermission()
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
		 * The meta object literal for the '{@link devops2.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.ParallelImpl
		 * @see devops2.impl.Devops2PackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();
		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__JOB = eINSTANCE.getParallel_Job();

	}

} //Devops2Package
