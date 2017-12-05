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
import javafx.scene.control.Slider;
import javafx.stage.Stage;
import javafx.scene.Scene;


/**
 * Controller for the test we will give the user
 * Purpose:
 * 		Get information from the user
 * @author stephanie
 *
 */
public class TestController implements EventHandler <ActionEvent>{
	
	@FXML
	private TextField Input;			// get the full name of the user from "Test"
	final Label label = new Label();
	Button button;						// button for any .setOnAction
	
	@Override
	public void handle(ActionEvent e) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Roomless"));
			Main.stage.setScene (new Scene(root, 700, 500));
			Main.stage.show();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
		
	}
	
	
	/**
	 * Go the view users screen
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
	 * @author Elliott Soler
	 * exitButtonAction closes the application completely when "exit" is clicked
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