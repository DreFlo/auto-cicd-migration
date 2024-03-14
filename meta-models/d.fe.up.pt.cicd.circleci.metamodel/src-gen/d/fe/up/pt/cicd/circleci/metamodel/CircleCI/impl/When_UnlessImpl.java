/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless;

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
 * An implementation of the model object '<em><b>When Unless</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl#getWhen_step <em>When step</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.When_UnlessImpl#getUnless_step <em>Unless step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class When_UnlessImpl extends MinimalEObjectImpl.Container implements When_Unless {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWhen_step() <em>When step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_step()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> when_step;

	/**
	 * The cached value of the '{@link #getUnless_step() <em>Unless step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnless_step()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> unless_step;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected When_UnlessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.WHEN_UNLESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WHEN_UNLESS__CONDITION, oldCondition,
					condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getWhen_step() {
		if (when_step == null) {
			when_step = new EObjectContainmentEList<Step>(Step.class, this, CircleCIPackage.WHEN_UNLESS__WHEN_STEP);
		}
		return when_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getUnless_step() {
		if (unless_step == null) {
			unless_step = new EObjectContainmentEList<Step>(Step.class, this, CircleCIPackage.WHEN_UNLESS__UNLESS_STEP);
		}
		return unless_step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.WHEN_UNLESS__WHEN_STEP:
			return ((InternalEList<?>) getWhen_step()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WHEN_UNLESS__UNLESS_STEP:
			return ((InternalEList<?>) getUnless_step()).basicRemove(otherEnd, msgs);
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
		case CircleCIPackage.WHEN_UNLESS__CONDITION:
			return getCondition();
		case CircleCIPackage.WHEN_UNLESS__WHEN_STEP:
			return getWhen_step();
		case CircleCIPackage.WHEN_UNLESS__UNLESS_STEP:
			return getUnless_step();
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
		case CircleCIPackage.WHEN_UNLESS__CONDITION:
			setCondition((String) newValue);
			return;
		case CircleCIPackage.WHEN_UNLESS__WHEN_STEP:
			getWhen_step().clear();
			getWhen_step().addAll((Collection<? extends Step>) newValue);
			return;
		case CircleCIPackage.WHEN_UNLESS__UNLESS_STEP:
			getUnless_step().clear();
			getUnless_step().addAll((Collection<? extends Step>) newValue);
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
		case CircleCIPackage.WHEN_UNLESS__CONDITION:
			setCondition(CONDITION_EDEFAULT);
			return;
		case CircleCIPackage.WHEN_UNLESS__WHEN_STEP:
			getWhen_step().clear();
			return;
		case CircleCIPackage.WHEN_UNLESS__UNLESS_STEP:
			getUnless_step().clear();
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
		case CircleCIPackage.WHEN_UNLESS__CONDITION:
			return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
		case CircleCIPackage.WHEN_UNLESS__WHEN_STEP:
			return when_step != null && !when_step.isEmpty();
		case CircleCIPackage.WHEN_UNLESS__UNLESS_STEP:
			return unless_step != null && !unless_step.isEmpty();
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //When_UnlessImpl
