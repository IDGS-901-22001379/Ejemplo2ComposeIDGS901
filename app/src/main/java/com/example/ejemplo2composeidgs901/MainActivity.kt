package com.example.ejemplo2composeidgs901
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SumaDosNumeros()
            //val navController = rememberNavController()
            //NavHost(navController = navController, startDestination = "Inicio") {
            //    composable("Inicio") { pantallaInicio(navController) }
            //    composable("Detalles/{nombre}") { backStackEntry ->
            //        val nombre = backStackEntry.arguments?.getString("nombre") ?: "Invitado"
            //        pantallaDetalles(navController, nombre)
            //    }
            //}
        }
    }
}

/*
@Composable
fun pantallaInicio(navController: NavHostController) {
    var nombre by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Pantalla de Inicio")
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = nombre,
            onValueChange = {nombre = it},
            label = {Text("Introduce tu nombre")},
            modifier = Modifier.fillMaxWidth()
            )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick ={
            val nombreValido = if (nombre.isBlank()) "Invitado" else nombre
            navController.navigate("Detalles/$nombreValido")
        }){
            Text("Ir a Detalles")
        }
    }
}

@Composable
fun pantallaDetalles(navController: NavHostController, nombre: String ){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("Hola $nombre")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("Inicio")
        }) {
            Text("Volver a Inicio")
        }
    }
}
}
 */