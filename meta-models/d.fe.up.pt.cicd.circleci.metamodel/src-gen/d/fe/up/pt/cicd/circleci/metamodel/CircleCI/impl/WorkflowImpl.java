/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Branch;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Trigger;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.When_Unless;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Workflow;

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
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl#getWhen_unless <em>When unless</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.WorkflowImpl#getBranch <em>Branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> trigger;

	/**
	 * The cached value of the '{@link #getWhen_unless() <em>When unless</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen_unless()
	 * @generated
	 * @ordered
	 */
	protected When_Unless when_unless;

	/**
	 * The cached value of the '{@link #getBranch() <em>Branch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch()
	 * @generated
	 * @ordered
	 */
	protected EList<Branch> branch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.WORKFLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WORKFLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WORKFLOW__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trigger> getTrigger() {
		if (trigger == null) {
			trigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, CircleCIPackage.WORKFLOW__TRIGGER);
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public When_Unless getWhen_unless() {
		return when_unless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen_unless(When_Unless newWhen_unless, NotificationChain msgs) {
		When_Unless oldWhen_unless = when_unless;
		when_unless = newWhen_unless;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.WORKFLOW__WHEN_UNLESS, oldWhen_unless, newWhen_unless);
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
	public void setWhen_unless(When_Unless newWhen_unless) {
		if (newWhen_unless != when_unless) {
			NotificationChain msgs = null;
			if (when_unless != null)
				msgs = ((InternalEObject) when_unless).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.WORKFLOW__WHEN_UNLESS, null, msgs);
			if (newWhen_unless != null)
				msgs = ((InternalEObject) newWhen_unless).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.WORKFLOW__WHEN_UNLESS, null, msgs);
			msgs = basicSetWhen_unless(newWhen_unless, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.WORKFLOW__WHEN_UNLESS, newWhen_unless,
					newWhen_unless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Branch> getBranch() {
		if (branch == null) {
			branch = new EObjectContainmentEList<Branch>(Branch.class, this, CircleCIPackage.WORKFLOW__BRANCH);
		}
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.WORKFLOW__TRIGGER:
			return ((InternalEList<?>) getTrigger()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.WORKFLOW__WHEN_UNLESS:
			return basicSetWhen_unless(null, msgs);
		case CircleCIPackage.WORKFLOW__BRANCH:
			return ((InternalEList<?>) getBranch()).basicRemove(otherEnd, msgs);
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
		case CircleCIPackage.WORKFLOW__NAME:
			return getName();
		case CircleCIPackage.WORKFLOW__VERSION:
			return getVersion();
		case CircleCIPackage.WORKFLOW__TRIGGER:
			return getTrigger();
		case CircleCIPackage.WORKFLOW__WHEN_UNLESS:
			return getWhen_unless();
		case CircleCIPackage.WORKFLOW__BRANCH:
			return getBranch();
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
		case CircleCIPackage.WORKFLOW__NAME:
			setName((String) newValue);
			return;
		case CircleCIPackage.WORKFLOW__VERSION:
			setVersion((String) newValue);
			return;
		case CircleCIPackage.WORKFLOW__TRIGGER:
			getTrigger().clear();
			getTrigger().addAll((Collection<? extends Trigger>) newValue);
			return;
		case CircleCIPackage.WORKFLOW__WHEN_UNLESS:
			setWhen_unless((When_Unless) newValue);
			return;
		case CircleCIPackage.WORKFLOW__BRANCH:
			getBranch().clear();
			getBranch().addAll((Collection<? extends Branch>) newValue);
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
		case CircleCIPackage.WORKFLOW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCIPackage.WORKFLOW__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case CircleCIPackage.WORKFLOW__TRIGGER:
			getTrigger().clear();
			return;
		case CircleCIPackage.WORKFLOW__WHEN_UNLESS:
			setWhen_unless((When_Unless) null);
			return;
		case CircleCIPackage.WORKFLOW__BRANCH:
			getBranch().clear();
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
		case CircleCIPackage.WORKFLOW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCIPackage.WORKFLOW__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case CircleCIPackage.WORKFLOW__TRIGGER:
			return trigger != null && !trigger.isEmpty();
		case CircleCIPackage.WORKFLOW__WHEN_UNLESS:
			return when_unless != null;
		case CircleCIPackage.WORKFLOW__BRANCH:
			return branch != null && !branch.isEmpty();
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //WorkflowImpl
