package com.vates.modulo.IV.unitarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperacionesTest {
    Operaciones operaciones;
    @Before
    public void setUp() throws Exception {
        operaciones = new Operaciones();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Se ejecuta al finalizar todos los tests!");
    }

    @Ignore // ignorar el test. NO HACERLO NUNCA!!!
    public void deberiaSumarDosEnterosYDarVerde() {
        assertEquals("Este test falló por devolver un valor que no es igual al esperado",
                47, operaciones.sumar());

    }

    @Test
    public void testear() {

    }

    @Test
    public void restar() {
        operaciones.restar();
    }
}