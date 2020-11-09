package com.brayanmezacastillo.netflix;

/*
* En principio, las clases anteriores no son padre-hija,
* pero sí tienen atributos en común. Realiza el análisis correcto
* e impleméntalo para tener un óptimo resultado.
* */

public class Audiovisual implements IVisualizable{
    private String titulo;
    private String genero;
    private String creador;
    private String duracion;
    private boolean  visto;

    public String timeObserved = "0min / 0s";

    public Audiovisual(String titulo, String genero, String creador, String duracion, boolean visto) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto = visto;
    }

    //Un constructor default
    public Audiovisual() {

    }

    /* *
     * Un constructor con el titulo y creador.
     * Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto
     * */
    public Audiovisual(String titulo, String creador) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
        this.visto = false;
    }

    //Un constructor con todos los atributos, excepto visto.
    public Audiovisual(String titulo, String genero, String creador, String duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    /*
            Métodos:
    • Métodos get de todos los atributos, excepto visto.
    • Métodos set de todos los atributos, excepto visto.
    */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public boolean isvisto() {
        return visto;
    }

    public void setvisto(boolean visto) {
        this.visto = visto;
    }

    //marcarVisto() cambia el atributo de visto a true.
    @Override
    public void marcarVisto() {

        this.visto = true;
    }
    //esVisto() devuelve el estado del atributo visto.
    @Override
    public boolean esVisto() {
        return this.visto;
    }

    //esVisto() devuelve el estado del atributo visto.
    @Override
    public String tiempoVisto() {
        return this.timeObserved;
    }

    //tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.
    @Override
    public String toString() {
        return "titulo= " +titulo+
                "\ngenero= " +genero+
                "\ncreador= " +creador+
                "\nduracion= " +duracion+
                "\nvisto= " +visto;
    }
}
