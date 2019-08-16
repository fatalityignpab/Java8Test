package com.nachojava;

public class MeRefApp {

    public static void referenciarMetodoStatic() {
        System.out.println("Método Referido Static");
    }

    public void operar() {
        Operacion op = () -> MeRefApp.referenciarMetodoStatic();
    }

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();

    }
}