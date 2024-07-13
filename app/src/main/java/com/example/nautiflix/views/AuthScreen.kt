package com.example.nautiflix.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.example.nautiflix.viewModel.viewModel


@Composable
fun AuthScreen(navController: NavController) {
    var isLoginScreen by remember { mutableStateOf(true) }
    val auth = Firebase.auth

    Scaffold(
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF36556F))
                    .padding(paddingValues)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = if (isLoginScreen) "Login" else "Sign Up",
                        fontSize = 24.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    AuthForm(
                        isLoginScreen = isLoginScreen,
                        auth = auth,
                        navController = navController
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = if (isLoginScreen) "Não tens uma conta? Cria uma!" else "Já tens uma conta? Inicia sessão!",
                        color = Color.White,
                        modifier = Modifier.clickable { isLoginScreen = !isLoginScreen }
                    )
                }
            }
        }
    )
}
