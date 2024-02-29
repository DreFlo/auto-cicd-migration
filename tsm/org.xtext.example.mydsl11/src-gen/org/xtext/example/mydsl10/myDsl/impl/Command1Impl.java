/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl10.myDsl.Command1;
import org.xtext.example.mydsl10.myDsl.Environment;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;
import org.xtext.example.mydsl10.myDsl.Tool_framework;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.Command1Impl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.Command1Impl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.Command1Impl#getEnvironment_command <em>Environment command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Command1Impl extends CommandImpl implements Command1
{
  /**
   * The cached value of the '{@link #getTool() <em>Tool</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTool()
   * @generated
   * @ordered
   */
  protected EList<Tool_framework> tool;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<String> parameters;

  /**
   * The cached value of the '{@link #getEnvironment_command() <em>Environment command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment_command()
   * @generated
   * @ordered
   */
  protected EList<Environment> environment_command;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Command1Impl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.COMMAND1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tool_framework> getTool()
  {
    if (tool == null)
    {
      tool = new EObjectContainmentEList<Tool_framework>(Tool_framework.class, this, MyDslPackage.COMMAND1__TOOL);
    }
    return tool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EDataTypeEList<String>(String.class, this, MyDslPackage.COMMAND1__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Environment> getEnvironment_command()
  {
    if (environment_command == null)
    {
      environment_command = new EObjectContainmentEList<Environment>(Environment.class, this, MyDslPackage.COMMAND1__ENVIRONMENT_COMMAND);
    }
    return environment_command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND1__TOOL:
        return ((InternalEList<?>)getTool()).basicRemove(otherEnd, msgs);
      case MyDslPackage.COMMAND1__ENVIRONMENT_COMMAND:
        return ((InternalEList<?>)getEnvironment_command()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND1__TOOL:
        return getTool();
      case MyDslPackage.COMMAND1__PARAMETERS:
        return getParameters();
      case MyDslPackage.COMMAND1__ENVIRONMENT_COMMAND:
        return getEnvironment_command();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND1__TOOL:
        getTool().clear();
        getTool().addAll((Collection<? extends Tool_framework>)newValue);
        return;
      case MyDslPackage.COMMAND1__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.COMMAND1__ENVIRONMENT_COMMAND:
        getEnvironment_command().clear();
        getEnvironment_command().addAll((Collection<? extends Environment>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND1__TOOL:
        getTool().clear();
        return;
      case MyDslPackage.COMMAND1__PARAMETERS:
        getParameters().clear();
        return;
      case MyDslPackage.COMMAND1__ENVIRONMENT_COMMAND:
        getEnvironment_command().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.COMMAND1__TOOL:
        return tool != null && !tool.isEmpty();
      case MyDslPackage.COMMAND1__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case MyDslPackage.COMMAND1__ENVIRONMENT_COMMAND:
        return environment_command != null && !environment_command.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (Parameters: ");
    result.append(parameters);
    result.append(')');
    return result.toString();
  }

} //Command1Impl
