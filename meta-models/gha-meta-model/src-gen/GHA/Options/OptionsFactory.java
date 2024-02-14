/**
 */
package GHA.Options;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see GHA.Options.OptionsPackage
 * @generated
 */
public interface OptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptionsFactory eINSTANCE = GHA.Options.impl.OptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Concurrency Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency Group</em>'.
	 * @generated
	 */
	ConcurrencyGroup createConcurrencyGroup();

	/**
	 * Returns a new object of class '<em>Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defaults</em>'.
	 * @generated
	 */
	Defaults createDefaults();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OptionsPackage getOptionsPackage();

} //OptionsFactory
