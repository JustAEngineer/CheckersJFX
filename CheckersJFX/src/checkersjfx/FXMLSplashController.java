/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkersjfx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.MyModelBord;
import model.MyModelMain;
import model.MyModelStuk;
import model.MyModelTegel;

/**
 * Dit is de controller voor de splashscreen deze word enkel gebruikt bij het opstarten van de applicatie
 * @author  MusaAlpaslanErwinAydogan en ArifBirinci
 * ideeen voor de splashscreen gevonden op https://www.youtube.com/channel/UCCXbhmjID-T2I0KfuDPbi6A
 */
public class FXMLSplashController implements Initializable {

    @FXML
    private AnchorPane splashPane;
    @FXML
    private ImageView splashImage;
    @FXML
    private Label splashLabel;

    /**
     * Initialisren van onze splashscreen
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        new SplashScreen().start();
    }    
    /**
     * weergeven van onze splashscreen en achteraf de echte controller en view starten
     */
    class SplashScreen extends Thread {
        @Override
        public void run(){
            try {
                Thread.sleep(5000);
                
                Platform.runLater(new Runnable() {
                    @Override
                    public void run(){
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FXMLDocument.fxml"));
                    Parent root = null;
                        try {
                            root = loader.load();
                        } catch (IOException ex) {
                            Logger.getLogger(FXMLSplashController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setResizable(false);
                    stage.setTitle("CheckersJFX");
                    MyModelStuk myModelStuk = new MyModelStuk();
                    MyModelBord myModelBord = new MyModelBord();
                    MyModelTegel myModelTegel = new MyModelTegel();
                    MyModelMain myModelMain = new MyModelMain(myModelBord, myModelStuk, myModelTegel);
                    FXMLDocumentController controller = loader.getController();
                    controller.setModel(myModelMain);
                    splashPane.getScene().getWindow().hide();
                    stage.show();

                    }        
                });
            } catch (InterruptedException ex) {
            Logger.getLogger(FXMLSplashController.class.getName()).log(Level.SEVERE, null, ex);           
            }
        }
    }
}
