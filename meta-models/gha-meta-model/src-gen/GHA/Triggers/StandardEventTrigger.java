/**
 */
package GHA.Triggers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Triggers.StandardEventTrigger#getEvent <em>Event</em>}</li>
 *   <li>{@link GHA.Triggers.StandardEventTrigger#getEventTypes <em>Event Types</em>}</li>
 * </ul>
 *
 * @see GHA.Triggers.TriggersPackage#getStandardEventTrigger()
 * @model
 * @generated
 */
public interface StandardEventTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link GHA.Triggers.EVENTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see GHA.Triggers.EVENTS
	 * @see #setEvent(EVENTS)
	 * @see GHA.Triggers.TriggersPackage#getStandardEventTrigger_Event()
	 * @model id="true" required="true"
	 * @generated
	 */
	EVENTS getEvent();

	/**
	 * Sets the value of the '{@link GHA.Triggers.StandardEventTrigger#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see GHA.Triggers.EVENTS
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EVENTS value);

	/**
	 * Returns the value of the '<em><b>Event Types</b></em>' attribute list.
	 * The list contents are of type {@link GHA.Triggers.WEBHOOK_ACTIVITY_TYPES}.
	 * The literals are from the enumeration {@link GHA.Triggers.WEBHOOK_ACTIVITY_TYPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Types</em>' attribute list.
	 * @see GHA.Triggers.WEBHOOK_ACTIVITY_TYPES
	 * @see GHA.Triggers.TriggersPackage#getStandardEventTrigger_EventTypes()
	 * @model
	 * @generated
	 */
	EList<WEBHOOK_ACTIVITY_TYPES> getEventTypes();

} // StandardEventTrigger
