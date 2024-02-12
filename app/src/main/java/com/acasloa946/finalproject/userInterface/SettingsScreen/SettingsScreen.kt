package com.acasloa946.finalproject.userInterface.SettingsScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.finalproject.bannerlogin.BannerLogin
import com.acasloa946.finalproject.bannersettings.BannerSettings
import com.acasloa946.finalproject.buttoniniciarsesion.ButtonIniciarSesion
import com.acasloa946.finalproject.buttonregistrar.ButtonRegistrar
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.frameinfo.FrameInfo
import com.acasloa946.finalproject.navigation.Routes
import com.google.relay.compose.BoxScopeInstanceImpl.align

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingsScreen(viewmodelSettings: ViewmodelSettings, navController: NavController){
    LaunchedEffect(true) {
        viewmodelSettings.getLogged()
    }

    Scaffold( modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            // Contenedor con padding alrededor de la barra de navegación
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 11.dp, bottom = 20.dp) // Ajusta la cantidad de espacio según tus necesidades
            ) {
                FooterNavBar(modifier = Modifier.size(392.dp,66.dp),
                    onSettingsClick = {
                        navController.navigate(Routes.SettingsScreeen.route)
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
            BannerSettings(modifier = Modifier.size(430.dp, 82.dp))
            Spacer(modifier = Modifier.padding(10.dp))
            if (viewmodelSettings.logged) {
                FrameInfo(modifier = Modifier.size(399.dp,696.dp),
                    textUser = viewmodelSettings.auth.currentUser?.email.toString(),
                    textMail = viewmodelSettings.auth.currentUser?.email.toString(),
                    onSignOutClick = {
                        viewmodelSettings.signOut()
                        navController.navigate(Routes.SettingsScreeen.route)
                    })
            }
            else {
                Spacer(modifier = Modifier.padding(10.dp))
                ButtonIniciarSesion(modifier = Modifier
                    .size(400.dp, 38.dp)
                    .padding(top = 10.dp), textLoginButton = AnnotatedString("Iniciar sesión"),
                    onLoginClick = {
                        navController.navigate(Routes.LoginScreen.route)
                    })
                ButtonRegistrar(modifier = Modifier
                    .size(400.dp, 38.dp)
                    .padding(top = 10.dp), textRegisterButton = AnnotatedString("Registrarse"))
            }



        }
    }
}