/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.Expression;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.OptionedAgent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optioned Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl#getDocker <em>Docker</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.OptionedAgentImpl#getCustomWorkspace <em>Custom Workspace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionedAgentImpl extends AbstractAgentImpl implements OptionedAgent {
	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected Expression labels;

	/**
	 * The cached value of the '{@link #getDocker() <em>Docker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocker()
	 * @generated
	 * @ordered
	 */
	protected DockerContainer docker;

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
	protected OptionedAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.OPTIONED_AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLabels() {
		if (labels != null && labels.eIsProxy()) {
			InternalEObject oldLabels = (InternalEObject) labels;
			labels = (Expression) eResolveProxy(oldLabels);
			if (labels != oldLabels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JenkinsPackage.OPTIONED_AGENT__LABELS,
							oldLabels, labels));
			}
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLabels() {
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabels(Expression newLabels) {
		Expression oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.OPTIONED_AGENT__LABELS, oldLabels,
					labels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerContainer getDocker() {
		if (docker != null && docker.eIsProxy()) {
			InternalEObject oldDocker = (InternalEObject) docker;
			docker = (DockerContainer) eResolveProxy(oldDocker);
			if (docker != oldDocker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JenkinsPackage.OPTIONED_AGENT__DOCKER,
							oldDocker, docker));
			}
		}
		return docker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerContainer basicGetDocker() {
		return docker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocker(DockerContainer newDocker) {
		DockerContainer oldDocker = docker;
		docker = newDocker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.OPTIONED_AGENT__DOCKER, oldDocker,
					docker));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.OPTIONED_AGENT__CUSTOM_WORKSPACE,
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
		case JenkinsPackage.OPTIONED_AGENT__LABELS:
			if (resolve)
				return getLabels();
			return basicGetLabels();
		case JenkinsPackage.OPTIONED_AGENT__DOCKER:
			if (resolve)
				return getDocker();
			return basicGetDocker();
		case JenkinsPackage.OPTIONED_AGENT__CUSTOM_WORKSPACE:
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
		case JenkinsPackage.OPTIONED_AGENT__LABELS:
			setLabels((Expression) newValue);
			return;
		case JenkinsPackage.OPTIONED_AGENT__DOCKER:
			setDocker((DockerContainer) newValue);
			return;
		case JenkinsPackage.OPTIONED_AGENT__CUSTOM_WORKSPACE:
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
		case JenkinsPackage.OPTIONED_AGENT__LABELS:
			setLabels((Expression) null);
			return;
		case JenkinsPackage.OPTIONED_AGENT__DOCKER:
			setDocker((DockerContainer) null);
			return;
		case JenkinsPackage.OPTIONED_AGENT__CUSTOM_WORKSPACE:
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
		case JenkinsPackage.OPTIONED_AGENT__LABELS:
			return labels != null;
		case JenkinsPackage.OPTIONED_AGENT__DOCKER:
			return docker != null;
		case JenkinsPackage.OPTIONED_AGENT__CUSTOM_WORKSPACE:
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

} //OptionedAgentImpl
