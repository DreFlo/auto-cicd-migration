/**
 */
package CICD.Expressions.BuiltInFunctions.tests;

import CICD.Expressions.BuiltInFunctions.BuiltInFunction;
import CICD.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import CICD.Expressions.tests.ExpressionTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Built In Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BuiltInFunctionTest extends ExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BuiltInFunctionTest.class);
	}

	/**
	 * Constructs a new Built In Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuiltInFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Built In Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BuiltInFunction getFixture() {
		return (BuiltInFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BuiltInFunctionsFactory.eINSTANCE.createBuiltInFunction());
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

} //BuiltInFunctionTest
