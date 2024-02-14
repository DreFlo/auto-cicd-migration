/**
 */
package CICD;

import CICD.Expressions.Expression;

import CICD.Expressions.Values.Variables.EnvironmentVariable;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CICD.DockerContainer#getLabel <em>Label</em>}</li>
 *   <li>{@link CICD.DockerContainer#getImage <em>Image</em>}</li>
 *   <li>{@link CICD.DockerContainer#getEnvironmentVariables <em>Environment Variables</em>}</li>
 *   <li>{@link CICD.DockerContainer#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link CICD.DockerContainer#getPorts <em>Ports</em>}</li>
 *   <li>{@link CICD.DockerContainer#getOptions <em>Options</em>}</li>
 *   <li>{@link CICD.DockerContainer#getRegistryUsername <em>Registry Username</em>}</li>
 *   <li>{@link CICD.DockerContainer#getRegistryPassword <em>Registry Password</em>}</li>
 *   <li>{@link CICD.DockerContainer#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see CICD.CICDPackage#getDockerContainer()
 * @model
 * @generated
 */
public interface DockerContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see CICD.CICDPackage#getDockerContainer_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link CICD.DockerContainer#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(Expression)
	 * @see CICD.CICDPackage#getDockerContainer_Image()
	 * @model required="true"
	 * @generated
	 */
	Expression getImage();

	/**
	 * Sets the value of the '{@link CICD.DockerContainer#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Expression value);

	/**
	 * Returns the value of the '<em><b>Environment Variables</b></em>' map.
	 * The key is of type {@link CICD.Expressions.Values.Variables.EnvironmentVariable},
	 * and the value is of type {@link CICD.Expressions.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Variables</em>' map.
	 * @see CICD.CICDPackage#getDockerContainer_EnvironmentVariables()
	 * @model mapType="CICD.Expressions.Assignment&lt;CICD.Expressions.Values.Variables.EnvironmentVariable, CICD.Expressions.Expression&gt;"
	 * @generated
	 */
	EMap<EnvironmentVariable, Expression> getEnvironmentVariables();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link CICD.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see CICD.CICDPackage#getDockerContainer_Volumes()
	 * @model
	 * @generated
	 */
	EList<Expression> getVolumes();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link CICD.Expressions.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see CICD.CICDPackage#getDockerContainer_Ports()
	 * @model
	 * @generated
	 */
	EList<Expression> getPorts();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see #setOptions(String)
	 * @see CICD.CICDPackage#getDockerContainer_Options()
	 * @model
	 * @generated
	 */
	String getOptions();

	/**
	 * Sets the value of the '{@link CICD.DockerContainer#getOptions <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' attribute.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(String value);

	/**
	 * Returns the value of the '<em><b>Registry Username</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Username</em>' reference.
	 * @see #setRegistryUsername(Expression)
	 * @see CICD.CICDPackage#getDockerContainer_RegistryUsername()
	 * @model required="true"
	 * @generated
	 */
	Expression getRegistryUsername();

	/**
	 * Sets the value of the '{@link CICD.DockerContainer#getRegistryUsername <em>Registry Username</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Username</em>' reference.
	 * @see #getRegistryUsername()
	 * @generated
	 */
	void setRegistryUsername(Expression value);

	/**
	 * Returns the value of the '<em><b>Registry Password</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry Password</em>' reference.
	 * @see #setRegistryPassword(Expression)
	 * @see CICD.CICDPackage#getDockerContainer_RegistryPassword()
	 * @model required="true"
	 * @generated
	 */
	Expression getRegistryPassword();

	/**
	 * Sets the value of the '{@link CICD.DockerContainer#getRegistryPassword <em>Registry Password</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registry Password</em>' reference.
	 * @see #getRegistryPassword()
	 * @generated
	 */
	void setRegistryPassword(Expression value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Expression)
	 * @see CICD.CICDPackage#getDockerContainer_Network()
	 * @model required="true"
	 * @generated
	 */
	Expression getNetwork();

	/**
	 * Sets the value of the '{@link CICD.DockerContainer#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Expression value);

} // DockerContainer
