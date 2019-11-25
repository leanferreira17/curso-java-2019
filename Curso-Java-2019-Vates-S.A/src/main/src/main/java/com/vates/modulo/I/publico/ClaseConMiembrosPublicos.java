package com.vates.modulo.I.publico;

import java.util.Random;

public class ClaseConMiembrosPublicos {

    private Random random = new Random();
    public long id = random.nextLong();

    public long getId() {
        return this.id;
    }

    public String getNombreDeClase() {
        return this.getClass().getName();
    }

    public void imprimirDatos() {
        System.out.println(this.getClass().getName() + "\t" + this.getClass().getPackage().getName());
    }
}
