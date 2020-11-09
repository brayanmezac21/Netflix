package com.brayanmezacastillo.netflix;

public class Serie extends Audiovisual implements IVisualizable{
    private  int nTemporadas;


    //Constructores

    //Un constructor default
    public Serie(int nTemporadas) {
        super();
        this.nTemporadas = 0;
    }

    /* *
     * Un constructor con el titulo y creador.
     * Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto
     * */
    public Serie(String titulo, String creador, int nTemporadas) {
        super(titulo, creador);
        this.nTemporadas = 1;
    }

    //Un constructor con todos los atributos, excepto visto.
    public Serie(String titulo, String genero, String creador, String duracion, int nTemporadas) {
        super(titulo, genero, creador, duracion);
        this.nTemporadas = nTemporadas;
    }




    /*
            Métodos:
    • Métodos get de todos los atributos, excepto visto.
    • Métodos set de todos los atributos, excepto visto.
    */
    public int getNTemporadas() {
        return nTemporadas;
    }

    public void setNTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    //Sobreescribe el método toString.
    @Override
    public String toString() {
        return "    Serie\n__________________\n" +super.toString()+
                "\nNumero de Temporadas=" + nTemporadas;
    }
}
