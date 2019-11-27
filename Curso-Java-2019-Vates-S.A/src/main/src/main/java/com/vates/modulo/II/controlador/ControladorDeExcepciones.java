package com.vates.modulo.II.controlador;

import com.vates.modulo.II.excepciones.SueldoNegativoException;
import com.vates.modulo.II.modelo.Empleado;
import com.vates.modulo.II.modelo.Programador;
import com.vates.modulo.II.modelo.RRHH;

import java.io.IOException;

public class ControladorDeExcepciones {
    public static void main(String[] args) {

        try {
            darDeAltaNuevoEmpleado();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (SueldoNegativoException e) {
            System.out.println(e);
        }
        finally {
            //return ex;
        }
    }

    public static void dividirPorCero() throws IOException {
        int dividendo = 9;
        int divisor = 0;

        //int resultado = dividendo / divisor;
        //System.out.println("El resultado es:" + resultado);
        throw new IOException();
    }

    private static void darDeAltaNuevoEmpleado() throws SueldoNegativoException {
        Empleado empleado = new Programador();
        empleado.setSueldoBasico(987999999);
        RRHH.darDeAltaNuevoEmpleadoParaLaCompania(empleado);
    }
}
