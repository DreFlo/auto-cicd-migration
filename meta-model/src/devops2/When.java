/**
 */
package devops2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link devops2.When#getName4 <em>Name4</em>}</li>
 *   <li>{@link devops2.When#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link devops2.When#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see devops2.Devops2Package#getWhen()
 * @model
 * @generated
 */
public interface When extends EObject {

	/**
	 * Returns the value of the '<em><b>Name4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name4</em>' attribute.
	 * @see #setName4(String)
	 * @see devops2.Devops2Package#getWhen_Name4()
	 * @model id="true"
	 * @generated
	 */
	String getName4();

	/**
	 * Sets the value of the '{@link devops2.When#getName4 <em>Name4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name4</em>' attribute.
	 * @see #getName4()
	 * @generated
	 */
	void setName4(String value);

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(String)
	 * @see devops2.Devops2Package#getWhen_Timer()
	 * @model
	 * @generated
	 */
	String getTimer();

	/**
	 * Sets the value of the '{@link devops2.When#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(String value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see #setTrigger(String)
	 * @see devops2.Devops2Package#getWhen_Trigger()
	 * @model
	 * @generated
	 */
	String getTrigger();

	/**
	 * Sets the value of the '{@link devops2.When#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(String value);
} // When
