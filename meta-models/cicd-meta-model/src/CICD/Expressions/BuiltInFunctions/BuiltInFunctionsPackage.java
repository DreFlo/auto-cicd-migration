/**
 */
package CICD.Expressions.BuiltInFunctions;

import CICD.Expressions.ExpressionsPackage;

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
 * @see CICD.Expressions.BuiltInFunctions.BuiltInFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface BuiltInFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BuiltInFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.d.fe.up.pt/CICD/Expressions/BuiltInFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BuiltInFunctions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuiltInFunctionsPackage eINSTANCE = CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionImpl <em>Built In Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionImpl
	 * @see CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getBuiltInFunction()
	 * @generated
	 */
	int BUILT_IN_FUNCTION = 0;

	/**
	 * The number of structural features of the '<em>Built In Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CICD.Expressions.BuiltInFunctions.BuiltInFunction <em>Built In Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Function</em>'.
	 * @see CICD.Expressions.BuiltInFunctions.BuiltInFunction
	 * @generated
	 */
	EClass getBuiltInFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuiltInFunctionsFactory getBuiltInFunctionsFactory();

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
		 * The meta object literal for the '{@link CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionImpl <em>Built In Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionImpl
		 * @see CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getBuiltInFunction()
		 * @generated
		 */
		EClass BUILT_IN_FUNCTION = eINSTANCE.getBuiltInFunction();

	}

} //BuiltInFunctionsPackage
