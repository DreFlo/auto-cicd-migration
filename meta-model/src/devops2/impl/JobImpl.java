/**
 */
package devops2.impl;

import devops2.Artifact;
import devops2.Command;
import devops2.Devops2Package;
import devops2.Environment;
import devops2.IfThenElse;
import devops2.Job;
import devops2.Permission;
import devops2.Tool_framework;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devops2.impl.JobImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getTool_framework_job <em>Tool framework job</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getIfthenelse <em>Ifthenelse</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#isAllow_faillure <em>Allow faillure</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getInput <em>Input</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getDescription1 <em>Description1</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link devops2.impl.JobImpl#getPipeline_envirnonment <em>Pipeline envirnonment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The default value of the '{@link #getName1() <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName1()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName1() <em>Name1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName1()
	 * @generated
	 * @ordered
	 */
	protected String name1 = NAME1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTool_framework_job() <em>Tool framework job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool_framework_job()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool_framework> tool_framework_job;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> output;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> command;

	/**
	 * The cached value of the '{@link #getIfthenelse() <em>Ifthenelse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfthenelse()
	 * @generated
	 * @ordered
	 */
	protected EList<IfThenElse> ifthenelse;

	/**
	 * The default value of the '{@link #isAllow_faillure() <em>Allow faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllow_faillure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FAILLURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllow_faillure() <em>Allow faillure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllow_faillure()
	 * @generated
	 * @ordered
	 */
	protected boolean allow_faillure = ALLOW_FAILLURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> input;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> environment;

	/**
	 * The default value of the '{@link #getDescription1() <em>Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription1()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription1() <em>Description1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription1()
	 * @generated
	 * @ordered
	 */
	protected String description1 = DESCRIPTION1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permission;

	/**
	 * The cached value of the '{@link #getPipeline_envirnonment() <em>Pipeline envirnonment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPipeline_envirnonment()
	 * @generated
	 * @ordered
	 */
	protected EList<Environment> pipeline_envirnonment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Devops2Package.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName1() {
		return name1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName1(String newName1) {
		String oldName1 = name1;
		name1 = newName1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.JOB__NAME1, oldName1, name1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool_framework> getTool_framework_job() {
		if (tool_framework_job == null) {
			tool_framework_job = new EObjectContainmentEList<Tool_framework>(Tool_framework.class, this, Devops2Package.JOB__TOOL_FRAMEWORK_JOB);
		}
		return tool_framework_job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<Artifact>(Artifact.class, this, Devops2Package.JOB__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Command>(Command.class, this, Devops2Package.JOB__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfThenElse> getIfthenelse() {
		if (ifthenelse == null) {
			ifthenelse = new EObjectContainmentEList<IfThenElse>(IfThenElse.class, this, Devops2Package.JOB__IFTHENELSE);
		}
		return ifthenelse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllow_faillure() {
		return allow_faillure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllow_faillure(boolean newAllow_faillure) {
		boolean oldAllow_faillure = allow_faillure;
		allow_faillure = newAllow_faillure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.JOB__ALLOW_FAILLURE, oldAllow_faillure, allow_faillure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<Artifact>(Artifact.class, this, Devops2Package.JOB__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<Environment>(Environment.class, this, Devops2Package.JOB__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription1() {
		return description1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription1(String newDescription1) {
		String oldDescription1 = description1;
		description1 = newDescription1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.JOB__DESCRIPTION1, oldDescription1, description1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermission() {
		if (permission == null) {
			permission = new EObjectContainmentEList<Permission>(Permission.class, this, Devops2Package.JOB__PERMISSION);
		}
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Environment> getPipeline_envirnonment() {
		if (pipeline_envirnonment == null) {
			pipeline_envirnonment = new EObjectContainmentEList<Environment>(Environment.class, this, Devops2Package.JOB__PIPELINE_ENVIRNONMENT);
		}
		return pipeline_envirnonment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Devops2Package.JOB__TOOL_FRAMEWORK_JOB:
				return ((InternalEList<?>)getTool_framework_job()).basicRemove(otherEnd, msgs);
			case Devops2Package.JOB__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
			case Devops2Package.JOB__IFTHENELSE:
				return ((InternalEList<?>)getIfthenelse()).basicRemove(otherEnd, msgs);
			case Devops2Package.JOB__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case Devops2Package.JOB__ENVIRONMENT:
				return ((InternalEList<?>)getEnvironment()).basicRemove(otherEnd, msgs);
			case Devops2Package.JOB__PERMISSION:
				return ((InternalEList<?>)getPermission()).basicRemove(otherEnd, msgs);
			case Devops2Package.JOB__PIPELINE_ENVIRNONMENT:
				return ((InternalEList<?>)getPipeline_envirnonment()).basicRemove(otherEnd, msgs);
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
			case Devops2Package.JOB__NAME1:
				return getName1();
			case Devops2Package.JOB__TOOL_FRAMEWORK_JOB:
				return getTool_framework_job();
			case Devops2Package.JOB__OUTPUT:
				return getOutput();
			case Devops2Package.JOB__COMMAND:
				return getCommand();
			case Devops2Package.JOB__IFTHENELSE:
				return getIfthenelse();
			case Devops2Package.JOB__ALLOW_FAILLURE:
				return isAllow_faillure();
			case Devops2Package.JOB__INPUT:
				return getInput();
			case Devops2Package.JOB__ENVIRONMENT:
				return getEnvironment();
			case Devops2Package.JOB__DESCRIPTION1:
				return getDescription1();
			case Devops2Package.JOB__PERMISSION:
				return getPermission();
			case Devops2Package.JOB__PIPELINE_ENVIRNONMENT:
				return getPipeline_envirnonment();
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
			case Devops2Package.JOB__NAME1:
				setName1((String)newValue);
				return;
			case Devops2Package.JOB__TOOL_FRAMEWORK_JOB:
				getTool_framework_job().clear();
				getTool_framework_job().addAll((Collection<? extends Tool_framework>)newValue);
				return;
			case Devops2Package.JOB__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Artifact>)newValue);
				return;
			case Devops2Package.JOB__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends Command>)newValue);
				return;
			case Devops2Package.JOB__IFTHENELSE:
				getIfthenelse().clear();
				getIfthenelse().addAll((Collection<? extends IfThenElse>)newValue);
				return;
			case Devops2Package.JOB__ALLOW_FAILLURE:
				setAllow_faillure((Boolean)newValue);
				return;
			case Devops2Package.JOB__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Artifact>)newValue);
				return;
			case Devops2Package.JOB__ENVIRONMENT:
				getEnvironment().clear();
				getEnvironment().addAll((Collection<? extends Environment>)newValue);
				return;
			case Devops2Package.JOB__DESCRIPTION1:
				setDescription1((String)newValue);
				return;
			case Devops2Package.JOB__PERMISSION:
				getPermission().clear();
				getPermission().addAll((Collection<? extends Permission>)newValue);
				return;
			case Devops2Package.JOB__PIPELINE_ENVIRNONMENT:
				getPipeline_envirnonment().clear();
				getPipeline_envirnonment().addAll((Collection<? extends Environment>)newValue);
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
			case Devops2Package.JOB__NAME1:
				setName1(NAME1_EDEFAULT);
				return;
			case Devops2Package.JOB__TOOL_FRAMEWORK_JOB:
				getTool_framework_job().clear();
				return;
			case Devops2Package.JOB__OUTPUT:
				getOutput().clear();
				return;
			case Devops2Package.JOB__COMMAND:
				getCommand().clear();
				return;
			case Devops2Package.JOB__IFTHENELSE:
				getIfthenelse().clear();
				return;
			case Devops2Package.JOB__ALLOW_FAILLURE:
				setAllow_faillure(ALLOW_FAILLURE_EDEFAULT);
				return;
			case Devops2Package.JOB__INPUT:
				getInput().clear();
				return;
			case Devops2Package.JOB__ENVIRONMENT:
				getEnvironment().clear();
				return;
			case Devops2Package.JOB__DESCRIPTION1:
				setDescription1(DESCRIPTION1_EDEFAULT);
				return;
			case Devops2Package.JOB__PERMISSION:
				getPermission().clear();
				return;
			case Devops2Package.JOB__PIPELINE_ENVIRNONMENT:
				getPipeline_envirnonment().clear();
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
			case Devops2Package.JOB__NAME1:
				return NAME1_EDEFAULT == null ? name1 != null : !NAME1_EDEFAULT.equals(name1);
			case Devops2Package.JOB__TOOL_FRAMEWORK_JOB:
				return tool_framework_job != null && !tool_framework_job.isEmpty();
			case Devops2Package.JOB__OUTPUT:
				return output != null && !output.isEmpty();
			case Devops2Package.JOB__COMMAND:
				return command != null && !command.isEmpty();
			case Devops2Package.JOB__IFTHENELSE:
				return ifthenelse != null && !ifthenelse.isEmpty();
			case Devops2Package.JOB__ALLOW_FAILLURE:
				return allow_faillure != ALLOW_FAILLURE_EDEFAULT;
			case Devops2Package.JOB__INPUT:
				return input != null && !input.isEmpty();
			case Devops2Package.JOB__ENVIRONMENT:
				return environment != null && !environment.isEmpty();
			case Devops2Package.JOB__DESCRIPTION1:
				return DESCRIPTION1_EDEFAULT == null ? description1 != null : !DESCRIPTION1_EDEFAULT.equals(description1);
			case Devops2Package.JOB__PERMISSION:
				return permission != null && !permission.isEmpty();
			case Devops2Package.JOB__PIPELINE_ENVIRNONMENT:
				return pipeline_envirnonment != null && !pipeline_envirnonment.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name1: ");
		result.append(name1);
		result.append(", Allow_faillure: ");
		result.append(allow_faillure);
		result.append(", Description1: ");
		result.append(description1);
		result.append(')');
		return result.toString();
	}

} //JobImpl
