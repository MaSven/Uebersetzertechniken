/**
 * generated by Xtext 2.11.0-SNAPSHOT
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.TypeReference#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeReference()
 * @model
 * @generated
 */
public interface TypeReference extends Type
{
  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' reference.
   * @see #setTypeRef(TypeDeclaration)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getTypeReference_TypeRef()
   * @model
   * @generated
   */
  TypeDeclaration getTypeRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.TypeReference#getTypeRef <em>Type Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(TypeDeclaration value);

} // TypeReference