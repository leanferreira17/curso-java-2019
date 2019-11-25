package com.vates.modulo.III.interfaces;

public interface Presionable {

    // los atributos son final y públicos por definición
    String mensaje = "mensaje interno de la interfaz Presionable";
    String valorNominal = "atz";

    /**
     * No agregamos un modificador ya que implicitamente todos los miembros de clase son públicos
     */
    String presionar();
    String getMensaje();
}
