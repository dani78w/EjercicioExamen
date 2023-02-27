package com.example.ejercicioexamen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.ejercicioexamen.data.*
import kotlin.random.Random

@Composable
fun Ejercicio9(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        var fuerzaRandom = Random.nextInt(10, 30)
        var defensaRandom = Random.nextInt(1, 30)
        Column() {


            var nombre = rememberSaveable { mutableStateOf("") }
            TextField(
                label = { Text(text = "Jugador") },
                value = nombre.value,
                onValueChange = {
                    nombre.value = it;
                    var c1 = true
                },
                trailingIcon = {
                    Icon(
                        Icons.Filled.DriveFileRenameOutline,
                        contentDescription = "Visibility"
                    )
                },
                modifier = Modifier

                    .padding(start = 30.dp, end = 30.dp)
                    .background(color = Color.Transparent)
                    .fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = MaterialTheme.shapes.extraLarge,
            )

            Row(
                modifier = Modifier
                    .weight(0.2f)
            ) {
                Row(modifier = Modifier
                    .weight(0.4f)){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(0.5f)
                    ) {
                        Image(
                            painterResource(id = fotosClases[claseSelecionada.value]),
                            contentDescription = "raza",
                            modifier = Modifier.weight(0.7f),
                            alignment = Alignment.Center,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = nombresclases[claseSelecionada.value],
                            modifier = Modifier.weight(0.1f)
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .weight(0.5f)

                    ) {
                        Image(
                            painterResource(id = fotosRazas[razaSelecionada.value]),
                            contentDescription = "raza",
                            modifier = Modifier.weight(0.7f),
                            alignment = Alignment.Center,
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = nombresrazas[razaSelecionada.value],
                            modifier = Modifier.weight(0.1f)
                        )
                    }
                }
            }
            Column(
                modifier= Modifier
                    .weight(0.2f)
                    .padding(start = 30.dp, end = 30.dp)
                    .background(color = Color.Transparent)
                    .fillMaxWidth(),
            ){


                Text("Fuerza: "+ fuerzaRandom)
                Text("Defensa: "+defensaRandom)
                Text("Tamaño de la mochila: "+ mochilaTam.value)
                Text("Vida: "+vida.value)
                Text("Monedero: "+ monedero.value+"$")
            }
            Row(){
                Button(
                    shape = MaterialTheme.shapes.extraLarge,
                    onClick = {
                        navController.navigate("Ejercicio7")
                    },
                    modifier = Modifier

                        .weight(0.2f)
                        .height(90.dp)
                        .zIndex(2f)
                        .padding(top = 40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = MaterialTheme.colorScheme.inversePrimary
                    )
                ) {
                    Icon(Icons.Filled.Loop, contentDescription = "Visibility")
                }
                Button(
                    shape = MaterialTheme.shapes.extraLarge,
                    onClick = {
                        nombreJugador.value = nombre.value
                        fuerza.value= fuerzaRandom
                        defensa.value= defensaRandom
                        navController.navigate("Ejercicio10")
                    },
                    modifier = Modifier
                        .weight(0.8f)
                        .height(90.dp)
                        .zIndex(2f)
                        .padding(top = 40.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = MaterialTheme.colorScheme.inversePrimary
                    )
                ) {
                    Icon(Icons.Filled.ArrowForward, contentDescription = "Visibility")
                }
            }

        }
    }
}