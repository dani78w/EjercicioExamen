package com.example.ejercicioexamen.data

import androidx.compose.runtime.mutableStateOf
import com.example.ejercicioexamen.R


var nombresclases = arrayOf("Mago","Guerrero","Arquero","Asesino","Caballero")
var fotosClases = arrayOf(R.drawable.mago,R.drawable.guerrero,R.drawable.arquero,R.drawable.asesino,R.drawable.caballero)
var claseSelecionada= mutableStateOf(-1)

var nombresrazas = arrayOf("Humano","Elfo","Enano","Orco","Gnomo")
var fotosRazas = arrayOf(R.drawable.humano,R.drawable.elfo,R.drawable.enano,R.drawable.orco,R.drawable.gnomo)
var razaSelecionada= mutableStateOf(-1)

var nombreJugador = mutableStateOf("")
var fuerza = mutableStateOf(0)
var defensa = mutableStateOf(0)
var vida = mutableStateOf(200)
var mochilaTam = mutableStateOf(100)
var monedero = mutableStateOf(0)

