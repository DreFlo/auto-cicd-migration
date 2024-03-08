/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage
 * @generated
 */
public interface JenkinsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JenkinsFactory eINSTANCE = d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.JenkinsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipeline</em>'.
	 * @generated
	 */
	Pipeline createPipeline();

	/**
	 * Returns a new object of class '<em>Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Stage</em>'.
	 * @generated
	 */
	NestedStage createNestedStage();

	/**
	 * Returns a new object of class '<em>Parallel Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Nested Stage</em>'.
	 * @generated
	 */
	ParallelNestedStage createParallelNestedStage();

	/**
	 * Returns a new object of class '<em>Sequential Nested Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Nested Stage</em>'.
	 * @generated
	 */
	SequentialNestedStage createSequentialNestedStage();

	/**
	 * Returns a new object of class '<em>Step Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Stage</em>'.
	 * @generated
	 */
	StepStage createStepStage();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Conditional Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Step</em>'.
	 * @generated
	 */
	ConditionalStep createConditionalStep();

	/**
	 * Returns a new object of class '<em>None Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>None Agent</em>'.
	 * @generated
	 */
	NoneAgent createNoneAgent();

	/**
	 * Returns a new object of class '<em>Any Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Agent</em>'.
	 * @generated
	 */
	AnyAgent createAnyAgent();

	/**
	 * Returns a new object of class '<em>Optioned Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optioned Agent</em>'.
	 * @generated
	 */
	OptionedAgent createOptionedAgent();

	/**
	 * Returns a new object of class '<em>Docker Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Container</em>'.
	 * @generated
	 */
	DockerContainer createDockerContainer();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Literal</em>'.
	 * @generated
	 */
	DoubleLiteral createDoubleLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concat</em>'.
	 * @generated
	 */
	Concat createConcat();

	/**
	 * Returns a new object of class '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negation</em>'.
	 * @generated
	 */
	Negation createNegation();

	/**
	 * Returns a new object of class '<em>Equality Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Equality Op</em>'.
	 * @generated
	 */
	EqualityOp createEqualityOp();

	/**
	 * Returns a new object of class '<em>Comparison Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Op</em>'.
	 * @generated
	 */
	ComparisonOp createComparisonOp();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Scheduled Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduled Trigger</em>'.
	 * @generated
	 */
	ScheduledTrigger createScheduledTrigger();

	/**
	 * Returns a new object of class '<em>Polling Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polling Trigger</em>'.
	 * @generated
	 */
	PollingTrigger createPollingTrigger();

	/**
	 * Returns a new object of class '<em>Upstream Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upstream Trigger</em>'.
	 * @generated
	 */
	UpstreamTrigger createUpstreamTrigger();

	/**
	 * Returns a new object of class '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool</em>'.
	 * @generated
	 */
	Tool createTool();

	/**
	 * Returns a new object of class '<em>When Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Branch</em>'.
	 * @generated
	 */
	WhenBranch createWhenBranch();

	/**
	 * Returns a new object of class '<em>When Changeset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Changeset</em>'.
	 * @generated
	 */
	WhenChangeset createWhenChangeset();

	/**
	 * Returns a new object of class '<em>When Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Tag</em>'.
	 * @generated
	 */
	WhenTag createWhenTag();

	/**
	 * Returns a new object of class '<em>When Change Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Change Request</em>'.
	 * @generated
	 */
	WhenChangeRequest createWhenChangeRequest();

	/**
	 * Returns a new object of class '<em>When Building Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Building Tag</em>'.
	 * @generated
	 */
	WhenBuildingTag createWhenBuildingTag();

	/**
	 * Returns a new object of class '<em>When Changelog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Changelog</em>'.
	 * @generated
	 */
	WhenChangelog createWhenChangelog();

	/**
	 * Returns a new object of class '<em>When Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Equals</em>'.
	 * @generated
	 */
	WhenEquals createWhenEquals();

	/**
	 * Returns a new object of class '<em>When Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Environment</em>'.
	 * @generated
	 */
	WhenEnvironment createWhenEnvironment();

	/**
	 * Returns a new object of class '<em>When Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Expression</em>'.
	 * @generated
	 */
	WhenExpression createWhenExpression();

	/**
	 * Returns a new object of class '<em>Single Nested When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Nested When</em>'.
	 * @generated
	 */
	SingleNestedWhen createSingleNestedWhen();

	/**
	 * Returns a new object of class '<em>Multiple Nested When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Nested When</em>'.
	 * @generated
	 */
	MultipleNestedWhen createMultipleNestedWhen();

	/**
	 * Returns a new object of class '<em>When Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Not</em>'.
	 * @generated
	 */
	WhenNot createWhenNot();

	/**
	 * Returns a new object of class '<em>When Any Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Any Of</em>'.
	 * @generated
	 */
	WhenAnyOf createWhenAnyOf();

	/**
	 * Returns a new object of class '<em>When All Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When All Of</em>'.
	 * @generated
	 */
	WhenAllOf createWhenAllOf();

	/**
	 * Returns a new object of class '<em>When Triggered By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Triggered By</em>'.
	 * @generated
	 */
	WhenTriggeredBy createWhenTriggeredBy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JenkinsPackage getJenkinsPackage();

} //JenkinsFactory
