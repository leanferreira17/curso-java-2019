package com.vates.modulo.III.patrones;

public class EjemploDePatronBuilder {
    public static void main(String[] args) {
        Motor motor = new MotorBuilder()
                .withCaballosDeFuerza(120)
                .withCapacidadDeCombustible(70.00f)
                .withPeso(1000)
                .withModelo("ABZ")
                .withEsNuevo(false)
                .build();

        System.out.println(motor.toString());
    }
}
