/**
 */
package CICD.Steps;

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
 * @see CICD.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.d.fe.up.pt/CICD/Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Steps";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = CICD.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CICD.Steps.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.StepImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 0;

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
	 * The meta object id for the '{@link CICD.Steps.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.ConditionalStepImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getConditionalStep()
	 * @generated
	 */
	int CONDITIONAL_STEP = 1;

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
	 * The meta object id for the '{@link CICD.Steps.impl.NonConditionalStepImpl <em>Non Conditional Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.NonConditionalStepImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getNonConditionalStep()
	 * @generated
	 */
	int NON_CONDITIONAL_STEP = 2;

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
	 * The meta object id for the '{@link CICD.Steps.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.CommandImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 3;

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
	 * The meta object id for the '{@link CICD.Steps.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.PluginImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 4;

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
	 * The meta object id for the '{@link CICD.Steps.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.CacheImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 5;

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
	 * The meta object id for the '{@link CICD.Steps.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Steps.impl.ArtifactImpl
	 * @see CICD.Steps.impl.StepsPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 6;

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
	 * Returns the meta object for class '{@link CICD.Steps.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see CICD.Steps.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for class '{@link CICD.Steps.ConditionalStep <em>Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Step</em>'.
	 * @see CICD.Steps.ConditionalStep
	 * @generated
	 */
	EClass getConditionalStep();

	/**
	 * Returns the meta object for the containment reference '{@link CICD.Steps.ConditionalStep#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see CICD.Steps.ConditionalStep#getIf()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_If();

	/**
	 * Returns the meta object for the containment reference list '{@link CICD.Steps.ConditionalStep#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Then</em>'.
	 * @see CICD.Steps.ConditionalStep#getThen()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link CICD.Steps.ConditionalStep#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else</em>'.
	 * @see CICD.Steps.ConditionalStep#getElse()
	 * @see #getConditionalStep()
	 * @generated
	 */
	EReference getConditionalStep_Else();

	/**
	 * Returns the meta object for class '{@link CICD.Steps.NonConditionalStep <em>Non Conditional Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Conditional Step</em>'.
	 * @see CICD.Steps.NonConditionalStep
	 * @generated
	 */
	EClass getNonConditionalStep();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.NonConditionalStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see CICD.Steps.NonConditionalStep#getId()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.NonConditionalStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CICD.Steps.NonConditionalStep#getName()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_Name();

	/**
	 * Returns the meta object for the reference list '{@link CICD.Steps.NonConditionalStep#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Environment Variables</em>'.
	 * @see CICD.Steps.NonConditionalStep#getEnvironmentVariables()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EReference getNonConditionalStep_EnvironmentVariables();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.NonConditionalStep#getTimeoutMinutes <em>Timeout Minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Minutes</em>'.
	 * @see CICD.Steps.NonConditionalStep#getTimeoutMinutes()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_TimeoutMinutes();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.NonConditionalStep#isAllowFailure <em>Allow Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Failure</em>'.
	 * @see CICD.Steps.NonConditionalStep#isAllowFailure()
	 * @see #getNonConditionalStep()
	 * @generated
	 */
	EAttribute getNonConditionalStep_AllowFailure();

	/**
	 * Returns the meta object for class '{@link CICD.Steps.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see CICD.Steps.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.Command#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program</em>'.
	 * @see CICD.Steps.Command#getProgram()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Program();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.Command#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see CICD.Steps.Command#getArgs()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Args();

	/**
	 * Returns the meta object for class '{@link CICD.Steps.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see CICD.Steps.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.Plugin#getPluginName <em>Plugin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plugin Name</em>'.
	 * @see CICD.Steps.Plugin#getPluginName()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_PluginName();

	/**
	 * Returns the meta object for the attribute '{@link CICD.Steps.Plugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see CICD.Steps.Plugin#getVersion()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Version();

	/**
	 * Returns the meta object for the reference list '{@link CICD.Steps.Plugin#getKwargs <em>Kwargs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Kwargs</em>'.
	 * @see CICD.Steps.Plugin#getKwargs()
	 * @see #getPlugin()
	 * @generated
	 */
	EReference getPlugin_Kwargs();

	/**
	 * Returns the meta object for class '{@link CICD.Steps.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see CICD.Steps.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the containment reference '{@link CICD.Steps.Cache#getCacheName <em>Cache Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache Name</em>'.
	 * @see CICD.Steps.Cache#getCacheName()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_CacheName();

	/**
	 * Returns the meta object for the containment reference list '{@link CICD.Steps.Cache#getKeys <em>Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keys</em>'.
	 * @see CICD.Steps.Cache#getKeys()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Keys();

	/**
	 * Returns the meta object for the containment reference list '{@link CICD.Steps.Cache#getPaths <em>Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paths</em>'.
	 * @see CICD.Steps.Cache#getPaths()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_Paths();

	/**
	 * Returns the meta object for class '{@link CICD.Steps.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see CICD.Steps.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the containment reference '{@link CICD.Steps.Artifact#getArtifactName <em>Artifact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact Name</em>'.
	 * @see CICD.Steps.Artifact#getArtifactName()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ArtifactName();

	/**
	 * Returns the meta object for the containment reference list '{@link CICD.Steps.Artifact#getIncludePaths <em>Include Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Paths</em>'.
	 * @see CICD.Steps.Artifact#getIncludePaths()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IncludePaths();

	/**
	 * Returns the meta object for the containment reference list '{@link CICD.Steps.Artifact#getExcludePaths <em>Exclude Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude Paths</em>'.
	 * @see CICD.Steps.Artifact#getExcludePaths()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_ExcludePaths();

	/**
	 * Returns the meta object for the containment reference '{@link CICD.Steps.Artifact#getRetentionTime <em>Retention Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Retention Time</em>'.
	 * @see CICD.Steps.Artifact#getRetentionTime()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_RetentionTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link CICD.Steps.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.StepImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '{@link CICD.Steps.impl.ConditionalStepImpl <em>Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.ConditionalStepImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getConditionalStep()
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
		 * The meta object literal for the '{@link CICD.Steps.impl.NonConditionalStepImpl <em>Non Conditional Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.NonConditionalStepImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getNonConditionalStep()
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
		 * The meta object literal for the '{@link CICD.Steps.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.CommandImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getCommand()
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
		 * The meta object literal for the '{@link CICD.Steps.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.PluginImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getPlugin()
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
		 * The meta object literal for the '{@link CICD.Steps.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.CacheImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getCache()
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
		 * The meta object literal for the '{@link CICD.Steps.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Steps.impl.ArtifactImpl
		 * @see CICD.Steps.impl.StepsPackageImpl#getArtifact()
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

	}

} //StepsPackage
