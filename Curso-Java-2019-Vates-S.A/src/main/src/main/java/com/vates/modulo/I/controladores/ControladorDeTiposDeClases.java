package com.vates.modulo.I.controladores;

import com.vates.modulo.I.clases.ClaseEstatica;

public class ControladorDeTiposDeClases {
    public static void main(String[] args) {
        String nombreDeLaClase = ClaseEstatica.nombreDeLaClase;
        //System.out.println(nombreDeLaClase);

        String nombreDeLaClaseAnonimaYEstatica = ClaseEstatica.ClaseInternaYEstatica.nombreDeLaClase;
        System.out.println(nombreDeLaClaseAnonimaYEstatica);
    }
}
