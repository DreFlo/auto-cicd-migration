/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edit Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.EditStep#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getEditStep()
 * @model
 * @generated
 */
public interface EditStep extends JobTransformation {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(Integer)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getEditStep_Index()
	 * @model required="true"
	 * @generated
	 */
	Integer getIndex();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.EditStep#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Integer value);

} // EditStep
