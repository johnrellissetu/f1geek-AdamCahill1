package com.example.f1geek.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.f1geek.model.Circuit
import com.example.f1geek.model.seedCircuitStore

@Composable
fun CircuitListScreen(modifier: Modifier = Modifier) {
    var selectedCircuit by rememberSaveable { mutableStateOf<Circuit?>(null) }
    var selectedYear by rememberSaveable { mutableStateOf<String?>(null) }

    when {
        selectedCircuit == null -> {
            CircuitList(
                circuits = seedCircuitStore().circuits,
                modifier = modifier,
                onCircuitClick = { circuit ->
                    selectedCircuit = circuit
                }
            )
        }

        selectedYear == null -> {
            YearList(
                circuit = selectedCircuit!!,
                modifier = modifier,
                onYearClick = { year ->
                    selectedYear = year
                },
                onBackClick = {
                    selectedCircuit = null
                }
            )
        }

        else -> {
            ResultDetail(
                circuit = selectedCircuit!!,
                year = selectedYear!!,
                onBackClick = {
                    selectedYear = null
                }
            )
        }
    }
}

@Composable
fun CircuitList(
    circuits: List<Circuit>,
    modifier: Modifier = Modifier,
    onCircuitClick: (Circuit) -> Unit
) {
    var filterText by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        TextField(
            value = filterText,
            onValueChange = { filterText = it },
            label = { Text("Search Circuit") },
            modifier = Modifier.fillMaxWidth()
        )

        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            items(circuits.filter { it.name.contains(filterText, ignoreCase = true) }) { circuit ->
                val backgroundColor = if (circuits.indexOf(circuit) % 2 == 0) Color.LightGray else Color.White
                Text(
                    text = circuit.name,
                    modifier = Modifier
                        .background(color = backgroundColor)
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onCircuitClick(circuit) }
                )
            }
        }
    }
}

@Composable
fun YearList(
    circuit: Circuit,
    modifier: Modifier = Modifier,
    onYearClick: (String) -> Unit,
    onBackClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Select Year for ${circuit.name}", style = typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(circuit.results.map { it.year }) { year ->
                val backgroundColor = if (circuit.results.indexOfFirst { it.year == year } % 2 == 0) Color.LightGray else Color.White
                Text(
                    text = year,
                    modifier = Modifier
                        .background(color = backgroundColor)
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onYearClick(year) }
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onBackClick) {
            Text("Back to Circuits")
        }
    }
}

@Composable
fun ResultDetail(
    circuit: Circuit,
    year: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val result = circuit.results.find { it.year == year }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Results for ${circuit.name} - ${result?.year}", style = typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "1st: ${result?.first}")
        Text(text = "2nd: ${result?.second}")
        Text(text = "3rd: ${result?.third}")

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onBackClick) {
            Text("Back to Years")
        }
    }
}





