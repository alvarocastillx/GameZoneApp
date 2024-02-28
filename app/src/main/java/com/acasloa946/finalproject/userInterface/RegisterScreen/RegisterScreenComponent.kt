package com.acasloa946.finalproject.userInterface.RegisterScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.acasloa946.finalproject.registerscreen.BannerRegister
import com.acasloa946.finalproject.registerscreen.ButtonRegister
import com.acasloa946.finalproject.registerscreen.FrameRegister
import com.acasloa946.finalproject.registerscreen.ImageGZ
import com.acasloa946.finalproject.registerscreen.RegisterText
import com.acasloa946.finalproject.registerscreen.Registrarse
import com.acasloa946.finalproject.registerscreen.TextFieldMail
import com.acasloa946.finalproject.registerscreen.TextFieldPassw
import com.acasloa946.finalproject.registerscreen.TextFieldUser
import com.acasloa946.finalproject.registerscreen.TextRegister
import com.acasloa946.finalproject.registerscreen.TopLevel
import com.acasloa946.finalproject.registerscreen.Wallpaper

/**
 * Función composable de la pantalla de registro
 */
@Composable
fun RegisterScreenComponent(
    modifier: Modifier = Modifier,
    onRegisterClick: () -> Unit = {},
    registerViewmodel: RegisterViewmodel
) {
    TopLevel(modifier = modifier) {
        BannerRegister(
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
        FrameRegister(
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
                        y = -58.0.dp
                    )
                )
            ) {
                androidx.compose.material3.TextField(
                    value = registerViewmodel.email, onValueChange = {
                        registerViewmodel.changeEmail(it)
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
            TextFieldPassw(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 45.0.dp
                    )
                )
            ) {
                androidx.compose.material3.TextField(
                    value = registerViewmodel.passw, onValueChange = {
                        registerViewmodel.changePassw(it)
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
                        Icon(imageVector = Icons.Default.Lock , contentDescription = null)
                    }
                )
            }
            TextFieldUser(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = -160.0.dp
                    )
                )
            ) {
                androidx.compose.material3.TextField(
                    value = registerViewmodel.username, onValueChange = {
                        registerViewmodel.changeUsername(it)
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
                        Text("Introduzca su nombre de usuario", color = Color.Black, fontSize = 15.sp)
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Face , contentDescription = null)
                    }
                )
            }
            ButtonRegister(
                onRegisterClick = onRegisterClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.5.dp,
                        y = 138.0.dp
                    )
                )
            ) {
                Registrarse(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.5.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            RegisterText(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -251.0.dp
                    )
                )
            ) {
                TextRegister(
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
