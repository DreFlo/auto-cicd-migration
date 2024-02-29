/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl10.myDsl.JobIfThenElse;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job If Then Else</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobIfThenElseImpl#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobIfThenElseImpl extends MinimalEObjectImpl.Container implements JobIfThenElse
{
  /**
   * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOption()
   * @generated
   * @ordered
   */
  protected EObject option;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JobIfThenElseImpl()
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
    return MyDslPackage.Literals.JOB_IF_THEN_ELSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getOption()
  {
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOption(EObject newOption, NotificationChain msgs)
  {
    EObject oldOption = option;
    option = newOption;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.JOB_IF_THEN_ELSE__OPTION, oldOption, newOption);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOption(EObject newOption)
  {
    if (newOption != option)
    {
      NotificationChain msgs = null;
      if (option != null)
        msgs = ((InternalEObject)option).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.JOB_IF_THEN_ELSE__OPTION, null, msgs);
      if (newOption != null)
        msgs = ((InternalEObject)newOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.JOB_IF_THEN_ELSE__OPTION, null, msgs);
      msgs = basicSetOption(newOption, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOB_IF_THEN_ELSE__OPTION, newOption, newOption));
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
      case MyDslPackage.JOB_IF_THEN_ELSE__OPTION:
        return basicSetOption(null, msgs);
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
      case MyDslPackage.JOB_IF_THEN_ELSE__OPTION:
        return getOption();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.JOB_IF_THEN_ELSE__OPTION:
        setOption((EObject)newValue);
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
      case MyDslPackage.JOB_IF_THEN_ELSE__OPTION:
        setOption((EObject)null);
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
      case MyDslPackage.JOB_IF_THEN_ELSE__OPTION:
        return option != null;
    }
    return super.eIsSet(featureID);
  }

} //JobIfThenElseImpl
