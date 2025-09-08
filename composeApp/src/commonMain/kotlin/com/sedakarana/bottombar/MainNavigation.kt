package com.sedakarana.bottombar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavigation(selectedPage: String) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = selectedPage) {

        composable("home") {
            Main(navController)
        }
        composable("setting") {
            Setting(navController)
        }
    }
}

