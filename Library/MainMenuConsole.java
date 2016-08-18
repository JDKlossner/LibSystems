package Library;

public class MainMenuConsole extends ConsoleWindow {

	@Override
	protected void printMenu() {
		System.out.println("What would you like to do?\n"
		                   + "\t1.User View.\n"
		                   + "\t2.Librarian View.\n"
		                   + "\t3.Admin View.\n"
		                   + "\t4.Exit system.\n"
		                   + "\nPlease enter operation number:");
	}
	
	private UserView u_view = new UserView();
	private LibrarianView l_view = new LibrarianView();
	private AdminView a_view = new AdminView();

	public void start( LibrarySystem lib ) {
		int option = 0;
		boolean exit = false;
		
		while ( !exit ) {
		    printMenu();
		    
		    option = in.nextInt();
		    in.nextLine();
		    
		    switch ( option ) {
		        case 1:
		        	u_view.runView(lib);
		        	break;
		        case 2:
		        	l_view.runView(lib);
		        	break;
		        case 3:
		        	a_view.runView(lib);
		        	break;
		        case 4:
		        	exit = true;
		        	System.out.println();
		        	break;
		        default:
		        	System.err.println( "Please select a number between 1 to 4.");
		            break;
		    }
		}
		
	}
}
