/**
 */
package CICD.Expressions.Values.Variables.tests;

import CICD.Expressions.Values.Variables.SecretVariable;
import CICD.Expressions.Values.Variables.VariablesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Secret Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecretVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SecretVariableTest.class);
	}

	/**
	 * Constructs a new Secret Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Secret Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SecretVariable getFixture() {
		return (SecretVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VariablesFactory.eINSTANCE.createSecretVariable());
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

} //SecretVariableTest
