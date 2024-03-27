/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.SetupRemoteDockerStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setup Remote Docker Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SetupRemoteDockerStepImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.SetupRemoteDockerStepImpl#getDockerLayerCaching <em>Docker Layer Caching</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetupRemoteDockerStepImpl extends StepImpl implements SetupRemoteDockerStep {
	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Expression version;

	/**
	 * The cached value of the '{@link #getDockerLayerCaching() <em>Docker Layer Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerLayerCaching()
	 * @generated
	 * @ordered
	 */
	protected Expression dockerLayerCaching;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetupRemoteDockerStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.SETUP_REMOTE_DOCKER_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Expression newVersion, NotificationChain msgs) {
		Expression oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION, oldVersion, newVersion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(Expression newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject) version).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject) newVersion).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION,
					newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getDockerLayerCaching() {
		return dockerLayerCaching;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDockerLayerCaching(Expression newDockerLayerCaching, NotificationChain msgs) {
		Expression oldDockerLayerCaching = dockerLayerCaching;
		dockerLayerCaching = newDockerLayerCaching;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING, oldDockerLayerCaching,
					newDockerLayerCaching);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerLayerCaching(Expression newDockerLayerCaching) {
		if (newDockerLayerCaching != dockerLayerCaching) {
			NotificationChain msgs = null;
			if (dockerLayerCaching != null)
				msgs = ((InternalEObject) dockerLayerCaching).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING, null,
						msgs);
			if (newDockerLayerCaching != null)
				msgs = ((InternalEObject) newDockerLayerCaching).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING, null,
						msgs);
			msgs = basicSetDockerLayerCaching(newDockerLayerCaching, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING, newDockerLayerCaching,
					newDockerLayerCaching));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION:
			return basicSetVersion(null, msgs);
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING:
			return basicSetDockerLayerCaching(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION:
			return getVersion();
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING:
			return getDockerLayerCaching();
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
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION:
			setVersion((Expression) newValue);
			return;
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING:
			setDockerLayerCaching((Expression) newValue);
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
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION:
			setVersion((Expression) null);
			return;
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING:
			setDockerLayerCaching((Expression) null);
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
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__VERSION:
			return version != null;
		case CircleCIPackage.SETUP_REMOTE_DOCKER_STEP__DOCKER_LAYER_CACHING:
			return dockerLayerCaching != null;
		}
		return super.eIsSet(featureID);
	}

} //SetupRemoteDockerStepImpl
