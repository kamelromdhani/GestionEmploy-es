package gestionemployee;

 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControlPanel {
	
	

	@FXML
 private void viewEmployee(ActionEvent e) throws IOException  {
	 
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("ViewEmployees.fxml"));
		
		Scene scene = new Scene(root,1100,500);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	 
		primaryStage.setScene(scene);
		primaryStage.show();
                
 
 
 }
	@FXML
	public void insertEmployee(ActionEvent e) throws IOException  {
		 
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("InsertEmployees.fxml"));
		
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	 
		primaryStage.setScene(scene);
		primaryStage.show();
			 
			
		}
	@FXML
	public void updateDeleteEmployee(ActionEvent e) throws IOException  {
		 
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("UpdateDelete.fxml"));
		
		Scene scene = new Scene(root,1200,600);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	 
		primaryStage.setScene(scene);
		primaryStage.show();
			 
			
		}

}
