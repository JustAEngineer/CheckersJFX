package model;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.scene.paint.Color;

/**
 * deze klasse gaat allerlei gegevens bijhouden voor de tegels zoals, X-coordinaten, Y-coordinaten, kleur en grootte
 * @author  MusaAlpaslanErwinAydogan en ArifBirinci
 */
public class MyModelTegel {
    private final int tegelGrootte;
    private final Color colorTile1;
    private final Color colorTile2;
    private ReadOnlyIntegerWrapper x;
    private ReadOnlyIntegerWrapper y;
    private int xX=0;
    private int yY=0;
    /**
     * de contructor van de klasse MyModelTegel
     */
    public MyModelTegel(){
        this.tegelGrootte = 60;
        this.colorTile1 = Color.BURLYWOOD;
        this.colorTile2 = Color.BLACK;
        this.x = new ReadOnlyIntegerWrapper(xX);
        this.y = new ReadOnlyIntegerWrapper(yY);
    }
    /**
     * we moeten kunnen te weten komen wat de grootte van de tegels op ons dambord eigenlijk zijn
     * @return de grootte van de onze tegels
     */
    public int getTegelGrootte(){
        return tegelGrootte;
    }
    /**
     * we moeten kunnen weten welke kleur de eerste soort van tegels op ons dambord eigenlijk hebben
     * @return de kleur van onze eerste soort tegels
     */
    public Color getColorTile1(){
        return colorTile1;
    }
    /**
     * we moeten kunnen weten welke kleur de tweede soort van tegels op ons dambord eigenlijk hebben
     * @return de kleur van onze tweede soort tegels
     */
    public Color getColorTile2(){
        return colorTile2;
    }
    /**
     * we moeten kunnen weten op welke x-coordinaat deze tegel zich bevindt
     * @return x-coordinaat van onze tegel
     */
    public int getXValue() {
        return x.get();
    }
    /**
     * we moeten kunnen weten op welke y-coordinaat deze tegel zich bevindt
     * @return y-coordinaat van onze tegel
     */
    public int getYValue() {
        return y.get();
    }
    /**
     * we moeten onze tegel op eerste plaats wel een x-coordinaat kunnen geven
     * @param x x-coordinaat die we aan onze tegel willen geven
     */
    public void setX(int x) {
        this.x.set(x);
    }
    /**
     * we moeten onze tegel een y-coordinaat kunnen geven
     * @param y y-coordinaat die aan onze tegel willen geven
     */
    public void setY(int y) {
        this.y.set(y);
    }
}
