/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MachineExecutor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MachineExecutorImpl#getImage <em>Image</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.MachineExecutorImpl#getDockerLayerCaching <em>Docker Layer Caching</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineExecutorImpl extends ExecutorImpl implements MachineExecutor {
	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Expression image;

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
	protected MachineExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.MACHINE_EXECUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Expression newImage, NotificationChain msgs) {
		Expression oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.MACHINE_EXECUTOR__IMAGE, oldImage, newImage);
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
	public void setImage(Expression newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject) image).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.MACHINE_EXECUTOR__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject) newImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.MACHINE_EXECUTOR__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.MACHINE_EXECUTOR__IMAGE, newImage,
					newImage));
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
					CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING, oldDockerLayerCaching,
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
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING, null, msgs);
			if (newDockerLayerCaching != null)
				msgs = ((InternalEObject) newDockerLayerCaching).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING, null, msgs);
			msgs = basicSetDockerLayerCaching(newDockerLayerCaching, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING, newDockerLayerCaching,
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
		case CircleCIPackage.MACHINE_EXECUTOR__IMAGE:
			return basicSetImage(null, msgs);
		case CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING:
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
		case CircleCIPackage.MACHINE_EXECUTOR__IMAGE:
			return getImage();
		case CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING:
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
		case CircleCIPackage.MACHINE_EXECUTOR__IMAGE:
			setImage((Expression) newValue);
			return;
		case CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING:
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
		case CircleCIPackage.MACHINE_EXECUTOR__IMAGE:
			setImage((Expression) null);
			return;
		case CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING:
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
		case CircleCIPackage.MACHINE_EXECUTOR__IMAGE:
			return image != null;
		case CircleCIPackage.MACHINE_EXECUTOR__DOCKER_LAYER_CACHING:
			return dockerLayerCaching != null;
		}
		return super.eIsSet(featureID);
	}

} //MachineExecutorImpl
