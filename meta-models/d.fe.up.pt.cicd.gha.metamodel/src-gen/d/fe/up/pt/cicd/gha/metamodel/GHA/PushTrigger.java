/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

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
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PushTrigger#getTags <em>Tags</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PushTrigger#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPushTrigger()
 * @model
 * @generated
 */
public interface PushTrigger extends SpecifiedBranchesTrigger, SpecifiedPathsTrigger {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPushTrigger_Tags()
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPushTrigger_IgnoreSpecifiedTags()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedTags();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.PushTrigger#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Tags</em>' attribute.
	 * @see #isIgnoreSpecifiedTags()
	 * @generated
	 */
	void setIgnoreSpecifiedTags(boolean value);

} // PushTrigger
