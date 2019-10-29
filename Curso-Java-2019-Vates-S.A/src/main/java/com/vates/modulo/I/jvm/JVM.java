package com.vates.modulo.I.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JVM {
    public static void main(String[] args) {
        /**
         * Carga
         * */
        Piloto piloto = new Piloto();
        Class aClass = piloto.getClass();

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        /**
         * Inicialización
         * */
        // clase String es cargado por bootstrap loader, y
        // bootstrap loader no es un objeto de Java, por lo tanto nulo
        System.out.println(String.class.getClassLoader());

        // La clase Test es cargada por Application loader
        System.out.println(Piloto.class.getClassLoader());
    }
}

class Piloto {
    public String nombre;

    public String getNombre() {
        return this.nombre;
    }
}
