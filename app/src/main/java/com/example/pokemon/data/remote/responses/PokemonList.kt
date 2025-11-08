package com.example.pokemon.data.remote.responses

data class PokemonList(
    val count: Int,
    val next: String,
    val results: List<Result>
)