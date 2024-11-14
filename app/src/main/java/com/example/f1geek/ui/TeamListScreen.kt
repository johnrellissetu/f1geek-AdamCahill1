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
import com.example.f1geek.model.Team
import com.example.f1geek.model.Driver
import com.example.f1geek.model.seedTeamStore
import coil.compose.AsyncImage
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items

@Composable
fun TeamListScreen(modifier: Modifier = Modifier) {
    var selectedTeam by rememberSaveable { mutableStateOf<Team?>(null) }

    if (selectedTeam == null) {
        TeamList(
            teams = seedTeamStore().teams,
            modifier = modifier,
            onTeamClick = { team ->
                selectedTeam = team
            }
        )
    } else {
        TeamDetail(
            team = selectedTeam!!,
            onBackClick = {
                selectedTeam = null
            }
        )
    }
}

@Composable
fun TeamList(
    teams: List<Team>,
    modifier: Modifier = Modifier,
    onTeamClick: (Team) -> Unit
) {
    var filterText by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        TextField(
            value = filterText,
            onValueChange = { filterText = it },
            label = { Text("Search Teams") },
            modifier = Modifier.fillMaxWidth()
        )

        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            teams.filter { it.name.contains(filterText, ignoreCase = true) }
                .forEachIndexed { index, team ->
                    val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.White
                    item {
                        Text(
                            text = team.name,
                            modifier = Modifier
                                .background(color = backgroundColor)
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clickable {
                                    onTeamClick(team)
                                }
                        )
                    }
                }
        }
    }
}


@Composable
fun TeamDetail(
    team: Team,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(text = "Team Details", style = typography.titleLarge)
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Team Name: ${team.name}")
            Spacer(modifier = Modifier.height(8.dp))
        }

        item {
            Text(text = "Primary Driver:")
            DriverInfo(driver = team.primaryDriver)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(text = "Secondary Driver:")
            DriverInfo(driver = team.secondaryDriver)
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Text(text = "Reserve Drivers:")
        }

        items(team.reserveDrivers) { driver ->
            DriverInfo(driver = driver)
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onBackClick) {
                Text("Back")
            }
        }
    }
}



@Composable
fun DriverInfo(driver: Driver, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = driver.image,
            contentDescription = "Driver Image",
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Name: ${driver.getFullName()}")
        Text(text = "Abbreviated Name: ${driver.abbreviatedName}")
        Text(text = "Driver Number: ${driver.number}")
    }
}