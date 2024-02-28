package com.acasloa946.finalproject.buttoniniciarsesion

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'button_iniciar_sesion'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonIniciarSesion(
    modifier: Modifier = Modifier,
    textLoginButton: AnnotatedString = AnnotatedString(""),
    onLoginClick: () -> Unit = {}
) {
    TopLevel(
        onLoginClick = onLoginClick,
        modifier = modifier
    ) {
        IniciarSesiN(
            textLoginButton = textLoginButton,
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

@Preview(widthDp = 400, heightDp = 38)
@Composable
private fun ButtonIniciarSesionPreview() {
    MaterialTheme {
        RelayContainer {
            ButtonIniciarSesion(
                onLoginClick = {},
                textLoginButton = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 21.0.sp)) {
                        append("Iniciar sesión ")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Color(
                                alpha = 255,
                                red = 26,
                                green = 206,
                                blue = 77
                            ),
                            fontSize = 21.0.sp
                        )
                    ) {
                        append(">")
                    }
                },
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun IniciarSesiN(
    textLoginButton: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textLoginButton,
        fontSize = 21.0.sp,
        fontFamily = merriweather,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.2569999694824219.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(228.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    onLoginClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 15.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onLoginClick).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
