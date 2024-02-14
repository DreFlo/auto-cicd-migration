/**
 */
package CICD.Expressions.BuiltInFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CICD.Expressions.BuiltInFunctions.BuiltInFunctionsPackage
 * @generated
 */
public interface BuiltInFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuiltInFunctionsFactory eINSTANCE = CICD.Expressions.BuiltInFunctions.impl.BuiltInFunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Built In Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Built In Function</em>'.
	 * @generated
	 */
	BuiltInFunction createBuiltInFunction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BuiltInFunctionsPackage getBuiltInFunctionsPackage();

} //BuiltInFunctionsFactory
