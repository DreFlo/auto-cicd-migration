/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage
 * @generated
 */
public interface TransformationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationsFactory eINSTANCE = d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationsFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Transformation Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Set</em>'.
	 * @generated
	 */
	TransformationSet createTransformationSet();

	/**
	 * Returns a new object of class '<em>Change Plugin Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Plugin Transformation</em>'.
	 * @generated
	 */
	ChangePluginTransformation createChangePluginTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TransformationsPackage getTransformationsPackage();

} //TransformationsFactory
