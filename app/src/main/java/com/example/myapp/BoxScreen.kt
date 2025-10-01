package com.example.myapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxScreen(modifier: Modifier = Modifier) {

    Scaffold { innerPadding ->
        Box (
            modifier = modifier.padding(innerPadding)
//                .fillMaxWidth()
        ) {
            // create 3 image objects
            var myImage by remember { mutableStateOf(Icons.Default.Person) }

            Image(
                imageVector = Icons.Default.Lock,
                contentDescription = "Lock Icon",
                modifier = Modifier
                    .size(50.dp)
                    .align(Alignment.TopStart)
                    .clickable(
                        onClick = {
                            if (myImage == Icons.Default.Person) {
                                myImage = Icons.Default.Lock
                            } else {
                                myImage = Icons.Default.Person
                            }
                        }
                    )
            )
            Image(
                imageVector = myImage,
                contentDescription = "Lock Icon",
                modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.TopCenter)
            )
            Image(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Lock Icon",
                modifier = Modifier
                        .size(50.dp)
                    .align(Alignment.TopEnd)
                    .clickable(
                        onClick = {
                            //action
                            if (myImage == Icons.Default.Person) {
                                myImage = Icons.Default.Face
                            } else {
                                myImage = Icons.Default.Person
                            }
                        }
                    )
            )
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
private fun BoxScreenPreview() {
    BoxScreen()
}