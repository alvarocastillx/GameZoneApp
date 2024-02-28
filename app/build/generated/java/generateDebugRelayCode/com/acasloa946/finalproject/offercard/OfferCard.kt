package com.acasloa946.finalproject.offercard

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
 * This composable was generated from the UI Package 'offer_card'.
 * Generated code; do not edit directly
 */
@Composable
fun OfferCard(
    modifier: Modifier = Modifier,
    textPrice: String = "",
    textTitle: String = "",
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
                    x = -1.0.dp,
                    y = 0.0.dp
                )
            )
        ) {}
        FramePrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = 84.5.dp
                )
            )
        ) {
            TextPrice(
                textPrice = textPrice,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -3.0.dp
                    )
                )
            )
        }
        FrameTitle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -84.5.dp
                )
            )
        ) {
            TextTitle(
                textTitle = textTitle,
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

@Preview(widthDp = 192, heightDp = 230)
@Composable
private fun OfferCardPreview() {
    MaterialTheme {
        RelayContainer {
            OfferCard(
                onGameClick = {},
                textPrice = "20,00€",
                textTitle = "Videogame",
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
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier.requiredWidth(184.0.dp).requiredHeight(224.0.dp)
    )
}

@Composable
fun TextPrice(
    textPrice: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPrice,
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
        modifier = modifier.requiredWidth(160.0.dp).requiredHeight(25.0.dp)
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
            red = 26,
            green = 206,
            blue = 77
        ),
        isStructured = false,
        radius = 40.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(160.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TextTitle(
    textTitle: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textTitle,
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
        modifier = modifier.requiredWidth(160.0.dp).requiredHeight(25.0.dp)
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
            red = 26,
            green = 206,
            blue = 77
        ),
        isStructured = false,
        radius = 40.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.requiredWidth(160.0.dp).requiredHeight(29.0.dp)
    )
}

@Composable
fun TopLevel(
    onGameClick: () -> Unit,
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
