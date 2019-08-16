package com.nachojava;

public class DefaultMethod implements PersonaA, PersonaB {
    @Override
    public void caminar() {
        System.out.println("Camina!");
    }

    @Override // No sabe cual metodo llamar, por eso se creo
    public void hablar() {
        PersonaA.super.hablar();
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }
}