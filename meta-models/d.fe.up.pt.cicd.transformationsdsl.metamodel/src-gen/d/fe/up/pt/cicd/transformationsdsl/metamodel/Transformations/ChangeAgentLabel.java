/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import java.util.Map;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Agent Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getChangeAgentLabel()
 * @model
 * @generated
 */
public interface ChangeAgentLabel extends Transformation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' map.
	 * @see #setName(Map.Entry)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getChangeAgentLabel_Name()
	 * @model mapType="d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Map.Entry<String, String> getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangeAgentLabel#getName <em>Name</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' map.
	 * @see #getName()
	 * @generated
	 */
	void setName(Map.Entry<String, String> value);

} // ChangeAgentLabel
