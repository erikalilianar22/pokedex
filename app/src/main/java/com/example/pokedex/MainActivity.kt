package com.example.pokedex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pokedex.data.entity.Pokemon

class MainActivity : AppCompatActivity() {

    private val viewModelFactory by lazy{
        val myApplication = application as MyApplication
        val pokemonRepository = myApplication.pokemonRepository
        MainViewModelFactory(pokemonRepository)
    }

    private val viewModel: MainViewModel by viewModels{
        viewModelFactory

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.action_click)
        button.setOnClickListener {
            viewModel.insert(Pokemon(1,"Bulbasaur"))
        }
    }
}
