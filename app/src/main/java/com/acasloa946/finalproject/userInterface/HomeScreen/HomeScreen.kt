package com.acasloa946.finalproject.userInterface.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.acasloa946.finalproject.bannerhomescreenfinal.BannerHomeScreenFinal
import com.acasloa946.finalproject.footernavbar.FooterNavBar
import com.acasloa946.finalproject.navigation.Routes
import com.google.relay.compose.BoxScopeInstanceImpl.align

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(homeViewmodel: HomeViewmodel, navController: NavController) {



    Scaffold(modifier = Modifier.align(Alignment.BottomCenter),
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 11.dp,
                        bottom = 20.dp
                    )
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


        ) {
            BannerHomeScreenFinal(modifier = Modifier.fillMaxWidth())
            MainHomeScreenCompo(modifier = Modifier.size(430.dp,1372.dp),homeViewmodel = homeViewmodel, textTitle1 = homeViewmodel.title1, textPrice1 = homeViewmodel.price1,  textPrice2 = homeViewmodel.price2, textTitle2 = homeViewmodel.title2)




        }
    }
}







