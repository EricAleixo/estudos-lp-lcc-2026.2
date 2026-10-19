package org.interfaces.sons;

public class Tambor implements EmissorDeSom {

    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String getTamanho(){
        return tamanho;
    }

    public String getMarca(){
        return marca;
    }

    public String emitirSom(){
        return "Bum Bum!";
    }

}
