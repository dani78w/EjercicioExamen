package com.example.ejercicioexamen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ejercicioexamen.R
import com.example.ejercicioexamen.data.claseSelecionada
import com.example.ejercicioexamen.data.fotosClases
import kotlin.random.Random

@Composable
fun Ejercicio10(navController:NavController){
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

            Image(
                painterResource(id = R.drawable.mountain),
                contentDescription = "clase",
                modifier = Modifier.fillMaxSize(),
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop
            )
            Button(modifier = Modifier
                .fillMaxSize(),onClick = { navController.navigate("Objeto") }
                , colors = ButtonDefaults.buttonColors(Color.Transparent)
            ) {

                Image(
                    painterResource(id = R.drawable.dado),
                    contentDescription = "clase",
                    modifier = Modifier.weight(0.3f).aspectRatio(1f),
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.tint(Color.White)
                )
                Text(
                    modifier = Modifier.weight(0.7f).padding(10.dp),
                    color = Color.White, fontSize = 20.sp,
                    text = "Comienza la aventura, pulsa el DADO para avanzar. CUIDADO puedes encontrarte enemigos")
            }




    }
}

fun lanzarRandom(navController: NavController){
    var ranNum = Random.nextInt(1, 4)
}