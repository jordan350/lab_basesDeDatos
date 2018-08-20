/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class CumplimientoMetaController implements Initializable {

    @FXML
    private TableView<?> Tproducto;
    @FXML
    private TableColumn<?, ?> Cprodcutoproducto;
    @FXML
    private TableColumn<?, ?> Cventasproducto;
    @FXML
    private TableColumn<?, ?> Cporcentajeproducto;
    @FXML
    private Button actualizarproducto;
    @FXML
    private Button Bgraficarproduco;
    @FXML
    private PieChart Graficaproducto;
    @FXML
    private TableView<?> Tvendedor;
    @FXML
    private TableColumn<?, ?> Cvendedor;
    @FXML
    private TableColumn<?, ?> Ctotalventas;
    @FXML
    private TableColumn<?, ?> Cporcentajevendedor;
    @FXML
    private Button Bactualizarvendedor;
    @FXML
    private Button Bgraficarvendedor;
    @FXML
    private StackedBarChart<?, ?> Graficavendedor;
    @FXML
    private TableView<?> Tevolucion;
    @FXML
    private TableColumn<?, ?> Cmes;
    @FXML
    private TableColumn<?, ?> Cventasevolucion;
    @FXML
    private Button actualizarevolucion;
    @FXML
    private Button Bgraficarevolucion;
    @FXML
    private LineChart<?, ?> Graficoevolucion;
    @FXML
    private TableView<?> Tmetas;
    @FXML
    private TableColumn<?, ?> Cprodcutometas;
    @FXML
    private TableColumn<?, ?> Cventasmetas;
    @FXML
    private TableColumn<?, ?> Cporcentajemetas;
    @FXML
    private TableColumn<?, ?> Ccolormetas;
    @FXML
    private Button Bactualizarmetas;
    @FXML
    private Button Bgraficarmetas;
    @FXML
    private AreaChart<?, ?> Graficometas;
    @FXML
    private Label LBrol;
    @FXML
    private Label LBusuario;
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
    private void Actualizar_tabla_VP(ActionEvent event) {
    }

    @FXML
    private void graficar_tabla_VP(ActionEvent event) {
    }

    @FXML
    private void Actualizar_tabla_VV(ActionEvent event) {
    }

    @FXML
    private void graficar_tabla_VV(ActionEvent event) {
    }

    @FXML
    private void Actualizar_tabla_EV(ActionEvent event) {
    }

    @FXML
    private void graficar_tabla_EV(ActionEvent event) {
    }

    @FXML
    private void Actualizar_tabla_CM(ActionEvent event) {
    }

    @FXML
    private void graficar_tabla_CM(ActionEvent event) {
    }

    @FXML
    private void Salir_int(ActionEvent event) throws IOException {
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
