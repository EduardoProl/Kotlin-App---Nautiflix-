package com.example.nautiflix.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nautiflix.model.Filme

@Composable
fun MovieCard(navController: NavController, Capa : Int, Titulo : String, filme: Filme){
    Card(modifier = Modifier
        .width(160.dp)
        .height(250.dp)
        .padding(10.dp)
        .shadow(10.dp)
        .clickable(true, onClick = {
            filme_clicado = filme
            viewModel.navegar(navController, "Filme")

        })
    ){
        Box(modifier = Modifier
            .fillMaxSize()){
            Image(painter = painterResource(id = Capa),
                contentDescription = "",
                contentScale = ContentScale.FillBounds)
            Box(modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(Color(50, 50, 50, 0xAA))
                .fillMaxWidth()
            )
            {
                Text(modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(10.dp)
                    , text = Titulo,
                    color = if(estado.tema == 1) Color(0xFFd9d9d9) else (if(estado.tema==2) Color(0xFFd1ddde) else if(isSystemInDarkTheme())  Color(0xFFd9d9d9) else Color(0xFFd1ddde)),
                    fontSize = 15.sp
                )
            }

        }
    }

}
