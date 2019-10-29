package com.vates.modulo.I.privado;

import java.util.Random;

public class ClaseConMiembrosPrivados {

    private Random random = new Random();
    private long id = random.nextLong();

    private long getId() {
        return this.id;
    }

    public String getNombreDeClase() {
        return this.getClass().getName();
    }

    public void imprimirDatos() {
        System.out.println(this.getClass().getName() + "\t" + this.getClass().getPackage().getName());
    }
}
