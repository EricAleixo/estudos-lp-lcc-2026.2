package org.aleixo;

import javax.swing.*;

public class Apresentacao {

    public static void main(String[] args){
        String nome = "Elison";
        mudarNome(nome);
        System.out.println(nome);

    }

    static void mudarNome(String nome){
        nome = "Eric";
    }

}
