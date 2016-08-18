/**
 * 
 */
package Library;

import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Jordan
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Journal extends LibData {

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String articles_authors;
	ArrayList<String> authors = new ArrayList<String>();

	/** 
	 * @return the article
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getArticlesAuthors() {
		// begin-user-code
		return this.articles_authors;
		// end-user-code
	}

	/** 
	 * @param article the article to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setArticlesAuthors(String buff) {
		// begin-user-code
		this.articles_authors = buff;
		
		for ( String temp: buff.split("; ", 0)) {
			int i = 0;
			for ( String temp2: temp.split(", ", 0)){
	             if( i == 1) this.authors.add(temp2);
	             ++i;
	         }
		}
		// end-user-code
	}
	
	public boolean checkAuthor(String buff) {
		return (this.authors.contains(buff));
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
	private Integer volume;

	/** 
	 * @return the volume
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getVolume() {
		// begin-user-code
		return volume;
		// end-user-code
	}

	/** 
	 * @param volume the volume to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setVolume(Integer volume) {
		// begin-user-code
		this.volume = volume;
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Integer issue;

	/** 
	 * @return the issue
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Integer getIssue() {
		// begin-user-code
		return issue;
		// end-user-code
	}

	/** 
	 * @param issue the issue to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setIssue(Integer issue) {
		// begin-user-code
		this.issue = issue;
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
	
	private Integer j_id;
	
	public Integer getJID() {
		return j_id;
	}
	
	public void setJID( Integer j_id ) {
		this.j_id = j_id;
	}
	
	Journal( Integer j_id, String title, String publisher, String publication_date, Integer volume, Integer issue, String articles_authors, Integer copies ) {
        this.j_id = j_id;
		this.title = title;
		this.publisher = publisher;
		this.publication_date = publication_date;
		this.volume = volume;
		this.issue = issue;
		this.copies = copies;
		this.borrowed = 0;
		this.articles_authors = articles_authors;
		
		int i = 0;

	    for (String tempStr: articles_authors.split("; ", 0)){
	    	i = 0;
	    	for (String tempStr2: tempStr.split(", ", 0)) {
	    		if( i == 1 ) authors.add(tempStr2);
	    		++i;
	    	}
	      }
	}
}