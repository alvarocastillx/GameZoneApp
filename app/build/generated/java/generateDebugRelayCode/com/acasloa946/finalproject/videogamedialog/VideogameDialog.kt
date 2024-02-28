package com.acasloa946.finalproject.videogamedialog

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
import androidx.compose.ui.text.font.FontWeight
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
 * This composable was generated from the UI Package 'videogame_dialog'.
 * Generated code; do not edit directly
 */
@Composable
fun VideogameDialog(
    modifier: Modifier = Modifier,
    textTitle0: String = "",
    textMetacritic: String = "",
    textTitle1: String = "",
    textPublisher: String = "",
    textYear: String = "",
    textPrice: String = "",
    onBuyClick: () -> Unit = {},
    onExitClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        ImageVideogame {}
        VideogameText(textTitle0 = textTitle0)
        FrameMetacritic {
            TextMetacritic(
                textMetacritic = textMetacritic,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -0.5.dp
                    )
                )
            )
        }
        FrameInfo {
            TextInfo()
            TextTitle()
            FrameTitle {
                EditableTextTitle(
                    textTitle1 = textTitle1,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextPublisher()
            FramePublisher {
                EditableTextPublisher(
                    textPublisher = textPublisher,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextYear()
            FrameYear {
                EditableTextYear(
                    textYear = textYear,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextPrice()
            FramePrice {
                EditableTextPrice(
                    textPrice = textPrice,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextPlatforms()
            FramePlatforms {}
        }
        BuyButton(onBuyClick = onBuyClick) {
            Comprar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        ExitButton(onExitClick = onExitClick) {
            Salir(
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

@Preview(widthDp = 358, heightDp = 856)
@Composable
private fun VideogameDialogPreview() {
    MaterialTheme {
        RelayContainer {
            VideogameDialog(
                textTitle0 = "Videogame",
                onBuyClick = {},
                onExitClick = {},
                textMetacritic = "77",
                textTitle1 = "title",
                textPublisher = "publisher",
                textYear = "year",
                textPrice = "price",
                modifier = Modifier.rowWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImageVideogame(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(212.0.dp).requiredHeight(114.0.dp)
    )
}

@Composable
fun VideogameText(
    textTitle0: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textTitle0,
        fontSize = 20.0.sp,
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
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun TextMetacritic(
    textMetacritic: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textMetacritic,
        fontSize = 20.0.sp,
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
        modifier = modifier.requiredWidth(56.0.dp).requiredHeight(57.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FrameMetacritic(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 26,
            green = 206,
            blue = 77
        ),
        isStructured = false,
        clipToParent = false,
        radius = 17.0,
        content = content,
        modifier = modifier.requiredWidth(56.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun TextInfo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Información sobre el videojuego",
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999422345842.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun TextTitle(modifier: Modifier = Modifier) {
    RelayText(
        content = "Título",
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999422345842.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun EditableTextTitle(
    textTitle1: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textTitle1,
        fontSize = 13.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.4820000575138972.em,
        letterSpacing = 1.43.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FrameTitle(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        clipToParent = false,
        radius = 13.0,
        content = content,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextPublisher(modifier: Modifier = Modifier) {
    RelayText(
        content = "Publisher",
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999422345842.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun EditableTextPublisher(
    textPublisher: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPublisher,
        fontSize = 13.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.4820000575138972.em,
        letterSpacing = 1.43.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FramePublisher(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        clipToParent = false,
        radius = 13.0,
        content = content,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextYear(modifier: Modifier = Modifier) {
    RelayText(
        content = "Año de publicación",
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999422345842.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun EditableTextYear(
    textYear: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textYear,
        fontSize = 13.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.4820000575138972.em,
        letterSpacing = 1.43.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FrameYear(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        clipToParent = false,
        radius = 13.0,
        content = content,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextPrice(modifier: Modifier = Modifier) {
    RelayText(
        content = "Precio",
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999422345842.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun EditableTextPrice(
    textPrice: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPrice,
        fontSize = 13.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.4820000575138972.em,
        letterSpacing = 1.43.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun FramePrice(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        isStructured = false,
        clipToParent = false,
        radius = 13.0,
        content = content,
        modifier = modifier.requiredWidth(287.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextPlatforms(modifier: Modifier = Modifier) {
    RelayText(
        content = "Plataformas",
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4819999422345842.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(25.0.dp)
    )
}

@Composable
fun FramePlatforms(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(277.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun FrameInfo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        clipToParent = false,
        content = content,
        modifier = modifier
    )
}

@Composable
fun Comprar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Comprar",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(192.0.dp).requiredHeight(31.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun BuyButton(
    onBuyClick: () -> Unit,
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
        modifier = modifier.tappable(onTap = onBuyClick).requiredWidth(192.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun Salir(modifier: Modifier = Modifier) {
    RelayText(
        content = "Salir",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(192.0.dp).requiredHeight(31.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ExitButton(
    onExitClick: () -> Unit,
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
        modifier = modifier.tappable(onTap = onExitClick).requiredWidth(192.0.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun TopLevel(
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
        padding = PaddingValues(
            start = 83.0.dp,
            top = 60.0.dp,
            end = 83.0.dp,
            bottom = 60.0.dp
        ),
        itemSpacing = 15.0,
        clipToParent = false,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.fillMaxWidth(1.0f)
    )
}
