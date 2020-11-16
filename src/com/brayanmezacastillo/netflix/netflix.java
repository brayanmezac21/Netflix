package com.brayanmezacastillo.netflix;

import java.util.ArrayList;

public class netflix {

    public static void main(String[] args) {

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
        ArrayList<Serie> series = new ArrayList<Serie>();

        peliculas.add(new Pelicula("365 días", "Drama", "Barbara Bialowas, Tomasz Mandes", 2020, "2h"));
        peliculas.add(new Pelicula("El Padrino", "drama, mafia, epico", "Francis Ford Coppola", 1972, "2h 58m"));
        peliculas.add(new Pelicula("Bob Esponja: un héroe fuera del agua", "animado", " Paul Tibbitt, Mike Mitchell", 2017, "2h"));
        peliculas.add(new Pelicula("Spider-Man: de regreso a casa", "accion", "Jon Watts", 2017, "2h 13m"));
        peliculas.add(new Pelicula("La torre oscura", "Terror", "Nikolaj Arcel", 2017, "1h 35m"));


        series.add(new Serie("Élite", "Suspenso; Drama juvenil", "Francisco Ramos", "20h", 3));
        series.add(new Serie("you", "drama, suspenso", "Greg Berlanti, Sera Gamble", "24h", 2));
        series.add(new Serie("Stranger Things", "Matt Duffer, Ross Duffer", 3));
        series.add(new Serie("Titanes", "Akiva Goldsman, Geoff Johns y Greg Berlanti", 2));
        series.add(new Serie("Parasyte: The Maxim", "Hitoshi Iwaaki", 2));


        peliculas.get(1).marcarVisto();
        peliculas.get(3).marcarVisto();
        series.get(3).marcarVisto();
        series.get(4).marcarVisto();

        try {
            for(int i=0; i<4;i++) {

                System.out.println(series.toString());
                System.out.println("__________________");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error al tratar de mostar lista de series\n  ):\n");
        }finally {
            System.out.println("\n todo ok :)");
        }

        try {
            for(int i=0; i<4;i++) {

                System.out.println(peliculas.toString());
                System.out.println("__________________");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error al tratar de mostar lista de peliculas\n  ):\n");
        }finally {
            System.out.println("\n todo ok :)");
        }



    }
}

