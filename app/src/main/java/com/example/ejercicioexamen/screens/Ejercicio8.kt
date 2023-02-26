package com.example.ejercicioexamen.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ejercicioexamen.data.fotosRazas
import com.example.ejercicioexamen.data.nombresrazas
import com.example.ejercicioexamen.data.razaSelecionada

@Composable
fun Ejercicio8 ( navController : NavController)   {
    Surface(modifier = Modifier
        .fillMaxSize()
    ) {
        Column(modifier = Modifier.background(MaterialTheme.colorScheme.primary)) {
            Row() {
                SelectorRazas()
            }
            Column() {
                ResultadoRazas(navController)
            }
        }

    }
}

@Composable
fun SelectorRazas(){
    Row(
        modifier = Modifier
            .horizontalScroll(state = ScrollState(0), enabled = true)
    ) {


        for (i in 0..nombresrazas.size - 1) {
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier
                    .wrapContentWidth()
                    .height(100.dp)
                    .padding(10.dp, 0.dp)
                    .clickable { razaSelecionada.value = i }
            ) {

                Image(
                    painterResource(id = fotosRazas[i]),
                    contentDescription = "raza",
                    modifier = Modifier.weight(0.8f)
                )
                Text(
                    text = nombresrazas[i],
                    modifier = Modifier.weight(0.2f),
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.inversePrimary
                )


            }

        }
    }
}
@Composable
fun ResultadoRazas(navController: NavController){
    if(razaSelecionada.value < 0){
        Column(
            Modifier.padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("No has selecionado ninguna raza",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.inversePrimary

            )
        }
    }
    else {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth(1f)
                .horizontalScroll(state = ScrollState(0), enabled = true)
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
            Button(
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.onSurface),
                onClick = { navController.navigate("Ejercicio9") },
                modifier = Modifier
                    .weight(0.1f)
                    .padding(10.dp)

            )
            {
                Text("SIGUIENTE")
                Icon(
                    Icons.Default.ArrowForward,
                    contentDescription = "Play" ,
                )
            }

        }
    }
}