package com.company;

import java.util.UUID;

public class Libro extends Ejemplar {
    private Genero genero;
    private boolean alquilado = false;

    public Libro(UUID codigo, String titulo, String año, Genero generox) {
        super(codigo, titulo, año);
        this.genero = generox;
    }

    public void alquilar() {
        if (alquilado)
            System.out.println("este libro ya esta alquilado");
        else
            alquilado = true;
    }

    public void devolver(){
        if(alquilado)
            alquilado=false;
        else
            System.out.println("este libro no estaba alquilado!");
        ///------------------------------------------------------///
    }


}
