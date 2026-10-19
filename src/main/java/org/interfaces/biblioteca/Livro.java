package org.interfaces.biblioteca;

public class Livro {

    private String titulo;
    private String autor;
    private String genero;
    private int avaliacao;


    public Livro(String titulo, String autor, String genero, int avaliacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
