/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.MyModelTegel;
import javafx.scene.shape.Rectangle;

/**
 * deze klasse gaat onze tegels tekenen
 * @author MusaAlpaslanErwinAydogan en ArifBirinci
 */
public class TegelView extends Rectangle {
    
private MyModelTegel myModel;
private DamStukkenView damStuk;
    /**
     *  constructor van de klasse DambordView
     * @param myModel de model van onze tegels
     */
    public TegelView(MyModelTegel myModel) {
        this.myModel = myModel;
        setWidth(myModel.getTegelGrootte());
        setHeight(myModel.getTegelGrootte());
        relocate(myModel.getXValue() * myModel.getTegelGrootte(), myModel.getYValue() * myModel.getTegelGrootte());
        if ((myModel.getXValue() + myModel.getYValue()) % 2 == 0){
            setFill(myModel.getColorTile1());
        }
        else{
            setFill(myModel.getColorTile2());
        }
    }
    /**
     * We kunnen nakijken of er op dit bepaald tegel een damstuk staat
     * @return een bevestiging of ... of er zich een damstuk bevind op de tegel
     */
    public boolean hasDamStuk() {
        return damStuk != null;
    }
    /**
     * We kunnen als er zich een damstuk bevind op de tegel, de damstuk zelf opvragen
     * @return de damstuk die zich op de tegel bevindt
     */
    public DamStukkenView getDamStuk() {
        return damStuk;
    }
    /**
     * We moeten ook de tegel ook kunnen vertellen dat er zich een damstuk bevind op de tegel
     * @param damStuk de damstuk dat op zich op tegel heeft geplaatst
     */
    public void setDamStuk(DamStukkenView damStuk) {
        this.damStuk = damStuk;
    }
}
