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
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class CajaController implements Initializable {

     @FXML private TextField id;
     @FXML private TextField nombre;
     @FXML private TextField id_cliente;
     @FXML private TextField dinero;
     
     @FXML private Button carro;
     
     @FXML private TableView table;
     
     @FXML private Label total;
     
     @FXML private Button registrar;
     @FXML private Button cancelar;
    
      @FXML
   private void Mostrar_Carro(ActionEvent event){
   //recordar que al mostrar el carro, se ponga el total sobre el albel "total", para mostrar en pantalla
   }
     @FXML
   private void Registrar_Venta(ActionEvent event){
   
   }
     @FXML
   private void Cancelar_Venta(ActionEvent event){
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
