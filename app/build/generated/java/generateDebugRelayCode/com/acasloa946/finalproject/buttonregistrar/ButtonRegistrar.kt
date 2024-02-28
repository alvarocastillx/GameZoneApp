package com.acasloa946.finalproject.buttonregistrar

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
 * This composable was generated from the UI Package 'button_registrar'.
 * Generated code; do not edit directly
 */
@Composable
fun ButtonRegistrar(
    modifier: Modifier = Modifier,
    textRegisterButton: AnnotatedString = AnnotatedString(""),
    onRegisterClick: () -> Unit = {}
) {
    TopLevel(
        onRegisterClick = onRegisterClick,
        modifier = modifier
    ) {
        Registrarse(
            textRegisterButton = textRegisterButton,
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
private fun ButtonRegistrarPreview() {
    MaterialTheme {
        RelayContainer {
            ButtonRegistrar(
                onRegisterClick = {},
                textRegisterButton = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontSize = 21.0.sp)) {
                        append("Registrarse ")
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
fun Registrarse(
    textRegisterButton: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textRegisterButton,
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
        modifier = modifier.requiredWidth(206.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun TopLevel(
    onRegisterClick: () -> Unit,
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
        modifier = modifier.tappable(onTap = onRegisterClick).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
