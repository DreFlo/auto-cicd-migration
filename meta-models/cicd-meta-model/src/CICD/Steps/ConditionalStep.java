/**
 */
package CICD.Steps;

import CICD.Expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Steps.ConditionalStep#getIf <em>If</em>}</li>
 *   <li>{@link CICD.Steps.ConditionalStep#getThen <em>Then</em>}</li>
 *   <li>{@link CICD.Steps.ConditionalStep#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see CICD.Steps.StepsPackage#getConditionalStep()
 * @model
 * @generated
 */
public interface ConditionalStep extends Step {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(Expression)
	 * @see CICD.Steps.StepsPackage#getConditionalStep_If()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIf();

	/**
	 * Sets the value of the '{@link CICD.Steps.ConditionalStep#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link CICD.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see CICD.Steps.StepsPackage#getConditionalStep_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link CICD.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see CICD.Steps.StepsPackage#getConditionalStep_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getElse();

} // ConditionalStep
