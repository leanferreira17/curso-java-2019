package com.vates.modulo.I.ejemplos;

public class EjemploHerenciaCompuesta {
    public static void main(String[] args) {
        Padre padre = new Padre();
    }
}

/**
 * Ejemplo de bucle infinito. Cada vez que la subclase se instancia se debe llamar al constructor de la
 * superclase. En la superclase hay una instanciación de la clase hija que llama al constructor de la clase padre
 * generando un bucle infinito.
 */
class Padre {
    private Hija hija = new Hija();
}

class Hija extends Padre {
}
