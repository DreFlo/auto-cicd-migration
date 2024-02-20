/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Triggers;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.Trigger#getBranchGlobs <em>Branch Globs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage#getTrigger()
 * @model abstract="true"
 * @generated
 */
public interface Trigger extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Globs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Globs</em>' attribute list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage#getTrigger_BranchGlobs()
	 * @model
	 * @generated
	 */
	EList<String> getBranchGlobs();

} // Trigger
