package com.vates.modulo.I.controladores;

import com.vates.modulo.I.privado.ClaseConMiembrosPrivados;
import com.vates.modulo.I.protegido.ClaseConMiembrosProtegidos;
import com.vates.modulo.I.publico.ClaseConMiembrosPublicos;

public class ControladorPrincipal {

    public static void main(String[] args) {
        /*
        * De la clase pública podemos obtener absolutamente todo
        * */
        ClaseConMiembrosPublicos claseConMiembrosPublicos = new ClaseConMiembrosPublicos();

        /*
        * De la clase privada no podemos accesar a ninguno de sus miembros
        * */
        ClaseConMiembrosPrivados claseConMiembrosPrivados = new ClaseConMiembrosPrivados();

        /*
        * De la clase protegida solo podremos ver sus métodos y atributos si somos hijos o estamos en el mismo paquete
        * */
        ClaseConMiembrosProtegidos claseConMiembrosProtegidos = new ClaseConMiembrosProtegidos();

        /*
        * Extendemos de ClaseConMiembrosProtegidos y vemos el comportamiento
        * */
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal();
        //controladorPrincipal.imprimirDatos();
    }
}
