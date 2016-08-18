/**
 * 
 */
package Library;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jordan
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Book extends LibData {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer ISBN;

	/** 
	 * @return the ISBN
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getISBN() {
		// begin-user-code
		return ISBN;
		// end-user-code
	}

	/** 
	 * @param ISBN the ISBN to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setISBN(Integer ISBN) {
		// begin-user-code
		this.ISBN = ISBN;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String author;

	/** 
	 * @return the author
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getAuthor() {
		// begin-user-code
		return author;
		// end-user-code
	}

	/** 
	 * @param author the author to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setAuthor(String author) {
		// begin-user-code
		this.author = author;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String title;

	/** 
	 * @return the title
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/** 
	 * @param title the title to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setTitle(String title) {
		// begin-user-code
		this.title = title;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String publisher;

	/** 
	 * @return the publisher
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getPublisher() {
		// begin-user-code
		return publisher;
		// end-user-code
	}

	/** 
	 * @param publisher the publisher to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPublisher(String publisher) {
		// begin-user-code
		this.publisher = publisher;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String publication_date;

	/** 
	 * @return the publication_date
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getPublication_date() {
		// begin-user-code
		return publication_date;
		// end-user-code
	}

	/** 
	 * @param publication_date the publication_date to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setPublication_date(String publication_date) {
		// begin-user-code
		this.publication_date = publication_date;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer copies;

	/** 
	 * @return the copies
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getCopies() {
		// begin-user-code
		return copies;
		// end-user-code
	}

	/** 
	 * @param copies the copies to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setCopies(Integer copies) {
		// begin-user-code
		this.copies = copies;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer borrowed = 0;

	/** 
	 * @return the borrowed
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getBorrowed() {
		// begin-user-code
		return borrowed;
		// end-user-code
	}

	/** 
	 * @param borrowed the borrowed to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setBorrowed(Integer borrowed) {
		// begin-user-code
		this.borrowed = borrowed;
		// end-user-code
	}
	
	Book( String title, String publisher, String publication_date, Integer isbn, Integer copies, String author ) {
		this.title = title;
		this.publisher = publisher;
		this.publication_date = publication_date;
		this.ISBN = isbn;
		this.copies = copies;
		this.borrowed = 0;
		this.author = author;
	}
}