package fr.caratcode.mindmap.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;

public class MainController implements Initializable {

	@FXML
	private BorderPane borderPane;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	void draw(MouseEvent event) {

		System.out.println("OK");
		borderPane.getChildren().add(new Rectangle(10,10,10,10));
		
	}

}
