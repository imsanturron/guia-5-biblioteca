package com.company;

import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ejemplar> ejemplares = new ArrayList<>();
        Libro libro1 = new Libro(UUID.randomUUID(), "Los mares del sur", "1979", Genero.POLICIAL);
        Libro libro2 = new Libro(UUID.randomUUID(), "Romeo y Julieta", "1597", Genero.ROMANTICO);
        Libro libro3 = new Libro(UUID.randomUUID(), "Soy leyenda", "1954", Genero.SCIFI);
        Diario diario1 = new Diario(UUID.randomUUID(), "Poder de todos", "1999");
        Diario diario2 = new Diario(UUID.randomUUID(), "CAMPEONES", "1986");
        Diario diario3 = new Diario(UUID.randomUUID(), "Menem de nuevo", "1996");
        Revista revista1 = new Revista(UUID.randomUUID(), "Los dos demonios", "2015");
        Revista revista2 = new Revista(UUID.randomUUID(), "Susana y dos", "2000");
        Revista revista3 = new Revista(UUID.randomUUID(), "Tinelli vuelve a la tv", "1993");

        ejemplares.add(libro1);
        ejemplares.add(libro2);
        ejemplares.add(libro3);
        ejemplares.add(diario1);
        ejemplares.add(diario2);
        ejemplares.add(diario3);
        ejemplares.add(revista1);
        ejemplares.add(revista2);
        ejemplares.add(revista3);

        for (Ejemplar e : ejemplares) {
            if (e instanceof Libro) {

            } else if (e instanceof Diario) {

            } else if (e instanceof Revista) {

            }
        }
    }
}
