package com.nachojava;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {

    public static void referenciarMetodoStatic() {
        System.out.println("Método Referido Static");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = { "IBM", "Microservicios", "Yo" };

        /*
         * Arrays.sort(nombres, new Comparator<String>() {
         * 
         * @Override public int compare(String o1, String o2) { return
         * o1.compareToIgnoreCase(o2); } });
         */

        // Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));

        Arrays.sort(nombres, String::compareToIgnoreCase); // Referencia a Objetos
        System.out.println(Arrays.toString(nombres));
    }

    public void referenciarMetodoInstanciaObjetoParticular() {
        System.out.println("Metodo Referido Instancia de un Objeto en particular");
    }

    public void operar() {
        OperacionOtra op = () -> MeRefApp.referenciarMetodoStatic(); // Referenciar a un metodo estático hacia un objeto
        // arbitrario de un objeto en particular y referencias
        // a un Constructor
        op.saludar();
        /*
         * :: Referencia método, no puede mandar parametros, (no implementa
         * Currificación). "Currificación" en programación funcional, cualquier función
         * de 2 argumentos y que devuelve un valor, puede ser transformada a otra
         * función que acepta solo un parámetro y que devuelve una función, que al ser
         * llamada, devuelve el valor devuelto por la función original.
         */
        OperacionOtra op2 = MeRefApp::referenciarMetodoStatic;
        op2.saludar();
    }

    public void referenciarConstructor() {
        /* IPersona iper = new IPersona(){
        
            @Override
            public Persona persona(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };

        iper.persona(1, "Microservicios"); */

        /* IPersona iper2 = (x,y) -> (new Persona(x, y));
        Persona per = iper2.persona(1, "Microservicios");
        System.out.println(per.getId()+" - "+per.getNombre()); */

        IPersona iper3 = Persona::new;
        Persona per = iper3.persona(1, "Microservicios");
        System.out.println(per.getId()+" - "+per.getNombre());
    }

    /*
     * Metodos referenciados o referencias a metodos: me va a permitir también tener
     * un código legible fácil de leer y tener menos líneas de código
     */

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
        // app.operar();
        // app.referenciarMetodoInstanciaObjetoArbitrario();
        /*
         * implementando con la expresión de la derecha, es un método de instancia de
         * este objeto en particular app
         */
        // OperacionOtra op = app::referenciarMetodoInstanciaObjetoParticular; // Interfaces funcionales, unico metodo, como implementaciòn
        //op.saludar();
        app.referenciarConstructor();
    }
}