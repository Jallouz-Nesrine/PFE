/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Nesrine
 */
public class LOGINController implements Initializable {

    @FXML
    private JFXButton btnSECONNECTER;
    @FXML
    private ImageView imageView;
    @FXML
    private JFXPasswordField txtMdp;
    @FXML
    private Hyperlink hyperlinkMdpOub;
    @FXML
    private JFXButton close;
    @FXML
    private JFXTextField txtEmailNum;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void SECONNECTER(ActionEvent event) {
    }

    @FXML
    private void MdpOublie(ActionEvent event) {
    }

    @FXML
    private void Close(MouseEvent event) {
    }

    @FXML
    private void Close(ActionEvent event) {
    }

    @FXML
    private void close(MouseEvent event) {
        System.exit(0);
    }

    
    
}
