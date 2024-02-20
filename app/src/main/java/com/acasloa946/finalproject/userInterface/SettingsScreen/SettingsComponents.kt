package com.acasloa946.finalproject.userInterface.SettingsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.acasloa946.finalproject.framesettingsloggedfinal.ButtonInfoAccount
import com.acasloa946.finalproject.framesettingsloggedfinal.ButtonLogOut
import com.acasloa946.finalproject.framesettingsloggedfinal.CerrarSesiN
import com.acasloa946.finalproject.framesettingsloggedfinal.InformaciNDeCuenta
import com.acasloa946.finalproject.framesettingsnotlogged.ButtonIniciarSesion
import com.acasloa946.finalproject.framesettingsnotlogged.ButtonNot
import com.acasloa946.finalproject.framesettingsnotlogged.ButtonRegistrar
import com.acasloa946.finalproject.framesettingsnotlogged.ButtonsFrame
import com.acasloa946.finalproject.framesettingsnotlogged.FrameCheckBox
import com.acasloa946.finalproject.framesettingsnotlogged.HabilitarNotificaciones
import com.acasloa946.finalproject.framesettingsnotlogged.IniciarSesiN
import com.acasloa946.finalproject.framesettingsnotlogged.Line
import com.acasloa946.finalproject.framesettingsnotlogged.Registrarse
import com.acasloa946.finalproject.framesettingsnotlogged.TopLevel

@Composable
fun FrameSettingsNotLoggedComponent(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {},
    settingsViewmodel: SettingsViewmodel
) {
    TopLevel(modifier = modifier) {
        ButtonsFrame {
            ButtonIniciarSesion(onLoginClick = onLoginClick) {
                IniciarSesiN()
            }
            ButtonRegistrar(onRegisterClick = onRegisterClick) {
                Registrarse()
            }
            Line(modifier = Modifier.rowWeight(1.0f))
        }
        ButtonNot {
            HabilitarNotificaciones()
            FrameCheckBox {
                androidx.compose.material3.Switch(
                    checked = settingsViewmodel.checkBoxNotification,
                    onCheckedChange = { settingsViewmodel.changeCheckbox(it) },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(
                        checkedTrackColor = Color(
                            0xFF1ACE4D
                        )
                    )
                )
            }
        }
    }
}
@Composable
fun FrameSettingsLoggedFinalComponent(
    modifier: Modifier = Modifier,
    onInfoClick: () -> Unit = {},
    onLogoutClick: () -> Unit = {},
    settingsViewmodel: SettingsViewmodel
) {
    com.acasloa946.finalproject.framesettingsloggedfinal.TopLevel(modifier = modifier) {
        com.acasloa946.finalproject.framesettingsloggedfinal.ButtonNot {
            com.acasloa946.finalproject.framesettingsloggedfinal.HabilitarNotificaciones()
            com.acasloa946.finalproject.framesettingsloggedfinal.FrameCheckBox {
                androidx.compose.material3.Switch(
                    checked = settingsViewmodel.checkBoxNotification,
                    onCheckedChange = { settingsViewmodel.changeCheckbox(it) },
                    modifier = Modifier
                        .width(52.dp)
                        .height(32.dp)
                        .background(
                            color = Color(0xFFFFFFFF),
                            shape = RoundedCornerShape(size = 100.dp)
                        )
                        .padding(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 2.dp),
                    colors = androidx.compose.material3.SwitchDefaults.colors(
                        checkedTrackColor = Color(
                            0xFF1ACE4D
                        )))
            }
        }
        ButtonInfoAccount(onInfoClick = onInfoClick) {
            InformaciNDeCuenta()
        }
        ButtonLogOut(onLogoutClick = onLogoutClick) {
            CerrarSesiN()
        }
    }
}


@Composable
fun InfoDialog(settingsViewmodel: SettingsViewmodel, onAcceptClick : () -> Unit, textEmail:String, textUser:String) {
    if (settingsViewmodel.showInfoDialog) {
        Dialog(onDismissRequest = { settingsViewmodel.closeDialog() }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(Color(0xFFD9D9D9)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                com.acasloa946.finalproject.infodialog.InfoDialog(modifier = Modifier.size(358.dp,416.dp), onAcceptClick = onAcceptClick, textEmail = textEmail, textUser = textUser)
            }
        }
    }
}