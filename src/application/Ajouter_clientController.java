package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ajouter_clientController  implements Initializable {
	
	@FXML
    private Button btn_annuler;

    @FXML
    private AnchorPane pan;
    
    Stage stage;
    @FXML
    void Annuler(ActionEvent event) {
    	stage = (Stage) pan.getScene().getWindow();
	    stage.close();
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
