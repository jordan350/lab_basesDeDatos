/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucursal;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class InventarioController implements Initializable {

    
    @FXML private TextField nombre;
    @FXML private TextField id;
    @FXML private TextField dinero;
    
    @FXML private TableColumn<?, ?> table;
    
    @FXML private Button guardar;
    @FXML private Button mostrar;
    @FXML private Button salir;
    
   @FXML
   private void Guardar_Producto(ActionEvent event){
   }
   @FXML
   private void Mostrar_Productos(ActionEvent event){
   
   }
   @FXML
   private void Salir_interfaz(ActionEvent event){
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
