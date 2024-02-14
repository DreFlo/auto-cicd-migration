/**
 */
package GHA.Expressions.Values.Variables;

import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.Values.ValuesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GHA.Expressions.Values.Variables.VariablesFactory
 * @model kind="package"
 * @generated
 */
public interface VariablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Variables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA/Expressions/Values/Variables";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Variables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VariablesPackage eINSTANCE = GHA.Expressions.Values.Variables.impl.VariablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link GHA.Expressions.Values.Variables.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.Values.Variables.impl.VariableImpl
	 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = ValuesPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ValuesPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ValuesPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.Values.Variables.impl.GitHubContextImpl <em>Git Hub Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.Values.Variables.impl.GitHubContextImpl
	 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getGitHubContext()
	 * @generated
	 */
	int GIT_HUB_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_CONTEXT__CONTEXT = ValuesPackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Git Hub Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_CONTEXT_FEATURE_COUNT = ValuesPackage.VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Git Hub Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_HUB_CONTEXT_OPERATION_COUNT = ValuesPackage.VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.Values.Variables.impl.VariableDereferenceImpl <em>Variable Dereference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.Values.Variables.impl.VariableDereferenceImpl
	 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getVariableDereference()
	 * @generated
	 */
	int VARIABLE_DEREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE__VARIABLE = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE__PROPERTY = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable Dereference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DEREFERENCE_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.Values.Variables.CONTEXTS <em>CONTEXTS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.Values.Variables.CONTEXTS
	 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getCONTEXTS()
	 * @generated
	 */
	int CONTEXTS = 3;

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.Values.Variables.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see GHA.Expressions.Values.Variables.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Expressions.Values.Variables.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GHA.Expressions.Values.Variables.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.Values.Variables.GitHubContext <em>Git Hub Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Hub Context</em>'.
	 * @see GHA.Expressions.Values.Variables.GitHubContext
	 * @generated
	 */
	EClass getGitHubContext();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Expressions.Values.Variables.GitHubContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see GHA.Expressions.Values.Variables.GitHubContext#getContext()
	 * @see #getGitHubContext()
	 * @generated
	 */
	EAttribute getGitHubContext_Context();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.Values.Variables.VariableDereference <em>Variable Dereference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Dereference</em>'.
	 * @see GHA.Expressions.Values.Variables.VariableDereference
	 * @generated
	 */
	EClass getVariableDereference();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.Values.Variables.VariableDereference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see GHA.Expressions.Values.Variables.VariableDereference#getVariable()
	 * @see #getVariableDereference()
	 * @generated
	 */
	EReference getVariableDereference_Variable();

	/**
	 * Returns the meta object for the attribute '{@link GHA.Expressions.Values.Variables.VariableDereference#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see GHA.Expressions.Values.Variables.VariableDereference#getProperty()
	 * @see #getVariableDereference()
	 * @generated
	 */
	EAttribute getVariableDereference_Property();

	/**
	 * Returns the meta object for enum '{@link GHA.Expressions.Values.Variables.CONTEXTS <em>CONTEXTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CONTEXTS</em>'.
	 * @see GHA.Expressions.Values.Variables.CONTEXTS
	 * @generated
	 */
	EEnum getCONTEXTS();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VariablesFactory getVariablesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GHA.Expressions.Values.Variables.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.Values.Variables.impl.VariableImpl
		 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.Values.Variables.impl.GitHubContextImpl <em>Git Hub Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.Values.Variables.impl.GitHubContextImpl
		 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getGitHubContext()
		 * @generated
		 */
		EClass GIT_HUB_CONTEXT = eINSTANCE.getGitHubContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_HUB_CONTEXT__CONTEXT = eINSTANCE.getGitHubContext_Context();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.Values.Variables.impl.VariableDereferenceImpl <em>Variable Dereference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.Values.Variables.impl.VariableDereferenceImpl
		 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getVariableDereference()
		 * @generated
		 */
		EClass VARIABLE_DEREFERENCE = eINSTANCE.getVariableDereference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_DEREFERENCE__VARIABLE = eINSTANCE.getVariableDereference_Variable();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DEREFERENCE__PROPERTY = eINSTANCE.getVariableDereference_Property();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.Values.Variables.CONTEXTS <em>CONTEXTS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.Values.Variables.CONTEXTS
		 * @see GHA.Expressions.Values.Variables.impl.VariablesPackageImpl#getCONTEXTS()
		 * @generated
		 */
		EEnum CONTEXTS = eINSTANCE.getCONTEXTS();

	}

} //VariablesPackage
