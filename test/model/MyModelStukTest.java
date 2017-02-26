/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.scene.paint.Color;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MusaAlpaslanErwin & ArifBirinci
 */
public class MyModelStukTest {
    
    public MyModelStukTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPlaatsStukY method, of class MyModelStuk.
     */
    @Test
    public void testGetPlaatsStukY() {
        System.out.println("getPlaatsStukY");
        MyModelStuk instance = new MyModelStuk();
        int expResult = 0;
        int result = instance.getPlaatsStukY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlaatsStukX method, of class MyModelStuk.
     */
    @Test
    public void testGetPlaatsStukX() {
        System.out.println("getPlaatsStukX");
        MyModelStuk instance = new MyModelStuk();
        int expResult = 0;
        int result = instance.getPlaatsStukX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColorPlayer method, of class MyModelStuk.
     */
    @Test
    public void testGetColorPlayer() {
        System.out.println("getColorPlayer");
        MyModelStuk instance = new MyModelStuk();
        Color expResult = Color.BROWN;
        Color result = instance.getColorPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColorAI method, of class MyModelStuk.
     */
    @Test
    public void testGetColorAI() {
        System.out.println("getColorAI");
        MyModelStuk instance = new MyModelStuk();
        Color expResult = Color.CORNSILK;
        Color result = instance.getColorAI();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlaatsStukX method, of class MyModelStuk.
     */
    @Test
    public void testSetPlaatsStukX() {
        System.out.println("setPlaatsStukX");
        int x = 10;
        MyModelStuk instance = new MyModelStuk();
        instance.setPlaatsStukX(x);
        int expResult = 10;
        int result = instance.getPlaatsStukX();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPlaatsStukY method, of class MyModelStuk.
     */
    @Test
    public void testSetPlaatsStukY() {
        System.out.println("setPlaatsStukY");
        int y = 10;
        MyModelStuk instance = new MyModelStuk();
        instance.setPlaatsStukY(y);
        int expResult = 10;
        int result = instance.getPlaatsStukY();
        assertEquals(expResult, result);
    }
    
}
