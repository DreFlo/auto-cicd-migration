/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Triggers;

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
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Triggers.PushTrigger#getTagGlobs <em>Tag Globs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage#getPushTrigger()
 * @model
 * @generated
 */
public interface PushTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Tag Globs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Globs</em>' attribute list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Triggers.TriggersPackage#getPushTrigger_TagGlobs()
	 * @model
	 * @generated
	 */
	EList<String> getTagGlobs();

} // PushTrigger
