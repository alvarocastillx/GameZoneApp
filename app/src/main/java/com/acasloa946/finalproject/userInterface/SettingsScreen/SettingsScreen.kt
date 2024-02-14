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
import com.acasloa946.finalproject.framesettingsnotlogged.FrameSettingsNotLogged
import com.acasloa946.finalproject.navigation.Routes
import com.google.relay.compose.BoxScopeInstanceImpl.align

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(settingsViewmodel: SettingsViewmodel, navController: NavController){

    LaunchedEffect(true) {
        settingsViewmodel.getLogged()
    }

    Scaffold( modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            // Contenedor con padding alrededor de la barra de navegación
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 11.dp, bottom = 20.dp) // Ajusta la cantidad de espacio según tus necesidades
            ) {
                FooterNavBar(modifier = Modifier.size(392.dp, 66.dp),
                    onSettingsClick = {
                        navController.navigate(Routes.SettingsScreeen.route)
                    },
                    onHomeClick = {
                        navController.navigate(Routes.HomeScreen.route)
                    })
            }
        }
    ) {
        // Contenido de tu pantalla principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFD9D9D9)),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            BannerSettings(modifier = Modifier.size(430.dp, 89.dp))


            if (settingsViewmodel.logged) {
                FrameSettingsLoggedComponent(modifier = Modifier.size(400.dp,697.dp).padding(bottom = 70.dp), settingsViewmodel = settingsViewmodel, onInfoClick = {
                    settingsViewmodel.openDialog()
                }, onLogOutClick = {
                    settingsViewmodel.signOut()
                })
                InfoDialog(settingsViewmodel = settingsViewmodel, onAcceptClick = {
                    settingsViewmodel.closeDialog()
                })
            }
            else {
                FrameSettingsNotLoggedComponent(modifier = Modifier.size(400.dp,697.dp), settingsViewmodel = settingsViewmodel, onLoginClick = {
                    navController.navigate(Routes.LoginScreen.route)
                }, onRegisterClick = {
                    navController.navigate(Routes.RegisterScreen.route)
                })
            }


        }
    }
}