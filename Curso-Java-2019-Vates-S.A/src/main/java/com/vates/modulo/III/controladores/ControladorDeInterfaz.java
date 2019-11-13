package com.vates.modulo.III.controladores;

import com.vates.modulo.III.interfaces.Presionable;

import java.util.ArrayList;
import java.util.List;

public class ControladorDeInterfaz {
    public static void main(String[] args) {
        List<Presionable> presionables = new ArrayList<>();
        presionables.add(new BotonApagar());
        presionables.add(new Mensaje());
        presionables.add(new Imagen());

        presionables.forEach(presionable -> System.out.println(presionable.getMensaje()));
    }
}

class BotonApagar implements Presionable {
    private String mensaje = "Has presionado apagar. Apagando el sistema.";

    @Override
    public String presionar(){
        return this.mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }
}

class Mensaje implements Presionable {
    private String mensaje = "Se cerró el cuadro de mensajes";

    @Override
    public String presionar() {
        return this.mensaje;
    }

    @Override
    public String getMensaje() {
        return valorNominal;
    }
}

class Imagen implements Presionable{
    private String mensaje = "Mostrando descripción de la imágen";

    @Override
    public String presionar() {
        return this.mensaje;
    }

    @Override
    public String getMensaje() {
        //valorNominal = "asd";
        return valorNominal;
    }
}
