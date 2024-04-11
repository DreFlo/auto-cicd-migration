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
	 * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET__TRANSFORMATIONS = 0;

	/**
	 * The number of structural features of the '<em>Transformation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_SET_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginImpl <em>Change Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangePlugin()
	 * @generated
	 */
	int CHANGE_PLUGIN = 3;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.RefiningTransformationImpl <em>Refining Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.RefiningTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getRefiningTransformation()
	 * @generated
	 */
	int REFINING_TRANSFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_TRANSFORMATION__MODEL = TRANSFORMATION__MODEL;

	/**
	 * The number of structural features of the '<em>Refining Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refining Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINING_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__MODEL = REFINING_TRANSFORMATION__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__NAME = REFINING_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__VERSION = REFINING_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN__ARGS = REFINING_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_FEATURE_COUNT = REFINING_TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Change Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_OPERATION_COUNT = REFINING_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLRefiningScriptImpl <em>ATL Refining Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLRefiningScriptImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getATLRefiningScript()
	 * @generated
	 */
	int ATL_REFINING_SCRIPT = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_REFINING_SCRIPT__MODEL = REFINING_TRANSFORMATION__MODEL;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_REFINING_SCRIPT__SCRIPT = REFINING_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ATL Refining Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_REFINING_SCRIPT_FEATURE_COUNT = REFINING_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>ATL Refining Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATL_REFINING_SCRIPT_OPERATION_COUNT = REFINING_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeAgentLabelImpl <em>Change Agent Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeAgentLabelImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangeAgentLabel()
	 * @generated
	 */
	int CHANGE_AGENT_LABEL = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AGENT_LABEL__MODEL = REFINING_TRANSFORMATION__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AGENT_LABEL__NAME = REFINING_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Agent Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AGENT_LABEL_FEATURE_COUNT = REFINING_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Agent Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AGENT_LABEL_OPERATION_COUNT = REFINING_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.OutplaceTransformationImpl <em>Outplace Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.OutplaceTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getOutplaceTransformation()
	 * @generated
	 */
	int OUTPLACE_TRANSFORMATION = 7;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPLACE_TRANSFORMATION__MODEL = TRANSFORMATION__MODEL;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl <em>Replace Agent Labels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getReplaceAgentLabels()
	 * @generated
	 */
	int REPLACE_AGENT_LABELS = 8;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AGENT_LABELS__MODEL = OUTPLACE_TRANSFORMATION__MODEL;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES <em>MODEL NAMES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getMODEL_NAMES()
	 * @generated
	 */
	int MODEL_NAMES = 9;

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
	 * Returns the meta object for the containment reference list '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformations</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getTransformations()
	 * @see #getTransformationSet()
	 * @generated
	 */
	EReference getTransformationSet_Transformations();

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
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation#getModel()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Model();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLRefiningScript <em>ATL Refining Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATL Refining Script</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLRefiningScript
	 * @generated
	 */
	EClass getATLRefiningScript();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLRefiningScript#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLRefiningScript#getScript()
	 * @see #getATLRefiningScript()
	 * @generated
	 */
	EAttribute getATLRefiningScript_Script();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel <em>Change Agent Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Agent Label</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel
	 * @generated
	 */
	EClass getChangeAgentLabel();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel#getName()
	 * @see #getChangeAgentLabel()
	 * @generated
	 */
	EReference getChangeAgentLabel_Name();

	/**
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.RefiningTransformation <em>Refining Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refining Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.RefiningTransformation
	 * @generated
	 */
	EClass getRefiningTransformation();

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels <em>Replace Agent Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Agent Labels</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels
	 * @generated
	 */
	EClass getReplaceAgentLabels();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ReplaceAgentLabels#getCondition()
	 * @see #getReplaceAgentLabels()
	 * @generated
	 */
	EAttribute getReplaceAgentLabels_Condition();

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
	 * Returns the meta object for enum '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES <em>MODEL NAMES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MODEL NAMES</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES
	 * @generated
	 */
	EEnum getMODEL_NAMES();

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
		 * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_SET__TRANSFORMATIONS = eINSTANCE.getTransformationSet_Transformations();

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
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__MODEL = eINSTANCE.getTransformation_Model();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLRefiningScriptImpl <em>ATL Refining Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ATLRefiningScriptImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getATLRefiningScript()
		 * @generated
		 */
		EClass ATL_REFINING_SCRIPT = eINSTANCE.getATLRefiningScript();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATL_REFINING_SCRIPT__SCRIPT = eINSTANCE.getATLRefiningScript_Script();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeAgentLabelImpl <em>Change Agent Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangeAgentLabelImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangeAgentLabel()
		 * @generated
		 */
		EClass CHANGE_AGENT_LABEL = eINSTANCE.getChangeAgentLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_AGENT_LABEL__NAME = eINSTANCE.getChangeAgentLabel_Name();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.RefiningTransformationImpl <em>Refining Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.RefiningTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getRefiningTransformation()
		 * @generated
		 */
		EClass REFINING_TRANSFORMATION = eINSTANCE.getRefiningTransformation();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl <em>Replace Agent Labels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ReplaceAgentLabelsImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getReplaceAgentLabels()
		 * @generated
		 */
		EClass REPLACE_AGENT_LABELS = eINSTANCE.getReplaceAgentLabels();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_AGENT_LABELS__CONDITION = eINSTANCE.getReplaceAgentLabels_Condition();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_AGENT_LABELS__LABELS = eINSTANCE.getReplaceAgentLabels_Labels();

		/**
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES <em>MODEL NAMES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getMODEL_NAMES()
		 * @generated
		 */
		EEnum MODEL_NAMES = eINSTANCE.getMODEL_NAMES();

	}

} //TransformationsPackage
