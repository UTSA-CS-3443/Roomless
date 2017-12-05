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
 * Controller for the screen after sucessful log in
 * Links to several other views via buttons
 * Controls logging out via logout button on this view
 * 
 * @author Derrick
 *
 */

public class MainViewController implements EventHandler <ActionEvent> {
	
	@FXML
	private Label loggedInUser;//should be changed when user logs in

	@Override
	public void handle(ActionEvent arg0) {
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
	 * Logs out and returns to StartupView
	 */
	@FXML
	public void logout() {
		//setUser("Default");
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/StartupView.fxml"));
			Main.stage.setScene(new Scene (root, 700, 500));
			Main.stage.show();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * For changing who is logged in
	 * @param newUser
	 */
	/*
	public void setUser(String newUser) {
		loggedInUser.textProperty().set(newUser);
	} */
	
	/**
	 * Goes to the TestView
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
	
	/**
	 * Goes to the OthersView 
	 */
	@FXML
	public void viewOthers () {
		try {
			Parent root1 = FXMLLoader.load(getClass().getResource("../view/OthersView.fxml"));
			Main.stage.setScene(new Scene (root1, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

}
