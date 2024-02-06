/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Then Else alt1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.IfThenElse_alt1#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.IfThenElse_alt1#getIf <em>If</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.IfThenElse_alt1#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getIfThenElse_alt1()
 * @model
 * @generated
 */
public interface IfThenElse_alt1 extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' attribute.
   * @see #setCondition(String)
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getIfThenElse_alt1_Condition()
   * @model
   * @generated
   */
  String getCondition();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl10.myDsl.IfThenElse_alt1#getCondition <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' attribute.
   * @see #getCondition()
   * @generated
   */
  void setCondition(String value);

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl10.myDsl.Job}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference list.
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getIfThenElse_alt1_If()
   * @model containment="true"
   * @generated
   */
  EList<Job> getIf();

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl10.myDsl.Job}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference list.
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getIfThenElse_alt1_Else()
   * @model containment="true"
   * @generated
   */
  EList<Job> getElse();

} // IfThenElse_alt1