/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_AttributeImpl#getWhen_type <em>When type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class When_AttributeImpl extends MinimalEObjectImpl.Container implements When_Attribute {
	/**
	 * The default value of the '{@link #getWhen_type() <em>When type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_type()
	 * @generated
	 * @ordered
	 */
	protected static final WHEN_TYPE WHEN_TYPE_EDEFAULT = WHEN_TYPE.ON_SUCCESS;

	/**
	 * The cached value of the '{@link #getWhen_type() <em>When type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_type()
	 * @generated
	 * @ordered
	 */
	protected WHEN_TYPE when_type = WHEN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected When_AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.WHEN_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WHEN_TYPE getWhen_type() {
		return when_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen_type(WHEN_TYPE newWhen_type) {
		WHEN_TYPE oldWhen_type = when_type;
		when_type = newWhen_type == null ? WHEN_TYPE_EDEFAULT : newWhen_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WHEN_ATTRIBUTE__WHEN_TYPE,
					oldWhen_type, when_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.WHEN_ATTRIBUTE__WHEN_TYPE:
			return getWhen_type();
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
		case CircleCIPackage.WHEN_ATTRIBUTE__WHEN_TYPE:
			setWhen_type((WHEN_TYPE) newValue);
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
		case CircleCIPackage.WHEN_ATTRIBUTE__WHEN_TYPE:
			setWhen_type(WHEN_TYPE_EDEFAULT);
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
		case CircleCIPackage.WHEN_ATTRIBUTE__WHEN_TYPE:
			return when_type != WHEN_TYPE_EDEFAULT;
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
		result.append(" (when_type: ");
		result.append(when_type);
		result.append(')');
		return result.toString();
	}

} //When_AttributeImpl
