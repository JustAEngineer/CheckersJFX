package model;

import javafx.beans.property.ReadOnlyIntegerWrapper;
import javafx.scene.paint.Color;

/**
 * deze klasse houd de nodige info bij voor één damstuk zoals de plaats en de kleur
 * @author  MusaAlpaslanErwinAydogan en ArifBirinci
 */
public class MyModelStuk {
    private ReadOnlyIntegerWrapper y;
    private ReadOnlyIntegerWrapper x;
    private final Color colorPlayer;
    private final Color colorAI;
    private int xX = 0;
    private int yY = 0;
    /**
     * constructor van de klasse MyModelStuk
     */
    public MyModelStuk() {
        this.x = new ReadOnlyIntegerWrapper(xX);
        this.y = new ReadOnlyIntegerWrapper(yY);
        this.colorPlayer = Color.BROWN;
        this.colorAI = Color.CORNSILK;
    }
    /**
     * y-coordinaat terug vinden van ons damstuk
     * @return y-coordinaat van ons damstuk
     */
    public int getPlaatsStukY() {
        return y.get();
    }
    /**
     * x-coordinaat terug vinden van ons damstuk
     * @return x-coordinaat van ons damstuk
     */
    public int getPlaatsStukX() {
        return x.get();
    }
    /**
     * kleur van speler damstuk kunnen opvragen
     * @return kleur van de speler damstuk
     */
    public Color getColorPlayer(){
        return colorPlayer;
    }
    /**
     * kleur van computer damstuk kunnen opvragen
     * @return kleur van de computer damstuk
     */
    public Color getColorAI(){
        return colorAI;
    }
    /**
     * we moeten de x-coordinaat initieel kunnen aangeven of kunnen aanpassen van ons damstuk
     * @param x de nieuwe x-coordinaat van ons damstuk
     */
    public void setPlaatsStukX(int x){
        this.x.set(x);
    }
    /**
     * we moeten de y-coordinaat initieel kunnen aangeven of kunnen aanpassen van ons damstuk
     * @param y de nieuwe y-coordinaat van ons damstuk
     */
    public void setPlaatsStukY(int y){
        this.y.set(y);
    }
}