package com.nachojava;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/* import java.util.Comparator; */

public final class App {
    private App() {
    }

    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("Java8");
        lista.add("Microservicios");
        lista.add("IBM");

        // Versión antigua (Java 7)
        /*
         * Collections.sort(lista, new Comparator<String>() {
         * 
         * @Override public int compare(String o1, String o2) { return o1.compareTo(o2);
         * }
         * 
         * });
         */
        // Lambda Java 8
        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String var : lista) {
            System.out.println(var);
        }

    }

    public void calcular() {
        // Enfoque imperactivo
        /*
         * Operacion op = new Operacion() {
         * 
         * @Override public double calcularPromedio(double n1, double n2) { return (n1 +
         * n2) / 2; } };
         */

         //Sii, no?

         // Ya puedo?

         // Yey

        Operacion op = (double x, double y) -> (x + y) / 2;
        System.out.println(op.calcularPromedio(5, 4));
    }

    public static void main(String[] args) {
        App app = new App();
        app.ordenar();
        app.calcular();
    }
}
