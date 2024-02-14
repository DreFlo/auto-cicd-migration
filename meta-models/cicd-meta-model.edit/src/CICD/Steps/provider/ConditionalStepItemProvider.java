/**
 */
package CICD.Steps.provider;


import CICD.Expressions.BinaryOperations.BinaryOperationsFactory;

import CICD.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import CICD.Expressions.UnaryOperations.UnaryOperationsFactory;

import CICD.Expressions.Values.Literals.LiteralsFactory;

import CICD.Expressions.Values.ValuesFactory;

import CICD.Expressions.Values.Variables.VariablesFactory;

import CICD.Steps.ConditionalStep;
import CICD.Steps.StepsFactory;
import CICD.Steps.StepsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CICD.Steps.ConditionalStep} object.
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
			childrenFeatures.add(StepsPackage.Literals.CONDITIONAL_STEP__IF);
			childrenFeatures.add(StepsPackage.Literals.CONDITIONAL_STEP__THEN);
			childrenFeatures.add(StepsPackage.Literals.CONDITIONAL_STEP__ELSE);
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
			case StepsPackage.CONDITIONAL_STEP__IF:
			case StepsPackage.CONDITIONAL_STEP__THEN:
			case StepsPackage.CONDITIONAL_STEP__ELSE:
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

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 ValuesFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 LiteralsFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 VariablesFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 VariablesFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 BuiltInFunctionsFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 BinaryOperationsFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 BinaryOperationsFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 BinaryOperationsFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 BinaryOperationsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 BinaryOperationsFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 UnaryOperationsFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__IF,
				 UnaryOperationsFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__THEN,
				 StepsFactory.eINSTANCE.createConditionalStep()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__THEN,
				 StepsFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__THEN,
				 StepsFactory.eINSTANCE.createPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__THEN,
				 StepsFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__THEN,
				 StepsFactory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__ELSE,
				 StepsFactory.eINSTANCE.createConditionalStep()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__ELSE,
				 StepsFactory.eINSTANCE.createCommand()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__ELSE,
				 StepsFactory.eINSTANCE.createPlugin()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__ELSE,
				 StepsFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CONDITIONAL_STEP__ELSE,
				 StepsFactory.eINSTANCE.createArtifact()));
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

		boolean qualify =
			childFeature == StepsPackage.Literals.CONDITIONAL_STEP__THEN ||
			childFeature == StepsPackage.Literals.CONDITIONAL_STEP__ELSE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}