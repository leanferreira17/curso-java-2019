package com.vates.modulo.III.herramientas;

public class CalculadoraDeTiempoDeEjecucion {
    public static void main(String[] args) throws InterruptedException {
        long inicio = System.currentTimeMillis();

        Thread.sleep(2000);

        long fin = System.currentTimeMillis();

        double tiempo = (double) ((fin - inicio) / 1000);

        System.out.println(tiempo + " segundos");
    }
}
