/**
 */
package CICD.Expressions.tests;

import CICD.Expressions.Expression;
import CICD.Expressions.ExpressionsFactory;
import CICD.Expressions.ExpressionsPackage;

import CICD.Expressions.Values.Variables.EnvironmentVariable;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssignmentTest extends TestCase {

	/**
	 * The fixture for this Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<EnvironmentVariable, Expression> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssignmentTest.class);
	}

	/**
	 * Constructs a new Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<EnvironmentVariable, Expression> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<EnvironmentVariable, Expression> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<EnvironmentVariable, Expression>)ExpressionsFactory.eINSTANCE.create(ExpressionsPackage.Literals.ASSIGNMENT));
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

} //AssignmentTest
