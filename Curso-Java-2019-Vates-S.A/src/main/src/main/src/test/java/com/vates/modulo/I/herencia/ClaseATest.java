package com.vates.modulo.I.herencia;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClaseATest {

    @Test
    public void getCantidadDeProcesosPublicos() {
        ClaseA claseA = new ClaseA();
        assertEquals(5, claseA.getCantidadDeProcesosPublicos());
    }
}