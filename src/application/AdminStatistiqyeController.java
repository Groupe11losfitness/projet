package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class AdminStatistiqyeController implements Initializable {
	@FXML
    private BarChart barchar;

    @FXML
    private CategoryAxis xAcc;

    @FXML
    private NumberAxis yAcc;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		loadBarChar();
		
	}

	private void loadBarChar() {
		
		XYChart.Series xyEmploye =new  XYChart.Series();
		XYChart.Series xyClient =new  XYChart.Series();
		
		xyEmploye.setName("Les Employes");
		xyClient.setName("Les Clients");
		
	}

}
