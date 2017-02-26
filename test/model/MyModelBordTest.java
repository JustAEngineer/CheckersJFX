/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class MyModelBordTest {
    
    public MyModelBordTest() {
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
     * Test of getAantalTegelsX method, of class MyModelBord.
     */
    @Test
    public void testGetAantalTegelsX() {
        System.out.println("getAantalTegelsX");
        MyModelBord instance = new MyModelBord();
        int expResult = 10;
        int result = instance.getAantalTegelsX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAantalTegelsY method, of class MyModelBord.
     */
    @Test
    public void testGetAantalTegelsY() {
        System.out.println("getAantalTegelsY");
        MyModelBord instance = new MyModelBord();
        int expResult = 10;
        int result = instance.getAantalTegelsY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScoreWit method, of class MyModelBord.
     */
    @Test
    public void testGetScoreWit() {
        System.out.println("getScoreWit");
        MyModelBord instance = new MyModelBord();
        long expResult = 0;
        long result = instance.getScoreWit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScoreRood method, of class MyModelBord.
     */
    @Test
    public void testGetScoreRood() {
        System.out.println("getScoreRood");
        MyModelBord instance = new MyModelBord();
        long expResult = 0;
        long result = instance.getScoreRood();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAantalBeurten method, of class MyModelBord.
     */
    @Test
    public void testGetAantalBeurten() {
        System.out.println("getAantalBeurten");
        MyModelBord instance = new MyModelBord();
        int expResult = 0;
        int result = instance.getAantalBeurten();
        assertEquals(expResult, result);
    }

    /**
     * Test of verhoogScoreWit method, of class MyModelBord.
     */
    @Test
    public void testVerhoogScoreWit() {
        System.out.println("verhoogScoreWit");
        MyModelBord instance = new MyModelBord();
        instance.verhoogScoreWit();
        Long expResult = 1L;
        Long result = instance.getScoreWit();
        assertEquals(expResult,result);
    }

    /**
     * Test of verhoogScoreRood method, of class MyModelBord.
     */
    @Test
    public void testVerhoogScoreRood() {
        System.out.println("verhoogScoreRood");
        MyModelBord instance = new MyModelBord();
        instance.verhoogScoreRood();
        Long expResult = 1L;
        Long result = instance.getScoreRood();
        assertEquals(expResult, result);
    }

    /**
     * Test of verhoogAantalBeurten method, of class MyModelBord.
     */
    @Test
    public void testVerhoogAantalBeurten() {
        System.out.println("verhoogAantalBeurten");
        MyModelBord instance = new MyModelBord();
        instance.verhoogAantalBeurten();
        int expResult = 1;
        int result = instance.getAantalBeurten();
        assertEquals(expResult, result);
    }

    /**
     * Test of restartScoreWit method, of class MyModelBord.
     */
    @Test
    public void testRestartScoreWit() {
        System.out.println("restartScoreWit");
        MyModelBord instance = new MyModelBord();
        instance.verhoogScoreWit();
        instance.restartScoreWit();
        Long expResult = 0L;
        Long result = instance.getScoreWit();
        assertEquals(expResult, result);
    }

    /**
     * Test of restartScoreRood method, of class MyModelBord.
     */
    @Test
    public void testRestartScoreRood() {
        System.out.println("restartScoreRood");
        MyModelBord instance = new MyModelBord();
        instance.verhoogScoreRood();
        instance.restartScoreRood();
        Long expResult = 0L;
        Long result = instance.getScoreRood();
        assertEquals(expResult, result);
    }

    /**
     * Test of restartBeurten method, of class MyModelBord.
     */
    @Test
    public void testRestartBeurten() {
        System.out.println("restartBeurten");
        MyModelBord instance = new MyModelBord();
        instance.verhoogAantalBeurten();
        instance.restartBeurten();
        int expResult = 0;
        int result = instance.getAantalBeurten();
        assertEquals(expResult, result);
    }
    
}
