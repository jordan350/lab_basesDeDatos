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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class InventarioController implements Initializable {

    @FXML
    private TextField nombre;
    @FXML
    private TextField id;
    @FXML
    private TextField precio;
    @FXML
    private TableView<?> table;
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
    private void Guardar_Producto(ActionEvent event) {
    }

    @FXML
    private void Mostrar_Productos(ActionEvent event) {
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
