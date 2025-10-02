package com.example.myapp

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxShapeScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    )
                    .size(200.dp),
                Alignment.Center
            ) {
                Text(text = "Box")
            }

            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .size(200.dp),
                Alignment.BottomCenter
            ) {
                Text(text = "Your shape")
            }

            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Blue,
                        shape = CutCornerShape(30.dp)
                    )
                    .size(200.dp),
                Alignment.TopCenter
            ) {
                Text(text = "Movie shape")
            }

            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    )
                    .size(200.dp),
                Alignment.Center
            ) {
                Text(text = "Box")
            }

            Box(
                modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = RoundedCornerShape(30.dp)
                    )
                    .size(200.dp),
                Alignment.BottomCenter
            ) {
                Text(text = "Your shape")
            }
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
private fun BoxShapeScreenPreview() {
    BoxShapeScreen()
}