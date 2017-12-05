package application.view;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

public class GetUsersInformation {
	
	@FXML
	private TextField temp;
	@FXML
	private TextField age;
	@FXML
	private TextField clean;
	@FXML
	private TextField social;
	@FXML
	private TextField mates;
	@FXML
	private TextField rent;
	
	@FXML
	private void handleButton1Action() {
	    
	    BufferedWriter writer = null;
	    try {
	        writer = new BufferedWriter(new FileWriter("./NewUser.txt"));
	        writer.write(temp.getText());
	        writer.write(age.getText());
	        writer.write(clean.getText());
	        writer.write(social.getText());
	        writer.write(mates.getText());
	        writer.write(rent.getText());
	    } catch (IOException e) {
	        System.err.println(e);
	    } finally {
	        if (writer != null) {
	            try {
	                writer.close();
	            } catch (IOException e) {
	                System.err.println(e);
	            }
	        }
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
	
}