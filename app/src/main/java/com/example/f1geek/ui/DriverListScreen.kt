package com.example.f1geek.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import coil.compose.AsyncImage
import com.example.f1geek.model.Driver
import com.example.f1geek.model.seedDriverStore

@Composable
fun DriverListScreen(modifier: Modifier = Modifier) {
    var selectedDriver by rememberSaveable { mutableStateOf<Driver?>(null) }
    // using rememberSaveable was causing my app to crash here when the phone was rotated.
    // I found a solution to this here https://stackoverflow.com/questions/75225538/app-crashes-when-put-in-background-on-every-screen-that-uses-remembersaveable-wi
    // It was to simply implement parcelize into my data class.

    if (selectedDriver == null) {

        DriverList(
            drivers = seedDriverStore().drivers,
            modifier = modifier,
            onDriverClick = { driver ->
                selectedDriver = driver
            }
        )
    } else {
        DriverDetail(
            driver = selectedDriver!!,
            onBackClick = {
                selectedDriver = null
            }
        )
    }
}

@Composable
fun DriverList(
    drivers: List<Driver>,
    modifier: Modifier = Modifier,
    onDriverClick: (Driver) -> Unit
) {
    var filterText by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        TextField(
            value = filterText,
            onValueChange = { filterText = it },
            label = { Text("Search Drivers") },
            modifier = Modifier.fillMaxWidth()
        )
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            drivers.filter { it.getFullName().contains(filterText, ignoreCase = true) }
                .forEachIndexed { index, driver ->
                    val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.White
                    item {
                        Text(
                            text = driver.getFullName(),
                            modifier = Modifier
                                .background(color = backgroundColor)
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clickable {
                                    onDriverClick(driver)
                                }
                        )
                    }
                }
        }
    }
}

@Composable
fun DriverDetail(
    driver: Driver,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Driver Details", style = typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))
        AsyncImage(
            model = driver.image,
            contentDescription = "Driver Image",
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Name: ${driver.getFullName()}")
        Text(text = "Abbreviated Name: ${driver.abbreviatedName}")
        Text(text = "Driver Number: ${driver.number}")

        Spacer(modifier = Modifier.height(24.dp))

        Button(onClick = onBackClick) {
            Text("Back")
        }
    }
}
