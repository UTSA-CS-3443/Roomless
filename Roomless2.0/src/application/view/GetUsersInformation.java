package application.view;

import javafx.scene.control.TextField;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javafx.fxml.FXML;

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
}