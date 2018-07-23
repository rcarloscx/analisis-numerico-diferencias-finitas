/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.analisisnumerico.derivacion.tools;

/**
 *
 * @author rcarlos
 */
public class DiferenciasFinitas {

    private double h;
    private final Numerador numerador;

    public DiferenciasFinitas(double x, double h, Funcion fun) {
        this.h = h;
        numerador = new Numerador(x, h, fun);
    }

    //Diferencias finitas hacia adelante
    public double AdelantePrimeraOrden1() {
        numerador.removeAll();
        numerador.add(1, 1);
        numerador.add(-1, 0);
        return numerador.reducir() / h;
    }

    public double AdelantePrimeraOrden2() {
        numerador.removeAll();
        numerador.add(1, 2);
        numerador.add(-2, 1);
        numerador.add(1, 0);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double AdelantePrimeraOrden3() {
        numerador.removeAll();
        numerador.add(1, 3);
        numerador.add(-3, 2);
        numerador.add(3, 1);
        numerador.add(-1, 0);
        return numerador.reducir() / (Math.pow(h, 3));
    }

    public double AdelantePrimeraOrden4() {
        numerador.removeAll();
        numerador.add(1, 4);
        numerador.add(-4, 3);
        numerador.add(6, 2);
        numerador.add(-4, 1);
        numerador.add(1, 0);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double AdelanteSegundaOrden1() {
        numerador.removeAll();
        numerador.add(-1, 2);
        numerador.add(4, 1);
        numerador.add(-3, 0);
        return numerador.reducir() / ((2) * (h));
    }

    public double AdelanteSegundaOrden2() {
        numerador.removeAll();
        numerador.add(-1, 3);
        numerador.add(4, 2);
        numerador.add(-5, 1);
        numerador.add(2, 0);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double AdelanteSegundaOrden3() {
        numerador.removeAll();
        numerador.add(-3, 4);
        numerador.add(14, 3);
        numerador.add(-24, 3);
        numerador.add(18, 1);
        numerador.add(-5, 0);
        return numerador.reducir() / (Math.pow(h, 3));
    }

    public double AdelanteSegundaOrden4() {
        numerador.removeAll();
        numerador.add(-2, 5);
        numerador.add(11, 4);
        numerador.add(-24, 3);
        numerador.add(26, 2);
        numerador.add(-14, 1);
        numerador.add(3, 0);
        return numerador.reducir() / (Math.pow(h, 4));
    }
    
    public Funcion getFuncion() {
        return this.numerador.getFuncion();
    }

    public void setFuncion(Funcion funcion) {
        this.numerador.setFuncion(funcion);
    }

    public double getXo() {
        return numerador.getXo();
    }

    public void setXo(double xo) {
        this.numerador.setXo(xo);
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        this.numerador.setH(h);
    }

}
