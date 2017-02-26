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
public class MyModelMainTest {
    
    public MyModelMainTest() {
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
     * Test of getMyModelBord method, of class MyModelMain.
     */
    @Test
    public void testGetMyModelBord() {
        System.out.println("getMyModelBord");
        MyModelBord expResult = new MyModelBord();
        MyModelStuk testStuk = new MyModelStuk();
        MyModelTegel testTegel = new MyModelTegel();
        MyModelMain instance = new MyModelMain(expResult, testStuk, testTegel);
        MyModelBord result = instance.getMyModelBord();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMyModelStuk method, of class MyModelMain.
     */
    @Test
    public void testGetMyModelStuk() {
        System.out.println("getMyModelStuk");
        MyModelBord testBord = new MyModelBord();
        MyModelStuk expResult = new MyModelStuk();
        MyModelTegel testTegel = new MyModelTegel();
        MyModelMain instance = new MyModelMain(testBord, expResult, testTegel);
        MyModelStuk result = instance.getMyModelStuk();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMyModelTegel method, of class MyModelMain.
     */
    @Test
    public void testGetMyModelTegel() {
        System.out.println("getMyModelTegel");
        MyModelBord testBord = new MyModelBord();
        MyModelStuk testStuk = new MyModelStuk();
        MyModelTegel expResult = new MyModelTegel();
        MyModelMain instance = new MyModelMain(testBord, testStuk, expResult);
        MyModelTegel result = instance.getMyModelTegel();
        assertEquals(expResult, result);
    }
    
}
