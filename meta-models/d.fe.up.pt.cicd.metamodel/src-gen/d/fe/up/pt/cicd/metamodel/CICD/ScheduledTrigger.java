/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getScheduledTrigger()
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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getScheduledTrigger_Cron()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getCron();

} // ScheduledTrigger
