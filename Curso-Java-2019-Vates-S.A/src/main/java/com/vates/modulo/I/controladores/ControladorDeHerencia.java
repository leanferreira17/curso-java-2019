package com.vates.modulo.I.controladores;

import com.vates.modulo.I.herencia.ClaseB;
import com.vates.modulo.I.herencia.ClaseC;

public class ControladorDeHerencia {
    public static void main(String[] args) {
        ClaseB claseB = new ClaseB();
        //System.out.println(claseB.Apellido);

        ClaseC claseC = new ClaseC();
        //System.out.println(claseC.Apellido);
        
        claseC.getCantidadDeProcesosPublicos();
    }
}
