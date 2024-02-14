package com.acasloa946.finalproject.userInterface.HomeScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.acasloa946.finalproject.API.APIModule
import com.acasloa946.finalproject.mainhomescreen.CajaMV
import com.acasloa946.finalproject.mainhomescreen.CajaUL
import com.acasloa946.finalproject.mainhomescreen.FramePlatforms
import com.acasloa946.finalproject.mainhomescreen.FramePlatforms1
import com.acasloa946.finalproject.mainhomescreen.Line3
import com.acasloa946.finalproject.mainhomescreen.LineaSeparaotiaBox1
import com.acasloa946.finalproject.mainhomescreen.LineaSeparaotiaBox2
import com.acasloa946.finalproject.mainhomescreen.MejorValoradosBox
import com.acasloa946.finalproject.mainhomescreen.Rectangle1
import com.acasloa946.finalproject.mainhomescreen.TextMejorValorados
import com.acasloa946.finalproject.mainhomescreen.TextUltLanzamientos
import com.acasloa946.finalproject.mainhomescreen.TopLevel
import com.acasloa946.finalproject.mainhomescreen.UltimosLanzamientosBox
import com.acasloa946.finalproject.mainhomescreen.VideogameImage
import com.acasloa946.finalproject.mainhomescreen.VideogameImage1
import com.acasloa946.finalproject.mainhomescreen.VideogamePrice
import com.acasloa946.finalproject.mainhomescreen.VideogamePrice2
import com.acasloa946.finalproject.mainhomescreen.VideogameText
import com.acasloa946.finalproject.mainhomescreen.VideogameText1



@Composable
fun HomeComponent(
        modifier: Modifier = Modifier,
        textPrice1: String = "",
        textTitle1: String = "",
        textPrice2: String = "",
        textTitle2: String = "",
        onULClick: () -> Unit = {},
        onMVClick: () -> Unit = {},
        viewmodel: HomeViewmodel
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
                textPrice1 = textPrice1,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0.dp,
                        y = 141.1822166442871.dp
                    )
                )
            )
            VideogameText1(
                textTitle1 = textTitle1,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -138.2605743408203.dp
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
            ) {///////////////////

                AsyncImage(
                    model = viewmodel.photo1,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
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
                        x = 0.0.dp,
                        y = -138.2605743408203.dp
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
    }
}