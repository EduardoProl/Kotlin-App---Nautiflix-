package com.example.nautiflix.views

import android.util.Log
import android.widget.Toast
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nautiflix.model.Filme
import com.example.nautiflix.model.appState
import com.example.nautiflix.model.catalogo
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
lateinit var filme_clicado : Filme
lateinit var estado : appState
private lateinit var auth: FirebaseAuth
private var filmes : catalogo = catalogo()

@Composable
fun HomeScreen( authentication: FirebaseAuth){
    val navControler = rememberNavController()
    estado = appState(false,3, null, null, null)
    auth = Firebase.auth
    NavHost(navController = navControler, startDestination = "Principal"){
        composable("Principal",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1000)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 1000)) }
        ){
            PaginaPrincipal(navControler, filmes)
        }
        composable("Filme",
            enterTransition = { fadeIn(animationSpec = tween(durationMillis = 1000)) },
            exitTransition = { fadeOut(animationSpec = tween(durationMillis = 1000)) }
        ){
            PaginaFilme(navControler)
        }

        composable("Sobre"){
            Sobre(navControler)
        }

        composable("Utilizador"){
            PaginaUtilizador(navControler, auth)
        }
        composable("Definicoes"){
            PaginaDefinicoes(navControler)
        }
        composable("Autenticar"){
            AuthScreen(navControler)
        }
    }
}


