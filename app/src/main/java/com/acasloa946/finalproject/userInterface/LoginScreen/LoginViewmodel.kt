package com.acasloa946.finalproject.userInterface.LoginScreen

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.lang.Exception

class LoginViewmodel : ViewModel() {

    var email by mutableStateOf("")
        private set
    var passw by mutableStateOf("")
        private set
    var admin by mutableStateOf(false)
        private set



    private val auth: FirebaseAuth = Firebase.auth

    fun changeEmail(email:String) {
        this.email = email
    }
    fun changePassw(passw:String) {
        this.passw = passw
    }


    fun login(onSuccess: () -> Unit, onFailure : () -> Unit){
        viewModelScope.launch {
            try {
                // DCS - Utiliza el servicio de autenticación de Firebase para validar al usuario
                // por email y contraseña
                auth.signInWithEmailAndPassword(email, passw)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            if (email == "admin@admin.com" && passw=="admin11") {
                                admin = true
                            }
                            onSuccess()
                        } else {
                            onFailure()
                        }
                    }.await()
            } catch (e: Exception){

            }
        }
    }

}