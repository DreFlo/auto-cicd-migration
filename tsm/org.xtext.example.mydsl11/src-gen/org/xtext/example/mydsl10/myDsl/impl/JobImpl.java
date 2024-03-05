/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl10.myDsl.Artifact;
import org.xtext.example.mydsl10.myDsl.Environment;
import org.xtext.example.mydsl10.myDsl.IfThenElse;
import org.xtext.example.mydsl10.myDsl.Job;
import org.xtext.example.mydsl10.myDsl.MyDslPackage;
import org.xtext.example.mydsl10.myDsl.Steps;
import org.xtext.example.mydsl10.myDsl.Strategy;
import org.xtext.example.mydsl10.myDsl.Tool_framework;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#isAllow_faillure <em>Allow faillure</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getTool_framework_job <em>Tool framework job</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getIfthenelse <em>Ifthenelse</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.xtext.example.mydsl10.myDsl.impl.JobImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job
{
  /**
   * The default value of the '{@link #isAllow_faillure() <em>Allow faillure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllow_faillure()
   * @generated
   * @ordered
   */
  protected static final boolean ALLOW_FAILLURE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAllow_faillure() <em>Allow faillure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAllow_faillure()
   * @generated
   * @ordered
   */
  protected boolean allow_faillure = ALLOW_FAILLURE_EDEFAULT;

  /**
   * The default value of the '{@link #getName1() <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName1()
   * @generated
   * @ordered
   */
  protected static final String NAME1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName1() <em>Name1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName1()
   * @generated
   * @ordered
   */
  protected String name1 = NAME1_EDEFAULT;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected EList<String> description;

  /**
   * The cached value of the '{@link #getDepends() <em>Depends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDepends()
   * @generated
   * @ordered
   */
  protected EList<Environment> depends;

  /**
   * The cached value of the '{@link #getTool_framework_job() <em>Tool framework job</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTool_framework_job()
   * @generated
   * @ordered
   */
  protected EList<Tool_framework> tool_framework_job;

  /**
   * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutput()
   * @generated
   * @ordered
   */
  protected EList<Artifact> output;

  /**
   * The cached value of the '{@link #getIfthenelse() <em>Ifthenelse</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfthenelse()
   * @generated
   * @ordered
   */
  protected EList<IfThenElse> ifthenelse;

  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<Steps> steps;

  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected EList<Strategy> strategy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JobImpl()
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
    return MyDslPackage.Literals.JOB;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAllow_faillure()
  {
    return allow_faillure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAllow_faillure(boolean newAllow_faillure)
  {
    boolean oldAllow_faillure = allow_faillure;
    allow_faillure = newAllow_faillure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOB__ALLOW_FAILLURE, oldAllow_faillure, allow_faillure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName1()
  {
    return name1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName1(String newName1)
  {
    String oldName1 = name1;
    name1 = newName1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOB__NAME1, oldName1, name1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDescription()
  {
    if (description == null)
    {
      description = new EDataTypeEList<String>(String.class, this, MyDslPackage.JOB__DESCRIPTION);
    }
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Environment> getDepends()
  {
    if (depends == null)
    {
      depends = new EObjectContainmentEList<Environment>(Environment.class, this, MyDslPackage.JOB__DEPENDS);
    }
    return depends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Tool_framework> getTool_framework_job()
  {
    if (tool_framework_job == null)
    {
      tool_framework_job = new EObjectContainmentEList<Tool_framework>(Tool_framework.class, this, MyDslPackage.JOB__TOOL_FRAMEWORK_JOB);
    }
    return tool_framework_job;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Artifact> getOutput()
  {
    if (output == null)
    {
      output = new EObjectContainmentEList<Artifact>(Artifact.class, this, MyDslPackage.JOB__OUTPUT);
    }
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IfThenElse> getIfthenelse()
  {
    if (ifthenelse == null)
    {
      ifthenelse = new EObjectContainmentEList<IfThenElse>(IfThenElse.class, this, MyDslPackage.JOB__IFTHENELSE);
    }
    return ifthenelse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Steps> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<Steps>(Steps.class, this, MyDslPackage.JOB__STEPS);
    }
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Strategy> getStrategy()
  {
    if (strategy == null)
    {
      strategy = new EObjectContainmentEList<Strategy>(Strategy.class, this, MyDslPackage.JOB__STRATEGY);
    }
    return strategy;
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
      case MyDslPackage.JOB__DEPENDS:
        return ((InternalEList<?>)getDepends()).basicRemove(otherEnd, msgs);
      case MyDslPackage.JOB__TOOL_FRAMEWORK_JOB:
        return ((InternalEList<?>)getTool_framework_job()).basicRemove(otherEnd, msgs);
      case MyDslPackage.JOB__OUTPUT:
        return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
      case MyDslPackage.JOB__IFTHENELSE:
        return ((InternalEList<?>)getIfthenelse()).basicRemove(otherEnd, msgs);
      case MyDslPackage.JOB__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
      case MyDslPackage.JOB__STRATEGY:
        return ((InternalEList<?>)getStrategy()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.JOB__ALLOW_FAILLURE:
        return isAllow_faillure();
      case MyDslPackage.JOB__NAME1:
        return getName1();
      case MyDslPackage.JOB__DESCRIPTION:
        return getDescription();
      case MyDslPackage.JOB__DEPENDS:
        return getDepends();
      case MyDslPackage.JOB__TOOL_FRAMEWORK_JOB:
        return getTool_framework_job();
      case MyDslPackage.JOB__OUTPUT:
        return getOutput();
      case MyDslPackage.JOB__IFTHENELSE:
        return getIfthenelse();
      case MyDslPackage.JOB__STEPS:
        return getSteps();
      case MyDslPackage.JOB__STRATEGY:
        return getStrategy();
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
      case MyDslPackage.JOB__ALLOW_FAILLURE:
        setAllow_faillure((Boolean)newValue);
        return;
      case MyDslPackage.JOB__NAME1:
        setName1((String)newValue);
        return;
      case MyDslPackage.JOB__DESCRIPTION:
        getDescription().clear();
        getDescription().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.JOB__DEPENDS:
        getDepends().clear();
        getDepends().addAll((Collection<? extends Environment>)newValue);
        return;
      case MyDslPackage.JOB__TOOL_FRAMEWORK_JOB:
        getTool_framework_job().clear();
        getTool_framework_job().addAll((Collection<? extends Tool_framework>)newValue);
        return;
      case MyDslPackage.JOB__OUTPUT:
        getOutput().clear();
        getOutput().addAll((Collection<? extends Artifact>)newValue);
        return;
      case MyDslPackage.JOB__IFTHENELSE:
        getIfthenelse().clear();
        getIfthenelse().addAll((Collection<? extends IfThenElse>)newValue);
        return;
      case MyDslPackage.JOB__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends Steps>)newValue);
        return;
      case MyDslPackage.JOB__STRATEGY:
        getStrategy().clear();
        getStrategy().addAll((Collection<? extends Strategy>)newValue);
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
      case MyDslPackage.JOB__ALLOW_FAILLURE:
        setAllow_faillure(ALLOW_FAILLURE_EDEFAULT);
        return;
      case MyDslPackage.JOB__NAME1:
        setName1(NAME1_EDEFAULT);
        return;
      case MyDslPackage.JOB__DESCRIPTION:
        getDescription().clear();
        return;
      case MyDslPackage.JOB__DEPENDS:
        getDepends().clear();
        return;
      case MyDslPackage.JOB__TOOL_FRAMEWORK_JOB:
        getTool_framework_job().clear();
        return;
      case MyDslPackage.JOB__OUTPUT:
        getOutput().clear();
        return;
      case MyDslPackage.JOB__IFTHENELSE:
        getIfthenelse().clear();
        return;
      case MyDslPackage.JOB__STEPS:
        getSteps().clear();
        return;
      case MyDslPackage.JOB__STRATEGY:
        getStrategy().clear();
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
      case MyDslPackage.JOB__ALLOW_FAILLURE:
        return allow_faillure != ALLOW_FAILLURE_EDEFAULT;
      case MyDslPackage.JOB__NAME1:
        return NAME1_EDEFAULT == null ? name1 != null : !NAME1_EDEFAULT.equals(name1);
      case MyDslPackage.JOB__DESCRIPTION:
        return description != null && !description.isEmpty();
      case MyDslPackage.JOB__DEPENDS:
        return depends != null && !depends.isEmpty();
      case MyDslPackage.JOB__TOOL_FRAMEWORK_JOB:
        return tool_framework_job != null && !tool_framework_job.isEmpty();
      case MyDslPackage.JOB__OUTPUT:
        return output != null && !output.isEmpty();
      case MyDslPackage.JOB__IFTHENELSE:
        return ifthenelse != null && !ifthenelse.isEmpty();
      case MyDslPackage.JOB__STEPS:
        return steps != null && !steps.isEmpty();
      case MyDslPackage.JOB__STRATEGY:
        return strategy != null && !strategy.isEmpty();
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
    result.append(" (Allow_faillure: ");
    result.append(allow_faillure);
    result.append(", Name1: ");
    result.append(name1);
    result.append(", Description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //JobImpl