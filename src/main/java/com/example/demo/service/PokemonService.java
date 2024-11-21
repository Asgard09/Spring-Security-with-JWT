package com.example.demo.service;

import com.example.demo.dto.PokemonDTO;
import com.example.demo.dto.PokemonResponse;

public interface PokemonService {
    PokemonDTO createPokemon(PokemonDTO pokemonDto);
    PokemonResponse getAllPokemon(int pageNo, int pageSize);
    PokemonDTO getPokemonById(int id);
    PokemonDTO updatePokemon(PokemonDTO pokemonDto, int id);
    void deletePokemonId(int id);
}
