/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Job Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequires <em>Requires</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getContexts <em>Contexts</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getBranches <em>Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getTags <em>Tags</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getPreSteps <em>Pre Steps</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getPostSteps <em>Post Steps</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface WorkflowJobConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration}.
	 * It is bidirectional and its opposite is '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Requires()
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequiredBy
	 * @model opposite="requiredBy"
	 * @generated
	 */
	EList<WorkflowJobConfiguration> getRequires();

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration}.
	 * It is bidirectional and its opposite is '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_RequiredBy()
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getRequires
	 * @model opposite="requires"
	 * @generated
	 */
	EList<WorkflowJobConfiguration> getRequiredBy();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Contexts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getContexts();

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getBranches();

	/**
	 * Returns the value of the '<em><b>Ignore Specified Branches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Specified Branches</em>' attribute.
	 * @see #setIgnoreSpecifiedBranches(Boolean)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_IgnoreSpecifiedBranches()
	 * @model
	 * @generated
	 */
	Boolean getIgnoreSpecifiedBranches();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedBranches <em>Ignore Specified Branches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Branches</em>' attribute.
	 * @see #getIgnoreSpecifiedBranches()
	 * @generated
	 */
	void setIgnoreSpecifiedBranches(Boolean value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getTags();

	/**
	 * Returns the value of the '<em><b>Ignore Specified Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Specified Tags</em>' attribute.
	 * @see #setIgnoreSpecifiedTags(Boolean)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_IgnoreSpecifiedTags()
	 * @model
	 * @generated
	 */
	Boolean getIgnoreSpecifiedTags();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getIgnoreSpecifiedTags <em>Ignore Specified Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Specified Tags</em>' attribute.
	 * @see #getIgnoreSpecifiedTags()
	 * @generated
	 */
	void setIgnoreSpecifiedTags(Boolean value);

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(Matrix)
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getMatrix();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Matrix value);

	/**
	 * Returns the value of the '<em><b>Pre Steps</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Steps</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_PreSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getPreSteps();

	/**
	 * Returns the value of the '<em><b>Post Steps</b></em>' containment reference list.
	 * The list contents are of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Steps</em>' containment reference list.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_PostSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getPostSteps();

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' map.
	 * @see d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage#getWorkflowJobConfiguration_Arguments()
	 * @model mapType="d.fe.up.pt.cicd.circleci.metamodel.CircleCI.VariableAssignment&lt;org.eclipse.emf.ecore.EString, d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression&gt;"
	 * @generated
	 */
	EMap<String, Expression> getArguments();

} // WorkflowJobConfiguration
