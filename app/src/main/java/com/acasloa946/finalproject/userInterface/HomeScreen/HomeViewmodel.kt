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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeViewmodel : ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore
    private val _fetchedVideogames = MutableStateFlow<List<Videogame>>(emptyList())
    var photo1 by mutableStateOf("")
        private set
    var title1 by mutableStateOf("")
        private set
    var price1 by mutableStateOf("")
        private set

    init {
        fetchVideogames()
    }
    fun fetchVideogames() {
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

                _fetchedVideogames.value = videogames.shuffled()

                loadVideogames()
            }
    }

    fun loadVideogames() {
        viewModelScope.launch {
            while (true) {
                for (i in _fetchedVideogames.value) {
                    photo1 = i.photo.toString()
                    title1 = i.title.toString()
                    price1 = i.price.toString()
                    delay(15000)
                }
            }


        }
    }







}