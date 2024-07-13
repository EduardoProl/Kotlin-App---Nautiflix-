package com.example.nautiflix.model

data class Utilizador (
    val Nome : String,
    val email : String,
    val ProfilePic : Int,
    val gostos : Array<Int>
)