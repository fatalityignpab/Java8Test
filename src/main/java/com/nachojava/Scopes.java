package com.nachojava;

public class Scopes {
    private static double atributo1;
    private double atributo2;

    public double probarLocalVariables() {
        /*
         * Scope: ámbito de las variables conjuntamente con las expresiones lambda,
         * tener variables locales globales y estáticas.
         * 
         * Una interfaz no puede instanciarse, es necesario implementar los métodos
         */
        double n3 = 3; // final: no va a cambiar su valor
        Operacion op = new Operacion() {

            @Override
            public double calcularPromedio(double n1, double n2) {
                return n1 + n2 + n3;
            }
        };

        Operacion op2 = (x, y) -> {
            // n3 = 1 -- usar el valor, mas no reasignar a otro nuevo valor
            return x + y + n3; // Opcional colocar el final a una variable local
        };
        return op2.calcularPromedio(1, 1);
    }

    public double probarAtributosStaticVariables() {
        /*
         * expresión lambda y hacer referencia a nuestros atributos de clase estático o
         * uno no estático, tiene la capacidad de lectura y escritura de esos atributos
         * en la expresión lambda
         */

        // objetos anonimos con el Override y dentro de una función (Java 7)

        Operacion op = (x, y) -> {
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo2;
        };
        return op.calcularPromedio(3, 2);
    }

    public static void main(String[] args) {
        Scopes app = new Scopes();
        System.out.println(app.probarAtributosStaticVariables());
    }
}