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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class CajaController implements Initializable {

    @FXML
    private TextField id;
    @FXML
    private TextField nombre;
    @FXML
    private TextField id_cliente;
    @FXML
    private TextField dinero;
    @FXML
    private Button carro;
    @FXML
    private TableView<?> table;
    @FXML
    private Label total;
    @FXML
    private Button registrar;
    @FXML
    private Button cancelar;
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
    private void Mostrar_Carro(ActionEvent event) {
    }

    @FXML
    private void Registrar_Venta(ActionEvent event) throws IOException {
    Stage stage = (Stage) registrar.getScene().getWindow();
        stage.close();
        Stage dc = new Stage();
        FXMLLoader loader = new FXMLLoader();
        AnchorPane root = (AnchorPane) loader.load(getClass().getResource("fact.fxml").openStream());
        Scene ac = new Scene(root);
        dc.setScene(ac);
        dc.show();

    }

    @FXML
    private void Cancelar_Venta(ActionEvent event) {
    }

    @FXML
    private void Volver(ActionEvent event) throws IOException {
     Stage stage = (Stage) salir.getScene().getWindow();
       stage.close();
       Stage suc = new Stage();
       FXMLLoader loader = new FXMLLoader();
       AnchorPane root = (AnchorPane)loader.load(getClass().getResource("sucursal.fxml").openStream());
       Scene ac = new Scene(root);
       suc.setScene(ac);
       suc.show();
    }
    
}
