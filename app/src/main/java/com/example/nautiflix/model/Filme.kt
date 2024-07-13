package com.example.nautiflix.model


data class Filme(
    val url : String,
    val titulo : String,
    val capa : Int,
    val poster : Int,
    val sinopse : String,
    val categorias : Array<Int>,
    val categoriasSTR : String
)