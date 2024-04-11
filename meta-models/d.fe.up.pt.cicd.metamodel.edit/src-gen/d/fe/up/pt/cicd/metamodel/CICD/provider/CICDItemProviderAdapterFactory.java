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
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.ScriptJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptJobItemProvider scriptJobItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ScriptJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptJobAdapter() {
		if (scriptJobItemProvider == null) {
			scriptJobItemProvider = new ScriptJobItemProvider(this);
		}

		return scriptJobItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineCallJobItemProvider pipelineCallJobItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.PipelineCallJob}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipelineCallJobAdapter() {
		if (pipelineCallJobItemProvider == null) {
			pipelineCallJobItemProvider = new PipelineCallJobItemProvider(this);
		}

		return pipelineCallJobItemProvider;
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
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Checkout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckoutItemProvider checkoutItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Checkout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCheckoutAdapter() {
		if (checkoutItemProvider == null) {
			checkoutItemProvider = new CheckoutItemProvider(this);
		}

		return checkoutItemProvider;
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
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Concat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcatItemProvider concatItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Concat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcatAdapter() {
		if (concatItemProvider == null) {
			concatItemProvider = new ConcatItemProvider(this);
		}

		return concatItemProvider;
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
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.IntegerLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralItemProvider integerLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.IntegerLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntegerLiteralAdapter() {
		if (integerLiteralItemProvider == null) {
			integerLiteralItemProvider = new IntegerLiteralItemProvider(this);
		}

		return integerLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.DoubleLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleLiteralItemProvider doubleLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.DoubleLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoubleLiteralAdapter() {
		if (doubleLiteralItemProvider == null) {
			doubleLiteralItemProvider = new DoubleLiteralItemProvider(this);
		}

		return doubleLiteralItemProvider;
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
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.VariableContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableContextItemProvider variableContextItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.VariableContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableContextAdapter() {
		if (variableContextItemProvider == null) {
			variableContextItemProvider = new VariableContextItemProvider(this);
		}

		return variableContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.VariableDereference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDereferenceItemProvider variableDereferenceItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.VariableDereference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDereferenceAdapter() {
		if (variableDereferenceItemProvider == null) {
			variableDereferenceItemProvider = new VariableDereferenceItemProvider(this);
		}

		return variableDereferenceItemProvider;
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
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.EqualityOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualityOpItemProvider equalityOpItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.EqualityOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEqualityOpAdapter() {
		if (equalityOpItemProvider == null) {
			equalityOpItemProvider = new EqualityOpItemProvider(this);
		}

		return equalityOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.ComparisonOp} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComparisonOpItemProvider comparisonOpItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ComparisonOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComparisonOpAdapter() {
		if (comparisonOpItemProvider == null) {
			comparisonOpItemProvider = new ComparisonOpItemProvider(this);
		}

		return comparisonOpItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.And} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndItemProvider andItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.And}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAndAdapter() {
		if (andItemProvider == null) {
			andItemProvider = new AndItemProvider(this);
		}

		return andItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link d.fe.up.pt.cicd.metamodel.CICD.Or} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrItemProvider orItemProvider;

	/**
	 * This creates an adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Or}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrAdapter() {
		if (orItemProvider == null) {
			orItemProvider = new OrItemProvider(this);
		}

		return orItemProvider;
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
		if (scriptJobItemProvider != null)
			scriptJobItemProvider.dispose();
		if (pipelineCallJobItemProvider != null)
			pipelineCallJobItemProvider.dispose();
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
		if (checkoutItemProvider != null)
			checkoutItemProvider.dispose();
		if (assignmentItemProvider != null)
			assignmentItemProvider.dispose();
		if (concatItemProvider != null)
			concatItemProvider.dispose();
		if (stringLiteralItemProvider != null)
			stringLiteralItemProvider.dispose();
		if (integerLiteralItemProvider != null)
			integerLiteralItemProvider.dispose();
		if (doubleLiteralItemProvider != null)
			doubleLiteralItemProvider.dispose();
		if (booleanLiteralItemProvider != null)
			booleanLiteralItemProvider.dispose();
		if (variableItemProvider != null)
			variableItemProvider.dispose();
		if (secretVariableItemProvider != null)
			secretVariableItemProvider.dispose();
		if (variableContextItemProvider != null)
			variableContextItemProvider.dispose();
		if (variableDereferenceItemProvider != null)
			variableDereferenceItemProvider.dispose();
		if (builtInFunctionItemProvider != null)
			builtInFunctionItemProvider.dispose();
		if (equalityOpItemProvider != null)
			equalityOpItemProvider.dispose();
		if (comparisonOpItemProvider != null)
			comparisonOpItemProvider.dispose();
		if (andItemProvider != null)
			andItemProvider.dispose();
		if (orItemProvider != null)
			orItemProvider.dispose();
		if (unaryOpItemProvider != null)
			unaryOpItemProvider.dispose();
		if (negationItemProvider != null)
			negationItemProvider.dispose();
	}

}
