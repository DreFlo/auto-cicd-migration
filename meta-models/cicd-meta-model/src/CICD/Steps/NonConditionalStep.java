/**
 */
package CICD.Steps;

import CICD.Expressions.Expression;

import CICD.Expressions.Values.Variables.EnvironmentVariable;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Conditional Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.Steps.NonConditionalStep#getId <em>Id</em>}</li>
 *   <li>{@link CICD.Steps.NonConditionalStep#getName <em>Name</em>}</li>
 *   <li>{@link CICD.Steps.NonConditionalStep#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link CICD.Steps.NonConditionalStep#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link CICD.Steps.NonConditionalStep#isAllowFailure <em>Allow Failure</em>}</li>
 * </ul>
 *
 * @see CICD.Steps.StepsPackage#getNonConditionalStep()
 * @model abstract="true"
 * @generated
 */
public interface NonConditionalStep extends Step {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see CICD.Steps.StepsPackage#getNonConditionalStep_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link CICD.Steps.NonConditionalStep#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CICD.Steps.StepsPackage#getNonConditionalStep_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CICD.Steps.NonConditionalStep#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;CICD.Expressions.Values.Variables.EnvironmentVariable, CICD.Expressions.Expression&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' reference list.
	 * @see CICD.Steps.StepsPackage#getNonConditionalStep_EnvironmentVariables()
	 * @model mapType="CICD.Expressions.Assignment&lt;CICD.Expressions.Values.Variables.EnvironmentVariable, CICD.Expressions.Expression&gt;"
	 * @generated
	 */
	EList<Map.Entry<EnvironmentVariable, Expression>> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Timeout Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Minutes</em>' attribute.
	 * @see #setTimeoutMinutes(Integer)
	 * @see CICD.Steps.StepsPackage#getNonConditionalStep_TimeoutMinutes()
	 * @model
	 * @generated
	 */
	Integer getTimeoutMinutes();

	/**
	 * Sets the value of the '{@link CICD.Steps.NonConditionalStep#getTimeoutMinutes <em>Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Minutes</em>' attribute.
	 * @see #getTimeoutMinutes()
	 * @generated
	 */
	void setTimeoutMinutes(Integer value);

	/**
	 * Returns the value of the '<em><b>Allow Failure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Failure</em>' attribute.
	 * @see #setAllowFailure(boolean)
	 * @see CICD.Steps.StepsPackage#getNonConditionalStep_AllowFailure()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isAllowFailure();

	/**
	 * Sets the value of the '{@link CICD.Steps.NonConditionalStep#isAllowFailure <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Failure</em>' attribute.
	 * @see #isAllowFailure()
	 * @generated
	 */
	void setAllowFailure(boolean value);

} // NonConditionalStep
