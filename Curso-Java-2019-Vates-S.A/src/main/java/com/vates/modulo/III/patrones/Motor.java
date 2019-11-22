package com.vates.modulo.III.patrones;

import com.google.api.client.http.HttpRequest;

public class Motor {
    private int caballosDeFuerza;
    private float capacidadDeCombustible;
    private float peso;
    private String modelo;
    private boolean esNuevo;
    private HttpRequest httpRequest;

    public Motor(int caballosDeFuerza, float capacidadDeCombustible, float peso, String modelo, boolean esNuevo) {
        this.caballosDeFuerza = caballosDeFuerza;
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.peso = peso;
        this.modelo = modelo;
        this.esNuevo = esNuevo;
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

    @Override
    public String toString() {
        return "Motor{" +
                "caballosDeFuerza=" + caballosDeFuerza +
                ", capacidadDeCombustible=" + capacidadDeCombustible +
                ", peso=" + peso +
                ", modelo='" + modelo + '\'' +
                ", esNuevo=" + esNuevo +
                '}';
    }
}
