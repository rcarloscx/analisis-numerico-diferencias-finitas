/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.analisisnumerico.derivacion.tools;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rcarlos
 */
public class FuncionTest {
    
    public FuncionTest() {
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
     * Test of eval method, of class Funcion.
     */
    @Test
    public void testEval() {
        System.out.println("eval");
        double x = 1.0;
        Funcion instance = new Funcion("(2)*(x)");
        double expResult = 2.0;
        double result = instance.eval(x);
        assertEquals(expResult, result, 0.0);
    }
    
}
