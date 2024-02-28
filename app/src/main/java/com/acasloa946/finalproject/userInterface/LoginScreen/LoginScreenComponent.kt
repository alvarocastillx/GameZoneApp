package com.acasloa946.finalproject.userInterface.LoginScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.loginscreen.ButtonLogin
import com.acasloa946.finalproject.loginscreen.FrameLogin
import com.acasloa946.finalproject.loginscreen.IniciarSesiN
import com.acasloa946.finalproject.loginscreen.LoginText
import com.acasloa946.finalproject.loginscreen.TextConfig
import com.acasloa946.finalproject.loginscreen.TextFieldMail
import com.acasloa946.finalproject.loginscreen.TextFieldPassw
import com.acasloa946.finalproject.loginscreen.TopLevel
import com.acasloa946.finalproject.loginscreen.Wallpaper


/**
 * Función composable de la pantalla Login
 */

@Composable
fun LoginScreenComponent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    loginViewmodel: LoginViewmodel
) {
    TopLevel(modifier = modifier) {
        Wallpaper(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = 0.0.dp
                )
            )
        )
        FrameLogin(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 99.0.dp
                )
            )
        ) {
            LoginText {
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
            TextFieldMail {
                TextField(
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
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email , contentDescription = null)
                    }
                )
            }
            TextFieldPassw {
                TextField(
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
                    visualTransformation = PasswordVisualTransformation(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = null)
                    })

            }
            ButtonLogin(onLoginClick = onLoginClick) {
                IniciarSesiN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
        }
    }
}



/*


 */