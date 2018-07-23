/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.analisisnumerico.derivacion.tools;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rcarlos
 */
public class Numerador {

    private List<Double> coefFuncion;
    private List<Double> coefH;
    private double xo;
    private double h;
    private Funcion funcion;

    public Numerador() {

    }

    public Numerador(double xo, double h, Funcion funcion) {
        this.xo = xo;
        this.h = h;
        this.funcion = funcion;
    }

    public void add(double coeficienteFuncion, double coeficienteH) {
        this.coefFuncion.add(coeficienteFuncion);
        this.coefH.add(coeficienteH);
    }

    public double reducir() {
        double num = 0.0;
        double n;
        for (int i = 0; i < coefFuncion.size(); i++) {
            n = this.coefFuncion.get(i) * (funcion.eval(xo + ((coefH.get(i)) * (h))));
            num = num + n;
        }
        return num;
    }

    public void removeAll() {
        this.coefFuncion = new ArrayList<>();
        this.coefH = new ArrayList<>();
    }

    public double getXo() {
        return xo;
    }

    public void setXo(double xo) {
        this.xo = xo;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public int getTamanio() {
        return this.coefFuncion.size();
    }
}
