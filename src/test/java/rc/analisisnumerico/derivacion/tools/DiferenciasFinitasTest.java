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
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000018;
        double result = instance.adelantePrimeraOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelantePrimeraOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -4.4408920985006255E-14;
        double result = instance.adelantePrimeraOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelantePrimeraOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 8.88178419700125E-13;
        double result = instance.adelantePrimeraOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelantePrimeraOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelantePrimeraOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -2.664535259100375E-13;
        double result = instance.adelantePrimeraOrden4();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden1 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden1() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 2.0000000000000018;
        double result = instance.adelanteSegundaOrden1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden2 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden2() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = 0.0;
        double result = instance.adelanteSegundaOrden2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden3 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden3() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -4800.000000000003;
        double result = instance.adelanteSegundaOrden3();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adelanteSegundaOrden4 method, of class DiferenciasFinitas.
     */
    @Test
    public void testAdelanteSegundaOrden4() {
        DiferenciasFinitas instance = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        double expResult = -1.4210854715202E-10;
        double result = instance.adelanteSegundaOrden4();
        assertEquals(expResult, result, 0.0);
    }
    
}
