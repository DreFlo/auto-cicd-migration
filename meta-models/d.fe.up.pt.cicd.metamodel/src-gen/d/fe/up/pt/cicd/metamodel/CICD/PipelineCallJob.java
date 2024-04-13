/**
 */
package d.fe.up.pt.cicd.metamodel.CICD;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline Call Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob#getPipelinePath <em>Pipeline Path</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineCallJob()
 * @model
 * @generated
 */
public interface PipelineCallJob extends Job {
	/**
	 * Returns the value of the '<em><b>Pipeline Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline Path</em>' containment reference.
	 * @see #setPipelinePath(Expression)
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineCallJob_PipelinePath()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPipelinePath();

	/**
	 * Sets the value of the '{@link d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob#getPipelinePath <em>Pipeline Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline Path</em>' containment reference.
	 * @see #getPipelinePath()
	 * @generated
	 */
	void setPipelinePath(Expression value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' map.
	 * The key is of type {@link d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration},
	 * and the value is of type {@link d.fe.up.pt.cicd.metamodel.CICD.Expression},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' map.
	 * @see d.fe.up.pt.cicd.metamodel.CICD.CICDPackage#getPipelineCallJob_Args()
	 * @model mapType="d.fe.up.pt.cicd.metamodel.CICD.Assignment&lt;d.fe.up.pt.cicd.metamodel.CICD.VariableDeclaration, d.fe.up.pt.cicd.metamodel.CICD.Expression&gt;"
	 * @generated
	 */
	EMap<VariableDeclaration, Expression> getArgs();

} // PipelineCallJob
