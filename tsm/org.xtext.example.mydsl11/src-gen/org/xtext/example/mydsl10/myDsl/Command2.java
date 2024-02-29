/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.Command2#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.Command2#getCommand_options <em>Command options</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getCommand2()
 * @model
 * @generated
 */
public interface Command2 extends Command
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute list.
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getCommand2_Description()
   * @model unique="false"
   * @generated
   */
  EList<String> getDescription();

  /**
   * Returns the value of the '<em><b>Command options</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command options</em>' containment reference list.
   * @see org.xtext.example.mydsl10.myDsl.MyDslPackage#getCommand2_Command_options()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getCommand_options();

} // Command2
