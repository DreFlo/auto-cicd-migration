/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Equals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getExpected <em>Expected</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenEquals()
 * @model
 * @generated
 */
public interface WhenEquals extends When {
	/**
	 * Returns the value of the '<em><b>Expected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected</em>' reference.
	 * @see #setExpected(Literal)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenEquals_Expected()
	 * @model required="true"
	 * @generated
	 */
	Literal getExpected();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getExpected <em>Expected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected</em>' reference.
	 * @see #getExpected()
	 * @generated
	 */
	void setExpected(Literal value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' reference.
	 * @see #setActual(Variable)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenEquals_Actual()
	 * @model required="true"
	 * @generated
	 */
	Variable getActual();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenEquals#getActual <em>Actual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(Variable value);

} // WhenEquals
