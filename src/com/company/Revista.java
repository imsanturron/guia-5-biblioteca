package com.company;

import java.util.UUID;

public class Revista extends Ejemplar implements Diarevista {
    boolean is = false;

    public Revista(UUID codigo, String titulo, String año) {
        super(codigo, titulo, año);
    }

    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void alquilado() {

    }
}
