package application.io;

import java.io.*;
import java.util.Formatter;
import java.util.FormatterClosedException;
import application.GeneratePin;

/**
 * Class that sends the new user info from the test to a text file. 
 * 
 * @author nsimm
 * @author Christopher
 */
public class UserToFile {	
	
	/**
	 * The method that writes the new user info to the file. 
	 * 
	 * @param test
	 */
	public static void toFile(String userName, String pin, String email) {
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
			output.format("%s,%s,%s", userName, pin, email);
		} catch(FormatterClosedException e) {
			System.err.println("Error writing to file.");
		}
		
		if (output != null) {
			output.close( );
		}
	}
}
