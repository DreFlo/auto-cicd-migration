/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import d.fe.up.pt.cicd.metamodel.CICD.Step;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.NewStep#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getNewStep()
 * @model
 * @generated
 */
public interface NewStep extends EditStep, OutplaceTransformation {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference.
	 * @see #setStep(Step)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getNewStep_Step()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Step getStep();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.NewStep#getStep <em>Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' containment reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(Step value);

} // NewStep
