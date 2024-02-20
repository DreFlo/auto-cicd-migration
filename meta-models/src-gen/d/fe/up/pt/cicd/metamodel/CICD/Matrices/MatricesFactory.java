/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Matrices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.Matrices.MatricesPackage
 * @generated
 */
public interface MatricesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MatricesFactory eINSTANCE = d.fe.up.pt.cicd.metamodel.CICD.Matrices.impl.MatricesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix</em>'.
	 * @generated
	 */
	Matrix createMatrix();

	/**
	 * Returns a new object of class '<em>Matrix Axis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix Axis</em>'.
	 * @generated
	 */
	MatrixAxis createMatrixAxis();

	/**
	 * Returns a new object of class '<em>Matrix Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matrix Combination</em>'.
	 * @generated
	 */
	MatrixCombination createMatrixCombination();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MatricesPackage getMatricesPackage();

} //MatricesFactory
