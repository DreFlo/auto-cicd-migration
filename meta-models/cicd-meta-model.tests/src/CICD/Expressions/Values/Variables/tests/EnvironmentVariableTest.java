/**
 */
package CICD.Expressions.Values.Variables.tests;

import CICD.Expressions.Values.Variables.EnvironmentVariable;
import CICD.Expressions.Values.Variables.VariablesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnvironmentVariableTest.class);
	}

	/**
	 * Constructs a new Environment Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Environment Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnvironmentVariable getFixture() {
		return (EnvironmentVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariablesFactory.eINSTANCE.createEnvironmentVariable());
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

} //EnvironmentVariableTest
