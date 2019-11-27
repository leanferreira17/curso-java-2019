package com.vates.modulo.II.controlador;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ControladorDeExcepcionesTest {

    @Test(expected = IOException.class)
    public void dividirPorCero() throws Exception{
        ControladorDeExcepciones.dividirPorCero();
    }
}