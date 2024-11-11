package com.example.f1geek.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.f1geek.model.Circuit
import com.example.f1geek.model.Team

@Composable
fun CircuitList(circuits: List<Circuit>, modifier: Modifier = Modifier) {
    var filterText by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        TextField(
            value = filterText,
            onValueChange = { value -> filterText = value },
            label = { Text("Search Teams") },
            modifier = Modifier.fillMaxWidth()
        )

        circuits.filter { it.name.contains(filterText, ignoreCase = true) }
            .forEachIndexed { index, circuit ->
                val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.White
                Text(
                    text = circuit.name,
                    modifier = Modifier
                        .background(color = backgroundColor)
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { println("Tapped on ${circuit.name}") },
                )
            }
    }
}