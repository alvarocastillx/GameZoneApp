package com.acasloa946.finalproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.acasloa946.finalproject.navigation.NavigationManager
import com.acasloa946.finalproject.ui.theme.FinalProjectTheme
import com.acasloa946.finalproject.userInterface.AdminScreen.ViewmodelAdmin
import com.acasloa946.finalproject.userInterface.CatalogScreen.CatalogViewmodel
import com.acasloa946.finalproject.userInterface.HomeScreen.HomeViewmodel
import com.acasloa946.finalproject.userInterface.LoginScreen.LoginViewmodel
import com.acasloa946.finalproject.userInterface.RegisterScreen.RegisterViewmodel
import com.acasloa946.finalproject.userInterface.SettingsScreen.SettingsViewmodel
import com.google.firebase.FirebaseApp


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize Firebase only if not already initialized
        if (FirebaseApp.getApps(this).isEmpty()) {
            FirebaseApp.initializeApp(this)
        }
        val viewmodelAdmin: ViewmodelAdmin by viewModels()
        val settingsViewmodel: SettingsViewmodel by viewModels()
        val loginViewmodel: LoginViewmodel by viewModels()
        val homeViewmodel: HomeViewmodel by viewModels()
        val registerViewmodel: RegisterViewmodel by viewModels()
        val catalogViewmodel: CatalogViewmodel by viewModels()







        setContent {
            FinalProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    NavigationManager(settingsViewmodel = settingsViewmodel, viewmodelAdmin = viewmodelAdmin, loginViewmodel,homeViewmodel,registerViewmodel,catalogViewmodel)


                }
            }
        }
    }


}

