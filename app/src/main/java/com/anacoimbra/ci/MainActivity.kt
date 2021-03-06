package com.anacoimbra.ci

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.anacoimbra.ci.ui.theme.ContinuousDeliveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContinuousDeliveryTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting(BuildConfig.VERSION_NAME)
                }
            }
        }
    }
}

@Composable
fun Greeting(version: String) {
    Text(text = "v $version")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ContinuousDeliveryTheme {
        Greeting(BuildConfig.VERSION_NAME)
    }
}