package application.controller;

import application.model.Test;

import java.awt.TextField;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.Scene;

/**
 * Controller for the test we will give the user
 * Purpose:
 * 		Get information from the user to store in the .txt file
 * @author stephanie
 *
 */
public class TestController implements EventHandler <ActionEvent>{
	
	@FXML
	private TextField getName;	// get the full name of the user from "Test"
	private Label output;		
	private Test test;
	
	final Label label = new Label();
	
	@Override
	public void handle(ActionEvent e) {
		/** TODO:
		 * 		1. Launch the application & determine if the user has 
		 * 		   an existing account or if they will make a new one
		 * 			NEW USER:
		 * 				2. Get name from user
		 * 				3. Generate a pin for the user to log in
		 * 				4. Take them to the test, get information from user
		 * 				5. Let them view other profiles
		 * 			EXISTING USER:
		 * 				2. Have user log in with pin
		 * 				3. Let them view other profiles in the system
		 * 		4 (or 6). Logout and close the application
		 */
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Roomless")); // change to start up once created
			Main.stage.setScene (new Scene(root, 700, 650));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
	}
	
	/**
	 * Save the information from the user on the TEST part of the application
	 * @param event
	 */
	public void handleSave (ActionEvent event) {
		System.out.println(getName.getText());
	}

}
