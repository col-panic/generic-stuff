/**
 */
package documentation.impl;

import documentation.ApplicationElementDocumentation;
import documentation.DocumentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Element Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link documentation.impl.ApplicationElementDocumentationImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link documentation.impl.ApplicationElementDocumentationImpl#getApplicationElementId <em>Application Element Id</em>}</li>
 *   <li>{@link documentation.impl.ApplicationElementDocumentationImpl#getApplicationElementXMIId <em>Application Element XMI Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationElementDocumentationImpl extends MinimalEObjectImpl.Container implements ApplicationElementDocumentation {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * This is true if the Documentation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean documentationESet;

	/**
	 * The default value of the '{@link #getApplicationElementId() <em>Application Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationElementId() <em>Application Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationElementId()
	 * @generated
	 * @ordered
	 */
	protected String applicationElementId = APPLICATION_ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplicationElementXMIId() <em>Application Element XMI Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationElementXMIId()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_ELEMENT_XMI_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplicationElementXMIId() <em>Application Element XMI Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationElementXMIId()
	 * @generated
	 * @ordered
	 */
	protected String applicationElementXMIId = APPLICATION_ELEMENT_XMI_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationElementDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentationPackage.Literals.APPLICATION_ELEMENT_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		boolean oldDocumentationESet = documentationESet;
		documentationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION, oldDocumentation, documentation, !oldDocumentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentation() {
		String oldDocumentation = documentation;
		boolean oldDocumentationESet = documentationESet;
		documentation = DOCUMENTATION_EDEFAULT;
		documentationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION, oldDocumentation, DOCUMENTATION_EDEFAULT, oldDocumentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentation() {
		return documentationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationElementId() {
		return applicationElementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationElementId(String newApplicationElementId) {
		String oldApplicationElementId = applicationElementId;
		applicationElementId = newApplicationElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID, oldApplicationElementId, applicationElementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplicationElementXMIId() {
		return applicationElementXMIId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationElementXMIId(String newApplicationElementXMIId) {
		String oldApplicationElementXMIId = applicationElementXMIId;
		applicationElementXMIId = newApplicationElementXMIId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID, oldApplicationElementXMIId, applicationElementXMIId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION:
				return getDocumentation();
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID:
				return getApplicationElementId();
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID:
				return getApplicationElementXMIId();
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
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID:
				setApplicationElementId((String)newValue);
				return;
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID:
				setApplicationElementXMIId((String)newValue);
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
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION:
				unsetDocumentation();
				return;
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID:
				setApplicationElementId(APPLICATION_ELEMENT_ID_EDEFAULT);
				return;
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID:
				setApplicationElementXMIId(APPLICATION_ELEMENT_XMI_ID_EDEFAULT);
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
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION:
				return isSetDocumentation();
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID:
				return APPLICATION_ELEMENT_ID_EDEFAULT == null ? applicationElementId != null : !APPLICATION_ELEMENT_ID_EDEFAULT.equals(applicationElementId);
			case DocumentationPackage.APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID:
				return APPLICATION_ELEMENT_XMI_ID_EDEFAULT == null ? applicationElementXMIId != null : !APPLICATION_ELEMENT_XMI_ID_EDEFAULT.equals(applicationElementXMIId);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		if (documentationESet) result.append(documentation); else result.append("<unset>");
		result.append(", applicationElementId: ");
		result.append(applicationElementId);
		result.append(", applicationElementXMIId: ");
		result.append(applicationElementXMIId);
		result.append(')');
		return result.toString();
	}

} //ApplicationElementDocumentationImpl
