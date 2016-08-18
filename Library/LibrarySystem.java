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
public class LibrarySystem {
	
	private DataHandler handler = new DataHandler(); 
	private String file_name = "LibData";    //name of file without file type
	private LibData archive = handler.loadDataFromFile( file_name );   //either starts new archive or returns what has been saved.

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param section
	 * @param method
	 * @param buffer
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void searchSystem( Integer option, String buff ) {
		switch ( option ) {
		    case 1:
		    	archive.searchTitle( buff );
		    	break;
		    case 2:
		    	archive.searchAuthor( buff );
		    	break;
		    case 3:
		    	archive.searchPublisher( buff );
		    	break;
		    default:
		    	break;
		}
	}

    public int verifySearch( Integer option, Integer id ) {
    	switch( option ) {
            case 1:
    	        return( archive.verifyBook( id ) );
            case 2:
    	        return( archive.verifyJournal( id ) );
            default:
    	        System.out.println("option mismatch in verifySearch(), LibrarySystem.\n");
    	        break;
    	}
    	
    	return -1;
    }
    
    public int verifyUser( Integer id ) {
    	return ( archive.verifyUser( id ) );
    }

    public void borrow( Integer option, Integer user_id, Integer id ) {
    	switch( option ) {
	        case 1:
	    	    archive.borrowBook( user_id, id );
	    	    break;
	        case 2:
	    	    archive.borrowJournal( user_id, id );
	    	    break;
	        default:
	    	    System.out.println("option mismatch in borrow(), LibrarySystem.\n");
	    	    break;
	    }
    }
    
    public void docReturn( Integer option, Integer user_id, Integer id ) {
    	switch( option ) {
    	    case 1:
    	    	archive.returnBook( user_id, id );
    	    	break;
    	    case 2:
    	    	archive.returnJournal( user_id, id );
    	    	break;
    	    default:
    	    	System.out.println("option mismatch in docReturn, LibrarySystem.\n");
    	    	break;
    	}
    }
    
    public void addUser( String name, String type, Integer id ) {
    	archive.addUser( name, type, id );
    }
    
    public void removeUser( int location ) {
    	archive.removeUser( location );
    }
    
    public void listUsers() {
    	archive.listUsers();
    }
    
    public void addDoc( Integer option, Integer isbn, Integer volume, Integer issue, String author, String articles_authors, 
		                String publisher, String title, String publication_date, Integer copies, String location ) {
    	switch( option ) {
    	    case 1:
    	    	archive.addBook( isbn, author, publisher, title, publication_date, copies );
    	    	break;
    	    case 2:
    	    	archive.addJournal( volume, issue, articles_authors, publisher, title, publication_date, copies );
    	    	break;
    	    case 3:
    	    	archive.addAudio( author, publisher, title, publication_date );
    	    	break;
    	    case 4:
    	    	archive.addVideo( author, publisher, title, publication_date );
    	    	break;
    	    case 5:
    	    	archive.addConf( author, publisher, title, publication_date, location );
    	    	break;
    	    default:
    	    	System.out.println("addDoc in LibrarySystem option value mismatch.\n");
    	}
    }
    
    public void listBorrowed() {
    	if( archive.loanedEmpty() ) System.out.println("No Books are currently loaned.\n");
    	else {
    		archive.listBorrowed();
    	}
    }
    
    public void save() {
    	handler.saveDataToFile( file_name, archive );
    }
}