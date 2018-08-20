/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class ReportController implements Initializable {

    @FXML
    private TableView<?> table_VP;
    @FXML
    private Button actualizar_VP;
    @FXML
    private Button graficar_VP;
    @FXML
    private PieChart grafica_VP;
    @FXML
    private TableView<?> table_VV;
    @FXML
    private Button actualizar_VV;
    @FXML
    private Button graficar_VV;
    @FXML
    private StackedBarChart<?, ?> grafica_VV;
    @FXML
    private TableView<?> table_EV;
    @FXML
    private Button actualizar_EV;
    @FXML
    private Button graficar_EV;
    @FXML
    private StackedBarChart<?, ?> grafica_EV;
    @FXML
    private TableView<?> table_CM_1;
    @FXML
    private Button actualizar_CM;
    @FXML
    private Button graficar_CM;
    @FXML
    private TableView<?> table_CM_2;
    @FXML
    private StackedBarChart<?, ?> grafica_CM;
    @FXML
    private Button salir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Act_VP(ActionEvent event) {
    }

    @FXML
    private void Graf_VP(ActionEvent event) {
    }

    @FXML
    private void Act_VV(ActionEvent event) {
    }

    @FXML
    private void Graf_VV(ActionEvent event) {
    }

    @FXML
    private void Act_EV(ActionEvent event) {
    }

    @FXML
    private void Graf_EV(ActionEvent event) {
    }

    @FXML
    private void Act_CM(ActionEvent event) {
    }

    @FXML
    private void Graf_CM(ActionEvent event) {
    }

    @FXML
    private void Volver(ActionEvent event) throws IOException {
       Stage stage = (Stage) salir.getScene().getWindow();
       stage.close();
       Stage inter = new Stage();
       FXMLLoader loader = new FXMLLoader();
       AnchorPane root = (AnchorPane)loader.load(getClass().getResource("inter2.fxml").openStream());
       Scene ac = new Scene(root);
       inter.setScene(ac);
       inter.show();
    
    }
    
}
