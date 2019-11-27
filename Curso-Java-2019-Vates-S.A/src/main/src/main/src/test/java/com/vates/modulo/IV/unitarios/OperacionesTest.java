package com.vates.modulo.IV.unitarios;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperacionesTest {

    @Test
    public void sumar() {
        Operaciones  operaciones = new Operaciones();

        int valorEsperado = 51;
        int valorActual = operaciones.sumar();

        assertEquals(valorEsperado, valorActual);
    }
}