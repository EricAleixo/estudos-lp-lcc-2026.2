package br.dcx.ufpb.silva.eric.utils;

import br.dcx.ufpb.silva.eric.models.Pokemon.Pokemon;

public class PokemonsManipulation {

    private final Pokemon[] pokemonsList;

    public PokemonsManipulation(Pokemon[] pokemons){
        this.pokemonsList = pokemons;
    }

    public Pokemon findByName(String name){
        for(int i = 0; i < pokemonsList.length; i++){
            if(pokemonsList[i] != null && pokemonsList[i].getName().equalsIgnoreCase(name)){
                return pokemonsList[i];
            }
        }
        return null;
    }

    public void displayPokemonList(Pokemon[] pokemons){
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i] != null)
                System.out.println(pokemons[i]);
        }
    }

    public void remove(Pokemon pokemon){
        for(int i = 0; i < pokemonsList.length; i++){
            if(pokemonsList[i] != null && pokemonsList[i].getName().equals(pokemon.getName())){
                pokemonsList[i] = null;
            }
        }
    }
}
