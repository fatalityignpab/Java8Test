package com.nachojava;

public interface PersonaB {
    default public void hablar() {
        System.out.println("Hola, yo hablo como PersonaB!");
    }
}