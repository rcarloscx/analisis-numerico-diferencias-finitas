/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.analisisnumerico.derivacion;

import rc.analisisnumerico.derivacion.tools.DiferenciasFinitas;
import rc.analisisnumerico.derivacion.tools.Funcion;

/**
 *
 * @author rcarlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiferenciasFinitas dif = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        System.out.println("Diferencia finita con la formula de los tres puntos: " + dif.tresPuntos());
    }
    
}
