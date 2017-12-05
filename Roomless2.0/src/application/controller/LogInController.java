package application.controller;

import application.model.Test;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Controller for logging in
 * Purpose:
 * 		Check to see if user submitted correct username/PIN combo and then set their info as the current user
 * 		This should also be the startup screen
 * @author Derrick
 * @author Elliott Soler (exitButtonAction)
 * 
 */

public class LogInController implements EventHandler <ActionEvent> {
	
	@FXML
	private TextField UserName1;		// get the username from Log In Page
	
	@FXML
	private PasswordField PIN; 			// get the PIN from Log In Page
	
	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
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
	 * @throws FileNotFoundException 
	 */
	@FXML
	public void attemptLogIn() throws FileNotFoundException {
		
		String name = UserName1.getText( );
		String Pin = PIN.getText( );
		
		if(readAndComp(name, Pin)) {
			viewMain();
		}else{
			viewFailure();
		}
		
	}
	
	/**
	 * Takes input from username field and PIN field
	 * Compares these to the list of users in data.txt
	 * If successful log in, sends to main program
	 * If unsuccessful attempt, sends to a failure screen that has a return to StartupView button
	 * 
	 * @throws FileNotFoundException 
	 * @return Returns whether or not the user given information was a correct log in
	 */
	public boolean readAndComp(String name, String Pin) throws FileNotFoundException {
		
		ArrayList<String> possibleNames = new ArrayList<String>();
		ArrayList<String> possiblePINS = new ArrayList<String>();
		
		//read in data from file
		File file = new File("newUser.txt");
		Scanner scan = new Scanner( file );
		while(scan.hasNext()){
			String line = scan.nextLine();
			if(line.startsWith("*")) {//skips comments in the file
				continue;
			}
			
			String[] splitArr = line.split(",");
			possibleNames.add(splitArr[0]);
			possiblePINS.add(splitArr[1]);
		}
		
		if(possibleNames.size() != possiblePINS.size()) {
			System.out.println("WARNING! Bad data found in data file: mismatching number of names/PINs");;
			System.exit(-1);
		}
		
		int position = 0;//Remembers which name we are on to match to its PIN
		boolean loggedIn = false;
		
		for(String s: possibleNames) {
			if(name .compareTo(s) == 0) {//match found
				if(Pin.compareTo(possiblePINS.get(position)) == 0) {
					//Successful login
					loggedIn = true;
				}
			}
			position++;
		}
		
		
		
		scan.close();
		return loggedIn;
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
	
	/**
	 * closes the application completely when "exit" is clicked
	 */
	@FXML public javafx.scene.control.Button exitButton;
	
	@FXML
	public void exitButtonAction() {
		try {
			Main.stage = (Stage) exitButton.getScene().getWindow();
			Main.stage.close();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
}
