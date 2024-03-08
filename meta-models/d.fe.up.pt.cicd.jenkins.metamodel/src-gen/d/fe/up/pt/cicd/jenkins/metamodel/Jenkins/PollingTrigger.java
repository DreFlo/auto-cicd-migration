/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polling Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getPollingTrigger()
 * @model
 * @generated
 */
public interface PollingTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron</em>' attribute.
	 * @see #setCron(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getPollingTrigger_Cron()
	 * @model required="true"
	 * @generated
	 */
	String getCron();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.PollingTrigger#getCron <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron</em>' attribute.
	 * @see #getCron()
	 * @generated
	 */
	void setCron(String value);

} // PollingTrigger
