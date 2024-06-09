/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep;

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
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.NonConditionalStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NonConditionalStepItemProvider extends StepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConditionalStepItemProvider(AdapterFactory adapterFactory) {
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
			addNamePropertyDescriptor(object);
			addAllowFailurePropertyDescriptor(object);
			addTimeoutMinutesPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_NonConditionalStep_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NonConditionalStep_id_feature",
								"_UI_NonConditionalStep_type"),
						CICDPackage.Literals.NON_CONDITIONAL_STEP__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_NonConditionalStep_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NonConditionalStep_name_feature",
								"_UI_NonConditionalStep_type"),
						CICDPackage.Literals.NON_CONDITIONAL_STEP__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Timeout Minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutMinutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NonConditionalStep_timeoutMinutes_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NonConditionalStep_timeoutMinutes_feature",
						"_UI_NonConditionalStep_type"),
				CICDPackage.Literals.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Allow Failure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NonConditionalStep_allowFailure_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NonConditionalStep_allowFailure_feature",
						"_UI_NonConditionalStep_type"),
				CICDPackage.Literals.NON_CONDITIONAL_STEP__ALLOW_FAILURE, true, false, false,
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
			childrenFeatures.add(CICDPackage.Literals.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY);
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
		String label = ((NonConditionalStep) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NonConditionalStep_type")
				: getString("_UI_NonConditionalStep_type") + " " + label;
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

		switch (notification.getFeatureID(NonConditionalStep.class)) {
		case CICDPackage.NON_CONDITIONAL_STEP__ID:
		case CICDPackage.NON_CONDITIONAL_STEP__NAME:
		case CICDPackage.NON_CONDITIONAL_STEP__ALLOW_FAILURE:
		case CICDPackage.NON_CONDITIONAL_STEP__TIMEOUT_MINUTES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CICDPackage.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES:
		case CICDPackage.NON_CONDITIONAL_STEP__WORKING_DIRECTORY:
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

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.create(CICDPackage.Literals.ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createDotOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY,
				CICDFactory.eINSTANCE.createNegation()));
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

		boolean qualify = childFeature == CICDPackage.Literals.NON_CONDITIONAL_STEP__ENVIRONMENT_VARIABLES
				|| childFeature == CICDPackage.Literals.NON_CONDITIONAL_STEP__WORKING_DIRECTORY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
