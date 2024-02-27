package com.acasloa946.finalproject.userInterface.CatalogScreen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.acasloa946.finalproject.database.Videogame
import com.acasloa946.finalproject.userInterface.HomeScreen.HomeViewmodel
import kotlinx.coroutines.flow.filter

class CatalogViewmodel : ViewModel() {
    private val homeViewmodel = HomeViewmodel()
    var fetchedUL = homeViewmodel.fetchedUL

    var gameList by mutableStateOf(listOf<Videogame>())
    //VARIABLES DIALOG//
    var showVGDialog by mutableStateOf(false)
        private set
    var videogameForDialog by mutableStateOf(Videogame())
        private set


    fun searchBar(searchBarInput:String) {
        gameList = fetchedUL.value.filter { item ->
            item.title!!.contains(searchBarInput, ignoreCase = true)
        }
    }

    fun openVGDialog() {
        showVGDialog = true
    }
    fun closeVGDialog() {
        showVGDialog = false
    }

    fun getVideogameForDialog(item:Videogame) {
        videogameForDialog = item


    }
}