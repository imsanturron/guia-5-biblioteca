package com.company;

import java.util.UUID;

public class Diario extends Ejemplar implements Diarevista {
    boolean is = false;

    public Diario(UUID codigo, String titulo, String año) {
        super(codigo, titulo, año);
    }

    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void alquilado() {///xq puede llamar y romper sin sentido

    }
}
