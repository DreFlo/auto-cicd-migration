/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.impl;

import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable;
import d.fe.up.pt.cicd.metamodel.CICD.Expression;
import d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination;

import java.util.Collection;
import java.util.Map;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.impl.MatrixCombinationImpl#getCombinationEntries <em>Combination Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixCombinationImpl extends MinimalEObjectImpl.Container implements MatrixCombination {
	/**
	 * The cached value of the '{@link #getCombinationEntries() <em>Combination Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinationEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Map.Entry<EnvironmentVariable, Expression>> combinationEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixCombinationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CICDPackage.Literals.MATRIX_COMBINATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Map.Entry<EnvironmentVariable, Expression>> getCombinationEntries() {
		if (combinationEntries == null) {
			combinationEntries = new EObjectResolvingEList<Map.Entry<EnvironmentVariable, Expression>>(Entry.class,
					this, CICDPackage.MATRIX_COMBINATION__COMBINATION_ENTRIES);
		}
		return combinationEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CICDPackage.MATRIX_COMBINATION__COMBINATION_ENTRIES:
			return getCombinationEntries();
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
		case CICDPackage.MATRIX_COMBINATION__COMBINATION_ENTRIES:
			getCombinationEntries().clear();
			getCombinationEntries().addAll((Collection<? extends Map.Entry<EnvironmentVariable, Expression>>) newValue);
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
		case CICDPackage.MATRIX_COMBINATION__COMBINATION_ENTRIES:
			getCombinationEntries().clear();
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
		case CICDPackage.MATRIX_COMBINATION__COMBINATION_ENTRIES:
			return combinationEntries != null && !combinationEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatrixCombinationImpl
