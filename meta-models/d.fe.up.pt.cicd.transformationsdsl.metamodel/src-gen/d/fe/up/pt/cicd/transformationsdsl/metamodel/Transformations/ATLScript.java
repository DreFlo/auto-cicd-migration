/**
 */
package d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATL Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getScript <em>Script</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getATLScript()
 * @model
 * @generated
 */
public interface ATLScript extends Transformation, TSMTransformation, TIMTransformation {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see #setScript(String)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getATLScript_Script()
	 * @model required="true"
	 * @generated
	 */
	String getScript();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * The literals are from the enumeration {@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS
	 * @see #setModel(MODELS)
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.TransformationsPackage#getATLScript_Model()
	 * @model required="true"
	 * @generated
	 */
	MODELS getModel();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.ATLScript#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see d.fe.up.pt.cicd.transformationsdsl.metamodel.Transformations.MODELS
	 * @see #getModel()
	 * @generated
	 */
	void setModel(MODELS value);

} // ATLScript
