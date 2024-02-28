package com.acasloa946.finalproject.framecatalogscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'frame_catalog_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun FrameCatalogScreen(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        CatalogText()
        AllVideoGamesText()
        FrameCards(modifier = Modifier.columnWeight(1.0f)) {}
    }
}

@Preview(widthDp = 429, heightDp = 1436)
@Composable
private fun FrameCatalogScreenPreview() {
    MaterialTheme {
        RelayContainer {
            FrameCatalogScreen(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun CatalogText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Catálogo",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.481999969482422.em,
        modifier = modifier
    )
}

@Composable
fun AllVideoGamesText(modifier: Modifier = Modifier) {
    RelayText(
        content = "Todos los videojuegos",
        fontSize = 26.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000575138972.em,
        modifier = modifier
    )
}

@Composable
fun FrameCards(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(389.0.dp).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 51.0.dp,
            top = 23.0.dp,
            end = 51.0.dp,
            bottom = 23.0.dp
        ),
        itemSpacing = 28.0,
        clipToParent = false,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.0f to Color(
                            alpha = 255,
                            red = 217,
                            green = 217,
                            blue = 217
                        ),
                        0.5f to Color(
                            alpha = 255,
                            red = 0,
                            green = 0,
                            blue = 0
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 255,
                            red = 0,
                            green = 235,
                            blue = 100
                        ),
                        start = Offset(
                            0.5f,
                            0.0f
                        ),
                        end = Offset(
                            0.5f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
