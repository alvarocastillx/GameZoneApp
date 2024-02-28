package com.acasloa946.finalproject.cardgame

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
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
 * This composable was generated from the UI Package 'card_game'.
 * Generated code; do not edit directly
 */
@Composable
fun CardGame(
    modifier: Modifier = Modifier,
    textTitleOffer: String = "",
    textPriceOffer: String = "",
    onGameClick: () -> Unit = {}
) {
    TopLevel(
        onGameClick = onGameClick,
        modifier = modifier
    ) {
        FrameImage(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        ) {}
        FrameTitle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -40.0.dp
                )
            )
        ) {
            TextTitle(
                textTitleOffer = textTitleOffer,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -3.0.dp
                    )
                )
            )
        }
        FramePrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 40.0.dp
                )
            )
        ) {
            TextPrice(
                textPriceOffer = textPriceOffer,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -3.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 362, heightDp = 131)
@Composable
private fun CardGamePreview() {
    MaterialTheme {
        RelayContainer {
            CardGame(
                onGameClick = {},
                textTitleOffer = "Videogame",
                textPriceOffer = "10.50€",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun FrameImage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(356.0.dp).requiredHeight(125.0.dp)
    )
}

@Composable
fun TextTitle(
    textTitleOffer: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textTitleOffer,
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
        modifier = modifier.requiredWidth(239.0.dp).requiredHeight(25.0.dp)
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
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        radius = 7.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(239.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextPrice(
    textPriceOffer: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPriceOffer,
        fontSize = 20.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 26,
            green = 206,
            blue = 77
        ),
        height = 1.481999969482422.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(25.0.dp)
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
            red = 217,
            green = 217,
            blue = 217
        ),
        isStructured = false,
        radius = 7.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TopLevel(
    onGameClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 25.0,
        strokeWidth = 3.0,
        strokeColor = Color(
            alpha = 255,
            red = 26,
            green = 206,
            blue = 77
        ),
        content = content,
        modifier = modifier.tappable(onTap = onGameClick).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
