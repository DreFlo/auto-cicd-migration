/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getCancelInProgress <em>Cancel In Progress</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getConcurrencyGroup()
 * @model
 * @generated
 */
public interface ConcurrencyGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' reference.
	 * @see #setGroupId(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getConcurrencyGroup_GroupId()
	 * @model required="true"
	 * @generated
	 */
	Expression getGroupId();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getGroupId <em>Group Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' reference.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(Expression value);

	/**
	 * Returns the value of the '<em><b>Cancel In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel In Progress</em>' attribute.
	 * @see #setCancelInProgress(Boolean)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getConcurrencyGroup_CancelInProgress()
	 * @model required="true"
	 * @generated
	 */
	Boolean getCancelInProgress();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup#getCancelInProgress <em>Cancel In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel In Progress</em>' attribute.
	 * @see #getCancelInProgress()
	 * @generated
	 */
	void setCancelInProgress(Boolean value);

} // ConcurrencyGroup
