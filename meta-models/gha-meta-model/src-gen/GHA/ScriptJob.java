/**
 */
package GHA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.ScriptJob#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see GHA.GHAPackage#getScriptJob()
 * @model
 * @generated
 */
public interface ScriptJob extends Job {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link GHA.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see GHA.GHAPackage#getScriptJob_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // ScriptJob
