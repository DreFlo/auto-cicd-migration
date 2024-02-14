/**
 */
package CICD.Matrices.tests;

import CICD.Matrices.MatricesFactory;
import CICD.Matrices.MatrixCombination;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Matrix Combination</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixCombinationTest extends TestCase {

	/**
	 * The fixture for this Matrix Combination test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixCombination fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatrixCombinationTest.class);
	}

	/**
	 * Constructs a new Matrix Combination test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixCombinationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Matrix Combination test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MatrixCombination fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Matrix Combination test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixCombination getFixture() {
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
		setFixture(MatricesFactory.eINSTANCE.createMatrixCombination());
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

} //MatrixCombinationTest
