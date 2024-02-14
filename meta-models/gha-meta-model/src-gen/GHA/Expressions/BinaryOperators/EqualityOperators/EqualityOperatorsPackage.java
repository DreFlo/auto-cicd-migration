/**
 */
package GHA.Expressions.BinaryOperators.EqualityOperators;

import GHA.Expressions.BinaryOperators.BinaryOperatorsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory
 * @model kind="package"
 * @generated
 */
public interface EqualityOperatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EqualityOperators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA/Expressions/BinaryOperators/EqualityOperators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EqualityOperators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EqualityOperatorsPackage eINSTANCE = GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityImpl <em>Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityImpl
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl#getEquality()
	 * @generated
	 */
	int EQUALITY = 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__LHS = BinaryOperatorsPackage.BINARY_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__RHS = BinaryOperatorsPackage.BINARY_OP__RHS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY__OP = BinaryOperatorsPackage.BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_FEATURE_COUNT = BinaryOperatorsPackage.BINARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALITY_OPERATION_COUNT = BinaryOperatorsPackage.BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl#getEQUALITY_OPS()
	 * @generated
	 */
	int EQUALITY_OPS = 1;

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BinaryOperators.EqualityOperators.Equality <em>Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equality</em>'.
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.Equality
	 * @generated
	 */
	EClass getEquality();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Expressions.BinaryOperators.EqualityOperators.Equality#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.Equality#getOp()
	 * @see #getEquality()
	 * @generated
	 */
	EAttribute getEquality_Op();

	/**
	 * Returns the meta object for enum '{@link GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS <em>EQUALITY OPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EQUALITY OPS</em>'.
	 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS
	 * @generated
	 */
	EEnum getEQUALITY_OPS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EqualityOperatorsFactory getEqualityOperatorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityImpl <em>Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityImpl
		 * @see GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl#getEquality()
		 * @generated
		 */
		EClass EQUALITY = eINSTANCE.getEquality();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS <em>EQUALITY OPS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BinaryOperators.EqualityOperators.EQUALITY_OPS
		 * @see GHA.Expressions.BinaryOperators.EqualityOperators.impl.EqualityOperatorsPackageImpl#getEQUALITY_OPS()
		 * @generated
		 */
		EEnum EQUALITY_OPS = eINSTANCE.getEQUALITY_OPS();

	}

} //EqualityOperatorsPackage
