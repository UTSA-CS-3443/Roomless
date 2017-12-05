package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Controls the view for unsuccessful login attempts
 * @author Derrick
 * @author Elliott Soler (exitButtonAction)
 *
 */

public class LogInFailedController implements EventHandler <ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
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
	 * Returns to StartupView
	 */
	@FXML
	public void retry() {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/StartupView.fxml"));
			Main.stage.setScene(new Scene (root, 700, 500));
			Main.stage.show();
		} catch(Exception exception) {
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