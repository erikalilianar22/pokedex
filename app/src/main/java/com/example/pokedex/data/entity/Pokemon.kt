package com.example.pokedex.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName= "pokemon_table")
data class Pokemon (
    @PrimaryKey var id: Int,
    var name: String
)
