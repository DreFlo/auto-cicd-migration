/**
 */
package GHA.Triggers.Parameters;

import GHA.Expressions.Expression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Triggers.Parameters.Parameter#getId <em>Id</em>}</li>
 *   <li>{@link GHA.Triggers.Parameters.Parameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see GHA.Triggers.Parameters.ParametersPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see GHA.Triggers.Parameters.ParametersPackage#getParameter_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link GHA.Triggers.Parameters.Parameter#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Expression)
	 * @see GHA.Triggers.Parameters.ParametersPackage#getParameter_Description()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDescription();

	/**
	 * Sets the value of the '{@link GHA.Triggers.Parameters.Parameter#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Expression value);

} // Parameter
