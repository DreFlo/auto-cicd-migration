/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations.BinaryOperationsPackage
 * @generated
 */
public interface BinaryOperationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BinaryOperationsFactory eINSTANCE = d.fe.up.pt.cicd.metamodel.CICD.Expressions.BinaryOperations.impl.BinaryOperationsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Binary Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Op</em>'.
	 * @generated
	 */
	BinaryOp createBinaryOp();

	/**
	 * Returns a new object of class '<em>Conjuntion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjuntion</em>'.
	 * @generated
	 */
	Conjuntion createConjuntion();

	/**
	 * Returns a new object of class '<em>Disjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disjunction</em>'.
	 * @generated
	 */
	Disjunction createDisjunction();

	/**
	 * Returns a new object of class '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Addition</em>'.
	 * @generated
	 */
	Addition createAddition();

	/**
	 * Returns a new object of class '<em>Subtraction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtraction</em>'.
	 * @generated
	 */
	Subtraction createSubtraction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BinaryOperationsPackage getBinaryOperationsPackage();

} //BinaryOperationsFactory
