/**
 */
package d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl;

import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.CircleCIPackage;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.DockerContainer;
import d.fe.up.pt.cicd.circleci.metamodel.CircleCI.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getEntrypoint <em>Entrypoint</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getUser <em>User</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getOidc <em>Oidc</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getAwsAccessKeyID <em>Aws Access Key ID</em>}</li>
 *   <li>{@link d.fe.up.pt.cicd.circleci.metamodel.CircleCI.impl.DockerContainerImpl#getAwsSecretAccessKey <em>Aws Secret Access Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerContainerImpl extends EnvironmentImpl implements DockerContainer {
	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected Expression image;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Expression name;

	/**
	 * The cached value of the '{@link #getEntrypoint() <em>Entrypoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrypoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> entrypoint;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> command;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected Expression user;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected Expression username;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected Expression password;

	/**
	 * The cached value of the '{@link #getOidc() <em>Oidc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOidc()
	 * @generated
	 * @ordered
	 */
	protected Expression oidc;

	/**
	 * The cached value of the '{@link #getAwsAccessKeyID() <em>Aws Access Key ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsAccessKeyID()
	 * @generated
	 * @ordered
	 */
	protected Expression awsAccessKeyID;

	/**
	 * The cached value of the '{@link #getAwsSecretAccessKey() <em>Aws Secret Access Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsSecretAccessKey()
	 * @generated
	 * @ordered
	 */
	protected Expression awsSecretAccessKey;

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
		return CircleCIPackage.Literals.DOCKER_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImage(Expression newImage, NotificationChain msgs) {
		Expression oldImage = image;
		image = newImage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__IMAGE, oldImage, newImage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(Expression newImage) {
		if (newImage != image) {
			NotificationChain msgs = null;
			if (image != null)
				msgs = ((InternalEObject) image).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__IMAGE, null, msgs);
			if (newImage != null)
				msgs = ((InternalEObject) newImage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__IMAGE, null, msgs);
			msgs = basicSetImage(newImage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__IMAGE, newImage,
					newImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Expression newName, NotificationChain msgs) {
		Expression oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__NAME, oldName, newName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(Expression newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getEntrypoint() {
		if (entrypoint == null) {
			entrypoint = new EObjectContainmentEList<Expression>(Expression.class, this,
					CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT);
		}
		return entrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<Expression>(Expression.class, this,
					CircleCIPackage.DOCKER_CONTAINER__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(Expression newUser, NotificationChain msgs) {
		Expression oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__USER, oldUser, newUser);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(Expression newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject) user).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject) newUser).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__USER, newUser,
					newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsername(Expression newUsername, NotificationChain msgs) {
		Expression oldUsername = username;
		username = newUsername;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__USERNAME, oldUsername, newUsername);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(Expression newUsername) {
		if (newUsername != username) {
			NotificationChain msgs = null;
			if (username != null)
				msgs = ((InternalEObject) username).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__USERNAME, null, msgs);
			if (newUsername != null)
				msgs = ((InternalEObject) newUsername).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__USERNAME, null, msgs);
			msgs = basicSetUsername(newUsername, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__USERNAME,
					newUsername, newUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassword(Expression newPassword, NotificationChain msgs) {
		Expression oldPassword = password;
		password = newPassword;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__PASSWORD, oldPassword, newPassword);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(Expression newPassword) {
		if (newPassword != password) {
			NotificationChain msgs = null;
			if (password != null)
				msgs = ((InternalEObject) password).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__PASSWORD, null, msgs);
			if (newPassword != null)
				msgs = ((InternalEObject) newPassword).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__PASSWORD, null, msgs);
			msgs = basicSetPassword(newPassword, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__PASSWORD,
					newPassword, newPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getOidc() {
		return oidc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOidc(Expression newOidc, NotificationChain msgs) {
		Expression oldOidc = oidc;
		oidc = newOidc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__OIDC, oldOidc, newOidc);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOidc(Expression newOidc) {
		if (newOidc != oidc) {
			NotificationChain msgs = null;
			if (oidc != null)
				msgs = ((InternalEObject) oidc).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__OIDC, null, msgs);
			if (newOidc != null)
				msgs = ((InternalEObject) newOidc).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__OIDC, null, msgs);
			msgs = basicSetOidc(newOidc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__OIDC, newOidc,
					newOidc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getAwsAccessKeyID() {
		return awsAccessKeyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwsAccessKeyID(Expression newAwsAccessKeyID, NotificationChain msgs) {
		Expression oldAwsAccessKeyID = awsAccessKeyID;
		awsAccessKeyID = newAwsAccessKeyID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID, oldAwsAccessKeyID, newAwsAccessKeyID);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwsAccessKeyID(Expression newAwsAccessKeyID) {
		if (newAwsAccessKeyID != awsAccessKeyID) {
			NotificationChain msgs = null;
			if (awsAccessKeyID != null)
				msgs = ((InternalEObject) awsAccessKeyID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID, null, msgs);
			if (newAwsAccessKeyID != null)
				msgs = ((InternalEObject) newAwsAccessKeyID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID, null, msgs);
			msgs = basicSetAwsAccessKeyID(newAwsAccessKeyID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID,
					newAwsAccessKeyID, newAwsAccessKeyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getAwsSecretAccessKey() {
		return awsSecretAccessKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwsSecretAccessKey(Expression newAwsSecretAccessKey, NotificationChain msgs) {
		Expression oldAwsSecretAccessKey = awsSecretAccessKey;
		awsSecretAccessKey = newAwsSecretAccessKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY, oldAwsSecretAccessKey,
					newAwsSecretAccessKey);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAwsSecretAccessKey(Expression newAwsSecretAccessKey) {
		if (newAwsSecretAccessKey != awsSecretAccessKey) {
			NotificationChain msgs = null;
			if (awsSecretAccessKey != null)
				msgs = ((InternalEObject) awsSecretAccessKey).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY, null, msgs);
			if (newAwsSecretAccessKey != null)
				msgs = ((InternalEObject) newAwsSecretAccessKey).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY, null, msgs);
			msgs = basicSetAwsSecretAccessKey(newAwsSecretAccessKey, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY, newAwsSecretAccessKey,
					newAwsSecretAccessKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CircleCIPackage.DOCKER_CONTAINER__IMAGE:
			return basicSetImage(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__NAME:
			return basicSetName(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT:
			return ((InternalEList<?>) getEntrypoint()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__COMMAND:
			return ((InternalEList<?>) getCommand()).basicRemove(otherEnd, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__USER:
			return basicSetUser(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__USERNAME:
			return basicSetUsername(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__PASSWORD:
			return basicSetPassword(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__OIDC:
			return basicSetOidc(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID:
			return basicSetAwsAccessKeyID(null, msgs);
		case CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY:
			return basicSetAwsSecretAccessKey(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CircleCIPackage.DOCKER_CONTAINER__IMAGE:
			return getImage();
		case CircleCIPackage.DOCKER_CONTAINER__NAME:
			return getName();
		case CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT:
			return getEntrypoint();
		case CircleCIPackage.DOCKER_CONTAINER__COMMAND:
			return getCommand();
		case CircleCIPackage.DOCKER_CONTAINER__USER:
			return getUser();
		case CircleCIPackage.DOCKER_CONTAINER__USERNAME:
			return getUsername();
		case CircleCIPackage.DOCKER_CONTAINER__PASSWORD:
			return getPassword();
		case CircleCIPackage.DOCKER_CONTAINER__OIDC:
			return getOidc();
		case CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID:
			return getAwsAccessKeyID();
		case CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY:
			return getAwsSecretAccessKey();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CircleCIPackage.DOCKER_CONTAINER__IMAGE:
			setImage((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__NAME:
			setName((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT:
			getEntrypoint().clear();
			getEntrypoint().addAll((Collection<? extends Expression>) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends Expression>) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__USER:
			setUser((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__USERNAME:
			setUsername((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__PASSWORD:
			setPassword((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__OIDC:
			setOidc((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID:
			setAwsAccessKeyID((Expression) newValue);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY:
			setAwsSecretAccessKey((Expression) newValue);
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
		case CircleCIPackage.DOCKER_CONTAINER__IMAGE:
			setImage((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__NAME:
			setName((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT:
			getEntrypoint().clear();
			return;
		case CircleCIPackage.DOCKER_CONTAINER__COMMAND:
			getCommand().clear();
			return;
		case CircleCIPackage.DOCKER_CONTAINER__USER:
			setUser((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__USERNAME:
			setUsername((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__PASSWORD:
			setPassword((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__OIDC:
			setOidc((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID:
			setAwsAccessKeyID((Expression) null);
			return;
		case CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY:
			setAwsSecretAccessKey((Expression) null);
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
		case CircleCIPackage.DOCKER_CONTAINER__IMAGE:
			return image != null;
		case CircleCIPackage.DOCKER_CONTAINER__NAME:
			return name != null;
		case CircleCIPackage.DOCKER_CONTAINER__ENTRYPOINT:
			return entrypoint != null && !entrypoint.isEmpty();
		case CircleCIPackage.DOCKER_CONTAINER__COMMAND:
			return command != null && !command.isEmpty();
		case CircleCIPackage.DOCKER_CONTAINER__USER:
			return user != null;
		case CircleCIPackage.DOCKER_CONTAINER__USERNAME:
			return username != null;
		case CircleCIPackage.DOCKER_CONTAINER__PASSWORD:
			return password != null;
		case CircleCIPackage.DOCKER_CONTAINER__OIDC:
			return oidc != null;
		case CircleCIPackage.DOCKER_CONTAINER__AWS_ACCESS_KEY_ID:
			return awsAccessKeyID != null;
		case CircleCIPackage.DOCKER_CONTAINER__AWS_SECRET_ACCESS_KEY:
			return awsSecretAccessKey != null;
		}
		return super.eIsSet(featureID);
	}

} //DockerContainerImpl
