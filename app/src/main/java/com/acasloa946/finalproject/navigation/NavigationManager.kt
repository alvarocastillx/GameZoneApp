package com.acasloa946.finalproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.acasloa946.finalproject.userInterface.AdminScreen.AdminScreen
import com.acasloa946.finalproject.userInterface.AdminScreen.ViewmodelAdmin
import com.acasloa946.finalproject.userInterface.CatalogScreen.CatalogScreen
import com.acasloa946.finalproject.userInterface.CatalogScreen.CatalogViewmodel
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


/**
 * Función que se ejecuta en el main activity utilizada para la navegación entre views.
 * @param settingsViewmodel: viewmodel de la pantalla settings
 * @param viewmodelAdmin: viewmodel del panel de administrador
 * @param loginViewmodel: viewmodel de la pantalla login
 * @param homeViewmodel: viewmodel de la pantalla home
 * @param registerViewmodel: viewmodel de la pantalla register
 * @param catalogViewmodel: viewmodel de la pantalla de catálogo
 */
@Composable
fun NavigationManager(settingsViewmodel: SettingsViewmodel, viewmodelAdmin: ViewmodelAdmin, loginViewmodel: LoginViewmodel, homeViewmodel: HomeViewmodel, registerViewmodel:RegisterViewmodel, catalogViewmodel: CatalogViewmodel) {



    val navController = rememberNavController()
    val auth : FirebaseAuth = Firebase.auth
    val admin = auth.currentUser?.email
    var startDestination = ""


    // Si la aplicación se inicia con la sesión iniciada como administrador, saldrá el panel.
    // IMPORTANTE: PARA INICIAR SESIÓN EN LA PANTALLA DE ADMINISTRADOR ES ADMIN@ADMIN.COM Y CONTRASEÑA ADMIN11
    // PARA CERRAR SESIÓN UNA VEZ DENTRO HAY QUE PULSA EL BOTON DE INDIE Y REINICIAR LA APLICACIÓN.

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
        composable("CatalogScreen") {
            CatalogScreen(catalogViewmodel = catalogViewmodel, navController = navController)
        }

    }
}