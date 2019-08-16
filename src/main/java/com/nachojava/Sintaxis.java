package com.nachojava;

public class Sintaxis {
    public double probarsintaxis() {
        // Operacion op = (double x, double y) -> (x + y) / 2;
        // Operacion op = (double x, double y) -> {return (x + y) / 2;};
        Operacion op = (x, y) -> {
            double a = 2.0;
            System.out.println(a);
            return (x + y) / 2 + a;
        };
        // Operacion op = (x, y) -> (x + y) / 2;
        // Operacion op = () -> 2;
        /*
         * Operacion op = () -> { int x = 2; int y = 3; return x + y; };
         */
        // Expresiones lambda más legibles
        return op.calcularPromedio(2, 3);
    }

    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();
        System.out.println(app.probarsintaxis());
    }
}