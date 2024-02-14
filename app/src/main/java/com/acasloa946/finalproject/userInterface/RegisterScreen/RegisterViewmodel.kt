package com.acasloa946.finalproject.userInterface.RegisterScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acasloa946.finalproject.database.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class RegisterViewmodel : ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    private val firestore = Firebase.firestore


    var username by mutableStateOf("")
        private set
    var email by mutableStateOf("")
        private set
    var passw by mutableStateOf("")
        private set

    fun registerUser(onSuccess : () -> Unit,
                     onFailure:() -> Unit) {
        viewModelScope.launch {
            try {
                auth.createUserWithEmailAndPassword(email,passw).addOnCompleteListener {
                    saveUser(User(username, email))
                    onSuccess()
                }.addOnFailureListener {
                    onFailure()
                }
            }
            catch (e:Exception) {
                println("Error de JetPack")
            }

        }

    }

    fun saveUser(userToAdd:User) {
        viewModelScope.launch {
            firestore.collection("Users").document(email).set(userToAdd).addOnCompleteListener {
                println("Usuario guardado en base de datos correctamente")
            }.addOnFailureListener {
                println("Error guardando usuario en base de datos")
            }
        }

    }
    fun changeEmail(email:String) {
        this.email = email
    }
    fun changePassw(passw:String) {
        this.passw = passw
    }
    fun changeUsername(username:String) {
        this.username = username
    }

}