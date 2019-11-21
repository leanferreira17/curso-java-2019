package com.vates.modulo.III.patrones;

public class MotorBuilder {
    private int caballosDeFuerza;
    private float capacidadDeCombustible;
    private float peso;
    private String modelo;
    private boolean esNuevo;

    @Override
    public MotorBuilder build() {
        Motor motor = new Motor();
        motor.setCaballosDeFuerza(this.caballosDeFuerza);
        motor.setCapacidadDeCombustible(this.capacidadDeCombustible);
        motor.setPeso(this.peso);
        motor.setModelo(this.modelo);
        motor.setEsNuevo(this.esNuevo);

        return motor;
    }

    public Motor withCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
        return this;
    }

    public Motor withCapacidadDeCombustible(float capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        return this;
    }

    public Motor withPeso(float peso) {
        this.peso = peso;
        return this;
    }

    public Motor withModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Motor withEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
        return this;
    }
}
