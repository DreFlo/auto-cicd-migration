/**
 */
package GHA.Expressions.BuiltInFunctions.StatusCheckFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsPackage
 * @generated
 */
public interface StatusCheckFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatusCheckFunctionsFactory eINSTANCE = GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.impl.StatusCheckFunctionsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Always</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Always</em>'.
	 * @generated
	 */
	Always createAlways();

	/**
	 * Returns a new object of class '<em>Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Success</em>'.
	 * @generated
	 */
	Success createSuccess();

	/**
	 * Returns a new object of class '<em>Cancelled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancelled</em>'.
	 * @generated
	 */
	Cancelled createCancelled();

	/**
	 * Returns a new object of class '<em>Failure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure</em>'.
	 * @generated
	 */
	Failure createFailure();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatusCheckFunctionsPackage getStatusCheckFunctionsPackage();

} //StatusCheckFunctionsFactory
