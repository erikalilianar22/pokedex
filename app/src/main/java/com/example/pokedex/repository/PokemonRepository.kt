package com.example.pokedex.repository

import com.example.pokedex.network.PokeAPI
import com.example.pokedex.data.dao.PokemonDao
import com.example.pokedex.data.entity.Pokemon

class PokemonRepository(private val pokemonDao: PokemonDao) {
    private val API = PokeAPI.retrofitService

    suspend fun insert(pokemon : Pokemon)= pokemonDao.insert(pokemon)
    suspend fun getPokemon(query: String)= API.getPokemon(query)
    fun getSource()= pokemonDao.getSource()

}