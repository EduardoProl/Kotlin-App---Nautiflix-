package com.example.nautiflix.views

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.nautiflix.R

@Composable
fun BottomNavigationBar(navController: NavController) {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "User")
    val icons = listOf(R.drawable.ic_home, R.drawable.ic_user) // Example icons, replace with your own

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = icons[index]),
                        contentDescription = null,
                        modifier = Modifier.width(30.dp)
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    val destination = if (item == "Home") "Principal" else "Utilizador"
                    if (destination == "Utilizador" && !estado.isUserLoggedIn){
                        viewModel.navegar(navController,"Autenticar")
                    }else{
                        viewModel.navegar(navController, destination)}
                }
            )
        }
    }
}
