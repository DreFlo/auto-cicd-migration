/**
 */
package GHA.Expressions.BinaryOperators.EqualityOperators;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsPackage
 * @generated
 */
public interface EqualityOperatorsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EqualityOperatorsFactory eINSTANCE = GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality</em>'.
	 * @generated
	 */
	Equality createEquality();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EqualityOperatorsPackage getEqualityOperatorsPackage();

} //EqualityOperatorsFactory
