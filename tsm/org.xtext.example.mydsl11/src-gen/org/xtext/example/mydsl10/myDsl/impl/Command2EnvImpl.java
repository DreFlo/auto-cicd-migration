/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl10.myDsl.Command2Env;
import org.xtext.example.mydsl10.myDsl.Environment;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command2 Env</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.Command2EnvImpl#getEnvironment_command <em>Environment command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Command2EnvImpl extends MinimalEObjectImpl.Container implements Command2Env
{
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
  protected Command2EnvImpl()
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
    return MyDslPackage.Literals.COMMAND2_ENV;
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
      environment_command = new EObjectContainmentEList<Environment>(Environment.class, this, MyDslPackage.COMMAND2_ENV__ENVIRONMENT_COMMAND);
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
      case MyDslPackage.COMMAND2_ENV__ENVIRONMENT_COMMAND:
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
      case MyDslPackage.COMMAND2_ENV__ENVIRONMENT_COMMAND:
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
      case MyDslPackage.COMMAND2_ENV__ENVIRONMENT_COMMAND:
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
      case MyDslPackage.COMMAND2_ENV__ENVIRONMENT_COMMAND:
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
      case MyDslPackage.COMMAND2_ENV__ENVIRONMENT_COMMAND:
        return environment_command != null && !environment_command.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //Command2EnvImpl