package fr.caratcode.mindmap.main;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    
	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
    	
    	BorderPane root;
		try {
			root = FXMLLoader.load(getClass().getResource("/main.fxml"));
			stage.setTitle("Carte mentale");
//			stage.setScene(new Scene(root));
			stage.setScene(new Scene(root, 300, 250));
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
        //root.getChildren().add(shape);
//        root.getChildren().add(btn);
    }


}
