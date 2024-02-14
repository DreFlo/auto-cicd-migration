/**
 */
package GHA.Expressions.BuiltInFunctions.StatusCheckFunctions;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface StatusCheckFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StatusCheckFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA/Expressions/BuiltInFunctions/StatusCheckFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StatusCheckFunctions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatusCheckFunctionsPackage eINSTANCE = GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckImpl <em>Status Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckImpl
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getStatusCheck()
	 * @generated
	 */
	int STATUS_CHECK = 0;

	/**
	 * The number of structural features of the '<em>Status Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHECK_FEATURE_COUNT = BuiltInFunctionsPackage.BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Status Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_CHECK_OPERATION_COUNT = BuiltInFunctionsPackage.BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.AlwaysImpl <em>Always</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.AlwaysImpl
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getAlways()
	 * @generated
	 */
	int ALWAYS = 1;

	/**
	 * The number of structural features of the '<em>Always</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Always</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALWAYS_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.SuccessImpl <em>Success</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.SuccessImpl
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getSuccess()
	 * @generated
	 */
	int SUCCESS = 2;

	/**
	 * The number of structural features of the '<em>Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Success</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCESS_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.CancelledImpl <em>Cancelled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.CancelledImpl
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getCancelled()
	 * @generated
	 */
	int CANCELLED = 3;

	/**
	 * The number of structural features of the '<em>Cancelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELLED_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cancelled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCELLED_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.FailureImpl <em>Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.FailureImpl
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getFailure()
	 * @generated
	 */
	int FAILURE = 4;

	/**
	 * The number of structural features of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_FEATURE_COUNT = STATUS_CHECK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILURE_OPERATION_COUNT = STATUS_CHECK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheck <em>Status Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Check</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheck
	 * @generated
	 */
	EClass getStatusCheck();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Always <em>Always</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Always</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Always
	 * @generated
	 */
	EClass getAlways();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Success <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Success</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Success
	 * @generated
	 */
	EClass getSuccess();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Cancelled <em>Cancelled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancelled</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Cancelled
	 * @generated
	 */
	EClass getCancelled();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Failure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failure</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.Failure
	 * @generated
	 */
	EClass getFailure();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatusCheckFunctionsFactory getStatusCheckFunctionsFactory();

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
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckImpl <em>Status Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckImpl
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getStatusCheck()
		 * @generated
		 */
		EClass STATUS_CHECK = eINSTANCE.getStatusCheck();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.AlwaysImpl <em>Always</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.AlwaysImpl
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getAlways()
		 * @generated
		 */
		EClass ALWAYS = eINSTANCE.getAlways();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.SuccessImpl <em>Success</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.SuccessImpl
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getSuccess()
		 * @generated
		 */
		EClass SUCCESS = eINSTANCE.getSuccess();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.CancelledImpl <em>Cancelled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.CancelledImpl
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getCancelled()
		 * @generated
		 */
		EClass CANCELLED = eINSTANCE.getCancelled();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.FailureImpl <em>Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.FailureImpl
		 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsPackageImpl#getFailure()
		 * @generated
		 */
		EClass FAILURE = eINSTANCE.getFailure();

	}

} //StatusCheckFunctionsPackage
