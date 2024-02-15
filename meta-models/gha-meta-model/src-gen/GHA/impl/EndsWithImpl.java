/**
 */
package GHA.impl;

import GHA.EndsWith;
import GHA.Expression;
import GHA.GHAPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ends With</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.impl.EndsWithImpl#getSearchString <em>Search String</em>}</li>
 *   <li>{@link GHA.impl.EndsWithImpl#getSearchValue <em>Search Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndsWithImpl extends BuiltInFunctionCallImpl implements EndsWith {
	/**
	 * The cached value of the '{@link #getSearchString() <em>Search String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchString()
	 * @generated
	 * @ordered
	 */
	protected Expression searchString;

	/**
	 * The cached value of the '{@link #getSearchValue() <em>Search Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchValue()
	 * @generated
	 * @ordered
	 */
	protected Expression searchValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndsWithImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHAPackage.Literals.ENDS_WITH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSearchString() {
		return searchString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchString(Expression newSearchString, NotificationChain msgs) {
		Expression oldSearchString = searchString;
		searchString = newSearchString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHAPackage.ENDS_WITH__SEARCH_STRING, oldSearchString, newSearchString);
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
	public void setSearchString(Expression newSearchString) {
		if (newSearchString != searchString) {
			NotificationChain msgs = null;
			if (searchString != null)
				msgs = ((InternalEObject) searchString).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHAPackage.ENDS_WITH__SEARCH_STRING, null, msgs);
			if (newSearchString != null)
				msgs = ((InternalEObject) newSearchString).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHAPackage.ENDS_WITH__SEARCH_STRING, null, msgs);
			msgs = basicSetSearchString(newSearchString, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHAPackage.ENDS_WITH__SEARCH_STRING, newSearchString,
					newSearchString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getSearchValue() {
		return searchValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchValue(Expression newSearchValue, NotificationChain msgs) {
		Expression oldSearchValue = searchValue;
		searchValue = newSearchValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GHAPackage.ENDS_WITH__SEARCH_VALUE, oldSearchValue, newSearchValue);
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
	public void setSearchValue(Expression newSearchValue) {
		if (newSearchValue != searchValue) {
			NotificationChain msgs = null;
			if (searchValue != null)
				msgs = ((InternalEObject) searchValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GHAPackage.ENDS_WITH__SEARCH_VALUE, null, msgs);
			if (newSearchValue != null)
				msgs = ((InternalEObject) newSearchValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GHAPackage.ENDS_WITH__SEARCH_VALUE, null, msgs);
			msgs = basicSetSearchValue(newSearchValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHAPackage.ENDS_WITH__SEARCH_VALUE, newSearchValue,
					newSearchValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHAPackage.ENDS_WITH__SEARCH_STRING:
			return basicSetSearchString(null, msgs);
		case GHAPackage.ENDS_WITH__SEARCH_VALUE:
			return basicSetSearchValue(null, msgs);
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
		case GHAPackage.ENDS_WITH__SEARCH_STRING:
			return getSearchString();
		case GHAPackage.ENDS_WITH__SEARCH_VALUE:
			return getSearchValue();
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
		case GHAPackage.ENDS_WITH__SEARCH_STRING:
			setSearchString((Expression) newValue);
			return;
		case GHAPackage.ENDS_WITH__SEARCH_VALUE:
			setSearchValue((Expression) newValue);
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
		case GHAPackage.ENDS_WITH__SEARCH_STRING:
			setSearchString((Expression) null);
			return;
		case GHAPackage.ENDS_WITH__SEARCH_VALUE:
			setSearchValue((Expression) null);
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
		case GHAPackage.ENDS_WITH__SEARCH_STRING:
			return searchString != null;
		case GHAPackage.ENDS_WITH__SEARCH_VALUE:
			return searchValue != null;
		}
		return super.eIsSet(featureID);
	}

} //EndsWithImpl
