package com.brayanmezacastillo.netflix;

import java.io.IOException;

public class netflix {

    public static void main(String[] args) {

        Pelicula peliculas[] ={
                new Pelicula("365 días","Drama","Barbara Bialowas, Tomasz Mandes",2020,"2h"),
                new Pelicula("El Padrino","drama, mafia, epico","Francis Ford Coppola",1972,"2h 58m"),
                new Pelicula("Bob Esponja: un héroe fuera del agua","animado"," Paul Tibbitt, Mike Mitchell",2017,"2h"),
                new Pelicula("Spider-Man: de regreso a casa","accion","Jon Watts",2017,"2h 13m"),
                new Pelicula("La torre oscura","Terror","Nikolaj Arcel",2017,"1h 35m")
        };
        Serie series[] = {
                new Serie("Élite","Suspenso; Drama juvenil","Francisco Ramos","20h",3),
                new Serie("you","drama, suspenso","Greg Berlanti, Sera Gamble","24h",2),
                new Serie("Stranger Things","Matt Duffer, Ross Duffer",3),
                new Serie("Titanes","Akiva Goldsman, Geoff Johns y Greg Berlanti",2),
                new Serie("Parasyte: The Maxim","Hitoshi Iwaaki",2)
        };

        peliculas[1].marcarVisto();
        peliculas[3].marcarVisto();
        series[3].marcarVisto();
        series[4].marcarVisto();

        for(int i=0; i<4;i++){
            System.out.println(peliculas[i].toString());
            System.out.println("__________________");
        }
        for(int i=0; i<4;i++) {

            System.out.println(series[i].toString());
            System.out.println("__________________");
        }

    }
}

