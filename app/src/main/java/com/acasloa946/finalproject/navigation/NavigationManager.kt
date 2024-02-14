package com.acasloa946.finalproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.finalproject.userInterface.AdminScreen.AdminScreen
import com.acasloa946.finalproject.userInterface.AdminScreen.ViewmodelAdmin
import com.acasloa946.finalproject.userInterface.HomeScreen.HomeScreen
import com.acasloa946.finalproject.userInterface.HomeScreen.HomeViewmodel
import com.acasloa946.finalproject.userInterface.LoginScreen.LoginScreen
import com.acasloa946.finalproject.userInterface.LoginScreen.LoginViewmodel
import com.acasloa946.finalproject.userInterface.RegisterScreen.RegisterScreen
import com.acasloa946.finalproject.userInterface.RegisterScreen.RegisterViewmodel
import com.acasloa946.finalproject.userInterface.SettingsScreen.SettingsScreen
import com.acasloa946.finalproject.userInterface.SettingsScreen.SettingsViewmodel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun NavigationManager(settingsViewmodel: SettingsViewmodel, viewmodelAdmin: ViewmodelAdmin, loginViewmodel: LoginViewmodel, homeViewmodel: HomeViewmodel, registerViewmodel:RegisterViewmodel) {

    val navController = rememberNavController()
    val auth : FirebaseAuth = Firebase.auth
    val admin = auth.currentUser?.email
    var startDestination = ""

    if (admin=="admin@admin.com") {
        startDestination = "AdminScreen"
    }
    else {
        startDestination="HomeScreen"
    }





    NavHost(navController = navController, startDestination = startDestination) {
        composable("SettingsScreen") {
            SettingsScreen(settingsViewmodel, navController)
        }
        composable("AdminScreen") {
            AdminScreen(viewmodelAdmin, navController)
        }
        composable("LoginScreen") {
            LoginScreen(loginViewmodel, navController)
        }
        composable("HomeScreen") {
            HomeScreen(homeViewmodel = homeViewmodel, navController = navController)
        }
        composable("RegisterScreen") {
            RegisterScreen(registerViewmodel = registerViewmodel, navController = navController)
        }

    }
}