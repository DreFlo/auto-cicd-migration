/**
 */
package CICD.Expressions.UnaryOperations.tests;

import CICD.Expressions.UnaryOperations.UnaryOp;
import CICD.Expressions.UnaryOperations.UnaryOperationsFactory;

import CICD.Expressions.tests.ExpressionTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unary Op</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnaryOpTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnaryOpTest.class);
	}

	/**
	 * Constructs a new Unary Op test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unary Op test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnaryOp getFixture() {
		return (UnaryOp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnaryOperationsFactory.eINSTANCE.createUnaryOp());
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

} //UnaryOpTest
