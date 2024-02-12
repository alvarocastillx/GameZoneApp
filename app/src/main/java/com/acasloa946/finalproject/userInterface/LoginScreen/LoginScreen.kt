package com.acasloa946.finalproject.userInterface.LoginScreen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.finalproject.bannerlogin.BannerLogin
import com.acasloa946.finalproject.buttoniniciarsesion.ButtonIniciarSesion
import com.acasloa946.finalproject.buttonregistrar.ButtonRegistrar
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.frameinfo.FrameInfo
import com.acasloa946.finalproject.framelogin.ButtonLogin
import com.acasloa946.finalproject.framelogin.FrameLogin
import com.acasloa946.finalproject.framelogin.IniciarSesiN
import com.acasloa946.finalproject.framelogin.LineaSeparatoria
import com.acasloa946.finalproject.framelogin.TextFieldMail
import com.acasloa946.finalproject.framelogin.TextFieldPassw
import com.acasloa946.finalproject.framelogin.TopLevel
import com.acasloa946.finalproject.navigation.Routes
import com.acasloa946.finalproject.userInterface.SettingsScreen.ViewmodelSettings
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
                    })

            }
        }
    ) {
        // Contenido de tu pantalla principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            BannerLogin(modifier = Modifier.size(430.dp, 82.dp))
            FrameLoginComponent(modifier = Modifier.size(429.dp, 805.dp), loginViewmodel = loginViewmodel, onLoginClick = {
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


@Composable
fun FrameLoginComponent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    loginViewmodel: LoginViewmodel
) {


    TopLevel(modifier = modifier) {
        LineaSeparatoria()
        TextFieldMail {
            androidx.compose.material3.OutlinedTextField(
                value = loginViewmodel.email, onValueChange = {
                    loginViewmodel.changeEmail(it)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                placeholder = {
                    Text("Introduzca su correo electrónico", color = Color.Black, fontSize = 15.sp)
                },
                modifier = Modifier.fillMaxWidth()
            )
        }
        TextFieldPassw {
            androidx.compose.material3.OutlinedTextField(
                value = loginViewmodel.passw, onValueChange = {
                    loginViewmodel.changePassw(it)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                ),
                placeholder = {
                    Text("Introduzca su contraseña", color = Color.Black, fontSize = 15.sp)
                },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation()
                //TODO: Mostrar contraseña
            )
        }
        ButtonLogin(onLoginClick = onLoginClick) {
            IniciarSesiN(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}
