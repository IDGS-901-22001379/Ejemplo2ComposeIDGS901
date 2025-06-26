package com.example.ejemplo2composeidgs901

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun CalculadoraBasica() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }
    var operacion by remember { mutableStateOf("Sumar") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("Número 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("Número 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(12.dp))

        // RadioButtons para elegir la operación
        Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            listOf("Sumar", "Restar", "Multiplicar", "Dividir").forEach { op ->
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    RadioButton(
                        selected = operacion == op,
                        onClick = { operacion = op }
                    )
                    Text(op)
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(onClick = {
            val n1 = num1.toFloatOrNull()
            val n2 = num2.toFloatOrNull()
            resultado = if (n1 != null && n2 != null) {
                when (operacion) {
                    "Sumar" -> "Resultado: ${n1 + n2}"
                    "Restar" -> "Resultado: ${n1 - n2}"
                    "Multiplicar" -> "Resultado: ${n1 * n2}"
                    "Dividir" -> if (n2 != 0f) "Resultado: ${n1 / n2}" else "No se puede dividir entre 0"
                    else -> "Operación no válida"
                }
            } else {
                "Ingresar números válidos"
            }
        }) {
            Text("Calcular")
        }

        Spacer(modifier = Modifier.height(12.dp))
        Text(text = resultado)
    }
}
