/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getTool <em>Tool</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS
	 * @see #setTool(SUPPORTED_TOOLS)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getTool_Tool()
	 * @model required="true"
	 * @generated
	 */
	SUPPORTED_TOOLS getTool();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SUPPORTED_TOOLS
	 * @see #getTool()
	 * @generated
	 */
	void setTool(SUPPORTED_TOOLS value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage#getTool_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Tool#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Tool
