package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class GM_AcceuilController implements Initializable{
	
	@FXML
    private AnchorPane panhome;

    @FXML
    void aproposCliquer(MouseEvent event) throws IOException  {
    	AnchorPane pan  =FXMLLoader.load(getClass().getResource("apropos.fxml"));
	  	 panhome.getChildren().clear();
	  	 panhome.getChildren().add(pan);
    }

    @FXML
    void compteCliquer(MouseEvent event) throws IOException {
    	AnchorPane pan  =FXMLLoader.load(getClass().getResource("GM_Profil.fxml"));
	 	panhome.getChildren().clear();
	 	panhome.getChildren().add(pan);
    }

    @FXML
    void parametreCliquer(MouseEvent event) {

    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
