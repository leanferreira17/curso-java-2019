package com.vates.modulo.III.controladores;

import org.junit.Test;

import static org.junit.Assert.*;

public class BotonApagarTest {

    @Test
    public void getMensaje() {
        BotonApagar botonApagar = new BotonApagar();
        assertEquals(null, botonApagar.getMensaje());
    }
}