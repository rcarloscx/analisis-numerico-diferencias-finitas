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
public class NumeradorTest {

    public NumeradorTest() {
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
     * Test of add method, of class Numerador.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double coeficienteFuncion = 1.0;
        double coeficienteH = 1.0;
        Numerador instance = new Numerador();
        instance.removeAll();
        instance.add(coeficienteFuncion, coeficienteH);
        int expResult = 1;
        int result = instance.getTamanio();
        assertEquals(expResult, result, 1);
    }

    /**
     * Test of reducir method, of class Numerador.
     */
    @Test
    public void testReducir() {
        System.out.println("reducir");
        Numerador instance = new Numerador(1, 0.1, new Funcion("(2)*(x)"));
        instance.removeAll();
        instance.add(1, 1);
        double expResult = 2.2;
        double result = instance.reducir();
        assertEquals(expResult, result, 2.2);
    }

    /**
     * Test of removeAll method, of class Numerador.
     */
    @Test
    public void testRemoveAll() {
        System.out.println("removeAll");
        Numerador instance = new Numerador();
        instance.removeAll();
        double expResult = 0;
        int result = instance.getTamanio();
        assertEquals(expResult, result, 0);
    }

}
