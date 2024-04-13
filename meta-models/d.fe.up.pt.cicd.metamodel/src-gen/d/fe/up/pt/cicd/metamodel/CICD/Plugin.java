/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getVersion <em>Version</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getKwargs <em>Kwargs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPlugin()
 * @model
 * @generated
 */
public interface Plugin extends NonConditionalStep {
	/**
	 * Returns the value of the '<em><b>Plugin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin Name</em>' attribute.
	 * @see #setPluginName(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPlugin_PluginName()
	 * @model required="true"
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getPluginName <em>Plugin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugin Name</em>' attribute.
	 * @see #getPluginName()
	 * @generated
	 */
	void setPluginName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPlugin_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Plugin#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Kwargs</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kwargs</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPlugin_Kwargs()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration, d.fe.up.pt.cicd.metamodel.CICD.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getKwargs();

} // Plugin
