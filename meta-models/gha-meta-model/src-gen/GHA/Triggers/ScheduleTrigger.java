/**
 */
package GHA.Triggers;

import GHA.Expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Triggers.ScheduleTrigger#getCrons <em>Crons</em>}</li>
 * </ul>
 *
 * @see GHA.Triggers.TriggersPackage#getScheduleTrigger()
 * @model
 * @generated
 */
public interface ScheduleTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Crons</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crons</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getScheduleTrigger_Crons()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expression> getCrons();

} // ScheduleTrigger
