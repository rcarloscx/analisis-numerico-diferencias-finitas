#  Análisis numérico Diferencias Finitas
Proyecto donde se realiza una solucion de derivacion mediante las formulas de diferencias finitas

## Introducción
>En matemáticas, para aproximar la derivada de una función con un orden arbitrario de exactitud, es posible de utilizar el método de diferencias finitas. Este puede ser central, hacia delante o hacia atrás pero basicamente usan la misma estrutrua de formula, solo cabiando los coeficientes de la funcion y el coeficiente de h

## Ejemplo:
### Formula para calcular la primera de diferencia centrada de orden 2
    f''(Xo) = ( f(Xo+h) - 2f(Xo) + f(Xo-2h) ) / h²
Si a analizamos cada elemento de la formula:
### f(Xo+h)
Como podemos ver, el coeficiente de la funcion es 1 y el coficiente de h es 1
### -2f(Xo)
El coeficiente de la funcion es -2 y el coeficiente de h es 0
### f(Xo-2h)
El coediciente de la funcion es 1 y el coeficiente de h es -2

Teniendo esta estructura en los numeradores de todas las formulas, es conveniente crear una clase Numerador
## Clase Numerador
Se usaran:
2 listas para los coeficientes de la funcion y de h, anteriormente mencionados:

    private List<Double> coefFuncion;
    private List<Double> coefH;
Un metodo para añadir los 2 valores a las listas:

    public void add(double coeficienteFuncion, double coeficienteH) {
        this.coefFuncion.add(coeficienteFuncion);
        this.coefH.add(coeficienteH);
    }
Un metodo para inicializar las listas y borar todo cuando sea necesario:

    public void removeAll() {
        this.coefFuncion = new ArrayList<>();
        this.coefH = new ArrayList<>();
    }
Y un metodo "reducir" para que multiplicar cada coeficiente de la funcion por la funcion evaluada en Xo + h
    
    public double reducir() {
        double num = 0.0;
        double n;
        for (int i = 0; i < coefFuncion.size(); i++) {
            n = this.coefFuncion.get(i) * (funcion.eval(xo + ((coefH.get(i)) * (h))));
            num = num + n;
        }
        return num;
    }
## DiferenciasFinitas
Metodo para calcular la primera de diferencia centrada de orden 2

    public double centradaPrimeraOrden2() {
        numerador.removeAll();
        numerador.add(1, 1);
        numerador.add(-2, 0);
        numerador.add(1, -1);
        return numerador.reducir() / (Math.pow(h, 2));
    }
Primero se llama al metodo removeAll para inicializar las listas y luego se agregan los coeficientes de la funcion y h, para este caso, como se dijo en la explicacion de la formula coeficientesa usar son (1,1), (-2,0), (1,-1) y son estos los que se deben mandar como parametros al metodo ".add" y para finalizar los calculos es necesario dividir entre h² como se puede apreciar en la formula.

En vista de que hay muchas formulas para calcular las diferencias finitas, se ha explicado un metodo por si es necesario cambiar el codigo ya sea por equivocacion en las formulas y en forma de documentacion. Tambien se incluye una forma de uso en la clase main:

## Main
    [...]
        DiferenciasFinitas dif = new DiferenciasFinitas(1, 0.1, new Funcion("(2)*(x)"));
        System.out.println("Diferencia finita con la formula de los tres puntos: " + dif.tresPuntos());
    [...]
