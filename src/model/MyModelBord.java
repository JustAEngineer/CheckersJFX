/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;

/**
 * deze klasse gaat alle waarden bijhouden voor het spel wat te maken heeft met de spelers zelf zoals de score, het aantal beurten
 * @author MusaAlpaslanErwinAydogan en ArifBirinci
 */
public class MyModelBord {
    private final int aantalTegelsX;
    private final int aantalTegelsY;
    public LongProperty scoreRood;
    public LongProperty scoreWit;
    public IntegerProperty aantalBeurten;
    /**
     * de contructor van de klasse MyModelBord 
     */
    public MyModelBord(){
        this.aantalTegelsX = 10;
        this.aantalTegelsY = 10;
        this.scoreRood = new SimpleLongProperty(0);
        this.scoreWit = new SimpleLongProperty(0);
        this.aantalBeurten = new SimpleIntegerProperty(0);
    }
    /**
     * we willen weten hoeveel tegels er zich bevinden op de x-as
     * @return het aantal tegels op de x-as
     */
    public int getAantalTegelsX(){
        return aantalTegelsX;
    }
    /**
     * we willen weten hoeveel tegels er zich bevinden op de y-as
     * @return het aantal tegels op de y-as
     */
    public int getAantalTegelsY(){
        return aantalTegelsY;
    }
    /**
     * we willen weten wat score is van speler wit
     * @return score van speler wit
     */
    public long getScoreWit(){
        return scoreWit.get();
    }
    /**
     * we willen weten wat score is van speler rood
     * @return score van speler rood
     */
    public long getScoreRood(){
        return scoreRood.get();
    }
    
    /**
     * we willen weten hoeveel beurten het spel al bezig is
     * @return hoeveel beurten het spel al bezig is
     */
    public int getAantalBeurten(){
        return aantalBeurten.get();
    }
    
    /**
     * we willen ons score van speler wit kunnen verhogen
     */
    public void verhoogScoreWit(){
        scoreWit.set(scoreWit.get() + 1);
    }
    
    /**
     * we willen ons score van speler rood kunnen verhogen
     */
    public void verhoogScoreRood(){
        scoreRood.set(scoreRood.get() + 1);
    }
    
    /**
     * we willen aantal beurten dat spel bezig is kunnen verhogen
     */
    public void verhoogAantalBeurten(){
        aantalBeurten.set(aantalBeurten.get() + 1);
    }
    
    /**
     * we willen onze score van speler wit kunnen resetten
     */
    public void restartScoreWit(){
        scoreWit.set(0);
    }
    
    /**
     * we willen onze score van speler rood kunnen resetten
     */
    public void restartScoreRood(){
        scoreRood.set(0);
    }
    
    /**
     * we willen onze aantal beurten kunnen resetten
     */
    public void restartBeurten(){
        aantalBeurten.set(0);
    }

}
