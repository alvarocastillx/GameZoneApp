package com.acasloa946.finalproject.userInterface.SettingsScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.finalproject.bannersettings.BannerSettings
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.navigation.Routes
import com.google.relay.compose.BoxScopeInstanceImpl.align

/**
 * Funciñon composable de la screen settings
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(settingsViewmodel: SettingsViewmodel, navController: NavController){

    //Ejecuta función recurrentemente para comprobar si el usuario ha iniciado sesión o no.
    LaunchedEffect(true) {
        settingsViewmodel.getLogged()
    }

    Scaffold( modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 11.dp, bottom = 20.dp)
            ) {
                //llamada a funciñon de barra de navegación
                FooterNavBar(modifier = Modifier.size(392.dp, 66.dp),
                    onSettingsClick = {
                        navController.navigate(Routes.SettingsScreeen.route)
                    },
                    onHomeClick = {
                        navController.navigate(Routes.HomeScreen.route)
                    },
                    onCatalogClick = {
                        navController.navigate(Routes.CatalogScreen.route)
                    })
            }
        }
    ) {
        // Columna principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFD9D9D9)),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            //Llamada a banner y componentes dependiendo si el usuario ha iniciado sesión o no.
            BannerSettings(modifier = Modifier.size(430.dp, 89.dp))
            if (settingsViewmodel.logged) {
                FrameSettingsLoggedFinalComponent(modifier = Modifier.fillMaxWidth().padding(bottom = 70.dp), settingsViewmodel = settingsViewmodel, onInfoClick = {
                    settingsViewmodel.openDialog()
                }, onLogoutClick = {
                    settingsViewmodel.signOut()
                })
                InfoDialog(settingsViewmodel = settingsViewmodel, onAcceptClick = {
                    settingsViewmodel.closeDialog()
                }, textEmail = settingsViewmodel.userMail!!, textUser = settingsViewmodel.userName!!)
            }
            else {
                FrameSettingsNotLoggedComponent(modifier = Modifier.fillMaxWidth(), settingsViewmodel = settingsViewmodel, onLoginClick = {
                    navController.navigate(Routes.LoginScreen.route)
                }, onRegisterClick = {
                    navController.navigate(Routes.RegisterScreen.route)
                })
            }




        }
    }
}