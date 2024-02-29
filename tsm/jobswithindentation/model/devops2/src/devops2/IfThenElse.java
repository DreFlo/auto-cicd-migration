/**
 */
package devops2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.IfThenElse#getCondition <em>Condition</em>}</li>
 *   <li>{@link devops2.IfThenElse#getIf <em>If</em>}</li>
 *   <li>{@link devops2.IfThenElse#getElse <em>Else</em>}</li>
 *   <li>{@link devops2.IfThenElse#getIfelse <em>Ifelse</em>}</li>
 *   <li>{@link devops2.IfThenElse#getElseif <em>Elseif</em>}</li>
 *   <li>{@link devops2.IfThenElse#getEnvironment_if <em>Environment if</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getIfThenElse()
 * @model
 * @generated
 */
public interface IfThenElse extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see devops2.Devops2Package#getIfThenElse_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link devops2.IfThenElse#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference list.
	 * @see devops2.Devops2Package#getIfThenElse_If()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getIf();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference list.
	 * @see devops2.Devops2Package#getIfThenElse_Else()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getElse();

	/**
	 * Returns the value of the '<em><b>Ifelse</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifelse</em>' containment reference list.
	 * @see devops2.Devops2Package#getIfThenElse_Ifelse()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfThenElse> getIfelse();

	/**
	 * Returns the value of the '<em><b>Elseif</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.IfThenElse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elseif</em>' containment reference list.
	 * @see devops2.Devops2Package#getIfThenElse_Elseif()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfThenElse> getElseif();

	/**
	 * Returns the value of the '<em><b>Environment if</b></em>' containment reference list.
	 * The list contents are of type {@link devops2.Environment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment if</em>' containment reference list.
	 * @see devops2.Devops2Package#getIfThenElse_Environment_if()
	 * @model containment="true"
	 * @generated
	 */
	EList<Environment> getEnvironment_if();

} // IfThenElse
