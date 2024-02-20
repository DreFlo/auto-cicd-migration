/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.Cache;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.CacheImpl#getCacheName <em>Cache Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.CacheImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.CacheImpl#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheImpl extends NonConditionalStepImpl implements Cache {
	/**
	 * The cached value of the '{@link #getCacheName() <em>Cache Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheName()
	 * @generated
	 * @ordered
	 */
	protected Expression cacheName;

	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> keys;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> paths;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCacheName() {
		return cacheName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCacheName(Expression newCacheName, NotificationChain msgs) {
		Expression oldCacheName = cacheName;
		cacheName = newCacheName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StepsPackage.CACHE__CACHE_NAME, oldCacheName, newCacheName);
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
	public void setCacheName(Expression newCacheName) {
		if (newCacheName != cacheName) {
			NotificationChain msgs = null;
			if (cacheName != null)
				msgs = ((InternalEObject) cacheName).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.CACHE__CACHE_NAME, null, msgs);
			if (newCacheName != null)
				msgs = ((InternalEObject) newCacheName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.CACHE__CACHE_NAME, null, msgs);
			msgs = basicSetCacheName(newCacheName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.CACHE__CACHE_NAME, newCacheName,
					newCacheName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<Expression>(Expression.class, this, StepsPackage.CACHE__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Expression>(Expression.class, this, StepsPackage.CACHE__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StepsPackage.CACHE__CACHE_NAME:
			return basicSetCacheName(null, msgs);
		case StepsPackage.CACHE__KEYS:
			return ((InternalEList<?>) getKeys()).basicRemove(otherEnd, msgs);
		case StepsPackage.CACHE__PATHS:
			return ((InternalEList<?>) getPaths()).basicRemove(otherEnd, msgs);
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
		case StepsPackage.CACHE__CACHE_NAME:
			return getCacheName();
		case StepsPackage.CACHE__KEYS:
			return getKeys();
		case StepsPackage.CACHE__PATHS:
			return getPaths();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StepsPackage.CACHE__CACHE_NAME:
			setCacheName((Expression) newValue);
			return;
		case StepsPackage.CACHE__KEYS:
			getKeys().clear();
			getKeys().addAll((Collection<? extends Expression>) newValue);
			return;
		case StepsPackage.CACHE__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends Expression>) newValue);
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
		case StepsPackage.CACHE__CACHE_NAME:
			setCacheName((Expression) null);
			return;
		case StepsPackage.CACHE__KEYS:
			getKeys().clear();
			return;
		case StepsPackage.CACHE__PATHS:
			getPaths().clear();
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
		case StepsPackage.CACHE__CACHE_NAME:
			return cacheName != null;
		case StepsPackage.CACHE__KEYS:
			return keys != null && !keys.isEmpty();
		case StepsPackage.CACHE__PATHS:
			return paths != null && !paths.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CacheImpl
