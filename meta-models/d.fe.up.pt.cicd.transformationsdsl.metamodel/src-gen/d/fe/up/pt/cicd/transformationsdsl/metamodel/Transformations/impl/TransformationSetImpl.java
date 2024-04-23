/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl;

import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TSMTransformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.Transformation;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationSet;
import d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl#getPreTIM <em>Pre TIM</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl#getOnTIM <em>On TIM</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.impl.TransformationSetImpl#getPostTIM <em>Post TIM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationSetImpl extends MinimalEObjectImpl.Container implements TransformationSet {
	/**
	 * The cached value of the '{@link #getPreTIM() <em>Pre TIM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreTIM()
	 * @generated
	 * @ordered
	 */
	protected EList<TSMTransformation> preTIM;

	/**
	 * The cached value of the '{@link #getOnTIM() <em>On TIM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnTIM()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation> onTIM;

	/**
	 * The cached value of the '{@link #getPostTIM() <em>Post TIM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostTIM()
	 * @generated
	 * @ordered
	 */
	protected EList<TSMTransformation> postTIM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformationsPackage.Literals.TRANSFORMATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSMTransformation> getPreTIM() {
		if (preTIM == null) {
			preTIM = new EObjectContainmentEList<TSMTransformation>(TSMTransformation.class, this,
					TransformationsPackage.TRANSFORMATION_SET__PRE_TIM);
		}
		return preTIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transformation> getOnTIM() {
		if (onTIM == null) {
			onTIM = new EObjectContainmentEList<Transformation>(Transformation.class, this,
					TransformationsPackage.TRANSFORMATION_SET__ON_TIM);
		}
		return onTIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSMTransformation> getPostTIM() {
		if (postTIM == null) {
			postTIM = new EObjectContainmentEList<TSMTransformation>(TSMTransformation.class, this,
					TransformationsPackage.TRANSFORMATION_SET__POST_TIM);
		}
		return postTIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TransformationsPackage.TRANSFORMATION_SET__PRE_TIM:
			return ((InternalEList<?>) getPreTIM()).basicRemove(otherEnd, msgs);
		case TransformationsPackage.TRANSFORMATION_SET__ON_TIM:
			return ((InternalEList<?>) getOnTIM()).basicRemove(otherEnd, msgs);
		case TransformationsPackage.TRANSFORMATION_SET__POST_TIM:
			return ((InternalEList<?>) getPostTIM()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TransformationsPackage.TRANSFORMATION_SET__PRE_TIM:
			return getPreTIM();
		case TransformationsPackage.TRANSFORMATION_SET__ON_TIM:
			return getOnTIM();
		case TransformationsPackage.TRANSFORMATION_SET__POST_TIM:
			return getPostTIM();
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
		case TransformationsPackage.TRANSFORMATION_SET__PRE_TIM:
			getPreTIM().clear();
			getPreTIM().addAll((Collection<? extends TSMTransformation>) newValue);
			return;
		case TransformationsPackage.TRANSFORMATION_SET__ON_TIM:
			getOnTIM().clear();
			getOnTIM().addAll((Collection<? extends Transformation>) newValue);
			return;
		case TransformationsPackage.TRANSFORMATION_SET__POST_TIM:
			getPostTIM().clear();
			getPostTIM().addAll((Collection<? extends TSMTransformation>) newValue);
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
		case TransformationsPackage.TRANSFORMATION_SET__PRE_TIM:
			getPreTIM().clear();
			return;
		case TransformationsPackage.TRANSFORMATION_SET__ON_TIM:
			getOnTIM().clear();
			return;
		case TransformationsPackage.TRANSFORMATION_SET__POST_TIM:
			getPostTIM().clear();
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
		case TransformationsPackage.TRANSFORMATION_SET__PRE_TIM:
			return preTIM != null && !preTIM.isEmpty();
		case TransformationsPackage.TRANSFORMATION_SET__ON_TIM:
			return onTIM != null && !onTIM.isEmpty();
		case TransformationsPackage.TRANSFORMATION_SET__POST_TIM:
			return postTIM != null && !postTIM.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationSetImpl
