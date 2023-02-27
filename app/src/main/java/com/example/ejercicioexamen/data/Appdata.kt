package com.example.ejercicioexamen.data

import androidx.compose.runtime.mutableStateOf
import com.example.ejercicioexamen.R


var nombresclases = arrayOf("Mago","Guerrero","Arquero","Asesino","Caballero")
var fotosClases = arrayOf(R.drawable.mago,R.drawable.guerrero,R.drawable.arquero,R.drawable.asesino,R.drawable.caballero)
var claseSelecionada= mutableStateOf(-1)

var nombresrazas = arrayOf("Humano","Elfo","Enano","Orco","Gnomo")
var fotosRazas = arrayOf(R.drawable.humano,R.drawable.elfo,R.drawable.enano,R.drawable.orco,R.drawable.gnomo)
var razaSelecionada= mutableStateOf(2)

var listaDeObjetos = arrayOf("Espada","Pistola","Arco","Piedra")
var imagenObjetos = arrayOf(R.drawable.espada,R.drawable.pistola,R.drawable.arco,R.drawable.piedra)




var nombreJugador = mutableStateOf("Jugador")
var fuerza = mutableStateOf(20)
var defensa = mutableStateOf(20)
var vida = mutableStateOf(200)
var mochilaTam = mutableStateOf(10)
var mochila = mutableStateOf(mutableListOf(""))
var mochilaPeso= mutableStateOf(0)
var monedero = mutableStateOf(12313)

var comerceFlow = mutableStateOf(0)
var cityFLow = mutableStateOf(0)
var enCiuadad = mutableStateOf(false)
var partidasGanadasCiudad = mutableStateOf(-1)

val paises: Map<String, Int> = mapOf( Pair("argentina", 40000000),
    Pair("españa", 46000000),
    Pair("uruguay", 3400000))
var chatdict = mutableStateOf(mutableMapOf(
    Pair(1,"Hola"),
    Pair(1,"Hola"),
    Pair(1,"Hola"),
    Pair(2,"Nene"),
    Pair(2,"Nene"),
    Pair(2,"Nene"),

))
