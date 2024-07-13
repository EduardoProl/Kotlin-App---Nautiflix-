package com.example.nautiflix.views

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nautiflix.R


@Composable
fun PaginaDefinicoes(navController: NavController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            if (estado.tema == 1) Color(0xFF344c64) else (if (estado.tema == 2) Color(0xFF46c1c9) else if (isSystemInDarkTheme()) Color(
                0xFF344c64
            ) else Color(0xFF46c1c9)),
        ))
    {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)) {
                ElevatedButton(onClick = { viewModel.navegar(navController,"Principal") }, modifier= Modifier
                    .height(60.dp)
                    .width(100.dp)
                    .padding(10.dp)) {
                    Text(text= stringResource(R.string.voltar), fontSize = 10.sp, modifier = Modifier.align(
                        Alignment.CenterVertically))
                }
                Spacer(modifier = Modifier.padding(35.dp))
                Text(
                    text = stringResource(R.string.definicoes),
                    color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,

                    )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                modifier = Modifier.padding(5.dp),
                text = stringResource(R.string.definir_tema),
                color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                fontSize = 20.sp)


            ElevatedButton(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(5.dp),onClick = { estado.tema = 1
                viewModel.navegar(navController, "Definicoes")}) {
                Text(
                    text = "Tema Escuro",
                    color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                    fontSize = 15.sp)
            }

            ElevatedButton(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(5.dp),onClick = { estado.tema = 2
                viewModel.navegar(navController, "Definicoes")}) {
                Text(
                    text = "Tema Claro",
                    color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                    fontSize = 15.sp)
            }

            ElevatedButton(modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(5.dp), onClick = {estado.tema = 3
                viewModel.navegar(navController, "Definicoes")}) {
                Text(
                    text = "Tema Do Sistema",
                    color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                    fontSize = 15.sp)
            }

        }
    }
}
