package com.nachojava;

public interface PersonaA {
    /*
     * Metodo por defecto: método que está implementado en una interfaz para que
     * cualquier clase que implemente esta interfaz ya tenga acceso al método
     * definido por defecto
     */
    public void caminar(); // Interfaz

    default public void hablar() {
        System.out.println("Hola, yo hablo como PersonaA!"); // Se trabaja Orientado a Interfaces para un codigo desacoplado
    }
}