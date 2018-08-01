package gestionemployee;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class login {

	
	
	@FXML
	TextField username;
	@FXML
	TextField password;
	@FXML
	Label check;
	


	

@FXML
private void enterCP(ActionEvent e) throws IOException{
	 
try{
//if (username.getText().equals("admin")  && password.getText().equals("123"))    {
	

	Stage primaryStage = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("ControlPanel.fxml"));
		
	Scene scene = new Scene(root,700,500);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	 
	primaryStage.setScene(scene);
	primaryStage.show();
	 
		
/*	}
else
	check.setText("password or username is false");*/
}
catch(IOException m){
    
}
	
	
	
	

}
			 
		 
		
	}











	
	

