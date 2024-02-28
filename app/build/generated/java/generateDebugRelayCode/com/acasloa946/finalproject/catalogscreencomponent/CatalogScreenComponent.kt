package com.acasloa946.finalproject.catalogscreencomponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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

/**
 * This composable was generated from the UI Package 'catalog_screen_component'.
 * Generated code; do not edit directly
 */
@Composable
fun CatalogScreenComponent(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        FrameBanner {
            GameZoneIMG(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -27.5.dp
                    )
                )
            )
        }
        FrameCatalogScreen {
            CatalogText()
            AllVideoGamesText()
            FrameCards(modifier = Modifier.columnWeight(1.0f)) {}
        }
    }
}

@Preview(widthDp = 430, heightDp = 1567)
@Composable
private fun CatalogScreenComponentPreview() {
    MaterialTheme {
        CatalogScreenComponent()
    }
}

@Composable
fun GameZoneIMG(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.catalog_screen_component_game_zone_img),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun FrameBanner(
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
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(195.0.dp)
    )
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
fun FrameCatalogScreen(
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
        radius = 55.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
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
                        0.47f to Color(
                            alpha = 255,
                            red = 0,
                            green = 0,
                            blue = 0
                        ),
                        0.95f to Color(
                            alpha = 255,
                            red = 26,
                            green = 206,
                            blue = 77
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
        ).requiredWidth(429.0.dp).requiredHeight(1420.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.End,
        itemSpacing = -48.0,
        content = content,
        modifier = modifier
    )
}
