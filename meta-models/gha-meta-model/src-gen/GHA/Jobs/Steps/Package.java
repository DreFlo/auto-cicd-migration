/**
 */
package GHA.Jobs.Steps;

import GHA.Expressions.Expression;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link GHA.Jobs.Steps.Package#getUses <em>Uses</em>}</li>
 *   <li>{@link GHA.Jobs.Steps.Package#getArgs <em>Args</em>}</li>
 *   <li>{@link GHA.Jobs.Steps.Package#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link GHA.Jobs.Steps.Package#getContainerArgs <em>Container Args</em>}</li>
 * </ul>
 *
 * @see GHA.Jobs.Steps.StepsPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Step {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference.
	 * @see #setUses(Expression)
	 * @see GHA.Jobs.Steps.StepsPackage#getPackage_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getUses();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Steps.Package#getUses <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' containment reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Expression value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link GHA.Expressions.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see GHA.Jobs.Steps.StepsPackage#getPackage_Args()
	 * @model mapType="GHA.Expressions.VariableAssignment&lt;org.eclipse.emf.ecore.EString, GHA.Expressions.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArgs();

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' containment reference.
	 * @see #setEntrypoint(Expression)
	 * @see GHA.Jobs.Steps.StepsPackage#getPackage_Entrypoint()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEntrypoint();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Steps.Package#getEntrypoint <em>Entrypoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' containment reference.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(Expression value);

	/**
	 * Returns the value of the '<em><b>Container Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Args</em>' containment reference.
	 * @see #setContainerArgs(Expression)
	 * @see GHA.Jobs.Steps.StepsPackage#getPackage_ContainerArgs()
	 * @model containment="true"
	 * @generated
	 */
	Expression getContainerArgs();

	/**
	 * Sets the value of the '{@link GHA.Jobs.Steps.Package#getContainerArgs <em>Container Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Args</em>' containment reference.
	 * @see #getContainerArgs()
	 * @generated
	 */
	void setContainerArgs(Expression value);

} // Package
