#  Análisis numérico Diferencias Finitas
Proyecto donde se realiza una solucion de derivacion mediante las formulas de diferencias finitas

## Introducción
>En matemáticas, para aproximar la derivada de una función con un orden arbitrario de exactitud, es posible de utilizar el método de diferencias finitas. Este puede ser central, hacia delante o hacia atrás pero basicamente usan la misma estrutrua de formula, solo cabiando los coeficientes de la funcion y el coeficiente de h

## Ejemplo:
### Formula para calcular la primera de diferencia centrada de orden 2
    f''(Xo) = ( f(Xo+h) - 2f(Xo) + f(Xo-2h) ) / h²
Si a analizamos cada elemento de la formula:
### -f(Xo+h)
Como podemos ver, el coeficiente de la funcion es 1 y el coficiente de la h es 1


