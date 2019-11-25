package com.vates.modulo.III.genericos;

import java.util.ArrayList;
import java.util.List;

public class ClaseNoGenerica {
    public static void main(String[] args) {
        List list = new ArrayList();
        Pelota pelota_1 = new Pelota("Adidas");
        Pelota pelota_2 = new Pelota("Nike");
        Pelota pelota_3 = new Pelota("Topper");

        Botin botin = new Botin("Reebook", "dorados");
        Botin botin2 = new Botin("Puma", "negros");

        list.add(pelota_1);
        list.add(pelota_2);
        list.add(pelota_3);
        list.add(botin);
        list.add(botin2);

        for (Object item : list) {
            if (item instanceof Pelota) {
                System.out.println(((Pelota) item).getPeso()); // casting explícito
            } else {
                System.out.println(((Botin) item).getColor()); // casting explícito
            }
        }

    }
}

class Pelota {
    private String marca;
    private final float peso = 345.56f; // gramos;

    public Pelota(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }
}

class Botin {
    private String marca;
    private String color;

    public Botin(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
