package com.vates.modulo.I.ejemplos;

public class EjemploHerenciaCompuesta {
    public static void main(String[] args) {
        Destornillador destornillador = new Destornillador();
    }
}

/**
 * Ejemplo de bucle infinito. Cada vez que la subclase se instancia se debe llamar al constructor de la
 * superclase. En la superclase hay una instanciación de la clase hija que llama al constructor de la clase padre
 * generando un bucle infinito.
 */
class Destornillador {
    private DestornilladorPlano destornilladorPlano = new DestornilladorPlano();
}

class DestornilladorPlano extends Destornillador {
}
