package com.acasloa946.finalproject.framesettingsnotlogged

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_settings_not_logged'.
 * Generated code; do not edit directly
 */
@Composable
fun FrameSettingsNotLogged(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {},
    onRegisterClick: () -> Unit = {}
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
            FrameCheckBox {}
        }
    }
}

@Preview(widthDp = 447, heightDp = 230)
@Composable
private fun FrameSettingsNotLoggedPreview() {
    MaterialTheme {
        FrameSettingsNotLogged(
            onLoginClick = {},
            onRegisterClick = {}
        )
    }
}

@Composable
fun IniciarSesiN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar sesión",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ButtonIniciarSesion(
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 110.0.dp,
            top = 4.0.dp,
            end = 110.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        radius = 15.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onLoginClick)
    )
}

@Composable
fun Registrarse(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ButtonRegistrar(
    onRegisterClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 110.0.dp,
            top = 4.0.dp,
            end = 110.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        radius = 15.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onRegisterClick)
    )
}

@Composable
fun Line(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.frame_settings_not_logged_line),
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(1.0.dp)
    )
}

@Composable
fun ButtonsFrame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(399.0.dp).requiredHeight(98.0.dp)
    )
}

@Composable
fun HabilitarNotificaciones(modifier: Modifier = Modifier) {
    RelayText(
        content = "Habilitar notificaciones",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FrameCheckBox(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        clipToParent = false,
        radius = 33.0,
        content = content,
        modifier = modifier.requiredWidth(52.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun ButtonNot(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 32.0.dp,
            top = 11.0.dp,
            end = 32.0.dp,
            bottom = 11.0.dp
        ),
        itemSpacing = 8.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 24.0.dp),
        itemSpacing = 30.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
