package com.vates.modulo.III.patrones;

public class Builder {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Motor motor1 = motor.build().build()
    }
}

class Motor implements IMotor {
    private int caballosDeFuerza;
    private float capacidadDeCombustible;
    private float peso;
    private String modelo;
    private boolean esNuevo;

    public Motor() {

    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public float getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public void setCapacidadDeCombustible(float capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }
}

