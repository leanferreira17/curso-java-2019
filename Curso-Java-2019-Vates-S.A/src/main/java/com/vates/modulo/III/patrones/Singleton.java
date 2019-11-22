package com.vates.modulo.III.patrones;

public class Singleton {
    public static void main(String[] args) {

        // el verdadero
        Messi.getSingletonInstance(400, 27, "Izquierda");
        // Pedro, el primo
        Messi.getSingletonInstance(0, 0, "Derecha");
        Messi.getSingletonInstance(67, 89, "Ambas");
        Messi.getSingletonInstance(1, 0, "Derecha");
        Messi.getSingletonInstance(1789, 190, "Derecha");

        for (Messi messi : Messi.getMessis()) {
            System.out.println(messi.toString());
        }
    }
}

class Messi {
    private int cantidadDeGolesConvertidos;
    private int cantidadDeCampeonatosGanados;
    private String piernaHabil;
    private static Messi[] messis = new Messi[4];

    @Override
    public String toString() {
        return "Messi{" +
                "cantidadDeGolesConvertidos=" + cantidadDeGolesConvertidos +
                ", cantidadDeCampeonatosGanados=" + cantidadDeCampeonatosGanados +
                ", piernaHabil='" + piernaHabil + '\'' +
                '}';
    }

    private static int contador = 0;

    /*
    el constructor es privado para no permitir que se cree otra instancia del objeto
     */
    private Messi(int cantidadDeGolesConvertidos, int cantidadDeCampeonatosGanados, String piernaHabil) {
        this.setCantidadDeGolesConvertidos(cantidadDeGolesConvertidos);
        this.setCantidadDeCampeonatosGanados(cantidadDeCampeonatosGanados);
        this.setPiernaHabil(piernaHabil);
        System.out.println("Hemos creado a Messi");
    }

    public static void getSingletonInstance(int cantidadDeGolesConvertidos, int cantidadDeCampeonatosGanados, String piernaHabil) {
        if (contador < getMessis().length) {
            getMessis()[contador] = new Messi(cantidadDeGolesConvertidos, cantidadDeCampeonatosGanados, piernaHabil);
        }
        contador++;
    }

    public static Messi[] getMessis() {
        return messis;
    }

    public int getCantidadDeGolesConvertidos() {
        return cantidadDeGolesConvertidos;
    }

    public void setCantidadDeGolesConvertidos(int cantidadDeGolesConvertidos) {
        this.cantidadDeGolesConvertidos = cantidadDeGolesConvertidos;
    }

    public int getCantidadDeCampeonatosGanados() {
        return cantidadDeCampeonatosGanados;
    }

    public void setCantidadDeCampeonatosGanados(int cantidadDeCampeonatosGanados) {
        this.cantidadDeCampeonatosGanados = cantidadDeCampeonatosGanados;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }
}