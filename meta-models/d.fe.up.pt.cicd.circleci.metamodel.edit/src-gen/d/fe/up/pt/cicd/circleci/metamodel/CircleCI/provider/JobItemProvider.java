/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Job} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobItemProvider extends ScriptItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobItemProvider(AdapterFactory adapterFactory) {
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
			addParallelismPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Job_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_name_feature", "_UI_Job_type"),
						CircleCIPackage.Literals.JOB__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parallelism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParallelismPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_parallelism_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_parallelism_feature", "_UI_Job_type"),
						CircleCIPackage.Literals.JOB__PARALLELISM, true, false, false, null, null, null));
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
			childrenFeatures.add(CircleCIPackage.Literals.CALLABLE__PARAMETERS);
			childrenFeatures.add(CircleCIPackage.Literals.ENVIRONMENT__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(CircleCIPackage.Literals.JOB__EXECUTOR);
			childrenFeatures.add(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES);
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
	 * This returns Job.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Job"));
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
		String label = ((Job) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Job_type")
				: getString("_UI_Job_type") + " " + label;
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

		switch (notification.getFeatureID(Job.class)) {
		case CircleCIPackage.JOB__NAME:
		case CircleCIPackage.JOB__PARALLELISM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CircleCIPackage.JOB__PARAMETERS:
		case CircleCIPackage.JOB__ENVIRONMENT_VARIABLES:
		case CircleCIPackage.JOB__EXECUTOR:
		case CircleCIPackage.JOB__CIRCLE_CIIP_RANGES:
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.CALLABLE__PARAMETERS,
				CircleCIFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.ENVIRONMENT__ENVIRONMENT_VARIABLES,
				CircleCIFactory.eINSTANCE.create(CircleCIPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__EXECUTOR,
				CircleCIFactory.eINSTANCE.createDockerExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__EXECUTOR,
				CircleCIFactory.eINSTANCE.createMachineExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__EXECUTOR,
				CircleCIFactory.eINSTANCE.createMacOSExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__EXECUTOR,
				CircleCIFactory.eINSTANCE.createWindowsOrbExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__EXECUTOR,
				CircleCIFactory.eINSTANCE.createExecutorReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__EXECUTOR,
				CircleCIFactory.eINSTANCE.createOrbReferenceExecutor()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.JOB__CIRCLE_CIIP_RANGES,
				CircleCIFactory.eINSTANCE.createVariableReference()));
	}

}
