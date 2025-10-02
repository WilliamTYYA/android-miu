package com.example.myapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextStyleScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = modifier.padding(innerPadding)
                .fillMaxWidth()
        ) {
            Text(
                text = "Welcome to Maharishi Internation University!",
                color = Color.Red,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color(0xFF1C862A),
                        blurRadius = 30f,
                        offset = Offset(
                            x = 5f,
                            y = 5f
                        )
                    ),
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color.Red,
                            Color.Blue,
                            Color.Green,
                            Color.Red
                        )
                    )
                )
            )
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
private fun TextStyleScreenPreview() {
    TextStyleScreen()
}