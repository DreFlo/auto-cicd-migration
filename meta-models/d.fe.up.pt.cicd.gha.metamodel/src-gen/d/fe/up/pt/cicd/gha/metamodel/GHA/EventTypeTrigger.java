/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Type Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.EventTypeTrigger#getEventTypes <em>Event Types</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getEventTypeTrigger()
 * @model abstract="true"
 * @generated
 */
public interface EventTypeTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Event Types</b></em>' attribute list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES}.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Types</em>' attribute list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getEventTypeTrigger_EventTypes()
	 * @model
	 * @generated
	 */
	EList<WEBHOOK_ACTIVITY_TYPES> getEventTypes();

} // EventTypeTrigger
