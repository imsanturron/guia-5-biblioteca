package com.company;

import java.util.UUID;

public class Ejemplar {
    protected UUID codigo;
    protected String titulo;
    protected String año;

    public Ejemplar(UUID codigo, String titulo, String año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }
}
