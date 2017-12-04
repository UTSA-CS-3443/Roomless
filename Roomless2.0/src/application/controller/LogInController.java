package application.controller;

import application.model.Test;
import java.awt.Button;
import java.awt.TextField;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Controller for logging in
 * Purpose:
 * 		Check to see if user submitted correct username/PIN combo and then set their info as the current user
 * 		This should also be the startup screen
 * @author Derrick
 * 
 */

public class LogInController implements EventHandler <ActionEvent> {
	
	@FXML
	private TextField userName;			// get the username from Log In Page
	private PasswordField PIN; 			// get the PIN from Log In Page
	final Label label = new Label();
	Button button;						// button for any .setOnAction
	
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		// Not sure what goes here yet
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Roomless"));
			Main.stage.setScene (new Scene(root, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}
	
	/**
	 * User has clicked the log in button on the startup view
	 * 
	 * Takes input from username field and PIN field
	 * Compares these to the list of users in data.txt
	 * If successful log in, sends to main program
	 * If unsuccessful attempt, sends to a failure screen that has a return to StartupView button
	 * 
	 * @throws FileNotFoundException 
	 */
	public void attemptLogIn() throws FileNotFoundException {
		
		/**
		 * TODO:
		 * 	
		 */
		String name = userName.getText( );
		String Pin = PIN.getText( );
		ArrayList<String> possibleNames = new ArrayList<String>();
		ArrayList<String> possiblePINS = new ArrayList<String>();
		
		//read in data from file
		File file = new File("data.txt");
		Scanner scan = new Scanner( file );
		while(scan.hasNext()){
			String line = scan.nextLine();
			if(line.startsWith("*")) {//skips comments in the file
				continue;
			}
			String[] splitArr = line.split(",");
			if (splitArr.length > 2) {//If length is not at least 3, a PIN has not been assigned to this name 
									  //(should be at least name, PIN, and email) 
									  //(It is assumed there is always a name and email if there is a line, but PIN may be missing)
				possibleNames.add(splitArr[0]);
				possiblePINS.add(splitArr[1]);
			}
		}
		
		if(possibleNames.size() != possiblePINS.size()) {
			System.out.println("WARNING! Bad data found in data file: mismatching number of names/PINs");;
			System.exit(-1);
		}
		
		int position = 0;//Remembers which name we are on to match to its PIN
		boolean loggedIn = false;
		for(String s: possibleNames) {
			if(name.compareTo(s) == 0) {//match found
				if(Pin.compareTo(possiblePINS.get(position)) == 0) {
					//Successful login
					loggedIn = true;
				}
			}
			position++;
		}
		
		if(loggedIn) {
			viewMain();
			//TODO: needs to set a global variable of who is logged in
		}else{
			viewFailure();
		}
		
		scan.close();
	}
	
	/**
	 * Go to the failure screen
	 */
	
	@FXML
	public void viewFailure () {
		try {
			Parent root4 = FXMLLoader.load(getClass().getResource("../view/LoginFailedView.fxml"));
			Main.stage.setScene(new Scene (root4, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
	
	/**
	 * Go to the main screen
	 */
	
	@FXML
	public void viewMain () {
		try {
			Parent root3 = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
			Main.stage.setScene(new Scene (root3, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Go to the new account screen
	 */
	
	@FXML
	public void viewNewAccount () {
		try {
			Parent root5 = FXMLLoader.load(getClass().getResource("../view/NewAccountView.fxml"));
			Main.stage.setScene(new Scene (root5, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	
}
