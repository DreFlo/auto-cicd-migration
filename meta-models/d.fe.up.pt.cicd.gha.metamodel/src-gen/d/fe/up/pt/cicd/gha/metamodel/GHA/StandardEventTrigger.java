/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.StandardEventTrigger#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getStandardEventTrigger()
 * @model
 * @generated
 */
public interface StandardEventTrigger extends EventTypeTrigger {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.metamodel.GHA.EVENTS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.EVENTS
	 * @see #setEvent(EVENTS)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getStandardEventTrigger_Event()
	 * @model id="true" required="true"
	 * @generated
	 */
	EVENTS getEvent();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.StandardEventTrigger#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.EVENTS
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EVENTS value);

} // StandardEventTrigger
