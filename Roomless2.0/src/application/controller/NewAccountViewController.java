package application.controller;

import application.Main;
import application.io.UserToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import application.GeneratePin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controls the creation of new accounts
 * @author Nick (saveNewAccount)
 * @author Derrick
 * @author Christopher Nieland
 * @author Elliott Soler (exitButtonAction0
 *
 */

public class NewAccountViewController implements EventHandler <ActionEvent>{
	
	GeneratePin genPin = new GeneratePin();
	
	@FXML
	private TextField userName;
	
	@FXML
	private TextField email;
	
	private String pin = genPin.genPin();
	
	
	@Override
	public void handle(ActionEvent event) {
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
	 * insertion into the file. Also gets the pin that is generated and 
	 * adds it to the file
	 */
	@FXML
	public void saveNewAccount( ) {
		// Save user input
		String name = userName.getText( );
		String mail = email.getText( );

		// Call the to file method to write to data.txt
		UserToFile.toFile(name, pin, mail);
		
		// View the test after the info is saved
		viewTest( );
	}
	
	/**
	 * Views the test and allows the user to take it. 
	 */
	@FXML
	public void viewTest( ) {
		try {
			Parent root2 = FXMLLoader.load(getClass().getResource("../view/TestView.fxml"));
			Main.stage.setScene(new Scene (root2, 700, 500));
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
