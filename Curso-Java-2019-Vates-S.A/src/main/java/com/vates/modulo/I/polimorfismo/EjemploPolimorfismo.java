package com.vates.modulo.I.polimorfismo;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class EjemploPolimorfismo {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Argentino());
        personas.add(new Ingles());
        personas.add(new Brasileno());

        personas.forEach(persona -> System.out.println(persona.saludar()));

//        personas = new Stack<>();
//        personas.add(new Argentino());
//        personas.add(new Ingles());
//        personas.add(new Brasileño());
//
//        personas.forEach(persona -> System.out.println(persona.getSaludo()));
    }
}

/*
 * Clase abstract de la cual solo es obligatorio sobreescribir los métodos que sean abstract.
 * Los demás métodos son opcionales de implementar y sobreescribir.
 * */
abstract class Persona {

    protected String saludo = "Hola";

    protected abstract String getSaludo();

    protected abstract String saludar();

    protected abstract String getNombreDeClase();

    protected ClassLoader getCargadorDeClaseAsociado() {
        return this.getClass().getClassLoader();
    }

    public String getNombreDePaqueteAlQuePerteneceLaClase() {
        return this.getClass().getPackage().getName();
    }
}

class Argentino extends Persona {
    private String saludo = "¡Buen dia!";

    @Override
    protected String getSaludo() {
        return this.saludo;
    }

    @Override
    protected String saludar() {
        return MessageFormat.format("El {0} saluda con un {1}", this.getNombreDeClase(), this.getSaludo());
    }

    @Override
    protected String getNombreDeClase() {
        return this.getClass().getName();
    }
}

class Ingles extends Persona {
    private String saludo = "Good morning!";

    @Override
    protected String getSaludo() {
        return this.saludo;
    }

    @Override
    protected String saludar() {
        return MessageFormat.format("El {0} saluda con un {1}", this.getNombreDeClase(), this.getSaludo());
    }

    @Override
    protected String getNombreDeClase() {
        return this.getClass().getName();
    }
}

class Brasileno extends Persona {
    private String saludo = "Bom-dia!";

    @Override
    protected String getSaludo() {
        return this.saludo;
    }

    @Override
    protected String saludar() {
        return MessageFormat.format("El {0} saluda con un {1}", this.getNombreDeClase(), this.getSaludo());
    }

    @Override
    protected String getNombreDeClase() {
        return this.getClass().getName();
    }
}
