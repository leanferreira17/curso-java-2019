package com.vates.modulo.II.controlador;

import com.vates.modulo.II.enums.Categoria;
import com.vates.modulo.II.enums.Clase;

import java.text.MessageFormat;

public class ControladorDeAviones {
    public static void main(String[] args) {
        /*Categoria carga = Categoria.CARGA;
        System.out.println(carga.getClass().getClassLoader());
        System.out.println(carga.name());
        System.out.println(carga.toString());
        System.out.println(carga.ordinal());
        System.out.println(carga.compareTo(Categoria.LIGERO));*/

        Avion avion = new Avion("Boeing", Categoria.COMERCIAL, Clase.E);
        avion.getClase().setE("nuevo valor AAA");
        System.out.println(MessageFormat.format(
                "Marca: {0}, Categoria: {1}, Clase: {2}, Clase/prefijo: {3}, Clase/id: {4}",
                avion.getMarca(),
                avion.getCategoria(),
                avion.getClase(),
                avion.getClase().getPrefijo(),
                avion.getClase().getClase()));

        Avion avion1 = new Avion("Airbus", Categoria.EXPERIMENTAL, Clase.E);
        System.out.println(avion1.getClase().getPrefijo());
    }
}

class Avion {
    private String marca;
    private Categoria categoria;
    private Clase clase;

    public Avion(String marca, Categoria categoria, Clase clase) {
        this.setMarca(marca);
        this.setCategoria(categoria);
        this.setClase(clase);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }
}
