/**
 */
package CICD.Expressions.BinaryOperations.tests;

import CICD.Expressions.BinaryOperations.BinaryOperationsFactory;
import CICD.Expressions.BinaryOperations.Subtraction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subtraction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubtractionTest extends BinaryOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubtractionTest.class);
	}

	/**
	 * Constructs a new Subtraction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtractionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subtraction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Subtraction getFixture() {
		return (Subtraction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BinaryOperationsFactory.eINSTANCE.createSubtraction());
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

} //SubtractionTest
