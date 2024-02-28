package com.acasloa946.finalproject.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'home_screen'.
 * Generated code; do not edit directly
 */
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    textPrice1: String = "",
    textTitle1: String = "",
    textPrice2: String = "",
    textTitle2: String = "",
    onULClick: () -> Unit = {},
    onMVClick: () -> Unit = {},
    onCatalogClick: () -> Unit = {}
) {
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
        MainHomeScreenComp2 {
            TextUltLanzamientos()
            UltimosLanzamientosBox(onULClick = onULClick) {
                CajaUL(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                LineaSeparaotiaBox1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.125.dp,
                            y = 115.69806814193726.dp
                        )
                    )
                )
                VideogamePrice(
                    textPrice1 = textPrice1,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = 140.99563217163086.dp
                        )
                    )
                )
                VideogameText1(
                    textTitle1 = textTitle1,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = -138.4894256591797.dp
                        )
                    )
                )
                VideogameImage1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -33.129417419433594.dp
                        )
                    )
                ) {}
                FramePlatforms1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 77.47181701660156.dp
                        )
                    )
                ) {}
            }
            Line3()
            TextMejorValorados()
            MejorValoradosBox(onMVClick = onMVClick) {
                CajaMV(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                LineaSeparaotiaBox2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.125.dp,
                            y = 115.69811391830444.dp
                        )
                    )
                )
                VideogamePrice2(
                    textPrice2 = textPrice2,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = 141.1822166442871.dp
                        )
                    )
                )
                VideogameText(
                    textTitle2 = textTitle2,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = -137.75181579589844.dp
                        )
                    )
                )
                VideogameImage(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -33.129417419433594.dp
                        )
                    )
                ) {}
                FramePlatforms(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 77.47181701660156.dp
                        )
                    )
                ) {}
            }
            Line4()
            TextOffers()
            FrameOffers {}
            ButtonIniciarSesion(onCatalogClick = onCatalogClick) {
                VerCatLogo()
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 1627)
@Composable
private fun HomeScreenPreview() {
    MaterialTheme {
        RelayContainer {
            HomeScreen(
                onULClick = {},
                onMVClick = {},
                onCatalogClick = {},
                textPrice1 = "20,99€",
                textTitle1 = "Videogame",
                textPrice2 = "20,99€",
                textTitle2 = "Videogame",
                modifier = Modifier.columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun GameZoneIMG(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_screen_game_zone_img),
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
fun TextUltLanzamientos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Últimos lanzamientos",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.481999969482422.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(327.0.dp).requiredHeight(38.73591613769531.dp)
    )
}

@Composable
fun CajaUL(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_caja_ul),
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(342.5070495605469.dp)
    )
}

@Composable
fun LineaSeparaotiaBox1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_linea_separaotia_box1),
        modifier = modifier.requiredWidth(343.0.dp).requiredHeight(1.0193662643432617.dp)
    )
}

@Composable
fun VideogamePrice(
    textPrice1: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPrice1,
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
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(25.484153747558594.dp)
    )
}

@Composable
fun VideogameText1(
    textTitle1: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textTitle1,
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
fun VideogameImage1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(258.0.dp).requiredHeight(147.80809020996094.dp)
    )
}

@Composable
fun FramePlatforms1(
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
fun UltimosLanzamientosBox(
    onULClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onULClick).requiredWidth(345.0.dp).requiredHeight(342.5070495605469.dp)
    )
}

@Composable
fun Line3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_line_3),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(1.0193662643432617.dp)
    )
}

@Composable
fun TextMejorValorados(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mejor valorados",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        height = 1.481999969482422.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(240.0.dp).requiredHeight(38.73591613769531.dp)
    )
}

@Composable
fun CajaMV(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_caja_mv),
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(342.5070495605469.dp)
    )
}

@Composable
fun LineaSeparaotiaBox2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_linea_separaotia_box2),
        modifier = modifier.requiredWidth(343.0.dp).requiredHeight(1.0193662643432617.dp)
    )
}

@Composable
fun VideogamePrice2(
    textPrice2: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPrice2,
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
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(25.484153747558594.dp)
    )
}

@Composable
fun VideogameText(
    textTitle2: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textTitle2,
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
fun VideogameImage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(258.0.dp).requiredHeight(147.80809020996094.dp)
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
fun MejorValoradosBox(
    onMVClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onMVClick).requiredWidth(345.0.dp).requiredHeight(342.5070495605469.dp)
    )
}

@Composable
fun Line4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_screen_line_4),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(1.0193662643432617.dp)
    )
}

@Composable
fun TextOffers(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ofertas del momento",
        fontSize = 30.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 217,
            green = 217,
            blue = 217
        ),
        height = 1.481999969482422.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(240.0.dp).requiredHeight(38.73591613769531.dp)
    )
}

@Composable
fun FrameOffers(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(336.0.dp).requiredHeight(230.0.dp)
    )
}

@Composable
fun VerCatLogo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ver catálogo",
        fontSize = 17.0.sp,
        fontFamily = oswald,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.4820000143612133.em,
        modifier = modifier.wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun ButtonIniciarSesion(
    onCatalogClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        arrangement = RelayContainerArrangement.Row,
        padding = PaddingValues(
            start = 110.0.dp,
            top = 4.0.dp,
            end = 110.0.dp,
            bottom = 4.0.dp
        ),
        itemSpacing = 10.0,
        radius = 15.0,
        strokeWidth = 1.0,
        strokeColor = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        content = content,
        modifier = modifier.tappable(onTap = onCatalogClick)
    )
}

@Composable
fun MainHomeScreenComp2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        padding = PaddingValues(
            start = 0.0.dp,
            top = 20.0.dp,
            end = 0.0.dp,
            bottom = 20.0.dp
        ),
        itemSpacing = 27.0,
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
        ).requiredWidth(430.0.dp).requiredHeight(1423.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        mainAxisAlignment = MainAxisAlignment.Start,
        crossAxisAlignment = CrossAxisAlignment.Start,
        itemSpacing = -48.0,
        content = content,
        modifier = modifier.fillMaxHeight(1.0f)
    )
}
