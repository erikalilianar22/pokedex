package com.example.pokedex

import android.arch.lifecycle.ViewModel
import com.example.pokedex.data.entity.Pokemon
import com.example.pokedex.repository.PokemonRepository

class MainViewModel(private val pokemonRepository: PokemonRepository) : ViewModel(){

    fun insert(pokemon:Pokemon){
        viewModelScope.launch{
            pokemonRepository.insert(pokemon)
        }
    }


}