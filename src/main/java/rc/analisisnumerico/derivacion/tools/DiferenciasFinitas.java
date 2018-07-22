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

        return 0;
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
