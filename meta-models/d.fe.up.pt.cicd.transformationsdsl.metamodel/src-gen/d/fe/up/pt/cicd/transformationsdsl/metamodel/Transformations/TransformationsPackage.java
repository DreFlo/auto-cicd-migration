/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

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
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsFactory
 * @model kind="package"
 * @generated
 */
public interface TransformationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Transformations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/Transformations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Transformations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationsPackage eINSTANCE = d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.StringToStringMapEntryImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl <em>Transformation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTransformationSet()
	 * @generated
	 */
	int TRANSFORMATION_SET = 1;

	/**
	 * The feature id for the '<em><b>Pre TIM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET__PRE_TIM = 0;

	/**
	 * The feature id for the '<em><b>On TIM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET__ON_TIM = 1;

	/**
	 * The feature id for the '<em><b>Post TIM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET__POST_TIM = 2;

	/**
	 * The number of structural features of the '<em>Transformation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transformation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 2;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TIMTransformationImpl <em>TIM Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TIMTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTIMTransformation()
	 * @generated
	 */
	int TIM_TRANSFORMATION = 3;

	/**
	 * The number of structural features of the '<em>TIM Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TIM Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIM_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TSMTransformationImpl <em>TSM Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TSMTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTSMTransformation()
	 * @generated
	 */
	int TSM_TRANSFORMATION = 4;

	/**
	 * The number of structural features of the '<em>TSM Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSM_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TSM Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSM_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.InplaceTransformationImpl <em>Inplace Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.InplaceTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getInplaceTransformation()
	 * @generated
	 */
	int INPLACE_TRANSFORMATION = 5;

	/**
	 * The number of structural features of the '<em>Inplace Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPLACE_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inplace Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPLACE_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.OutplaceTransformationImpl <em>Outplace Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.OutplaceTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getOutplaceTransformation()
	 * @generated
	 */
	int OUTPLACE_TRANSFORMATION = 6;

	/**
	 * The number of structural features of the '<em>Outplace Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPLACE_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outplace Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPLACE_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ConditionalTransformationImpl <em>Conditional Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ConditionalTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getConditionalTransformation()
	 * @generated
	 */
	int CONDITIONAL_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TRANSFORMATION__CONDITION = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLScriptImpl <em>ATL Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLScriptImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getATLScript()
	 * @generated
	 */
	int ATL_SCRIPT = 8;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_SCRIPT__SCRIPT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_SCRIPT__MODEL = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ATL Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_SCRIPT_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ATL Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_SCRIPT_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginImpl <em>Change Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangePlugin()
	 * @generated
	 */
	int CHANGE_PLUGIN = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__NAME = INPLACE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__VERSION = INPLACE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__ARGS = INPLACE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_FEATURE_COUNT = INPLACE_TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Change Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_OPERATION_COUNT = INPLACE_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl <em>Replace Agent Labels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getReplaceAgentLabels()
	 * @generated
	 */
	int REPLACE_AGENT_LABELS = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_LABELS__CONDITION = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_LABELS__LABELS = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replace Agent Labels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_LABELS_FEATURE_COUNT = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Replace Agent Labels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_LABELS_OPERATION_COUNT = OUTPLACE_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddTriggerImpl <em>Add Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddTriggerImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddTrigger()
	 * @generated
	 */
	int ADD_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TRIGGER__CONDITION = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TRIGGER__TRIGGER = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TRIGGER_FEATURE_COUNT = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TRIGGER_OPERATION_COUNT = OUTPLACE_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.JobTransformationImpl <em>Job Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.JobTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getJobTransformation()
	 * @generated
	 */
	int JOB_TRANSFORMATION = 12;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRANSFORMATION__JOB = TIM_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Job Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRANSFORMATION_FEATURE_COUNT = TIM_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Job Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_TRANSFORMATION_OPERATION_COUNT = TIM_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.EditStepImpl <em>Edit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.EditStepImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getEditStep()
	 * @generated
	 */
	int EDIT_STEP = 13;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STEP__JOB = JOB_TRANSFORMATION__JOB;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STEP__INDEX = JOB_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STEP_FEATURE_COUNT = JOB_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Edit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_STEP_OPERATION_COUNT = JOB_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.NewStepImpl <em>New Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.NewStepImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getNewStep()
	 * @generated
	 */
	int NEW_STEP = 14;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_STEP__JOB = EDIT_STEP__JOB;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_STEP__INDEX = EDIT_STEP__INDEX;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_STEP__STEP = EDIT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_STEP_FEATURE_COUNT = EDIT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>New Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_STEP_OPERATION_COUNT = EDIT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl <em>Replace Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getReplaceStep()
	 * @generated
	 */
	int REPLACE_STEP = 15;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_STEP__JOB = NEW_STEP__JOB;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_STEP__INDEX = NEW_STEP__INDEX;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_STEP__STEP = NEW_STEP__STEP;

	/**
	 * The number of structural features of the '<em>Replace Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_STEP_FEATURE_COUNT = NEW_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Replace Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_STEP_OPERATION_COUNT = NEW_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddStepImpl <em>Add Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddStepImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddStep()
	 * @generated
	 */
	int ADD_STEP = 16;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STEP__JOB = NEW_STEP__JOB;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STEP__INDEX = NEW_STEP__INDEX;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STEP__STEP = NEW_STEP__STEP;

	/**
	 * The number of structural features of the '<em>Add Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STEP_FEATURE_COUNT = NEW_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Add Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STEP_OPERATION_COUNT = NEW_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.DeleteStepImpl <em>Delete Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.DeleteStepImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getDeleteStep()
	 * @generated
	 */
	int DELETE_STEP = 17;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STEP__JOB = EDIT_STEP__JOB;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STEP__INDEX = EDIT_STEP__INDEX;

	/**
	 * The number of structural features of the '<em>Delete Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STEP_FEATURE_COUNT = EDIT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delete Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_STEP_OPERATION_COUNT = EDIT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddPortsImpl <em>Add Ports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddPortsImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddPorts()
	 * @generated
	 */
	int ADD_PORTS = 18;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PORTS__CONDITION = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PORTS__PORTS = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PORTS_FEATURE_COUNT = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Ports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PORTS_OPERATION_COUNT = OUTPLACE_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetOptionsImpl <em>Set Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetOptionsImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getSetOptions()
	 * @generated
	 */
	int SET_OPTIONS = 19;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPTIONS__CONDITION = INPLACE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPTIONS__OPTIONS = INPLACE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPTIONS_FEATURE_COUNT = INPLACE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPTIONS_OPERATION_COUNT = INPLACE_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeImageImpl <em>Change Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeImageImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangeImage()
	 * @generated
	 */
	int CHANGE_IMAGE = 20;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_IMAGE__CONDITION = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_IMAGE__IMAGE = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_IMAGE_FEATURE_COUNT = OUTPLACE_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Change Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_IMAGE_OPERATION_COUNT = OUTPLACE_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.GHATransformationImpl <em>GHA Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.GHATransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getGHATransformation()
	 * @generated
	 */
	int GHA_TRANSFORMATION = 21;

	/**
	 * The number of structural features of the '<em>GHA Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHA_TRANSFORMATION_FEATURE_COUNT = TSM_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GHA Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GHA_TRANSFORMATION_OPERATION_COUNT = TSM_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.CircleCITransformationImpl <em>Circle CI Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.CircleCITransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getCircleCITransformation()
	 * @generated
	 */
	int CIRCLE_CI_TRANSFORMATION = 22;

	/**
	 * The number of structural features of the '<em>Circle CI Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT = TSM_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circle CI Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_CI_TRANSFORMATION_OPERATION_COUNT = TSM_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddExecutorImpl <em>Add Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddExecutorImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddExecutor()
	 * @generated
	 */
	int ADD_EXECUTOR = 23;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTOR__JOB_NAME = CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTOR_FEATURE_COUNT = CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_EXECUTOR_OPERATION_COUNT = CIRCLE_CI_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddOrbReferenceExecutorImpl <em>Add Orb Reference Executor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddOrbReferenceExecutorImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddOrbReferenceExecutor()
	 * @generated
	 */
	int ADD_ORB_REFERENCE_EXECUTOR = 24;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ORB_REFERENCE_EXECUTOR__JOB_NAME = ADD_EXECUTOR__JOB_NAME;

	/**
	 * The feature id for the '<em><b>Orb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ORB_REFERENCE_EXECUTOR__ORB = ADD_EXECUTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ORB_REFERENCE_EXECUTOR__EXECUTOR = ADD_EXECUTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Orb Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ORB_REFERENCE_EXECUTOR_FEATURE_COUNT = ADD_EXECUTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Add Orb Reference Executor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ORB_REFERENCE_EXECUTOR_OPERATION_COUNT = ADD_EXECUTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetCircleCIVersionImpl <em>Set Circle CI Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetCircleCIVersionImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getSetCircleCIVersion()
	 * @generated
	 */
	int SET_CIRCLE_CI_VERSION = 25;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CIRCLE_CI_VERSION__VERSION = CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Circle CI Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CIRCLE_CI_VERSION_FEATURE_COUNT = CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Circle CI Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CIRCLE_CI_VERSION_OPERATION_COUNT = CIRCLE_CI_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SelectWorkflowImpl <em>Select Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SelectWorkflowImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getSelectWorkflow()
	 * @generated
	 */
	int SELECT_WORKFLOW = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_WORKFLOW__NAME = CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_WORKFLOW_FEATURE_COUNT = CIRCLE_CI_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_WORKFLOW_OPERATION_COUNT = CIRCLE_CI_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS <em>MODELS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getMODELS()
	 * @generated
	 */
	int MODELS = 27;

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true"
	 * @generated
	 */
	EClass getStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getStringToStringMapEntry_Value();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet <em>Transformation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Set</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet
	 * @generated
	 */
	EClass getTransformationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getPreTIM <em>Pre TIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre TIM</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getPreTIM()
	 * @see #getTransformationSet()
	 * @generated
	 */
	EReference getTransformationSet_PreTIM();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getOnTIM <em>On TIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On TIM</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getOnTIM()
	 * @see #getTransformationSet()
	 * @generated
	 */
	EReference getTransformationSet_OnTIM();

	/**
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getPostTIM <em>Post TIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Post TIM</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getPostTIM()
	 * @see #getTransformationSet()
	 * @generated
	 */
	EReference getTransformationSet_PostTIM();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TIMTransformation <em>TIM Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIM Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TIMTransformation
	 * @generated
	 */
	EClass getTIMTransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation <em>TSM Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSM Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation
	 * @generated
	 */
	EClass getTSMTransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.InplaceTransformation <em>Inplace Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inplace Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.InplaceTransformation
	 * @generated
	 */
	EClass getInplaceTransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.OutplaceTransformation <em>Outplace Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outplace Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.OutplaceTransformation
	 * @generated
	 */
	EClass getOutplaceTransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation <em>Conditional Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation
	 * @generated
	 */
	EClass getConditionalTransformation();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ConditionalTransformation#getCondition()
	 * @see #getConditionalTransformation()
	 * @generated
	 */
	EAttribute getConditionalTransformation_Condition();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript <em>ATL Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATL Script</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript
	 * @generated
	 */
	EClass getATLScript();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getScript()
	 * @see #getATLScript()
	 * @generated
	 */
	EAttribute getATLScript_Script();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getModel()
	 * @see #getATLScript()
	 * @generated
	 */
	EAttribute getATLScript_Model();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin <em>Change Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Plugin</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin
	 * @generated
	 */
	EClass getChangePlugin();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin#getName()
	 * @see #getChangePlugin()
	 * @generated
	 */
	EReference getChangePlugin_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin#getVersion()
	 * @see #getChangePlugin()
	 * @generated
	 */
	EAttribute getChangePlugin_Version();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Args</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePlugin#getArgs()
	 * @see #getChangePlugin()
	 * @generated
	 */
	EReference getChangePlugin_Args();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels <em>Replace Agent Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Agent Labels</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels
	 * @generated
	 */
	EClass getReplaceAgentLabels();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels#getLabels()
	 * @see #getReplaceAgentLabels()
	 * @generated
	 */
	EAttribute getReplaceAgentLabels_Labels();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger <em>Add Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Trigger</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger
	 * @generated
	 */
	EClass getAddTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddTrigger#getTrigger()
	 * @see #getAddTrigger()
	 * @generated
	 */
	EReference getAddTrigger_Trigger();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.JobTransformation <em>Job Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.JobTransformation
	 * @generated
	 */
	EClass getJobTransformation();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.JobTransformation#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.JobTransformation#getJob()
	 * @see #getJobTransformation()
	 * @generated
	 */
	EAttribute getJobTransformation_Job();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.EditStep <em>Edit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Step</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.EditStep
	 * @generated
	 */
	EClass getEditStep();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.EditStep#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.EditStep#getIndex()
	 * @see #getEditStep()
	 * @generated
	 */
	EAttribute getEditStep_Index();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.NewStep <em>New Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Step</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.NewStep
	 * @generated
	 */
	EClass getNewStep();

	/**
	 * Returns the meta object for the containment reference '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.NewStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Step</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.NewStep#getStep()
	 * @see #getNewStep()
	 * @generated
	 */
	EReference getNewStep_Step();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceStep <em>Replace Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Step</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceStep
	 * @generated
	 */
	EClass getReplaceStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddStep <em>Add Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Step</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddStep
	 * @generated
	 */
	EClass getAddStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.DeleteStep <em>Delete Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Step</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.DeleteStep
	 * @generated
	 */
	EClass getDeleteStep();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddPorts <em>Add Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Ports</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddPorts
	 * @generated
	 */
	EClass getAddPorts();

	/**
	 * Returns the meta object for the attribute list '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddPorts#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddPorts#getPorts()
	 * @see #getAddPorts()
	 * @generated
	 */
	EAttribute getAddPorts_Ports();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetOptions <em>Set Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Options</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetOptions
	 * @generated
	 */
	EClass getSetOptions();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetOptions#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Options</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetOptions#getOptions()
	 * @see #getSetOptions()
	 * @generated
	 */
	EAttribute getSetOptions_Options();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeImage <em>Change Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Image</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeImage
	 * @generated
	 */
	EClass getChangeImage();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeImage#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeImage#getImage()
	 * @see #getChangeImage()
	 * @generated
	 */
	EAttribute getChangeImage_Image();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.GHATransformation <em>GHA Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GHA Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.GHATransformation
	 * @generated
	 */
	EClass getGHATransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.CircleCITransformation <em>Circle CI Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle CI Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.CircleCITransformation
	 * @generated
	 */
	EClass getCircleCITransformation();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor <em>Add Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Executor</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor
	 * @generated
	 */
	EClass getAddExecutor();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddExecutor#getJobName()
	 * @see #getAddExecutor()
	 * @generated
	 */
	EAttribute getAddExecutor_JobName();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor <em>Add Orb Reference Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Orb Reference Executor</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor
	 * @generated
	 */
	EClass getAddOrbReferenceExecutor();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor#getOrb <em>Orb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orb</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor#getOrb()
	 * @see #getAddOrbReferenceExecutor()
	 * @generated
	 */
	EAttribute getAddOrbReferenceExecutor_Orb();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Executor</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.AddOrbReferenceExecutor#getExecutor()
	 * @see #getAddOrbReferenceExecutor()
	 * @generated
	 */
	EAttribute getAddOrbReferenceExecutor_Executor();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion <em>Set Circle CI Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Circle CI Version</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion
	 * @generated
	 */
	EClass getSetCircleCIVersion();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetCircleCIVersion#getVersion()
	 * @see #getSetCircleCIVersion()
	 * @generated
	 */
	EAttribute getSetCircleCIVersion_Version();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SelectWorkflow <em>Select Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Workflow</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SelectWorkflow
	 * @generated
	 */
	EClass getSelectWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SelectWorkflow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SelectWorkflow#getName()
	 * @see #getSelectWorkflow()
	 * @generated
	 */
	EAttribute getSelectWorkflow_Name();

	/**
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS <em>MODELS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MODELS</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS
	 * @generated
	 */
	EEnum getMODELS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformationsFactory getTransformationsFactory();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.StringToStringMapEntryImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getStringToStringMapEntry()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP_ENTRY = eINSTANCE.getStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getStringToStringMapEntry_Value();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl <em>Transformation Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTransformationSet()
		 * @generated
		 */
		EClass TRANSFORMATION_SET = eINSTANCE.getTransformationSet();

		/**
		 * The meta object literal for the '<em><b>Pre TIM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_SET__PRE_TIM = eINSTANCE.getTransformationSet_PreTIM();

		/**
		 * The meta object literal for the '<em><b>On TIM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_SET__ON_TIM = eINSTANCE.getTransformationSet_OnTIM();

		/**
		 * The meta object literal for the '<em><b>Post TIM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_SET__POST_TIM = eINSTANCE.getTransformationSet_PostTIM();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TIMTransformationImpl <em>TIM Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TIMTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTIMTransformation()
		 * @generated
		 */
		EClass TIM_TRANSFORMATION = eINSTANCE.getTIMTransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TSMTransformationImpl <em>TSM Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TSMTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTSMTransformation()
		 * @generated
		 */
		EClass TSM_TRANSFORMATION = eINSTANCE.getTSMTransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.InplaceTransformationImpl <em>Inplace Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.InplaceTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getInplaceTransformation()
		 * @generated
		 */
		EClass INPLACE_TRANSFORMATION = eINSTANCE.getInplaceTransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.OutplaceTransformationImpl <em>Outplace Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.OutplaceTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getOutplaceTransformation()
		 * @generated
		 */
		EClass OUTPLACE_TRANSFORMATION = eINSTANCE.getOutplaceTransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ConditionalTransformationImpl <em>Conditional Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ConditionalTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getConditionalTransformation()
		 * @generated
		 */
		EClass CONDITIONAL_TRANSFORMATION = eINSTANCE.getConditionalTransformation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_TRANSFORMATION__CONDITION = eINSTANCE.getConditionalTransformation_Condition();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLScriptImpl <em>ATL Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLScriptImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getATLScript()
		 * @generated
		 */
		EClass ATL_SCRIPT = eINSTANCE.getATLScript();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_SCRIPT__SCRIPT = eINSTANCE.getATLScript_Script();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_SCRIPT__MODEL = eINSTANCE.getATLScript_Model();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginImpl <em>Change Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangePlugin()
		 * @generated
		 */
		EClass CHANGE_PLUGIN = eINSTANCE.getChangePlugin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PLUGIN__NAME = eINSTANCE.getChangePlugin_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PLUGIN__VERSION = eINSTANCE.getChangePlugin_Version();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PLUGIN__ARGS = eINSTANCE.getChangePlugin_Args();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl <em>Replace Agent Labels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getReplaceAgentLabels()
		 * @generated
		 */
		EClass REPLACE_AGENT_LABELS = eINSTANCE.getReplaceAgentLabels();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_AGENT_LABELS__LABELS = eINSTANCE.getReplaceAgentLabels_Labels();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddTriggerImpl <em>Add Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddTriggerImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddTrigger()
		 * @generated
		 */
		EClass ADD_TRIGGER = eINSTANCE.getAddTrigger();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_TRIGGER__TRIGGER = eINSTANCE.getAddTrigger_Trigger();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.JobTransformationImpl <em>Job Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.JobTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getJobTransformation()
		 * @generated
		 */
		EClass JOB_TRANSFORMATION = eINSTANCE.getJobTransformation();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_TRANSFORMATION__JOB = eINSTANCE.getJobTransformation_Job();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.EditStepImpl <em>Edit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.EditStepImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getEditStep()
		 * @generated
		 */
		EClass EDIT_STEP = eINSTANCE.getEditStep();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDIT_STEP__INDEX = eINSTANCE.getEditStep_Index();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.NewStepImpl <em>New Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.NewStepImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getNewStep()
		 * @generated
		 */
		EClass NEW_STEP = eINSTANCE.getNewStep();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_STEP__STEP = eINSTANCE.getNewStep_Step();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl <em>Replace Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceStepImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getReplaceStep()
		 * @generated
		 */
		EClass REPLACE_STEP = eINSTANCE.getReplaceStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddStepImpl <em>Add Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddStepImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddStep()
		 * @generated
		 */
		EClass ADD_STEP = eINSTANCE.getAddStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.DeleteStepImpl <em>Delete Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.DeleteStepImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getDeleteStep()
		 * @generated
		 */
		EClass DELETE_STEP = eINSTANCE.getDeleteStep();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddPortsImpl <em>Add Ports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddPortsImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddPorts()
		 * @generated
		 */
		EClass ADD_PORTS = eINSTANCE.getAddPorts();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PORTS__PORTS = eINSTANCE.getAddPorts_Ports();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetOptionsImpl <em>Set Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetOptionsImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getSetOptions()
		 * @generated
		 */
		EClass SET_OPTIONS = eINSTANCE.getSetOptions();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_OPTIONS__OPTIONS = eINSTANCE.getSetOptions_Options();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeImageImpl <em>Change Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeImageImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangeImage()
		 * @generated
		 */
		EClass CHANGE_IMAGE = eINSTANCE.getChangeImage();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_IMAGE__IMAGE = eINSTANCE.getChangeImage_Image();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.GHATransformationImpl <em>GHA Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.GHATransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getGHATransformation()
		 * @generated
		 */
		EClass GHA_TRANSFORMATION = eINSTANCE.getGHATransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.CircleCITransformationImpl <em>Circle CI Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.CircleCITransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getCircleCITransformation()
		 * @generated
		 */
		EClass CIRCLE_CI_TRANSFORMATION = eINSTANCE.getCircleCITransformation();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddExecutorImpl <em>Add Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddExecutorImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddExecutor()
		 * @generated
		 */
		EClass ADD_EXECUTOR = eINSTANCE.getAddExecutor();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_EXECUTOR__JOB_NAME = eINSTANCE.getAddExecutor_JobName();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddOrbReferenceExecutorImpl <em>Add Orb Reference Executor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.AddOrbReferenceExecutorImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getAddOrbReferenceExecutor()
		 * @generated
		 */
		EClass ADD_ORB_REFERENCE_EXECUTOR = eINSTANCE.getAddOrbReferenceExecutor();

		/**
		 * The meta object literal for the '<em><b>Orb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ORB_REFERENCE_EXECUTOR__ORB = eINSTANCE.getAddOrbReferenceExecutor_Orb();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ORB_REFERENCE_EXECUTOR__EXECUTOR = eINSTANCE.getAddOrbReferenceExecutor_Executor();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetCircleCIVersionImpl <em>Set Circle CI Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SetCircleCIVersionImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getSetCircleCIVersion()
		 * @generated
		 */
		EClass SET_CIRCLE_CI_VERSION = eINSTANCE.getSetCircleCIVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_CIRCLE_CI_VERSION__VERSION = eINSTANCE.getSetCircleCIVersion_Version();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SelectWorkflowImpl <em>Select Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.SelectWorkflowImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getSelectWorkflow()
		 * @generated
		 */
		EClass SELECT_WORKFLOW = eINSTANCE.getSelectWorkflow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT_WORKFLOW__NAME = eINSTANCE.getSelectWorkflow_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS <em>MODELS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getMODELS()
		 * @generated
		 */
		EEnum MODELS = eINSTANCE.getMODELS();

	}

} //TransformationsPackage
