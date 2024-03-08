/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.MultipleNestedWhen;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.When;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Nested When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.MultipleNestedWhenImpl#getNestedWhens <em>Nested Whens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleNestedWhenImpl extends NestedWhenImpl implements MultipleNestedWhen {
	/**
	 * The cached value of the '{@link #getNestedWhens() <em>Nested Whens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedWhens()
	 * @generated
	 * @ordered
	 */
	protected EList<When> nestedWhens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleNestedWhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.MULTIPLE_NESTED_WHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<When> getNestedWhens() {
		if (nestedWhens == null) {
			nestedWhens = new EObjectResolvingEList<When>(When.class, this,
					JenkinsPackage.MULTIPLE_NESTED_WHEN__NESTED_WHENS);
		}
		return nestedWhens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JenkinsPackage.MULTIPLE_NESTED_WHEN__NESTED_WHENS:
			return getNestedWhens();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JenkinsPackage.MULTIPLE_NESTED_WHEN__NESTED_WHENS:
			getNestedWhens().clear();
			getNestedWhens().addAll((Collection<? extends When>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case JenkinsPackage.MULTIPLE_NESTED_WHEN__NESTED_WHENS:
			getNestedWhens().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JenkinsPackage.MULTIPLE_NESTED_WHEN__NESTED_WHENS:
			return nestedWhens != null && !nestedWhens.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultipleNestedWhenImpl
