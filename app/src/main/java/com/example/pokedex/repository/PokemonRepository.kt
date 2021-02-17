package com.example.pokedex.repository

import com.example.pokedex.data.dao.PokemonDao
import com.example.pokedex.data.entity.Pokemon

class PokemonRepository(private val pokemonDao: PokemonDao) {
    suspend fun insert(pokemon : Pokemon)= pokemonDao.insert(pokemon)

}