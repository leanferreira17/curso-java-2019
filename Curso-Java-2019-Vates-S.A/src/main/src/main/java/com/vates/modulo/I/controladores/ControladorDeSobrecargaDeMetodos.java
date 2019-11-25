package com.vates.modulo.I.controladores;

import java.text.MessageFormat;
import java.util.Date;

import static java.lang.System.out;

public class ControladorDeSobrecargaDeMetodos {
    public static void main(String[] args) {
        OficinaMeteorologica oficinaMeteorologica = new OficinaMeteorologica();

        out.println(oficinaMeteorologica.getInformacionMeteorologica());
        out.println(oficinaMeteorologica.getInformacionMeteorologica(new OndaDeRadio()));
        out.println(oficinaMeteorologica.getInformacionMeteorologica(new Email()));
    }
}

interface Consultable {
    public String getInformacionMeteorologica();

    public String getInformacionMeteorologica(OndaDeRadio ondaDeRadio);

    public String getInformacionMeteorologica(Email email);
}

class OficinaMeteorologica implements Consultable {

    private String coberturaDelCielo = "4/8";
    private String NombreDeLaOficina = "Oficina Meteorologica de Cordoba";
    private long idOficina = 1234522323l;
    private boolean probabilidadDeLluvia = true;
    private int temperaturaMinima = 2;
    private int temperaturaMaxima = 17;

    @Override
    public String getInformacionMeteorologica() {
        return MessageFormat.format(
                "{0} - {1}. Pronostico para hoy: cobertura del cielo {2}, temp max {3}, temp min {4}, prob lluvia {5}",
                getNombreDeLaOficina(),
                getIdOficina(),
                getCoberturaDelCielo(),
                getTemperaturaMaxima(),
                getTemperaturaMinima(),
                isProbabilidadDeLluvia());
    }

    @Override
    public String getInformacionMeteorologica(OndaDeRadio ondaDeRadio) {
        return MessageFormat.format(
                "{0} {1} TX{2} TN{3} prec {4}",
                getNombreDeLaOficina(),
                getCoberturaDelCielo(),
                getTemperaturaMaxima(),
                getTemperaturaMinima(),
                isProbabilidadDeLluvia());
    }

    @Override
    public String getInformacionMeteorologica(Email email) {
        return MessageFormat.format(
                "{0} - {1}. Pronostico para {2} : cobertura del cielo {3}, temp max {4}, temp min {5}, prob lluvia {6}",
                getNombreDeLaOficina(),
                getIdOficina(),
                new Date(),
                getCoberturaDelCielo(),
                getTemperaturaMaxima(),
                getTemperaturaMinima(),
                isProbabilidadDeLluvia());
    }

    public String getCoberturaDelCielo() {
        return coberturaDelCielo;
    }

    public String getNombreDeLaOficina() {
        return NombreDeLaOficina;
    }

    public long getIdOficina() {
        return idOficina;
    }

    public boolean isProbabilidadDeLluvia() {
        return probabilidadDeLluvia;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
}

class OndaDeRadio {
}

class Email {
}
