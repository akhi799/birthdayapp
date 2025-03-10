package com.example.happybirthday

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
//                    color=MaterialTheme.colorScheme.background
                    ) {
                    GreetingText(message = "Happy Birthday Prashant! 9/3/2025", from = "From Akhilesh",
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingText(message:String,from:String,modifier: Modifier=Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 50.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
            )

        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier.padding(16.dp).align(alignment = Alignment.End)
            )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Prashant!", from = "From Akhilesh")
    }
}