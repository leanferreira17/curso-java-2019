package com.vates.modulo.II.controlador;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ControladorDeExcepcionesTest {

    @Test(expected = Exception.class)
    public void dividirPorCero() throws Exception{
        ControladorDeExcepciones.dividirPorCero();
        //ControladorDeExcepciones.main(); // NO HACER NUNCA!!!
    }

    // TODO: crear 3 test mas referidos a tal cosa
}