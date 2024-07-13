package com.example.nautiflix.views

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nautiflix.R
import com.example.nautiflix.model.catalogo

@Composable
fun PaginaPrincipal(navController: NavController, filmes: catalogo){
    val activity = (LocalContext.current as? Activity)
    val Drama = filmes.filmesDrama
    val Comedia = filmes.filmesComedia
    val Acao = filmes.filmesAcao
    val Aventura = filmes.filmesAventura
    val RomCom = filmes.filmesComediasRomanticas
    val Western = filmes.filmesWestern
    val Misterio = filmes.filmesMisterio
    val Sci_fi = filmes.filmesFiccaoCientifica
    val Noir = filmes.filmesNoir
    val Romance = filmes.filmesRomance
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
                    LazyColumn {
                        item {
                            Categoria(navController, stringResource(R.string.filmes_acao), Acao)
                            Categoria(navController, stringResource(R.string.filmes_de_aventura), Aventura)
                            Categoria(navController, stringResource(R.string.filmes_de_comedia), Comedia)
                            Categoria(navController, stringResource(R.string.filmes_comedias_romanticas), RomCom)
                            Categoria(navController, stringResource(R.string.filmes_de_drama), Drama)
                            Categoria(navController, stringResource(R.string.filmes_de_ficcao_cientifica),Sci_fi)
                            Categoria(navController, stringResource(R.string.filmes_de_misterio), Misterio)
                            Categoria(navController, stringResource(R.string.filmes_noir), Noir)
                            Categoria(navController, stringResource(R.string.filmes_de_romance), Romance)
                            Categoria(navController, stringResource(R.string.filmes_western), Western)
                            Spacer(modifier = Modifier.padding(50.dp))
                        }
                    }


                }


            }
        }
    }



}
