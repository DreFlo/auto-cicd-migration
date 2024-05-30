/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CICD_AGENTS;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.NullDockerContainer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Null Docker Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.NullDockerContainerImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NullDockerContainerImpl extends AbstractDockerContainerImpl implements NullDockerContainer {
	/**
	 * The default value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected static final CICD_AGENTS AGENT_EDEFAULT = CICD_AGENTS.WINDOWS;
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected CICD_AGENTS agent = AGENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullDockerContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.NULL_DOCKER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICD_AGENTS getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgent(CICD_AGENTS newAgent) {
		CICD_AGENTS oldAgent = agent;
		agent = newAgent == null ? AGENT_EDEFAULT : newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.NULL_DOCKER_CONTAINER__AGENT,
					oldAgent, agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.NULL_DOCKER_CONTAINER__AGENT:
			return getAgent();
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
		case CircleCIPackage.NULL_DOCKER_CONTAINER__AGENT:
			setAgent((CICD_AGENTS) newValue);
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
		case CircleCIPackage.NULL_DOCKER_CONTAINER__AGENT:
			setAgent(AGENT_EDEFAULT);
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
		case CircleCIPackage.NULL_DOCKER_CONTAINER__AGENT:
			return agent != AGENT_EDEFAULT;
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
		result.append(" (agent: ");
		result.append(agent);
		result.append(')');
		return result.toString();
	}

} //NullDockerContainerImpl
