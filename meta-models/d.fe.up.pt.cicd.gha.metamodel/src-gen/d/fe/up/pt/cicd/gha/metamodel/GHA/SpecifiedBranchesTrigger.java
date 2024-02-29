/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specified Branches Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.SpecifiedBranchesTrigger#getBranches <em>Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.SpecifiedBranchesTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getSpecifiedBranchesTrigger()
 * @model abstract="true"
 * @generated
 */
public interface SpecifiedBranchesTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getSpecifiedBranchesTrigger_Branches()
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getSpecifiedBranchesTrigger_IgnoreSpecifiedBranches()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIgnoreSpecifiedBranches();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.SpecifiedBranchesTrigger#isIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Branches</em>' attribute.
	 * @see #isIgnoreSpecifiedBranches()
	 * @generated
	 */
	void setIgnoreSpecifiedBranches(boolean value);

} // SpecifiedBranchesTrigger
