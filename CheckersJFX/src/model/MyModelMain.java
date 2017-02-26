/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * deze klasse gaat alle models bijeen brengen en een Main klasse vormen voor de models om alles ordelijker te maken en te centraliseren
 * @author MusaAlpaslanErwin
 */
public class MyModelMain {
    private final MyModelBord myModelBord;
    private final MyModelStuk myModelStuk;
    private final MyModelTegel myModelTegel;
    /**
     * de contructor van de klasse MyModelMain
     * @param myModelBord ons dambord
     * @param myModelStuk onze damstukken
     * @param myModelTegel onze tegels waar we op moeten spelen
     */
    public MyModelMain(MyModelBord myModelBord, MyModelStuk myModelStuk, MyModelTegel myModelTegel){
        this.myModelBord = myModelBord;
        this.myModelStuk = myModelStuk;
        this.myModelTegel = myModelTegel;
    }
    /**
     * we moeten het model voor ons dambord kunnen opvragen
     * @return het model voor ons dambord
     */
    public MyModelBord getMyModelBord(){
        return myModelBord;
    }
    /**
     * we moeten het model voor onze damstukken kunnen opvragen
     * @return het model voor onze damstukken
     */
    public MyModelStuk getMyModelStuk(){
        return myModelStuk;
    }
    /**
     * we moeten het model voor onze tegels kunnen opvragen
     * @return het model voor onze tegels
     */
    public MyModelTegel getMyModelTegel(){
        return myModelTegel;
    }
}
