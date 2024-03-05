/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steps2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.Steps2#getDepends <em>Depends</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getSteps2()
 * @model
 * @generated
 */
public interface Steps2 extends EObject
{
  /**
   * Returns the value of the '<em><b>Depends</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl10.myDsl.Environment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Depends</em>' containment reference list.
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getSteps2_Depends()
   * @model containment="true"
   * @generated
   */
  EList<Environment> getDepends();

} // Steps2