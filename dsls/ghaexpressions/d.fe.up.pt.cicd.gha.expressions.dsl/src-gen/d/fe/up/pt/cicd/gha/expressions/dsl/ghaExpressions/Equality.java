/**
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality#getLhs <em>Lhs</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality#getOp <em>Op</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.GhaExpressionsPackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends Expression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Expression)
   * @see d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.GhaExpressionsPackage#getEquality_Lhs()
   * @model containment="true"
   * @generated
   */
  Expression getLhs();

  /**
   * Sets the value of the '{@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Expression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.EQUALITY_OP}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.EQUALITY_OP
   * @see #setOp(EQUALITY_OP)
   * @see d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.GhaExpressionsPackage#getEquality_Op()
   * @model
   * @generated
   */
  EQUALITY_OP getOp();

  /**
   * Sets the value of the '{@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.EQUALITY_OP
   * @see #getOp()
   * @generated
   */
  void setOp(EQUALITY_OP value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Expression)
   * @see d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.GhaExpressionsPackage#getEquality_Rhs()
   * @model containment="true"
   * @generated
   */
  Expression getRhs();

  /**
   * Sets the value of the '{@link d.fe.up.pt.cicd.gha.expressions.dsl.ghaExpressions.Equality#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Expression value);

} // Equality
