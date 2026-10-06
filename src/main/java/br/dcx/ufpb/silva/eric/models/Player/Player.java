package br.dcx.ufpb.silva.eric.models.Player;

import br.dcx.ufpb.silva.eric.models.Pokemon.Pokemon;

public class Player {

    private final Pokemon[] pokemonsList = new Pokemon[3];
    private int indice = 0;

    public void addPokemon(Pokemon pokemon){
        pokemonsList[indice] = pokemon;
        indice++;
    }

    public Pokemon[] getPokemons(){
        return this.pokemonsList;
    }
}
