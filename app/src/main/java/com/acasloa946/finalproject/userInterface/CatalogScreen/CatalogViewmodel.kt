package com.acasloa946.finalproject.userInterface.CatalogScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.acasloa946.finalproject.database.Videogame
import com.acasloa946.finalproject.userInterface.HomeScreen.HomeViewmodel

/**
 * Clase viewmodel de la pantalla de catálogo
 */
class CatalogViewmodel : ViewModel() {

    //Variable que inicializa clase viewmodel
    private val homeViewmodel = HomeViewmodel()

    //StateFlow de lista recuperada de FireBase. Se llena al iniciarse la aplicación ya que se abre la pantalla principal
    var fetchedUL = homeViewmodel.fetchedUL

    //Variable utilizada para searchBar
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

    //Funciones para abrir y cerrar Dialog de cada videojuego
    fun openVGDialog() {
        showVGDialog = true
    }
    fun closeVGDialog() {
        showVGDialog = false
    }

    /**
     * Función para guardar el videojuego que se mostrará en el Dialog. Se ejecuta cuando se pulsa sobre el videojuego.
     */
    fun getVideogameForDialog(item:Videogame) {
        videogameForDialog = item


    }
}