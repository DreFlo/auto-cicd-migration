/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac OS Executor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor#getXcode <em>Xcode</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getMacOSExecutor()
 * @model
 * @generated
 */
public interface MacOSExecutor extends Executor {
	/**
	 * Returns the value of the '<em><b>Xcode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xcode</em>' containment reference.
	 * @see #setXcode(Expression)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getMacOSExecutor_Xcode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getXcode();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.MacOSExecutor#getXcode <em>Xcode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xcode</em>' containment reference.
	 * @see #getXcode()
	 * @generated
	 */
	void setXcode(Expression value);

} // MacOSExecutor
