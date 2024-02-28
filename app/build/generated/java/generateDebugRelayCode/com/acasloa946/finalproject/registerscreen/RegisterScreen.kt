package com.acasloa946.finalproject.registerscreen

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
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'register_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun RegisterScreen(
    modifier: Modifier = Modifier,
    onRegisterClick: () -> Unit = {}
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
                        x = 0.75.dp,
                        y = -15.718307495117188.dp
                    )
                )
            ) {
                IMGGamezone(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -0.25.dp,
                            y = -10.0.dp
                        )
                    )
                )
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
            ) {}
            TextFieldPassw(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 45.0.dp
                    )
                )
            ) {}
            TextFieldUser(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = -160.0.dp
                    )
                )
            ) {}
            ButtonRegister(
                onRegisterClick = onRegisterClick,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 138.0.dp
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

@Preview(widthDp = 430, heightDp = 886)
@Composable
private fun RegisterScreenPreview() {
    MaterialTheme {
        RelayContainer {
            RegisterScreen(
                onRegisterClick = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Wallpaper(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.register_screen_wallpaper),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(255.0.dp)
    )
}

@Composable
fun IMGGamezone(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.register_screen_imggamezone),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(308.5.dp).requiredHeight(187.56338500976562.dp)
    )
}

@Composable
fun ImageGZ(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(308.5.dp).requiredHeight(187.56338500976562.dp)
    )
}

@Composable
fun BannerRegister(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(255.0.dp)
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
fun TextFieldUser(
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
fun Registrarse(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
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
        modifier = modifier.requiredWidth(173.0.dp).requiredHeight(38.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ButtonRegister(
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
        modifier = modifier.tappable(onTap = onRegisterClick).requiredWidth(173.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun TextRegister(modifier: Modifier = Modifier) {
    RelayText(
        content = "Registrarse",
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
fun RegisterText(
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
fun FrameRegister(
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
        radius = 41.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(678.0.dp)
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
