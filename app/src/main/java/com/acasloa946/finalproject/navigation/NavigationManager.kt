package com.acasloa946.finalproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.finalproject.userInterface.AdminScreen.AdminScreen
import com.acasloa946.finalproject.userInterface.AdminScreen.ViewmodelAdmin
import com.acasloa946.finalproject.userInterface.LoginScreen.LoginScreen
import com.acasloa946.finalproject.userInterface.LoginScreen.LoginViewmodel
import com.acasloa946.finalproject.userInterface.SettingsScreen.SettingsScreen
import com.acasloa946.finalproject.userInterface.SettingsScreen.ViewmodelSettings

@Composable
fun NavigationManager(viewmodelSettings: ViewmodelSettings, viewmodelAdmin: ViewmodelAdmin, loginViewmodel: LoginViewmodel) {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "SettingsScreen") {
        composable("SettingsScreen") {
            SettingsScreen(viewmodelSettings, navController)
        }
        composable("AdminScreen") {
            AdminScreen(viewmodelAdmin, navController)
        }
        composable("LoginScreen") {
            LoginScreen(loginViewmodel, navController)
        }

    }
}