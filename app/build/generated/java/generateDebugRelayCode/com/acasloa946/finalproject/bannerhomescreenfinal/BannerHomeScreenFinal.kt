package com.acasloa946.finalproject.bannerhomescreenfinal

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.acasloa946.finalproject.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'banner_home_screen_final'.
 * Generated code; do not edit directly
 */
@Composable
fun BannerHomeScreenFinal(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        TopLevelSynth {
            Wallpaper()
        }
        IMGGamezone(
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

@Preview(widthDp = 429, heightDp = 134)
@Composable
private fun BannerHomeScreenFinalPreview() {
    MaterialTheme {
        RelayContainer {
            BannerHomeScreenFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Wallpaper(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.banner_home_screen_final_wallpaper),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(134.0.dp)
    )
}

@Composable
fun TopLevelSynth(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        itemSpacing = 10.0,
        content = content,
        modifier = modifier.alpha(alpha = 100.0f)
    )
}

@Composable
fun IMGGamezone(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.banner_home_screen_final_imggamezone),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(135.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
