package com.acasloa946.finalproject.mainhomescreencomp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.acasloa946.finalproject.R
import com.google.relay.compose.MainAxisAlignment
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerArrangement
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'main_home_screen_comp'.
 * Generated code; do not edit directly
 */
@Composable
fun MainHomeScreenComp(
    modifier: Modifier = Modifier,
    textTitle1: String = "",
    textPrice2: String = "",
    textTitle2: String = "",
    textTitleOffer: String = "",
    textPriceOffer: String = "",
    onULClick: () -> Unit = {},
    onMVClick: () -> Unit = {},
    onOfferClick: () -> Unit = {},
    onCatalogClick: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Rectangle1()
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
                textTitle1 = textTitle1,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = 141.1822166442871.dp
                    )
                )
            )
            VideogameText1(
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
                        y = 115.69808340072632.dp
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
        FrameOffers(onOfferClick = onOfferClick) {
            Square()
            FrameVideoGameImage(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 78.0.dp,
                        y = 31.7393798828125.dp
                    )
                )
            ) {}
            FrameTextTitleOffer(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 50.2393798828125.dp
                    )
                )
            ) {
                TextTitleOffer(
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
            FrameTextPriceOffer(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -55.7606201171875.dp
                    )
                )
            ) {
                TextPriceOffer(
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
        ButtonIniciarSesion(onCatalogClick = onCatalogClick) {
            VerCatLogo()
        }
    }
}

@Preview(widthDp = 430, heightDp = 1372)
@Composable
private fun MainHomeScreenCompPreview() {
    MaterialTheme {
        RelayContainer {
            MainHomeScreenComp(
                onULClick = {},
                onMVClick = {},
                onOfferClick = {},
                onCatalogClick = {},
                textTitle1 = "20,99€",
                textPrice2 = "20,99€",
                textTitle2 = "Videogame",
                textTitleOffer = "Palworld ",
                textPriceOffer = "10.50€",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_home_screen_comp_rectangle_1),
        modifier = modifier.requiredWidth(429.0.dp).requiredHeight(1.0.dp)
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
        vector = painterResource(R.drawable.main_home_screen_comp_caja_ul),
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(342.5070495605469.dp)
    )
}

@Composable
fun LineaSeparaotiaBox1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_home_screen_comp_linea_separaotia_box1),
        modifier = modifier.requiredWidth(343.0.dp).requiredHeight(1.0193662643432617.dp)
    )
}

@Composable
fun VideogamePrice(
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
        modifier = modifier.requiredWidth(74.0.dp).requiredHeight(25.484153747558594.dp)
    )
}

@Composable
fun VideogameText1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Videogame",
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
        vector = painterResource(R.drawable.main_home_screen_comp_line_3),
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
        vector = painterResource(R.drawable.main_home_screen_comp_caja_mv),
        modifier = modifier.requiredWidth(345.0.dp).requiredHeight(342.5070495605469.dp)
    )
}

@Composable
fun LineaSeparaotiaBox2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_home_screen_comp_linea_separaotia_box2),
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
        vector = painterResource(R.drawable.main_home_screen_comp_line_4),
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
fun Square(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.main_home_screen_comp_square),
        modifier = modifier.requiredWidth(336.0.dp).requiredHeight(158.0.dp)
    )
}

@Composable
fun FrameVideoGameImage(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(180.0.dp).requiredHeight(94.0.dp)
    )
}

@Composable
fun TextTitleOffer(
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
fun FrameTextTitleOffer(
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
fun TextPriceOffer(
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
fun FrameTextPriceOffer(
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
fun FrameOffers(
    onOfferClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.tappable(onTap = onOfferClick).requiredWidth(336.0.dp).requiredHeight(158.0.dp)
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
fun TopLevel(
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
