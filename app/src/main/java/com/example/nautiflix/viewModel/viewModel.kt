package com.example.nautiflix.viewModel

import android.util.Log
import android.widget.Toast
import androidx.navigation.NavController
import com.example.nautiflix.model.Filme
import com.example.nautiflix.model.appState
import com.example.nautiflix.model.catalogo
import com.example.nautiflix.views.estado
import com.google.firebase.auth.FirebaseAuth

class viewModel {
    lateinit var filme_clicado : Filme
    lateinit var estado : appState
    private lateinit var auth: FirebaseAuth
    private var filmes : catalogo = catalogo()

    fun login(auth: FirebaseAuth, email: String, password: String, navController: NavController) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Navegue para a tela principal após o login bem-sucedido
                    com.example.nautiflix.views.estado.isUserLoggedIn = true
                    navController.navigate("Principal")
                } else {
                    // Mostre uma mensagem de erro
                    Toast.makeText(navController.context, "Login failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }

    fun signUp(auth: FirebaseAuth, email: String, password: String, navController: NavController) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    // Navegue para a tela principal após o cadastro bem-sucedido
                    Log.d("Info", "createUserWithEmail:success")
                    com.example.nautiflix.views.estado.isUserLoggedIn = true
                    navController.navigate("Principal")
                } else {
                    // Mostre uma mensagem de erro
                    Log.println(Log.ERROR,"Error","Sign Up failed: ${task.exception?.message}")
                    Toast.makeText(navController.context, "Sign Up failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }

    fun reporSenha(auth: FirebaseAuth){
        auth.sendPasswordResetEmail("Este email foi enviado para redefinir a password para a tua conta da Nautiflix! Se não pediste a reposição de password, ignora este email.")
    }

    fun navegar(navController: NavController, zona:String){
        navController.navigate(zona){
            popUpTo(navController.graph.startDestinationId) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }

}