package com.example.btnd

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme

@Composable
fun HomeScreen() {
    Text("Welcome to Home Screen!", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun ProfileScreen() {
    Text("This is your Profile.", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun SettingsScreen() {
    Text("Here are the Settings.", style = MaterialTheme.typography.headlineLarge)
}