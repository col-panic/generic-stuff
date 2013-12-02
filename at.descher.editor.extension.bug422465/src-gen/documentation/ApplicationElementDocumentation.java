/**
 */
package documentation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Element Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link documentation.ApplicationElementDocumentation#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link documentation.ApplicationElementDocumentation#getApplicationElementId <em>Application Element Id</em>}</li>
 *   <li>{@link documentation.ApplicationElementDocumentation#getApplicationElementXMIId <em>Application Element XMI Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see documentation.DocumentationPackage#getApplicationElementDocumentation()
 * @model
 * @generated
 */
public interface ApplicationElementDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #setDocumentation(String)
	 * @see documentation.DocumentationPackage#getApplicationElementDocumentation_Documentation()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link documentation.ApplicationElementDocumentation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Unsets the value of the '{@link documentation.ApplicationElementDocumentation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	void unsetDocumentation();

	/**
	 * Returns whether the value of the '{@link documentation.ApplicationElementDocumentation#getDocumentation <em>Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Documentation</em>' attribute is set.
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	boolean isSetDocumentation();

	/**
	 * Returns the value of the '<em><b>Application Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Element Id</em>' attribute.
	 * @see #setApplicationElementId(String)
	 * @see documentation.DocumentationPackage#getApplicationElementDocumentation_ApplicationElementId()
	 * @model
	 * @generated
	 */
	String getApplicationElementId();

	/**
	 * Sets the value of the '{@link documentation.ApplicationElementDocumentation#getApplicationElementId <em>Application Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Element Id</em>' attribute.
	 * @see #getApplicationElementId()
	 * @generated
	 */
	void setApplicationElementId(String value);

	/**
	 * Returns the value of the '<em><b>Application Element XMI Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Element XMI Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Element XMI Id</em>' attribute.
	 * @see #setApplicationElementXMIId(String)
	 * @see documentation.DocumentationPackage#getApplicationElementDocumentation_ApplicationElementXMIId()
	 * @model
	 * @generated
	 */
	String getApplicationElementXMIId();

	/**
	 * Sets the value of the '{@link documentation.ApplicationElementDocumentation#getApplicationElementXMIId <em>Application Element XMI Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Element XMI Id</em>' attribute.
	 * @see #getApplicationElementXMIId()
	 * @generated
	 */
	void setApplicationElementXMIId(String value);

} // ApplicationElementDocumentation
