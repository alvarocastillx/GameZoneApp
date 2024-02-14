package com.acasloa946.finalproject.userInterface.LoginScreen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.acasloa946.finalproject.R
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.loginscreen.BannerLogin
import com.acasloa946.finalproject.loginscreen.ButtonLogin
import com.acasloa946.finalproject.loginscreen.FrameLogin
import com.acasloa946.finalproject.loginscreen.ImageGZ
import com.acasloa946.finalproject.loginscreen.IniciarSesiN
import com.acasloa946.finalproject.loginscreen.LoginText
import com.acasloa946.finalproject.loginscreen.TextConfig
import com.acasloa946.finalproject.loginscreen.TextFieldMail
import com.acasloa946.finalproject.loginscreen.TextFieldPassw
import com.acasloa946.finalproject.loginscreen.TopLevel
import com.acasloa946.finalproject.loginscreen.Wallpaper
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
                    })

            }
        }
    ) {
        // Contenido de tu pantalla principal
        Column(
            modifier = Modifier
                .fillMaxSize().verticalScroll(rememberScrollState(10000), false, reverseScrolling = true),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {
            LoginScreenComponent(modifier = Modifier.size(0.dp, 866.dp), loginViewmodel = loginViewmodel, onLoginClick = {
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
fun LoginScreenComponent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    loginViewmodel: LoginViewmodel,
) {
    TopLevel(modifier = modifier) {
        BannerLogin(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = -315.5.dp
                )
            )
        ) {
            Wallpaper(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            ImageGZ(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.25.dp,
                        y = -23.718307495117188.dp
                    )
                )
            ) {

                Image(painter = painterResource(id = R.drawable.bannerhomescreen), contentDescription = null, modifier = Modifier.fillMaxSize())
            }
        }
        FrameLogin(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 104.0.dp
                )
            )
        ) {
            TextFieldMail(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = -104.0.dp
                    )
                )
            ) {
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
            TextFieldPassw(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = -1.0.dp
                    )
                )
            ) {
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
            ButtonLogin(
                onLoginClick = onLoginClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.5.dp,
                        y = 92.0.dp
                    )
                )
            ) {
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
            LoginText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -251.0.dp
                    )
                )
            ) {
                TextConfig(
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
}