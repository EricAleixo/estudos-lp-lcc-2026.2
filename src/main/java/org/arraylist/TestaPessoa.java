package org.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            System.out.printf("Digite o nome da %d° pessoa: ", i);
            String nome = scan.nextLine();

            System.out.printf("Digite a idade de %s: ", nome);
            int idade = Integer.parseInt(scan.nextLine());

            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas.add(pessoa);
        }

        for(int i = 0; i < pessoas.size(); i++){
            Pessoa pessoa = pessoas.get(i);
            if(pessoa.ehDeMaior()){
                System.out.println(pessoa.getNome() + " é maior de idade!");
            }else{
                System.out.println(pessoa.getNome() + " é menor de idade!");
            }
        }

    }

}
