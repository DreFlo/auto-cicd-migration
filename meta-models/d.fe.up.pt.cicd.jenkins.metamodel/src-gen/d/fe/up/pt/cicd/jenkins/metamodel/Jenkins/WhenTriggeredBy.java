/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Triggered By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getCause <em>Cause</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenTriggeredBy()
 * @model
 * @generated
 */
public interface WhenTriggeredBy extends When {
	/**
	 * Returns the value of the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' attribute.
	 * @see #setCause(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenTriggeredBy_Cause()
	 * @model required="true"
	 * @generated
	 */
	String getCause();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(String value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see #setDetail(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getWhenTriggeredBy_Detail()
	 * @model
	 * @generated
	 */
	String getDetail();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenTriggeredBy#getDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(String value);

} // WhenTriggeredBy
