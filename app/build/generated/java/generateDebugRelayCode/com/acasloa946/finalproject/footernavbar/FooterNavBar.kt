package com.acasloa946.finalproject.footernavbar

import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'footer_nav_bar'.
 * Generated code; do not edit directly
 */
@Composable
fun FooterNavBar(
    modifier: Modifier = Modifier,
    onHomeClick: () -> Unit = {},
    onCatalogClick: () -> Unit = {},
    onSettingsClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        GrupoGZ(onHomeClick = onHomeClick) {
            TextGZ(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 2.75.dp,
                        y = 4.5.dp
                    )
                )
            )
        }
        Line2()
        ButtonCatalog(onCatalogClick = onCatalogClick)
        Line3()
        SettingsIcon(onSettingsClick = onSettingsClick)
    }
}

@Preview(widthDp = 404, heightDp = 66)
@Composable
private fun FooterNavBarPreview() {
    MaterialTheme {
        FooterNavBar(
            onHomeClick = {},
            onCatalogClick = {},
            onSettingsClick = {}
        )
    }
}

@Composable
fun TextGZ(modifier: Modifier = Modifier) {
    RelayText(
        content = "GZ",
        fontSize = 45.0.sp,
        fontFamily = mogra,
        color = Color(
            alpha = 255,
            red = 26,
            green = 206,
            blue = 77
        ),
        height = 1.2000000847710504.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(56.0.dp).requiredHeight(53.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun GrupoGZ(
    onHomeClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onHomeClick).requiredWidth(45.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun Line2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_nav_bar_line2),
        modifier = modifier.requiredWidth(2.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun ButtonCatalog(
    onCatalogClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayVector(
        vector = painterResource(R.drawable.footer_nav_bar_button_catalog),
        modifier = modifier.tappable(onTap = onCatalogClick).requiredWidth(49.5.dp).requiredHeight(26.205881118774414.dp)
    )
}

@Composable
fun Line3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_nav_bar_line3),
        modifier = modifier.requiredWidth(2.0.dp).requiredHeight(66.0.dp)
    )
}

@Composable
fun SettingsIcon(
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = painterResource(R.drawable.footer_nav_bar_settings_icon),
        contentScale = ContentScale.Crop,
        modifier = modifier.tappable(onTap = onSettingsClick).requiredWidth(47.0.dp).requiredHeight(47.0.dp)
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
            red = 0,
            green = 0,
            blue = 0
        ),
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 43.0.dp,
            top = 0.0.dp,
            end = 43.0.dp,
            bottom = 0.0.dp
        ),
        itemSpacing = 43.0,
        radius = 86.0,
        strokeWidth = 1.0,
        borderAlignment = BorderAlignment.Outside,
        strokeColor = Color(
            alpha = 255,
            red = 26,
            green = 206,
            blue = 77
        ),
        content = content,
        modifier = modifier
    )
}
