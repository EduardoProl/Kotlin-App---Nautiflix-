package com.example.nautiflix.model

data class appState (
    var isUserLoggedIn : Boolean,
    var tema : Int,
    var email_user : String?,
    var password_user : String?,
    var filme_clicado : Filme?
)