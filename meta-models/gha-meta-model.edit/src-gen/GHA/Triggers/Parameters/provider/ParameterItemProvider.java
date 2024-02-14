/**
 */
package GHA.Triggers.Parameters.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import GHA.Triggers.Parameters.Parameter;
import GHA.Triggers.Parameters.ParametersPackage;

import GHA.provider.GHAEditPlugin;

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
 * This is the item provider adapter for a {@link GHA.Triggers.Parameters.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_Parameter_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Parameter_id_feature",
								"_UI_Parameter_type"),
						ParametersPackage.Literals.PARAMETER__ID, true, false, false,
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
			childrenFeatures.add(ParametersPackage.Literals.PARAMETER__DESCRIPTION);
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
		String label = ((Parameter) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Parameter_type")
				: getString("_UI_Parameter_type") + " " + label;
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

		switch (notification.getFeatureID(Parameter.class)) {
		case ParametersPackage.PARAMETER__ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ParametersPackage.PARAMETER__DESCRIPTION:
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

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(ParametersPackage.Literals.PARAMETER__DESCRIPTION,
				VariablesFactory.eINSTANCE.createVariableDereference()));
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
