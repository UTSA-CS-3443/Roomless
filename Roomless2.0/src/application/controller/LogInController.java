package application.controller;

import application.model.Test;
import java.awt.Button;
import java.awt.TextField;
import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Slider;
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
	private TextField Username;			// get the username from Log In Page
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
	 */
	public void attemptLogIn() {
		
		viewMain();//Currently the log in button redirects to the MainView.fmxl
		
		/**
		 * TODO:
		 * 	Take input from username field and PIN field
		 * 	Compare these to the list of users in data.txt
		 * 	If successful log in, send to main program
		 * 	If unsuccessful attempt, send to a failure screen that has a return to StartupView button
		 */
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
