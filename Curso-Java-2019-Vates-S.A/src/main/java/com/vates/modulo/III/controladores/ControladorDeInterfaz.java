package com.vates.modulo.III.controladores;

import com.vates.modulo.III.interfaces.Presionable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ControladorDeInterfaz {
    public static void main(String[] args) {
        List<Presionable> presionables = new ArrayList<>();
        presionables.add(new BotonApagar());
        presionables.add(new Mensaje("asdf"));
        presionables.add(new Imagen());

        presionables.forEach(presionable -> System.out.println(presionable.getMensaje()));
    }
}

class BotonApagar extends Mensaje implements Presionable {
    private String mensaje = "Has presionado apagar. Apagando el sistema.";

    @Override
    public String presionar() {
        return mensaje;
    }

    @Override
    public String getMensaje() {
        return null;
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

    public Mensaje(String algo) {
        System.out.println(algo);
    }

    public Mensaje() {}
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
        return this.valorNominal;
    }
}
