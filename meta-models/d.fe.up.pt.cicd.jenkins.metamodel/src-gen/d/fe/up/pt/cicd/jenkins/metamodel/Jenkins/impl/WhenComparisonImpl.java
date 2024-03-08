/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.COMPARATORS;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.WhenComparison;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>When Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl#getComparator <em>Comparator</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.WhenComparisonImpl#getCaseSensitive <em>Case Sensitive</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WhenComparisonImpl extends WhenImpl implements WhenComparison {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected static final COMPARATORS COMPARATOR_EDEFAULT = COMPARATORS.EQUALS;

	/**
	 * The cached value of the '{@link #getComparator() <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparator()
	 * @generated
	 * @ordered
	 */
	protected COMPARATORS comparator = COMPARATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CASE_SENSITIVE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected Boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhenComparisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.WHEN_COMPARISON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_COMPARISON__PATTERN, oldPattern,
					pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public COMPARATORS getComparator() {
		return comparator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComparator(COMPARATORS newComparator) {
		COMPARATORS oldComparator = comparator;
		comparator = newComparator == null ? COMPARATOR_EDEFAULT : newComparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_COMPARISON__COMPARATOR,
					oldComparator, comparator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseSensitive(Boolean newCaseSensitive) {
		Boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.WHEN_COMPARISON__CASE_SENSITIVE,
					oldCaseSensitive, caseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JenkinsPackage.WHEN_COMPARISON__PATTERN:
			return getPattern();
		case JenkinsPackage.WHEN_COMPARISON__COMPARATOR:
			return getComparator();
		case JenkinsPackage.WHEN_COMPARISON__CASE_SENSITIVE:
			return getCaseSensitive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JenkinsPackage.WHEN_COMPARISON__PATTERN:
			setPattern((String) newValue);
			return;
		case JenkinsPackage.WHEN_COMPARISON__COMPARATOR:
			setComparator((COMPARATORS) newValue);
			return;
		case JenkinsPackage.WHEN_COMPARISON__CASE_SENSITIVE:
			setCaseSensitive((Boolean) newValue);
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
		case JenkinsPackage.WHEN_COMPARISON__PATTERN:
			setPattern(PATTERN_EDEFAULT);
			return;
		case JenkinsPackage.WHEN_COMPARISON__COMPARATOR:
			setComparator(COMPARATOR_EDEFAULT);
			return;
		case JenkinsPackage.WHEN_COMPARISON__CASE_SENSITIVE:
			setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
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
		case JenkinsPackage.WHEN_COMPARISON__PATTERN:
			return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
		case JenkinsPackage.WHEN_COMPARISON__COMPARATOR:
			return comparator != COMPARATOR_EDEFAULT;
		case JenkinsPackage.WHEN_COMPARISON__CASE_SENSITIVE:
			return CASE_SENSITIVE_EDEFAULT == null ? caseSensitive != null
					: !CASE_SENSITIVE_EDEFAULT.equals(caseSensitive);
		}
		return super.eIsSet(featureID);
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
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(", comparator: ");
		result.append(comparator);
		result.append(", caseSensitive: ");
		result.append(caseSensitive);
		result.append(')');
		return result.toString();
	}

} //WhenComparisonImpl
