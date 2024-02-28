package com.acasloa946.finalproject.userInterface.RegisterScreen

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

/**
 * Función de la pantalla de registro
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
    fun RegisterScreen(registerViewmodel: RegisterViewmodel, navController: NavController) {


    val context = LocalContext.current

    Scaffold(modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 11.dp,
                        bottom = 20.dp
                    )
            ) {
                //Llamada a función de barra de navegación
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
        //C0lumna principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState(10000), false, reverseScrolling = true),
            horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            //Llamada al componente principal de la pantalla de registro
            RegisterScreenComponent(modifier = Modifier.size(430.dp,886.dp), registerViewmodel = registerViewmodel, onRegisterClick = {
                registerViewmodel.registerUser(onSuccess = {
                    Toast.makeText(context,"Cuenta creada correctamente.",Toast.LENGTH_SHORT).show()
                    navController.navigate(Routes.HomeScreen.route)
                },
                    onFailure = {
                        Toast.makeText(context,"La cuenta no pudo ser creada, inténtelo de nuevo.",Toast.LENGTH_SHORT).show()
                    })
            })
        }
    }
}