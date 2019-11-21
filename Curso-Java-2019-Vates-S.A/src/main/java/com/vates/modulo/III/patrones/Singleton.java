package com.vates.modulo.III.patrones;

public class Singleton {
    public static void main(String[] args) {

        // el verdadero
        Messi leonel = Messi.getSingletonInstance(400, 27, "Izquierda");
        // Pedro, el primo
        Messi pedro = Messi.getSingletonInstance(0, 0, "Derecha");

        // Leonel y Pedro son referencias a un único objeto de la clase Messi
        System.out.println(leonel.getCantidadDeCampeonatosGanados());
        System.out.println(pedro.getCantidadDeCampeonatosGanados());
    }
}

class Messi {
    private int cantidadDeGolesConvertidos;
    private int cantidadDeCampeonatosGanados;
    private String piernaHabil;
    private static Messi messi;

    /*
    el constructor es privado para no permitir que se cree otra instancia del objeto
     */
    private Messi(int cantidadDeGolesConvertidos, int cantidadDeCampeonatosGanados, String piernaHabil) {
        this.setCantidadDeGolesConvertidos(cantidadDeGolesConvertidos);
        this.setCantidadDeCampeonatosGanados(cantidadDeCampeonatosGanados);
        this.setPiernaHabil(piernaHabil);
        System.out.println("Hemos creado a Messi");
    }

    public static Messi getSingletonInstance(int cantidadDeGolesConvertidos, int cantidadDeCampeonatosGanados, String piernaHabil) {
        if (getMessi() == null) {
            setMessi(new Messi(cantidadDeGolesConvertidos, cantidadDeCampeonatosGanados, piernaHabil));
        } else {
            System.out.println("No se puede crear al jugador Messi, porque ya existe!");
        }

        return getMessi();
    }

    public static Messi getMessi() {
        return messi;
    }

    public static void setMessi(Messi messi) {
        Messi.messi = messi;
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