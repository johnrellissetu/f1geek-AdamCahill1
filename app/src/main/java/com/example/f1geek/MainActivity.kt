package com.example.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable


import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.f1geek.model.Driver
import com.example.f1geek.model.seedDriverStore
import com.example.f1geek.ui.theme.F1GeekTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            F1GeekTheme {
                val driverStore = seedDriverStore()

                DriverList(
                    drivers = driverStore.drivers, Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                )
            }
        }
    }
}


@Composable
fun DriverList(drivers: List<Driver>, modifier: Modifier = Modifier) {
    var filterText by rememberSaveable { mutableStateOf("") }
    println("Hello, i'm recomposing")
    Column {
        TextField(
            value = filterText,
            onValueChange = { value -> filterText = value },
            label = { Text("Search") },
            modifier = Modifier.fillMaxWidth()
        )
        drivers.filter { it.getFullName().contains(filterText, true) }.forEachIndexed { index, driver ->
            val backgroundColor = if (index % 2 == 0) Color.LightGray else Color.White
            Text(
                text = driver.getFullName(),
                modifier = Modifier
                    .background(color = backgroundColor)
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { println("TAP") },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    F1GeekTheme {
        val driverStore = seedDriverStore()
        DriverList(drivers = driverStore.drivers)
    }
}