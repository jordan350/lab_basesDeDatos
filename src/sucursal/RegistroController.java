package sucursal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class RegistroController implements Initializable {

   @FXML private TextField nombre;
   @FXML private TextField apellido;
   @FXML private TextField id;
   @FXML private TextField usuario;
   @FXML private TextField clave;
   
   @FXML private CheckBox vendedor;
   @FXML private CheckBox administrador;
   
   @FXML private Button guardar;
   
   @FXML
   private void handleButtonAction(ActionEvent event){
   
       String Nombre = nombre.getText();
       String Apellido = nombre.getText();
       String Usuario = nombre.getText();
       String Clave = nombre.getText();
       int Id = Integer.parseInt(id.getText());
       
       if (vendedor.isDisable()) {
           administrador.isDisabled();
       }else{
           vendedor.isDisabled();
           administrador.isDisable();
       }
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
