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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl <em>Transformation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getTransformationSet()
	 * @generated
	 */
	int TRANSFORMATION_SET = 0;

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
	int TRANSFORMATION = 1;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginTransformationImpl <em>Change Plugin Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginTransformationImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangePluginTransformation()
	 * @generated
	 */
	int CHANGE_PLUGIN_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_TRANSFORMATION__MODEL = TRANSFORMATION__MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_TRANSFORMATION__NAME = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_TRANSFORMATION__VERSION = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_TRANSFORMATION__ARGS = TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Plugin Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Change Plugin Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_PLUGIN_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.StringToStringMapEntryImpl <em>String To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.StringToStringMapEntryImpl
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getStringToStringMapEntry()
	 * @generated
	 */
	int STRING_TO_STRING_MAP_ENTRY = 3;

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
	 * The meta object id for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES <em>MODEL NAMES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getMODEL_NAMES()
	 * @generated
	 */
	int MODEL_NAMES = 4;

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
	 * Returns the meta object for class '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation <em>Change Plugin Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Plugin Transformation</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation
	 * @generated
	 */
	EClass getChangePluginTransformation();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Name</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getName()
	 * @see #getChangePluginTransformation()
	 * @generated
	 */
	EReference getChangePluginTransformation_Name();

	/**
	 * Returns the meta object for the attribute '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getVersion()
	 * @see #getChangePluginTransformation()
	 * @generated
	 */
	EAttribute getChangePluginTransformation_Version();

	/**
	 * Returns the meta object for the map '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Args</em>'.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getArgs()
	 * @see #getChangePluginTransformation()
	 * @generated
	 */
	EReference getChangePluginTransformation_Args();

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
		 * The meta object literal for the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginTransformationImpl <em>Change Plugin Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.ChangePluginTransformationImpl
		 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsPackageImpl#getChangePluginTransformation()
		 * @generated
		 */
		EClass CHANGE_PLUGIN_TRANSFORMATION = eINSTANCE.getChangePluginTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PLUGIN_TRANSFORMATION__NAME = eINSTANCE.getChangePluginTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_PLUGIN_TRANSFORMATION__VERSION = eINSTANCE.getChangePluginTransformation_Version();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_PLUGIN_TRANSFORMATION__ARGS = eINSTANCE.getChangePluginTransformation_Args();

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
