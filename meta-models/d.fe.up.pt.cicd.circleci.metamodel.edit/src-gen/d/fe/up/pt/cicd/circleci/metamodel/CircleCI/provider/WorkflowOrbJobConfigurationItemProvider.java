/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.WorkflowOrbJobConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowOrbJobConfigurationItemProvider extends WorkflowJobConfigurationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowOrbJobConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addOrbPropertyDescriptor(object);
			addJobNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Orb feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrbPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkflowOrbJobConfiguration_orb_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkflowOrbJobConfiguration_orb_feature",
						"_UI_WorkflowOrbJobConfiguration_type"),
				CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__ORB, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Job Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_WorkflowOrbJobConfiguration_jobName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_WorkflowOrbJobConfiguration_jobName_feature",
						"_UI_WorkflowOrbJobConfiguration_type"),
				CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME, true, false, false,
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
			childrenFeatures.add(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR);
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
	 * This returns WorkflowOrbJobConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkflowOrbJobConfiguration"));
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
		String label = ((WorkflowOrbJobConfiguration) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_WorkflowOrbJobConfiguration_type")
				: getString("_UI_WorkflowOrbJobConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(WorkflowOrbJobConfiguration.class)) {
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__JOB_NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		case CircleCIPackage.WORKFLOW_ORB_JOB_CONFIGURATION__NAME:
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR,
				CircleCIFactory.eINSTANCE.createDockerExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR,
				CircleCIFactory.eINSTANCE.createMachineExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR,
				CircleCIFactory.eINSTANCE.createMacOSExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR,
				CircleCIFactory.eINSTANCE.createWindowsOrbExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR,
				CircleCIFactory.eINSTANCE.createExecutorReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.WORKFLOW_ORB_JOB_CONFIGURATION__EXECUTOR,
				CircleCIFactory.eINSTANCE.createOrbReferenceExecutor()));
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

}
