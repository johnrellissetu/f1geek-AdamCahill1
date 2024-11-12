package com.example.f1geek

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.*
import com.example.f1geek.ui.theme.F1GeekTheme
import com.example.f1geek.ui.HomeScreen


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F1GeekTheme {
                var appBarTitle by rememberSaveable { mutableStateOf("Home") }

                Scaffold(

                    topBar = {
                        TopAppBar(
                            title = { Text(text = appBarTitle) }
                        )
                    }
                ) { paddingValues ->
                    HomeScreen(
                        onTitleChange = { newTitle -> appBarTitle = newTitle },
                        modifier = Modifier.padding(paddingValues).padding(16.dp),
                    )
                }
            }
        }
    }
}


