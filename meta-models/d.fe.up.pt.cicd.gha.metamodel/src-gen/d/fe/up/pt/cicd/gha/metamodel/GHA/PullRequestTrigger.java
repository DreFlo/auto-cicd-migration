/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pull Request Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#getEventTypes <em>Event Types</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#getBranches <em>Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#getPaths <em>Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPullRequestTrigger()
 * @model
 * @generated
 */
public interface PullRequestTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Event Types</b></em>' attribute list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES}.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Types</em>' attribute list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.WEBHOOK_ACTIVITY_TYPES
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPullRequestTrigger_EventTypes()
	 * @model upper="3"
	 * @generated
	 */
	EList<WEBHOOK_ACTIVITY_TYPES> getEventTypes();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPullRequestTrigger_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getBranches();

	/**
	 * Returns the value of the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Specified Branches</em>' attribute.
	 * @see #setIgnoreSpecifiedBranches(boolean)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPullRequestTrigger_IgnoreSpecifiedBranches()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedBranches();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Branches</em>' attribute.
	 * @see #isIgnoreSpecifiedBranches()
	 * @generated
	 */
	void setIgnoreSpecifiedBranches(boolean value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPullRequestTrigger_Paths()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getPaths();

	/**
	 * Returns the value of the '<em><b>Ignore Specified Paths</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Specified Paths</em>' attribute.
	 * @see #setIgnoreSpecifiedPaths(boolean)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPullRequestTrigger_IgnoreSpecifiedPaths()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedPaths();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PullRequestTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Paths</em>' attribute.
	 * @see #isIgnoreSpecifiedPaths()
	 * @generated
	 */
	void setIgnoreSpecifiedPaths(boolean value);

} // PullRequestTrigger
