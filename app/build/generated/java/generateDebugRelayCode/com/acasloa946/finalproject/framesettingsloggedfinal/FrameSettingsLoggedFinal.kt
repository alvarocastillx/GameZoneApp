package com.acasloa946.finalproject.framesettingsloggedfinal

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'frame_settings_logged_final'.
 * Generated code; do not edit directly
 */
@Composable
fun FrameSettingsLoggedFinal(
    modifier: Modifier = Modifier,
    onInfoClick: () -> Unit = {},
    onLogoutClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ButtonNot {
            HabilitarNotificaciones()
            FrameCheckBox {}
        }
        ButtonInfoAccount(onInfoClick = onInfoClick) {
            InformaciNDeCuenta()
        }
        ButtonLogOut(onLogoutClick = onLogoutClick) {
            CerrarSesiN()
        }
    }
}

@Preview(widthDp = 316, heightDp = 200)
@Composable
private fun FrameSettingsLoggedFinalPreview() {
    MaterialTheme {
        FrameSettingsLoggedFinal(
            onInfoClick = {},
            onLogoutClick = {}
        )
    }
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
fun InformaciNDeCuenta(modifier: Modifier = Modifier) {
    RelayText(
        content = "Información de cuenta",
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
fun ButtonInfoAccount(
    onInfoClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 63.0.dp,
            top = 4.0.dp,
            end = 63.0.dp,
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
        modifier = modifier.tappable(onTap = onInfoClick)
    )
}

@Composable
fun CerrarSesiN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Cerrar sesión",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 255,
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
fun ButtonLogOut(
    onLogoutClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 63.0.dp,
            top = 4.0.dp,
            end = 63.0.dp,
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
        modifier = modifier.tappable(onTap = onLogoutClick)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        padding = PaddingValues(all = 24.0.dp),
        itemSpacing = 16.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}
