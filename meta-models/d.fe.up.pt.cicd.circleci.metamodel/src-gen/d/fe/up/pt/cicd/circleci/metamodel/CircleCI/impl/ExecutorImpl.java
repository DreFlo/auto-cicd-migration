/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Executor;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl#getResourceClass <em>Resource Class</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.ExecutorImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutorImpl extends MinimalEObjectImpl.Container implements Executor {
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
	 * The cached value of the '{@link #getResourceClass() <em>Resource Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceClass()
	 * @generated
	 * @ordered
	 */
	protected Expression resourceClass;

	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected Expression shell;

	/**
	 * The cached value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected Expression workingDirectory;

	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<VariableDeclaration, Expression> environmentVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.EXECUTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.EXECUTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getResourceClass() {
		return resourceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceClass(Expression newResourceClass, NotificationChain msgs) {
		Expression oldResourceClass = resourceClass;
		resourceClass = newResourceClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.EXECUTOR__RESOURCE_CLASS, oldResourceClass, newResourceClass);
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
	public void setResourceClass(Expression newResourceClass) {
		if (newResourceClass != resourceClass) {
			NotificationChain msgs = null;
			if (resourceClass != null)
				msgs = ((InternalEObject) resourceClass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.EXECUTOR__RESOURCE_CLASS, null, msgs);
			if (newResourceClass != null)
				msgs = ((InternalEObject) newResourceClass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.EXECUTOR__RESOURCE_CLASS, null, msgs);
			msgs = basicSetResourceClass(newResourceClass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.EXECUTOR__RESOURCE_CLASS,
					newResourceClass, newResourceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShell(Expression newShell, NotificationChain msgs) {
		Expression oldShell = shell;
		shell = newShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.EXECUTOR__SHELL, oldShell, newShell);
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
	public void setShell(Expression newShell) {
		if (newShell != shell) {
			NotificationChain msgs = null;
			if (shell != null)
				msgs = ((InternalEObject) shell).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.EXECUTOR__SHELL, null, msgs);
			if (newShell != null)
				msgs = ((InternalEObject) newShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.EXECUTOR__SHELL, null, msgs);
			msgs = basicSetShell(newShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.EXECUTOR__SHELL, newShell, newShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkingDirectory(Expression newWorkingDirectory, NotificationChain msgs) {
		Expression oldWorkingDirectory = workingDirectory;
		workingDirectory = newWorkingDirectory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.EXECUTOR__WORKING_DIRECTORY, oldWorkingDirectory, newWorkingDirectory);
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
	public void setWorkingDirectory(Expression newWorkingDirectory) {
		if (newWorkingDirectory != workingDirectory) {
			NotificationChain msgs = null;
			if (workingDirectory != null)
				msgs = ((InternalEObject) workingDirectory).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.EXECUTOR__WORKING_DIRECTORY, null, msgs);
			if (newWorkingDirectory != null)
				msgs = ((InternalEObject) newWorkingDirectory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.EXECUTOR__WORKING_DIRECTORY, null, msgs);
			msgs = basicSetWorkingDirectory(newWorkingDirectory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.EXECUTOR__WORKING_DIRECTORY,
					newWorkingDirectory, newWorkingDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<VariableDeclaration, Expression> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EcoreEMap<VariableDeclaration, Expression>(
					CircleCIPackage.Literals.VARIABLE_ASSIGNMENT, VariableAssignmentImpl.class, this,
					CircleCIPackage.EXECUTOR__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.EXECUTOR__RESOURCE_CLASS:
			return basicSetResourceClass(null, msgs);
		case CircleCIPackage.EXECUTOR__SHELL:
			return basicSetShell(null, msgs);
		case CircleCIPackage.EXECUTOR__WORKING_DIRECTORY:
			return basicSetWorkingDirectory(null, msgs);
		case CircleCIPackage.EXECUTOR__ENVIRONMENT_VARIABLES:
			return ((InternalEList<?>) getEnvironmentVariables()).basicRemove(otherEnd, msgs);
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
		case CircleCIPackage.EXECUTOR__NAME:
			return getName();
		case CircleCIPackage.EXECUTOR__RESOURCE_CLASS:
			return getResourceClass();
		case CircleCIPackage.EXECUTOR__SHELL:
			return getShell();
		case CircleCIPackage.EXECUTOR__WORKING_DIRECTORY:
			return getWorkingDirectory();
		case CircleCIPackage.EXECUTOR__ENVIRONMENT_VARIABLES:
			if (coreType)
				return getEnvironmentVariables();
			else
				return getEnvironmentVariables().map();
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
		case CircleCIPackage.EXECUTOR__NAME:
			setName((String) newValue);
			return;
		case CircleCIPackage.EXECUTOR__RESOURCE_CLASS:
			setResourceClass((Expression) newValue);
			return;
		case CircleCIPackage.EXECUTOR__SHELL:
			setShell((Expression) newValue);
			return;
		case CircleCIPackage.EXECUTOR__WORKING_DIRECTORY:
			setWorkingDirectory((Expression) newValue);
			return;
		case CircleCIPackage.EXECUTOR__ENVIRONMENT_VARIABLES:
			((EStructuralFeature.Setting) getEnvironmentVariables()).set(newValue);
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
		case CircleCIPackage.EXECUTOR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CircleCIPackage.EXECUTOR__RESOURCE_CLASS:
			setResourceClass((Expression) null);
			return;
		case CircleCIPackage.EXECUTOR__SHELL:
			setShell((Expression) null);
			return;
		case CircleCIPackage.EXECUTOR__WORKING_DIRECTORY:
			setWorkingDirectory((Expression) null);
			return;
		case CircleCIPackage.EXECUTOR__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
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
		case CircleCIPackage.EXECUTOR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CircleCIPackage.EXECUTOR__RESOURCE_CLASS:
			return resourceClass != null;
		case CircleCIPackage.EXECUTOR__SHELL:
			return shell != null;
		case CircleCIPackage.EXECUTOR__WORKING_DIRECTORY:
			return workingDirectory != null;
		case CircleCIPackage.EXECUTOR__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
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

} //ExecutorImpl
