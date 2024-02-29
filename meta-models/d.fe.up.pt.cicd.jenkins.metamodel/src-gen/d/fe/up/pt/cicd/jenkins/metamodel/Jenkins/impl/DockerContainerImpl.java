/**
 */
package d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl;

import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.DockerContainer;
import d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.JenkinsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl#getRegistryURL <em>Registry URL</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.jenkins.metamodel.Jenkins.impl.DockerContainerImpl#getRegistryCredentialsId <em>Registry Credentials Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerContainerImpl extends MinimalEObjectImpl.Container implements DockerContainer {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected String args = ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistryURL() <em>Registry URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryURL() <em>Registry URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryURL()
	 * @generated
	 * @ordered
	 */
	protected String registryURL = REGISTRY_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistryCredentialsId() <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryCredentialsId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRY_CREDENTIALS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistryCredentialsId() <em>Registry Credentials Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistryCredentialsId()
	 * @generated
	 * @ordered
	 */
	protected String registryCredentialsId = REGISTRY_CREDENTIALS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JenkinsPackage.Literals.DOCKER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.DOCKER_CONTAINER__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.DOCKER_CONTAINER__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArgs(String newArgs) {
		String oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.DOCKER_CONTAINER__ARGS, oldArgs,
					args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistryURL() {
		return registryURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistryURL(String newRegistryURL) {
		String oldRegistryURL = registryURL;
		registryURL = newRegistryURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JenkinsPackage.DOCKER_CONTAINER__REGISTRY_URL,
					oldRegistryURL, registryURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegistryCredentialsId() {
		return registryCredentialsId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegistryCredentialsId(String newRegistryCredentialsId) {
		String oldRegistryCredentialsId = registryCredentialsId;
		registryCredentialsId = newRegistryCredentialsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					JenkinsPackage.DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID, oldRegistryCredentialsId,
					registryCredentialsId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case JenkinsPackage.DOCKER_CONTAINER__IMAGE:
			return getImage();
		case JenkinsPackage.DOCKER_CONTAINER__LABEL:
			return getLabel();
		case JenkinsPackage.DOCKER_CONTAINER__ARGS:
			return getArgs();
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_URL:
			return getRegistryURL();
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID:
			return getRegistryCredentialsId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case JenkinsPackage.DOCKER_CONTAINER__IMAGE:
			setImage((String) newValue);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__LABEL:
			setLabel((String) newValue);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__ARGS:
			setArgs((String) newValue);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_URL:
			setRegistryURL((String) newValue);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID:
			setRegistryCredentialsId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case JenkinsPackage.DOCKER_CONTAINER__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__ARGS:
			setArgs(ARGS_EDEFAULT);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_URL:
			setRegistryURL(REGISTRY_URL_EDEFAULT);
			return;
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID:
			setRegistryCredentialsId(REGISTRY_CREDENTIALS_ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case JenkinsPackage.DOCKER_CONTAINER__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case JenkinsPackage.DOCKER_CONTAINER__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case JenkinsPackage.DOCKER_CONTAINER__ARGS:
			return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_URL:
			return REGISTRY_URL_EDEFAULT == null ? registryURL != null : !REGISTRY_URL_EDEFAULT.equals(registryURL);
		case JenkinsPackage.DOCKER_CONTAINER__REGISTRY_CREDENTIALS_ID:
			return REGISTRY_CREDENTIALS_ID_EDEFAULT == null ? registryCredentialsId != null
					: !REGISTRY_CREDENTIALS_ID_EDEFAULT.equals(registryCredentialsId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (image: ");
		result.append(image);
		result.append(", label: ");
		result.append(label);
		result.append(", args: ");
		result.append(args);
		result.append(", registryURL: ");
		result.append(registryURL);
		result.append(", registryCredentialsId: ");
		result.append(registryCredentialsId);
		result.append(')');
		return result.toString();
	}

} //DockerContainerImpl
