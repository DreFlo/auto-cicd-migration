/**
 */
package CICD.Expressions.UnaryOperations.tests;

import CICD.Expressions.UnaryOperations.Negation;
import CICD.Expressions.UnaryOperations.UnaryOperationsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Negation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NegationTest extends UnaryOpTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NegationTest.class);
	}

	/**
	 * Constructs a new Negation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Negation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Negation getFixture() {
		return (Negation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UnaryOperationsFactory.eINSTANCE.createNegation());
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

} //NegationTest
