/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import static java.lang.Math.abs;
import model.*;
import javafx.scene.Group;
import javafx.scene.layout.StackPane;

/**
 * Deze klasse gaat door gebruik te maken van de DamStukkenView en TegelView het gehele spel effectief tekenen en achteraf ook "hertekenen"
 * @author MusaAlpaslanErwinAydogan en ArifBirinci
 * de for-los en de if statements zijn geinspireerd door het voorbeeld op https://github.com/AlmasB/FXTutorials/blob/master/src/com/almasb/checkers/CheckersApp.java
 */
public class DambordView extends StackPane{

    public TegelView[][] bordcoordinaten;
    private final Group tegelsGroep = new Group();
    private final Group stukkenGroep = new Group();
    private final MyModelMain myModelMain;
    /**
     * constructor voor de objecten van de klasse DambordView 
     * @param myModelMain is de model noodzakelijk voor de vieuw van ons dambord
    */
    public DambordView(MyModelMain myModelMain) {
        this.myModelMain = myModelMain;
        this.bordcoordinaten = new TegelView[myModelMain.getMyModelBord().getAantalTegelsX()][myModelMain.getMyModelBord().getAantalTegelsY()];
        getChildren().addAll(tegelsGroep, stukkenGroep);
            
        for (int y = 0; y < (myModelMain.getMyModelBord().getAantalTegelsX()); y++) {
            for (int x = 0; x < (myModelMain.getMyModelBord().getAantalTegelsY()); x++) {   
            myModelMain.getMyModelTegel().setX(x);
            myModelMain.getMyModelTegel().setY(y);
            TegelView tegel = new TegelView(myModelMain.getMyModelTegel());
            bordcoordinaten[x][y] = tegel;
            tegelsGroep.getChildren().add(tegel);
                
            DamStukkenView damStuk = null;
                
            if (y <= 2 && (x + y) % 2 != 0) {
                myModelMain.getMyModelStuk().setPlaatsStukX(x);
                myModelMain.getMyModelStuk().setPlaatsStukY(y);
                damStuk = new DamStukkenView(myModelMain);
            }
            if (y >= 7 && (x + y) % 2 != 0) {
                myModelMain.getMyModelStuk().setPlaatsStukX(x);
                myModelMain.getMyModelStuk().setPlaatsStukY(y);
                damStuk = new DamStukkenView(myModelMain);
            }
            if (damStuk != null){
                tegel.setDamStuk(damStuk);
                stukkenGroep.getChildren().add(damStuk);
            }        
        }   
    }
}
        
    /**
     * deze methode gaat adhv if en else statements de view manipuleren door de coordinaten van de damstukken aan te passen door gebruik van de setRelocate-methode binnen DamStukkenView
     * @param xOud initiele x-coordinaten van ons damstuk
     * @param yOud initiele y-coordinaten van ons damstuk
     * @param xNieuw nieuwe x-coordinaten van ons damstuk
     * @param yNieuw nieuwe y-coordinaten van ons damstuk
     */
    public void updateLocaties(int xOud, int yOud, int xNieuw, int yNieuw){
        TegelView oudTegel = bordcoordinaten[xOud][yOud];
        TegelView nieuwTegel = bordcoordinaten[xNieuw][yNieuw];
        DamStukkenView damstk = oudTegel.getDamStuk();
        if (oudTegel.hasDamStuk()){
            if((abs(xNieuw - xOud) == 1)){
                if((damstk.getFill() == myModelMain.getMyModelStuk().getColorPlayer()) && ((-1) == (yNieuw - yOud)) && (myModelMain.getMyModelBord().getAantalBeurten() % 2 == 0)){
                    oudTegel.setDamStuk(null);
                    stukkenGroep.getChildren().remove(damstk);
                    damstk.setRelocate(xNieuw, yNieuw);
                    nieuwTegel.setDamStuk(damstk);
                    damstk.myModelMain.getMyModelStuk().setPlaatsStukX(xNieuw);
                    damstk.myModelMain.getMyModelStuk().setPlaatsStukY(yNieuw);
                    stukkenGroep.getChildren().add(damstk);
                    myModelMain.getMyModelBord().verhoogAantalBeurten();
                }
                else if((damstk.getFill() == myModelMain.getMyModelStuk().getColorAI()) && ((1) == (yNieuw - yOud) && (myModelMain.getMyModelBord().getAantalBeurten() % 2 != 0))){
                    oudTegel.setDamStuk(null);
                    stukkenGroep.getChildren().remove(damstk);
                    damstk.setRelocate(xNieuw, yNieuw);
                    nieuwTegel.setDamStuk(damstk);
                    damstk.myModelMain.getMyModelStuk().setPlaatsStukX(xNieuw);
                    damstk.myModelMain.getMyModelStuk().setPlaatsStukY(yNieuw);
                    stukkenGroep.getChildren().add(damstk);
                    myModelMain.getMyModelBord().verhoogAantalBeurten();
                }
            }
            if (Math.abs(xNieuw - xOud) == 2) {
            int x1 = xOud + (xNieuw - xOud) / 2;
            int y1 = yOud + (yNieuw - yOud) / 2;
                if((damstk.getFill() == myModelMain.getMyModelStuk().getColorPlayer()) && ((-2) == (yNieuw - yOud)) && (myModelMain.getMyModelBord().getAantalBeurten() % 2 == 0)){
                        
                    if (bordcoordinaten[x1][y1].hasDamStuk() && bordcoordinaten[x1][y1].getDamStuk().getFill() != myModelMain.getMyModelStuk().getColorPlayer()) {
                        DamStukkenView verslagenStuk = bordcoordinaten[x1][y1].getDamStuk();
                        oudTegel.setDamStuk(null);
                        stukkenGroep.getChildren().remove(damstk);
                        bordcoordinaten[x1][y1].setDamStuk(null);
                        stukkenGroep.getChildren().remove(verslagenStuk);
                        myModelMain.getMyModelBord().verhoogScoreRood();
                        myModelMain.getMyModelBord().verhoogAantalBeurten();
                        damstk.setRelocate(xNieuw, yNieuw);
                        nieuwTegel.setDamStuk(damstk);
                        damstk.myModelMain.getMyModelStuk().setPlaatsStukX(xNieuw);
                        damstk.myModelMain.getMyModelStuk().setPlaatsStukY(yNieuw);
                        stukkenGroep.getChildren().add(damstk);
                        
                    }
                }
                else if((damstk.getFill() == myModelMain.getMyModelStuk().getColorAI()) && ((2) == (yNieuw - yOud)) && (myModelMain.getMyModelBord().getAantalBeurten() % 2 != 0)){
                    
                    if (bordcoordinaten[x1][y1].hasDamStuk() && bordcoordinaten[x1][y1].getDamStuk().getFill() != myModelMain.getMyModelStuk().getColorAI()) {
                        DamStukkenView verslagenStuk = bordcoordinaten[x1][y1].getDamStuk();
                        oudTegel.setDamStuk(null);
                        stukkenGroep.getChildren().remove(damstk);
                        bordcoordinaten[x1][y1].setDamStuk(null);
                        stukkenGroep.getChildren().remove(verslagenStuk);
                        myModelMain.getMyModelBord().verhoogScoreWit();
                        myModelMain.getMyModelBord().verhoogAantalBeurten();
                        damstk.setRelocate(xNieuw, yNieuw);
                        nieuwTegel.setDamStuk(damstk);
                        damstk.myModelMain.getMyModelStuk().setPlaatsStukX(xNieuw);
                        damstk.myModelMain.getMyModelStuk().setPlaatsStukY(yNieuw);
                        stukkenGroep.getChildren().add(damstk);
                    }
                }     
            }
        }     
    }     
}

