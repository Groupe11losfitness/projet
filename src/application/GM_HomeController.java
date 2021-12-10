package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GM_HomeController implements Initializable{
     
	@FXML
    private AnchorPane panhome;

	@FXML
    private Button bnt_quitter;

	Stage stage;
    @FXML
    void Quitter(ActionEvent event) {
    	stage = (Stage) panhome.getScene().getWindow();
        stage.close();
    }

    @FXML
    void acceuilCliquer(MouseEvent event) throws IOException {
    	 AnchorPane pan  =FXMLLoader.load(getClass().getResource("GM_Acceuil.fxml"));
	  	 panhome.getChildren().clear();
	  	 panhome.getChildren().add(pan);
    }

    @FXML
    void archiveCliquer(MouseEvent event) {

    }

    @FXML
    void materielCliquer(MouseEvent event) throws IOException {
    	AnchorPane pan  =FXMLLoader.load(getClass().getResource("GM_list.fxml"));
	  	 panhome.getChildren().clear();
	  	 panhome.getChildren().add(pan);
    }

    @FXML
    void statistiqueCliquer(MouseEvent event) {

    }

    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

}
