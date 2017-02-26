package checkersjfx;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.MyModelMain;
import view.DambordView;

/**
 * Deze klasse is de "echte" controller van ons spel en zal dus het spel "controlleren" tijdens het spelen
 * @author MusaAlpaslanErwin
 */
public class FXMLDocumentController {
    private MyModelMain myModelMain;
    private DambordView myView;
    private int xMuis1;
    private int yMuis1;
    private int xMuis2;
    private int yMuis2;
    
    @FXML
    private AnchorPane achtergrond;

    @FXML
    private Button resetButton;
    
    @FXML
    private Label labelScore;

    @FXML
    private Label labelRood;

    @FXML
    private Label labelWit;

    @FXML
    private TextField scoreRood;

    @FXML
    private TextField scoreWit;
    /**
     * wanneer ons spel word opgestart moeten we enkele dingen initialiseren
     */
    @FXML
    void initialise(){
        myView.setOnMousePressed(this::positieWaarnemen);
        myView.setOnMouseReleased(this::doelBevestigen);
        scoreRood.textProperty().bind(Bindings.createStringBinding(() -> ("" + myModelMain.getMyModelBord().getScoreRood()), myModelMain.getMyModelBord().scoreRood));
        scoreRood.setEditable(false);
        scoreRood.setMouseTransparent(true);
        scoreRood.setFocusTraversable(false);
        scoreWit.textProperty().bind(Bindings.createStringBinding(() -> ("" + myModelMain.getMyModelBord().getScoreRood()), myModelMain.getMyModelBord().scoreWit));
        scoreWit.setEditable(false);
        scoreWit.setMouseTransparent(true);
        scoreWit.setFocusTraversable(false);
    }
    /**
     * we moeten ons spel kunnen restarten
     * @param event is de klik op onze restart-button
     */
    @FXML
    void restart(ActionEvent event) {
        myView = null;
        achtergrond.getChildren().removeAll();
        setModel(myModelMain);
        myModelMain.getMyModelBord().restartScoreRood();
        myModelMain.getMyModelBord().restartScoreWit();
        myModelMain.getMyModelBord().restartBeurten();
    }
    /**
     * we moeten een model kunnen toewijzen aan onze controller
     * @param myModelMain is de model dat word gekoppeld aan onze controller
     */
    public void setModel(MyModelMain myModelMain) {
        this.myModelMain = myModelMain;
        myView = new DambordView(myModelMain);
        achtergrond.getChildren().add(myView);
        initialise();
        
    }
    /**
     * we moeten kunnen waarnemen waar de muisklikt natuurlijk
     * @param e is de muisklik
     */
    public void positieWaarnemen(MouseEvent e){
        xMuis1 = (int)(e.getX())/60;
        yMuis1 = (int)(e.getY())/60;
        
    }
    /**
     * we moeten kunnen waarnemen waar ons damstuk naartoe word gesleept
     * @param k is het loslaten van de muis
     */
    public void doelBevestigen(MouseEvent k){
        xMuis2 = (int)(k.getX())/60;
        yMuis2 = (int)(k.getY())/60;
        myView.updateLocaties(xMuis1, yMuis1, xMuis2, yMuis2);
    }

}