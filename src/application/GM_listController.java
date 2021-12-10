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

public class GM_listController implements Initializable{
    
	
	  @FXML
	    private Button btn_annuler;

	    @FXML
	    void Annuler(ActionEvent event) throws IOException {
	    	  Stage employe=new Stage();
	    	   Parent root = FXMLLoader.load(getClass().getResource("Ajouter-m.fxml"));
	    	   Scene scene = new Scene(root);  
	    	   employe.setScene(scene);
	    	   employe.show();
	    	   employe.setResizable(false); 
	    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
