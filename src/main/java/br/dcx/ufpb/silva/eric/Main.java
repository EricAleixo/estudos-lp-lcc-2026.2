package br.dcx.ufpb.silva.eric;

import br.dcx.ufpb.silva.eric.models.Pokemon;
import br.dcx.ufpb.silva.eric.models.Type;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos pokemons deseja adicionar: ");
        int quantPokemon = Integer.parseInt(scanner.nextLine());

        Pokemon[] pokemons = new Pokemon[quantPokemon];

        for(int i = 0; i < quantPokemon; i++){
            System.out.print("Digite o nome do pokemon: ");
            String name  = scanner.nextLine();

            System.out.print("Digite a descrição do pokemon: ");
            String description  = scanner.nextLine();

            System.out.print("Digite o tipo do pokemon: ");
            Type type = new Type(scanner.nextLine());

            System.out.print("Digite o poder do pokemon: ");
            Double power  = Double.parseDouble(scanner.nextLine());

            Pokemon pokemon = new Pokemon(name, description, type, power);
            pokemons[i] = pokemon;
            System.out.println(pokemon.getName() + " salvo com sucesso!");
        }

        System.out.println("Todos os pokemons adicionados foram: ");

        for (int i = 0; i < quantPokemon; i++){
            System.out.println("======================");
            System.out.println(pokemons[i].toString());
            System.out.println("======================");
        }

    }

}
