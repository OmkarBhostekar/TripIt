package com.travel.tripit.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.travel.tripit.presentation.navigation.TripNavigation
import com.travel.tripit.presentation.ui.home.HomeScreen
import com.travel.tripit.presentation.ui.auth.LoginScreen
import com.travel.tripit.presentation.ui.auth.RegisterScreen
import com.travel.tripit.presentation.theme.TripItTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripItTheme(dynamicColor = false) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TripNavigation()
                }
            }
        }
    }
}


