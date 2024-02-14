/**
 */
package CICD.Options.tests;

import CICD.Options.OptionsFactory;
import CICD.Options.OptionsPackage;
import CICD.Options.PermissionType;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PermissionTest extends TestCase {

	/**
	 * The fixture for this Permission test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, PermissionType> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PermissionTest.class);
	}

	/**
	 * Constructs a new Permission test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Permission test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, PermissionType> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Permission test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, PermissionType> getFixture() {
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
		setFixture((Map.Entry<String, PermissionType>)OptionsFactory.eINSTANCE.create(OptionsPackage.Literals.PERMISSION));
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

} //PermissionTest
