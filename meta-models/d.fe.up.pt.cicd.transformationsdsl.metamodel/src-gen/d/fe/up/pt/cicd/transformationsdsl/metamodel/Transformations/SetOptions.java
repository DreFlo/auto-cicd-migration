/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetOptions#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getSetOptions()
 * @model
 * @generated
 */
public interface SetOptions extends InplaceTransformation, ConditionalTransformation, TIMTransformation {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(String)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getSetOptions_Options()
	 * @model required="true"
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.SetOptions#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

} // SetOptions
