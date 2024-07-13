package com.example.nautiflix.views

import android.app.Activity
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nautiflix.R
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth


@Composable
fun PaginaUtilizador(navController: NavController, auth: FirebaseAuth){
    val activity = (LocalContext.current as? Activity)
    ModalNavigationDrawer(
        modifier = Modifier.width(80.dp),
        drawerContent = {
            ModalDrawerSheet (modifier = Modifier.requiredWidth(250.dp)){
                Scaffold(
                    bottomBar = { Text(text = stringResource(R.string.encontraste_um_erro), textAlign = TextAlign.Center, modifier = Modifier.padding(horizontal = 40.dp , vertical= 10.dp) ) }
                ) {it
                    Column(){
                        Text("Menu", modifier = Modifier.padding(16.dp))
                        Image(painter = painterResource(id = R.drawable.logo2 ), contentDescription = "Logo", modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .height(180.dp)
                            .aspectRatio(1f)
                            .clip(
                                RoundedCornerShape(100)
                            ))
                        Spacer(modifier = Modifier.padding(10.dp))
                        HorizontalDivider()
                        NavigationDrawerItem(
                            label = { Text(text = stringResource(R.string.definicoes)) },
                            selected = false,
                            onClick = { viewModel.navegar(navController,"Definicoes") }
                        )
                        NavigationDrawerItem(
                            label = { Text(text = stringResource(R.string.sobre)) },
                            selected = false,
                            onClick = { viewModel.navegar(navController,"Sobre") }
                        )
                        NavigationDrawerItem(
                            label = { Text(text = stringResource(R.string.sair)) },
                            selected = false,
                            onClick = { activity?.finish() }
                        )
                    }

                }


            }
        }
    ) {
        Scaffold(
            bottomBar = {BottomNavigationBar(navController)}

        ) {
            it

            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    if (estado.tema == 1) Color(0xFF344c64) else (if (estado.tema == 2) Color(
                        0xFF46c1c9
                    ) else if (isSystemInDarkTheme()) Color(
                        0xFF344c64
                    ) else Color(0xFF46c1c9)),
                )){


                Column {
                    Spacer(modifier = Modifier.padding(80.dp))
                    Row(modifier= Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()){
                        Image(painter = painterResource(id = R.drawable.user_profile_pic), contentDescription = "User Profile Picture", modifier = Modifier
                            .padding(horizontal = 90.dp)
                            .size(200.dp)
                            .clip(CircleShape)
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))

                    Text(modifier = Modifier.align(Alignment.CenterHorizontally),text="Sessão Iniciada em ${estado.email_user}")
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { viewModel.reporSenha(auth)
                            Toast.makeText(navController.context,"Mensagem enviada com sucesso", Toast.LENGTH_LONG).show()},
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ){
                        Text(stringResource(R.string.redefinir_senha))

                    }
                    Spacer(modifier = Modifier.height(30.dp))
                    Button(
                        onClick = {
                            Firebase.auth.signOut()
                            estado.isUserLoggedIn = false
                            estado.email_user=""
                            viewModel.navegar(navController, "Principal")
                        },
                        modifier = Modifier
                            .padding(horizontal = 140.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            "Terminar Sessão"
                        )

                    }



                }
            }
        }
    }



}
