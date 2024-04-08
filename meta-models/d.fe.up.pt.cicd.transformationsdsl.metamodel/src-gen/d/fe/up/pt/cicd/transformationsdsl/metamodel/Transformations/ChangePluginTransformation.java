/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

import java.util.Map;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Plugin Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getVersion <em>Version</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getChangePluginTransformation()
 * @model
 * @generated
 */
public interface ChangePluginTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' map.
	 * @see #setName(Map.Entry)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getChangePluginTransformation_Name()
	 * @model mapType="d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	Map.Entry<String, String> getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getName <em>Name</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' map.
	 * @see #getName()
	 * @generated
	 */
	void setName(Map.Entry<String, String> value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getChangePluginTransformation_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ChangePluginTransformation#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getChangePluginTransformation_Args()
	 * @model mapType="d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getArgs();

} // ChangePluginTransformation
