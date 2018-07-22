/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.analisisnumerico.derivacion.tools;

import org.nfunk.jep.JEP;

/**
 *
 * @author rcarlos
 */
public class Funcion {

    JEP fun = new JEP();

    public Funcion(String funci) {
        fun.addVariable("x", 0);
        fun.addStandardConstants();
        fun.addStandardFunctions();
        fun.parseExpression(funci);
        if (fun.hasError()) {
            System.out.println(fun.getErrorInfo());
        }
    }

    public double eval(double x) {
        double resp;
        fun.addVariable("x", x);
        resp = fun.getValue();
        if (fun.hasError()) {
            System.out.println(fun.getErrorInfo());
        }
        return resp;
    }

}
