package com.example.btnd


import androidx.compose.runtime.Composable

sealed class TabItem(val title: String, val icon: Int, val screen: @Composable () -> Unit) {
    object Home : TabItem("Home", R.drawable.ic_home, { HomeScreen() })
    object Profile : TabItem("Profile", R.drawable.ic_profile, { ProfileScreen() })
    object Settings : TabItem("Settings", R.drawable.ic_settings, { SettingsScreen() })
}