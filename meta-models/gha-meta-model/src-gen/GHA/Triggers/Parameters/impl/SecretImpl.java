/**
 */
package GHA.Triggers.Parameters.impl;

import GHA.Expressions.Expression;

import GHA.Triggers.Parameters.ParametersPackage;
import GHA.Triggers.Parameters.Secret;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.Triggers.Parameters.impl.SecretImpl#getIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretImpl extends ParameterImpl implements Secret {
	/**
	 * The cached value of the '{@link #getIsRequired() <em>Is Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRequired()
	 * @generated
	 * @ordered
	 */
	protected Expression isRequired;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.SECRET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getIsRequired() {
		return isRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsRequired(Expression newIsRequired, NotificationChain msgs) {
		Expression oldIsRequired = isRequired;
		isRequired = newIsRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ParametersPackage.SECRET__IS_REQUIRED, oldIsRequired, newIsRequired);
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
	public void setIsRequired(Expression newIsRequired) {
		if (newIsRequired != isRequired) {
			NotificationChain msgs = null;
			if (isRequired != null)
				msgs = ((InternalEObject) isRequired).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ParametersPackage.SECRET__IS_REQUIRED, null, msgs);
			if (newIsRequired != null)
				msgs = ((InternalEObject) newIsRequired).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ParametersPackage.SECRET__IS_REQUIRED, null, msgs);
			msgs = basicSetIsRequired(newIsRequired, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.SECRET__IS_REQUIRED, newIsRequired,
					newIsRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParametersPackage.SECRET__IS_REQUIRED:
			return basicSetIsRequired(null, msgs);
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
		case ParametersPackage.SECRET__IS_REQUIRED:
			return getIsRequired();
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
		case ParametersPackage.SECRET__IS_REQUIRED:
			setIsRequired((Expression) newValue);
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
		case ParametersPackage.SECRET__IS_REQUIRED:
			setIsRequired((Expression) null);
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
		case ParametersPackage.SECRET__IS_REQUIRED:
			return isRequired != null;
		}
		return super.eIsSet(featureID);
	}

} //SecretImpl
