package Library;

public class LibrarianView extends ConsoleWindow {

	@Override
	protected void printMenu() {
		System.out.println("What would you like to do?\n"
		                   + "\t1.Add Document.\n"
		                   + "\t2.List Borrowed.\n"
		                   + "\t3.Return to main menu.\n"
		                   + "\nPlease enter operation number:");
	}
	
	private Integer option = 0;
	private Integer isbn = 0;
	private Integer volume = 0;
	private Integer issue = 0;
	private String author = "";
	private String articles_authors = "";
	private String publisher = "";
	private String title = "";
	private String publication_date = "";
	private Integer copies = 0;
	private String location = "";
	
	private void addDoc( LibrarySystem lib ) {
		lib.addDoc( option, isbn, volume, issue, author, articles_authors, 
				    publisher, title, publication_date, copies, location );
	}

	private void listBorrowed( LibrarySystem lib ) {
		lib.listBorrowed();
	}
	
	public void runView( LibrarySystem lib ) {
		
		//TODO check if Librarian
		
		boolean l_exit = false,
				ret;
		 
		while( !l_exit ) {
			
			ret = false;
		    printMenu();
			
			option = in.nextInt();
			in.nextLine();
			System.out.println();
			
	        switch ( option ) {
	            case 1:
	            	while( !ret ) {
	            	    System.out.println("Which would you like to add?\n"
	        		                       + "\t1.Book.\n"
	        		                       + "\t2.Journal.\n"
	        		                       + "\t3.Audio Tape.\n"
	        		                       + "\t4.Video Tape.\n"
	        		                       + "\t5.Conference Proceedings.\n"
	        		                       + "\t6.Return to main menu.\n"
	        		                       + "\nPlease enter selection number:");
	        		    option = in.nextInt();
				        in.nextLine(); 
				        System.out.println();
				    
				        switch ( option ) {
				            case 1:
				            	System.out.println("Please enter Book info.");
								System.out.println("Title:");
							    title = in.nextLine();
							    System.out.println("Publisher:");
							    publisher = in.nextLine();
						        System.out.println("Publication Date:");
						        publication_date = in.nextLine();
						        System.out.println("ISBN:");
						        isbn = in.nextInt();
						        in.nextLine();
						        System.out.println("Number of Copies:");
						        copies = in.nextInt();
						        in.nextLine();
						        System.out.println("Author:");
						        author = in.nextLine();
						        addDoc( lib );
				        	    break;
				            case 2:
				            	System.out.println("Please enter Journal info.");
								System.out.println("Title:");
							    title = in.nextLine();
							    System.out.println("Publisher:");
							    publisher = in.nextLine();
						        System.out.println("Publication Date:");
						        publication_date = in.nextLine();
						        System.out.println("Volume:");
						        volume = in.nextInt();
						        in.nextLine();
						        System.out.println("Issue:");
						        issue = in.nextInt();
						        in.nextLine();
						        System.out.println("Articles and Authors:");
						        System.out.println("Example: article1, author1; article2, author2; article3, author3");
						        articles_authors = in.nextLine();
						        System.out.println("Copies:");
						        copies = in.nextInt();
						        in.nextLine();
						        addDoc( lib );
				        	    break;
				            case 3:
				            	System.out.println("Please enter Audio Tape info.");
								System.out.println("Title:");
							    title = in.nextLine();
							    System.out.println("Publisher:");
							    publisher = in.nextLine();
						        System.out.println("Publication Date:");
						        publication_date = in.nextLine();
						        System.out.println("Author:");
						        author = in.nextLine();
						        addDoc( lib );
				        	    break;
				            case 4:
				            	System.out.println("Please enter Video Tape info.");
								System.out.println("Title:");
							    title = in.nextLine();
							    System.out.println("Publisher:");
							    publisher = in.nextLine();
						        System.out.println("Publication Date:");
						        publication_date = in.nextLine();
						        System.out.println("Author:");
						        author = in.nextLine();
						        addDoc( lib );
				        	    break;
				            case 5:
				            	System.out.println("Please enter Conference Proceedings info.");
								System.out.println("Title:");
							    title = in.nextLine();
							    System.out.println("Publisher:");
							    publisher = in.nextLine();
						        System.out.println("Conference Date:");
						        publication_date = in.nextLine();
						        System.out.println("Conference Location:");
							    location = in.nextLine();
						        System.out.println("Author:");
						        author = in.nextLine();
						        addDoc( lib );
				        	    break;
				            case 6:
				            	ret = true;
				        	    break;
				            default:
				            	System.err.println( "Please select a number between 1 to 6.\n");
				            	break;
				        }
	            	}
	        	    break;
	            case 2:
	        	    listBorrowed( lib );
	        	    break;
	            case 3:
	        	    l_exit = true;
	        	    break;
	            default:
	        	    System.err.println( "Please select a number between 1 to 4.\n");
	                break;
	        }
	    }
	}

}
