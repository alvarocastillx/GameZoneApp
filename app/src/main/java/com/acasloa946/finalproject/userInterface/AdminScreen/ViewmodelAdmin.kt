package com.acasloa946.finalproject.userInterface.AdminScreen

import android.content.Context
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.finalproject.API.APIModule
import com.acasloa946.finalproject.API.Models.APIVideogame
import com.acasloa946.finalproject.database.Videogame
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await


/**
 * Viewmodel de la pantalla de administrador
 */
class ViewmodelAdmin : ViewModel() {

//variable para llamar a api
    val APIModule = APIModule()
    //funciones extraidas de la pantalla para guardar el base de datos.
    var name by mutableStateOf("")
        private set
    var publisher by mutableStateOf("")
        private set
    var year:Int by mutableStateOf(0)
        private set
    var indie by mutableStateOf(false)
        private set

    var price by mutableStateOf("")
        private set
        //plataformas
    var ps5 by mutableStateOf(false)
        private set

    var xbox by mutableStateOf(false)
        private set

    var nintendo by mutableStateOf(false)
        private set

    val platforms = mutableMapOf<String,Boolean>("ps5" to ps5,"xbox" to xbox,"nintendo" to nintendo)

    //variable autenticacion de firebase
    val auth = Firebase.auth


init {
    indie = false


}
    /**
     *  Función para extraer un APIVideogame y utilizar las variables para crear un Videogame que guardar en BDD.
     *  Extrae APIVideogame según el titulo que se introduzca en la pantalla de administrador. Se llama desde añadirBDD
     */
    suspend fun getAPIVideogame(title:String):APIVideogame{
        var APIVideogame : APIVideogame = APIVideogame("","",0)
        viewModelScope.launch {
            try {
                APIVideogame = APIModule.getAPIVideogame(title)
            }
            catch (e:Exception) {
                Log.d("Error","Error inesperado ${e.message}")
            }
        }.join()
        return APIVideogame
    }

    /**
     * Función para añadir el videojuego a la base de datos. Se llama desde la screen
     * @param title: titulo introducido
     * @param publisher: publisher introducido
     * @param year: año introducido
     * @param indie: indie introducido
     * @param context: contexto actual de la aplicación
     * @param price: precio introducido
     * @param platforms: map de plataformas que se han introducido
     * @param onSuccess: función lambda para cuando se añade el videojuego correctamente.
     * @param onFailure: función lambda para cuando no se añade el videojuego correctamente.
     */

    fun añadirBDD(title: String, publisher: String, year: Int, indie: Boolean, context: Context, price: String, platforms:MutableMap<String,Boolean>,
                  onSuccess : () -> Unit, onFailure : () -> Unit) {

        if (FirebaseApp.getApps(context).isNotEmpty()) {
            val db = FirebaseFirestore.getInstance()
            viewModelScope.launch {
                try {
                    val APIVideogame = getAPIVideogame(title)
                    val videogameToAdd = Videogame(title,publisher,year,indie,price,platforms, metacritic = APIVideogame.metacritic ,photo = APIVideogame.background_image)
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
            Log.e("MainActivity", "Firebase is not initialized")
        }
    }





    //Funciones para cambiar cosas en la Screen

    fun changeIndie(indieUI : Boolean) {
        this.indie = indieUI
        auth.signOut()

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
    fun changePrice(price : String) {
        this.price = price
    }





    fun changePs5(it: Boolean ) {
        this.ps5 = it
        platforms["ps5"] = it

    }
    fun changeXbox(it : Boolean) {
        this.xbox = it
        platforms["xbox"] = it
    }
    fun changeNintendo(it : Boolean) {
        this.nintendo = it
        platforms["nintendo"] = it
    }





}



