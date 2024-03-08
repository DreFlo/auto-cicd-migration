/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.SingleNestedWhen;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When;

import org.eclipse.emf.common.notify.Notification;

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
	 * The cached value of the '{@link #getNestedWhen() <em>Nested When</em>}' reference.
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
		if (nestedWhen != null && nestedWhen.eIsProxy()) {
			InternalEObject oldNestedWhen = (InternalEObject) nestedWhen;
			nestedWhen = (When) eResolveProxy(oldNestedWhen);
			if (nestedWhen != oldNestedWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN, oldNestedWhen, nestedWhen));
			}
		}
		return nestedWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public When basicGetNestedWhen() {
		return nestedWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNestedWhen(When newNestedWhen) {
		When oldNestedWhen = nestedWhen;
		nestedWhen = newNestedWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.SINGLE_NESTED_WHEN__NESTED_WHEN,
					oldNestedWhen, nestedWhen));
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
			if (resolve)
				return getNestedWhen();
			return basicGetNestedWhen();
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
