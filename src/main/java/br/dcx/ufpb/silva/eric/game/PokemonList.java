package br.dcx.ufpb.silva.eric.game;

import br.dcx.ufpb.silva.eric.models.Pokemon.Pokemon;
import br.dcx.ufpb.silva.eric.models.Pokemon.Type;

public class PokemonList {

    private final Pokemon[] pokemons = {
            new Pokemon("Pikachu", "Pokemon elétrico veloz", new Type("raio")),
            new Pokemon("Charizard", "Pokemon de fogo e voador", new Type("fogo")),
            new Pokemon("Squirtle", "Pokemon aquático resistente", new Type("água")),
            new Pokemon("Bulbasaur", "Pokemon de grama equilibrado", new Type("grama")),
            new Pokemon("Geodude", "Pokemon de terra e pedra", new Type("terra")),
            new Pokemon("Pidgey", "Pokemon voador ágil", new Type("voador")),
            new Pokemon("Raichu", "Pokemon elétrico poderoso", new Type("raio")),
            new Pokemon("Charmander", "Pokemon de fogo pequeno e rápido", new Type("fogo")),
            new Pokemon("Lapras", "Pokemon de água resistente e poderoso", new Type("água")),
            new Pokemon("Ivysaur", "Pokemon de grama evoluído", new Type("grama")),
            new Pokemon("Diglett", "Pokemon de terra que vive no subterrâneo", new Type("terra")),
            new Pokemon("Pidgeotto", "Pokemon voador experiente", new Type("voador")),
            new Pokemon("Electabuzz", "Pokemon elétrico com ataques fortes", new Type("raio")),
            new Pokemon("Growlithe", "Pokemon de fogo leal e ofensivo", new Type("fogo")),
            new Pokemon("Psyduck", "Pokemon de água com poderes misteriosos", new Type("água")),
            new Pokemon("Oddish", "Pokemon de grama que aparece à noite", new Type("grama")),
            new Pokemon("Onix", "Pokemon de terra enorme e resistente", new Type("terra")),
            new Pokemon("Spearow", "Pokemon voador agressivo e veloz", new Type("voador")),
            new Pokemon("Moltres", "Pokemon lendário de fogo", new Type("fogo")),
            new Pokemon("Zapdos", "Pokemon lendário elétrico e voador", new Type("raio"))
    };

    public Pokemon[] getPokemons() {
        return pokemons;
    }
}
