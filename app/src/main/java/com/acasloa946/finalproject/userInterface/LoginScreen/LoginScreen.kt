package com.acasloa946.finalproject.userInterface.LoginScreen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.navigation.Routes
import com.google.relay.compose.BoxScopeInstanceImpl.align

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen(loginViewmodel: LoginViewmodel, navController: NavController) {


    val context = LocalContext.current

    Scaffold(modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            // Contenedor con padding alrededor de la barra de navegación
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 11.dp,
                        bottom = 20.dp
                    ) // Ajusta la cantidad de espacio según tus necesidades
            ) {
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
        // Contenido de tu pantalla principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState(10000), true, reverseScrolling = true),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            LoginScreenComponent(modifier = Modifier.size(430.dp, 866.dp), loginViewmodel = loginViewmodel, onLoginClick = {
                loginViewmodel.login(onSuccess = {
                    if (loginViewmodel.admin){
                        navController.navigate(Routes.AdminScreen.route)
                    }
                    else {
                        navController.navigate(Routes.SettingsScreeen.route)
                    }
                },
                    onFailure = {
                        Toast.makeText(context,"El usuario y/o contraseña son incorrectos.",Toast.LENGTH_SHORT).show()
                    })
            })





        }
    }
}











