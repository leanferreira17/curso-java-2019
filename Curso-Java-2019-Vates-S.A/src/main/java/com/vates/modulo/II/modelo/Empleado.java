package com.vates.modulo.II.modelo;

import com.vates.modulo.II.excepciones.SueldoNegativoException;

public abstract class Empleado {
    private float sueldoBasico;

    public void setSueldoBasico(float sueldo) throws SueldoNegativoException {
        if (sueldo < 0) {
            throw new SueldoNegativoException("El monto ingresado es menor a 0. Por favor ingrese un monto positivo.");
        }
        this.sueldoBasico = sueldo;
    }
}
