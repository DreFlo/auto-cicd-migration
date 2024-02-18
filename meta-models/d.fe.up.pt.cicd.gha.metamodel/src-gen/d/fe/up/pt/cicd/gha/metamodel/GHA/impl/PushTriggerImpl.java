/**
 */
package d.fe.up.pt.cicd.gha.metamodel.GHA.impl;

import d.fe.up.pt.cicd.gha.metamodel.GHA.Expression;
import d.fe.up.pt.cicd.gha.metamodel.GHA.GHAPackage;
import d.fe.up.pt.cicd.gha.metamodel.GHA.PushTrigger;

import d.fe.up.pt.cicd.gha.metamodel.GHA.SpecifiedPathsTrigger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.PushTriggerImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.PushTriggerImpl#isIgnoreSpecifiedPaths <em>Ignore Specified Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.PushTriggerImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.gha.metamodel.GHA.impl.PushTriggerImpl#isIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushTriggerImpl extends SpecifiedBranchesTriggerImpl implements PushTrigger {
	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> paths;

	/**
	 * The default value of the '{@link #isIgnoreSpecifiedPaths() <em>Ignore Specified Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedPaths()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_SPECIFIED_PATHS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreSpecifiedPaths() <em>Ignore Specified Paths</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedPaths()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreSpecifiedPaths = IGNORE_SPECIFIED_PATHS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> tags;

	/**
	 * The default value of the '{@link #isIgnoreSpecifiedTags() <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedTags()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_SPECIFIED_TAGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreSpecifiedTags() <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreSpecifiedTags()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreSpecifiedTags = IGNORE_SPECIFIED_TAGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GHAPackage.Literals.PUSH_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<Expression>(Expression.class, this, GHAPackage.PUSH_TRIGGER__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreSpecifiedPaths() {
		return ignoreSpecifiedPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSpecifiedPaths(boolean newIgnoreSpecifiedPaths) {
		boolean oldIgnoreSpecifiedPaths = ignoreSpecifiedPaths;
		ignoreSpecifiedPaths = newIgnoreSpecifiedPaths;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS,
					oldIgnoreSpecifiedPaths, ignoreSpecifiedPaths));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Expression>(Expression.class, this, GHAPackage.PUSH_TRIGGER__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreSpecifiedTags() {
		return ignoreSpecifiedTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreSpecifiedTags(boolean newIgnoreSpecifiedTags) {
		boolean oldIgnoreSpecifiedTags = ignoreSpecifiedTags;
		ignoreSpecifiedTags = newIgnoreSpecifiedTags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS,
					oldIgnoreSpecifiedTags, ignoreSpecifiedTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GHAPackage.PUSH_TRIGGER__PATHS:
			return ((InternalEList<?>) getPaths()).basicRemove(otherEnd, msgs);
		case GHAPackage.PUSH_TRIGGER__TAGS:
			return ((InternalEList<?>) getTags()).basicRemove(otherEnd, msgs);
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
		case GHAPackage.PUSH_TRIGGER__PATHS:
			return getPaths();
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
			return isIgnoreSpecifiedPaths();
		case GHAPackage.PUSH_TRIGGER__TAGS:
			return getTags();
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS:
			return isIgnoreSpecifiedTags();
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
		case GHAPackage.PUSH_TRIGGER__PATHS:
			getPaths().clear();
			getPaths().addAll((Collection<? extends Expression>) newValue);
			return;
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
			setIgnoreSpecifiedPaths((Boolean) newValue);
			return;
		case GHAPackage.PUSH_TRIGGER__TAGS:
			getTags().clear();
			getTags().addAll((Collection<? extends Expression>) newValue);
			return;
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS:
			setIgnoreSpecifiedTags((Boolean) newValue);
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
		case GHAPackage.PUSH_TRIGGER__PATHS:
			getPaths().clear();
			return;
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
			setIgnoreSpecifiedPaths(IGNORE_SPECIFIED_PATHS_EDEFAULT);
			return;
		case GHAPackage.PUSH_TRIGGER__TAGS:
			getTags().clear();
			return;
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS:
			setIgnoreSpecifiedTags(IGNORE_SPECIFIED_TAGS_EDEFAULT);
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
		case GHAPackage.PUSH_TRIGGER__PATHS:
			return paths != null && !paths.isEmpty();
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
			return ignoreSpecifiedPaths != IGNORE_SPECIFIED_PATHS_EDEFAULT;
		case GHAPackage.PUSH_TRIGGER__TAGS:
			return tags != null && !tags.isEmpty();
		case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_TAGS:
			return ignoreSpecifiedTags != IGNORE_SPECIFIED_TAGS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SpecifiedPathsTrigger.class) {
			switch (derivedFeatureID) {
			case GHAPackage.PUSH_TRIGGER__PATHS:
				return GHAPackage.SPECIFIED_PATHS_TRIGGER__PATHS;
			case GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS:
				return GHAPackage.SPECIFIED_PATHS_TRIGGER__IGNORE_SPECIFIED_PATHS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SpecifiedPathsTrigger.class) {
			switch (baseFeatureID) {
			case GHAPackage.SPECIFIED_PATHS_TRIGGER__PATHS:
				return GHAPackage.PUSH_TRIGGER__PATHS;
			case GHAPackage.SPECIFIED_PATHS_TRIGGER__IGNORE_SPECIFIED_PATHS:
				return GHAPackage.PUSH_TRIGGER__IGNORE_SPECIFIED_PATHS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ignoreSpecifiedPaths: ");
		result.append(ignoreSpecifiedPaths);
		result.append(", ignoreSpecifiedTags: ");
		result.append(ignoreSpecifiedTags);
		result.append(')');
		return result.toString();
	}

} //PushTriggerImpl
