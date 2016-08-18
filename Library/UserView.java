package Library;

public class UserView extends ConsoleWindow {

	@Override
	protected void printMenu() {
		System.out.println("What would you like to do?\n"
		                   + "\t1.Search.\n"
		                   + "\t2.Borrow.\n"
		                   + "\t3.Return.\n"
		                   + "\t4.Return to main view.\n"
		                   + "\nPlease enter operation number:");
	}
	
	private Integer user_id;
	private Integer option = 0;
	private Integer id;
	private String buff;
	
	private void search( LibrarySystem lib ){
		lib.searchSystem( option, buff ); //option = 1 Title, = 2 Author, = 3 Publisher
	}

    private void borrow( LibrarySystem lib ){
    	int location = lib.verifySearch( option, id );    //option = 1 Book, = 2 Journal
    	
    	if( location == -1 ) System.out.println("Document not found, returning to main menu.\n" 
    			                        + "Please verify the ISBN or JID and try again.\n");
    	
    	else {
    	    System.out.println("Is this the correct document? (Y/N)");
    	    buff = in.nextLine();
    	
    	    if( buff.equals("y") || buff.equals("Y") ) {
    		    lib.borrow( option, user_id, id );    //option = 1 Book, = 2 Journal
    		    System.out.println();
    	    }
    	    else if( buff.equals("n") || buff.equals("N") )
    		    System.out.println("Returning to main menu.\n"
    			     	           + "Please verify the ISBN or JID and try again.\n");
	    }
    }
    
    private void docReturn( LibrarySystem lib ){
    	int location = lib.verifySearch( option, id );    //option = 1 Book, = 2 Journal
    	
    	if( location == -1 ) System.out.println("Document not found, returning to main menu.\n" 
                + "Please verify the ISBN or JID and try again.\n");

    	else {
    	    System.out.println("Is this the correct document? (Y/N)");
    	    buff = in.nextLine();
    	
    	    if( buff.equals("y") || buff.equals("Y") ) {
		        lib.docReturn( option, user_id, id );    //option = 1 Book, = 2 Journal
		        System.out.println();
    	    }
    	    else if( buff.equals("n") || buff.equals("N") )
    		    System.out.println("Returning to main menu.\n"
    			    	           + "Please verify the ISBN or ID and try again.\n");
	    }
    }

 void runView( LibrarySystem lib ) {
	System.out.println("Enter your User ID:");
	user_id = in.nextInt();
	in.nextLine();
	int exists = lib.verifyUser( user_id );
	
	if( exists == -1 ) {
		System.out.println("User not found.\n"
				           + "Returning to main menu.\n");
		return;
	}
	 
	boolean u_exit = false;
	 
	while( !u_exit ) {
	    printMenu();
		
		option = in.nextInt();
		in.nextLine();
		System.out.println();
		
        switch ( option ) {
            case 1:
            	while (true) {
            	    System.out.println("What would you like to search by?\n"
		                               + "\t1.Title.\n"
			                           + "\t2.Author.\n"
		                               + "\t3.Publisher.\n"
			                           + "\t4.Return to main menu.\n"
			                           + "Please enter selection number:");
			        option = in.nextInt();
			        in.nextLine();
			        if( option == 4 ) break;
			        else if ( option > 0 && option < 4) {
			            System.out.println("Please enter the query:");
	                    buff = in.nextLine();
			            search( lib );
			            break;
			        }
			        else System.err.println( "Please select a number between 1 to 4.\n");
            	}
            	break;
            case 2:
            	while (true) {
            	    System.out.println("What type of document do you want to borrow?\n"
		                               + "\t1.Book.\n"
			                           + "\t2.Journal.\n"
			                           + "\t3.Return to main menu.\n"
			                           + "\nPlease enter selection number:");
			        option = in.nextInt();
			        in.nextLine();
			        if( option == 3 ) break;
			        else if ( option == 1 || option == 2 ) {
			            System.out.println("Please enter the ISBN or Journal ID:");
			            id = in.nextInt();
	       		        in.nextLine();
	       		        borrow( lib );
	       		        break;
			        }
			        else System.err.println( "Please select a number between 1 to 3.\n");
            	}
            	break;
            case 3:
            	while (true) {
            		System.out.println("What type of document do you want to return?\n"
                                       + "\t1.Book.\n"
	                                   + "\t2.Journal.\n"
	                                   + "\t3.Return to main menu.\n"
	                                   + "\nPlease enter selection number:");
			        option = in.nextInt();
			        in.nextLine();
			        if( option == 3 ) break;
			        else if ( option == 1 || option == 2 ) {
			            System.out.println("Please enter the ISBN or Journal ID:");
			            id = in.nextInt();
	       		        in.nextLine();
	       		        docReturn( lib );
	       		        break;
			        }
			        else System.err.println( "Please select a number between 1 to 3.\n");
            	}
            	break;
            case 4:
        	    u_exit = true;
        	    break;
            default:
        	    System.err.println( "Please select a number between 1 to 4.\n");
                break;
        }
    }
}
	
	
	
}
