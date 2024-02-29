/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

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
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getUses <em>Uses</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getArgs <em>Args</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getContainerArgs <em>Container Args</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPackage()
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPackage_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getUses();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getUses <em>Uses</em>}' containment reference.
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
	 * and the value is of type {@link d.fe.up.pt.cicd.gha.metamodel.GHA.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPackage_Args()
	 * @model mapType="d.fe.up.pt.cicd.gha.metamodel.GHA.VariableAssignment&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.gha.metamodel.GHA.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArgs();

	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' containment reference.
	 * @see #setEntrypoint(Expression)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPackage_Entrypoint()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEntrypoint();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getEntrypoint <em>Entrypoint</em>}' containment reference.
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
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getPackage_ContainerArgs()
	 * @model containment="true"
	 * @generated
	 */
	Expression getContainerArgs();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Package#getContainerArgs <em>Container Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Args</em>' containment reference.
	 * @see #getContainerArgs()
	 * @generated
	 */
	void setContainerArgs(Expression value);

} // Package
