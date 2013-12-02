/**
 */
package documentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see documentation.DocumentationFactory
 * @model kind="package"
 * @generated
 */
public interface DocumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "documentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecrit.at/model/documentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "documentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentationPackage eINSTANCE = documentation.impl.DocumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link documentation.impl.ApplicationElementDocumentationImpl <em>Application Element Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see documentation.impl.ApplicationElementDocumentationImpl
	 * @see documentation.impl.DocumentationPackageImpl#getApplicationElementDocumentation()
	 * @generated
	 */
	int APPLICATION_ELEMENT_DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Application Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Application Element XMI Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID = 2;

	/**
	 * The number of structural features of the '<em>Application Element Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_DOCUMENTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application Element Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_ELEMENT_DOCUMENTATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link documentation.ApplicationElementDocumentation <em>Application Element Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Element Documentation</em>'.
	 * @see documentation.ApplicationElementDocumentation
	 * @generated
	 */
	EClass getApplicationElementDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link documentation.ApplicationElementDocumentation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see documentation.ApplicationElementDocumentation#getDocumentation()
	 * @see #getApplicationElementDocumentation()
	 * @generated
	 */
	EAttribute getApplicationElementDocumentation_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link documentation.ApplicationElementDocumentation#getApplicationElementId <em>Application Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Element Id</em>'.
	 * @see documentation.ApplicationElementDocumentation#getApplicationElementId()
	 * @see #getApplicationElementDocumentation()
	 * @generated
	 */
	EAttribute getApplicationElementDocumentation_ApplicationElementId();

	/**
	 * Returns the meta object for the attribute '{@link documentation.ApplicationElementDocumentation#getApplicationElementXMIId <em>Application Element XMI Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application Element XMI Id</em>'.
	 * @see documentation.ApplicationElementDocumentation#getApplicationElementXMIId()
	 * @see #getApplicationElementDocumentation()
	 * @generated
	 */
	EAttribute getApplicationElementDocumentation_ApplicationElementXMIId();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentationFactory getDocumentationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link documentation.impl.ApplicationElementDocumentationImpl <em>Application Element Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see documentation.impl.ApplicationElementDocumentationImpl
		 * @see documentation.impl.DocumentationPackageImpl#getApplicationElementDocumentation()
		 * @generated
		 */
		EClass APPLICATION_ELEMENT_DOCUMENTATION = eINSTANCE.getApplicationElementDocumentation();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_ELEMENT_DOCUMENTATION__DOCUMENTATION = eINSTANCE.getApplicationElementDocumentation_Documentation();

		/**
		 * The meta object literal for the '<em><b>Application Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_ID = eINSTANCE.getApplicationElementDocumentation_ApplicationElementId();

		/**
		 * The meta object literal for the '<em><b>Application Element XMI Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_ELEMENT_DOCUMENTATION__APPLICATION_ELEMENT_XMI_ID = eINSTANCE.getApplicationElementDocumentation_ApplicationElementXMIId();

	}

} //DocumentationPackage
