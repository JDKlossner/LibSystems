package Library;

import java.io.*;
import java.lang.ClassNotFoundException;

public class DataHandler {
	
	//Uses Serialization
    public LibData loadDataFromFile( String file_name ) {
    	try{
    		FileInputStream fin = new FileInputStream( file_name + ".ser" );
    	    ObjectInputStream reader = new ObjectInputStream( fin );
    	    LibData archive = new LibData();
    	    archive = (LibData) reader.readObject();
    	    reader.close();
    	    fin.close();
    	    return( archive );
    	    
    	}catch (IOException e ){
    		System.out.println( e + "\n\n" );
    	}catch (ClassNotFoundException q) {
    		System.out.println( q + "\n\n" );
    	}
    	return( new LibData() );
    }
    
    public void saveDataToFile( String file_name, LibData archive ) { //Serialize
    	try{
    		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file_name + ".ser"));
    		out.writeObject( archive );
    		out.close();

    		} catch (IOException e) {
    		}
    }
}
