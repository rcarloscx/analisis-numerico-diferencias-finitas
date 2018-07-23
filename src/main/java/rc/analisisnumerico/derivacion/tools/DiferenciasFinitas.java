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
    public double adelantePrimeraOrden1() {
        numerador.removeAll();
        numerador.add(1, 1);
        numerador.add(-1, 0);
        return numerador.reducir() / h;
    }

    public double adelantePrimeraOrden2() {
        numerador.removeAll();
        numerador.add(1, 2);
        numerador.add(-2, 1);
        numerador.add(1, 0);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double adelantePrimeraOrden3() {
        numerador.removeAll();
        numerador.add(1, 3);
        numerador.add(-3, 2);
        numerador.add(3, 1);
        numerador.add(-1, 0);
        return numerador.reducir() / (Math.pow(h, 3));
    }

    public double adelantePrimeraOrden4() {
        numerador.removeAll();
        numerador.add(1, 4);
        numerador.add(-4, 3);
        numerador.add(6, 2);
        numerador.add(-4, 1);
        numerador.add(1, 0);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double adelanteSegundaOrden1() {
        numerador.removeAll();
        numerador.add(-1, 2);
        numerador.add(4, 1);
        numerador.add(-3, 0);
        return numerador.reducir() / ((2) * (h));
    }

    public double adelanteSegundaOrden2() {
        numerador.removeAll();
        numerador.add(-1, 3);
        numerador.add(4, 2);
        numerador.add(-5, 1);
        numerador.add(2, 0);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double adelanteSegundaOrden3() {
        numerador.removeAll();
        numerador.add(-3, 4);
        numerador.add(14, 3);
        numerador.add(-24, 3);
        numerador.add(18, 1);
        numerador.add(-5, 0);
        return numerador.reducir() / (Math.pow(h, 3));
    }

    public double adelanteSegundaOrden4() {
        numerador.removeAll();
        numerador.add(-2, 5);
        numerador.add(11, 4);
        numerador.add(-24, 3);
        numerador.add(26, 2);
        numerador.add(-14, 1);
        numerador.add(3, 0);
        return numerador.reducir() / (Math.pow(h, 4));
    }

    //Diferencias finitas hacia Atras
    public double atrasPrimeraOrden1() {
        numerador.removeAll();
        numerador.add(1, 0);
        numerador.add(-1, 1);
        return numerador.reducir() / (h);
    }

    public double atrasPrimeraOrden2() {
        numerador.removeAll();
        numerador.add(1, 0);
        numerador.add(-2, -1);
        numerador.add(1, -2);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double atrasPrimeraOrden3() {
        numerador.removeAll();
        numerador.add(1, 0);
        numerador.add(-3, -1);
        numerador.add(3, -2);
        numerador.add(-1, -3);
        return numerador.reducir() / (Math.pow(h, 3));
    }

    public double atrasPrimeraOrden4() {
        numerador.removeAll();
        numerador.add(1, 0);
        numerador.add(-4, -1);
        numerador.add(6, -2);
        numerador.add(-4, -3);
        numerador.add(1, -4);
        return numerador.reducir() / (Math.pow(h, 4));
    }

    public double atrasSegundaOrden1() {
        numerador.removeAll();
        numerador.add(3, 0);
        numerador.add(-4, -1);
        numerador.add(1, -2);
        return numerador.reducir() / ((2) * (h));
    }

    public double atrasSegundaOrden2() {
        numerador.removeAll();
        numerador.add(2, 0);
        numerador.add(-5, -1);
        numerador.add(4, -2);
        numerador.add(-1, -3);
        return numerador.reducir() / (Math.pow(h, 2));
    }

    public double atrasSegundaOrden3() {
        numerador.removeAll();
        numerador.add(5, 0);
        numerador.add(-18, -1);
        numerador.add(24, -2);
        numerador.add(-14, -3);
        numerador.add(3, -4);
        return numerador.reducir() / (Math.pow(h, 3));
    }

    public double atrasSegundaOrden4() {
        numerador.removeAll();
        numerador.add(3, 0);
        numerador.add(-14, -1);
        numerador.add(26, -2);
        numerador.add(-24, -3);
        numerador.add(11, -4);
        numerador.add(-2, -5);
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
