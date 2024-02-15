/**
 */
package GHA.provider;

import GHA.GHAFactory;
import GHA.GHAPackage;
import GHA.ReuseWorkflowJob;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GHA.ReuseWorkflowJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReuseWorkflowJobItemProvider extends JobItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReuseWorkflowJobItemProvider(AdapterFactory adapterFactory) {
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

			addInheritSecretsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Inherit Secrets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritSecretsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ReuseWorkflowJob_inheritSecrets_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ReuseWorkflowJob_inheritSecrets_feature",
								"_UI_ReuseWorkflowJob_type"),
						GHAPackage.Literals.REUSE_WORKFLOW_JOB__INHERIT_SECRETS, true, false, false,
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
			childrenFeatures.add(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH);
			childrenFeatures.add(GHAPackage.Literals.REUSE_WORKFLOW_JOB__ARGS);
			childrenFeatures.add(GHAPackage.Literals.REUSE_WORKFLOW_JOB__SECRETS);
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
	 * This returns ReuseWorkflowJob.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReuseWorkflowJob"));
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
		String label = ((ReuseWorkflowJob) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ReuseWorkflowJob_type")
				: getString("_UI_ReuseWorkflowJob_type") + " " + label;
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

		switch (notification.getFeatureID(ReuseWorkflowJob.class)) {
		case GHAPackage.REUSE_WORKFLOW_JOB__INHERIT_SECRETS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GHAPackage.REUSE_WORKFLOW_JOB__WORKFLOW_PATH:
		case GHAPackage.REUSE_WORKFLOW_JOB__ARGS:
		case GHAPackage.REUSE_WORKFLOW_JOB__SECRETS:
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

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH,
				GHAFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__ARGS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(GHAPackage.Literals.REUSE_WORKFLOW_JOB__SECRETS,
				GHAFactory.eINSTANCE.create(GHAPackage.Literals.VARIABLE_ASSIGNMENT)));
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

		boolean qualify = childFeature == GHAPackage.Literals.JOB__JOB_NAME
				|| childFeature == GHAPackage.Literals.JOB__IF
				|| childFeature == GHAPackage.Literals.JOB__TIMEOUT_MINUTES
				|| childFeature == GHAPackage.Literals.JOB__CONTINUE_ON_ERROR
				|| childFeature == GHAPackage.Literals.REUSE_WORKFLOW_JOB__WORKFLOW_PATH
				|| childFeature == GHAPackage.Literals.JOB__ENVIRONMENT_VARIABLES
				|| childFeature == GHAPackage.Literals.REUSE_WORKFLOW_JOB__ARGS
				|| childFeature == GHAPackage.Literals.REUSE_WORKFLOW_JOB__SECRETS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
