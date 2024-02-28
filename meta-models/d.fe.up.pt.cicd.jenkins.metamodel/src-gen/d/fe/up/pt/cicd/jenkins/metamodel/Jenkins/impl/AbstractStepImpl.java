/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.AbstractStep;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractStepImpl extends AbstractPipelineExecutionBlockImpl implements AbstractStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.ABSTRACT_STEP;
	}

} //AbstractStepImpl
