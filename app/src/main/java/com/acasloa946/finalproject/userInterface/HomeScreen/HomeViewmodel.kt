package com.acasloa946.finalproject.userInterface.HomeScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.finalproject.database.Videogame
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewmodel : ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore


    //LISTA DE VIDEOJUEGOS TRAIDOS DE FIREBASE QUE SON MEJOR VALORADOS
    private val _fetchedUL = MutableStateFlow<List<Videogame>>(emptyList())

    //LISTA DE VIDEOJUEGOS TRAIDOS DE FIREBASE QUE SON MEJOR VALORADOS
    private val _fetchedMV = MutableStateFlow<List<Videogame>>(emptyList())

    //////////////////////////////////////////////////////////////////////////
    var photo1 by mutableStateOf("")
        private set
    var title1 by mutableStateOf("")
        private set
    var price1 by mutableStateOf("")
        private set
    var platforms1 by mutableStateOf(mapOf<String, Boolean>())

    //////////////////////////////////////////////////////////////////////////
    var photo2 by mutableStateOf("")
        private set
    var title2 by mutableStateOf("")
        private set
    var price2 by mutableStateOf("")
        private set
    var platforms2 by mutableStateOf(mapOf<String, Boolean>())


    init {
        fetchVideogames()

    }

    fun fetchVideogames() {
        viewModelScope.launch {
            firestore.collection("Videogames")
                .addSnapshotListener { querySnapshot, error ->
                    if (error != null) {
                        return@addSnapshotListener
                    }
                    val videogames = mutableListOf<Videogame>()
                    if (querySnapshot != null) {
                        for (document in querySnapshot) {
                            val videogame = document.toObject(Videogame::class.java)
                            videogames.add(videogame)

                        }

                    }
                    _fetchedUL.value = videogames.shuffled()
                    _fetchedMV.value = videogames.shuffled()
                    loadVideogamesUL()
                    loadVideogamesMV()
                }

        }
    }



    fun loadVideogamesUL() {
        viewModelScope.launch {
            var bool = true
            while (bool) {
                //parte ultimos lanzamientos
                if (!_fetchedUL.value.isEmpty()) {
                    for (i in _fetchedUL.value) {
                        photo1 = i.photo.toString()
                        title1 = i.title.toString()
                        price1 = i.price.toString()
                        platforms1 = i.platforms!!
                        delay(15000)
                    }
                }
                 else {
                    bool = false
                }

            }


        }
    }
    fun loadVideogamesMV() {
        //parte mejor valorados
        viewModelScope.launch {
            var bool = true
            while (bool) {
                if (!_fetchedMV.value.isEmpty()) {
                    for (i in _fetchedMV.value) {
                        photo2 = i.photo.toString()
                        title2 = i.title.toString()
                        price2 = i.price.toString()
                        platforms2 = i.platforms!!
                        delay(15000)
                    }
                }
                else {
                    bool = false
                }
            }


        }
        }
    }



