/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


/**
 * de klasse gaat onze damstukken tekenen
 * @author  MusaAlpaslanErwinAydogan en ArifBirinci
 */
public class DamStukkenView extends Circle {
    public final MyModelMain myModelMain;
    
    /**
     * constructor voor de objecten van de klasse DamStukkenView
     * @param myModelMain is de model noodzakelijk voor de vieuw van onze damstukken
     */
    public DamStukkenView(MyModelMain myModelMain){
        this.myModelMain = myModelMain;
        setRadius(0.4 * myModelMain.getMyModelTegel().getTegelGrootte());
        setStroke(Color.BLACK);
        setStrokeWidth(myModelMain.getMyModelTegel().getTegelGrootte() * 0.03);
        relocate(myModelMain.getMyModelStuk().getPlaatsStukX()* myModelMain.getMyModelTegel().getTegelGrootte(), myModelMain.getMyModelStuk().getPlaatsStukY()* myModelMain.getMyModelTegel().getTegelGrootte());
        if ((myModelMain.getMyModelStuk().getPlaatsStukY()) <= 2 && ((myModelMain.getMyModelStuk().getPlaatsStukX()) + (myModelMain.getMyModelStuk().getPlaatsStukY())) % 2 != 0){
         
            setFill(myModelMain.getMyModelStuk().getColorAI());
        } else {
            setFill(myModelMain.getMyModelStuk().getColorPlayer());
        }  
    }
    /**
     * setRelocate gaat met de ingegeven x- en y-waaarden het beeld manipuleren en de verandering in coordinaten van het damstuk visueel waarneembaar maken
     * @param x de nieuwe x-coordinaat
     * @param y de nieuwe y-coordinaat
     */
    public void setRelocate(int x, int y){
        myModelMain.getMyModelStuk().setPlaatsStukX(x);
        myModelMain.getMyModelStuk().setPlaatsStukY(y);
        relocate(myModelMain.getMyModelStuk().getPlaatsStukX()* myModelMain.getMyModelTegel().getTegelGrootte(), myModelMain.getMyModelStuk().getPlaatsStukY()* myModelMain.getMyModelTegel().getTegelGrootte());
    }
}
