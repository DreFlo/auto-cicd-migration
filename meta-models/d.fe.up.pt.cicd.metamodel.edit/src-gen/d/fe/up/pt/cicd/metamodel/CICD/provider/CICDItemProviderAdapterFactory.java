/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.util.CICDAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CICDItemProviderAdapterFactory extends CICDAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CICDItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineItemProvider pipelineItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Pipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipelineAdapter() {
		if (pipelineItemProvider == null) {
			pipelineItemProvider = new PipelineItemProvider(this);
		}

		return pipelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Job} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobItemProvider jobItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJobAdapter() {
		if (jobItemProvider == null) {
			jobItemProvider = new JobItemProvider(this);
		}

		return jobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Agent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentItemProvider agentItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgentAdapter() {
		if (agentItemProvider == null) {
			agentItemProvider = new AgentItemProvider(this);
		}

		return agentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerContainerItemProvider dockerContainerItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.DockerContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDockerContainerAdapter() {
		if (dockerContainerItemProvider == null) {
			dockerContainerItemProvider = new DockerContainerItemProvider(this);
		}

		return dockerContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.PushTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushTriggerItemProvider pushTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.PushTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPushTriggerAdapter() {
		if (pushTriggerItemProvider == null) {
			pushTriggerItemProvider = new PushTriggerItemProvider(this);
		}

		return pushTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullRequestTriggerItemProvider pullRequestTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.PullRequestTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPullRequestTriggerAdapter() {
		if (pullRequestTriggerItemProvider == null) {
			pullRequestTriggerItemProvider = new PullRequestTriggerItemProvider(this);
		}

		return pullRequestTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualTriggerItemProvider manualTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ManualTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createManualTriggerAdapter() {
		if (manualTriggerItemProvider == null) {
			manualTriggerItemProvider = new ManualTriggerItemProvider(this);
		}

		return manualTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduledTriggerItemProvider scheduledTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ScheduledTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduledTriggerAdapter() {
		if (scheduledTriggerItemProvider == null) {
			scheduledTriggerItemProvider = new ScheduledTriggerItemProvider(this);
		}

		return scheduledTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebhookTriggerItemProvider webhookTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.WebhookTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebhookTriggerAdapter() {
		if (webhookTriggerItemProvider == null) {
			webhookTriggerItemProvider = new WebhookTriggerItemProvider(this);
		}

		return webhookTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyGroupItemProvider concurrencyGroupItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ConcurrencyGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcurrencyGroupAdapter() {
		if (concurrencyGroupItemProvider == null) {
			concurrencyGroupItemProvider = new ConcurrencyGroupItemProvider(this);
		}

		return concurrencyGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionItemProvider permissionItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPermissionAdapter() {
		if (permissionItemProvider == null) {
			permissionItemProvider = new PermissionItemProvider(this);
		}

		return permissionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Matrix} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixItemProvider matrixItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Matrix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrixAdapter() {
		if (matrixItemProvider == null) {
			matrixItemProvider = new MatrixItemProvider(this);
		}

		return matrixItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixAxisItemProvider matrixAxisItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixAxis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrixAxisAdapter() {
		if (matrixAxisItemProvider == null) {
			matrixAxisItemProvider = new MatrixAxisItemProvider(this);
		}

		return matrixAxisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixCombinationItemProvider matrixCombinationItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.MatrixCombination}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrixCombinationAdapter() {
		if (matrixCombinationItemProvider == null) {
			matrixCombinationItemProvider = new MatrixCombinationItemProvider(this);
		}

		return matrixCombinationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Input} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputItemProvider inputItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputAdapter() {
		if (inputItemProvider == null) {
			inputItemProvider = new InputItemProvider(this);
		}

		return inputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalStepItemProvider conditionalStepItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalStepAdapter() {
		if (conditionalStepItemProvider == null) {
			conditionalStepItemProvider = new ConditionalStepItemProvider(this);
		}

		return conditionalStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Plugin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginItemProvider pluginItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Plugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPluginAdapter() {
		if (pluginItemProvider == null) {
			pluginItemProvider = new PluginItemProvider(this);
		}

		return pluginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Cache} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheItemProvider cacheItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCacheAdapter() {
		if (cacheItemProvider == null) {
			cacheItemProvider = new CacheItemProvider(this);
		}

		return cacheItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactItemProvider artifactItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this);
		}

		return artifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentItemProvider assignmentItemProvider;

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssignmentAdapter() {
		if (assignmentItemProvider == null) {
			assignmentItemProvider = new AssignmentItemProvider(this);
		}

		return assignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Value} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueItemProvider valueItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Value}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueAdapter() {
		if (valueItemProvider == null) {
			valueItemProvider = new ValueItemProvider(this);
		}

		return valueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Literal} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralItemProvider literalItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Literal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiteralAdapter() {
		if (literalItemProvider == null) {
			literalItemProvider = new LiteralItemProvider(this);
		}

		return literalItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.StringLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringLiteralItemProvider stringLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.StringLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringLiteralAdapter() {
		if (stringLiteralItemProvider == null) {
			stringLiteralItemProvider = new StringLiteralItemProvider(this);
		}

		return stringLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.NumberLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumberLiteralItemProvider numberLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.NumberLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNumberLiteralAdapter() {
		if (numberLiteralItemProvider == null) {
			numberLiteralItemProvider = new NumberLiteralItemProvider(this);
		}

		return numberLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanLiteralItemProvider booleanLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.BooleanLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBooleanLiteralAdapter() {
		if (booleanLiteralItemProvider == null) {
			booleanLiteralItemProvider = new BooleanLiteralItemProvider(this);
		}

		return booleanLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentVariableItemProvider environmentVariableItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.EnvironmentVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnvironmentVariableAdapter() {
		if (environmentVariableItemProvider == null) {
			environmentVariableItemProvider = new EnvironmentVariableItemProvider(this);
		}

		return environmentVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.SecretVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretVariableItemProvider secretVariableItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.SecretVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecretVariableAdapter() {
		if (secretVariableItemProvider == null) {
			secretVariableItemProvider = new SecretVariableItemProvider(this);
		}

		return secretVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuiltInFunctionItemProvider builtInFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.BuiltInFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBuiltInFunctionAdapter() {
		if (builtInFunctionItemProvider == null) {
			builtInFunctionItemProvider = new BuiltInFunctionItemProvider(this);
		}

		return builtInFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOpItemProvider binaryOpItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.BinaryOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryOpAdapter() {
		if (binaryOpItemProvider == null) {
			binaryOpItemProvider = new BinaryOpItemProvider(this);
		}

		return binaryOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Conjuntion} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjuntionItemProvider conjuntionItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Conjuntion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConjuntionAdapter() {
		if (conjuntionItemProvider == null) {
			conjuntionItemProvider = new ConjuntionItemProvider(this);
		}

		return conjuntionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Disjunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjunctionItemProvider disjunctionItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Disjunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisjunctionAdapter() {
		if (disjunctionItemProvider == null) {
			disjunctionItemProvider = new DisjunctionItemProvider(this);
		}

		return disjunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Addition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionItemProvider additionItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Addition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditionAdapter() {
		if (additionItemProvider == null) {
			additionItemProvider = new AdditionItemProvider(this);
		}

		return additionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Subtraction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtractionItemProvider subtractionItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Subtraction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubtractionAdapter() {
		if (subtractionItemProvider == null) {
			subtractionItemProvider = new SubtractionItemProvider(this);
		}

		return subtractionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.UnaryOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryOpItemProvider unaryOpItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.UnaryOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryOpAdapter() {
		if (unaryOpItemProvider == null) {
			unaryOpItemProvider = new UnaryOpItemProvider(this);
		}

		return unaryOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Negation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NegationItemProvider negationItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Negation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNegationAdapter() {
		if (negationItemProvider == null) {
			negationItemProvider = new NegationItemProvider(this);
		}

		return negationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (pipelineItemProvider != null)
			pipelineItemProvider.dispose();
		if (jobItemProvider != null)
			jobItemProvider.dispose();
		if (agentItemProvider != null)
			agentItemProvider.dispose();
		if (dockerContainerItemProvider != null)
			dockerContainerItemProvider.dispose();
		if (pushTriggerItemProvider != null)
			pushTriggerItemProvider.dispose();
		if (pullRequestTriggerItemProvider != null)
			pullRequestTriggerItemProvider.dispose();
		if (manualTriggerItemProvider != null)
			manualTriggerItemProvider.dispose();
		if (scheduledTriggerItemProvider != null)
			scheduledTriggerItemProvider.dispose();
		if (webhookTriggerItemProvider != null)
			webhookTriggerItemProvider.dispose();
		if (concurrencyGroupItemProvider != null)
			concurrencyGroupItemProvider.dispose();
		if (permissionItemProvider != null)
			permissionItemProvider.dispose();
		if (matrixItemProvider != null)
			matrixItemProvider.dispose();
		if (matrixAxisItemProvider != null)
			matrixAxisItemProvider.dispose();
		if (matrixCombinationItemProvider != null)
			matrixCombinationItemProvider.dispose();
		if (inputItemProvider != null)
			inputItemProvider.dispose();
		if (outputItemProvider != null)
			outputItemProvider.dispose();
		if (conditionalStepItemProvider != null)
			conditionalStepItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (pluginItemProvider != null)
			pluginItemProvider.dispose();
		if (cacheItemProvider != null)
			cacheItemProvider.dispose();
		if (artifactItemProvider != null)
			artifactItemProvider.dispose();
		if (assignmentItemProvider != null)
			assignmentItemProvider.dispose();
		if (valueItemProvider != null)
			valueItemProvider.dispose();
		if (literalItemProvider != null)
			literalItemProvider.dispose();
		if (stringLiteralItemProvider != null)
			stringLiteralItemProvider.dispose();
		if (numberLiteralItemProvider != null)
			numberLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null)
			booleanLiteralItemProvider.dispose();
		if (variableItemProvider != null)
			variableItemProvider.dispose();
		if (environmentVariableItemProvider != null)
			environmentVariableItemProvider.dispose();
		if (secretVariableItemProvider != null)
			secretVariableItemProvider.dispose();
		if (builtInFunctionItemProvider != null)
			builtInFunctionItemProvider.dispose();
		if (binaryOpItemProvider != null)
			binaryOpItemProvider.dispose();
		if (conjuntionItemProvider != null)
			conjuntionItemProvider.dispose();
		if (disjunctionItemProvider != null)
			disjunctionItemProvider.dispose();
		if (additionItemProvider != null)
			additionItemProvider.dispose();
		if (subtractionItemProvider != null)
			subtractionItemProvider.dispose();
		if (unaryOpItemProvider != null)
			unaryOpItemProvider.dispose();
		if (negationItemProvider != null)
			negationItemProvider.dispose();
	}

}
