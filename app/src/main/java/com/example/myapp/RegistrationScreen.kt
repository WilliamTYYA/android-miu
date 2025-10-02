package com.example.myapp

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column(
            modifier=modifier
                .padding(innerPadding)
        ) {
            var username by remember { mutableStateOf("") }
            val context = LocalContext.current
            var usernameError by remember { mutableStateOf(false) }

            OutlinedTextField(
                value = username,
                onValueChange = { data ->
                    username = data
                },
                label = { Text("Username") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                modifier = Modifier.fillMaxWidth()
                    .padding(start=10.dp, end=10.dp),
                supportingText = {
                    if (usernameError) {
                        Text("Username is required!")
                    }
                },
                isError = usernameError,
                trailingIcon = {
                    if (usernameError) {
                        Text("Error", color = MaterialTheme.colorScheme.error)
                    }
                }
            )

            var password by remember { mutableStateOf("") }
            OutlinedTextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = { Text("Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth()
                    .padding(start=10.dp, end=10.dp)
            )

            var phoneNumber by remember { mutableStateOf("") }
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { data ->
                    phoneNumber = data
                },
                label = { Text("Phone Number") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                modifier = Modifier.fillMaxWidth()
                    .padding(start=10.dp, end=10.dp)
            )

            val genders = listOf("Male", "Female")
            var selectedGender by remember { mutableStateOf(genders[0]) }
            genders.forEach { gender ->
                RadioButton(
                    selected = selectedGender == gender,
                    onClick = {
                        selectedGender = gender
                    }
                )
                Text(text=gender)
            }
//            val genders = ["Male", "Famale"]
//            genders.forEach {  }
//            RatioButton {
//
//            }
            Row {
                Button(
                    onClick = {
                        username = ""
                        password = ""
                        phoneNumber = ""
                        selectedGender = genders[0]
                    }
                ) {
                    Text(text = "Clear")
                }

                Button(
                    onClick = { }
                ) {
                    Text(text = "Forgot Password")
                }

                Button(
                    onClick = {
                        if (username.isEmpty()) {
                            // raise an error flag
                            usernameError = true
                        } else {
                            usernameError = false
                        }
                        val toast = Toast.makeText(
                            context,
                            "Registration Successful for $username",
                            Toast.LENGTH_SHORT
                        )
                        toast.show()
                    },
                ) {
                    Text(text = "Register")
                }
            }
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
private fun RegistrationScreenPreview() {
    RegistrationScreen()
}