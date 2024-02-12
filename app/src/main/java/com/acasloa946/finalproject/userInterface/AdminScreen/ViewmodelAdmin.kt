package com.acasloa946.finalproject.userInterface.AdminScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.autoSaver
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.finalproject.database.Videogame
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

class ViewmodelAdmin : ViewModel() {



    var name by mutableStateOf("")
        private set
    var publisher by mutableStateOf("")
        private set
    var year by mutableStateOf(2000)
        private set
    var indie by mutableStateOf(false)
        private set




    fun añadirBDD(title: String, publisher: String, year: Int, indie: Boolean, context: Context,
                  onSuccess : () -> Unit, onFailure : () -> Unit) {

        val videogameToAdd = Videogame(title,publisher,year,indie)

        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            viewModelScope.launch {
                try {
                    db.collection("Videogames").document(title).set(
                        videogameToAdd
                    ).addOnSuccessListener {
                        onSuccess()
                    }.addOnFailureListener {
                        onFailure()
                    }.await()

                } catch (e: Exception) {
                    Log.e("MainActivity", "Error al agregar a la base de datos: ${e.message}")
                }
            }
        } else {
            // Handle the case when Firebase is not initialized
            Log.e("MainActivity", "Firebase is not initialized")
        }
    }

    fun changeIndie(indieUI : Boolean) {
        this.indie = indieUI
    }
    fun changeName(name : String) {
        this.name = name
    }
    fun changePublisher(publisher: String ) {
        this.publisher = publisher
    }
    fun changeYear(year : Int) {
        this.year = year
    }




}



