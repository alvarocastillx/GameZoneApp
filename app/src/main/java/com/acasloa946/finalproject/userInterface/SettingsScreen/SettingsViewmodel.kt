package com.acasloa946.finalproject.userInterface.SettingsScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.acasloa946.finalproject.database.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class SettingsViewmodel : ViewModel()  {

    //variables de firebase
    val firestore = Firebase.firestore
    val auth: FirebaseAuth = Firebase.auth

    //variables mutables de Screen
    var checkBoxNotification by mutableStateOf(false)
    var showInfoDialog by mutableStateOf(false)
    var userMail:String? by mutableStateOf("")
    var userName:String? by mutableStateOf("")



    //variable para conocer si el usuario ha iniciado sesión y mostrar así un componente u otro.
    var logged by mutableStateOf(false)
        private set

    /**
     * Función para saber si hay un usuario con sesión iniciada. Si es así muestra composable y llama a función de rescatar info para poder mostrarla en el dialog de Información de cuenta.
     */
    fun getLogged(){
        if (auth.currentUser?.email != null) {
            logged = true
            getUserInfo()
        }
    }

    /**
     * Función para extraer la información de la cuenta del usuario
     */
    fun getUserInfo() {

        userMail = auth.currentUser!!.email
        firestore.collection("Users")
            .addSnapshotListener { querySnapshot, error ->
                if (error != null) {
                    return@addSnapshotListener
                }
                val users = mutableListOf<User>()
                if (querySnapshot != null) {
                    for (document in querySnapshot) {
                        val user = document.toObject(User::class.java)
                        users.add(user)
                    }
                    for (i in users) {
                        if (i.email == userMail) {
                            userName = i.username
                        }
                    }
                }

            }
    }

    //Funciones para cambiar screen
    fun changeCheckbox(it:Boolean) {
        this.checkBoxNotification = it
    }

    fun signOut() {
        auth.signOut()
        logged = false
    }

    fun openDialog() {
        showInfoDialog = true
    }

    fun closeDialog() {
        showInfoDialog = false
    }


}