package com.acasloa946.finalproject.userInterface.HomeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import coil.compose.SubcomposeAsyncImage
import com.acasloa946.finalproject.R
import com.acasloa946.finalproject.homescreen.FrameBanner
import com.acasloa946.finalproject.homescreen.GameZoneIMG
import com.acasloa946.finalproject.homescreen.MainHomeScreenComp2
import com.acasloa946.finalproject.homescreen.VideogameText1
import com.acasloa946.finalproject.offercard.FrameImage
import com.acasloa946.finalproject.videogamedialog.BuyButton
import com.acasloa946.finalproject.videogamedialog.Comprar
import com.acasloa946.finalproject.videogamedialog.EditableTextPrice
import com.acasloa946.finalproject.videogamedialog.EditableTextPublisher
import com.acasloa946.finalproject.videogamedialog.EditableTextTitle
import com.acasloa946.finalproject.videogamedialog.EditableTextYear
import com.acasloa946.finalproject.videogamedialog.ExitButton
import com.acasloa946.finalproject.videogamedialog.FrameInfo
import com.acasloa946.finalproject.videogamedialog.FrameMetacritic
import com.acasloa946.finalproject.videogamedialog.FramePrice
import com.acasloa946.finalproject.videogamedialog.FramePublisher
import com.acasloa946.finalproject.videogamedialog.FrameTitle
import com.acasloa946.finalproject.videogamedialog.FrameYear
import com.acasloa946.finalproject.videogamedialog.ImageVideogame
import com.acasloa946.finalproject.videogamedialog.Salir
import com.acasloa946.finalproject.videogamedialog.TextInfo
import com.acasloa946.finalproject.videogamedialog.TextMetacritic
import com.acasloa946.finalproject.videogamedialog.TextPlatforms
import com.acasloa946.finalproject.videogamedialog.TextPrice
import com.acasloa946.finalproject.videogamedialog.TextPublisher
import com.acasloa946.finalproject.videogamedialog.TextTitle
import com.acasloa946.finalproject.videogamedialog.TextYear


/**
 * Componentes de la pantalla Home
 * Parametros de precio y titulo de cada card (Ultimos lanzamientos y mejor valorados), onClick de cada una, y click de botón ver catálogo
 */

@Composable
fun HomeScreenComponent(
    modifier: Modifier = Modifier,
    textPrice1: String = "",
    textTitle1: String = "",
    textPrice2: String = "",
    textTitle2: String = "",
    onULClick: () -> Unit = {},
    onMVClick: () -> Unit = {},
    onCatalogClick: () -> Unit = {},
    homeViewmodel: HomeViewmodel
) {
    com.acasloa946.finalproject.homescreen.TopLevel(modifier = modifier) {
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
            com.acasloa946.finalproject.homescreen.TextUltLanzamientos()
            com.acasloa946.finalproject.homescreen.UltimosLanzamientosBox(onULClick = onULClick) {
                com.acasloa946.finalproject.homescreen.CajaUL(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                com.acasloa946.finalproject.homescreen.LineaSeparaotiaBox1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.125.dp,
                            y = 115.69806814193726.dp
                        )
                    )
                )
                com.acasloa946.finalproject.homescreen.VideogamePrice(
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
                com.acasloa946.finalproject.homescreen.VideogameImage1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -33.129417419433594.dp
                        )
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        SubcomposeAsyncImage(
                            model = homeViewmodel.photoUL,
                            contentDescription = null,
                            loading = {
                                androidx.compose.material.CircularProgressIndicator(
                                    modifier = Modifier.size(
                                        100.dp
                                    ), color = Color(0xFF1ACE4D)
                                )
                            }
                        )
                    }
                }
                com.acasloa946.finalproject.homescreen.FramePlatforms1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 77.47181701660156.dp
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (homeViewmodel.platformsUL["ps5"] == true) {
                            Image(
                                painter = painterResource(id = R.drawable.ps5),
                                contentDescription = null,
                                modifier = Modifier.size(75.dp)
                            )
                        }
                        if (homeViewmodel.platformsUL["xbox"] == true) {
                            Spacer(modifier = Modifier.padding(5.dp))
                            Image(
                                painter = painterResource(id = R.drawable.xbox),
                                contentDescription = null,
                                modifier = Modifier.size(50.dp)
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                        }
                        if (homeViewmodel.platformsUL["nintendo"] == true) {
                            Image(
                                painter = painterResource(id = R.drawable.nintendo),
                                contentDescription = null,
                                modifier = Modifier.size(50.dp)
                            )
                        }
                    }

                }
            }
            com.acasloa946.finalproject.homescreen.Line3()
            com.acasloa946.finalproject.homescreen.TextMejorValorados()
            com.acasloa946.finalproject.homescreen.MejorValoradosBox(onMVClick = onMVClick) {
                com.acasloa946.finalproject.homescreen.CajaMV(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                com.acasloa946.finalproject.homescreen.LineaSeparaotiaBox2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.125.dp,
                            y = 115.69811391830444.dp
                        )
                    )
                )
                com.acasloa946.finalproject.homescreen.VideogamePrice2(
                    textPrice2 = textPrice2,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -1.0.dp,
                            y = 141.1822166442871.dp
                        )
                    )
                )
                com.acasloa946.finalproject.homescreen.VideogameText(
                    textTitle2 = textTitle2,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = -137.75181579589844.dp
                        )
                    )
                )
                com.acasloa946.finalproject.homescreen.VideogameImage(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -33.129417419433594.dp
                        )
                    )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        SubcomposeAsyncImage(
                            model = homeViewmodel.photoMV,
                            contentDescription = null,
                            loading = {
                                androidx.compose.material.CircularProgressIndicator(
                                    modifier = Modifier.size(
                                        100.dp
                                    ), color = Color(0xFF1ACE4D)
                                )
                            }
                        )
                    }
                }
                com.acasloa946.finalproject.homescreen.FramePlatforms(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 77.47181701660156.dp
                        )
                    )
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (homeViewmodel.platformsMV["ps5"] == true) {
                            Image(
                                painter = painterResource(id = R.drawable.ps5),
                                contentDescription = null,
                                modifier = Modifier.size(75.dp)
                            )
                        }
                        if (homeViewmodel.platformsMV["xbox"] == true) {
                            Spacer(modifier = Modifier.padding(5.dp))
                            Image(
                                painter = painterResource(id = R.drawable.xbox),
                                contentDescription = null,
                                modifier = Modifier.size(50.dp)
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                        }
                        if (homeViewmodel.platformsMV["nintendo"] == true) {
                            Image(
                                painter = painterResource(id = R.drawable.nintendo),
                                contentDescription = null,
                                modifier = Modifier.size(50.dp)
                            )
                        }
                    }

                }
            }
            com.acasloa946.finalproject.homescreen.Line4()
            com.acasloa946.finalproject.homescreen.TextOffers()
            com.acasloa946.finalproject.homescreen.FrameOffers {
                LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    items(homeViewmodel._fetchedOffers.value) {
                        OfferCardComponent(textPrice = it.price!!, textTitle = it.title!!, textImage = it.photo!!,
                            onGameClick = {
                                homeViewmodel.openVGDialog()
                                homeViewmodel.changeDialogText(title = it.title!!, it.publisher!!, it.year.toString(),it.metacritic.toString(),it.price!!, it.photo!!, it.platforms!!)
                            })
                    }
                }

            }
            com.acasloa946.finalproject.homescreen.ButtonIniciarSesion(onCatalogClick = onCatalogClick) {
                com.acasloa946.finalproject.homescreen.VerCatLogo()
            }
        }
    }
}



@Composable
fun OfferCardComponent(
    modifier: Modifier = Modifier,
    textPrice: String = "",
    textTitle: String = "",
    textImage: String = "",
    onGameClick: () -> Unit = {}
) {
    com.acasloa946.finalproject.offercard.TopLevel(
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
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                SubcomposeAsyncImage(
                    model = textImage,
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    loading = {
                        CircularProgressIndicator(
                            modifier = Modifier.size(
                                100.dp
                            ), color = Color(0xFF1ACE4D)
                        )
                    }
                )
            }
        }
        com.acasloa946.finalproject.offercard.FramePrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = 84.5.dp
                )
            )
        ) {
            com.acasloa946.finalproject.offercard.TextPrice(
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
        com.acasloa946.finalproject.offercard.FrameTitle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -84.5.dp
                )
            )
        ) {
            com.acasloa946.finalproject.offercard.TextTitle(
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



@Composable
fun DialogVideogame(
    homeViewmodel: HomeViewmodel,
    textTitle0: String,
    textMetacritic: String,
    textTitle1: String,
    textPublisher: String,
    textYear: String,
    textPrice: String,
    textImage: String,
    platforms: Map<String, Boolean>,
    onBuyClick: () -> Unit,
    onExitClick: () -> Unit
) {
    if (homeViewmodel.showVGDialog) {
        Dialog(onDismissRequest = { homeViewmodel.closeVGDialog() }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(847.dp)
                    .background(Color(0xFFD9D9D9))
                    .verticalScroll(rememberScrollState(10000), false, reverseScrolling = true),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                VideogameDialogComponent(
                    modifier = Modifier.fillMaxWidth(),
                    textTitle0,
                    textMetacritic,
                    textTitle1,
                    textPublisher,
                    textYear,
                    textPrice,
                    textImage = textImage,
                    platforms,
                    onBuyClick = {
                        onBuyClick()
                    },
                    onExitClick = {
                        onExitClick()
                    })
            }
        }
    }
}


@Composable
fun VideogameDialogComponent(
    modifier: Modifier = Modifier,
    textTitle0: String = "",
    textMetacritic: String = "",
    textTitle1: String = "",
    textPublisher: String = "",
    textYear: String = "",
    textPrice: String = "",
    textImage: String = "",
    platforms: Map<String, Boolean>,
    onBuyClick: () -> Unit = {},
    onExitClick: () -> Unit = {}
) {
    com.acasloa946.finalproject.videogamedialog.TopLevel(modifier = modifier) {
        ImageVideogame {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                SubcomposeAsyncImage(
                    model = textImage,
                    contentDescription = null,
                    loading = {
                        androidx.compose.material.CircularProgressIndicator(
                            modifier = Modifier.size(
                                100.dp
                            ), color = Color(0xFF1ACE4D)
                        )
                    }
                )
            }

        }
        com.acasloa946.finalproject.videogamedialog.VideogameText(textTitle0 = textTitle0)
        FrameMetacritic {
            TextMetacritic(
                textMetacritic = textMetacritic,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -0.5.dp
                    )
                )
            )
        }
        FrameInfo {
            TextInfo()
            TextTitle()
            FrameTitle {
                EditableTextTitle(
                    textTitle1 = textTitle1,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextPublisher()
            FramePublisher {
                EditableTextPublisher(
                    textPublisher = textPublisher,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextYear()
            FrameYear {
                EditableTextYear(
                    textYear = textYear,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextPrice()
            FramePrice {
                EditableTextPrice(
                    textPrice = textPrice,
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            TextPlatforms()
            com.acasloa946.finalproject.videogamedialog.FramePlatforms {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (platforms["ps5"] == true) {
                        Image(
                            painter = painterResource(id = R.drawable.ps5),
                            contentDescription = null,
                            modifier = Modifier.size(75.dp)
                        )
                    }
                    if (platforms["xbox"] == true) {
                        Spacer(modifier = Modifier.padding(5.dp))
                        Image(
                            painter = painterResource(id = R.drawable.xbox),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Spacer(modifier = Modifier.padding(5.dp))
                    }
                    if (platforms["nintendo"] == true) {
                        Image(
                            painter = painterResource(id = R.drawable.nintendo),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                    }
                }
            }
        }
        BuyButton(onBuyClick = onBuyClick) {
            Comprar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        ExitButton(onExitClick = onExitClick) {
            Salir(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}