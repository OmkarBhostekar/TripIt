package com.travel.tripit.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.travel.tripit.presentation.ui.auth.LoginScreen
import com.travel.tripit.presentation.ui.auth.RegisterScreen
import com.travel.tripit.presentation.ui.home.HomeScreen

@Composable
fun TripNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.Login.route) {
        composable(Routes.Register.route){
            RegisterScreen()
        }
        composable(Routes.Login.route){
            LoginScreen()
        }
        composable(Routes.Home.route){
            HomeScreen()
        }
    }
}