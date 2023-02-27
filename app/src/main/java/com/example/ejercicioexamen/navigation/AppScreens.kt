package com.example.ejercicioexamen.navigation

sealed class AppScreens(val route: String) {
    object Ejercicio7 : AppScreens("Ejercicio7")
    object Ejercicio8 : AppScreens("Ejercicio8")
    object Ejercicio9 : AppScreens("Ejercicio9")
    object Ejercicio10 : AppScreens("Ejercicio10")
    object Objeto : AppScreens("Objeto")
    object Mercader : AppScreens("Mercader")
    object Lucha : AppScreens("Lucha")
    object Ciudad : AppScreens("Ciudad")
    object Mejora : AppScreens("Mejora")
    object DialogFlow : AppScreens("DialogFlow")


}
