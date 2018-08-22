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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Labing
 */
public class Invent3Controller implements Initializable {

    @FXML
    private TextField nombre;
    @FXML
    private TextField id;
    @FXML
    private TextField precio;
    @FXML
    private TextField cantidad;
    @FXML
    private TableColumn<?, ?> nombre_tab;
    @FXML
    private TableColumn<?, ?> id_tab;
    @FXML
    private TableColumn<?, ?> precio_tab;
    @FXML
    private TableColumn<?, ?> cantidad_tab;
    @FXML
    private Button guardar;
    @FXML
    private Button mostrar;
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
    private void Guardar_producto(ActionEvent event) {
    }

    @FXML
    private void mostrar_productos(ActionEvent event) {
    }

    @FXML
    private void Volver(ActionEvent event) throws IOException {
     Stage stage = (Stage) salir.getScene().getWindow();
       stage.close();
       Stage suc = new Stage();
       FXMLLoader loader = new FXMLLoader();
       AnchorPane root = (AnchorPane)loader.load(getClass().getResource("inter2.fxml").openStream());
       Scene ac = new Scene(root);
       suc.setScene(ac);
       suc.show();
    }
    
}
