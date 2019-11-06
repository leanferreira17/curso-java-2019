package com.vates.modulo.I.ejemplos;

public class EjemploDeComposicionDesdeLaSubClase {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Auto auto = new Auto();
        //System.out.println(vehiculo.toString());
        vehiculo.setAuto(auto);
        System.out.println(vehiculo.getAuto().getCantidadDeRuedas());
    }
}

class Vehiculo {
    private String nombreComun;
    private String color;
    private Auto auto;

    public Vehiculo() {
        System.out.println("Construí un Vehiculo");
    }

    public Auto getAuto() {
        return this.auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
}

class Auto extends Vehiculo{
    private int cantidadDeRuedas = 4;

    public int getCantidadDeRuedas() {
        return this.cantidadDeRuedas;
    }

    public void printSuper() {
        System.out.println(super.toString());
    }
}

class Avion extends Vehiculo{


}
