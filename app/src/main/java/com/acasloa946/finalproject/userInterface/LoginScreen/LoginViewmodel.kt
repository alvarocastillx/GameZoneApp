package com.acasloa946.finalproject.userInterface.LoginScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import java.lang.Exception

/**
 * Clase viewmodel de la pantalla Login
 */
class LoginViewmodel : ViewModel() {

    //variables de la screen que se introducen por el usuario
    var email by mutableStateOf("")
        private set
    var passw by mutableStateOf("")
        private set
    //variable para saber si el administrador es el que ha inciado sesión o no
    var admin by mutableStateOf(false)
        private set


    //variable de autenticación de firebase
    private val auth: FirebaseAuth = Firebase.auth

    //funciones para cambiar los TextFields
    fun changeEmail(email:String) {
        this.email = email
    }
    fun changePassw(passw:String) {
        this.passw = passw
    }

    /**
     * Función que se ejecuta cuando se pulsa el botón iniciar sesión.
     * Inicia sesión en firebase
     * @param onSuccess: función lambda para cuando se inicia sesión correctamente.
     * @param onFailure: función lambda para cuando no se inicia sesión correctamente.
     */
    fun login(onSuccess: () -> Unit, onFailure : () -> Unit){
        viewModelScope.launch {
            try {
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
                println("Fallo :(")
            }
        }
    }

}