/**
 */
package CICD.Triggers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduled Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Triggers.ScheduledTrigger#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see CICD.Triggers.TriggersPackage#getScheduledTrigger()
 * @model
 * @generated
 */
public interface ScheduledTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron</em>' attribute list.
	 * @see CICD.Triggers.TriggersPackage#getScheduledTrigger_Cron()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getCron();

} // ScheduledTrigger
