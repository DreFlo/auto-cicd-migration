/**
 */
package devops2.impl;

import devops2.Artifact;
import devops2.Command;
import devops2.Devops2Package;
import devops2.Parameter;
import devops2.Step;

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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link devops2.impl.StepImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link devops2.impl.StepImpl#getStep_parameter <em>Step parameter</em>}</li>
 *   <li>{@link devops2.impl.StepImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link devops2.impl.StepImpl#getTool_framework <em>Tool framework</em>}</li>
 *   <li>{@link devops2.impl.StepImpl#getNamestep <em>Namestep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The cached value of the '{@link #getStep_parameter() <em>Step parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep_parameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> step_parameter;

	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<Artifact> artifact;

	/**
	 * The cached value of the '{@link #getTool_framework() <em>Tool framework</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool_framework()
	 * @generated
	 * @ordered
	 */
	protected EList<Tool_framework> tool_framework;

	/**
	 * The default value of the '{@link #getNamestep() <em>Namestep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamestep()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESTEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamestep() <em>Namestep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamestep()
	 * @generated
	 * @ordered
	 */
	protected String namestep = NAMESTEP_EDEFAULT;

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
		return Devops2Package.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Command>(Command.class, this, Devops2Package.STEP__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getStep_parameter() {
		if (step_parameter == null) {
			step_parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this, Devops2Package.STEP__STEP_PARAMETER);
		}
		return step_parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Artifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectResolvingEList<Artifact>(Artifact.class, this, Devops2Package.STEP__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tool_framework> getTool_framework() {
		if (tool_framework == null) {
			tool_framework = new EObjectResolvingEList<Tool_framework>(Tool_framework.class, this, Devops2Package.STEP__TOOL_FRAMEWORK);
		}
		return tool_framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamestep() {
		return namestep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamestep(String newNamestep) {
		String oldNamestep = namestep;
		namestep = newNamestep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Devops2Package.STEP__NAMESTEP, oldNamestep, namestep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Devops2Package.STEP__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
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
			case Devops2Package.STEP__COMMAND:
				return getCommand();
			case Devops2Package.STEP__STEP_PARAMETER:
				return getStep_parameter();
			case Devops2Package.STEP__ARTIFACT:
				return getArtifact();
			case Devops2Package.STEP__TOOL_FRAMEWORK:
				return getTool_framework();
			case Devops2Package.STEP__NAMESTEP:
				return getNamestep();
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
			case Devops2Package.STEP__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends Command>)newValue);
				return;
			case Devops2Package.STEP__STEP_PARAMETER:
				getStep_parameter().clear();
				getStep_parameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case Devops2Package.STEP__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends Artifact>)newValue);
				return;
			case Devops2Package.STEP__TOOL_FRAMEWORK:
				getTool_framework().clear();
				getTool_framework().addAll((Collection<? extends Tool_framework>)newValue);
				return;
			case Devops2Package.STEP__NAMESTEP:
				setNamestep((String)newValue);
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
			case Devops2Package.STEP__COMMAND:
				getCommand().clear();
				return;
			case Devops2Package.STEP__STEP_PARAMETER:
				getStep_parameter().clear();
				return;
			case Devops2Package.STEP__ARTIFACT:
				getArtifact().clear();
				return;
			case Devops2Package.STEP__TOOL_FRAMEWORK:
				getTool_framework().clear();
				return;
			case Devops2Package.STEP__NAMESTEP:
				setNamestep(NAMESTEP_EDEFAULT);
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
			case Devops2Package.STEP__COMMAND:
				return command != null && !command.isEmpty();
			case Devops2Package.STEP__STEP_PARAMETER:
				return step_parameter != null && !step_parameter.isEmpty();
			case Devops2Package.STEP__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
			case Devops2Package.STEP__TOOL_FRAMEWORK:
				return tool_framework != null && !tool_framework.isEmpty();
			case Devops2Package.STEP__NAMESTEP:
				return NAMESTEP_EDEFAULT == null ? namestep != null : !NAMESTEP_EDEFAULT.equals(namestep);
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
		result.append(" (Namestep: ");
		result.append(namestep);
		result.append(')');
		return result.toString();
	}

} //StepImpl
