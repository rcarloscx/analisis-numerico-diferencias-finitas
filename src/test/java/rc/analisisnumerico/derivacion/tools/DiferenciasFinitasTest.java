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
public class DiferenciasFinitasTest {
    
    public DiferenciasFinitasTest() {
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
     * Test of AdelantePrimeraOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden1() {
        System.out.println("AdelantePrimeraOrden1");
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000018;
        double result = instance.AdelantePrimeraOrden1();
        assertEquals(expResult, result, 2.0000000000000018);
    }
    
}
