package com.acasloa946.finalproject.userInterface.SettingsScreen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SettingsViewmodel : ViewModel()  {




    val auth: FirebaseAuth = Firebase.auth

    var checkBoxNotification by mutableStateOf(false)
    var showInfoDialog by mutableStateOf(false)

    var logged by mutableStateOf(false)
        private set

    fun getLogged(){
        if (auth.currentUser?.email != null) {
            logged = true
        }
    }

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