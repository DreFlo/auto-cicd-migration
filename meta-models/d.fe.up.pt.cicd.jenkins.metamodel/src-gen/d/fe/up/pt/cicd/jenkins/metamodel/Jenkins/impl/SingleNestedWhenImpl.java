/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Nested When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.SingleNestedWhenImpl#getNestedWhen <em>Nested When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleNestedWhenImpl extends NestedWhenImpl implements SingleNestedWhen {
	/**
	 * The cached value of the '{@link #getNestedWhen() <em>Nested When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedWhen()
	 * @generated
	 * @ordered
	 */
	protected When nestedWhen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleNestedWhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.SINGLE_NESTED_WHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When getNestedWhen() {
		return nestedWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedWhen(When newNestedWhen, NotificationChain msgs) {
		When oldNestedWhen = nestedWhen;
		nestedWhen = newNestedWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN, oldNestedWhen, newNestedWhen);
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
	public void setNestedWhen(When newNestedWhen) {
		if (newNestedWhen != nestedWhen) {
			NotificationChain msgs = null;
			if (nestedWhen != null)
				msgs = ((InternalEObject) nestedWhen).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN, null, msgs);
			if (newNestedWhen != null)
				msgs = ((InternalEObject) newNestedWhen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN, null, msgs);
			msgs = basicSetNestedWhen(newNestedWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN,
					newNestedWhen, newNestedWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN:
			return basicSetNestedWhen(null, msgs);
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
		case JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN:
			return getNestedWhen();
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
		case JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN:
			setNestedWhen((When) newValue);
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
		case JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN:
			setNestedWhen((When) null);
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
		case JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN:
			return nestedWhen != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleNestedWhenImpl
