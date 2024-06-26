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
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getPreTIM <em>Pre TIM</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getOnTIM <em>On TIM</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet#getPostTIM <em>Post TIM</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformationSet()
 * @model
 * @generated
 */
public interface TransformationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre TIM</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre TIM</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformationSet_PreTIM()
	 * @model containment="true"
	 * @generated
	 */
	EList<TSMTransformation> getPreTIM();

	/**
	 * Returns the value of the '<em><b>On TIM</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On TIM</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformationSet_OnTIM()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getOnTIM();

	/**
	 * Returns the value of the '<em><b>Post TIM</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post TIM</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getTransformationSet_PostTIM()
	 * @model containment="true"
	 * @generated
	 */
	EList<TSMTransformation> getPostTIM();

} // TransformationSet
