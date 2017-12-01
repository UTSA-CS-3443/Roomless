package application.controller;

import application.Main;
import application.io.UserToFile;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

/**
 * Controls the creation of new accounts
 * @author Nick (saveNewAccount)
 * @author Derrick
 *
 */

public class NewAccountViewController implements EventHandler <ActionEvent>{
	@FXML
	private TextField userName;
	
	@FXML
	private TextField email;

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
			Parent root = FXMLLoader.load(getClass().getResource("../view/TestView.fxml"));
			Main.stage.setScene(new Scene (root, 700, 500));
			Main.stage.show();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
	/**
	 * Gets the user input from the textfield and sets it to strings for
	 * insertion into the file. 
	 */
	@FXML
	public void saveNewAccount( ) {
		// Save user input
		String name = userName.getText( );
		String mail = email.getText( );

		// Call the to file method to write to data.txt
		UserToFile.toFile(name, mail);
		
		// After the user input is saved go back to main login view.
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/StartupView.fxml"));
			Main.stage.setScene(new Scene (root, 700, 500));
			Main.stage.show();
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
