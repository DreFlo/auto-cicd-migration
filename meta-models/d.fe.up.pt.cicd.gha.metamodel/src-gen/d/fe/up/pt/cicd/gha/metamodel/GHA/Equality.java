/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Equality#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends BinaryOp {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.metamodel.GHA.EQUALITY_OPS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.EQUALITY_OPS
	 * @see #setOp(EQUALITY_OPS)
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage#getEquality_Op()
	 * @model required="true"
	 * @generated
	 */
	EQUALITY_OPS getOp();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.gha.metamodel.GHA.Equality#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see d.fe.up.pt.cicd.gha.metamodel.GHA.EQUALITY_OPS
	 * @see #getOp()
	 * @generated
	 */
	void setOp(EQUALITY_OPS value);

} // Equality
