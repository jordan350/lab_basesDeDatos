package sucursal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class sucursalController implements Initializable {
    
    @FXML private TextField usuario;
    @FXML private PasswordField clave;
    
    @FXML private Button entrar;
    @FXML private Button salir;
    
    sucursalController sc;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
      
       Stage registro = new Stage();
       FXMLLoader loader = new FXMLLoader();
       AnchorPane root = (AnchorPane)loader.load(getClass().getResource("invent2.fxml").openStream());
       Scene ac = new Scene(root);
       registro.setScene(ac);
       registro.show();
    }
    @FXML
    private void Salir_api(ActionEvent event){
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sc = this;
    }    
    
}
