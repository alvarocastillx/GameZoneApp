package com.acasloa946.finalproject.userInterface.HomeScreen

import android.util.Log
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


    //LISTA DE VIDEOJUEGOS TRAIDOS DE FIREBASE, ÚLTIMOS LANZAMIENTOS
    private val _fetchedUL = MutableStateFlow<List<Videogame>>(emptyList())

    //LISTA DE VIDEOJUEGOS TRAIDOS DE FIREBASE, MEJOR VALORADOS
    private val _fetchedMV = MutableStateFlow<List<Videogame>>(emptyList())

    //LISTA DE VIDEOJUEGOS TRAIDOS DE FIREBASE, OFERTAS
    private val _fetchedOffers = MutableStateFlow<List<Videogame>>(emptyList())


    //////////////////////////////////////////////////////////////////////////
    var photoUL by mutableStateOf("")
        private set
    var titleUL by mutableStateOf("")
        private set
    var priceUL by mutableStateOf("")
        private set
    var publisherUL by mutableStateOf("")
        private set
    var yearUL by mutableStateOf("")
        private set
    var metacriticUL by mutableStateOf("")
        private set
    var platformsUL by mutableStateOf(mapOf<String, Boolean>())

    //////////////////////////////////////////////////////////////////////////
    var photoMV by mutableStateOf("")
        private set
    var titleMV by mutableStateOf("")
        private set
    var priceMV by mutableStateOf("")
        private set
    var publisherMV by mutableStateOf("")
        private set
    var yearMV by mutableStateOf("")
        private set
    var metacriticMV by mutableStateOf("")
        private set
    var platformsMV by mutableStateOf(mapOf<String, Boolean>())
    /////////////////////////////////////////////////////////////////////////

    var photoOffer by mutableStateOf("")
        private set
    var titleOffer by mutableStateOf("")
        private set
    var priceOffer by mutableStateOf("")
        private set
    var publisherOffer by mutableStateOf("")
        private set
    var yearOffer by mutableStateOf("")
        private set
    var metacriticOffer by mutableStateOf("")
        private set
    var platformsOffer by mutableStateOf(mapOf<String, Boolean>())

    //////////////////////////////////////////////////////////////////////
    //Variables dialog//
    var showVGDialog by mutableStateOf(false)
        private set
    var textTitle by mutableStateOf("")
        private set
    var textPublisher by mutableStateOf("")
        private set
    var textYear by mutableStateOf("")
        private set
    var textMetacritic by mutableStateOf("")
        private set
    var textPrice by mutableStateOf("")
        private set
    var textImage by mutableStateOf("")
        private set
    var platformsDialog by mutableStateOf(mapOf<String,Boolean>())
        private set



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
                    _fetchedOffers.value = videogames.shuffled()


                    loadVideogamesUL()
                    loadVideogamesMV()
                    loadVideogamesOffers()
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
                        photoUL = i.photo.toString()
                        titleUL = i.title.toString()
                        priceUL = i.price.toString()
                        publisherUL = i.publisher.toString()
                        yearUL = i.year.toString()
                        metacriticUL = i.metacritic.toString()
                        platformsUL = i.platforms!!
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
                        photoMV = i.photo.toString()
                        titleMV = i.title.toString()
                        priceMV = i.price.toString()
                        publisherMV = i.publisher.toString()
                        yearMV = i.year.toString()
                        metacriticMV = i.metacritic.toString()
                        platformsMV = i.platforms!!
                        delay(15000)
                    }
                }
                else {
                    bool = false
                }
            }


        }
        }

    fun loadVideogamesOffers() {
        viewModelScope.launch {
            var bool = true
            while (bool) {
                if (!_fetchedOffers.value.isEmpty()) {
                    for (i in _fetchedOffers.value) {
                        photoOffer = i.photo.toString()
                        titleOffer= i.title.toString()
                        priceOffer = i.price.toString()
                        publisherOffer = i.publisher.toString()
                        yearOffer = i.year.toString()
                        metacriticOffer = i.metacritic.toString()
                        platformsOffer = i.platforms!!
                        delay(15000)
                    }
                }
                else {
                    bool = false
                }

            }

        }
    }

    fun openVGDialog() {
        showVGDialog = true
    }
    fun closeVGDialog() {
        showVGDialog = false
    }

    fun changeDialogText(title:String, publisher:String, year:String, metacritic:String,price:String,image:String, platforms: Map<String,Boolean>) {
        textTitle = title
        textPublisher = publisher
        textYear = year
        textMetacritic = metacritic
        textPrice = price
        textImage = image
        platformsDialog = platforms


    }









    }




