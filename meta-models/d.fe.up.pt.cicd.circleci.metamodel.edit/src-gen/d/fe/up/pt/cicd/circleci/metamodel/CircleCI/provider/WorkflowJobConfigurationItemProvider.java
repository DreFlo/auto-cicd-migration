/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowJobConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowJobConfigurationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowJobConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addRequiresPropertyDescriptor(object);
			addRequiredByPropertyDescriptor(object);
			addIgnoreSpecifiedBranchesPropertyDescriptor(object);
			addIgnoreSpecifiedTagsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Requires feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkflowJobConfiguration_requires_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkflowJobConfiguration_requires_feature",
						"_UI_WorkflowJobConfiguration_type"),
				CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__REQUIRES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Required By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkflowJobConfiguration_requiredBy_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkflowJobConfiguration_requiredBy_feature",
						"_UI_WorkflowJobConfiguration_type"),
				CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__REQUIRED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Specified Branches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreSpecifiedBranchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_WorkflowJobConfiguration_ignoreSpecifiedBranches_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_WorkflowJobConfiguration_ignoreSpecifiedBranches_feature",
								"_UI_WorkflowJobConfiguration_type"),
						CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ignore Specified Tags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIgnoreSpecifiedTagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_WorkflowJobConfiguration_ignoreSpecifiedTags_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_WorkflowJobConfiguration_ignoreSpecifiedTags_feature",
								"_UI_WorkflowJobConfiguration_type"),
						CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__NAME);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__MATRIX);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS);
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS);
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
		String label = ((WorkflowJobConfiguration) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_WorkflowJobConfiguration_type")
				: getString("_UI_WorkflowJobConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(WorkflowJobConfiguration.class)) {
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_BRANCHES:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__IGNORE_SPECIFIED_TAGS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__CONTEXTS:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__BRANCHES:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__TAGS:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__MATRIX:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__POST_STEPS:
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		case CircleCIPackage.WORKFLOW_JOB_CONFIGURATION__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__NAME, ""));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__MATRIX,
				CircleCIFactory.eINSTANCE.createMatrix()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createRunStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createWhenStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createUnlessStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createCheckoutStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createSetupRemoteDockerStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createSaveCacheStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createRestoreCacheStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createStoreArtifactsStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createStoreTestResultsStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createPersistToWorkspaceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createAttachWorkspaceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createAddSSHKeysStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createOrbReferenceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS,
				CircleCIFactory.eINSTANCE.createCommandReferenceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createRunStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createWhenStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createUnlessStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createCheckoutStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createSetupRemoteDockerStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createSaveCacheStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createRestoreCacheStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createStoreArtifactsStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createStoreTestResultsStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createPersistToWorkspaceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createAttachWorkspaceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createAddSSHKeysStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createOrbReferenceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS,
				CircleCIFactory.eINSTANCE.createCommandReferenceStep()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__ARGUMENTS,
				CircleCIFactory.eINSTANCE.create(CircleCIPackage.Literals.VARIABLE_ASSIGNMENT)));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__CONTEXTS
				|| childFeature == CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__BRANCHES
				|| childFeature == CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__TAGS
				|| childFeature == CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__PRE_STEPS
				|| childFeature == CircleCIPackage.Literals.WORKFLOW_JOB_CONFIGURATION__POST_STEPS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CircleCIEditPlugin.INSTANCE;
	}

}
