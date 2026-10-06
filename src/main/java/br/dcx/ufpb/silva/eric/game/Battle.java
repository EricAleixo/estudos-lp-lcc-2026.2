package br.dcx.ufpb.silva.eric.game;

import br.dcx.ufpb.silva.eric.models.Player.Player;
import br.dcx.ufpb.silva.eric.models.Pokemon.Pokemon;
import br.dcx.ufpb.silva.eric.utils.PokemonsManipulation;

import java.util.Scanner;

public class Battle {

    private final int MAX_POKEMONS_TO_GAME = 10;

    private final Pokemon[] POKEMONS_OPTIONS = new Pokemon[MAX_POKEMONS_TO_GAME];

    private final Double MAX_POWER_POKEMON = 100.0;
    private final Double MIN_POWER_POKEMON = 5.0;

    private final Scanner scanner = new Scanner(System.in);
    private final PokemonsManipulation pokemonsManipulation = new PokemonsManipulation(POKEMONS_OPTIONS);

    Player player1 = new Player();
    Player player2 = new Player();

    String time = "player1";

    public Battle(){
        Pokemon[] pokemonList = new PokemonList().getPokemons();

        for(int i = 0; i < MAX_POKEMONS_TO_GAME; i++){
            Pokemon pokemon = pokemonList[i];
            pokemon.setPower(generatePowerRandomOfPokemon());

            this.POKEMONS_OPTIONS[i] = pokemon;
        }
    }

    public void start(){
        System.out.println("Começou");
        selectPokemon();
        initBattle();
    }

    private void selectPokemon(){

        for(int i = 0; i < 6; i++){
            pokemonsManipulation.displayPokemonList(this.POKEMONS_OPTIONS);
            System.out.println("=============================================");
            System.out.println("Vez do jogador " + time);
            System.out.println("=============================================");

            System.out.print("\nEscolha seu pokemon: ");


            String pokemonName = scanner.nextLine();

            Pokemon pokemon = pokemonsManipulation.findByName(pokemonName);

            if(pokemon == null){
                System.out.println("Pokemon não existente");
                return;
            }

            if(time.equals("player1")){
                player1.addPokemon(pokemon);
                time = "player2";
            }else{
                player2.addPokemon(pokemon);
                time = "player1";
            }

            pokemonsManipulation.remove(pokemon);

            System.out.println(pokemon.getName() + " adicionado com sucesso!\n");
        }

        System.out.println("Pokemons do jogador 1: ");
        pokemonsManipulation.displayPokemonList(player1.getPokemons());

        System.out.println("\nPokemons do jogador 2: ");
        pokemonsManipulation.displayPokemonList(player2.getPokemons());

    }

    private void initBattle(){
        time = "player1";
        System.out.println("========== Iniciando batalha ==========");

        System.out.println("---------- Vez do jogador " + time + " -----------");
    }

    private Double generatePowerRandomOfPokemon(){
        return Math.floor(Math.random() * (MAX_POWER_POKEMON  - MIN_POWER_POKEMON + 1) + MIN_POWER_POKEMON);
    }

}
