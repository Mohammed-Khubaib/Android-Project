package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                   MyApp()
                }
            }
        }
    }


@Composable
fun MyApp() {
    // A surface container using the 'background' color from the theme
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        Greeting("Khubaib")
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Column {
            Text(
                text = "Hello,",
                modifier = Modifier.padding(24.dp)
            )
            Text(
                text = name,
                modifier = Modifier.padding(24.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTutorialTheme {
        MyApp()
    }
}