package com.acasloa946.finalproject.userInterface.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import com.acasloa946.finalproject.R
import com.acasloa946.finalproject.mainhomescreencomp.ButtonIniciarSesion
import com.acasloa946.finalproject.mainhomescreencomp.CajaMV
import com.acasloa946.finalproject.mainhomescreencomp.CajaUL
import com.acasloa946.finalproject.mainhomescreencomp.FrameOffers
import com.acasloa946.finalproject.mainhomescreencomp.FramePlatforms
import com.acasloa946.finalproject.mainhomescreencomp.FramePlatforms1
import com.acasloa946.finalproject.mainhomescreencomp.FrameTextPriceOffer
import com.acasloa946.finalproject.mainhomescreencomp.FrameTextTitleOffer
import com.acasloa946.finalproject.mainhomescreencomp.FrameVideoGameImage
import com.acasloa946.finalproject.mainhomescreencomp.Line3
import com.acasloa946.finalproject.mainhomescreencomp.Line4
import com.acasloa946.finalproject.mainhomescreencomp.LineaSeparaotiaBox1
import com.acasloa946.finalproject.mainhomescreencomp.LineaSeparaotiaBox2
import com.acasloa946.finalproject.mainhomescreencomp.MejorValoradosBox
import com.acasloa946.finalproject.mainhomescreencomp.Rectangle1
import com.acasloa946.finalproject.mainhomescreencomp.Square
import com.acasloa946.finalproject.mainhomescreencomp.TextMejorValorados
import com.acasloa946.finalproject.mainhomescreencomp.TextOffers
import com.acasloa946.finalproject.mainhomescreencomp.TextPriceOffer
import com.acasloa946.finalproject.mainhomescreencomp.TextTitleOffer
import com.acasloa946.finalproject.mainhomescreencomp.TextUltLanzamientos
import com.acasloa946.finalproject.mainhomescreencomp.TopLevel
import com.acasloa946.finalproject.mainhomescreencomp.UltimosLanzamientosBox
import com.acasloa946.finalproject.mainhomescreencomp.VerCatLogo
import com.acasloa946.finalproject.mainhomescreencomp.VideogameImage
import com.acasloa946.finalproject.mainhomescreencomp.VideogameImage1
import com.acasloa946.finalproject.mainhomescreencomp.VideogamePrice
import com.acasloa946.finalproject.mainhomescreencomp.VideogamePrice2
import com.acasloa946.finalproject.mainhomescreencomp.VideogameText
import com.acasloa946.finalproject.mainhomescreencomp.oswald
import com.google.relay.compose.RelayText





@Composable
fun VideogameText1Component(modifier: Modifier = Modifier, textTitle1:String) {
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
fun MainHomeScreenCompo(
    modifier: Modifier = Modifier,
    textTitle1: String = "",
    textPrice1:String = "",
    textPrice2: String = "",
    textTitle2: String = "",
    textTitleOffer: String = "",
    textPriceOffer: String = "",
    onULClick: () -> Unit = {},
    onMVClick: () -> Unit = {},
    onOfferClick: () -> Unit = {},
    onCatalogClick: () -> Unit = {},
    homeViewmodel: HomeViewmodel
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
                textTitle1 = textPrice1,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = 141.1822166442871.dp
                    )
                )
            )
            VideogameText1Component(textTitle1 = textTitle1,
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
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ){

                    SubcomposeAsyncImage(
                        model = homeViewmodel.photo1,
                        contentDescription = null,
                        loading = {
                            androidx.compose.material.CircularProgressIndicator(modifier = Modifier.size(100.dp), color = Color(0xFF1ACE4D))
                        }
                    )
                }
            }
            FramePlatforms1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 77.47181701660156.dp
                    )
                )
            ) {
                Row (
                    modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
                ){
                    if (homeViewmodel.platforms1["ps5"]==true) {
                        Image(painter = painterResource(id = R.drawable.pantalla_admin_pl_vector_ps), contentDescription = null)
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    if (homeViewmodel.platforms1["xbox"]==true) {
                        Image(painter = painterResource(id = R.drawable.pantalla_admin_pl_vector_xbox), contentDescription = null)
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    if (homeViewmodel.platforms1["nintendo"]==true) {
                        Image(painter = painterResource(id = R.drawable.pantalla_admin_pl_vector_nintendo), contentDescription = null)
                    }
                }
            }
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
            ) {
                Column (
                    modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
                ){

                    SubcomposeAsyncImage(
                        model = homeViewmodel.photo2,
                        contentDescription = null,
                        loading = {
                            androidx.compose.material.CircularProgressIndicator(modifier = Modifier.size(100.dp), color = Color(0xFF1ACE4D))
                        }
                    )
                }
            }
            FramePlatforms(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.5.dp,
                        y = 77.47181701660156.dp
                    )
                )
            ) {
                Row (
                    modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
                ){
                    if (homeViewmodel.platforms2["ps5"]==true) {
                        Image(painter = painterResource(id = R.drawable.pantalla_admin_pl_vector_ps), contentDescription = null)
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    if (homeViewmodel.platforms2["xbox"]==true) {
                        Image(painter = painterResource(id = R.drawable.pantalla_admin_pl_vector_xbox), contentDescription = null)
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    if (homeViewmodel.platforms2["nintendo"]==true) {
                        Image(painter = painterResource(id = R.drawable.pantalla_admin_pl_vector_nintendo), contentDescription = null)
                    }
                }
            }
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