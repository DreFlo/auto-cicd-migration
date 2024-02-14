/**
 */
package CICD.Expressions.BinaryOperations.tests;

import CICD.Expressions.BinaryOperations.BinaryOperationsFactory;
import CICD.Expressions.BinaryOperations.Conjuntion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conjuntion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConjuntionTest extends BinaryOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConjuntionTest.class);
	}

	/**
	 * Constructs a new Conjuntion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuntionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conjuntion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Conjuntion getFixture() {
		return (Conjuntion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BinaryOperationsFactory.eINSTANCE.createConjuntion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConjuntionTest
