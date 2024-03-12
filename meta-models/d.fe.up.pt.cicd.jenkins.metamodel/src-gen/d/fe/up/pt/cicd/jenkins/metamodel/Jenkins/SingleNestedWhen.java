/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Nested When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen#getNestedWhen <em>Nested When</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getSingleNestedWhen()
 * @model
 * @generated
 */
public interface SingleNestedWhen extends NestedWhen {
	/**
	 * Returns the value of the '<em><b>Nested When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested When</em>' containment reference.
	 * @see #setNestedWhen(When)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getSingleNestedWhen_NestedWhen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	When getNestedWhen();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen#getNestedWhen <em>Nested When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested When</em>' containment reference.
	 * @see #getNestedWhen()
	 * @generated
	 */
	void setNestedWhen(When value);

} // SingleNestedWhen
