package com.vates.modulo.II.enums;

public enum Clase {
    A("LVA", 1),
    B("LVB", 2),
    C("LVC", 3),
    D("LVD", 4),
    E("LVE", 5);

    private String prefijo;
    private int clase;

    Clase(String prefijo, int clase) {
        this.prefijo = prefijo;
        this.clase = clase;
    }

    public String getPrefijo() {
        return this.prefijo;
    }

    public int getClase() {
        return this.clase;
    }

    public void setE(String nuevoValor) {
        this.prefijo = nuevoValor;
    }
}
