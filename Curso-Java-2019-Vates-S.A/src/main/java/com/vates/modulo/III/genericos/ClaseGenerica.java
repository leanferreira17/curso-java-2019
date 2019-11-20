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

        for (ClaseGenerica claseGenerica : listado) {
            System.out.println(claseGenerica.getElemento());
        }

    }
}
