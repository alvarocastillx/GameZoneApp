package com.acasloa946.finalproject.userInterface.SettingsScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class ViewmodelSettings : ViewModel()  {

    var logged by mutableStateOf(false)
        private set

    val auth: FirebaseAuth = Firebase.auth

    fun getLogged(){
        if (auth.currentUser?.email != null) {
            logged = true
        }
    }

    fun signOut() {
        auth.signOut()
        logged = false
    }

}