package com.acasloa946.finalproject.userInterface.CatalogScreen

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
import com.acasloa946.finalproject.cardgame.FramePrice
import com.acasloa946.finalproject.cardgame.FrameTitle
import com.acasloa946.finalproject.cardgame.TextPrice
import com.acasloa946.finalproject.cardgame.TextTitle
import com.acasloa946.finalproject.catalogscreencomponent.FrameBanner
import com.acasloa946.finalproject.catalogscreencomponent.FrameCatalogScreen
import com.acasloa946.finalproject.catalogscreencomponent.GameZoneIMG
import com.acasloa946.finalproject.database.Videogame
import com.acasloa946.finalproject.videogamedialog.BuyButton
import com.acasloa946.finalproject.videogamedialog.Comprar
import com.acasloa946.finalproject.videogamedialog.EditableTextPrice
import com.acasloa946.finalproject.videogamedialog.EditableTextPublisher
import com.acasloa946.finalproject.videogamedialog.EditableTextTitle
import com.acasloa946.finalproject.videogamedialog.EditableTextYear
import com.acasloa946.finalproject.videogamedialog.ExitButton
import com.acasloa946.finalproject.videogamedialog.FrameInfo
import com.acasloa946.finalproject.videogamedialog.FrameMetacritic
import com.acasloa946.finalproject.videogamedialog.FramePlatforms
import com.acasloa946.finalproject.videogamedialog.FramePublisher
import com.acasloa946.finalproject.videogamedialog.FrameYear
import com.acasloa946.finalproject.videogamedialog.ImageVideogame
import com.acasloa946.finalproject.videogamedialog.Salir
import com.acasloa946.finalproject.videogamedialog.TextInfo
import com.acasloa946.finalproject.videogamedialog.TextMetacritic
import com.acasloa946.finalproject.videogamedialog.TextPlatforms
import com.acasloa946.finalproject.videogamedialog.TextPublisher
import com.acasloa946.finalproject.videogamedialog.TextYear
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope


/**
 * Componentes de la pantalla Catalog. En los diferentes frames contiene los textfields, imagenes, etc.
 */

@SuppressLint("StateFlowValueCalledInComposition", "UnrememberedMutableState")
@Composable
fun CatalogScreenComponentFinal(
    modifier: Modifier = Modifier,
    catalogViewmodel: CatalogViewmodel
) {
    var searchBar by mutableStateOf("")

    com.acasloa946.finalproject.catalogscreencomponent.TopLevel(modifier = modifier) {
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
            com.acasloa946.finalproject.catalogscreencomponent.CatalogText()
            com.acasloa946.finalproject.catalogscreencomponent.AllVideoGamesText()
            androidx.compose.material3.OutlinedTextField(
                value = searchBar,
                onValueChange = {
                    searchBar = it
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                },
                shape = RoundedCornerShape(30.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFF1ACE4D),
                    unfocusedBorderColor = Color.Black,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    unfocusedTextColor = Color.Black,
                    focusedTextColor = Color.Black
                )
            )
            com.acasloa946.finalproject.catalogscreencomponent.FrameCards(
                modifier = Modifier.columnWeight(
                    1.0f
                )
            ) {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(bottom = 70.dp)) {
                    catalogViewmodel.searchBar(searchBar)
                    items(catalogViewmodel.gameList) { item ->
                        CardGameComponent(
                            modifier = Modifier.fillMaxSize(),
                            textTitle = item.title!!,
                            textPrice = item.price!!,
                            textImage = item.photo!!,
                            onGameClick = {
                                catalogViewmodel.openVGDialog()
                                catalogViewmodel.getVideogameForDialog(item)
                            }
                        )
                        DialogCatalogOpener(
                            catalogViewmodel = catalogViewmodel,
                            videogame_dialog = catalogViewmodel.videogameForDialog,
                            onExitClick = {
                                catalogViewmodel.closeVGDialog()
                            }
                        )
                    }

                }

            }
        }
    }
}
@Composable
fun CardGameComponent(
    modifier: Modifier = Modifier,
    textTitle: String = "",
    textPrice: String = "",
    textImage : String = "",
    onGameClick: () -> Unit = {}
) {
    com.acasloa946.finalproject.cardgame.TopLevel(
        onGameClick = onGameClick,
        modifier = modifier
    ) {
        FrameImageComponent(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
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
                    contentScale = ContentScale.FillWidth,
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
        FrameTitle(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = -40.0.dp
                )
            )
        ) {
            TextTitle(
                textTitleOffer = textTitle,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -3.0.dp
                    )
                )
            )
        }
        FramePrice(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 40.0.dp
                )
            )
        ) {
            TextPrice(
                textPriceOffer = textPrice,
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
fun FrameImageComponent(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 22.0,
        content = content,
        modifier = modifier
            .requiredWidth(385.0.dp)
            .requiredHeight(125.0.dp)
    )
}

@Composable
fun DialogCatalogOpener(
    catalogViewmodel: CatalogViewmodel,
    videogame_dialog : Videogame,
    onBuyClick: () -> Unit = {},
    onExitClick: () -> Unit = {}
) {
    if (catalogViewmodel.showVGDialog) {
        Dialog(onDismissRequest = { catalogViewmodel.closeVGDialog() }) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(847.dp)
                    .background(Color(0xFFD9D9D9))
                    .verticalScroll(rememberScrollState(10000), false, reverseScrolling = true),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                VideogameDialogComponentCatalog(
                    textTitle0 = videogame_dialog.title!!,
                    textMetacritic = videogame_dialog.metacritic.toString(),
                    textTitle1 = videogame_dialog.title!!,
                    textPublisher = videogame_dialog.publisher!!,
                    textYear = videogame_dialog.year.toString(),
                    textPrice = videogame_dialog.price!!,
                    textImage = videogame_dialog.photo!!,
                    platforms = videogame_dialog.platforms!!,
                    onExitClick = {
                        onExitClick()
                    },
                    onBuyClick = {

                    }
                )
            }
        }
    }
}

@Composable
fun VideogameDialogComponentCatalog(
    modifier: Modifier = Modifier,
    textTitle0: String,
    textMetacritic: String ,
    textTitle1: String,
    textPublisher: String,
    textYear: String,
    textPrice: String,
    textImage: String,
    platforms: Map<String, Boolean>,
    onBuyClick: () -> Unit = {},
    onExitClick: () -> Unit = {},
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
                            CircularProgressIndicator(
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
                com.acasloa946.finalproject.videogamedialog.TextTitle()
                com.acasloa946.finalproject.videogamedialog.FrameTitle {
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
                com.acasloa946.finalproject.videogamedialog.TextPrice()
                com.acasloa946.finalproject.videogamedialog.FramePrice {
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
                FramePlatforms {
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





