/**
 */
package GHA.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.ExpressionsFactory;
import GHA.Expressions.ExpressionsPackage;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import GHA.GHAPackage;

import GHA.Jobs.JobsFactory;

import GHA.Options.OptionsFactory;
import GHA.Options.OptionsPackage;

import GHA.Triggers.TriggersFactory;

import GHA.Workflow;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.Workflow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Workflow_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Workflow_name_feature",
								"_UI_Workflow_type"),
						GHAPackage.Literals.WORKFLOW__NAME, true, false, false, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__RUN_NAME);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__TRIGGERS);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__PERMISSIONS);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__DEFAULTS);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__CONCURRENCY_GROUP);
			childrenFeatures.add(GHAPackage.Literals.WORKFLOW__JOBS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Workflow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Workflow"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Workflow_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Workflow.class)) {
		case GHAPackage.WORKFLOW__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHAPackage.WORKFLOW__RUN_NAME:
		case GHAPackage.WORKFLOW__TRIGGERS:
		case GHAPackage.WORKFLOW__PERMISSIONS:
		case GHAPackage.WORKFLOW__DEFAULTS:
		case GHAPackage.WORKFLOW__ENVIRONMENT_VARIABLES:
		case GHAPackage.WORKFLOW__CONCURRENCY_GROUP:
		case GHAPackage.WORKFLOW__JOBS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__RUN_NAME,
				VariablesFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createStandardEventTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createWorkflowRunTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createPullRequestTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createPushTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createScheduleTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createWorkflowCallTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__TRIGGERS,
				TriggersFactory.eINSTANCE.createWorkflowDispatchTrigger()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__PERMISSIONS,
				OptionsFactory.eINSTANCE.create(OptionsPackage.Literals.PERMISSION)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__DEFAULTS,
				OptionsFactory.eINSTANCE.createDefaults()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__ENVIRONMENT_VARIABLES,
				ExpressionsFactory.eINSTANCE.create(ExpressionsPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__CONCURRENCY_GROUP,
				OptionsFactory.eINSTANCE.createConcurrencyGroup()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.WORKFLOW__JOBS,
				JobsFactory.eINSTANCE.createReuseWorkflowJob()));

		newChildDescriptors
				.add(createChildParameter(GHAPackage.Literals.WORKFLOW__JOBS, JobsFactory.eINSTANCE.createScriptJob()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GHAEditPlugin.INSTANCE;
	}

}
