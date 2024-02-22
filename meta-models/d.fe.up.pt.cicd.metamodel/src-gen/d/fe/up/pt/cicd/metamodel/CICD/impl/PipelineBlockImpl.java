/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Agent;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup;
import d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable;
import d.fe.up.pt.cicd.metamodel.CICD.Expression;
import d.fe.up.pt.cicd.metamodel.CICD.Input;
import d.fe.up.pt.cicd.metamodel.CICD.Output;
import d.fe.up.pt.cicd.metamodel.CICD.PERMISSION_TYPE;
import d.fe.up.pt.cicd.metamodel.CICD.PipelineBlock;
import d.fe.up.pt.cicd.metamodel.CICD.SHELL_TYPE;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getConcurrencyGroup <em>Concurrency Group</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.PipelineBlockImpl#getShell <em>Shell</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PipelineBlockImpl extends MinimalEObjectImpl.Container implements PipelineBlock {
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
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getEnvironmentVariables() <em>Environment Variables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentVariables()
	 * @generated
	 * @ordered
	 */
	protected EMap<EnvironmentVariable, Expression> environmentVariables;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, PERMISSION_TYPE> permissions;

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
	 * The default value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected String workingDirectory = WORKING_DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcurrencyGroup() <em>Concurrency Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrencyGroup()
	 * @generated
	 * @ordered
	 */
	protected ConcurrencyGroup concurrencyGroup;

	/**
	 * The default value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected static final SHELL_TYPE SHELL_EDEFAULT = SHELL_TYPE.BASH;

	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected SHELL_TYPE shell = SHELL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICDPackage.Literals.PIPELINE_BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_BLOCK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICDPackage.PIPELINE_BLOCK__AGENT, oldAgent, newAgent);
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
	public void setAgent(Agent newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject) agent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.PIPELINE_BLOCK__AGENT, null, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject) newAgent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.PIPELINE_BLOCK__AGENT, null, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_BLOCK__AGENT, newAgent,
					newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, CICDPackage.PIPELINE_BLOCK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, CICDPackage.PIPELINE_BLOCK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<EnvironmentVariable, Expression> getEnvironmentVariables() {
		if (environmentVariables == null) {
			environmentVariables = new EcoreEMap<EnvironmentVariable, Expression>(CICDPackage.Literals.ASSIGNMENT,
					AssignmentImpl.class, this, CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES);
		}
		return environmentVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, PERMISSION_TYPE> getPermissions() {
		if (permissions == null) {
			permissions = new EcoreEMap<String, PERMISSION_TYPE>(CICDPackage.Literals.PERMISSION, PermissionImpl.class,
					this, CICDPackage.PIPELINE_BLOCK__PERMISSIONS);
		}
		return permissions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_BLOCK__TIMEOUT_MINUTES,
					oldTimeoutMinutes, timeoutMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingDirectory(String newWorkingDirectory) {
		String oldWorkingDirectory = workingDirectory;
		workingDirectory = newWorkingDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_BLOCK__WORKING_DIRECTORY,
					oldWorkingDirectory, workingDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyGroup getConcurrencyGroup() {
		return concurrencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrencyGroup(ConcurrencyGroup newConcurrencyGroup, NotificationChain msgs) {
		ConcurrencyGroup oldConcurrencyGroup = concurrencyGroup;
		concurrencyGroup = newConcurrencyGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP, oldConcurrencyGroup, newConcurrencyGroup);
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
	public void setConcurrencyGroup(ConcurrencyGroup newConcurrencyGroup) {
		if (newConcurrencyGroup != concurrencyGroup) {
			NotificationChain msgs = null;
			if (concurrencyGroup != null)
				msgs = ((InternalEObject) concurrencyGroup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP, null, msgs);
			if (newConcurrencyGroup != null)
				msgs = ((InternalEObject) newConcurrencyGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP, null, msgs);
			msgs = basicSetConcurrencyGroup(newConcurrencyGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP,
					newConcurrencyGroup, newConcurrencyGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SHELL_TYPE getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShell(SHELL_TYPE newShell) {
		SHELL_TYPE oldShell = shell;
		shell = newShell == null ? SHELL_EDEFAULT : newShell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CICDPackage.PIPELINE_BLOCK__SHELL, oldShell, shell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CICDPackage.PIPELINE_BLOCK__AGENT:
			return basicSetAgent(null, msgs);
		case CICDPackage.PIPELINE_BLOCK__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case CICDPackage.PIPELINE_BLOCK__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES:
			return ((InternalEList<?>) getEnvironmentVariables()).basicRemove(otherEnd, msgs);
		case CICDPackage.PIPELINE_BLOCK__PERMISSIONS:
			return ((InternalEList<?>) getPermissions()).basicRemove(otherEnd, msgs);
		case CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP:
			return basicSetConcurrencyGroup(null, msgs);
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
		case CICDPackage.PIPELINE_BLOCK__NAME:
			return getName();
		case CICDPackage.PIPELINE_BLOCK__AGENT:
			return getAgent();
		case CICDPackage.PIPELINE_BLOCK__INPUTS:
			return getInputs();
		case CICDPackage.PIPELINE_BLOCK__OUTPUTS:
			return getOutputs();
		case CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES:
			if (coreType)
				return getEnvironmentVariables();
			else
				return getEnvironmentVariables().map();
		case CICDPackage.PIPELINE_BLOCK__PERMISSIONS:
			if (coreType)
				return getPermissions();
			else
				return getPermissions().map();
		case CICDPackage.PIPELINE_BLOCK__TIMEOUT_MINUTES:
			return getTimeoutMinutes();
		case CICDPackage.PIPELINE_BLOCK__WORKING_DIRECTORY:
			return getWorkingDirectory();
		case CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP:
			return getConcurrencyGroup();
		case CICDPackage.PIPELINE_BLOCK__SHELL:
			return getShell();
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
		case CICDPackage.PIPELINE_BLOCK__NAME:
			setName((String) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__AGENT:
			setAgent((Agent) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Input>) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Output>) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES:
			((EStructuralFeature.Setting) getEnvironmentVariables()).set(newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__PERMISSIONS:
			((EStructuralFeature.Setting) getPermissions()).set(newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__TIMEOUT_MINUTES:
			setTimeoutMinutes((Integer) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__WORKING_DIRECTORY:
			setWorkingDirectory((String) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP:
			setConcurrencyGroup((ConcurrencyGroup) newValue);
			return;
		case CICDPackage.PIPELINE_BLOCK__SHELL:
			setShell((SHELL_TYPE) newValue);
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
		case CICDPackage.PIPELINE_BLOCK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CICDPackage.PIPELINE_BLOCK__AGENT:
			setAgent((Agent) null);
			return;
		case CICDPackage.PIPELINE_BLOCK__INPUTS:
			getInputs().clear();
			return;
		case CICDPackage.PIPELINE_BLOCK__OUTPUTS:
			getOutputs().clear();
			return;
		case CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES:
			getEnvironmentVariables().clear();
			return;
		case CICDPackage.PIPELINE_BLOCK__PERMISSIONS:
			getPermissions().clear();
			return;
		case CICDPackage.PIPELINE_BLOCK__TIMEOUT_MINUTES:
			setTimeoutMinutes(TIMEOUT_MINUTES_EDEFAULT);
			return;
		case CICDPackage.PIPELINE_BLOCK__WORKING_DIRECTORY:
			setWorkingDirectory(WORKING_DIRECTORY_EDEFAULT);
			return;
		case CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP:
			setConcurrencyGroup((ConcurrencyGroup) null);
			return;
		case CICDPackage.PIPELINE_BLOCK__SHELL:
			setShell(SHELL_EDEFAULT);
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
		case CICDPackage.PIPELINE_BLOCK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CICDPackage.PIPELINE_BLOCK__AGENT:
			return agent != null;
		case CICDPackage.PIPELINE_BLOCK__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case CICDPackage.PIPELINE_BLOCK__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case CICDPackage.PIPELINE_BLOCK__ENVIRONMENT_VARIABLES:
			return environmentVariables != null && !environmentVariables.isEmpty();
		case CICDPackage.PIPELINE_BLOCK__PERMISSIONS:
			return permissions != null && !permissions.isEmpty();
		case CICDPackage.PIPELINE_BLOCK__TIMEOUT_MINUTES:
			return TIMEOUT_MINUTES_EDEFAULT == null ? timeoutMinutes != null
					: !TIMEOUT_MINUTES_EDEFAULT.equals(timeoutMinutes);
		case CICDPackage.PIPELINE_BLOCK__WORKING_DIRECTORY:
			return WORKING_DIRECTORY_EDEFAULT == null ? workingDirectory != null
					: !WORKING_DIRECTORY_EDEFAULT.equals(workingDirectory);
		case CICDPackage.PIPELINE_BLOCK__CONCURRENCY_GROUP:
			return concurrencyGroup != null;
		case CICDPackage.PIPELINE_BLOCK__SHELL:
			return shell != SHELL_EDEFAULT;
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
		result.append(", timeoutMinutes: ");
		result.append(timeoutMinutes);
		result.append(", workingDirectory: ");
		result.append(workingDirectory);
		result.append(", shell: ");
		result.append(shell);
		result.append(')');
		return result.toString();
	}

} //PipelineBlockImpl
