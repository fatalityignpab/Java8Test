package com.nachojava;

import java.util.ArrayList;
import java.util.List;

/**
 * StreamsApp
 */
public class StreamsApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamsApp(){
        lista = new ArrayList<>();
        lista.add("Yo");
        lista.add("Mero");
        lista.add("IBM");
        lista.add("Microservicios");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");

    }

    public void filtrar() {
        // lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
        lista.stream().filter(x -> x.startsWith("M")).forEach(x -> System.out.println(x));
    }

    public void ordenar(){
        lista.stream().sorted().forEach(System.out::println);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filtrar();
        app.ordenar();
    }
}