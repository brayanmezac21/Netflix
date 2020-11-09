package com.brayanmezacastillo.netflix;

//Crea una clase llamada Pelicula
public class Pelicula extends Audiovisual implements IVisualizable {

    private int year;//año

    //Un constructor default
    public Pelicula() {
        super();
        this.year = 2020;
    }

    /*Un constructor con el titulo y creador.
     * Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto.*/
    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
        this.year = 0;
    }

    //Un constructor con todos los atributos, excepto visto.
    public Pelicula(String titulo, String genero, String creador, int year, String duracion) {
        super(titulo, genero, creador, duracion);
        this.year = year;

    }

    /*
            Métodos:
    • Métodos get de todos los atributos, excepto visto.
    • Métodos set de todos los atributos, excepto visto.
    */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Sobreescribe el método toString.
    @Override
    public String toString() {
        return "    Pelicula\n__________________\n" +super.toString()+"\n"+
                "year=" + year;
    }
}