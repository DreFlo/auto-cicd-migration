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
	 * The feature id for the '<em><b>Pipeline tool framework</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PIPELINE_TOOL_FRAMEWORK = 3;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 4;

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
	 * The feature id for the '<em><b>Depends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DEPENDS = 1;

	/**
	 * The feature id for the '<em><b>Tool framework job</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TOOL_FRAMEWORK_JOB = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Job parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Ifthenelse</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IFTHENELSE = 6;

	/**
	 * The feature id for the '<em><b>Allow faillure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ALLOW_FAILLURE = 7;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__INPUT = 8;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 9;

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
	 * The feature id for the '<em><b>Envirnoment c</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ENVIRNOMENT_C = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__TOOL = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__PARAMETERS = 3;

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
	 * The feature id for the '<em><b>Environment if</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__ENVIRONMENT_IF = 5;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the reference list '{@link devops2.Pipeline#getPipeline_tool_framework <em>Pipeline tool framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pipeline tool framework</em>'.
	 * @see devops2.Pipeline#getPipeline_tool_framework()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Pipeline_tool_framework();

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
	 * Returns the meta object for the reference list '{@link devops2.Job#getDepends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends</em>'.
	 * @see devops2.Job#getDepends()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Depends();

	/**
	 * Returns the meta object for the reference list '{@link devops2.Job#getTool_framework_job <em>Tool framework job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tool framework job</em>'.
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
	 * Returns the meta object for the reference list '{@link devops2.Job#getJob_parameter <em>Job parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Job parameter</em>'.
	 * @see devops2.Job#getJob_parameter()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Job_parameter();

	/**
	 * Returns the meta object for the reference list '{@link devops2.Job#getIfthenelse <em>Ifthenelse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ifthenelse</em>'.
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
	 * Returns the meta object for class '{@link devops2.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see devops2.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the reference list '{@link devops2.Command#getEnvirnoment_c <em>Envirnoment c</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Envirnoment c</em>'.
	 * @see devops2.Command#getEnvirnoment_c()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Envirnoment_c();

	/**
	 * Returns the meta object for the attribute '{@link devops2.Command#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters</em>'.
	 * @see devops2.Command#getParameters()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Parameters();

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
	 * Returns the meta object for the reference '{@link devops2.Command#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
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
	 * Returns the meta object for the containment reference list '{@link devops2.IfThenElse#getEnvironment_if <em>Environment if</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment if</em>'.
	 * @see devops2.IfThenElse#getEnvironment_if()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Environment_if();

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
		 * The meta object literal for the '<em><b>Pipeline tool framework</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__PIPELINE_TOOL_FRAMEWORK = eINSTANCE.getPipeline_Pipeline_tool_framework();
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
		 * The meta object literal for the '<em><b>Depends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__DEPENDS = eINSTANCE.getJob_Depends();
		/**
		 * The meta object literal for the '<em><b>Tool framework job</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Job parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__JOB_PARAMETER = eINSTANCE.getJob_Job_parameter();
		/**
		 * The meta object literal for the '<em><b>Ifthenelse</b></em>' reference list feature.
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
		 * The meta object literal for the '{@link devops2.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see devops2.impl.CommandImpl
		 * @see devops2.impl.Devops2PackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();
		/**
		 * The meta object literal for the '<em><b>Envirnoment c</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__ENVIRNOMENT_C = eINSTANCE.getCommand_Envirnoment_c();
		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__PARAMETERS = eINSTANCE.getCommand_Parameters();
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
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Environment if</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__ENVIRONMENT_IF = eINSTANCE.getIfThenElse_Environment_if();

	}

} //Devops2Package
