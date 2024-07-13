package com.example.nautiflix.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.nautiflix.R
@Composable
fun Capa(navController: NavController, Img :Int, Titulo: String){
    Box(modifier = Modifier
        .height(280.dp)
        .background(
            if (estado.tema == 1) Color(0xFF344c64) else (if (estado.tema == 2) Color(0xFF46c1c9) else if (isSystemInDarkTheme()) Color(
                0xFF344c64
            ) else Color(0xFF46c1c9)),
        )){

        Image(modifier= Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .align(Alignment.TopCenter),painter = painterResource(id = Img), contentDescription = "")

        ElevatedButton(onClick = { viewModel.navegar(navController,"Principal") }, modifier= Modifier
            .height(60.dp)
            .width(100.dp)
            .align(Alignment.TopStart)
            .padding(10.dp)) {
            Text(text= stringResource(R.string.voltar), fontSize = 10.sp)
        }

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
