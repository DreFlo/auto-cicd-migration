/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Parameters;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Tool_Framework;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Attribute;

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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl#getWhen_attribute <em>When attribute</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.StepImpl#getTool_framework <em>Tool framework</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameters> parameters;

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
	 * The cached value of the '{@link #getWhen_attribute() <em>When attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_attribute()
	 * @generated
	 * @ordered
	 */
	protected When_Attribute when_attribute;

	/**
	 * The cached value of the '{@link #getTool_framework() <em>Tool framework</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool_framework()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool_Framework> tool_framework;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameters> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameters>(Parameters.class, this,
					CircleCIPackage.STEP__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Attribute getWhen_attribute() {
		return when_attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen_attribute(When_Attribute newWhen_attribute, NotificationChain msgs) {
		When_Attribute oldWhen_attribute = when_attribute;
		when_attribute = newWhen_attribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.STEP__WHEN_ATTRIBUTE, oldWhen_attribute, newWhen_attribute);
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
	public void setWhen_attribute(When_Attribute newWhen_attribute) {
		if (newWhen_attribute != when_attribute) {
			NotificationChain msgs = null;
			if (when_attribute != null)
				msgs = ((InternalEObject) when_attribute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.STEP__WHEN_ATTRIBUTE, null, msgs);
			if (newWhen_attribute != null)
				msgs = ((InternalEObject) newWhen_attribute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.STEP__WHEN_ATTRIBUTE, null, msgs);
			msgs = basicSetWhen_attribute(newWhen_attribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.STEP__WHEN_ATTRIBUTE,
					newWhen_attribute, newWhen_attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tool_Framework> getTool_framework() {
		if (tool_framework == null) {
			tool_framework = new EObjectContainmentEList<Tool_Framework>(Tool_Framework.class, this,
					CircleCIPackage.STEP__TOOL_FRAMEWORK);
		}
		return tool_framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.STEP__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.STEP__WHEN_ATTRIBUTE:
			return basicSetWhen_attribute(null, msgs);
		case CircleCIPackage.STEP__TOOL_FRAMEWORK:
			return ((InternalEList<?>) getTool_framework()).basicRemove(otherEnd, msgs);
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
		case CircleCIPackage.STEP__PARAMETERS:
			return getParameters();
		case CircleCIPackage.STEP__NAME:
			return getName();
		case CircleCIPackage.STEP__WHEN_ATTRIBUTE:
			return getWhen_attribute();
		case CircleCIPackage.STEP__TOOL_FRAMEWORK:
			return getTool_framework();
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
		case CircleCIPackage.STEP__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends Parameters>) newValue);
			return;
		case CircleCIPackage.STEP__NAME:
			setName((String) newValue);
			return;
		case CircleCIPackage.STEP__WHEN_ATTRIBUTE:
			setWhen_attribute((When_Attribute) newValue);
			return;
		case CircleCIPackage.STEP__TOOL_FRAMEWORK:
			getTool_framework().clear();
			getTool_framework().addAll((Collection<? extends Tool_Framework>) newValue);
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
		case CircleCIPackage.STEP__PARAMETERS:
			getParameters().clear();
			return;
		case CircleCIPackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCIPackage.STEP__WHEN_ATTRIBUTE:
			setWhen_attribute((When_Attribute) null);
			return;
		case CircleCIPackage.STEP__TOOL_FRAMEWORK:
			getTool_framework().clear();
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
		case CircleCIPackage.STEP__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case CircleCIPackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCIPackage.STEP__WHEN_ATTRIBUTE:
			return when_attribute != null;
		case CircleCIPackage.STEP__TOOL_FRAMEWORK:
			return tool_framework != null && !tool_framework.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepImpl
