/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attach Workspace Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep#getAt <em>At</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getAttachWorkspaceStep()
 * @model
 * @generated
 */
public interface AttachWorkspaceStep extends Step {
	/**
	 * Returns the value of the '<em><b>At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' containment reference.
	 * @see #setAt(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getAttachWorkspaceStep_At()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAt();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.AttachWorkspaceStep#getAt <em>At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' containment reference.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(Expression value);

} // AttachWorkspaceStep
