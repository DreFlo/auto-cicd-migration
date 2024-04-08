/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformation()
 * @model abstract="true"
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES
	 * @see #setModel(MODEL_NAMES)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformation_Model()
	 * @model required="true"
	 * @generated
	 */
	MODEL_NAMES getModel();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODEL_NAMES
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MODEL_NAMES value);

} // Transformation
