/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac Os</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs#getXcode <em>Xcode</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getMacOs()
 * @model
 * @generated
 */
public interface MacOs extends Execution_Env {
	/**
	 * Returns the value of the '<em><b>Xcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xcode</em>' attribute.
	 * @see #setXcode(String)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getMacOs_Xcode()
	 * @model
	 * @generated
	 */
	String getXcode();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOs#getXcode <em>Xcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xcode</em>' attribute.
	 * @see #getXcode()
	 * @generated
	 */
	void setXcode(String value);

} // MacOs
