package application.io;

import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;

/**
 * Class that sends the new user info from the test to a text file. 
 * 
 * @author nsimm
 *
 */
public class UserToFile {	
	
	/**
	 * The method that writes the new user info to the file. 
	 * 
	 * @param test
	 */
	public static void toFile(String userName, String email) {
		Formatter output = null;
		
		try { 
			output = new Formatter("NewUser.txt");
		} catch (SecurityException e) {
			System.err.println("Write permission denied.");
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println("File not found.");
			System.exit(1);
		}
		
		try {
			output.format("%s,%s", userName, email);
		} catch(FormatterClosedException e) {
			System.err.println("Error writing to file.");
		}
		
		if (output != null) {
			output.close( );
		}
	}
}
