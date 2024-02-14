/**
 */
package CICD.Steps.provider;


import CICD.Expressions.BinaryOperations.BinaryOperationsFactory;

import CICD.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import CICD.Expressions.UnaryOperations.UnaryOperationsFactory;

import CICD.Expressions.Values.Literals.LiteralsFactory;

import CICD.Expressions.Values.ValuesFactory;

import CICD.Expressions.Values.Variables.VariablesFactory;

import CICD.Steps.Cache;
import CICD.Steps.StepsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link CICD.Steps.Cache} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheItemProvider extends NonConditionalStepItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(StepsPackage.Literals.CACHE__CACHE_NAME);
			childrenFeatures.add(StepsPackage.Literals.CACHE__KEYS);
			childrenFeatures.add(StepsPackage.Literals.CACHE__PATHS);
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
	 * This returns Cache.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cache"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Cache)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Cache_type") :
			getString("_UI_Cache_type") + " " + label;
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

		switch (notification.getFeatureID(Cache.class)) {
			case StepsPackage.CACHE__CACHE_NAME:
			case StepsPackage.CACHE__KEYS:
			case StepsPackage.CACHE__PATHS:
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
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 ValuesFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 LiteralsFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 VariablesFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 VariablesFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 BuiltInFunctionsFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 BinaryOperationsFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 BinaryOperationsFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 BinaryOperationsFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 BinaryOperationsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 BinaryOperationsFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 UnaryOperationsFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__CACHE_NAME,
				 UnaryOperationsFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 ValuesFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 LiteralsFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 VariablesFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 VariablesFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 BuiltInFunctionsFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 BinaryOperationsFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 BinaryOperationsFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 BinaryOperationsFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 BinaryOperationsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 BinaryOperationsFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 UnaryOperationsFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__KEYS,
				 UnaryOperationsFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 ValuesFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 LiteralsFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 LiteralsFactory.eINSTANCE.createNumberLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 VariablesFactory.eINSTANCE.createEnvironmentVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 VariablesFactory.eINSTANCE.createSecretVariable()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 BuiltInFunctionsFactory.eINSTANCE.createBuiltInFunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 BinaryOperationsFactory.eINSTANCE.createBinaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 BinaryOperationsFactory.eINSTANCE.createConjuntion()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 BinaryOperationsFactory.eINSTANCE.createDisjunction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 BinaryOperationsFactory.eINSTANCE.createAddition()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 BinaryOperationsFactory.eINSTANCE.createSubtraction()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 UnaryOperationsFactory.eINSTANCE.createUnaryOp()));

		newChildDescriptors.add
			(createChildParameter
				(StepsPackage.Literals.CACHE__PATHS,
				 UnaryOperationsFactory.eINSTANCE.createNegation()));
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
			childFeature == StepsPackage.Literals.CACHE__CACHE_NAME ||
			childFeature == StepsPackage.Literals.CACHE__KEYS ||
			childFeature == StepsPackage.Literals.CACHE__PATHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
