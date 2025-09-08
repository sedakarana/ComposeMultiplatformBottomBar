package com.sedakarana.bottombar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bottombar.composeapp.generated.resources.Res
import bottombar.composeapp.generated.resources.home
import bottombar.composeapp.generated.resources.settings
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomBarPage() {
    val selectedPage = remember { mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            BottomAppBar(content = {
                NavigationBarItem(
                    selected = selectedPage.value == 0, onClick = {
                        selectedPage.value = 0
                    }, icon = {
                        Image(
                            modifier = Modifier.size(30.dp),
                            painter = painterResource(Res.drawable.home),
                            contentDescription = null
                        )
                    },
                    label = { Text(text = "Anasayfa") })
                NavigationBarItem(
                    selected = selectedPage.value == 1, onClick = {
                    selectedPage.value = 1
                }, icon = {
                    Image(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(Res.drawable.settings),
                        contentDescription = null
                    )
                },
                    label = { Text(text = "Ayarlar") })
            })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues),
        ) {
            when (selectedPage.value) {
                0 -> MainNavigation("home")
                1 -> MainNavigation("setting")
            }

        }

    }
}