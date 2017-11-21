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
		
		viewTest();//Currently the log in button redirects to the TestView.fmxl
		
		/**
		 * TODO:
		 * 	Take input from username field and PIN field
		 * 	Compare these to the list of users
		 * 	If sucessful log in, send to main program
		 * 	If unsucessful attempt, send to a failure screen that has a return to StartupView button
		 * 	
		 */
	}
	
	/**
	 * Go to the view test screen
	 * This should probably be removed later
	 */
	
	@FXML
	public void viewTest () {
		try {
			Parent root2 = FXMLLoader.load(getClass().getResource("../view/TestView.fxml"));
			Main.stage.setScene(new Scene (root2, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
