/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.ConditionalStep#getIf <em>If</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.ConditionalStep#getThen <em>Then</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.ConditionalStep#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getConditionalStep()
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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getConditionalStep_If()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIf();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.ConditionalStep#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getConditionalStep_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getThen();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getConditionalStep_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getElse();

} // ConditionalStep
