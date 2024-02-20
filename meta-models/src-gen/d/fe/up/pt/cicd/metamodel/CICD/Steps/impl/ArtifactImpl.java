/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.Steps.impl;

import d.fe.up.pt.cicd.metamodel.CICD.Expressions.Expression;

import d.fe.up.pt.cicd.metamodel.CICD.Steps.Artifact;
import d.fe.up.pt.cicd.metamodel.CICD.Steps.StepsPackage;

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
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.ArtifactImpl#getArtifactName <em>Artifact Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.ArtifactImpl#getIncludePaths <em>Include Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.ArtifactImpl#getExcludePaths <em>Exclude Paths</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.Steps.impl.ArtifactImpl#getRetentionTime <em>Retention Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends NonConditionalStepImpl implements Artifact {
	/**
	 * The cached value of the '{@link #getArtifactName() <em>Artifact Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactName()
	 * @generated
	 * @ordered
	 */
	protected Expression artifactName;

	/**
	 * The cached value of the '{@link #getIncludePaths() <em>Include Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> includePaths;

	/**
	 * The cached value of the '{@link #getExcludePaths() <em>Exclude Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludePaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> excludePaths;

	/**
	 * The cached value of the '{@link #getRetentionTime() <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionTime()
	 * @generated
	 * @ordered
	 */
	protected Expression retentionTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getArtifactName() {
		return artifactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactName(Expression newArtifactName, NotificationChain msgs) {
		Expression oldArtifactName = artifactName;
		artifactName = newArtifactName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StepsPackage.ARTIFACT__ARTIFACT_NAME, oldArtifactName, newArtifactName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactName(Expression newArtifactName) {
		if (newArtifactName != artifactName) {
			NotificationChain msgs = null;
			if (artifactName != null)
				msgs = ((InternalEObject) artifactName).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.ARTIFACT__ARTIFACT_NAME, null, msgs);
			if (newArtifactName != null)
				msgs = ((InternalEObject) newArtifactName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.ARTIFACT__ARTIFACT_NAME, null, msgs);
			msgs = basicSetArtifactName(newArtifactName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARTIFACT__ARTIFACT_NAME, newArtifactName,
					newArtifactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getIncludePaths() {
		if (includePaths == null) {
			includePaths = new EObjectContainmentEList<Expression>(Expression.class, this,
					StepsPackage.ARTIFACT__INCLUDE_PATHS);
		}
		return includePaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getExcludePaths() {
		if (excludePaths == null) {
			excludePaths = new EObjectContainmentEList<Expression>(Expression.class, this,
					StepsPackage.ARTIFACT__EXCLUDE_PATHS);
		}
		return excludePaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRetentionTime() {
		return retentionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetentionTime(Expression newRetentionTime, NotificationChain msgs) {
		Expression oldRetentionTime = retentionTime;
		retentionTime = newRetentionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StepsPackage.ARTIFACT__RETENTION_TIME, oldRetentionTime, newRetentionTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetentionTime(Expression newRetentionTime) {
		if (newRetentionTime != retentionTime) {
			NotificationChain msgs = null;
			if (retentionTime != null)
				msgs = ((InternalEObject) retentionTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.ARTIFACT__RETENTION_TIME, null, msgs);
			if (newRetentionTime != null)
				msgs = ((InternalEObject) newRetentionTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StepsPackage.ARTIFACT__RETENTION_TIME, null, msgs);
			msgs = basicSetRetentionTime(newRetentionTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.ARTIFACT__RETENTION_TIME,
					newRetentionTime, newRetentionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StepsPackage.ARTIFACT__ARTIFACT_NAME:
			return basicSetArtifactName(null, msgs);
		case StepsPackage.ARTIFACT__INCLUDE_PATHS:
			return ((InternalEList<?>) getIncludePaths()).basicRemove(otherEnd, msgs);
		case StepsPackage.ARTIFACT__EXCLUDE_PATHS:
			return ((InternalEList<?>) getExcludePaths()).basicRemove(otherEnd, msgs);
		case StepsPackage.ARTIFACT__RETENTION_TIME:
			return basicSetRetentionTime(null, msgs);
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
		case StepsPackage.ARTIFACT__ARTIFACT_NAME:
			return getArtifactName();
		case StepsPackage.ARTIFACT__INCLUDE_PATHS:
			return getIncludePaths();
		case StepsPackage.ARTIFACT__EXCLUDE_PATHS:
			return getExcludePaths();
		case StepsPackage.ARTIFACT__RETENTION_TIME:
			return getRetentionTime();
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
		case StepsPackage.ARTIFACT__ARTIFACT_NAME:
			setArtifactName((Expression) newValue);
			return;
		case StepsPackage.ARTIFACT__INCLUDE_PATHS:
			getIncludePaths().clear();
			getIncludePaths().addAll((Collection<? extends Expression>) newValue);
			return;
		case StepsPackage.ARTIFACT__EXCLUDE_PATHS:
			getExcludePaths().clear();
			getExcludePaths().addAll((Collection<? extends Expression>) newValue);
			return;
		case StepsPackage.ARTIFACT__RETENTION_TIME:
			setRetentionTime((Expression) newValue);
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
		case StepsPackage.ARTIFACT__ARTIFACT_NAME:
			setArtifactName((Expression) null);
			return;
		case StepsPackage.ARTIFACT__INCLUDE_PATHS:
			getIncludePaths().clear();
			return;
		case StepsPackage.ARTIFACT__EXCLUDE_PATHS:
			getExcludePaths().clear();
			return;
		case StepsPackage.ARTIFACT__RETENTION_TIME:
			setRetentionTime((Expression) null);
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
		case StepsPackage.ARTIFACT__ARTIFACT_NAME:
			return artifactName != null;
		case StepsPackage.ARTIFACT__INCLUDE_PATHS:
			return includePaths != null && !includePaths.isEmpty();
		case StepsPackage.ARTIFACT__EXCLUDE_PATHS:
			return excludePaths != null && !excludePaths.isEmpty();
		case StepsPackage.ARTIFACT__RETENTION_TIME:
			return retentionTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
