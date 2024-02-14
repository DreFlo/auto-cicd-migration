/**
 */
package GHA.Triggers.provider;

import GHA.Triggers.util.TriggersAdapterFactory;

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
public class TriggersItemProviderAdapterFactory extends TriggersAdapterFactory
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
	public TriggersItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.StandardEventTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardEventTriggerItemProvider standardEventTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.StandardEventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStandardEventTriggerAdapter() {
		if (standardEventTriggerItemProvider == null) {
			standardEventTriggerItemProvider = new StandardEventTriggerItemProvider(this);
		}

		return standardEventTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.WorkflowRunTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowRunTriggerItemProvider workflowRunTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.WorkflowRunTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowRunTriggerAdapter() {
		if (workflowRunTriggerItemProvider == null) {
			workflowRunTriggerItemProvider = new WorkflowRunTriggerItemProvider(this);
		}

		return workflowRunTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.PullRequestTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PullRequestTriggerItemProvider pullRequestTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.PullRequestTrigger}.
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
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.PushTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushTriggerItemProvider pushTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.PushTrigger}.
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
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.ScheduleTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleTriggerItemProvider scheduleTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.ScheduleTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScheduleTriggerAdapter() {
		if (scheduleTriggerItemProvider == null) {
			scheduleTriggerItemProvider = new ScheduleTriggerItemProvider(this);
		}

		return scheduleTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.WorkflowCallTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCallTriggerItemProvider workflowCallTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.WorkflowCallTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowCallTriggerAdapter() {
		if (workflowCallTriggerItemProvider == null) {
			workflowCallTriggerItemProvider = new WorkflowCallTriggerItemProvider(this);
		}

		return workflowCallTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link GHA.Triggers.WorkflowDispatchTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowDispatchTriggerItemProvider workflowDispatchTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link GHA.Triggers.WorkflowDispatchTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkflowDispatchTriggerAdapter() {
		if (workflowDispatchTriggerItemProvider == null) {
			workflowDispatchTriggerItemProvider = new WorkflowDispatchTriggerItemProvider(this);
		}

		return workflowDispatchTriggerItemProvider;
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
		if (standardEventTriggerItemProvider != null)
			standardEventTriggerItemProvider.dispose();
		if (workflowRunTriggerItemProvider != null)
			workflowRunTriggerItemProvider.dispose();
		if (pullRequestTriggerItemProvider != null)
			pullRequestTriggerItemProvider.dispose();
		if (pushTriggerItemProvider != null)
			pushTriggerItemProvider.dispose();
		if (scheduleTriggerItemProvider != null)
			scheduleTriggerItemProvider.dispose();
		if (workflowCallTriggerItemProvider != null)
			workflowCallTriggerItemProvider.dispose();
		if (workflowDispatchTriggerItemProvider != null)
			workflowDispatchTriggerItemProvider.dispose();
	}

}
