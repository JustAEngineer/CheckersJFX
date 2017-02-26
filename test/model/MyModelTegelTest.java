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
public class MyModelTegelTest {
    
    public MyModelTegelTest() {
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
     * Test of getTegelGrootte method, of class MyModelTegel.
     */
    @Test
    public void testGetTegelGrootte() {
        System.out.println("getTegelGrootte");
        MyModelTegel instance = new MyModelTegel();
        int expResult = 60;
        int result = instance.getTegelGrootte();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColorTile1 method, of class MyModelTegel.
     */
    @Test
    public void testGetColorTile1() {
        System.out.println("getColorTile1");
        MyModelTegel instance = new MyModelTegel();
        Color expResult = Color.BURLYWOOD;
        Color result = instance.getColorTile1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColorTile2 method, of class MyModelTegel.
     */
    @Test
    public void testGetColorTile2() {
        System.out.println("getColorTile2");
        MyModelTegel instance = new MyModelTegel();
        Color expResult = Color.BLACK;
        Color result = instance.getColorTile2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getXValue method, of class MyModelTegel.
     */
    @Test
    public void testGetXValue() {
        System.out.println("getXValue");
        MyModelTegel instance = new MyModelTegel();
        int expResult = 0;
        int result = instance.getXValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYValue method, of class MyModelTegel.
     */
    @Test
    public void testGetYValue() {
        System.out.println("getYValue");
        MyModelTegel instance = new MyModelTegel();
        int expResult = 0;
        int result = instance.getYValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class MyModelTegel.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 10;
        MyModelTegel instance = new MyModelTegel();
        instance.setX(x);
        int expResult = 10;
        int result = instance.getXValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class MyModelTegel.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 10;
        MyModelTegel instance = new MyModelTegel();
        instance.setY(y);
        int expResult = 10;
        int result = instance.getYValue();
        assertEquals(expResult, result);
    }
    
}
