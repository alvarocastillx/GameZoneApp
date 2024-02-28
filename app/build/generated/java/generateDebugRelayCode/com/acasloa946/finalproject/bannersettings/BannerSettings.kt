package com.acasloa946.finalproject.bannersettings

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

/**
 * This composable was generated from the UI Package 'banner_settings'.
 * Generated code; do not edit directly
 */
@Composable
fun BannerSettings(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        WallPaper(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = 0.0.dp
                )
            )
        )
        TextRegister(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -0.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 428, heightDp = 89)
@Composable
private fun BannerSettingsPreview() {
    MaterialTheme {
        RelayContainer {
            BannerSettings(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun WallPaper(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.banner_settings_wall_paper),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(89.0.dp)
    )
}

@Composable
fun TextRegister(modifier: Modifier = Modifier) {
    RelayText(
        content = "CONFIGURACIÓN",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 235,
            blue = 100
        ),
        height = 1.481999969482422.em,
        letterSpacing = 3.3.sp,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(428.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
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
