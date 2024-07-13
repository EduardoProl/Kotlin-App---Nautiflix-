package com.example.nautiflix.views

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nautiflix.model.Filme

@Composable
fun Categoria(navController: NavController, Nome:String, filmes : Array<Filme>){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(270.dp)){
        Text(modifier = Modifier.padding(10.dp),color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)), text = Nome, fontSize = 25.sp, textDecoration = TextDecoration.Underline)
        LazyRow(modifier = Modifier
            .align(Alignment.BottomStart)
            .height(230.dp)){
            items(filmes.size){i ->
                MovieCard(navController, Capa = filmes[i].poster, Titulo = filmes[i].titulo, filmes[i])
            }
        }

    }
}