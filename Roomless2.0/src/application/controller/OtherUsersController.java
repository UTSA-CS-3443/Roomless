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
import application.io.*;
import application.test.UsersTest;

/**
 * View other users in the system To be immediately followed by the application:
 * test page and login page
 * 
 * @author stephanie
 * @author Elliott Soler (exitButtonAction)
 *
 */

public class OtherUsersController implements EventHandler<ActionEvent> {

	/**
	 * Go to the main screen
	 */

	@FXML
	public void viewMain() {
		try {
			Parent root3 = FXMLLoader.load(getClass().getResource("../view/MainView.fxml"));
			Main.stage.setScene(new Scene(root3, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Roomless"));
			Main.stage.setScene(new Scene(root, 700, 500));
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