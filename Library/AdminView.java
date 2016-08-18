package Library;

public class AdminView extends ConsoleWindow {

	@Override
	protected void printMenu() {
		System.out.println("What would you like to do?\n"
		                   + "\t1.Add User.\n"
		                   + "\t2.Remove User.\n"
		                   + "\t3.List Users.\n"
		                   + "\t4.Return to main view.\n"
		                   + "\nPlease enter operation number:");
	}
	
	private String name;
	private String type;
	private Integer id;
	private Integer option = 0;
	
	private void addUser( LibrarySystem lib ){
		int exists = lib.verifyUser( id );
		
		if( exists == -1 ) {
		    lib.addUser( name, type, id );
		    System.out.println("User succesfully added.\n");
		}
		else
			System.out.println("User with ID " + id + " already exist.\n"
					           + "Returning to menu.\n");
	}
	
    private void removeUser( LibrarySystem lib ){
    	int exists = lib.verifyUser( id );
    	
    	if( exists != -1 ) {
    		lib.removeUser( exists );
    		System.out.println("User succesfully removed.\n");
    	}
    	else
    		System.out.println("User not found.\n" 
    	                       + "Returning to menu.\n");
	}
    
    private void listUsers( LibrarySystem lib ){
		lib.listUsers();
	}

	public void runView( LibrarySystem lib ) {
		
		//TODO check if Admin (password)?
		
		boolean a_exit = false;
		 
		while( !a_exit ) {
		    printMenu();
			
			option = in.nextInt();
			in.nextLine();
			System.out.println();
			
	        switch ( option ) {
	            case 1:
	            	System.out.println("Please enter User info to add.");
					System.out.println("Name:");
				    name = in.nextLine();
				    System.out.println("ID:");
				    id = in.nextInt();
				    in.nextLine();
			        System.out.println("Librarian, Falculty or Student:");
				    type = in.nextLine();
				    addUser( lib );
	        	    break;
	            case 2:
	            	System.out.println("Please enter ID of User to remove:");
				    id = in.nextInt();
				    in.nextLine();
				    removeUser( lib );
	        	    break;
	            case 3:
	        	    listUsers( lib );
	        	    break;
	            case 4:
	        	    a_exit = true;
	        	    break;
	            default:
	        	    System.err.println( "Please select a number between 1 to 4.\n");
	                break;
	        }
	    }
	}
	
}
