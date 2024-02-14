package com.acasloa946.finalproject.userInterface.HomeScreen

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.finalproject.R
import com.acasloa946.finalproject.bannerhomescreen.BannerHomeScreen
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.mainhomescreen.CajaMV
import com.acasloa946.finalproject.mainhomescreen.CajaUL
import com.acasloa946.finalproject.mainhomescreen.FramePlatforms
import com.acasloa946.finalproject.mainhomescreen.FramePlatforms1
import com.acasloa946.finalproject.mainhomescreen.Line3
import com.acasloa946.finalproject.mainhomescreen.LineaSeparaotiaBox1
import com.acasloa946.finalproject.mainhomescreen.LineaSeparaotiaBox2
import com.acasloa946.finalproject.mainhomescreen.MainHomeScreen
import com.acasloa946.finalproject.mainhomescreen.MejorValoradosBox
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
import com.acasloa946.finalproject.navigation.Routes
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayImage

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(homeViewmodel: HomeViewmodel, navController: NavController) {



    Scaffold(modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            // Contenedor con padding alrededor de la barra de navegación
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 11.dp,
                        bottom = 20.dp
                    ) // Ajusta la cantidad de espacio según tus necesidades
            ) {
                FooterNavBar(modifier = Modifier.size(392.dp, 66.dp),
                    onSettingsClick = {
                        navController.navigate(Routes.SettingsScreeen.route)
                    },
                    onHomeClick = {
                        navController.navigate(Routes.HomeScreen.route)
                    })

            }
        }
    ) {
        // Contenido de tu pantalla principal
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFD9D9D9))
                .verticalScroll(rememberScrollState(10000), true, reverseScrolling = true),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
            ImageBanner(modifier = Modifier.size(317.dp,172.dp))
            HomeComponent(modifier = Modifier.size(430.dp,1100.dp), viewmodel = homeViewmodel, textTitle1 = homeViewmodel.title1, textPrice1 = homeViewmodel.price1)




        }
    }
}

@Composable
fun ImageBanner(modifier: Modifier) {
    Image(painter = painterResource(id = R.drawable.bannerhomescreen), contentDescription = null, modifier = modifier)
}






