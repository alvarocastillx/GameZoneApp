package com.acasloa946.finalproject.userInterface.SettingsScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.acasloa946.finalproject.R
import com.acasloa946.finalproject.framesettingslogged.ButtonInfoAccount
import com.acasloa946.finalproject.framesettingslogged.ButtonLogOut
import com.acasloa946.finalproject.framesettingslogged.CerrarSesiN
import com.acasloa946.finalproject.framesettingslogged.InformaciNDeCuenta
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
        ButtonNot(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.5.dp,
                    y = -234.5.dp
                )
            )
        ) {
            HabilitarNotificaciones(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -25.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            FrameCheckBox(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 78.5.dp,
                        y = 0.0.dp
                    )
                )
            ) {
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
        ButtonsFrame(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -313.5.dp
                )
            )
        ) {
            ButtonIniciarSesion(
                onLoginClick = onLoginClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -104.0.dp,
                        y = -1.0.dp
                    )
                )
            ) {
                IniciarSesiN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -0.5.dp
                        )
                    )
                )
            }
            ButtonRegistrar(
                onRegisterClick = onRegisterClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 100.0.dp,
                        y = -0.5.dp
                    )
                )
            ) {
                Registrarse(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            Line(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 34.0.dp
                    )
                )
            )
        }
    }
}

@Composable
fun FrameSettingsLoggedComponent(
    modifier: Modifier = Modifier,
    onInfoClick: () -> Unit = {},
    onLogOutClick: () -> Unit = {},
    settingsViewmodel: SettingsViewmodel
) {
    com.acasloa946.finalproject.framesettingslogged.TopLevel(modifier = modifier) {
        com.acasloa946.finalproject.framesettingslogged.ButtonNot(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -269.0.dp
                )
            )
        ) {
            com.acasloa946.finalproject.framesettingslogged.HabilitarNotificaciones(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -25.5.dp,
                        y = 0.0.dp
                    )
                )
            )
            com.acasloa946.finalproject.framesettingslogged.FrameCheckBox(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 78.5.dp,
                        y = 0.0.dp
                    )
                )
            ) {
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
        ButtonInfoAccount(
            onInfoClick = onInfoClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -204.5.dp
                )
            )
        ) {
            InformaciNDeCuenta(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.5.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        ButtonLogOut(
            onLogOutClick = onLogOutClick,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -151.5.dp
                )
            )
        ) {
            CerrarSesiN(
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


@Composable
fun InfoDialog(settingsViewmodel: SettingsViewmodel, onAcceptClick : () -> Unit) {
    if (settingsViewmodel.showInfoDialog) {
        Dialog(onDismissRequest = { settingsViewmodel.closeDialog() }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(Color(0xFFD9D9D9)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                com.acasloa946.finalproject.infodialog.InfoDialog(modifier = Modifier.size(358.dp,416.dp), onAcceptClick = onAcceptClick)
            }
        }
    }
}