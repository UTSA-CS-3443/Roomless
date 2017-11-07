package application.controller;

import application.model.Test;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TestController implements EventHandler <ActionEvent>{
	
	@FXML
	private Label output;
	private Test test;

	public TestController() {
		super();
		this.test = new Test ();
	}
	
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}
