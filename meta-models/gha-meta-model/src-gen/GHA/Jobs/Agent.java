/**
 */
package GHA.Jobs;

import GHA.Expressions.Expression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Jobs.Agent#getGroup <em>Group</em>}</li>
 *   <li>{@link GHA.Jobs.Agent#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see GHA.Jobs.JobsPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Expression)
	 * @see GHA.Jobs.JobsPackage#getAgent_Group()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGroup();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Agent#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Expression value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see GHA.Jobs.JobsPackage#getAgent_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getLabels();

} // Agent
