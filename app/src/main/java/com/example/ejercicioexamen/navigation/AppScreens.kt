package com.example.ejercicioexamen.navigation

sealed class AppScreens(val route: String) {
    object Ejercicio7 : AppScreens("Ejercicio7")
    object Ejercicio8 : AppScreens("Ejercicio8")
    object Ejercicio9 : AppScreens("Ejercicio9")
    object Ejercicio10 : AppScreens("Ejercicio10")
    object Objeto : AppScreens("Objeto")
    object Mercader : AppScreens("Mercader")
    object Lucha : AppScreens("Lucha")
    object Ejercicio14 : AppScreens("Ejercicio14")
    object Mejora : AppScreens("Mejora")


}
