/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.NodeAgent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.NodeAgentImpl#getCustomWorkspace <em>Custom Workspace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeAgentImpl extends LabelAgentImpl implements NodeAgent {
	/**
	 * The default value of the '{@link #getCustomWorkspace() <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomWorkspace()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_WORKSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomWorkspace() <em>Custom Workspace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomWorkspace()
	 * @generated
	 * @ordered
	 */
	protected String customWorkspace = CUSTOM_WORKSPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.NODE_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomWorkspace() {
		return customWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomWorkspace(String newCustomWorkspace) {
		String oldCustomWorkspace = customWorkspace;
		customWorkspace = newCustomWorkspace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.NODE_AGENT__CUSTOM_WORKSPACE,
					oldCustomWorkspace, customWorkspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JenkinsPackage.NODE_AGENT__CUSTOM_WORKSPACE:
			return getCustomWorkspace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JenkinsPackage.NODE_AGENT__CUSTOM_WORKSPACE:
			setCustomWorkspace((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JenkinsPackage.NODE_AGENT__CUSTOM_WORKSPACE:
			setCustomWorkspace(CUSTOM_WORKSPACE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JenkinsPackage.NODE_AGENT__CUSTOM_WORKSPACE:
			return CUSTOM_WORKSPACE_EDEFAULT == null ? customWorkspace != null
					: !CUSTOM_WORKSPACE_EDEFAULT.equals(customWorkspace);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (customWorkspace: ");
		result.append(customWorkspace);
		result.append(')');
		return result.toString();
	}

} //NodeAgentImpl
