/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformationSet()
 * @model
 * @generated
 */
public interface TransformationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformationSet_Transformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformations();

} // TransformationSet
