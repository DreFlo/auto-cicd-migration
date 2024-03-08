/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upstream Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.UpstreamTrigger#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getUpstreamTrigger()
 * @model
 * @generated
 */
public interface UpstreamTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' attribute list.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getUpstreamTrigger_Jobs()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getJobs();

} // UpstreamTrigger
