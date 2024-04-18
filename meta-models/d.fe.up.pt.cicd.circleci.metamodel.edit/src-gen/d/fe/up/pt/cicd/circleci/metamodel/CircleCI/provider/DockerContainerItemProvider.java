/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.provider;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIFactory;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerContainerItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerContainerItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__USER);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__ENVIRONMENT_VARIABLES);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID);
			childrenFeatures.add(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY);
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
	 * This returns DockerContainer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DockerContainer"));
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
		return getString("_UI_DockerContainer_type");
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

		switch (notification.getFeatureID(DockerContainer.class)) {
		case CircleCIPackage.DOCKER_CONTAINER__IMAGE:
		case CircleCIPackage.DOCKER_CONTAINER__NAME:
		case CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT:
		case CircleCIPackage.DOCKER_CONTAINER__COMMAND:
		case CircleCIPackage.DOCKER_CONTAINER__USER:
		case CircleCIPackage.DOCKER_CONTAINER__ENVIRONMENT_VARIABLES:
		case CircleCIPackage.DOCKER_CONTAINER__USERNAME:
		case CircleCIPackage.DOCKER_CONTAINER__PASSWORD:
		case CircleCIPackage.DOCKER_CONTAINER__OIDC:
		case CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID:
		case CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY:
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

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__NAME,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USER,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__ENVIRONMENT_VARIABLES,
				CircleCIFactory.eINSTANCE.create(CircleCIPackage.Literals.VARIABLE_ASSIGNMENT)));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
				CircleCIFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createConcat()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createDotOperator()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createIntegerLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add(createChildParameter(CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY,
				CircleCIFactory.eINSTANCE.createVariableReference()));
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

		boolean qualify = childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__IMAGE
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__NAME
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__ENTRYPOINT
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__COMMAND
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__USER
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__USERNAME
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__PASSWORD
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__OIDC
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID
				|| childFeature == CircleCIPackage.Literals.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CircleCIEditPlugin.INSTANCE;
	}

}
