/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.RunStep;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WHEN_TYPE;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getNoOutputTimeout <em>No Output Timeout</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.RunStepImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunStepImpl extends StepImpl implements RunStep {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected Expression command;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Expression name;

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
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Expression> environmentVariables;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected Expression background;

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
	 * The cached value of the '{@link #getNoOutputTimeout() <em>No Output Timeout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoOutputTimeout()
	 * @generated
	 * @ordered
	 */
	protected Expression noOutputTimeout;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final WHEN_TYPE WHEN_EDEFAULT = WHEN_TYPE.ON_SUCCESS;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected WHEN_TYPE when = WHEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircleCIPackage.Literals.RUN_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(Expression newCommand, NotificationChain msgs) {
		Expression oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.RUN_STEP__COMMAND, oldCommand, newCommand);
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
	public void setCommand(Expression newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject) command).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject) newCommand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__COMMAND, newCommand,
					newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Expression newName, NotificationChain msgs) {
		Expression oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.RUN_STEP__NAME, oldName, newName);
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
	public void setName(Expression newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__NAME, newName, newName));
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
					CircleCIPackage.RUN_STEP__SHELL, oldShell, newShell);
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
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__SHELL, null, msgs);
			if (newShell != null)
				msgs = ((InternalEObject) newShell).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__SHELL, null, msgs);
			msgs = basicSetShell(newShell, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__SHELL, newShell, newShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, Expression> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EcoreEMap<String, Expression>(CircleCIPackage.Literals.VARIABLE_ASSIGNMENT,
					VariableAssignmentImpl.class, this, CircleCIPackage.RUN_STEP__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackground(Expression newBackground, NotificationChain msgs) {
		Expression oldBackground = background;
		background = newBackground;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.RUN_STEP__BACKGROUND, oldBackground, newBackground);
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
	public void setBackground(Expression newBackground) {
		if (newBackground != background) {
			NotificationChain msgs = null;
			if (background != null)
				msgs = ((InternalEObject) background).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__BACKGROUND, null, msgs);
			if (newBackground != null)
				msgs = ((InternalEObject) newBackground).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__BACKGROUND, null, msgs);
			msgs = basicSetBackground(newBackground, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__BACKGROUND, newBackground,
					newBackground));
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
					CircleCIPackage.RUN_STEP__WORKING_DIRECTORY, oldWorkingDirectory, newWorkingDirectory);
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
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__WORKING_DIRECTORY, null, msgs);
			if (newWorkingDirectory != null)
				msgs = ((InternalEObject) newWorkingDirectory).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__WORKING_DIRECTORY, null, msgs);
			msgs = basicSetWorkingDirectory(newWorkingDirectory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__WORKING_DIRECTORY,
					newWorkingDirectory, newWorkingDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getNoOutputTimeout() {
		return noOutputTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoOutputTimeout(Expression newNoOutputTimeout, NotificationChain msgs) {
		Expression oldNoOutputTimeout = noOutputTimeout;
		noOutputTimeout = newNoOutputTimeout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT, oldNoOutputTimeout, newNoOutputTimeout);
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
	public void setNoOutputTimeout(Expression newNoOutputTimeout) {
		if (newNoOutputTimeout != noOutputTimeout) {
			NotificationChain msgs = null;
			if (noOutputTimeout != null)
				msgs = ((InternalEObject) noOutputTimeout).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT, null, msgs);
			if (newNoOutputTimeout != null)
				msgs = ((InternalEObject) newNoOutputTimeout).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT, null, msgs);
			msgs = basicSetNoOutputTimeout(newNoOutputTimeout, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT,
					newNoOutputTimeout, newNoOutputTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WHEN_TYPE getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(WHEN_TYPE newWhen) {
		WHEN_TYPE oldWhen = when;
		when = newWhen == null ? WHEN_EDEFAULT : newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.RUN_STEP__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.RUN_STEP__COMMAND:
			return basicSetCommand(null, msgs);
		case CircleCIPackage.RUN_STEP__NAME:
			return basicSetName(null, msgs);
		case CircleCIPackage.RUN_STEP__SHELL:
			return basicSetShell(null, msgs);
		case CircleCIPackage.RUN_STEP__ENVIRONMENT_VARIABLES:
			return ((InternalEList<?>) getEnvironmentVariables()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.RUN_STEP__BACKGROUND:
			return basicSetBackground(null, msgs);
		case CircleCIPackage.RUN_STEP__WORKING_DIRECTORY:
			return basicSetWorkingDirectory(null, msgs);
		case CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT:
			return basicSetNoOutputTimeout(null, msgs);
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
		case CircleCIPackage.RUN_STEP__COMMAND:
			return getCommand();
		case CircleCIPackage.RUN_STEP__NAME:
			return getName();
		case CircleCIPackage.RUN_STEP__SHELL:
			return getShell();
		case CircleCIPackage.RUN_STEP__ENVIRONMENT_VARIABLES:
			if (coreType)
				return getEnvironmentVariables();
			else
				return getEnvironmentVariables().map();
		case CircleCIPackage.RUN_STEP__BACKGROUND:
			return getBackground();
		case CircleCIPackage.RUN_STEP__WORKING_DIRECTORY:
			return getWorkingDirectory();
		case CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT:
			return getNoOutputTimeout();
		case CircleCIPackage.RUN_STEP__WHEN:
			return getWhen();
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
		case CircleCIPackage.RUN_STEP__COMMAND:
			setCommand((Expression) newValue);
			return;
		case CircleCIPackage.RUN_STEP__NAME:
			setName((Expression) newValue);
			return;
		case CircleCIPackage.RUN_STEP__SHELL:
			setShell((Expression) newValue);
			return;
		case CircleCIPackage.RUN_STEP__ENVIRONMENT_VARIABLES:
			((EStructuralFeature.Setting) getEnvironmentVariables()).set(newValue);
			return;
		case CircleCIPackage.RUN_STEP__BACKGROUND:
			setBackground((Expression) newValue);
			return;
		case CircleCIPackage.RUN_STEP__WORKING_DIRECTORY:
			setWorkingDirectory((Expression) newValue);
			return;
		case CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT:
			setNoOutputTimeout((Expression) newValue);
			return;
		case CircleCIPackage.RUN_STEP__WHEN:
			setWhen((WHEN_TYPE) newValue);
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
		case CircleCIPackage.RUN_STEP__COMMAND:
			setCommand((Expression) null);
			return;
		case CircleCIPackage.RUN_STEP__NAME:
			setName((Expression) null);
			return;
		case CircleCIPackage.RUN_STEP__SHELL:
			setShell((Expression) null);
			return;
		case CircleCIPackage.RUN_STEP__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			return;
		case CircleCIPackage.RUN_STEP__BACKGROUND:
			setBackground((Expression) null);
			return;
		case CircleCIPackage.RUN_STEP__WORKING_DIRECTORY:
			setWorkingDirectory((Expression) null);
			return;
		case CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT:
			setNoOutputTimeout((Expression) null);
			return;
		case CircleCIPackage.RUN_STEP__WHEN:
			setWhen(WHEN_EDEFAULT);
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
		case CircleCIPackage.RUN_STEP__COMMAND:
			return command != null;
		case CircleCIPackage.RUN_STEP__NAME:
			return name != null;
		case CircleCIPackage.RUN_STEP__SHELL:
			return shell != null;
		case CircleCIPackage.RUN_STEP__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
		case CircleCIPackage.RUN_STEP__BACKGROUND:
			return background != null;
		case CircleCIPackage.RUN_STEP__WORKING_DIRECTORY:
			return workingDirectory != null;
		case CircleCIPackage.RUN_STEP__NO_OUTPUT_TIMEOUT:
			return noOutputTimeout != null;
		case CircleCIPackage.RUN_STEP__WHEN:
			return when != WHEN_EDEFAULT;
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
		result.append(" (when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //RunStepImpl
