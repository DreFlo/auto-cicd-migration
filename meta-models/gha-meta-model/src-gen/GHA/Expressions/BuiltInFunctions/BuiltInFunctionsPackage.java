/**
 */
package GHA.Expressions.BuiltInFunctions;

import GHA.Expressions.ExpressionsPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface BuiltInFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "BuiltInFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://d.fe.up.pt/GHA/Expressions/BuiltInFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "BuiltInFunctions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuiltInFunctionsPackage eINSTANCE = GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionCallImpl <em>Built In Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionCallImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getBuiltInFunctionCall()
	 * @generated
	 */
	int BUILT_IN_FUNCTION_CALL = 0;

	/**
	 * The number of structural features of the '<em>Built In Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_CALL_FEATURE_COUNT = ExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Built In Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILT_IN_FUNCTION_CALL_OPERATION_COUNT = ExpressionsPackage.EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.ContainsImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 1;

	/**
	 * The feature id for the '<em><b>Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__SEARCH = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__ITEM = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.StartsWithImpl <em>Starts With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.StartsWithImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getStartsWith()
	 * @generated
	 */
	int STARTS_WITH = 2;

	/**
	 * The feature id for the '<em><b>Search String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__SEARCH_STRING = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH__SEARCH_VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Starts With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTS_WITH_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.EndsWithImpl <em>Ends With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.EndsWithImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getEndsWith()
	 * @generated
	 */
	int ENDS_WITH = 3;

	/**
	 * The feature id for the '<em><b>Search String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SEARCH_STRING = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH__SEARCH_VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ends With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENDS_WITH_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.FormatImpl <em>Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.FormatImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getFormat()
	 * @generated
	 */
	int FORMAT = 4;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__STRING = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replace Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT__REPLACE_VALUES = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.JoinImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 5;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ARRAY = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__SEP = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.ToJSONImpl <em>To JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.ToJSONImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getToJSON()
	 * @generated
	 */
	int TO_JSON = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_JSON__VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_JSON_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>To JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_JSON_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.FromJSONImpl <em>From JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.FromJSONImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getFromJSON()
	 * @generated
	 */
	int FROM_JSON = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_JSON__VALUE = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_JSON_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>From JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_JSON_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GHA.Expressions.BuiltInFunctions.impl.HashFilesImpl <em>Hash Files</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GHA.Expressions.BuiltInFunctions.impl.HashFilesImpl
	 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getHashFiles()
	 * @generated
	 */
	int HASH_FILES = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FILES__PATH = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hash Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FILES_FEATURE_COUNT = BUILT_IN_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hash Files</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_FILES_OPERATION_COUNT = BUILT_IN_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall <em>Built In Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Built In Function Call</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.BuiltInFunctionCall
	 * @generated
	 */
	EClass getBuiltInFunctionCall();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.Contains#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Contains#getSearch()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Search();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.Contains#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Contains#getItem()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Item();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.StartsWith <em>Starts With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starts With</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StartsWith
	 * @generated
	 */
	EClass getStartsWith();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.StartsWith#getSearchString <em>Search String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search String</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StartsWith#getSearchString()
	 * @see #getStartsWith()
	 * @generated
	 */
	EReference getStartsWith_SearchString();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.StartsWith#getSearchValue <em>Search Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Value</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.StartsWith#getSearchValue()
	 * @see #getStartsWith()
	 * @generated
	 */
	EReference getStartsWith_SearchValue();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.EndsWith <em>Ends With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ends With</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.EndsWith
	 * @generated
	 */
	EClass getEndsWith();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.EndsWith#getSearchString <em>Search String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search String</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.EndsWith#getSearchString()
	 * @see #getEndsWith()
	 * @generated
	 */
	EReference getEndsWith_SearchString();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.EndsWith#getSearchValue <em>Search Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Search Value</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.EndsWith#getSearchValue()
	 * @see #getEndsWith()
	 * @generated
	 */
	EReference getEndsWith_SearchValue();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.Format <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Format
	 * @generated
	 */
	EClass getFormat();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.Format#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Format#getString()
	 * @see #getFormat()
	 * @generated
	 */
	EReference getFormat_String();

	/**
	 * Returns the meta object for the containment reference list '{@link GHA.Expressions.BuiltInFunctions.Format#getReplaceValues <em>Replace Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace Values</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Format#getReplaceValues()
	 * @see #getFormat()
	 * @generated
	 */
	EReference getFormat_ReplaceValues();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.Join#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Join#getArray()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Array();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.Join#getSep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sep</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.Join#getSep()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Sep();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.ToJSON <em>To JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To JSON</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.ToJSON
	 * @generated
	 */
	EClass getToJSON();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.ToJSON#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.ToJSON#getValue()
	 * @see #getToJSON()
	 * @generated
	 */
	EReference getToJSON_Value();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.FromJSON <em>From JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From JSON</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.FromJSON
	 * @generated
	 */
	EClass getFromJSON();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.FromJSON#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.FromJSON#getValue()
	 * @see #getFromJSON()
	 * @generated
	 */
	EReference getFromJSON_Value();

	/**
	 * Returns the meta object for class '{@link GHA.Expressions.BuiltInFunctions.HashFiles <em>Hash Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Files</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.HashFiles
	 * @generated
	 */
	EClass getHashFiles();

	/**
	 * Returns the meta object for the containment reference '{@link GHA.Expressions.BuiltInFunctions.HashFiles#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see GHA.Expressions.BuiltInFunctions.HashFiles#getPath()
	 * @see #getHashFiles()
	 * @generated
	 */
	EReference getHashFiles_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuiltInFunctionsFactory getBuiltInFunctionsFactory();

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
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionCallImpl <em>Built In Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionCallImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getBuiltInFunctionCall()
		 * @generated
		 */
		EClass BUILT_IN_FUNCTION_CALL = eINSTANCE.getBuiltInFunctionCall();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.ContainsImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__SEARCH = eINSTANCE.getContains_Search();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__ITEM = eINSTANCE.getContains_Item();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.StartsWithImpl <em>Starts With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.StartsWithImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getStartsWith()
		 * @generated
		 */
		EClass STARTS_WITH = eINSTANCE.getStartsWith();

		/**
		 * The meta object literal for the '<em><b>Search String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTS_WITH__SEARCH_STRING = eINSTANCE.getStartsWith_SearchString();

		/**
		 * The meta object literal for the '<em><b>Search Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STARTS_WITH__SEARCH_VALUE = eINSTANCE.getStartsWith_SearchValue();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.EndsWithImpl <em>Ends With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.EndsWithImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getEndsWith()
		 * @generated
		 */
		EClass ENDS_WITH = eINSTANCE.getEndsWith();

		/**
		 * The meta object literal for the '<em><b>Search String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDS_WITH__SEARCH_STRING = eINSTANCE.getEndsWith_SearchString();

		/**
		 * The meta object literal for the '<em><b>Search Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENDS_WITH__SEARCH_VALUE = eINSTANCE.getEndsWith_SearchValue();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.FormatImpl <em>Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.FormatImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getFormat()
		 * @generated
		 */
		EClass FORMAT = eINSTANCE.getFormat();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAT__STRING = eINSTANCE.getFormat_String();

		/**
		 * The meta object literal for the '<em><b>Replace Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAT__REPLACE_VALUES = eINSTANCE.getFormat_ReplaceValues();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.JoinImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__ARRAY = eINSTANCE.getJoin_Array();

		/**
		 * The meta object literal for the '<em><b>Sep</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__SEP = eINSTANCE.getJoin_Sep();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.ToJSONImpl <em>To JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.ToJSONImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getToJSON()
		 * @generated
		 */
		EClass TO_JSON = eINSTANCE.getToJSON();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO_JSON__VALUE = eINSTANCE.getToJSON_Value();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.FromJSONImpl <em>From JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.FromJSONImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getFromJSON()
		 * @generated
		 */
		EClass FROM_JSON = eINSTANCE.getFromJSON();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_JSON__VALUE = eINSTANCE.getFromJSON_Value();

		/**
		 * The meta object literal for the '{@link GHA.Expressions.BuiltInFunctions.impl.HashFilesImpl <em>Hash Files</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GHA.Expressions.BuiltInFunctions.impl.HashFilesImpl
		 * @see GHA.Expressions.BuiltInFunctions.impl.BuiltInFunctionsPackageImpl#getHashFiles()
		 * @generated
		 */
		EClass HASH_FILES = eINSTANCE.getHashFiles();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_FILES__PATH = eINSTANCE.getHashFiles_Path();

	}

} //BuiltInFunctionsPackage
