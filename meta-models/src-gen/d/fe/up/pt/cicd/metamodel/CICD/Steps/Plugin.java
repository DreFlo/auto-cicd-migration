/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Plugin#getPluginName <em>Plugin Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Plugin#getVersion <em>Version</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Plugin#getKwargs <em>Kwargs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getPlugin()
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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getPlugin_PluginName()
	 * @model required="true"
	 * @generated
	 */
	String getPluginName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Plugin#getPluginName <em>Plugin Name</em>}' attribute.
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
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getPlugin_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.Plugin#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Kwargs</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}<code>&lt;d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable, d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kwargs</em>' reference list.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage#getPlugin_Kwargs()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Expressions.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.Expressions.Values.Variables.EnvironmentVariable, d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression&gt;"
	 * @generated
	 */
	EList<Map.Entry<EnvironmentVariable, Expression>> getKwargs();

} // Plugin
