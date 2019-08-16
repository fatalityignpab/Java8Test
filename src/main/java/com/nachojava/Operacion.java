package com.nachojava;

/* + interfaz funcional es aquella que solamente define una única operación un único método

+ no es una interfaz funcional porque por obvias razones tiene más de un método definido*/
@FunctionalInterface
public interface Operacion {
    /*
     * interfaz funcional es aquella que solamente define una única operación un
     * único método
     */
    double calcularPromedio(double n1, double n2);

    //int calcular2();
    // double calcularPromedio();

    /* <String> Genérico - Java 7 */
}