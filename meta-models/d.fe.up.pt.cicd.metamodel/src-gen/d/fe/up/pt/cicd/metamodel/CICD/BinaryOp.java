/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getLhs <em>Lhs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getBinaryOp()
 * @model
 * @generated
 */
public interface BinaryOp extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' reference.
	 * @see #setLhs(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getBinaryOp_Lhs()
	 * @model required="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getLhs <em>Lhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' reference.
	 * @see #setRhs(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getBinaryOp_Rhs()
	 * @model required="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp#getRhs <em>Rhs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

} // BinaryOp
