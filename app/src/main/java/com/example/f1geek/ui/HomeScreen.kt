package com.example.f1geek.ui


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.f1geek.model.seedTeamStore
import com.example.f1geek.model.seedCircuitStore

@Composable
fun HomeScreen(
    onTitleChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var showButtons by rememberSaveable { mutableStateOf(true) }
    var showDrivers by rememberSaveable { mutableStateOf(false) }
    var showTeams by rememberSaveable { mutableStateOf(false) }
    var showCircuits by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showButtons) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Button(onClick = {
                    showButtons = false
                    showDrivers = true
                    showTeams = false
                    showCircuits = false
                    onTitleChange("Drivers")

                }
                ) {
                    Text("Drivers", )
                }

                Button(onClick = {
                    showButtons = false
                    showDrivers = false
                    showTeams = true
                    showCircuits = false
                    onTitleChange("Teams")
                }) {
                    Text("Teams")
                }

                Button(onClick = {
                    showButtons = false
                    showDrivers = false
                    showTeams = false
                    showCircuits = true
                    onTitleChange("Circuits")
                }) {
                    Text("Circuits")
                }
            }
        } else {
            Button(onClick = {
                showButtons = true
                showDrivers = false
                showTeams = false
                showCircuits = false
                onTitleChange("Home")
            }) {
                Text("Home")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        when {
            showDrivers -> DriverListScreen(modifier = Modifier.fillMaxWidth())
            showTeams -> TeamListScreen(modifier = Modifier.fillMaxWidth())
            showCircuits -> CircuitList(circuits = seedCircuitStore().circuits, modifier = Modifier.fillMaxWidth())
        }
    }
}