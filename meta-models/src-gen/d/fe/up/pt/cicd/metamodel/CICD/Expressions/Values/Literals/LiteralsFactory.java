/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.LiteralsPackage
 * @generated
 */
public interface LiteralsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralsFactory eINSTANCE = d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Literals.impl.LiteralsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Literal</em>'.
	 * @generated
	 */
	NumberLiteral createNumberLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LiteralsPackage getLiteralsPackage();

} //LiteralsFactory