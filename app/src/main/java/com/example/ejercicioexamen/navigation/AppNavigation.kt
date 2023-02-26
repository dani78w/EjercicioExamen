package com.example.ejercicioexamen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ejercicioexamen.screens.Ejercicio7
import com.example.ejercicioexamen.screens.Ejercicio8
import com.example.ejercicioexamen.screens.Ejercicio9

@Composable
fun AppNavigation() {

    var navController = rememberNavController()
    var currentSong = 0
    NavHost(navController = navController, startDestination =AppScreens.Ejercicio7.route) {
        composable(AppScreens.Ejercicio7.route) {
            Ejercicio7(navController)
        }
        composable(AppScreens.Ejercicio8.route) {
            Ejercicio8(navController)
        }
        composable(AppScreens.Ejercicio9.route) {
            Ejercicio9(navController)
        }


    }
}