package Library;

import java.util.*;

public class LibData implements java.io.Serializable {

	private ArrayList<AudioTape> audio = new ArrayList<AudioTape>();
	private ArrayList<VideoTape> video = new ArrayList<VideoTape>();
	private ArrayList<Book> book = new ArrayList<Book>();
	private ArrayList<ConfProc> conf = new ArrayList<ConfProc>();
	private ArrayList<Journal> journal = new ArrayList<Journal>();
	private ArrayList<User> user = new ArrayList<User>();
	private ArrayList<LoanedBooks> loanedB = new ArrayList<LoanedBooks>();
	private ArrayList<LoanedJournals> loanedJ = new ArrayList<LoanedJournals>();
	
	private Integer next_jid = 0;
	
	/*
	 * searchTitle: searches through all collections for matching title to buff.
	 *  		    Saves locations in arrays and calls printMatches().
	 */
	
	public void searchTitle( String buff ) {
        int audioSize = audio.size(), videoSize = video.size(), bookSize = book.size(), confSize = conf.size(), journalSize = journal.size();
		
		int i, p, audioLoc[] = new int[audioSize + 1], videoLoc[] = new int[videoSize + 1], bookLoc[] = new int[bookSize + 1],
			   confLoc[] = new int[confSize + 1], journalLoc[] = new int[journalSize + 1];
		
		audioLoc[0] = -1;
		videoLoc[0] = -1;
		bookLoc[0] = -1;
		confLoc[0] = -1;
		journalLoc[0] = -1;
		
		p = 0;
    	for( i = 0; i < audioSize; ++i )  {
    		if( ((audio.get(i)).getTitle()).equals(buff) ) {
    			audioLoc[p] = i;
    			++p;
    		}
    	}
    	p = 0;
        for( i = 0; i < videoSize; ++i )  {
        	if( ((video.get(i)).getTitle()).equals(buff) ) {
    			videoLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < bookSize; ++i )  {
        	if( ((book.get(i)).getTitle()).equals(buff) ) {
    			bookLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < confSize; ++i )  {
        	if( ((conf.get(i)).getTitle()).equals(buff) ) {
    			confLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < journalSize; ++i )  {
        	if( ((journal.get(i)).getTitle()).equals(buff) ) {
    			journalLoc[p] = i;
    			++p;
    		}
    	}
		
        printMatches( audioLoc, videoLoc, bookLoc, confLoc, journalLoc );
	}
	
	/*
	 * searchAuthor: Searches through all collections for matching author to buff.
	 * 				 Saves locations in arrays and calls printMatches().
	 */
	public void searchAuthor( String buff ) {
        int audioSize = audio.size(), videoSize = video.size(), bookSize = book.size(), confSize = conf.size(), journalSize = journal.size();
		
		int i, p, audioLoc[] = new int[audioSize + 1], videoLoc[] = new int[videoSize + 1], bookLoc[] = new int[bookSize + 1],
			   confLoc[] = new int[confSize + 1], journalLoc[] = new int[journalSize + 1];
		
		audioLoc[0] = -1;
		videoLoc[0] = -1;
		bookLoc[0] = -1;
		confLoc[0] = -1;
		journalLoc[0] = -1;
		
		p = 0;
    	for( i = 0; i < audioSize; ++i )  {
    		if( ((audio.get(i)).getAuthor()).equals(buff) ) {
    			audioLoc[p] = i;
    			++p;
    		}
    	}
    	p = 0;
        for( i = 0; i < videoSize; ++i )  {
        	if( ((video.get(i)).getAuthor()).equals(buff) ) {
    			videoLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < bookSize; ++i )  {
        	if( ((book.get(i)).getAuthor()).equals(buff) ) {
    			bookLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < confSize; ++i )  {
        	if( ((conf.get(i)).getAuthor()).equals(buff) ) {
    			confLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < journalSize; ++i )  {
        	if( (journal.get(i)).checkAuthor(buff)) {
      		    journalLoc[p] = i;
                ++p;
         	}
    	}
        
        printMatches( audioLoc, videoLoc, bookLoc, confLoc, journalLoc );
	}
	
	/*
	 * searchPubliisher: Searches through all collections for matching publisher to buff.
	 * 				     Saves locations in arrays and calls printMatches().
	 */
	public void searchPublisher( String buff ){
        int audioSize = audio.size(), videoSize = video.size(), bookSize = book.size(), confSize = conf.size(), journalSize = journal.size();
		
		int i, p, audioLoc[] = new int[audioSize + 1], videoLoc[] = new int[videoSize + 1], bookLoc[] = new int[bookSize + 1],
			   confLoc[] = new int[confSize + 1], journalLoc[] = new int[journalSize + 1];
		
		audioLoc[0] = -1;
		videoLoc[0] = -1;
		bookLoc[0] = -1;
		confLoc[0] = -1;
		journalLoc[0] = -1;
		
		p = 0;
        for( i = 0; i < audioSize; ++i )  {
    		if( ((audio.get(i)).getPublisher()).equals(buff) ) {
    			audioLoc[p] = i;
    			++p;
    		}
    	}
    	p = 0;
        for( i = 0; i < videoSize; ++i )  {
        	if( ((video.get(i)).getPublisher()).equals(buff) ) {
    			videoLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < bookSize; ++i )  {
        	if( ((book.get(i)).getPublisher()).equals(buff) ) {
    			bookLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < confSize; ++i )  {
        	if( ((conf.get(i)).getPublisher()).equals(buff) ) {
    			confLoc[p] = i;
    			++p;
    		}
    	}
        p = 0;
        for( i = 0; i < journalSize; ++i )  {
        	if( ((journal.get(i)).getPublisher()).equals(buff) ) {
    			journalLoc[p] = i;
    			++p;
    		}
    	}
        
        printMatches( audioLoc, videoLoc, bookLoc, confLoc, journalLoc );
	}
	
	/*
	 * printMatches: Prints all locations saved within the appropriate arrays from the respective ArrayLists.
	 */
	
	public void printMatches( int[] audioLoc, int[] videoLoc, int[] bookLoc, int[] confLoc, int[] journalLoc ) {
		int i;
		
		if( bookLoc[0] != -1 ) {
    	    System.out.println("Books:");
		    System.out.println("Title   ->   Publisher   ->   Date   ->   ISBN   ->   Author");
		    for( i = 0; i < bookLoc.length - 1; ++i) {
			    System.out.println(book.get(bookLoc[i]).getTitle() + "  " + book.get(bookLoc[i]).getPublisher() + "   " + book.get(bookLoc[i]).getPublication_date() 
					           + "   "+ book.get(bookLoc[i]).getISBN() + "   " + book.get(bookLoc[i]).getAuthor());
		    }
		    System.out.println();
        }
		if( journalLoc[0] != -1 ) {
    	    System.out.println("Journals:");
		    System.out.println("Title   ->   Publisher   ->   Date   ->   JID   ->   Volume   ->   Issue   ->   Articles/Authors");
		    for( i = 0; i < journalLoc.length - 1; ++i) {
			    System.out.println(journal.get(journalLoc[i]).getTitle() + "  " + journal.get(journalLoc[i]).getPublisher() + "   " + journal.get(journalLoc[i]).getPublication_date() + "   " + journal.get(journalLoc[i]).getJID()
			               + "   "+ journal.get(journalLoc[i]).getVolume() + "   " + journal.get(journalLoc[i]).getIssue() + "   " + journal.get(journalLoc[i]).getArticlesAuthors());
		    }
		    System.out.println();
        }
		if( audioLoc[0] != -1 ) {
		    System.out.println("Audio Tapes:");
		    System.out.println("Title   ->   Publisher   ->   Date   ->   Author");
		    for( i = 0; i < audioLoc.length - 1; ++i) {
			     System.out.println(audio.get(audioLoc[i]).getTitle() + "  " + audio.get(audioLoc[i]).getPublisher() + "   " + audio.get(audioLoc[i]).getPublication_date() 
			               + "   " + audio.get(audioLoc[i]).getAuthor());
		    }
		    System.out.println();
	    }
        if( videoLoc[0] != -1 ) {
    	    System.out.println("Video Tapes:");
		    System.out.println("Title   ->   Publisher   ->   Date   ->   Author");
		    for( i = 0; i < videoLoc.length - 1; ++i) {
			    System.out.println(video.get(videoLoc[i]).getTitle() + "  " + video.get(videoLoc[i]).getPublisher() + "   " + video.get(videoLoc[i]).getPublication_date() 
			               + "   " + video.get(videoLoc[i]).getAuthor());
  		    }
		    System.out.println();
	    }
        if( confLoc[0] != -1 ) {
    	    System.out.println("Conference Proceedings:");
		    System.out.println("Title   ->   Location   ->   Publisher   ->   Date   ->   Author");
		    for( i = 0; i < confLoc.length - 1; ++i) {
			    System.out.println(conf.get(confLoc[i]).getTitle() + "  " + conf.get(confLoc[i]).getLocation() + "   " + conf.get(confLoc[i]).getPublisher()
					           + "   " + conf.get(confLoc[i]).getDate() + "   " + conf.get(confLoc[i]).getAuthor());
		    }
		    System.out.println();
        }
	}

	/*
	 * verifyBook: Used to verify if a book exists and prints its info.
	 * returns: The book's index.
	 */
    public int verifyBook( Integer isbn ) {
    	int location = findLocale( 1, isbn );
    	
    	if( location == -1 ) {
    		return location;
    	}
    	
    	else {
    		System.out.println("Book:");
			System.out.println("Title   ->   Publisher   ->   Date   ->   ISBN   ->   Author");
			System.out.println(book.get(location).getTitle() + "  " + book.get(location).getPublisher() 
			    + "   " + book.get(location).getPublication_date() + "   "+ book.get(location).getISBN() + "   " + book.get(location).getAuthor());
			System.out.println();
			return location;
    	} 
    }
    
    /*
	 * verifyJournal: Used to verify if a journal exists and prints its info.
	 * returns: The journal's index.
	 */
    public int verifyJournal( Integer j_id ) {
    	
    	int location = findLocale( 2, j_id );
    	
    	if( location == -1 ) {
    		return location;
    	}
    	
    	else {
            System.out.println("Journal:");
			System.out.println("Title   ->   Publisher   ->   Date   ->   Volume   ->   Issue   ->   JID   ->   Articles & Authors");
			System.out.println(journal.get(location).getTitle() + "  " + journal.get(location).getPublisher() + "   " + journal.get(location).getPublication_date() 
		        + "   "+ journal.get(location).getVolume() + "   "+ journal.get(location).getIssue() + "   "+ journal.get(location).getJID() + "   " + journal.get(location).getArticlesAuthors());
			System.out.println();
			return location;
    	}
    }
    
    /*
     * findLocale: Finds the location of the type(Book or Journal) of document using its isbn/jid.
     * returns: The index of the document.
     */
    private int findLocale( int type, Integer id ) { //type = 1 Book, = 2 Journal
    	int location = -1;
    	
    	switch( type ) {
    	    case 1:
    	    	for( int i = 0; i < book.size(); ++i ) {
    	    		if( book.get(i).getISBN().equals(id) ) location = i;
    	    	}
    		    break;
    	    case 2:
    	    	for( int i = 0; i < journal.size(); ++i ) {
    	    		if( journal.get(i).getJID().equals(id) ) location = i;
    	    	}
    	    	break;
    	    default: System.out.println("type mismatch, findLocale in LibData.\n");
    	}
    	
    	return location;
    }

    /*
     * borrowBook: Uses user id and isbn to check if user can borrow a book and documents if loaned.
     */
	public void borrowBook( Integer user_id, Integer isbn ) {
		boolean limit = true;
		int locationU = verifyUser( user_id );
		int loaned = (user.get(locationU).getLoaned());
		String type = (user.get(locationU).getType());
		if( type.equals("Student") || type.equals("student")) {
			if( loaned >= 6 ) System.out.println("Student is at limit of six items loaned.");
			else limit = false;
		}
		else if( type.equals("Falculty") || type.equals("falculty") || type.equals("Librarian") || type.equals("librarian")) {
			if( loaned >= 12 ) System.out.println("Staff member is at limit of twelve items loaned.");
			else limit = false;
		}
		boolean available = false;
		int borrowed = 0, copies, locationD = -1;
		if( !limit ) {
			for( int i = 0; i < book.size(); ++i) {
				if ( book.get(i).getISBN().equals(isbn) ) locationD = i;
			}
			copies = (book.get(locationD).getCopies());
			borrowed = (book.get(locationD).getBorrowed());
			if( copies > borrowed ) available = true;
			else System.out.println("Book is not availabe, all copies are on loan.");
		}
		if( available && !limit ) {
			LoanedBooks temp = new LoanedBooks( user_id, user.get(locationU).getName(), type, book.get(locationD).getTitle(), book.get(locationD).getPublisher(), book.get(locationD).getPublication_date(), isbn, book.get(locationD).getAuthor() );
			loanedB.add(temp);
			book.get(locationD).setBorrowed( borrowed + 1 );
			user.get(locationU).setLoaned( loaned + 1 );
			System.out.println("Book succesfully loaned out.");
		}
    }
    
	/*
     * borrowJournal: Uses user id and jid to check if user can borrow a journal and documents if loaned.
     */
	public void borrowJournal( Integer user_id, Integer j_id ) {
		boolean limit = true;
		int locationU = verifyUser( user_id );
		int loaned = (user.get(locationU).getLoaned());
		String type = (user.get(locationU).getType());
		if( type.equals("Student") || type.equals("student")) {
			if( loaned >= 6 ) System.out.println("Student is at limit of six items loaned.");
			else limit = false;
		}
		else if( type.equals("Falculty") || type.equals("falculty") || type.equals("Librarian") || type.equals("librarian")) {
			if( loaned >= 12 ) System.out.println("Staff member is at limit of twelve items loaned.");
			else limit = false;
		}
		boolean available = false;
		int borrowed = 0, copies, locationD = -1;
		if( !limit ) {
			for( int i = 0; i < journal.size(); ++i) {
				if ( journal.get(i).getJID().equals(j_id) ) locationD = i;
			}
			copies = (journal.get(locationD).getCopies());
			borrowed = (journal.get(locationD).getBorrowed());
			if( copies > borrowed ) available = true;
			else System.out.println("Journal is not availabe, all copies are on loan.");
		}
		if( available && !limit ) {
			LoanedJournals temp = new LoanedJournals( user_id, user.get(locationU).getName(), type, 
					                                  journal.get(locationD).getTitle(), journal.get(locationD).getPublisher(), 
					                                  journal.get(locationD).getPublication_date(), j_id, journal.get(locationD).getArticlesAuthors(), 
					                                  journal.get(locationD).getVolume(), journal.get(locationD).getIssue() );
			loanedJ.add(temp);
			journal.get(locationD).setBorrowed( borrowed + 1 );
			user.get(locationU).setLoaned( loaned + 1 );
			System.out.println("Journal succesfully loaned out.");
		}
	}
    
	/*
	 * returnBook: Removes one instance of the book matching the isbn from the users loaned books.
	 */
    public void returnBook( Integer user_id, Integer isbn ) {
    	int p = 0, locationD = -1;
    	int locationU = verifyUser( user_id );
    	for( int i = 0; i < book.size(); ++i) {
			if ( book.get(i).getISBN().equals(isbn) ) locationD = i;
		}
		for( int i = 0; i < loanedB.size(); ++i )  {
    		if( (loanedB.get(i)).getISBN().equals(isbn) ) {
    			if( ((loanedB.get(i)).getName()).equals( user.get(locationU).getName() ) ) p = i;
    		}
		}
		loanedB.remove(p);
		int borrowed = (book.get(locationD).getBorrowed());
		int loaned = (user.get(locationU).getLoaned());
		book.get(locationD).setBorrowed( borrowed - 1 );
		user.get(locationU).setLoaned( loaned - 1 );
		System.out.println("Book succesfully returned.");
    }

    /*
	 * returnJournal: Removes one instance of the journal matching the jid from the users loaned journals.
	 */
    public void	returnJournal( Integer user_id, Integer j_id ) {
    	int p = 0, locationD = -1;
    	int locationU = verifyUser( user_id );
    	for( int i = 0; i < journal.size(); ++i) {
			if ( journal.get(i).getJID().equals(j_id) ) locationD = i;
		}
		for( int i = 0; i < loanedJ.size(); ++i )  {
    		if( (loanedJ.get(i)).getJID().equals(j_id) ) {
    			if( ((loanedJ.get(i)).getName()).equals( user.get(locationU).getName() ) ) p = i;
    		}
		}
		loanedJ.remove(p);
		int borrowed = (journal.get(locationD).getBorrowed());
		int loaned = (user.get(locationU).getLoaned());
		journal.get(locationD).setBorrowed( borrowed - 1 );
		user.get(locationU).setLoaned( loaned - 1 );
		System.out.println("Journal succesfully returned.");
    }
    
    /*
     * verifyUser: Finds user location if they exist.
     * returns: -1 if not found or the user's index in list.
     */
    public int verifyUser( Integer u_id ) {
    	int location = -1;
    	for( int i = 0; i < user.size(); ++i ) {
    		if( user.get(i).getUID().equals(u_id) ) location = i;
    	}
    	
    	return location;
    }
    
    /*
     * addUser: adds user to archive.
     */
    public void addUser( String name, String type, Integer u_id ) {
    	User temp = new User( u_id, name, type );
    	user.add(temp);
    }
    
    /*
     * removeUser: removes user from archive using its index.
     */
    public void removeUser( int location ) {
    	user.remove(location);
    }
    
    /*
     * listUsers: Prints a list of users in the archive.
     */
    public void listUsers() {
    	if( user.isEmpty() ) System.out.println("User list is empty.\n");
    	
    	else {
    		System.out.println("Users:");
			System.out.println("UID   ->   Name   ->   Type");
    		for( int i = 0; i < user.size(); ++i ) {
    			System.out.println(user.get(i).getUID() + "  " + user.get(i).getName() 
    			    + "   " + user.get(i).getType());
    		}
    		System.out.println();
    	}
    }
    
    /*
     * add****: Adds **** to the archive if it does not yet exist within.
     * special note: Books use isbn to check, Journals use title, issue and volume.
     *               The rest use all information as a complete object.
     *               This is because Books and Journals have "borrowed" entries within that are variable.
     */
	public void addBook( Integer isbn, String author, String publisher,
			             String title, String publication_date, Integer copies ) {
		for( int i = 0; i < book.size(); ++i) {
			if ( book.get(i).getISBN().equals(isbn) ) {
				System.out.println("This Book is already in archive.\n");
				return;
			}
		}
		
		Book temp = new Book( title, publisher, publication_date, isbn, copies, author);
		book.add(temp);
	}

	public void addJournal( Integer volume, Integer issue, String articles_authors, String publisher,
			                String title, String publication_date, Integer copies ) {
		
		for( int i = 0; i < journal.size(); ++i) {
			if ( journal.get(i).getTitle().equals(title) && journal.get(i).getIssue().equals(issue) && journal.get(i).getVolume().equals(volume) ) {
				System.out.println("This Journal is already in archive.\n");
				return;
			}
		}
		
		Journal temp = new Journal( next_jid, title, publisher, publication_date, volume, issue, articles_authors, copies );
		journal.add(temp);
		this.next_jid += 1;
	}

	public void addAudio( String author, String publisher, String title, String publication_date ) {

		AudioTape temp = new AudioTape( author, publication_date, publisher, title );
		
		if( audio.contains(temp) ) {
			System.out.println("This AudioTape is already in archive.\n");
			return;
		}
		
		audio.add(temp);
	}

	public void addVideo( String author, String publisher, String title, String publication_date ) {

		VideoTape temp = new VideoTape( author, publication_date, publisher, title );
		
		if( video.contains(temp) ) {
			System.out.println("This VideoTape is already in archive.\n");
			return;
		}
		
		video.add(temp);
	}

	public void addConf( String author, String publisher, String title, String publication_date, String location ) {

		ConfProc temp = new ConfProc( author, publication_date, location, publisher, title );
		
		if( conf.contains(temp) ) {
			System.out.println("This Conference Proceeding is already in archive.\n");
			return;
		}
		
		conf.add(temp);
	}
	
	/*
	 * loanedEmpty: Checks if there is anything on loan.
	 */
	public boolean loanedEmpty() {
		return( (loanedJ.isEmpty() && loanedB.isEmpty()) );
	}
    
	/*
	 * listBorrowed: Prints a list of all documents along with the user info of loaned instances.
	 *               loaned instances do not yet contain due dates.
	 */
    public void listBorrowed() {
    	
    	if( !(loanedB.isEmpty()) ) {
    		System.out.println("Loaned Books:");
        	System.out.println("Title   ->   Publisher   ->   Date   ->   ISBN   ->   Author   -> UserName   ->   ID   ->   Type");
        	for( int i = 0; i < loanedB.size(); ++i )  {
        		System.out.println(loanedB.get(i).getTitle() + "  " + loanedB.get(i).getPublisher() + "   " + loanedB.get(i).getPublication_date() 
				    + "   "+ loanedB.get(i).getISBN() + "   " + loanedB.get(i).getAuthor() + "   " + loanedB.get(i).getName() 
				    + "   " + loanedB.get(i).getUID() + "   " + loanedB.get(i).getType());
    	    }
        	System.out.println();
    	}
    	
    	if( !(loanedJ.isEmpty()) ) {
    		System.out.println("Loaned Journals:");
        	System.out.println("Title   ->   Publisher   ->   Date   ->   JID   ->   Articles & Authors   -> UserName   ->   ID   ->   Type");
        	for( int i = 0; i < loanedJ.size(); ++i )  {
        		System.out.println(loanedJ.get(i).getTitle() + "  " + loanedJ.get(i).getPublisher() + "   " + loanedJ.get(i).getPublication_date() 
				    + "   "+ loanedJ.get(i).getJID() + "   " + loanedJ.get(i).getArticlesAuthors() + "   " + loanedJ.get(i).getName() 
				    + "   " + loanedJ.get(i).getUID() + "   " + loanedJ.get(i).getType());
    	    }
        	System.out.println();
    	}
    }
}
