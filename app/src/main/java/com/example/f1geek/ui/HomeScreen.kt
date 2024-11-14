package com.example.f1geek.ui


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage


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
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE10600))
                .padding(2.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    //This image was taken from the official F1 website. It is not mine.
                    model = "https://media.formula1.com/image/upload/f_auto,c_limit,w_195,q_auto/etc/designs/fom-website/images/f1_logo.svg",
                    contentDescription = "F1 Logo",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(end = 20.dp, start = 8.dp)
                )
                Text(
                    text = "F1 App",
                    style = typography.titleLarge,
                    color = Color.White
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (showButtons) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(50.dp),
            ) {
                Button(onClick = {
                    showButtons = false
                    showDrivers = true
                    showTeams = false
                    showCircuits = false
                    onTitleChange("Drivers")

                }
                ) {
                    Text("Drivers")
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

        when {
            showDrivers -> DriverListScreen(modifier = Modifier.fillMaxWidth())
            showTeams -> TeamListScreen(modifier = Modifier.fillMaxWidth())
            showCircuits -> CircuitListScreen(modifier = Modifier.fillMaxWidth())
        }
    }
}