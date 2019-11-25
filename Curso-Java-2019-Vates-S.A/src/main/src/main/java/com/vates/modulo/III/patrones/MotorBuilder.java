package com.vates.modulo.III.patrones;

public class MotorBuilder implements IMotor {
    private int caballosDeFuerza;
    private float capacidadDeCombustible;
    private float peso;
    private String modelo;
    private boolean esNuevo;

    public MotorBuilder withCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
        return this;
    }

    public MotorBuilder withCapacidadDeCombustible(float capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        return this;
    }

    public MotorBuilder withPeso(float peso) {
        this.peso = peso;
        return this;
    }

    public MotorBuilder withModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public MotorBuilder withEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
        return this;
    }

    @Override
    public Motor build() {
        return new Motor(caballosDeFuerza, capacidadDeCombustible, peso, modelo, esNuevo);
    }
}
