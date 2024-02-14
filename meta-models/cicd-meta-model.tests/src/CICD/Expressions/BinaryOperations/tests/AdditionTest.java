/**
 */
package CICD.Expressions.BinaryOperations.tests;

import CICD.Expressions.BinaryOperations.Addition;
import CICD.Expressions.BinaryOperations.BinaryOperationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdditionTest extends BinaryOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdditionTest.class);
	}

	/**
	 * Constructs a new Addition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Addition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Addition getFixture() {
		return (Addition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BinaryOperationsFactory.eINSTANCE.createAddition());
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

} //AdditionTest
