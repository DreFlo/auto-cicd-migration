/**
 */
package GHA.Triggers;

import GHA.Expressions.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Triggers.PushTrigger#getBranches <em>Branches</em>}</li>
 *   <li>{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 *   <li>{@link GHA.Triggers.PushTrigger#getPaths <em>Paths</em>}</li>
 *   <li>{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}</li>
 *   <li>{@link GHA.Triggers.PushTrigger#getTags <em>Tags</em>}</li>
 *   <li>{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}</li>
 * </ul>
 *
 * @see GHA.Triggers.TriggersPackage#getPushTrigger()
 * @model
 * @generated
 */
public interface PushTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getPushTrigger_Branches()
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
	 * @see GHA.Triggers.TriggersPackage#getPushTrigger_IgnoreSpecifiedBranches()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedBranches();

	/**
	 * Sets the value of the '{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Branches</em>' attribute.
	 * @see #isIgnoreSpecifiedBranches()
	 * @generated
	 */
	void setIgnoreSpecifiedBranches(boolean value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getPushTrigger_Paths()
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
	 * @see GHA.Triggers.TriggersPackage#getPushTrigger_IgnoreSpecifiedPaths()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedPaths();

	/**
	 * Sets the value of the '{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Paths</em>' attribute.
	 * @see #isIgnoreSpecifiedPaths()
	 * @generated
	 */
	void setIgnoreSpecifiedPaths(boolean value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see GHA.Triggers.TriggersPackage#getPushTrigger_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getTags();

	/**
	 * Returns the value of the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Specified Tags</em>' attribute.
	 * @see #setIgnoreSpecifiedTags(boolean)
	 * @see GHA.Triggers.TriggersPackage#getPushTrigger_IgnoreSpecifiedTags()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedTags();

	/**
	 * Sets the value of the '{@link GHA.Triggers.PushTrigger#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Tags</em>' attribute.
	 * @see #isIgnoreSpecifiedTags()
	 * @generated
	 */
	void setIgnoreSpecifiedTags(boolean value);

} // PushTrigger
