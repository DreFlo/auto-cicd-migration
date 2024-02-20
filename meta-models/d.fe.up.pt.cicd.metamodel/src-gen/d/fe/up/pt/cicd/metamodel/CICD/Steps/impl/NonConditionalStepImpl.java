/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.NonConditionalStep;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.NonConditionalStepImpl#getId <em>Id</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.NonConditionalStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.NonConditionalStepImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.NonConditionalStepImpl#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.NonConditionalStepImpl#isAllowFailure <em>Allow Failure</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NonConditionalStepImpl extends StepImpl implements NonConditionalStep {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<EnvironmentVariable, Expression>> environmentVariables;

	/**
	 * The default value of the '{@link #getTimeoutMinutes() <em>Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TIMEOUT_MINUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeoutMinutes() <em>Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected Integer timeoutMinutes = TIMEOUT_MINUTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean allowFailure = ALLOW_FAILURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonConditionalStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.NON_CONDITIONAL_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.NON_CONDITIONAL_STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.NON_CONDITIONAL_STEP__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<EnvironmentVariable, Expression>> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EObjectResolvingEList<Map.Entry<EnvironmentVariable, Expression>>(Entry.class,
					this, StepsPackage.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTimeoutMinutes() {
		return timeoutMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutMinutes(Integer newTimeoutMinutes) {
		Integer oldTimeoutMinutes = timeoutMinutes;
		timeoutMinutes = newTimeoutMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES,
					oldTimeoutMinutes, timeoutMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowFailure() {
		return allowFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowFailure(boolean newAllowFailure) {
		boolean oldAllowFailure = allowFailure;
		allowFailure = newAllowFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.NON_CONDITIONAL_STEP__ALLOW_FAILURE,
					oldAllowFailure, allowFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StepsPackage.NON_CONDITIONAL_STEP__ID:
			return getId();
		case StepsPackage.NON_CONDITIONAL_STEP__NAME:
			return getName();
		case StepsPackage.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES:
			return getEnvironmentVariables();
		case StepsPackage.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES:
			return getTimeoutMinutes();
		case StepsPackage.NON_CONDITIONAL_STEP__ALLOW_FAILURE:
			return isAllowFailure();
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
		case StepsPackage.NON_CONDITIONAL_STEP__ID:
			setId((String) newValue);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__NAME:
			setName((String) newValue);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			getEnvironmentVariables()
					.addAll((Collection<? extends Map.Entry<EnvironmentVariable, Expression>>) newValue);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES:
			setTimeoutMinutes((Integer) newValue);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__ALLOW_FAILURE:
			setAllowFailure((Boolean) newValue);
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
		case StepsPackage.NON_CONDITIONAL_STEP__ID:
			setId(ID_EDEFAULT);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES:
			setTimeoutMinutes(TIMEOUT_MINUTES_EDEFAULT);
			return;
		case StepsPackage.NON_CONDITIONAL_STEP__ALLOW_FAILURE:
			setAllowFailure(ALLOW_FAILURE_EDEFAULT);
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
		case StepsPackage.NON_CONDITIONAL_STEP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case StepsPackage.NON_CONDITIONAL_STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StepsPackage.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
		case StepsPackage.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES:
			return TIMEOUT_MINUTES_EDEFAULT == null ? timeoutMinutes != null
					: !TIMEOUT_MINUTES_EDEFAULT.equals(timeoutMinutes);
		case StepsPackage.NON_CONDITIONAL_STEP__ALLOW_FAILURE:
			return allowFailure != ALLOW_FAILURE_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", timeoutMinutes: ");
		result.append(timeoutMinutes);
		result.append(", allowFailure: ");
		result.append(allowFailure);
		result.append(')');
		return result.toString();
	}

} //NonConditionalStepImpl
