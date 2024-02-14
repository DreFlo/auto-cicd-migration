/**
 */
package CICD.Expressions.BinaryOperations.tests;

import CICD.Expressions.BinaryOperations.BinaryOp;
import CICD.Expressions.BinaryOperations.BinaryOperationsFactory;

import CICD.Expressions.tests.ExpressionTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryOpTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryOpTest.class);
	}

	/**
	 * Constructs a new Binary Op test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Op test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryOp getFixture() {
		return (BinaryOp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BinaryOperationsFactory.eINSTANCE.createBinaryOp());
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

} //BinaryOpTest
