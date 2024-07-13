package com.example.nautiflix.views

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nautiflix.R


@Composable
fun PaginaFilme(navController: NavController){
    val uriHandler = LocalUriHandler.current
    val filme = filme_clicado
    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            if (estado.tema == 1) Color(0xFF344c64) else (if (estado.tema == 2) Color(0xFF46c1c9) else if (isSystemInDarkTheme()) Color(
                0xFF344c64
            ) else Color(0xFF46c1c9)),
        )){
        Column {
            Capa(navController, filme.capa , filme.titulo)
            Text(
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Justify,
                color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                fontSize = 20.sp,
                text = filme.sinopse)
            HorizontalDivider(modifier = Modifier.padding(10.dp), color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)), thickness = 1.dp)
            Row(modifier = Modifier.align(Alignment.CenterHorizontally), horizontalArrangement = Arrangement.SpaceEvenly){
                Text(modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(horizontal = 20.dp), color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)), fontSize = 20.sp, text = filme.categoriasSTR)
            }
            Spacer(modifier = Modifier.padding(50.dp))
            ElevatedButton(onClick = {
                if( estado.isUserLoggedIn) {

                    uriHandler.openUri(filme_clicado.url)
                }
                else{
                    viewModel.navegar(navController, "autenticar")
                }
            }, modifier= Modifier
                .height(80.dp)
                .width(150.dp)
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)) {
                Text(text= stringResource(R.string.play), fontSize = 20.sp)
            }
        }
    }
}
