package Library;

import java.util.*;

public abstract class ConsoleWindow{
    protected static LibrarySystem lib = new LibrarySystem();;
    protected static Scanner in = new Scanner(System.in);
    protected static MainMenuConsole menu = new MainMenuConsole();

    protected abstract void printMenu();
    
    public static void main( String[] args ) {
    	System.out.println("Welcome to my LibrarySystem.\n");
    	menu.start( lib );
    	lib.save();
    	System.out.println("Exiting LibrarySystem.\n");
    }
}
