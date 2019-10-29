package com.vates.modulo.I.protegido;

import java.text.MessageFormat;
import java.util.Random;

public class ClaseConMiembrosProtegidos {

    protected Random random = new Random();
    protected long id = random.nextLong();

    protected long getId() {
        return this.id;
    }

    protected String getNombreDeClase() {
        return this.getClass().getName();
    }

    protected void imprimirDatos() {
        System.out.println(MessageFormat.format(
                "La clase {0} tiene asignado el ID {1} y se encuentra dentro del paquete {2}",
                this.getNombreDeClase(),
                this.getId(),
                this.getClass().getPackage().getName()));
        /*
        * Observemos como la palabra 'this' hace referencia al objeto que llamó al método. Polimorfismo.
        * */
    }
}
