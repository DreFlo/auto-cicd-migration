/**
 */
package GHA.Jobs.Matrices.provider;

import GHA.Expressions.BinaryOperators.BinaryOperatorsFactory;

import GHA.Expressions.BinaryOperators.EqualityOperators.EqualityOperatorsFactory;

import GHA.Expressions.BinaryOperators.LogicalOperators.LogicalOperatorsFactory;

import GHA.Expressions.BuiltInFunctions.BuiltInFunctionsFactory;

import GHA.Expressions.BuiltInFunctions.StatusCheckFunctions.StatusCheckFunctionsFactory;

import GHA.Expressions.UnaryOperators.UnaryOperatorsFactory;

import GHA.Expressions.Values.Literals.LiteralsFactory;

import GHA.Expressions.Values.Variables.VariablesFactory;

import GHA.Jobs.Matrices.MatricesPackage;
import GHA.Jobs.Matrices.MatrixAxis;

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
 * This is the item provider adapter for a {@link GHA.Jobs.Matrices.MatrixAxis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MatrixAxisItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatrixAxisItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_MatrixAxis_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MatrixAxis_name_feature",
								"_UI_MatrixAxis_type"),
						MatricesPackage.Literals.MATRIX_AXIS__NAME, true, false, false,
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
			childrenFeatures.add(MatricesPackage.Literals.MATRIX_AXIS__CELLS);
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
	 * This returns MatrixAxis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MatrixAxis"));
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
		String label = ((MatrixAxis) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MatrixAxis_type")
				: getString("_UI_MatrixAxis_type") + " " + label;
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

		switch (notification.getFeatureID(MatrixAxis.class)) {
		case MatricesPackage.MATRIX_AXIS__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case MatricesPackage.MATRIX_AXIS__CELLS:
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

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BinaryOperatorsFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				EqualityOperatorsFactory.eINSTANCE.createEquality()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				LogicalOperatorsFactory.eINSTANCE.createOr()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				LogicalOperatorsFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				UnaryOperatorsFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createContains()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createStartsWith()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createEndsWith()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createFormat()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createJoin()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createToJSON()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createFromJSON()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				BuiltInFunctionsFactory.eINSTANCE.createHashFiles()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				StatusCheckFunctionsFactory.eINSTANCE.createAlways()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				StatusCheckFunctionsFactory.eINSTANCE.createSuccess()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				StatusCheckFunctionsFactory.eINSTANCE.createCancelled()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				StatusCheckFunctionsFactory.eINSTANCE.createFailure()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				LiteralsFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				LiteralsFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				LiteralsFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				LiteralsFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				VariablesFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
				VariablesFactory.eINSTANCE.createGitHubContext()));

		newChildDescriptors.add(createChildParameter(MatricesPackage.Literals.MATRIX_AXIS__CELLS,
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