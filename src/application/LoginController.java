package application;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

public class LoginController implements Initializable{

    @FXML
    private Button clixk;

   @FXML
   public void onclick(ActionEvent event) throws IOException {
   Stage signup=new Stage();
   Parent root = FXMLLoader.load(getClass().getResource("AdminHome.fxml"));
   Scene scene = new Scene(root);  
   signup.setScene(scene);
   signup.show();
   signup.setResizable(false); 

    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
 
}
