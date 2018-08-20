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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class sucursalController implements Initializable {
    
    @FXML
    private Label label;
    
    sucursalController sc;
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
      
       Stage registro = new Stage();
       FXMLLoader loader = new FXMLLoader();
       AnchorPane root = (AnchorPane)loader.load(getClass().getResource("registro.fxml").openStream());
       Scene ac = new Scene(root);
       registro.setScene(ac);
       registro.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sc = this;
    }    
    
}
