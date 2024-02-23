/**
 */
package d.fe.up.pt.cicd.metamodel.CICD.provider;

import d.fe.up.pt.cicd.metamodel.CICD.CICDFactory;
import d.fe.up.pt.cicd.metamodel.CICD.CICDPackage;
import d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.metamodel.CICD.ConditionalStep} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalStepItemProvider extends StepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStepItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CICDPackage.Literals.CONDITIONAL_STEP__IF);
			childrenFeatures.add(CICDPackage.Literals.CONDITIONAL_STEP__THEN);
			childrenFeatures.add(CICDPackage.Literals.CONDITIONAL_STEP__ELSE);
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
	 * This returns ConditionalStep.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConditionalStep"));
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
		return getString("_UI_ConditionalStep_type");
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

		switch (notification.getFeatureID(ConditionalStep.class)) {
		case CICDPackage.CONDITIONAL_STEP__IF:
		case CICDPackage.CONDITIONAL_STEP__THEN:
		case CICDPackage.CONDITIONAL_STEP__ELSE:
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
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF, CICDFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF, CICDFactory.eINSTANCE.createValue()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF, CICDFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createEqualityOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createComparisonOp()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF, CICDFactory.eINSTANCE.createAnd()));

		newChildDescriptors
				.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF, CICDFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF, CICDFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__IF,
				CICDFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__THEN,
				CICDFactory.eINSTANCE.createConditionalStep()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__THEN,
				CICDFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__THEN,
				CICDFactory.eINSTANCE.createPlugin()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__THEN, CICDFactory.eINSTANCE.createCache()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__THEN,
				CICDFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__ELSE,
				CICDFactory.eINSTANCE.createConditionalStep()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__ELSE,
				CICDFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__ELSE,
				CICDFactory.eINSTANCE.createPlugin()));

		newChildDescriptors.add(
				createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__ELSE, CICDFactory.eINSTANCE.createCache()));

		newChildDescriptors.add(createChildParameter(CICDPackage.Literals.CONDITIONAL_STEP__ELSE,
				CICDFactory.eINSTANCE.createArtifact()));
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

		boolean qualify = childFeature == CICDPackage.Literals.CONDITIONAL_STEP__THEN
				|| childFeature == CICDPackage.Literals.CONDITIONAL_STEP__ELSE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}