package com.vates.modulo.III.genericos;

import java.util.ArrayList;
import java.util.List;

public class ClaseGenerica<T> {
    private T elemento;

    public ClaseGenerica(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return this.elemento;
    }

    public static <T> void getClassLoader(T elemento) {
        System.out.println(elemento.getClass().getClassLoader());
    }

    public static void main(String[] args) {

        ClaseGenerica<String> stringClaseGenerica = new ClaseGenerica<>("Elemento String");
        ClaseGenerica<Boolean> booleanClaseGenerica = new ClaseGenerica<>(true);
        ClaseGenerica<Float> floatClaseGenerica = new ClaseGenerica<>(34.98f);

        List<ClaseGenerica> listado = new ArrayList<>();
        listado.add(stringClaseGenerica);
        listado.add(booleanClaseGenerica);
        listado.add(floatClaseGenerica);

        for (ClaseGenerica item : listado) {
            System.out.println(item.getElemento());
        }

    }
}

class Operacion {
    public static <T, V extends Number> void comparar(T valor_1, V valor_2) {
        if (valor_1 == valor_2) {
            System.out.println("iguales");
        } else {
            System.out.println("distintos");
        }
    }

    public static void main(String[] args) {

        comparar(new Balon(), new Balon());
    }
}

class Balon extends Number {

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class Piano extends Number {

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}