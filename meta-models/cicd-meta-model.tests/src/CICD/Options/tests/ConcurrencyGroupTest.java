/**
 */
package CICD.Options.tests;

import CICD.Options.ConcurrencyGroup;
import CICD.Options.OptionsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concurrency Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcurrencyGroupTest extends TestCase {

	/**
	 * The fixture for this Concurrency Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyGroup fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConcurrencyGroupTest.class);
	}

	/**
	 * Constructs a new Concurrency Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcurrencyGroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Concurrency Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConcurrencyGroup fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Concurrency Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyGroup getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OptionsFactory.eINSTANCE.createConcurrencyGroup());
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

} //ConcurrencyGroupTest
