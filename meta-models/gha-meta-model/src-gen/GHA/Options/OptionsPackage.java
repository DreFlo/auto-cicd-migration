/**
 */
package GHA.Options;

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
 * @see GHA.Options.OptionsFactory
 * @model kind="package"
 * @generated
 */
public interface OptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Options";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA/Options";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Options";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptionsPackage eINSTANCE = GHA.Options.impl.OptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link GHA.Options.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Options.impl.PermissionImpl
	 * @see GHA.Options.impl.OptionsPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 0;

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
	 * The meta object id for the '{@link GHA.Options.impl.ConcurrencyGroupImpl <em>Concurrency Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Options.impl.ConcurrencyGroupImpl
	 * @see GHA.Options.impl.OptionsPackageImpl#getConcurrencyGroup()
	 * @generated
	 */
	int CONCURRENCY_GROUP = 1;

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
	 * The meta object id for the '{@link GHA.Options.impl.DefaultsImpl <em>Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Options.impl.DefaultsImpl
	 * @see GHA.Options.impl.OptionsPackageImpl#getDefaults()
	 * @generated
	 */
	int DEFAULTS = 2;

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
	 * The meta object id for the '{@link GHA.Options.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Options.PERMISSION_SCOPES
	 * @see GHA.Options.impl.OptionsPackageImpl#getPERMISSION_SCOPES()
	 * @generated
	 */
	int PERMISSION_SCOPES = 3;

	/**
	 * The meta object id for the '{@link GHA.Options.PERMISSIONS <em>PERMISSIONS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Options.PERMISSIONS
	 * @see GHA.Options.impl.OptionsPackageImpl#getPERMISSIONS()
	 * @generated
	 */
	int PERMISSIONS = 4;

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see java.util.Map.Entry
	 * @model keyId="true" keyDataType="GHA.Options.PERMISSION_SCOPES" keyRequired="true"
	 *        valueDataType="GHA.Options.PERMISSIONS" valueRequired="true"
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
	 * Returns the meta object for class '{@link GHA.Options.ConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency Group</em>'.
	 * @see GHA.Options.ConcurrencyGroup
	 * @generated
	 */
	EClass getConcurrencyGroup();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Options.ConcurrencyGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see GHA.Options.ConcurrencyGroup#getName()
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	EReference getConcurrencyGroup_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Options.ConcurrencyGroup#getCancelInProgress <em>Cancel In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel In Progress</em>'.
	 * @see GHA.Options.ConcurrencyGroup#getCancelInProgress()
	 * @see #getConcurrencyGroup()
	 * @generated
	 */
	EReference getConcurrencyGroup_CancelInProgress();

	/**
	 * Returns the meta object for class '{@link GHA.Options.Defaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defaults</em>'.
	 * @see GHA.Options.Defaults
	 * @generated
	 */
	EClass getDefaults();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Options.Defaults#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shell</em>'.
	 * @see GHA.Options.Defaults#getShell()
	 * @see #getDefaults()
	 * @generated
	 */
	EReference getDefaults_Shell();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Options.Defaults#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Working Directory</em>'.
	 * @see GHA.Options.Defaults#getWorkingDirectory()
	 * @see #getDefaults()
	 * @generated
	 */
	EReference getDefaults_WorkingDirectory();

	/**
	 * Returns the meta object for enum '{@link GHA.Options.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERMISSION SCOPES</em>'.
	 * @see GHA.Options.PERMISSION_SCOPES
	 * @generated
	 */
	EEnum getPERMISSION_SCOPES();

	/**
	 * Returns the meta object for enum '{@link GHA.Options.PERMISSIONS <em>PERMISSIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERMISSIONS</em>'.
	 * @see GHA.Options.PERMISSIONS
	 * @generated
	 */
	EEnum getPERMISSIONS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OptionsFactory getOptionsFactory();

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
		 * The meta object literal for the '{@link GHA.Options.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Options.impl.PermissionImpl
		 * @see GHA.Options.impl.OptionsPackageImpl#getPermission()
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
		 * The meta object literal for the '{@link GHA.Options.impl.ConcurrencyGroupImpl <em>Concurrency Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Options.impl.ConcurrencyGroupImpl
		 * @see GHA.Options.impl.OptionsPackageImpl#getConcurrencyGroup()
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
		 * The meta object literal for the '{@link GHA.Options.impl.DefaultsImpl <em>Defaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Options.impl.DefaultsImpl
		 * @see GHA.Options.impl.OptionsPackageImpl#getDefaults()
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
		 * The meta object literal for the '{@link GHA.Options.PERMISSION_SCOPES <em>PERMISSION SCOPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Options.PERMISSION_SCOPES
		 * @see GHA.Options.impl.OptionsPackageImpl#getPERMISSION_SCOPES()
		 * @generated
		 */
		EEnum PERMISSION_SCOPES = eINSTANCE.getPERMISSION_SCOPES();

		/**
		 * The meta object literal for the '{@link GHA.Options.PERMISSIONS <em>PERMISSIONS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Options.PERMISSIONS
		 * @see GHA.Options.impl.OptionsPackageImpl#getPERMISSIONS()
		 * @generated
		 */
		EEnum PERMISSIONS = eINSTANCE.getPERMISSIONS();

	}

} //OptionsPackage
