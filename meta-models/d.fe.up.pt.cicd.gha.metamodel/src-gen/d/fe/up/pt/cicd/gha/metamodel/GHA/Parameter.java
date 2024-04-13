/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

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
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Parameter#getId <em>Id</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Parameter#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(VariableDeclaration)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getParameter_Id()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableDeclaration getId();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Parameter#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(VariableDeclaration value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getParameter_Description()
	 * @model containment="true"
	 * @generated
	 */
	Expression getDescription();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Parameter#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Expression value);

} // Parameter
