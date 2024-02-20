/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.VariablesPackage
 * @generated
 */
public interface VariablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesFactory eINSTANCE = d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.impl.VariablesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Environment Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Variable</em>'.
	 * @generated
	 */
	EnvironmentVariable createEnvironmentVariable();

	/**
	 * Returns a new object of class '<em>Secret Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secret Variable</em>'.
	 * @generated
	 */
	SecretVariable createSecretVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VariablesPackage getVariablesPackage();

} //VariablesFactory
