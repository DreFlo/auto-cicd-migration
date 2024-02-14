/**
 */
package GHA.Triggers.impl;

import GHA.Triggers.EVENTS;
import GHA.Triggers.StandardEventTrigger;
import GHA.Triggers.TriggersPackage;
import GHA.Triggers.WEBHOOK_ACTIVITY_TYPES;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link GHA.Triggers.impl.StandardEventTriggerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link GHA.Triggers.impl.StandardEventTriggerImpl#getEventTypes <em>Event Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StandardEventTriggerImpl extends TriggerImpl implements StandardEventTrigger {
	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final EVENTS EVENT_EDEFAULT = EVENTS.BRANCH_PROTECTION_RULE;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EVENTS event = EVENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventTypes() <em>Event Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<WEBHOOK_ACTIVITY_TYPES> eventTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardEventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.STANDARD_EVENT_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EVENTS getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvent(EVENTS newEvent) {
		EVENTS oldEvent = event;
		event = newEvent == null ? EVENT_EDEFAULT : newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT,
					oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WEBHOOK_ACTIVITY_TYPES> getEventTypes() {
		if (eventTypes == null) {
			eventTypes = new EDataTypeUniqueEList<WEBHOOK_ACTIVITY_TYPES>(WEBHOOK_ACTIVITY_TYPES.class, this,
					TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT_TYPES);
		}
		return eventTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT:
			return getEvent();
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT_TYPES:
			return getEventTypes();
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
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT:
			setEvent((EVENTS) newValue);
			return;
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT_TYPES:
			getEventTypes().clear();
			getEventTypes().addAll((Collection<? extends WEBHOOK_ACTIVITY_TYPES>) newValue);
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
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT:
			setEvent(EVENT_EDEFAULT);
			return;
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT_TYPES:
			getEventTypes().clear();
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
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT:
			return event != EVENT_EDEFAULT;
		case TriggersPackage.STANDARD_EVENT_TRIGGER__EVENT_TYPES:
			return eventTypes != null && !eventTypes.isEmpty();
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
		result.append(" (event: ");
		result.append(event);
		result.append(", eventTypes: ");
		result.append(eventTypes);
		result.append(')');
		return result.toString();
	}

} //StandardEventTriggerImpl
