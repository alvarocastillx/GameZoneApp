package com.acasloa946.finalproject.loginscreen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.google.relay.compose.CrossAxisAlignment
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'login_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClick: () -> Unit = {}
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
                    x = 0.0.dp,
                    y = 70.0.dp
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
            TextFieldMail {}
            TextFieldPassw {}
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

@Preview(widthDp = 430, heightDp = 795)
@Composable
private fun LoginScreenPreview() {
    MaterialTheme {
        RelayContainer {
            LoginScreen(
                onLoginClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Wallpaper(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.login_screen_wallpaper),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(255.0.dp)
    )
}

@Composable
fun TextConfig(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar sesión",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.481999969482422.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(428.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun LoginText(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(349.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun TextFieldMail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(349.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun TextFieldPassw(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(349.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun IniciarSesiN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Iniciar sesión",
        fontSize = 21.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999876476466.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(146.0.dp).requiredHeight(38.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ButtonLogin(
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
        modifier = modifier.tappable(onTap = onLoginClick).requiredWidth(146.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun FrameLogin(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.End,
        padding = PaddingValues(
            start = 39.0.dp,
            top = 47.0.dp,
            end = 39.0.dp,
            bottom = 47.0.dp
        ),
        itemSpacing = 57.0,
        clipToParent = false,
        radius = 41.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(597.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
