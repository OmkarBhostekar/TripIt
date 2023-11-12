package com.travel.tripit.presentation.navigation

sealed class Routes(val route: String) {
    object Login : Routes("login")
    object Register : Routes("register")
    object Home : Routes("home")
}