/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preset Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PresetAgent#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPresetAgent()
 * @model abstract="true"
 * @generated
 */
public interface PresetAgent extends Agent {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPresetAgent_Image()
	 * @model containment="true"
	 * @generated
	 */
	Expression getImage();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PresetAgent#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Expression value);

} // PresetAgent
