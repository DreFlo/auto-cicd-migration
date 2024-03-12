/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.Job;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.Job} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobItemProvider extends PipelineBlockItemProvider {
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

			addIdPropertyDescriptor(object);
			addServicesPropertyDescriptor(object);
			addMaxAttemptsPropertyDescriptor(object);
			addAllowFailurePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_id_feature", "_UI_Job_type"),
						CICDPackage.Literals.JOB__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_services_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_services_feature", "_UI_Job_type"),
						CICDPackage.Literals.JOB__SERVICES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Attempts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxAttemptsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_maxAttempts_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_maxAttempts_feature", "_UI_Job_type"),
						CICDPackage.Literals.JOB__MAX_ATTEMPTS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_allowFailure_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_allowFailure_feature", "_UI_Job_type"),
						CICDPackage.Literals.JOB__ALLOW_FAILURE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(CICDPackage.Literals.JOB__IF_CONDITION);
			childrenFeatures.add(CICDPackage.Literals.JOB__STEPS);
			childrenFeatures.add(CICDPackage.Literals.JOB__MATRIX);
			childrenFeatures.add(CICDPackage.Literals.JOB__NEXT);
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
		case CICDPackage.JOB__ID:
		case CICDPackage.JOB__MAX_ATTEMPTS:
		case CICDPackage.JOB__ALLOW_FAILURE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CICDPackage.JOB__IF_CONDITION:
		case CICDPackage.JOB__STEPS:
		case CICDPackage.JOB__MATRIX:
		case CICDPackage.JOB__NEXT:
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

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createValue()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createVariableContext()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createVariableDereference()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION,
				CICDFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__IF_CONDITION, CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.JOB__STEPS, CICDFactory.eINSTANCE.createConditionalStep()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__STEPS, CICDFactory.eINSTANCE.createCommand()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__STEPS, CICDFactory.eINSTANCE.createPlugin()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__STEPS, CICDFactory.eINSTANCE.createCache()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__STEPS, CICDFactory.eINSTANCE.createArtifact()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__MATRIX, CICDFactory.eINSTANCE.createMatrix()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.JOB__NEXT, CICDFactory.eINSTANCE.createJob()));
	}

}
