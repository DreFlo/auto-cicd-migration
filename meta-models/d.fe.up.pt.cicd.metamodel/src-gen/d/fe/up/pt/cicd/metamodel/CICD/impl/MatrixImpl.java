/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Matrix;
import d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis;
import d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl#getAxes <em>Axes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixImpl#getFailFast <em>Fail Fast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix {
	/**
	 * The cached value of the '{@link #getAxes() <em>Axes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxes()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixAxis> axes;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixCombination> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixCombination> excludes;

	/**
	 * The default value of the '{@link #getFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailFast()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FAIL_FAST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailFast()
	 * @generated
	 * @ordered
	 */
	protected Boolean failFast = FAIL_FAST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICDPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixAxis> getAxes() {
		if (axes == null) {
			axes = new EObjectContainmentEList<MatrixAxis>(MatrixAxis.class, this, CICDPackage.MATRIX__AXES);
		}
		return axes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixCombination> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<MatrixCombination>(MatrixCombination.class, this,
					CICDPackage.MATRIX__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixCombination> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<MatrixCombination>(MatrixCombination.class, this,
					CICDPackage.MATRIX__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFailFast() {
		return failFast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailFast(Boolean newFailFast) {
		Boolean oldFailFast = failFast;
		failFast = newFailFast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.MATRIX__FAIL_FAST, oldFailFast,
					failFast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.MATRIX__AXES:
			return ((InternalEList<?>) getAxes()).basicRemove(otherEnd, msgs);
		case CICDPackage.MATRIX__INCLUDES:
			return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd, msgs);
		case CICDPackage.MATRIX__EXCLUDES:
			return ((InternalEList<?>) getExcludes()).basicRemove(otherEnd, msgs);
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
		case CICDPackage.MATRIX__AXES:
			return getAxes();
		case CICDPackage.MATRIX__INCLUDES:
			return getIncludes();
		case CICDPackage.MATRIX__EXCLUDES:
			return getExcludes();
		case CICDPackage.MATRIX__FAIL_FAST:
			return getFailFast();
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
		case CICDPackage.MATRIX__AXES:
			getAxes().clear();
			getAxes().addAll((Collection<? extends MatrixAxis>) newValue);
			return;
		case CICDPackage.MATRIX__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends MatrixCombination>) newValue);
			return;
		case CICDPackage.MATRIX__EXCLUDES:
			getExcludes().clear();
			getExcludes().addAll((Collection<? extends MatrixCombination>) newValue);
			return;
		case CICDPackage.MATRIX__FAIL_FAST:
			setFailFast((Boolean) newValue);
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
		case CICDPackage.MATRIX__AXES:
			getAxes().clear();
			return;
		case CICDPackage.MATRIX__INCLUDES:
			getIncludes().clear();
			return;
		case CICDPackage.MATRIX__EXCLUDES:
			getExcludes().clear();
			return;
		case CICDPackage.MATRIX__FAIL_FAST:
			setFailFast(FAIL_FAST_EDEFAULT);
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
		case CICDPackage.MATRIX__AXES:
			return axes != null && !axes.isEmpty();
		case CICDPackage.MATRIX__INCLUDES:
			return includes != null && !includes.isEmpty();
		case CICDPackage.MATRIX__EXCLUDES:
			return excludes != null && !excludes.isEmpty();
		case CICDPackage.MATRIX__FAIL_FAST:
			return FAIL_FAST_EDEFAULT == null ? failFast != null : !FAIL_FAST_EDEFAULT.equals(failFast);
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
		result.append(" (failFast: ");
		result.append(failFast);
		result.append(')');
		return result.toString();
	}

} //MatrixImpl
